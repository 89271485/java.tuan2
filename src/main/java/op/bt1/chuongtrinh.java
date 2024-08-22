/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op.bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class chuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1,r2;
        System.out.println("Tao doi tuong r1....");
        r1 = new Rectangle();
        
        System.out.println("Tao doi tuong r2.....");
        System.out.println("cho biet do dai:");
        double dai = sc.nextDouble();
        System.out.print("cho biet do rong:");
        double rong = sc.nextDouble();
        r2 = new Rectangle(dai,rong);
        System.out.println("thong tin ket qua:");
        System.out.println("HCN thu 1: dai:" + r1.getLength() + "-rong:" + r1.getWidth() + "-dien tich:" + r1.findArea() + "chu vi:" + r1.findArea());
        System.out.println("HCN thu 2: dai:" + r2.getLength() + "-rong:" + r2.getWidth() + "-dien tich:" + r2.findArea() + "chu vi:" + r2.findArea());
    }
    
}
