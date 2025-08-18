public class DiscreteDistribution {

    public static void main(String[] args) {
        // collect the input arguments
        int m = Integer.parseInt(args[0]);
        int[] weights = parseWeights(args);
        int totalWeight = calculateTotalWeight(weights);

        if (m <= 0 || weights.length == 0 || totalWeight <= 0) {
            System.out.println("Error: Invalid input. Ensure m > 0 and weights are positive.");
            return;
        }

        // probability proportional to its weight
        // print results
        for (int i = 0; i < m; i++) {
            int indexChosen = selectIndex(weights, totalWeight);
            System.out.print(indexChosen + " ");
        }
        System.out.println();

    }

    // method to parse weights from input arguments
    private static int[] parseWeights(String[] args) {
        int[] weights = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            weights[i - 1] = temp;
        }
        return weights;
    }

    // method to calculate the total weight
    private static int calculateTotalWeight(int[] weights) {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }
        return totalWeight;
    }

    /// Select an index (1-based) using weighted probability
    public static int selectIndex(int[] weights, int totalWeight) {

        int r = (int) (Math.random() * totalWeight);
        int cumulativeWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            cumulativeWeight += weights[i];
            if (r < cumulativeWeight) {
                return i + 1; // return 1-based index
            }
        }
        return -1; // should not reach here if weights are valid
    }

}