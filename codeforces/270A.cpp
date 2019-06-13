#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	scanf("%d", &t);
	while (t--) {
		int a;
		scanf("%d", &a);
		if (a < 60) {
			printf("NO\n");
			continue;
		}
		int n = 3;
		while (a > ((n - 2) * 180) / n) n++;
		if (((n - 2) * 180) % n == 0 && a == ((n - 2) * 180) / n)
			printf("YES\n");
		else
			printf("NO\n");
	}
	return 0;
}