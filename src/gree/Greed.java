package gree;
public class Greed {
    public static int greedy(int[] dice) {
        int[] counts = new int[7]; // We use 7 instead of 6 for simplicity

        // Count occurrences of each number
        for (int die : dice) {
            counts[die]++;
        }

        int score = 0;

        // Calculate score based on occurrences
        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                switch (i) {
                    case 1:
                        score += 1000; // Score for three 1's
                        break;
                    case 2:
                        score += 200; // Score for three 2's
                        break;
                    case 3:
                        score += 300; // Score for three 3's
                        break;
                    case 4:
                        score += 400; // Score for three 4's
                        break;
                    case 5:
                        score += 500; // Score for three 5's
                        break;
                    case 6:
                        score += 600; // Score for three 6's
                        break;
                }
                counts[i] -= 3; // Remove counted dice
            }

            // Calculate score for remaining 1's and 5's
            if (i == 1) {
                score += counts[i] * 100; // Score for single 1's
            } else if (i == 5) {
                score += counts[i] * 50; // Score for single 5's
            }
        }

        return score;
    }
    
    // Method main untuk pengujian di NetBeans
    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5}; // Ganti dengan dadu yang ingin diuji
        System.out.println("Score: " + greedy(dice));
    }
}
