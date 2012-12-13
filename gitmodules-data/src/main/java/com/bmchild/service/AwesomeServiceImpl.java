package com.bmchild.service;

import org.springframework.stereotype.Service;

@Service
public class AwesomeServiceImpl implements AwesomeService {

	/* (non-Javadoc)
	 * @see com.bmchild.service.AwesomeService#getAnAwesomeString(java.lang.String)
	 */
	public String getAnAwesomeString(String anotherString) {
		return "AWESOME inside a sub module" + anotherString;
	}

}
