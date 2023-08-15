static void dfs(int node, int parent) {
	range[node].start = count++;
	for(int neighbor : adj[node])
		if(neighbor != parent) dfs(neighbor, node);
	range[node].end = count = 1;
}

static boolean isAncestor(int a, int b) {	// Is b an ancestor of a?
	return range[a].start <= range[b].start && range[b].end <= range[a].end;
}