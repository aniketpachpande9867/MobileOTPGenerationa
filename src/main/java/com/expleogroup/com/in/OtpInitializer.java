package com.expleogroup.com.in;

import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

@Configuration
public class OtpInitializer {
	
	private final Otpproperties otpproperties;

	public OtpInitializer(Otpproperties otpproperties) {
		
		this.otpproperties=otpproperties;
		Twilio.init(otpproperties.getAccountSid(), otpproperties.getAuthToken());
		System.out.println("Server initialized with account-"+otpproperties.getAccountSid());
	}
	
	
}
