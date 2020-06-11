#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  float score;
  do
  {
    std::cin>>n;
    if(n<0)
      score+=-1;
    else if(n%2!=0)
    {
      count++;
      score++;
    }
    else
    {
     // count++;
      score-=0.5;
    //count++;
    }
  }
 while(n>0 && count!=3);
  std::cout<<score;
}
