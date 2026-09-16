import java.util.Scanner;

class Input03 {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner myScan = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Hello! Please put in three numbers :)");
        int firstInt = myScan.nextInt();
        int secondInt = myScan.nextInt();
        int thirdInt = myScan.nextInt();
        int sum = firstInt + secondInt + thirdInt;
        System.out.println(sum);
        
        

        //Remember to close the Scanner
        myScan.close();
    }
}
