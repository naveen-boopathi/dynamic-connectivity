package com.naveenboopathi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        implementQuickFind();
        implementQuickUnion();
    }

    public static void implementQuickUnion() {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        QuickUnionUF quickUnionUF = new QuickUnionUF(n);

        while(stdIn.hasNext()) {
            int p = stdIn.nextInt();
            int q = stdIn.nextInt();
            if(!quickUnionUF.connected(p, q)) {
                quickUnionUF.union(p, q);
                System.out.println("Quick Union: " + p + " " + q);
            } else {
                System.out.println("Already Connected");
            }
        }
        stdIn.close();
    }

    public static void implementQuickFind() {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        QuickFindUF quickFindUF = new QuickFindUF(n);

        while(stdIn.hasNext()) {
            int p = stdIn.nextInt();
            int q = stdIn.nextInt();
            if(!quickFindUF.connected(p, q)) {
                quickFindUF.union(p, q);
                System.out.println("Quick Find: " + p + " " + q);
            } else {
                System.out.println("Already Connected");
            }
        }
        stdIn.close();
    }
}
