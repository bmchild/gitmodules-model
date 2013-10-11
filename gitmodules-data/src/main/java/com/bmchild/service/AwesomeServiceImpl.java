package com.bmchild.service;

import org.springframework.stereotype.Service;

@Service
public class AwesomeServiceImpl implements AwesomeService {

	/* (non-Javadoc)
	 * @see com.bmchild.service.AwesomeService#getAnAwesomeString(java.lang.String)
	 */
	public String getAnAwesomeString(String anotherString) {
		printALine();
		return "AWESOME inside a sub module" + anotherString;
	}
	
	// Little Comment
	private void printALine() {
		System.out.println("A conflict will occur!");
	}

}
