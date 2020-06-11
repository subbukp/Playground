#include<iostream>
int main()
{
  int n,s,i,j,l,r;
  std::cin>>n;
  l=1;
  r=n*n+1;
  for(i=n;i>0;i--)
  {
    for(s=n;s>i;s--)
      std::cout<<"--";
    for(j=1;j<=i;j++)
    {
      std::cout<<l;
      std::cout<<"*";
      l++;
    }
    for(j=1;j<=i;j++)
    {
      std::cout<<r;
      if(j<i)
        std::cout<<"*";
      r++;
    }
    r=r-(i-1)*2-1;
    std::cout<<"\n";
  }
}