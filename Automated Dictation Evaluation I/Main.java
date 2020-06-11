#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50],s2[50];
  cin.getline(s1,50);
  cin.getline(s2,50);
  int a=strcmp(s1,s2);
  if(a==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}