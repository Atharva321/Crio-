class Main {
  public static void main(String[] args) {
    int[] input = new int[]{-1, 5 , 0};
    Player player = new Player(input);
    GameRule[] rules = new GameRule[]{new AdditionRule(), new MaxRule(), new MultiplicationRule()};
    GameRule gameRule = player.findBest(rules);
    System.out.println(gameRule);
  }
}
