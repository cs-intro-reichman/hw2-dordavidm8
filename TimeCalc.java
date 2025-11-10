public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int timeAdd = Integer.parseInt(args[1]);

         int totalMinutes = hours * 60 + minutes + timeAdd;

         totalMinutes = totalMinutes % 1440; 
        int FinelHour = totalMinutes / 60;
        int FinelMin = totalMinutes % 60;

         
         	System.out.printf("%02d:%02d\n", FinelHour, FinelMin );	
        }

    }
