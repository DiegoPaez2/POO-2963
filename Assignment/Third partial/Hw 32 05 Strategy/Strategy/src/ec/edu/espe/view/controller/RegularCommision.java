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
public class RegularCommision implements CommissionStrategy {
    @Override
    public double applyCommission(double amount) {
        return amount * 0.10;
    }
}
