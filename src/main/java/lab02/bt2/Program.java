/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;

/**
 *
 * @author HUU LUAN
 */
public class Program {
    public static void main(String[] args) {
        Tron c1=new Tron(5.0);
        System.out.println("Hinh tron{bankinh:"+c1.getBanKinh()+", Dien tich:"+c1.tinhDienTich()+", Chu vi:"+c1.tinhChuVi());
        
        Tru c2=new Tru(5.0,4.0);
        System.out.println("Hinh tru{bankinh:"+c2.getBanKinh()+", Chieu cao:"+c2.getChieuCao()+", Dien tich:"+c2.tinhDienTich()+", Chu vi:"+c2.tinhChuVi());
    }
}
