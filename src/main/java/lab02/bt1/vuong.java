/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt1;

/**
 *
 * @author HUU LUAN
 */
public class vuong extends ChuNhat{
    public vuong(double canh){
        super(canh,canh);
    }
    
    @Override
    public void xuat(){
        System.out.println("HV{canh:"+super.dai +", chuvi:"+super.getDienTich()+ ", chuvi:"+super.getChuVi());
    }
}
