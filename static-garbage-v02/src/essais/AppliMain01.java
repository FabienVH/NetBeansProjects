package essais;

import obj.Cercle;

public class AppliMain01 {

    public static void main(String[] args) {
        float pi = Cercle.PI;
        System.out.println("pi = " + pi);
        float pi10 = Cercle.getMultipleDePi(10);
        System.out.println("pi10 = "+pi10);
        System.out.println("-------------------------\n");
        System.out.println("1) qte = "+Cercle.getQTE());
        
        Cercle c01 = new Cercle();
        System.out.println("2) qte = "+Cercle.getQTE());
        System.out.println("2.1) c01 : "+c01);
        Cercle c02 = new Cercle("A", 2);
        System.out.println("3) qte = "+Cercle.getQTE());
        Cercle c03 = new Cercle("B", 2);
        System.out.println("4) qte = "+Cercle.getQTE());
        System.out.println("5.1) c01 : "+c01);
        System.out.println("5.2) c02 : "+c02);
        System.out.println("5.3) c03 : "+c03);
    }
}
