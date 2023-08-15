boolean[] visited = new boolean[n];

PriorityQueue<Node> bfs = new PriorityQueue<Node>();

/* Can also be 
Stack<Node> dfs = new Stack<Node>();
if DFS */

while(!bfs.isEmpty()) {
    Node node = bfs.poll();
    visited[node.i] = true;
    for(Node linkedNode : current.linked) {
        if(!visited[linkedNode.i]) bfs.add(linkedNode);
    }
}

static class Node {
    public ArrayList<Node> linked;
    public int i;
    public int x, y;

    public Node(int i, int x, int y) {
        this.i = i;
        this.x = x;
        this.y = y;
        this.linked = new ArrayList<Node>();
    }
}