#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,maxr=0,maxc=0,sum,countr=0,countc=0;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  	for(j=0;j<n;j++)
    	cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<m;i++)
  {sum=0;
    for(j=0;j<n;j++)
    {
    	sum+=a[i][j];
      	
    }
   if(maxr<sum)
   { maxr=sum;
    countr++;
   }
   cout<<sum<<" ";
  }
 cout<<"\nRow "<<countr<<" has maximum sum";
  
  cout<<"\nSum of columns is ";
  for(i=0;i<n;i++)
  {sum=0;
    for(j=0;j<m;j++)
    {
    	sum+=a[j][i];
      	
    }
   if(maxc<sum)
   { maxc=sum;
    countc++;
   }
   cout<<sum<<" ";
  }
 cout<<"\nColumn "<<countc<<" has maximum sum";
}