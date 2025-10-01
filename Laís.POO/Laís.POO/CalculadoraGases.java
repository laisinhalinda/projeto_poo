import java.util.Scanner;

public class CalculadoraGases{

    double p1;
    double p2;
    double v1;
    double v2;
    double t1;
    double t2;
    double total;
    int numero;

    Scanner teclado = new Scanner(System.in);

    //tipos
    public void calcular(){
        System.out.println("1- Isotérmica (Temperatura constante) \n2- Isobárica (Pressão constante) \n3- Isovolumétrica (Volume constante) \n4- Equação Geral \n5- Encerrar o programa");
        numero = Integer.parseInt(teclado.nextLine());

        switch(numero){
        case 1:
        System.out.println("Informe os seguintes valores: \nSe estiver faltando um valor coloque '0'");
        System.out.println("Pressão 1: ");
        p1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 1: ");
        v1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Pressão 2: ");
        p2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 2: ");
        v2 = Double.parseDouble(teclado.nextLine());
        isotermica();
        break;

        case 2:
        System.out.println("Informe os seguintes valores: \nSe estiver faltando um valor coloque '0'");
        System.out.println("Temperatura 1: ");
        t1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 1: ");
        v1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Temperatura 2: ");
        t2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 2: ");
        v2 = Double.parseDouble(teclado.nextLine());
        isobarica();
        break;

        case 3:
        System.out.println("Informe os seguintes valores: \nSe estiver faltando um valor coloque '0'");
        System.out.println("Pressão 1: ");
        p1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Temperatura 1: ");
        t1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Pressão 2: ");
        p2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Temperatura 2: ");
        t2 = Double.parseDouble(teclado.nextLine());
        isovolumetrica();
        break;

        case 4:
        System.out.println("Informe os seguintes valores: \nSe estiver faltando um valor coloque '0'");
        System.out.println("Pressão 1: ");
        p1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Temperatura 1: ");
        t1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 1: ");
        v1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Pressão 2: ");
        p2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Volume 2: ");
        v2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Temperatura 2: ");
        t2 = Double.parseDouble(teclado.nextLine());
        leiGeral();
        break;

        case 5:
        System.out.println("Fim!");
        break;
        default:
      

        }
    }

    //calcular isotérmica
    public void isotermica(){
        if(p1 == 0){
            p1 = (p2)/ (p2 * v2);
            System.out.println("A pressão p1 é: " + p1);
        }
        if(v1 == 0){
            v1 = (p1)/ (p2 * v2);
            System.out.println("O volume v1 é: " + v1);
        }
        if(p2 == 0){
            p2 = (p1 * v1)/ (v2);
            System.out.println("A pressão p2 é: " + p2);
        }
        if(v2 == 0){
            v2 = (p1 * v1)/ (p2);
            System.out.println("A volume p2 é: " + v2);
        }
    }

    // calcular isobárica
    public void isobarica(){
        if(t1 == 0){
            t1 = (v1)/ (v2/t2);
            System.out.println("A temperatura t1 é: " + t1);
        }
        if(v1 == 0){
            v1 = (t1)/ (v2/t2);
            System.out.println("O volume v1 é: " + v1);
        }
        if(t2 == 0){
            t2 = (v1/t1)/ (v2);
            System.out.println("A temperatura t2 é: " + t2);
        }
        if(v2 == 0){
            v2 = (v1/t1)/ (t2);
            System.out.println("A volume v2 é: " + v2);
        }
    }   

    // calcular isovolumetrica
    public void isovolumetrica(){
        if(t1 == 0){
            t1 = (p1)/ (p2/t2);
            System.out.println("A temperatura t1 é: " + t1);
        }
        if(p1 == 0){
            p1 = (t1)/ (p2/t2);
            System.out.println("A pressão p1 é: " + p1);
        }
        if(t2 == 0){
            t2 = (p1/t1)/ (p2);
            System.out.println("A temperatura t2 é: " + t2);
        }
        if(p2 == 0){
            p2 = (p1/t1)/ (t2);
            System.out.println("A pressão p2 é: " + p2);
        }
    }   


    // calcular lei geral
    public void leiGeral(){
        if(t1 == 0){
            t1 = (p1*v1)/((p2*v2)/t2);
            System.out.println("A temperatura t1 é: " + t1);
        }
        if(p1 == 0){
            p1 = ((v1)/t1)/((p2*v2)/t2);
            System.out.println("A pressão p1 é: " + p1);
        }
        if(v1 == 0){
            v1 = ((p1)/t1)/((p2*v2)/t2);
            System.out.println("O volume v1 é: " + v1);
        }
        if(t2 == 0){
            t2 = ((p1*v1)/t1)/(p2*v2);
            System.out.println("A temperatura t2 é: " + t2);
        }
        if(p2 == 0){
            p2 = ((p1*v1)/t1)/((v2)/t2);
            System.out.println("A pressão p2 é: " + p2);
        }
        if(v2 == 0){
            v2 = ((p1*v1)/t1)/((p2)/t2);
            System.out.println("A volume p2 é: " + v2);
        }
    }   
}