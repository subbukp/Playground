#include<iostream>
using namespace std;
#include<string.h>
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int a=1;
  while(a!=-1)
  {
  	a=s.find("the");
    if(a>=0)
    s.erase(a,4);
  }
  cout<<s;
  
	
}