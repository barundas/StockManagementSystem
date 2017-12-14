package com.cts.sms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import com.cts.sms.controller.UserController;
import com.cts.sms.model.UserInfo;
import com.cts.sms.repository.UserRepository;

public class UserControllerTest {

	@InjectMocks
	private UserController userController;
	
	@Mock
	private UserRepository userRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testUserGet() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserKey(1L);
		when(userRepository.findOne(1L)).thenReturn(userInfo);
		
		UserInfo userInfoFromController = userController.get(1L);
		
		verify(userRepository).findOne(1L);
		
		assertThat(userInfoFromController.getUserKey(), is(1L));
		
	}
	
}
