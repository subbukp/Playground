#include<iostream>
using namespace std;
struct Time{
  int seconds;
  int minutes;
  int hours;
};
void compute(struct Time,struct Time,struct Time*);
int main()
{
  //Type your code here.
  struct Time t1,t2,t3;
  std::cin>>t1.hours>>t1.minutes>>t1.seconds;
  std::cin>>t2.hours>>t2.minutes>>t2.seconds;
  compute(t1,t2,&t3);
  cout<<t3.hours<<":"<<t3.minutes<<":"<<t3.seconds;
  return 0;
}
void compute(struct Time t1,struct Time t2,struct Time *t3)
{
  if(t2.seconds>t1.seconds)
  {
    --t1.minutes;
    t1.seconds+=60;
  }
  t3->seconds=t1.seconds-t2.seconds;
  if(t2.minutes>t1.minutes)
  {
    --t1.hours;
    t1.minutes+=60;
  }
  t3->minutes=t1.minutes-t2.minutes;
  t3->hours=t1.hours-t2.hours;
}
