#include<iostream>
using namespace std;
void gcd(int i, int j,int min)
{
	if(i%min==0 && j%min==0)
    {
    cout<<"G.C.D of "<<i<<" and "<<j<<" = "<<min;
      return;
    }
  gcd(i,j,min-1);
}
int main()
{
  //Type your code here.
  int i,j;
  cin>>i>>j;
	int min;
  if(i<j)
    min=i;
  else
    min=j;
  gcd(i,j,min);
}