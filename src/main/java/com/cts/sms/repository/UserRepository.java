package com.cts.sms.repository;

import org.springframework.data.jpa.repository.*;

import com.cts.sms.model.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {

	UserInfo findByUserName(String userName);
	
}