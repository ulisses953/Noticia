package com.example.demo.error;


/**
 * @version 1.0
 */
public class IdNotFoundInDatabase extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public IdNotFoundInDatabase(){
        super();
    }
    
    public IdNotFoundInDatabase(String message){
        super(message);
    }
}
