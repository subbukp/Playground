#include<iostream>
using namespace std;
int main()
{
int a,b,menu;
  std::cin>>a; std::cin>>b;std::cin>>menu;
  std::cout<<"Enter first number : Enter second number : Menu"<<std::endl;

    std::cout<<"1.Addition"<<std::endl;
  std::cout<<"2.Subtraction"<<std::endl;
  std::cout<<"3.Multiplication"<<std::endl;
  std::cout<<"4.Division"<<std::endl;
  std::cout<<"5.Remainder"<<std::endl;
    switch(menu)
    {
      case 1:std::cout<<a+b;
        break;
        case 2:std::cout<<a-b;
        break;
        case 3:std::cout<<a*b;
        break;
        case 4:std::cout<<a/b;
        break;
        case 5:std::cout<<a%b;
        break;
      default:cout<<"Invalid operation";
    }
  
}