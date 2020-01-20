/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view.controller;

/**
 *
 * @author Angel castillo
 */
public class Context {

    private CommissionStrategy commissionStrategy;

    public Context(CommissionStrategy commissionStrategy){
        this.commissionStrategy = commissionStrategy;
    }

    public double executeStrategy(double amount){
        return commissionStrategy.applyCommission(amount);
    }
}
