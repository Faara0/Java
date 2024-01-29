package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        String TarhaNimi;
        System.out.println("Anna eläintarhalle nimi:");
        TarhaNimi = sc.nextLine();
        boolean exit = false;
        while(!exit) {
            
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
            
                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        System.out.println("Anna eläimen nimi:");
                        System.out.println("Anna eläimen ikä:");
                        break;
                    case 2:
                        System.out.println(TarhaNimi +" pitää sisällään nämä eläimet.");
                       break;
                    case 3:
                        System.out.println("Valinta 3 toimii.");
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }
    
        }
    sc.close();
    }
}