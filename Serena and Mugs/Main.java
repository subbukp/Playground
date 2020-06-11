#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sum=0,i,n,s;
  cin>>n>>s;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
  	sum+=a[i];
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}