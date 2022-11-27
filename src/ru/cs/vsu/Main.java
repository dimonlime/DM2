package ru.cs.vsu;
import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
	    File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        String[] str = sc.nextLine().split(" ");
        int[] A = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(Arrays.toString(sort(A)));
        pw.print(count);
        pw.close();
    }
    static int[] sort(int[] mas) {
        for(int i = 1; i < mas.length; i++) {
            int j = i - 1;
            int key = mas[i];
            while (mas[j] > key && j >= 0) {
                mas[j + 1] = mas[j];
                j -= 1;
                count++;
            }
            mas[j + 1] = key;
        }
        return mas;
    }
}
