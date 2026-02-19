package com.assessment.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	

	    private static Properties prop;

	    // Load config only once (Singleton-style)
	    static {
	        try {
	            FileInputStream fis =
	                    new FileInputStream("src/test/resources/config.properties");
	            prop = new Properties();
	            prop.load(fis);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load config.properties file");
	        }
	    }

	    public static String getProperty(String key) {
	        return prop.getProperty(key);
	    }
	}
