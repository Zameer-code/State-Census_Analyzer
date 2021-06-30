package com.statecensusanalyzer;

/**
 ****************************************************************************************************************** 
 * Purpose: This Class is Implemented To Analyse the Census Of India 
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 30-06-2021
 ******************************************************************************************************************
 **/

public class CensusAnalyserException extends Exception {
	
	//Using enum to Throw an Exception..
	
	enum CensusExceptionType{
	        NO_SUCH_FILE, INCORRECT_DATA_ISSUE, SOME_OTHER_IO_EXCEPTION, DELIMITER_ISSUE,  NO_SUCH_CLASS
	    }
	    CensusExceptionType type;
	    private String message;

	    public CensusAnalyserException() {
	    }

	    public CensusAnalyserException(CensusExceptionType type, String message) {
	        super(message);
	        this.type = type;
	    }

}
