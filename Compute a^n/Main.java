#include<iostream>
using namespace std;
void power(int a,int n,int &p)
{
	
  if(n>0)
  {p*=a;
    power(a,n-1,p);}
}
int main()
{
  //Type your code here.
  int a,n,p;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  p=a;
  power(a,n-1,p);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<p;
}