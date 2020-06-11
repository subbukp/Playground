#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int inp;
  std::cin>>inp;
  int count=0;
  int val=inp;
  while(inp)
  {
    count++;
    inp=inp/10;
  }
  int sq=val*val;
  int back=sq;
  int n=count;
  int dig,sum=0;
  while(count)
  {
    dig=sq%10;
    sum=sum*10+dig;
    sq=sq/10;
    count--;
  }
  int q=0;
  while(sum)
  {
    dig=sum%10;
    q=q*10+dig;
    sum=sum/10;
  }
  int q1=0;
  while(back)
  {
    dig=back%10;
    q1=q1*10+dig;
    back=back/10;
  }
  int sum2=0;
  while(n)
  {
    dig=q1%10;
    sum2=sum2*10+dig;
    q1=q1/10;
    n--;
  }
  int a=sum2+q;
  if(a==val)
    std::cout<<"Kaprekar Number";
  else
    std::cout<<"Not a Kaprekar Number";
    
}