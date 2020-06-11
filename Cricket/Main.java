#include<iostream>
using namespace std;
int main()
{
	float oballs,truns,runs,balls,overs,bowled;
    cin>>oballs>>truns>>runs>>balls;
  overs=oballs/6;
  cout<<overs<<endl;
  bowled=int(balls/6);
  bowled+=(balls-(bowled*6))/10;
  cout<<bowled<<endl;
  float temp1=runs/bowled;
  temp1 = (int)(temp1 * 10 + .5); 
float crr=(float)temp1 / 10; 
  cout<<crr<<endl;
  float temp2=truns/overs;
  temp2=(int)(temp2*10+.5);
    float orr=(float)temp2/10;
  cout<<orr<<endl;
  crr>orr ?cout<<"Eligible to Win" :cout<<"Not Eligible to Win";
}