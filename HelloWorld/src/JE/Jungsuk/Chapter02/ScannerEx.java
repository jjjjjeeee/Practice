package JE.Jungsuk.Chapter02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("두자리 정수를 하나 입력해주셈");
        String input = sc.nextLine();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용: "+input);
        System.out.printf("num=%d%n", num);
    }
}
