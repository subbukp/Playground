#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,sum;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  	for(j=0;j<n;j++)
    	cin>>a[i][j];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
    	if(i==0)
         sum+=a[i][j];
      else if(i==m-1)
        sum+=a[i][j];
      else if(i+j==m-1)
        sum+=a[i][j];
    }
                
  }
 cout<<"Sum of Zig-Zag pattern is "<<sum;
}