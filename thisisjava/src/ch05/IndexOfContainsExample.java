package thisisjava.src.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String all = """
                String subject = "자바 프로그래밍";
                  
                int location = subject.indexOf("프로그래밍");
                System.out.println(location);
                String substring = subject.substring(location);
                System.out.println(substring);
        
                location = subject.indexOf("자바");
                if(location != -1){
                    System.out.println("yes java");
                } else {
                    System.out.println("no java");
                }
                boolean result = subject.contains("자바");
                if(result){
                    System.out.println("yes java");
                } else {
                    System.out.println("no java");
                }
                """;
//        다른 사람 풀이

//        int len=all.length();
//        System.out.println(len);
//        String xx=all.substring(len/2);
//        String target="out";
//        int c = 0;
//        boolean key = true;
//        while(key){
//            int pos = xx.indexOf(target);
//            if(pos == -1){
//                System.out.println("더 없음");
//                break;
//            } else {
//                c++;
//                xx = xx.substring(pos+target.length());
//                System.out.println(c);
//            }
//        }
//


        //몇 개의 단어 찾을지 사용자 입력 받아서 가장 많이 나온 키워드 추출
        //ex) 사용자 입력 1번에 out, system, 자바

        Scanner sc = new Scanner(System.in);

        int middle = all.length() / 2;
        String Half = all.substring(middle);

        int count = 0;
        int index = Half.indexOf("out");

        String word = sc.nextLine();
        String[] wordlist = word.split(",");

//        while (index != -1) {
//            count++;
//            index = Half.indexOf("out", index + 1);
//        }
//        System.out.println(count);

//        //while문으로 써보기
//        while (index != -1) {
//            count++;
//            index = Half.indexOf(wordlist[0], index + 1);
//        }

        int[] countArray = new int[wordlist.length];

        for(int i = 0; i < wordlist.length; i++) {
            count = 0;
            for (index = Half.indexOf(wordlist[i]); index != -1; index = Half.indexOf(wordlist[i], index + 1)) {
                count++;

            }
            System.out.println(wordlist[i] + " : " + count);
            countArray[i] = count;
        }

//        for (index = Half.indexOf("out"); index != -1; index = Half.indexOf("out", index + 1)) {
//            count++;
//        }
//        System.out.println(count);
    }
}
