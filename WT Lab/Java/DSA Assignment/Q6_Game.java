import java.util.*;

public class Q6_Game {
    private static Map<String, Integer> scores;
    private static List<String> players;
    private static int M;

    public static void main(String[] args) {

        int N =4;
        M = 5;
        
        scores = new HashMap<>();
        players = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            players.add("Player-" + i);
            scores.put("Player-" + i, 0);
        }

        Collections.shuffle(players);

        System.out.println("Game started!");
        System.out.println("Number of players: " + N);
        System.out.println("Points to accumulate: " + M);
        System.out.println("Player order: " + players);

        playGame();

        System.out.println("Game complete!");
    }

    private static void playGame() {
        int currentPlayer = 0;
        int consecutiveOnes = 0;

        while (!isGameComplete()) {
            String playerName = players.get(currentPlayer);
            int diceRoll = rollDice();
            int currentScore = scores.get(playerName);
            currentScore += diceRoll;
            scores.put(playerName, currentScore);

            System.out.println(playerName + " rolled a " + diceRoll + " and now has " + currentScore + " points.");
            printRankTable();

            if (diceRoll == 6) {
                System.out.println(playerName + " gets another chance!");
            } else if (diceRoll == 1) {
                consecutiveOnes++;
                if (consecutiveOnes == 2) {
                    System.out.println(playerName + " rolled two consecutive 1s and skipped a turn.");
                    consecutiveOnes = 0;
                    currentPlayer = (currentPlayer + 1) % players.size();
                }
            } else {
                consecutiveOnes = 0;
                currentPlayer = (currentPlayer + 1) % players.size();
            }
        }
    }

    private static boolean isGameComplete() {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() >= M) {
                System.out.println(entry.getKey() + " completes the game and is assigned rank " + calculateRank(entry.getValue()));
                return true;
            }
        }
        return false;
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static void printRankTable() {
        System.out.println("Rank Table:");
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(scores.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println("Rank " + rank + ": " + entry.getKey() + " - " + entry.getValue() + " points");
            rank++;
        }
    }

    private static int calculateRank(int score) {
        int rank = 1;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            int opponentScore = entry.getValue();
            if (score < opponentScore) {
                rank++;
            }
        }
        return rank;
    }
}