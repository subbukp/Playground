#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char c[100];
  int i;
  cin.getline(c,100);
  for(i=0;c[i]!='\0';i++);
  cout<<"The number of letters in the name is "<<i;
}