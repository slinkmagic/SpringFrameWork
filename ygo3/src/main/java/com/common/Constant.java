package com.common;

public class Constant {
	public static enum CommonKey {
		
	}

	public static enum RequestKey {
		LOGIN("LOGIN"),
		;
	    private final String key;
	    
	    private RequestKey(final String key) {
	        this.key = key;
	    }
	    
	    public String getKey() {
	        return key;
	    }
	}
}
