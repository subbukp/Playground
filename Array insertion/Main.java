#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  n++;
  int a[n],i,pos,val;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n-1;i++)
  cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  pos--;
  
  if(pos>n){
      cout<<"Invalid Input";
  }
  else
  {
      cout<<"Enter the value to insert\n";
  cout<<"Array after insertion is\n";
  cin>>val;
      int temp=n-1;
  for(i=n-1;i>pos;i--)
  {temp--;
  	a[i]=a[temp];
  }
  a[pos]=val;
  for(i=0;i<n;i++)
  cout<<a[i]<<endl;
  }
  
  
  
}