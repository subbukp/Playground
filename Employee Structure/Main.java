#include<iostream>
using namespace std;
struct stu{
	int n,y;
  	float cgpa;
  	char dept[100],name[100];
};
int main()
{
  //Type your code here.
  int m=1;
  stu s[m];
  for(int i=0;i<m;i++){
  
  cout<<"Enter name:";
  cin>>s[i].name;
    cout<<"\nEnter ID:";
    cin>>s[i].n;
    cout<<"\nEnter age:";
  cin>>s[i].y;
  cout<<"\nEnter designation:";
  cin>>s[i].dept;
  
  cout<<"\nEnter Salary:\n";
  cin>>s[i].cgpa;}
  for(int i=0;i<m;i++){
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<s[i].name;
  
  cout<<"\nID of the Employee : "<<s[i].n;
  cout<<"\nAge of the Employee : "<<s[i].y;
    cout<<"\nDesignation of the Employee : "<<s[i].dept;
  cout<<"\nSalary of the Employee : "<<s[i].cgpa;}
}