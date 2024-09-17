package se.erik.klocka;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //Nuvarande tid
        LocalDateTime now = LocalDateTime.now();

        int h = now.getHour();
        int m = now.getMinute();
        int s = now.getSecond();

        //nuvarande tid:


        //Mitt alarm
        int alarmH = 10;
        int alarmM = 30;
        int alarmS = 0;



        // 13:30:1 alarm klockan stannar   || = eller  && = och
        while(h != alarmH || m != alarmM || s != alarmS)  {

            try{

            s++;
            if(s == 60){
                m++;
                s = 0;
            }
            if(m == 60){
                h++;
                m = 0;

            }
            if(h == 24){
                h = 0;
            }
            Thread.sleep(1000);
            System.out.println(h + ":" + m + ":" + s);



        }
            catch(Exception e){


            }
        }




    }
}
