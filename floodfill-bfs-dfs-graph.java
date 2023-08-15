boolean[][] visited = new boolean[xSize][ySize];

PriorityQueue<Node> bfs = new PriorityQueue<Node>();

/* Can also be 
Stack<Node> dfs = new Stack<Node>();
if DFS */

int dx = {1, -1, 0, 0};
int dy = {0, 0, 1, -1};

while(!bfs.isEmpty()) {
    Node node = bfs.poll();
    int x = node.x;
    int y = node.y;
    visited[x][y] = true;
    for(int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if((nx >= 0 && nx < xSize && ny >= 0 && ny < ySize) && (!visited[nx][ny])) bfs.add(new Node(nx, ny));
    }
}

static class Node {
    public int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}