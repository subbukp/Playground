#include<iostream>
using namespace std;
#include<string.h>
int main() 
{ string s;
  int found,i;
  getline(cin,s);
  found=s.find(".");
 cout<<"Floating part is : ";
  if(found>0)
  {
  
  for(i=found+1;s[i]!='\0';i++)
    cout<<s[i];}
}