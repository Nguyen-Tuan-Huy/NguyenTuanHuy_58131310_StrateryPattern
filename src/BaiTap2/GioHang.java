/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;
public class GioHang {
    iThanhToan thanhToan;
    
    private ArrayList<HangHoa> dsHH= new ArrayList<>();
    
    
    public void hinhThucTT(iThanhToan thanhToan){
        this.thanhToan = thanhToan;
    }
    
    public int them(HangHoa hh){
        dsHH.add(hh);
        return 0;
    }
    public int tongtien(){
        int tong = 0;
        for(int i = 0; i < dsHH.size(); i++)
            tong += dsHH.get(i).getGia();
        return tong;
    } 
    public void inDS(){
        System.out.println("\n");
        for(int i = 0; i < dsHH.size(); i++)
            System.out.println(dsHH.get(i).hienthi());
        System.out.println("\nTong so tien phai thanh toan: " + thanhToan.thanhToan(tongtien()));
    }
}
