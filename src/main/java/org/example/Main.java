package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = getGreatestCommonDivisor(15,20);
        System.out.println(ans);
    }

    public static int getGreatestCommonDivisor(int a,int b){
        // Check if the input is greater than 10
        if(a < 10 || b < 10)
            return -1;

        // Find the largest divisor
        int largestDivisor = 0;     // for keep updating the largest divisor
        int divisorA = 1;
        int divisorB = 1;

        while(divisorA != a && divisorB != b){
            if(a % divisorA == 0 && b % divisorB == 0){
                if(divisorA > largestDivisor)
                    largestDivisor = divisorA;
            }
            divisorA++;
            divisorB++;
        }
        return largestDivisor;
    }
}