#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[100],b[100];
  int i,j,flag=0;
  cin.getline(a,100);
  cin.getline(b,100);
  int m=strlen(b);
  int n=strlen(a);
  for(i=0,j=m-1;i<n,j>=0;i++,j--)
  {
  	if(a[i]!=b[j])
    {
    flag=1;
      break;
    }
  
  }
  if(flag==1)
    cout<<"It is wrong";
   else
     cout<<"It is correct";
  
}