#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float item,time;
  cin>>item>>time;
   if(item==2)
   cout<< time+(time*0.5);
  else if(item==3)
    cout<<time*2;
  else
    cout<<"Number of items is more";
}