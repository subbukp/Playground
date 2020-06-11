#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,flag=0;
  cin>>n;
  int a[n],rno;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>rno;
  for(i=0;i<n;i++)
  {
  	if(a[i]==rno)
    {
    flag=1;
      break;
    }
  }
  flag==0?cout<<"She failed" :cout<<"She passed her exam";
    
}