package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Torii
 *
 *
 */

@SpringBootApplication
public class ApplicationRunner 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(ApplicationRunner.class, args);
    }
}
