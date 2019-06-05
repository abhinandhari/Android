#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int arr[2*n];
    for(int i=0;i<2*n;i++)
    {
        cin>>arr[i];
    }

    sort(arr,arr+(2*n));
    if(arr[0]==arr[2*n-1])
    {
        cout<<-1<<endl;
        return 0;
    }

    for(int i=0;i<2*n;i++)
    {
        cout<<arr[i]<<' ';
    }
}