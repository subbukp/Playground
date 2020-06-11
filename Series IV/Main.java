#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp=2,sum=0,se=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cout<<se<<" ";
    se+=temp;
    if(i%2==0)
      temp+=4;
  }
}