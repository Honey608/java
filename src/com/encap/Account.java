package com.encap;

public class Account {
    private String name;
    private String balance;

    public Account() {
    }

    public Account(String name, String balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else{
            System.out.println("名字范围错误");
        }

    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        if(balance.length() >= 12 && balance.length() <= 14) {
            this.balance = balance;
        }else{
            System.out.println("balance范围错误");
        }
    }

    public void showInfo(){
        System.out.println(this.name + " || " + this.balance);
    }
}

