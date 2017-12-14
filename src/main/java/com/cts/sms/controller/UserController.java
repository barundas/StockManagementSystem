package com.cts.sms.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sms.model.UserInfo;
import com.cts.sms.repository.UserRepository;

@RestController
@RequestMapping("/api/1.00.00/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	public List<UserInfo> list() {
		return userRepository.findAll();
	}

	@RequestMapping(value="users", method=RequestMethod.POST)
	public UserInfo create(@RequestBody UserInfo userInfo) {
		return userRepository.saveAndFlush(userInfo);
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.GET)
	public UserInfo get(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.PUT)
	public UserInfo update(@PathVariable Long id, @RequestBody UserInfo userInfo) {
		UserInfo existingUserInfo = userRepository.findOne(id);
		BeanUtils.copyProperties(userInfo, existingUserInfo);
		return userRepository.saveAndFlush(existingUserInfo);
	}
	
	@RequestMapping(value="users/{id}", method=RequestMethod.DELETE)
	public UserInfo delete(@PathVariable Long id) {
		UserInfo existingUserInfo = userRepository.findOne(id);
		userRepository.delete(existingUserInfo);
		return existingUserInfo;
	}
}
