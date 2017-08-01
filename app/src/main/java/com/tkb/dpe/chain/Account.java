package com.tkb.dpe.chain;

/**
 * Created by tarun on 8/2/17.
 */

public abstract class Account {

    double balance;
    Account successor;

    public void pay(double amount){
        if (canPay(amount)){
            System.out.println("You can pay with: "+this.getClass().getName());
        }else {
            System.out.println("You can't pay with: "+this.getClass().getName());
            successor.pay(amount);
        }
    }

    public void setNext( Account account){
        this.successor = account;
    }

    public boolean canPay (double amount){
        return balance>=amount;
    }
}
