#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  
  int total= b*75 + c*30;
  if(total <= a){
    cout<<"Boat is stable";
  }else{
    cout<<"Boat will drow";
  }
}