#include <bits/stdc++.h>

using namespace std;

int main(){
	int n;
	cin >> n;
	int a[n];
	for(int i = 0; i < n; ++i)
		cin >> a[i];
	sort(a, a+n);
	int total = 0;
	for(int i = 0; i < n; i+=2)
		total += a[i+1] - a[i];
		cout << total << endl;
		return 0;
}
