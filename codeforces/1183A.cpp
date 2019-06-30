#include <iostream>
 
using namespace std;
int n,a,s;
void tillyougetit(){
	while(a!=0){
		s=s+a%10;
		a=a/10;
	}
}
int main()
{
    cin>>n;
    a=n;
    s=0;
    tillyougetit();
    while(s%4!=0){
        n=n+1;
        a=n;
        s=0;
       tillyougetit();
    }
    cout<<n<<endl;
    return 0;
}