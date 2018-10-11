package com.company;
        public class Main {
            public static void main(String[] args) {
                int array[] = {5, 1, 7, 4, 9, 10};

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println("\nBubble sort");
                int n = array.length;
                int temp = 0;

                for (int i = 0; i < n; i++) {
                    for (int y = 1; y < (n - 1); y++) {
                        if (array[y - 1] > array[y]) {
                            temp = array[y - 1];
                            array[y - 1] = array[y];
                            array[y] = temp;
                        }
                    }
                }

                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }
            }
        }
