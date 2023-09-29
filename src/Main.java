import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj stopien wielomianu");
        int sizeArray = scanner.nextInt();
        double x;
        double[] degree = new double[sizeArray+1];
        for(int i=0; i<sizeArray+1; i++){
            System.out.println("wpisz element");
            degree[i] = scanner.nextInt();
        }
        System.out.println("wpisz pierwiastek");
        x = scanner.nextDouble();
        boolean y = isRoot(x,degree);
        if(y == true){
            System.out.println("wielomian sie zeruje");
        }
        else System.out.println("wielomian sie nie zeruje");


    }
    public static boolean isRoot(double root,double[] arrayElements){
        double result = 0;
        int sizeArray = arrayElements.length;
        for(int i = 0; i<sizeArray; i++){
            result += arrayElements[i] * pow(root, sizeArray - i - 1);

        }
        if(result == 0) return true;
        else return false;
    }


}