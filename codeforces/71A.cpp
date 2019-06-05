
#include <bits/stdc++.h>
using namespace std;

int main()
{
    char s[150];
    int t;
    cin>>t;
    while(t--){
    cin>>s;
    if(strlen(s)-1>9){
        cout<<s[0]<<strlen(s)-2<<s[strlen(s)-1]<<endl;;
    }
    else
        cout<<s<<endl;
}
    return 0;
}