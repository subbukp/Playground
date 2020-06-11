#include<iostream>
using namespace std;
int f=0,n1=0,n2=1;
int fibo(int n)
{
	f=n1+n2;
  	n1=n2;
  n2=f;
  n--;
  if(n>0)
    fibo(n);
}
int main()
{
  //Type your code here.
  int n,ans;
  cin>>n;
  if(n==1)
    cout<<"The term 1 in the fibonacci series is 0";
  else if(n==2)
    cout<<"The term 2 in the fibonacci series is 1";
  else{
  fibo(n-2);
    cout<<"The term "<<n<<" in the fibonacci series is "<<f;
  }
}