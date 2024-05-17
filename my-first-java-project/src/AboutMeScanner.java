import java.util.Scanner;

public class AboutMeScanner{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String nome = scanner.nextLine();
            String sobrenome = scanner.nextLine();
            int idade = Integer.valueOf(scanner.nextLine());
            double altura = Double.valueOf(scanner.nextLine());

            System.out.println("Meu nome é "+ nome + " "+sobrenome);
            System.out.println("Tenho " +idade+ " anos.");
            System.err.println("Minha altura é "+altura+ " m.");
        } catch (Exception e) {
            System.out.println("Entrada inválida! Tente novamente.");
        }
        
    }
}