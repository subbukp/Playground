#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int i,n,se=6;
  cin>>n;
  for(i=1;i<=n;i++)
  {
  	cout<<se<<" ";
    se+=5*i;
  }
}