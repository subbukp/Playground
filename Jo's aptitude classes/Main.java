#include<iostream>
using namespace std;
int main()
{
int a,b,c,ans,min,gcd;
  cin>>a>>b>>c>>ans;
  if(a<b && a<c)
    min=a;
  else if(b<a && b<c)
    min=b;
  else min=c;
  for(int i=min;i>=1;i--)
  {
  	if(a%i==0 && b%i==0 && c%i==0 )
    {gcd=i;
     break;
    }
  }
  gcd==ans ?cout<<"Answer is correct." : cout<<"Answer is wrong.";
}