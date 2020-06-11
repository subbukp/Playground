#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int v=0,c=0,d=0,sy=0,w=0,i;
  getline(cin,s);
  for(i=0;s[i]!='\0';i++)
  {
  	if(s[i]>='a'&&s[i]<='z')
         {
             if(s[i]=='a'||s[i]=='e'||
                s[i]=='i'||s[i]=='o'||s[i]=='u')
             v++;
             else c++;
         }
    else if(s[i]>='A'&&s[i]<='Z')
         {
             if(s[i]=='A'||s[i]=='E'||
                s[i]=='I'||s[i]=='O'||s[i]=='U')
             v++;
             else c++;
         }
    else if(s[i]==' ')
      w++;
    else if (s[i]>= '0' && s[i]<= '9') 
            d++;
    else sy++;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<sy<<endl;
}