#include<iostream>
using namespace std;
struct complex{
	int r,img;
}c1,c2,ans;
int main()
{
	int choice;
  cin>>choice>>c1.r>>c1.img>>c2.r>>c2.img;
  switch(choice)
  {
    case 1:ans.r=c1.r+c2.r;
      ans.img=c1.img+c2.img;
       cout<<ans.r<<"+"<<ans.img<<"i";
      break;
    case 2:ans.r=c1.r-c2.r;
      ans.img=c1.img-c2.img;
       cout<<ans.r<<"+"<<ans.img<<"i";
      break;
    case 3:ans.r=(c1.r*c2.r)-(c1.img*c2.img);
      ans.img=(c1.r*c2.img)+(c1.img*c2.r);
      if(ans.img>0)
       cout<<ans.r<<"+"<<ans.img<<"i";
      else
         cout<<ans.r<<ans.img<<"i";
      break;
     
    default:cout<<"Invalid choice";
  }
}