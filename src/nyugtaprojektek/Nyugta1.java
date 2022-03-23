package nyugtaprojektek;

public class Nyugta1 {
    
    public static void main(String[] args) {
        fej();
        tetel();
        System.out.println("==================");
        System.out.println("Összesen:  1090 Ft");
        System.out.println("------------------");
        System.out.println("Kedvezmény: 109 Ft");
        System.out.println("(10%)");
        System.out.println("==================");
        System.out.println("Fizetendő:  981 Ft");
        System.out.println("------------------");
        System.out.println("");
        System.out.print("_______");
        System.out.print("   ");
        System.out.println("_______");
        System.out.print(" Dátum");
        System.out.print("   ");
        System.out.println("   Név");
        System.out.println("******************");
        System.out.println("        CÉG");
        System.out.println("******************");
    }
    
    public static void fej(){
        jel("*",19);
        System.out.printf("%13s\n","Nyugta 1");
        jel("*",19);
    }
    
    public static void tetel(){
        int[] tetelek = {350,90,650};
        
        for (int i = 0; i < tetelek.length; i++) {
            System.out.printf("Tétel %d: %8dFt ",i,tetelek[i]);
            System.out.println("");
        }
    }
    
    public static void jel(String jel, int szam){
        for (int i = 0; i < szam; i++) {
            System.out.print(jel);
        }
        System.out.println("");
    }
    
}
