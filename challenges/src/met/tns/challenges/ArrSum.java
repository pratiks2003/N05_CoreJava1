package met.tns.challenges;


import java.util.Scanner;

public class ArrSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int[] output = arrSum(arr);
            for (int i = 0; i < N; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[] arrSum(int[] arr) {
        int N = arr.length;
        int totalSum = 0;
        int[] result = new int[N];
        
        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < N; i++) {
            result[i] = totalSum - arr[i];
        }

        return result;
    }
}
