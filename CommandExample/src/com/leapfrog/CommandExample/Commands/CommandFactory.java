/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CommandExample.Commands;

import com.leapfrog.CommandExample.entity.AddCommand;
import com.leapfrog.CommandExample.entity.DivCommand;
import com.leapfrog.CommandExample.entity.ExpCommand;
import com.leapfrog.CommandExample.entity.MulCommand;
import com.leapfrog.CommandExample.entity.SubCommand;
import java.util.HashMap;

/**
 *
 * @author sanjeev
 */
public class CommandFactory {
    private HashMap<String, Command> commandFac=initialize();
    
    private HashMap<String, Command> initialize(){
        HashMap<String,Command> c = new HashMap<>();
        c.put("add", new AddCommand());
        c.put("sub", new SubCommand());
        c.put("mul", new MulCommand());
        c.put("exp", new ExpCommand());
        c.put("div", new DivCommand());
        
        return c;
    }
    public Command getCommand(String key){
        if(isCommand(key)){
            return (Command)commandFac.get(key);
        }
        return null;
    }
    
    public Boolean isCommand(String key){
        return commandFac.containsKey(key);
        
    }
}
