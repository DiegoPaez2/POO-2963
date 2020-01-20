/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.view.controller.CommissionStrategy;
import ec.edu.espe.view.controller.Context;
import ec.edu.espe.view.controller.FullCommission;
import ec.edu.espe.view.controller.NormalCommission;
import ec.edu.espe.view.controller.RegularCommision;

/**
 *
 * @author Angel castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CommissionStrategy commissionStrategy = getStrategy(1000d);
        Context context = new Context(commissionStrategy);
        System.out.println("Commission for 1000d = " + context.executeStrategy(1000d));

        commissionStrategy = getStrategy(500d);
        context = new Context(commissionStrategy);
        System.out.println("Commission for 2000d = " + context.executeStrategy(2000d));

        commissionStrategy = getStrategy(100d);
        context = new Context(commissionStrategy);
        System.out.println("Commission for 100d = " + context.executeStrategy(100d));
    }

    private static CommissionStrategy getStrategy(double amount) {
        CommissionStrategy strategy;
        if (amount >= 1000d) {
            strategy = new FullCommission();
        } else if (amount >= 500d && amount <= 999d) {
            strategy = new NormalCommission();
        } else {
            strategy = new RegularCommision();
        }
        return strategy;
    }

}
