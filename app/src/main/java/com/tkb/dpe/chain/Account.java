package com.tkb.dpe.chain;

/**
 * Created by tarun on 8/2/17.
 */

public abstract class Account {

    long balance;
    Account successor;

    public void pay(double amount, Display message){
        if (canPay(amount)){
            if (message!=null){
                message.show("You can pay with: "+this.getClass().getSimpleName());
            }

        }else if (hasNext()){
            message.show("You can't pay with: "+this.getClass().getSimpleName());
            successor.pay(amount,message);
        }else {

            if (message!=null){
                message.show("You don't have much money any of your account: "+this.getClass().getSimpleName());
            }
        }
    }

    public void setNext( Account account){
        this.successor = account;
    }

    public boolean hasNext(){
       return successor!=null;
    }


    public boolean canPay (double amount){
        return this.balance>=amount;
    }
}
