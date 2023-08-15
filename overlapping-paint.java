int[] a = new int[d];

// Find area of overlappping paint with k layers

for(int i = 0; i < n; i++) {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int start = Integer.parseInt(st.nextToken());
    int end = Integer.parseInt(st.nextToken());

    a[start]++;
    a[end]--;
}

int layers = 0;
int ans = 0;

for(int i = 0; i < d; i++) {
    layers += a[i];
    if(layers == k) ans++;
}

return ans;