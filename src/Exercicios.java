import java.util.Scanner;
import java.lang.Math;

public class Exercicios {
    public static void main(String[] args) {
        //Criação do scanner para a execução de todos os exercícios
        Scanner scanner = new Scanner(System.in);

        
        /*Exercício 1 - Calcular a raiz cúbica de um número qualquer */
        
        //Pede e recebe o número que será calculado a raíz
        System.out.print("Digite o número que deseja calculara raíz cúbica: ");
        int numeroRaiz = scanner.nextInt();

        //Calcula a raíz cúbica do número digitado
        double resultadoRaiz = Math.cbrt(numeroRaiz);

        //Exibe o resultado do cálculo
        System.out.println("A raíz cúbica de " + numeroRaiz + " é " + resultadoRaiz + ".");

        System.out.println("################################");

        /*Exercício 2 - Calcular o perímetro de um retângulo qualquer; */

        //Pede e recebe a base do retângulo
        System.out.println("Digite quanto mede a base do retângulo que deseja calcular o perímetro em centímetros: ");
        int baseRetangulo = scanner.nextInt();

        //Pede e recebe a altura do retângulo
        System.out.println("Digite a altura desse retângulo em centímetros: ");
        int alturaRetangulo = scanner.nextInt();

        //Calcula o perímetro do retângulo
        int perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);

        //Exibe resultado do cálculo
        System.out.println("O perímetro de um retângulo qualquer com a base " + baseRetangulo + " e a altura " + alturaRetangulo + " mede " + perimetroRetangulo + " centímetros.");

        System.out.println("################################");

        /*Exercício 3 - Calcular o perímetro de um quadrado qualquer*/

        //Pede e recebe o lado do quadrado
        System.out.print("Digite o lado do quadrado que deseja calcular o perímetro em centímetros: ");
        int quadradoLado = scanner.nextInt();

        //Calcula a área do quadrado
        int perimetroQuadrado = quadradoLado * 4;

        //Exibe o resultado
        System.out.println("O perímetro de um quadrado com os lados medindo " + quadradoLado + " cm é igual a " + perimetroQuadrado + "cm.");

        System.out.println("################################");
        
        /*Exercício 4 - Calcular a área de um quadrado; */

        //Pede e recebe o lado do quadrado
        System.out.print("Digite o lado do quadrado que deseja calcular a área em centímetros: ");
        int qdLado = scanner.nextInt();

        //Calcula a área do quadrado
        double areaQuadrado = Math.pow(quadradoLado, 2);

        //Exibe o resultado
        System.out.println("A área de um quadrado com os lados medindo " + qdLado + " cm é igual a " + areaQuadrado + "cm².");

        System.out.println("################################");

        /*Exercício 5 - Converter celsius para Fahrenheit */
        
        //Pede e recebe a temperatura em Celsius
        System.out.print("Digite a temperatura em celsius: ");
        int celsius = scanner.nextInt();

        //Calcula em Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        //Exibe o resultado
        System.out.println(celsius + " °C equivale a " + fahrenheit + " °F");

        System.out.println("################################");

        /*Exercício 6 - Cálculo do Juros Simples */
    

        //Pede e recebe o valor do capital, da taxa de juros e do tempo
        System.out.print("Digite o valor do capital em reais: ");
        double capital = scanner.nextDouble();

        System.out.println("Digite a taxa de juros em porcentagem: ");
        double jurosTaxa = scanner.nextDouble();

        System.out.println("Digite o tempo em meses: ");
        int meses = scanner.nextInt();

        //Calculando juros
        double juros = jurosCalculo(capital, jurosTaxa, meses);

        //Criando a variável que vai armazenar o valor final
        double valorFinal = capital + juros;
        
        //Exibindo o resultado
        System.out.println("Você pagará em juros: R$" + juros + ", totalizando o valor do pagamento em R$" +  valorFinal);

        scanner.close();


    } 

    //Criação de um método para calcular os juros 
    public static double jurosCalculo(double capital, double jurosTaxa, int meses) {
        double jurosDecimal = jurosTaxa / 100;
        return capital * jurosDecimal * meses;

    }
}