#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,max;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  	for(j=0;j<n;j++)
    	cin>>a[i][j];
  for(i=0;i<n;i++)
  {max=0;
    for(j=0;j<m;j++)
    {
    	if(a[j][i]>max)
          max=a[j][i];
    }
                cout<<max<<endl;
  }
 
}