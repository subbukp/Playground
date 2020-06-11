#include<iostream>
using namespace std;
int op(int size,int *a)
{
	int odd=0,even=0;
  	for(int i=0;i<size;i++)
    {
    	if (a[i]%2==0)
          even++;
      	else
          odd++;
    }
  if(even==0 && odd>0)
    return 2;
  else if(odd==0 && even>0)
    return 1;
  else return 3;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\n";
	cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int r=op(n,a);
  if(r==1)
    cout<<"The array is Even";
  else if(r==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}