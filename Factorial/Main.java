#include<iostream>
using namespace std;
int facto=1;
int fact(int a)
{
	facto*=a;
  a--;
  if(a>0)
    fact(a);
    
}
int main()
{
  //Type your code here.
  int n,i;
  cin>>n;
  fact(n);
  cout<<"The factorial of "<<n<<" is "<<facto;
}