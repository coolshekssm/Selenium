package org;


public class Addition {

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        Addition tt=new Addition();
        int res = tt.sum(28,49);
        System.out.println(res);
    }
}
