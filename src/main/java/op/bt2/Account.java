/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op.bt2;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account() {
    }  
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void credit( int amount) {
     if(amount>0)
        balance +=amount;
    }
    public void debit( int amount) {
        if(balance>=amount)
        {
            balance-=amount;
            
            System.out.println("Thanh toan tien thanh cong:");
        }else{
            System.out.print("So du tai khoan khong du. Thanh toan that bai:");
        } 
    }
    public void tranferTo(Account other, int amount) {
         if(balance>=amount)
        {
            balance-=amount;
            other.balance +=amount;
            System.out.println("Thanh toan tien thanh cong:");
        }else{
            System.out.print("So du tai khoan khong du. Thanh toan that bai:");
        } 
    }

    
}
