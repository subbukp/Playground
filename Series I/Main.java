#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int n,i;
  cin>>n;
  float se=0.5;
  for(i=0;i<n;i++)
  {
    cout<<se<<" ";
  	se+=pow(3,i);
    
  }
}