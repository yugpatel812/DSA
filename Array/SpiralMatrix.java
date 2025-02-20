package Array;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("r= \n c= ");
        int r = sc.nextInt(), c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        print(matrix);
        spiral(matrix, r, c);


        print(matrix);
    }

    static void print( int [][] arr){
        for(int x[] : arr){
            for (int y :x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    static void spiral(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;

            }
            topRow++;
                for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                    System.out.print(matrix[i][rightCol] + " ");
                    totalElements++;
                   } rightCol--;
                    for (int k = rightCol; k >= leftCol && totalElements < r * c; k--) {
                        System.out.print(matrix[bottomRow][k] + " ");
                        totalElements++;
                       } bottomRow--;
                        for (int l = bottomRow; l >= topRow && totalElements < r * c; l--) {
                            System.out.print(matrix[l][leftCol] + " ");
                            totalElements++;
                        }
                        leftCol++;
                    }
                }


}

