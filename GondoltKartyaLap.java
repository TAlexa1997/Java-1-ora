
import java.util.Scanner;


public class GondoltKartyaLap {
    static String[] kartya = new String[22];
    static Scanner sc = new Scanner (System.in);
    static String[] szinek= {"Szív", "Tök","Zöld","Makk"};
    static String[] ertekek= {"Ász", "Király","Fel","X","IX","VIII"};
    
    public static void main(String[] args) {
        feltolt();
            for (int i = 0; i < 3; i++) {
                Kirak();
                Melyik();
                Kever();
        }
            EzVolt();
          
    }
    
    private static void feltolt() {
        int db = 1;
        for (int sz = 0; sz < szinek.length; sz++) {
                for (int k = 0;  db < 22 && k < ertekek.length; k++) {
                    kartya[db++] = szinek[sz] + "_"+ ertekek[k];
                }
                
            }
    }
    public static void Kirak(){
                
        for (int i = 1; i < kartya.length; i++) {
            System.out.printf("%-17s" ,kartya[i]);
            if (i % 3 == 0){
                System.out.println(" ");
            }
        }
    }
    public static void Melyik(){
        boolean jo;
        do{
            System.out.print("Melyik oszlop(1-3)? " );
            int lap = Integer.parseInt(sc.nextLine());
            jo = lap >= 1 && lap <= 3;
            }while(!jo);
    }
        
            
      
    
    public static void Kever(){
        // a választott oszlop közepére kerüljön
    }
    
    public static void EzVolt(){
        System.out.println("A gondolt lap: = " + kartya[11]);
         System.out.println("");
    }       
}
