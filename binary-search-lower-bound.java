int low = 0;
int high = 1000000;

while(low < high) {
    int mid = (high + low) / 2;
    if(simulate(mid)) high = mid;
    else low = mid + 1;
}

return low;