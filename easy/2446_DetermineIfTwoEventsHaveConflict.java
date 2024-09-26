class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        int startHour1;
        int startMinute1;
        int startHour2;
        int startMinute2;
        int endHour1;
        int endMinute1;
        int endHour2;
        int endMinute2;

        for(int i = 1; i<event1.length; i++){
            startHour1 = Integer.parseInt(event1[i-1].substring(0,2));
            startMinute1 = Integer.parseInt(event1[i-1].substring(3,5));
            endHour1 = Integer.parseInt(event1[i].substring(0,2));
            endMinute1 = Integer.parseInt(event1[i].substring(3,5));
            
            startHour2 = Integer.parseInt(event2[i-1].substring(0,2));
            startMinute2 = Integer.parseInt(event2[i-1].substring(3,5));
            endHour2 = Integer.parseInt(event2[i].substring(0,2));
            endMinute2 = Integer.parseInt(event2[i].substring(3,5));


        //System.out.println("Event 1: " + startHour1 + ":" + startMinute1 + " -- " + endHour1 + ":" + endMinute1);
        //System.out.println("Event 2: " + startHour2 + ":" + startMinute2 + " -- " + endHour2 + ":" + endMinute2);

            if(endHour1>startHour2){
                if(endHour2<startHour1){
                    return false;
                }else if(endHour2 == startHour1){
                    if(endMinute2>=startMinute1){
                        return true;
                    }else{
                        return false;
                    }
                }
                return true;
            }else if(endHour1==startHour2){
                if(endHour2<startHour1){
                    return false;
                }else if(endHour2 == startHour1){
                    if(startMinute2>endMinute1){
                        return false;
                    }else if(endMinute2<startMinute1){
                        return false;
                    }
                }
                if(endMinute1>=startMinute2){
                    return true;
                }
            }
        }
        return false;
    }
}
