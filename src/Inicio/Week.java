package Inicio;

public class Week {
    private String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public String dayWithMostNumber(){
        String longDay = "";
        for(String day : weekDays){
            if(day.length() > longDay.length()){
                longDay = day;
            }
        }
        return longDay;
    }

    public void daysBackwards(){
        for(int day = weekDays.length-1; day >= 0; day--){
            System.out.println(weekDays[day]);
        }
    }
}
