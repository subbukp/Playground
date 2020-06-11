#include<iostream>
 int findSum(int N)
 {
        if(N<10)
            return N;

        int sum = 0;
        while(N>0){
            sum += N%10;
            N = N/10;
        }
        return findSum(sum);
  }
int main()
{
  int n;
  std::cin>>n;
  int res=findSum(n);
  std::cout<<res;
}