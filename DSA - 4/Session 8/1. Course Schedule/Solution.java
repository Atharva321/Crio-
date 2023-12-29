import java.util.*;
class CourseSchedule {
  public static boolean courseSchedule(int numCourses, int[][] prerequisites) {
     List<Integer>[] adjList = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList<>();
        }
        int[] indegrees = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int[] prereq = prerequisites[i];
            int child = prereq[0]-1;
            int parent = prereq[1]-1;
            indegrees[child]++;
            adjList[parent].add(child);
        }
        Queue<Integer> sources = new LinkedList<>();
        for (int course = 0; course < numCourses; course++) {
            if (indegrees[course] == 0) sources.offer(course);
        }
        while (!sources.isEmpty()) {
            int source = sources.poll();
            numCourses--;
            List<Integer> nextCourses = adjList[source];
            for (int nextCourse: nextCourses) {
                indegrees[nextCourse]--;
                if (indegrees[nextCourse] == 0) sources.offer(nextCourse);
            }
        }
        return numCourses == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int [][] edgeList = new int[m][2];
    for(int i=0;i<m;i++)
    {
      edgeList[i][0] = sc.nextInt();
      edgeList[i][1] = sc.nextInt();
    }
    boolean ans=courseSchedule(n,edgeList);
    if(ans)
      System.out.println("true");
    else
      System.out.println("false");
  }
}
