package Excessoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println();
    }
    
}
