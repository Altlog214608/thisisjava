package thisisjava.src.daily;

import java.util.Scanner;
public class Example_05 {
    public static void main(String[] args) {
        //7번문제
        int[] array = {1, 5, 3, 8, 2};

        int max_value = 0;

        for (int i : array) {
            if (i > max_value) {
                max_value = i;
            }
        }
        System.out.println(max_value);

        //8번------------------------------------------------------
        int[][] array2 = {{95,86},{83,82,96},{78,83,93,87,88}};

        int sum = 0;
        double average = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum += array2[i][j];
            }
        }
        average = (double)sum / (array2[0].length+array2[1].length+array2[2].length);
        System.out.println("합계:" + sum+ ", 평균:" + average);

        //9번--------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        int student = 0;
        int[] scorelist = new int[3];
        int max = 0;

        while(start) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");

            System.out.print("선택>");
            int choice = Integer.parseInt(sc.nextLine());

            if(choice == 1) {
                System.out.print("학생수 >");
                int selcet = Integer.parseInt(sc.nextLine());
                student = selcet ;
            } else if(choice == 2) {
                System.out.print("scores[0]>");
                scorelist[0] = Integer.parseInt(sc.nextLine());
                System.out.print("scores[1]>");
                scorelist[1] = Integer.parseInt(sc.nextLine());
                System.out.print("scores[2]>");
                scorelist[2] = Integer.parseInt(sc.nextLine());
            } else if(choice == 3) {
                System.out.println("scores[0]>"+scorelist[0]);
                System.out.println("scores[1]>"+scorelist[1]);
                System.out.println("scores[2]>"+scorelist[2]);
            }else if(choice == 4) {
                sum = 0;
                for (int i = 0; i < scorelist.length; i++) {
                    sum += scorelist[i];
                    if(scorelist[i] >= max) {
                        max = scorelist[i];
                    }
                }
                System.out.println("최고 점수 >" + max);

                average = (double)sum / student;

                System.out.println("평균 점수 >"+average);

            } else if(choice == 5) {
                System.out.println("프로그램 종료");
                start = false;
                break;
            }
        }




        //-----------------------------------------------------------


    }
}