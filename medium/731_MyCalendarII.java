class MyCalendarTwo {
   
    List<Integer> events;
    List<Integer> overlappings; 

    public MyCalendarTwo() {
        events = new ArrayList<>();
        overlappings = new ArrayList<>();
    }
    
    public boolean book(int st, int en) {
            int tmpStart = 0;
            int tmpEnd = 0;
            //i check for overlappings first so the program can short-circuit and save time in case it finds one
            //also i iterate by jumping couples, as i've stored evens as starts and odds as endings
            //note: i must iterate till size-1 because it increments 2 at a time
            //i would risk going out-of-bounds otherwise
            for(int i = 0; i <overlappings.size()-1; i+=2){
                tmpStart = overlappings.get(i);
                tmpEnd = overlappings.get(i+1);

                //if the first ev doesn't finish before the next one starts
                //or if the second event begins before the first one has begun
                if(en > tmpStart && tmpEnd >st){
                    return false;
                }
            }
            //i look if the event overlaps another event in the main event  
            for(int i = 0; i <events.size()-1; i+=2){
                 tmpStart = events.get(i);
                 tmpEnd = events.get(i+1);

                //same as before: if the first event's end is later than the start of the second
                //or if the second event's end is later than the start of the first one
                if(en > tmpStart && tmpEnd > st){
                    overlappings.add(Math.max(tmpStart,st));
                    overlappings.add(Math.min(tmpEnd,en));
                }
            }
            events.add(st);
            events.add(en);
            return true;
    }
}
