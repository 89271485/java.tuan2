/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt3;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    public String hoten;
    public String nganh;
   
    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    
    //Phuong thuc tinh diem trung binh
    abstract  public double getDiem();
    
    public String getHocLuc() {
        String kq = "";
        double dtb = getDiem() ;
        if (dtb < 5) {
            kq= "yeu";
        } else if (dtb < 6.5) {
            kq = "trung binh";
        }else if (dtb < 7.5) {
            kq = "kha";
        }else if (dtb < 9) {
            kq = "gioi";
        }else {
            kq = "Xuat sac";
        }
        return kq;
    }
    ///phuong thuc xuat thong tin sinh 
    public void xuat() {
        System.err.println("Sinh [hoten:" + hoten + ", nganh:" + nganh + "DTB:" + getDiem() + ",hoc luc:" + getHocLuc());
    }
    
}

