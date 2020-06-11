#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,i,*a,countf=0,countm=0;
  cin>>n;
  a=(int *) malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
  	cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
  	if((*(a+i))%2==0)
      countf++;
    else
      countm++;
  }
  cout<<countm<<endl<<countf;
  return 0;
}