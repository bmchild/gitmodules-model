package com.bmchild.service;

import org.springframework.stereotype.Service;

@Service
public class AwesomeServiceImpl implements AwesomeService {

	public String getAnAwesomeString(String anotherString) {
		return "AWESOME " + anotherString;
	}

}
