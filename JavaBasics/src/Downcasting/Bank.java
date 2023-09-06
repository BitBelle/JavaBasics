/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Downcasting;

/**
 *
 * @author capricorn
 */
public class Bank {
    private String custName;
    private String AccNo;
    private double deposit;
    private double balance;
    private double withdraw;
    private double total;
    
    public String getCustname(){
        return "Name: " + custName;
    }
    
    public void setCustname(String custName){
        this.custName = custName;
    }
    
    public int getAccno(){
        return "Your Account Number: " + AccNo;
    }
    
    public double getBalance(){
        balance = 0;
        return ( total+ deposit - withdraw );
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getDeposit(){
        return ( total - balance);
    }
    
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    
    public double getTotal(){
        return (deposit + balance);
    }
    
    public void setTotal(double total){
        this.total= total;
    }
    
    
}
