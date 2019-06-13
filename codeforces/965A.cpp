#include<bits/stdc++.h>
using namespace std;
int main()
{
    int k,n,s,p,l; 
    int ans,num,sum;
    int i;
    scanf("%d %d %d %d",&k,&n,&s,&p);
    num=n/s;
    l=n%s;          
    if(l!=0){
        num++;
    }
    sum=k*num;      
    ans=sum/p;
    if(sum%p!=0){   
        ans++;
    }
    cout<<ans<<endl;
    return 0;
}