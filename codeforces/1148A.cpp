#include<bits/stdc++.h>

using namespace std;

int main()
{
    long long int a,b,c;
    cin>>a>>b>>c;
    if(a == b)
        cout<<a+b+(2*c);
    else
    {
        if(a>b)
            cout<<(2*b) + 1 + (2*c)<<endl;
        else
            cout<<(2*a) + 1 + (2*c)<<endl;
    }
    return 0;
}