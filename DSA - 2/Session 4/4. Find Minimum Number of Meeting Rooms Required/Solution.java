import java.util.*;

public class MeetingRooms {

    public int findNumRooms(int[][] intervals) {
      //Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));   
        // T : O(nlogn)
        // S : O(n)
        // int[] starts = new int[intervals.length];
        // int[] ends = new int[intervals.length];
        // for (int i = 0; i < intervals.length; i++) {
        //     starts[i] = intervals[i][0];
        //     ends[i] = intervals[i][1];
        // }
        // Arrays.sort(starts);
        // Arrays.sort(ends);
        // int rooms = 0, endsItr = 0;
        // for (int i = 0; i < starts.length; i++) {
        //     if (starts[i] < ends[endsItr]) {
        //         rooms++;
        //     } else {
        //         endsItr++;
        //     }
        // }
        // return rooms;
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        int ans = 0, cnt = 0;
        for (int i=0; i<intervals.length; i++) {
            int start = intervals[i][0], end = intervals[i][1];
            tmap.put(start, tmap.getOrDefault(start, 0) + 1);
            tmap.put(end, tmap.getOrDefault(end, 0) - 1);
        }
        for (int k : tmap.keySet()) {
            cnt += tmap.get(k);
            ans = Math.max(ans, cnt);
        }
        return ans;
/*        0 1
st  frq  c  ans  
0   1   
20 -1   
5   1    
10 -1       
10  1   
15 -1    

tm frq c  ans  
0   1  1   1
5   1  2   2
10  0  2   2
15 -1  1   2
20 -1  0   2
      
        
  //=================================================================================================================================================              
        int meeting = 0;
        int start [] = new int [intervals.length];
        int end [] = new int [intervals.length];
        int startPointer = 0;
        int endPointer = 0;
        int usedRooms = 1;
        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[0][0];
            end[i] = intervals[0][1];
        }
        // Sort the intervals by end time
    Arrays.sort(end, new Comparator<Integer>() {public int compare(Integer a, Integer b) {
            return a - b;
          }
        });

    // Sort the intervals by start time
    Arrays.sort(start, new Comparator<Integer>() { public int compare(Integer a, Integer b) {
            return a - b;
          }
        });

    // Iterate over intervals.
    while (startPointer < intervals.length) {

      // If there is a meeting that has ended by the time the meeting at `start_pointer` starts
      if (start[startPointer] >= end[endPointer]) {
        usedRooms -= 1;
        endPointer += 1;
      }

      // We do this irrespective of whether a room frees up or not.
      // If a room got free, then this used_rooms += 1 wouldn't have any effect. used_rooms would
      // remain the same in that case. If no room was free, then this would increase used_rooms
      usedRooms += 1;
      startPointer += 1;

    }

    return usedRooms;
    */
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int result = new MeetingRooms().findNumRooms(nums);

        System.out.printf("%d", result);
    }

}


/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one

3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/
