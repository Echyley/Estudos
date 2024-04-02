package br.com.erudio.unittests.mockito.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.exceptions.RequiredObjectIsNullException;
import br.com.erudio.model.Person;
import br.com.erudio.repositories.PersonRepository;
import br.com.erudio.services.PersonServices;
import br.com.erudio.unittests.mapper.mocks.MockPerson;

// Define que as instâncias de teste são compartilhadas entre os métodos de teste
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class PersonServicesTest {

    // Cria uma instância do objeto simulado MockPerson
    MockPerson input;
    
    // Injeta mocks no serviço de Person
    @InjectMocks
    private PersonServices service;
    
    // Cria um mock para o repositório de Person
    @Mock
    PersonRepository repository;
    
    // Método executado antes de cada teste
    @BeforeEach
    void setUpMocks() throws Exception {
        input = new MockPerson();
        MockitoAnnotations.openMocks(this);
    }

    // Teste para o método "findById"
    @Test
    void testFindById() {
        // Cria uma entidade Person simulada
        Person entity = input.mockEntity(1); 
        entity.setId(1L);
        
        // Configura o comportamento do mock do repository para retornar a entidade quando chamado 
        //com findById(1L)
        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        
        // Chama o método do serviço a ser testado
        var result = service.findById(1L);
        
        // Realiza as verificações dos resultados do serviço
        assertNotNull(result);
        assertNotNull(result.getKey());
        assertNotNull(result.getLinks());
        assertTrue(result.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));
        assertEquals("Addres Test1", result.getAddress());
        assertEquals("First Name Test1", result.getFirstName());
        assertEquals("Last Name Test1", result.getLastName());
        assertEquals("Female", result.getGender());
    }
    
    // Outros métodos de teste seguem a mesma lógica, testando diferentes cenários do serviço.
	
	@Test
	void testCreate() {
		Person entity = input.mockEntity(1); 
		entity.setId(1L);
		
		Person persisted = entity;
		persisted.setId(1L);
		
		PersonVO vo = input.mockVO(1);
		vo.setKey(1L);
		
		when(repository.save(entity)).thenReturn(persisted);
		
		var result = service.create(vo);
		
		assertNotNull(result);
		assertNotNull(result.getKey());
		assertNotNull(result.getLinks());
		
		assertTrue(result.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));
		assertEquals("Addres Test1", result.getAddress());
		assertEquals("First Name Test1", result.getFirstName());
		assertEquals("Last Name Test1", result.getLastName());
		assertEquals("Female", result.getGender());
	}
	
	@Test
	void testCreate() {
    	// Cria uma entidade Person simulada com ID 1
    	Person entity = input.mockEntity(1); 
    	entity.setId(1L);

    	// Cria um objeto 'persisted' que é uma cópia da entidade com o mesmo ID
    	Person persisted = entity;
    	persisted.setId(1L);

    	// Cria um objeto PersonVO simulado com chave (key) 1
   	PersonVO vo = input.mockVO(1);
 	vo.setKey(1L);

    	// Configura o mock do repositório para retornar 'persisted' quando o método 'save' 
    	//for chamado com 'entity'
    	when(repository.save(entity)).thenReturn(persisted);

    	// Chama o método 'create' no serviço e armazena o resultado em 'result'
    	var result = service.create(vo);

    	// Realiza várias asserções para verificar se o resultado é o esperado
    	assertNotNull(result); // Verifica se 'result' não é nulo
    	assertNotNull(result.getKey()); // Verifica se a chave em 'result' não é nula
    	assertNotNull(result.getLinks()); // Verifica se os links em 'result' não são nulos

    	// Verifica se a representação de 'result' contém a string especificada
    	assertTrue(result.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));

    	// Verifica se os atributos de 'result' têm valores esperados
    	assertEquals("Addres Test1", result.getAddress());
    	assertEquals("First Name Test1", result.getFirstName());
    	assertEquals("Last Name Test1", result.getLastName());
    	assertEquals("Female", result.getGender());
}

	@Test
	void testCreateWithNullPerson() {
    	// Chama o método 'create' no serviço com um argumento nulo e captura uma exceção do tipo
    	// 'RequiredObjectIsNullException'
    	Exception exception = assertThrows(RequiredObjectIsNullException.class, () -> {
        service.create(null);
    });
    
    	// Define a mensagem de erro esperada
    	String expectedMessage = "It is not allowed to persist a null object!";
    
    	// Obtém a mensagem da exceção lançada
    	String actualMessage = exception.getMessage();
    
    	// Verifica se a mensagem da exceção contém a mensagem esperada
    	assertTrue(actualMessage.contains(expectedMessage));
}

	
	@Test
	void testDelete() {
		Person entity = input.mockEntity(1); 
		entity.setId(1L);
		
		when(repository.findById(1L)).thenReturn(Optional.of(entity));
		
		service.delete(1L);
	}
	
	@Test
	void testFindAll() {
		List<Person> list = input.mockEntityList(); 
		
		when(repository.findAll()).thenReturn(list);
		
		var people = service.findAll();
		
		assertNotNull(people);
		assertEquals(14, people.size());
		
		var personOne = people.get(1);
		
		assertNotNull(personOne);
		assertNotNull(personOne.getKey());
		assertNotNull(personOne.getLinks());
		
		assertTrue(personOne.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));
		assertEquals("Addres Test1", personOne.getAddress());
		assertEquals("First Name Test1", personOne.getFirstName());
		assertEquals("Last Name Test1", personOne.getLastName());
		assertEquals("Female", personOne.getGender());
		
		var personFour = people.get(4);
		
		assertNotNull(personFour);
		assertNotNull(personFour.getKey());
		assertNotNull(personFour.getLinks());
		
		assertTrue(personFour.toString().contains("links: [</api/person/v1/4>;rel=\"self\"]"));
		assertEquals("Addres Test4", personFour.getAddress());
		assertEquals("First Name Test4", personFour.getFirstName());
		assertEquals("Last Name Test4", personFour.getLastName());
		assertEquals("Male", personFour.getGender());
		
		var personSeven = people.get(7);
		
		assertNotNull(personSeven);
		assertNotNull(personSeven.getKey());
		assertNotNull(personSeven.getLinks());
		
		assertTrue(personSeven.toString().contains("links: [</api/person/v1/7>;rel=\"self\"]"));
		assertEquals("Addres Test7", personSeven.getAddress());
		assertEquals("First Name Test7", personSeven.getFirstName());
		assertEquals("Last Name Test7", personSeven.getLastName());
		assertEquals("Female", personSeven.getGender());

	}

}
