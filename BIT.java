static class BIT {

    public int n;
    public int[] tree;

    public BIT(int n) {
        this.n = n;
        this.tree = new int[n + 1];
    }

    public int sumTo(int index) {      // Return the sum of all items until the index, [0...index]
        int sum = 0;
        index = index + 1;
        while(index > 0) {
            sum += tree[index];
            index -= index & (-index);
        }
        return sum;
    }

    public void update(int index, int val) {    // Replaces a certain index with a value
        index = index + 1;
        while(index <= n) {
            tree[index] += val;
            index += index & (-index);
        }
    }

}