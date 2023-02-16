import java.util.*;

public class TowerOfHanoi {
    // Implement your solution here
    ArrayList<String> ans = new ArrayList<>();
    public void toh(int n, char t1, char t2, char t3)
  {
    if (n == 0)
      return;
    toh(n - 1, t1, t3, t2);
    ans.add(n + " " + t1 + " " + t2);
    toh(n - 1, t3, t2, t1);
  }

    public ArrayList<String> towerOfHanoi(int n) {
        toh(n, 'A', 'C', 'B');
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> result = new TowerOfHanoi().towerOfHanoi(n);
        for(int i = 0 ; i < result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
}
