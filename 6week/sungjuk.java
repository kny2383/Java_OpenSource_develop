import java.util.Scanner;
import java.util.InputMismatchException;

public class sungjuk {
    public static void main(String[] args){
        
        System.out.println("====================");
        System.out.println("     성적입력처리      ");
        System.out.println("====================");

        Scanner sc = new Scanner(System.in);
        int hakbun[] = new int[5];
        String name[] = new String[5];
        int score[][] = new int[5][4];
        char hakjum[] = new char[5];
        int avg[] = new int[5];
        int allScore[] = new int[5];

        for (int i = 0; i<5; i++){
            int sum = 0;
            System.out.printf("%d번째 학생의 성적을 입력하시오\n", i+1);
            System.out.print("학번: ");
            try{
                hakbun[i] = sc.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                sc.next();
                i--;
                continue;
            }
            System.out.print("이름: ");
            name[i] = sc.next();
            System.out.print("국어: ");
            score[i][0] = sc.nextInt();
            sum += score[i][0];
            System.out.print("영어: ");
            score[i][1] = sc.nextInt();
            sum += score[i][1];
            System.out.print("수학: ");
            score[i][2] = sc.nextInt();
            sum += score[i][2];
            System.out.print("C언어: ");
            score[i][3] = sc.nextInt();
            sum += score[i][3];
            
            allScore[i] = sum;
            avg[i] = sum/4;
        }

        for (int i = 0; i<5;i++){
            if (avg[i] >= 90){
                hakjum[i] = 'A';
            }
            if ((avg[i] >= 80) && (avg[i] < 90)){
                hakjum[i] = 'B';
            }
            if ((avg[i] >= 70) && (avg[i] < 80)){
                hakjum[i] = 'C';
            }
            if ((avg[i] >= 60) && (avg[i] < 70)){
                hakjum[i] = 'D';
            }
            if ((avg[i] >= 50) && (avg[i] < 60)){
                hakjum[i] = 'E';
            }
        }
     
        System.out.println("          성적 관리 프로그램         ");
        System.out.println("------------------------------------");
        System.out.println("학번  이름  국어  영어  수학  C언어  총점  학점");
        System.out.println("------------------------------------");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d  %s  %d  %d  %d  %d  %d  %d  %c \n", hakbun[i], name[i], score[i][0], score[i][1], score[i][2], score[i][3], allScore[i], avg[i], hakjum[i] );
        }
    }
}
