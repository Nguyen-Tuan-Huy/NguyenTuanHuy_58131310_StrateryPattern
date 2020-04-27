/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author zasx1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hh1 = new HangHoa("Banh", "Banh x", 500000);
        HangHoa hh2 = new HangHoa("Banh", "Banh bao", 800000);
        HangHoa hh3 = new HangHoa("Keo", "Keo deo", 1200000);
        HangHoa hh4 = new HangHoa("Keo", "Banh keo", 300000);
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        gh1.them(hh1);
        gh1.them(hh2);
        gh2.them(hh3);
        gh2.them(hh4);
        gh1.hinhThucTT(new ThanhToanOnline());
        gh2.hinhThucTT(new ThanhToanCOD());
        System.out.println("\nThanh toan Online: ");
        gh1.inDS();
        System.out.println("\nThanh toan COD: ");
        gh2.inDS();
    }
    
}
