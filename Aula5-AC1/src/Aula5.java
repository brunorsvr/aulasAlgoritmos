import java.util.Scanner;

public class Aula5 {

    public static void main(String[] args) {
        //inicialização de variáveis
        double mediaFinal, ac1, ac2, ag, af = 0.0;


        //Criação do scanner para a execução de todos os exercícios
        Scanner scanner = new Scanner(System.in);

        //Recebe as notas da AC1, AC2, AG E AF
        System.out.print("Digite a nota da AC1: ");
        ac1 = scanner.nextDouble();

        System.out.print("Digite a nota da AC2: ");
        ac2 = scanner.nextDouble();

        System.out.print("Digite a nota da AG: ");
        ag = scanner.nextDouble();

        System.out.print("Digite a nota da AF: ");
        af = scanner.nextDouble();
        
        //Execução do método para calcular a média final do aluno
        mediaFinal = calculoMedia(ac1, ac2, ag, af);

        //Exibe a média final do aluno
        System.out.println("A média final desse aluno é "+ mediaFinal); 

        //Fecha o scanner
        scanner.close();

    }
    

    //Criação do método para calcular a média
    public static double calculoMedia(double ac1, double ac2, double ag, double af) {
        return  (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        
    }
}
