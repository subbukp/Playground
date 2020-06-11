#include<iostream>
using namespace std;
int main()
{
 int n,i,j;
  cin>>n;
  for(i=0;i<=3;i++)
  {
  	for(j=0;j<=i;j++)
    {
    cout<<n;
    }
    n++;
    cout<<endl;
  }
  for(i=3;i>=0;i--)
  {
    n--;
  	for(j=0;j<=i;j++)
    {
    cout<<n;
    }
    
    cout<<endl;
  }
}