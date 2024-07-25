package CandidaturaCASE3;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo3 {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirSelecionados();

        }

    static void imprimirSelecionados(){
        String[] candidados = {"FELIPE", "MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS E INFORMANDO O INDICE DO ELEMENTO");
        for(int i = 0; i < candidados.length; i++){
            System.out.println("O candidato de n "+(i+1)+" é "+ candidados[i]);
        }
        System.out.println("FORMA ABREVIADA FOR EACH");
        
        for(String candidato: candidados){
            System.out.println("O candidato selecionado foi: "+candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato+" solicitou este valor de salario R$"+salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("o candidato: "+candidato+" foi selecionado!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
            
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }
    }
    
}
