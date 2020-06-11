#include<iostream>
using namespace std;
struct College{
  char name[100];
  char city[100];
  int year;
  float pass;
};
  
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of colleges\n";
  std::cin>>n;
  struct College s[n];
  for(int i=1;i<=n;i++)
  {
    std::cout<<"Enter the details of college "<<i<<"\n";
    std::cout<<"Enter name\n";
    std::cin>>s[i].name;
    std::cout<<"Enter city\n";
    std::cin>>s[i].city;
    std::cout<<"Enter year of establishment\n";
    std::cin>>s[i].year;
    std::cout<<"Enter pass percentage\n";
    std::cin>>s[i].pass;
  }
  std::cout<<"Details of colleges\n";
  for(int i=1;i<=n;i++)
  {
    std::cout<<"College:"<<i<<"\n";
    std::cout<<"Name:"<<s[i].name<<"\n";
    std::cout<<"City:"<<s[i].city<<"\n";
    std::cout<<"Year of establishment:"<<s[i].year<<"\n";
    std::cout<<"Pass percentage:"<<s[i].pass<<"\n";
  }
  
    
}