/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt3;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien{
     public double diemjava;
    public double diemCss;
    public double diemhtml;
    
    public SinhVienIT(String hoten, double diemjava, double diemCss, double diemhtml) {
        super (hoten, "IT");
        this.diemjava = diemjava;
        this.diemCss = diemCss;
        this.diemhtml = diemhtml;
    }
    @Override
    public double getDiem(){
        return (diemjava *2 + diemhtml + diemCss) / 4;
    }
}
