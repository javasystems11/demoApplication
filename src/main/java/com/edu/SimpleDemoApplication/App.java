package com.edu.SimpleDemoApplication;

import com.edu.dao.PersonDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonDao p = new PersonDao();
        System.out.println( "Hello World! " + p.getName() );
    }
}
