/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        /*
        Collections.sort(...) sorts your list.
        intervals is the list of meetings.
        Comparator.comparingInt(...) creates a rule for comparing meetings using an integer.
        i -> i.start tells that rule which integer to use: each meeting's start time.
        */
        //i is just a variable in the labda function
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));

        for(int i=1;i<intervals.size();i++){
            //Variables need to be of Interval type
            Interval i1=intervals.get(i-1);
            Interval i2=intervals.get(i);
            if(i1.end>i2.start) return false;
        }
        return true;

        

    }
}
