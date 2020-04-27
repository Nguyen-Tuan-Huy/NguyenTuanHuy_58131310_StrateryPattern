
package BaiTap1;

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
        float a = 75, b = 12;
        float c = 54, d = 78;
        context tinh = new context();
        tinh.setTinhToan(new Cong());    
        System.out.println("75 + 12\n" + tinh.display(a, b));
        tinh.setTinhToan(new Tru());
        System.out.println("54 - 78\n" + tinh.display(c, d));
    }
    
}
