package com.java.designpatterns.behavioralpattern.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain chain1;

    public ATMDispenseChain(){
        this.chain1 = new Dispense2000Rupees();
        DispenseChain chain2 = new Dispense500Rupees();
        DispenseChain chain3 = new Dispense200Rupees();
        DispenseChain chain4 = new Dispense100Rupees();
        DispenseChain chain5 = new Dispense50Rupees();
        DispenseChain chain6 = new Dispense20Rupees();
        DispenseChain chain7 = new Dispense10Rupees();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        chain5.setNextChain(chain6);
        chain6.setNextChain(chain7);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int choice = 1;
        while(choice == 1) {
            int amount = 0;
            System.out.println("Enter amount to withraw: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10.");
                continue;
            }
            atmDispenser.chain1.dispense(new Rupees(amount));

            System.out.println("Do you want to continue withdrawing amount from ATM? Press 1 to continue else press 0: ");
            choice = input.nextInt();
        }
    }
}
