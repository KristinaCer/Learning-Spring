package com.cts.passportService;

import org.springframework.stereotype.Component;

@Component
public interface HeadPassportOffice {
	
	public void doPhotoVerification();
	
	public void issuePassport();

}
