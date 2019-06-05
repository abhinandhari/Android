#include <stdio.h>

int main()
{
    int k,r;
    int c=1;
    scanf("%d",&k);
    scanf("%d",&r);
    int k1=k;
    while((k%10!=0)&&(k%10!=r)){
        c=c+1;
        k=k+k1;
    }
    printf("%d\n",c);
    return 0;
}