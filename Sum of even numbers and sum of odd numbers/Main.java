#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int osum=0,esum=0,a[n];
  for(int i=0;i<n;i++)
  {
  	cin>>a[i];
    if(a[i]%2==0)
      esum+=a[i];
    else
      osum+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<esum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<osum;
}