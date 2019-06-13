#include <stdio.h>

int main(){
    char a[1000][1000];
	int n,m,i,j,k,cnt=0,t;
	scanf("%d%d",&n,&m);
	for(i=1;i<=n;++i){
		scanf("%s",a[i]+1);
		for(j=1;j<=m;++j)if(a[i][j]=='*')++cnt;
	}
	for(i=2;i<n;++i)
		for(j=2;j<m;++j)if(a[i][j]=='*'&&a[i-1][j]=='*'&&a[i+1][j]=='*'&&a[i][j-1]=='*'&&a[i][j+1]=='*'){
			for(t=1,k=i-1;k&&a[k][j]=='*';--k)++t;
			for(k=i+1;k<=n&&a[k][j]=='*';++k)++t;
			for(k=j-1;k&&a[i][k]=='*';--k)++t;
			for(k=j+1;k<=m&&a[i][k]=='*';++k)++t;
			if(t==cnt){
				printf("YES\n");
				return 0;
			}
		}
	printf("NO\n");
	return 0;
}
