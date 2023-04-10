import java.util.Scanner;

/**
 * exercicioWhile
 */
public class exercicioWhile {
 Scanner sc = new Scanner(System.in);

 //1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" 
 //elementos do vetor A, ou seja, B[i] = A[i].

 public void exercicio1() {
    
    int vetorA[] = new int []{5,7,9,10,13};
    int vetorB[] = new int [5];
    int i=0;
    while (i<5) {
        vetorB[i]=vetorA[i];
        System.out.println("O vetor B ["+i+"]="+vetorB[i]);
        i++;
    }
 }

 //2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do 
 //vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

    public void exercicio2() {
        int vetorA[] = new int []{1,2,3,4,5,6,7,8};
        int vetorB[] = new int [8];
        int i=0;
        while (i<8) {
            vetorB[i]=vetorA[i]*2;
            System.out.println("O vetor B ["+i+"]="+vetorB[i]);
            i++;
        }
    }
    //3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada 
    //elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I].

    public void exercicio3() {
     int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
     int vetorB[] = new int[15];
     int i=0;
     while (i<15) {
        vetorB[i]=vetorA[i]*vetorA[i];
        System.out.println("O vetor B ["+i+"]="+vetorB[i]);
        i++;
     }
    }
    //4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento 
    //do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).

    public void exercicio4() {
      double vetA[] = new double[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
      double vetB[] = new double [15];
      int i=0;
      while (i<15) {
        vetB[i]=Math.sqrt(vetA[i]);
        System.out.println("O vetor B ["+i+"]="+vetB[i]);
        i++;
      }
}
//5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada 
//elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou 
//seja: B[i] = A[i] * i.

public void exercicio5() {
    int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorB[] = new int[10];
    int i=0;
    while (i<10) {
        vetorB[i]=vetorA[i]*i;
        System.out.println("O vetor B ["+i+"]="+vetorB[i]);
        i++;
    }
  }
//6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é 
//a soma dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].

  public void exercicio6() {
    int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorB[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorC[] = new int [10];
    int i=0;
    while (i<10) {
        vetorC[i]=vetorA[i]+vetorB[i];
        System.out.println("O vetor C ["+i+"]="+vetorC);
        i++;
    }
  }
}