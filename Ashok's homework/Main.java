#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c],b[r][c],sum[r][c];
  for(i=0;i<r;i++){
 	for(j=0;j<c;j++)
      cin>>a[i][j];}
  for(i=0;i<r;i++){
 	for(j=0;j<c;j++)
      cin>>b[i][j];}
  for(i=0;i<r;i++){
 	for(j=0;j<c;j++)
      sum[i][j]=0;}
  for(i=0;i<r;i++){
 	for(j=0;j<c;j++)
      sum[i][j]+=a[i][j]+b[i][j];}
  for(i=0;i<r;i++){
 	for(j=0;j<c;j++)
      cout<<sum[i][j]<<" ";
  cout<<"\n";}
}