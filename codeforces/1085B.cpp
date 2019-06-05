#include<iostream>
using namespace std;
int main()
{
    int n,k,x=0;
    cin>>n>>k;
    for(int i=k-1; i>=1; i--)
    {
        if(n%i==0)
        {
            x=i;
            break;
        }
    }
    cout<<((k*(n/x))+x)<<endl;
    return 0;
}