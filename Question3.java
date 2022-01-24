public class Question3 {

    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long  totalSeconds = totalMilliseconds/1000;

        long  currentSecond = totalSeconds %60;
        //to show GMT+8 Singapore time
        long  totalMinutes = (totalSeconds/60)+(8*60);

        long  currentMinute = totalMinutes %60;
        long  totalHours = totalMinutes /60;

        long  currentHour = totalHours %24;

        System.out.print("Current SG Time is " + currentHour +  ":" + currentMinute + ":" + currentSecond + " GMT");


    }
}
