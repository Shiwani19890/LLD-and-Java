package com.company.CollectionFramework;

import java.util.ArrayList;

// [2 4] [5 10] [11 13] [17 25] // non overlapping
// insert [4 12]
// res =[2 13] [17 25]
//public class Interval {
//    int start;
//    int end;
//     Interval() { start = 0; end = 0; }
//     Interval(int s, int e) { start = s; end = e; }
//
//    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
//           if(intervals == null || intervals.size()==0)
//               return intervals;
//
//           for(int i=0;i<intervals.size();i++)
//           {
//               if(intervals.get(i).end < newInterval.start)
//               {
//                   continue;
//               }
//               else if(intervals.get(i).start>newInterval.end)
//                       intervals.add(i,newInterval);
//               else
//               {
//
//               }
//
//
//           }
//    }
//
//
//}
