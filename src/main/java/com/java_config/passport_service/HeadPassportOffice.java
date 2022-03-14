package com.java_config.passport_service;

import org.springframework.stereotype.Component;

@Component
public interface HeadPassportOffice {
	
	public void doPhotoVerification();
	
	public void issuePassport();

}
