for(int i = 0; i < n; i++) {
    st = new StringTokenizer(br.readLine());
    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());
    a[x1][y1]++;
    a[x1][y2]--;
    a[x2][y1]--;
    a[x2][y2]++;
}
for(int i = 0; i <= 1000; i++) {
    for(int j = 0; j <= 1000; j++) {
        if(i > 0) a[i][j] += a[i - 1][j];
        if(j > 0) a[i][j] += a[i][j - 1];
        if(i > 0 && j > 0) a[i][j] -= a[i - 1][j - 1];
        if(a[i][j] == k) ret++;
    }
}