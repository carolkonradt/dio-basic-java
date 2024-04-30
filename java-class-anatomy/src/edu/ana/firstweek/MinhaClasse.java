package edu.ana.firstweek;
public class MinhaClasse {

    public static void main (String [] args){
        System.out.print("Teste!!");

        String nome = "Ana Carolina";
        String sobrenome = "Konradt";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
      
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "O nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
