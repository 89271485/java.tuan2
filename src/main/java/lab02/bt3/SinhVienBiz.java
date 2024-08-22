/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt3;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVien{
    public double diemMarketting;
    public double diemSales;
   
    public SinhVienBiz(String hoten, double diemMarketing, double diemSales) {
        super (hoten, "Biz");
        this.diemMarketting = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (diemMarketting *2 + diemSales)/3;
    }
    
    
}
