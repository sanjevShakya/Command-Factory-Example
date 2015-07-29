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
public class ExpCommand extends Command{

    @Override
    public double execute(double x, double y) {
       double prod=1;
        for(int i=1;i<=y;i++)
        {
            prod*=x;
        }
        return prod;
    }
    
    
}
