#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i,min,code;
  cin>>a>>b>>c;
  
  if(a<b && a<c)
    min=a;
  else if(b<a && b<c)
    min=b;
  if(c<a && b>c)
    min=c;
  for(i=min;i>0;i--)
  {
  	if(a%i==0 && b%i==0 && c%i==0 )
    {code=i;break;}
  }
  int max;
  if(a>c && a>b)
    max=a;
  else if(b>a && b>c)
    max=b;
  else max=c;
  int t=a+b+c-max-min;
    cout<<"The treasure is in box which has number "<<t;
  
  cout<<"\nThe code to open the box is "<<code;
}