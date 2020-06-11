#include<iostream>
using namespace std;
#include<string>
int main() 
{ 
//Type your code here
  string s;
 
  getline(cin,s);
  for(auto i=s.crbegin();i<s.crend();i++)
  {
  	cout<<*i;
  }
  
}