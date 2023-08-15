int[] a;
int sum = 0;

// Sweeps in k range

for(int i = 0; i < k; i++) sum += a[i];

for(int i = 1; i < n - k; i++) {
    int j = i + k - 1;
    sum = sum - a[i - 1] + a[j];
}