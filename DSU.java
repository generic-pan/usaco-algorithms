static class DSU {

    public int[] root;
    public int[] rank;

    public DSU(int n) {
        root = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int findRoot(int i) {
        while(root[i] != i) {
            root[i] = root[root[i]];
            i = root[i];
        }
        return i;
    }

    public void union(int i, int j) {
        int iRoot = findRoot(i);
        int jRoot = findRoot(j);
        if(rank[iRoot] > rank[jRoot]) {
            root[jRoot] = root[iRoot];
        }
        else if(rank[iRoot] < rank[jRoot]) {
            root[iRoot] = root[jRoot];
        }
        else {
            root[jRoot] = root[iRoot];
            rank[iRoot]++;
        }
    }

}

static class Node {
    int x, y;
    int ind;
    public Node(int x, int y, int ind) {
        this.x = x;
        this.y = y;
        this.ind = ind;
    }
}

static class Edge implements Comparable<Edge> {
    Node i, j;
    int d;
    public Edge(Node i, Node j) {
        this.i = i;
        this.j = j;
        this.d = (i.x - j.x) * (i.x - j.x) + (i.y - j.y) * (i.y - j.y);
    }
    public int compareTo(Edge o) {
        return d - o.d;
    }
}