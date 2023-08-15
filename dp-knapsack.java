int[] weight = {1, 3};
int[] value = {5, 33};
int weightLimit = 14;

int size = weight.length;
int[][] dp = new int[weightLimit + 1][size + 1];

for(int w = 0; w <= size; w++) {
    for(int i = 0; i <= weightLimit; i++) {
        if(w == 0 || i == 0) {
            dp[i][w] = 0;
        } else if(weight[w - 1] <= i) {
            dp[i][w] = Math.max(dp[i][w - 1], dp[i - weight[w - 1]][w] + value[w - 1]);
        } else {
            dp[i][w] = dp[i][w - 1];
        }
    }
}

System.out.println(dp[weightLimit][size]);