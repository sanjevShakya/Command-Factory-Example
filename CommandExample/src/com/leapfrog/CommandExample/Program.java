/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CommandExample;

import com.leapfrog.CommandExample.Commands.Command;
import com.leapfrog.CommandExample.Commands.CommandFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author sanjeev
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
       CommandFactory factory = new CommandFactory();
       BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("X=?");
       Double x= Double.parseDouble(reader.readLine());
       System.out.println("Y=?");
       Double y=Double.parseDouble(reader.readLine());
       System.out.println("1. press add for addition");
       System.out.println("2. press sub for subtraction");
       System.out.println("1. press mul for multiplication");
       System.out.println("1. press div for division");
       System.out.println("1. press exp for exponent");
       String cmd= reader.readLine();
       Command c= factory.getCommand(cmd);
       System.out.println(c.execute(x,y));
       
    }
    
}
