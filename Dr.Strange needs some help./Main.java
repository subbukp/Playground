#include<iostream>
#include<math.h>
using namespace std;
int powe(int a,int b)
{
 return pow(a,b);
}
int main()
{
	int m,n,req,ans;
  cin>>m>>n>>req;
  ans=powe(m,n);
  ans>=req?cout<<"Doctor, you can proceed with your experiment." :cout<<"Sorry Doctor! You need more bacteria.";
}