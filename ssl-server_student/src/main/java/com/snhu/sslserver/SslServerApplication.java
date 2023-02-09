package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslServerApplication {

	private static final String data = "Hello World Check Sum!";
	
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
	//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
	@GetMapping("/checksum")
	public String getChecksum() throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(data.getBytes());
		byte[] byteData = md.digest();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

}
