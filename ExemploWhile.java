import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {

        int i = 0; // contador indice
        while (i < 10) {
            System.out.println("o N° da Interação é " + i);
            i = i + 1; // (i++ é o mesmo do que foi escrito ao lado) É importante observar o local onde
                       // vai ser usado o i=i+1;
                       // pois ele altera todo o resultado.
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("informe o valor do Indice " + i + "do vetor");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println("O vetor[" + i + "]=" + vetor[i]);
            i++;
        }
    }

    public void exercico3() {
        // Criando um jogo aonde eu não tenho uma condição com fim!
        Random rd = new Random();
        int valorSorteado = rd.nextInt(10);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um número");
            int nDigitado = sc.nextInt();
            if (nDigitado == valorSorteado) {
                System.out.println("Acertouu!!");
                tenteNovamente = false;
            } else {
                System.out.println("Errouuu!!!");
            }
        }
    }

}
