#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   char s[100];
  cin.getline(s,100);
  int space=0;
  for(int i=0;s[i]!='\0';i++)
  {
  	if (s[i]==' ')
      space++;
  }
  if(space>10)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
}