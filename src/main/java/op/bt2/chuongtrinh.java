/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op.bt2;

/**
 *
 * @author ADMIN
 */
public class chuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account sc1 = new Account("TK01", "Nguyen Huu Luan", 10000000);
        Account sc2 = new Account("TK01", "Nguyen Van A", 0);
        System.out.println("Thong tin tai khoan ban dau:");
        System.out.println("My Account[id:" + sc1.getId() + "name: "+ sc1.getName() + "balance" + sc1.getBalance() + "]");
        System.out.println("Myfriend Account[id:" + sc2.getId() + "name: "+ sc2.getName() + "balance" + sc2.getBalance() + "]");        
        
        System.out.println("rut 2000000 tien tu tai khoan my Account....");
        sc1.debit(2000000);
        System.out.println(" nap 1000000 vao tai khoan myfriend Account......");
        sc2.credit(1000000);
        System.out.println("chuyen khoan 500 tu myfriend....");
        sc2.tranferTo(sc1,500);
        System.out.print("thong tin tai khoan sau giao dich:");
        System.out.println("My Account[id:" + sc1.getId() + "name: " + sc1.getName() + "balance" + sc1.getBalance() + "]");
        System.out.println("Myfriend Account[id:" + sc2.getId() + "name: " + sc2.getName() + "balance" + sc2.getBalance() + "]");
    }
    
}
