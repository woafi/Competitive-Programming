#include <iostream>

using namespace std;

int main() {
    int N;
    cin >> N;

    int heights[N];
    for (int i = 0; i < N; ++i) {
        cin >> heights[i];
    }

    int currentPlatform = 0;
    while (currentPlatform < N - 1 && heights[currentPlatform] < heights[currentPlatform + 1]) {
        ++currentPlatform;
    }

    cout << heights[currentPlatform] << endl;
    return 0;
}
