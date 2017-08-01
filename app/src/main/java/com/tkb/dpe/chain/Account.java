package com.tkb.dpe.chain;

/**
 * Created by tarun on 8/2/17.
 */

public abstract class Account {

    long balance;
    Account successor;

    public void pay(double amount){
        if (canPay(amount)){
            System.out.println("You can pay with: "+this.getClass().getSimpleName());
        }else if (successor!=null){
            System.out.println("You can't pay with: "+this.getClass().getSimpleName());
            successor.pay(amount);
        }else {
            System.out.println("You don't have much money in your account: ");

        }
    }

    public void setNext( Account account){
        this.successor = account;
    }


    public boolean canPay (double amount){
        return this.balance>=amount;
    }
}
