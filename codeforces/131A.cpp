#include <bits/stdc++.h>
using namespace std;

int main() {
   
   string s;
   cin>>s;
   int i,count=0;
   
   for(i=1 ; i<s.size() ; i++)
   {
       if(isupper(s[i]))count++;
   }
   
   if(count==s.size()-1)
   {
       for(i=0 ; i<s.size() ; i++)
       {
           if(isupper(s[i]))s[i] = tolower(s[i]);
           else s[i]=toupper(s[i]);
       }
   }
   cout<<s;
	return 0;
}