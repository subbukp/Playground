#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n],b[m][n],c[m][n];
  for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
    	c[i][j]=0;
    }
  }
  for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
    	cin>>a[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
    	cin>>b[i][j];
    }}
    for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
    	c[i][j]+=a[i][j]+b[i][j];
    }
  }
    for(i=0;i<m;i++)
  {
  	for(j=0;j<n;j++)
    {
    	cout<<c[i][j]<<" ";
    }
      cout<<endl;
  }
  }
