package com.BridgeLabz.JunitTest;

public class MoodAnalyserException extends Exception {
	public enum ExceptionType{
        ENTERED_NULL
    }

    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
	
}
