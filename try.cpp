#include <bits/stdc++.h>

using namespace std;


int bs(vector<int>& a, int target) {
    int l = 0, r = (int)a.size() - 1;

    while (l <= r) {

        int mid = l + (r - l) / 2;

        if (a[mid] == target)
            return mid;


        else if (a[mid] < target)

            l = mid + 1;
        else
            r = mid - 1;
    }

    return -1;
}

// int solve(int l, int r) {
//     if (l == r) {
       
//         return a[l];
//     }

//     int mid = l + (r - l) / 2;

//     int left = solve(l, mid);
//     int right = solve(mid + 1, r);

//     // Combine results
//     return left + right;
// }

vector<int> a;

int solve(int l, int r) {
    if (l == r)
        return a[l];

    int mid = l + (r - l) / 2;

    int lf = solve(l, mid);
    int rg = solve(mid + 1, r);

    return lf + rg;
}


int main() {
    // ios::sync_with_stdio(false);
    // cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;


        vector<long long >v,v1;


        vector<long long> st;

        for (int i = 0; i < n; i++) {

            long long x;

            cin >> x;

            st.push_back(x);

            while ((int)st.size() >= 2 && st[(int)st.size() - 2] > st.back()) {

                long long a = st.back();

                st.pop_back();

                st.back() += a;
            }
        }

        long long ans = 0;

        for (long long x : st) {

            ans = max(ans, x);
        }

        cout << ans <<endl;
    }

    return 0;
}