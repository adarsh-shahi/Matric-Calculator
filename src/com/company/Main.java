package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag = true;

        while (flag) {

            System.out.println("Enter no. of rows of 1 matrix");
            int rows1 = scanner.nextInt();

            System.out.println("Enter no. of columns of 1 matrix");
            int columns1 = scanner.nextInt();

            int[][] mat1 = takingValues(rows1, columns1);

            System.out.println("Enter no. of rows of 2 matrix");
            int rows2 = scanner.nextInt();

            System.out.println("Enter no. of columns of 2 matrix");
            int columns2 = scanner.nextInt();

            int[][] mat2 = takingValues(rows2, columns2);

            System.out.println("Which operation you want to perform(Press 5 to exit)" +
                    "1. Addition" +
                    "2. Subtraction" +
                    "3. Multiplication" +
                    "4. Division");

            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    addOrSub(mat1,mat2,true);break;
                case 2:
                    addOrSub(mat1,mat2,false);break;
                case 3:

                case 4:

                case 5:
                    flag=false;
                default:
                    System.out.println("Please enter correct value");


            }
        }







    }

    private static int[][] takingValues(int mat1Rows,int mat1Columns) {
        System.out.println();
        System.out.println("*******************");
        System.out.println();

        int[][] mat = new int[mat1Rows][mat1Columns];
        for (int j = 0; j < mat1Rows; j++) {
            System.out.println("Enter " + (j + 1) + " row");
            for (int k = 0; k < mat1Columns; k++) {

                mat[j][k] = scanner.nextInt();
            }
        }
        for (int j = 0; j < mat1Rows; j++) {
            for (int k = 0; k < mat1Columns; k++) {
                System.out.print(mat[j][k] + " ");
            }
            System.out.println();
        }

        return mat;
    }


    private static void addOrSub(int[][] mat1,int[][] mat2,boolean operation){

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                if(operation){
                    mat1[i][j] += mat2[i][j];
                }
                else {
                    mat1[i][j] -= mat2[i][j];
                }
            }
        }

        System.out.println("Addition of Matrix A and B is: ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
    }
}


            





















