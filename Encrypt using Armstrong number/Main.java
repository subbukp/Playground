#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp=n,count=0,sum=0;
  while(temp!=0)
  {
    
  	temp/=10;
    count++;
  }
  temp=n;
  while(temp!=0)
  {
    int rev=temp%10;
    
    sum+=power(rev,count);
    
  	temp/=10;
    
  }
  if(sum==n)
    return 1;
  else return 0;
  
}

int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}