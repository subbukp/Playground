#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,fibo,n1=0,n2=1;
  cin>>n;
  for(i=0;i<n-2;i++)
  {
  	fibo=n1+n2;
    n1=n2;
    n2=fibo;
  }
  cout<<fibo;
}