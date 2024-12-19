public class BreakOutter {
    public static void main(String[] args) {
        Outter: for(char upper = 'A'; upper<='Z'; upper++){
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower == 'g'){
                    break Outter;
                }
            }
            System.out.println("프로그램 실행 종료");
            int aa;
        for(aa=9; aa<20;)
        {
            if(aa%2!=0) {
                aa++;
                continue;
            }
            System.out.println(aa);
            aa++;
        }
        for(int xx=9;;xx++){
            if(xx%2!=0){
                continue;
            }
            System.out.println(xx);
            if(xx>=20){
                break ;
            }
        }
    }

    }
}