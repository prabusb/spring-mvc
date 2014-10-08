/**
 * 
 */
package com.learn.mvc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import org.mockito.*;
import static org.springframework.test.web.ModelAndViewAssert.*;

import com.learn.mvc.service.ProvideMessageService;

/**
 * Test class for testing LoginController class.
 * 
 * @author Prabu S B
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/WEB-INF/dispatcherServlet-servlet.xml"})
public class LearnControllerTest {
	
	/** Mock ProvideMessageService class which retrieves message**/
	@Mock
	private ProvideMessageService mockedProvideMessageService;
	
	@Mock
	private BindingResult mockBindingResult;
	
	/** Inject required mock ProvideMessageService for controller**/
	@InjectMocks
	private LearnController learnController;
	 
	@Before
	public void doBeforeEachTestCase() {		 
		learnController = new LearnController();
		MockitoAnnotations.initMocks(this);
	}
	
	
	/**
	 * Test CreateUser method from controller LearnController with valid values.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCreateUser() throws Exception {		
	    MockHttpServletRequest request = new MockHttpServletRequest();
	    request.setMethod("GET");
	    request.setRequestURI("/createUser");	
	    
	    MockHttpServletResponse response = new MockHttpServletResponse();	    
	     
	    // call controller
	    final ModelAndView mav = new AnnotationMethodHandlerAdapter().handle(request, response, learnController);
	    
	    assertViewName(mav, "CreateUser");	    
	}
	
	
	/**
	 * Test mainReport method from controller ReportController with valid values.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddUserValidcase() throws Exception {		
	    MockHttpServletRequest request = new MockHttpServletRequest();
	    request.setMethod("POST");
	    request.setRequestURI("/signup");	
	    
	    MockHttpServletResponse response = new MockHttpServletResponse();
	    
	    Mockito.when(mockedProvideMessageService.provideMessage()).thenReturn("hey hey");
	    
	    // Simulate having errors just for this test:
	    Mockito.when(mockBindingResult.hasErrors()).thenReturn(false);
	    
	   	    // call controller
	    final ModelAndView mav = new AnnotationMethodHandlerAdapter().handle(request, response, learnController);
	    
	    assertViewName(mav, "Done");	    
	    

	    String message = (String)mav.getModel().get("showMessage");
	    assertEquals("hey hey", message);
	}

}
