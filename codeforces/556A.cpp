#include <bits/stdc++.h>

using namespace std;

int main()
{
    int c0=0,c1=0;
    char number[300000];
    int n;
    cin>>n;
    cin>>number;
    int l=n;
    int i=0;
    while(i<n){
        if(number[i]=='0')
            c0++;
        else
            c1++;
        i++;
    }
    if(c0==c1){
        cout<<"0"<<endl;
    }
    else if(c0>c1){
        cout<<(n-2*c1)<<endl;
    }
    else
        cout<<(n-2*c0)<<endl;
    return 0;
}