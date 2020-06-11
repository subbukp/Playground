#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,sum=0,rev,temp;
  cin>>n;
  temp=n;
  while(n!=0)
  {
  	sum+=n%10;
    n/=10;
  }
  temp%sum==0 ? cout<<"Harshad Number" : cout<<"Not Harshad Number";
}