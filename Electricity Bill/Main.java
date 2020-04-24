#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int count; 
  if(a <= 200){
     count=0.5*a;
  }else if(a <= 400){
         count = ((0.65*a) + 100);
  }else if(a <= 600){
       count =((0.80*a) + 200);
  }else{
    count =((1.25*a) + 425);
  }
  cout<<"Rs."<<count;
}