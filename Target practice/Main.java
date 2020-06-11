#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[100],n,temp;
  cin>>n;
  int i,sum=0,count=0;
 while(1)
 {
 	cin>>temp;
   sum+=temp;
   count++;
   if(sum>=n)
     break;
 }
  cout<<"The number of turns is "<<count;
}