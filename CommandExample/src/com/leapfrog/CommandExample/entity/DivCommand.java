/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.CommandExample.entity;

import com.leapfrog.CommandExample.Commands.Command;

/**
 *
 * @author sanjeev
 */
public class DivCommand extends Command{

    @Override
    public double execute(double x, double y) {
        return x/y;
    }
    
    
}
