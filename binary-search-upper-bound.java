int low = 0;
int high = 1000000;

while(low < high) {
    int mid = (low + high) / 2;
    if(simulate(mid)) low = mid;
    else high = mid - 1;
}

return high;