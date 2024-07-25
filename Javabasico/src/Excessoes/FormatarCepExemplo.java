package Excessoes;

public class FormatarCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23456789");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcessao e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    static String formatarCep(String cep) throws CepInvalidoExcessao{
        if(cep.length() != 8)
             throw new CepInvalidoExcessao();
        return "12.345.678";
    }
}
