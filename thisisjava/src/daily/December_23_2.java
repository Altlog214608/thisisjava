package thisisjava.src.daily;

import java.util.Calendar;

public class December_23_2 {
    public static void main(String[] args) {
        //열거형
        //요일, 계절 외 한정된 값을 갖는 타입

        Week today =null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;

        }

        if(today==Week.SUNDAY) {
            System.out.println("일요일에 축구");
        } else {
            System.out.println("열공");
        }
    }
}
