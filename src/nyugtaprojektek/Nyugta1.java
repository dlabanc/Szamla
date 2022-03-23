package nyugtaprojektek;

public class Nyugta1 {
    
    public static void main(String[] args) {
        fej();
        osszegzes();
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
        jel("*",18);
        System.out.printf("%13s\n","Nyugta 1");
        jel("*",18);
    }
    
    public static int tetel(){
        int[] tetelek = {350,90,650};
        int osszesen = 0;
        
        for (int i = 0; i < tetelek.length; i++) {
            System.out.printf("Tétel %d: %6d %2s",i+1,tetelek[i],"Ft");
            System.out.println("");
            osszesen+= tetelek[i];
        }
        jel("=",18);
        return(osszesen);
    }
    
    public static void osszegzes(){
        int ossz = tetel();
        System.out.printf("%s","Összesen");
    }
    
    public static void jel(String jel, int szam){
        for (int i = 0; i < szam; i++) {
            System.out.print(jel);
        }
        System.out.println("");
    }
    
}
