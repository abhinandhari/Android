#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
    long t;
    cin>>t;
    while(t--){
    long max,min,k;
    float avg;
    long n;
    max=-1;
    min=LONG_MAX;
    cin>>n>>k;
    long a[n];
    for(long i=0;i<n;i++){
        cin>>a[i];
        if(a[i]<min){
            min=a[i];
        }
        if(a[i]>max){
            max=a[i];
        }
    }
    if (min+k>=max-k)
        cout<<min+k<<endl;
	else cout<<-1<<endl;
	}
	return 0;
}