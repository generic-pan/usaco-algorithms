int[] num = {1, 3, 5};
int n = 4;

int size = num.length;
int[] dp = new int[n + 1];

for(int i = 0; i <= n; i++) {
    if(i == 0) dp[i] = 1;
    for(int j = 0; j < size; j++) {
        if(num[j] <= i) dp[i] += dp[i - num[j]];
    }
}

System.out.println(dp[n]);