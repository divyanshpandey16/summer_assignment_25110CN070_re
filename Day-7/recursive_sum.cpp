#include<iostream>
using namespace std;

int sum(int num){
    if(num==0)
    return 0;
    int r=num%10;
    return r+sum(num/10);
}
int main(){
    cout<<"Enter a number: ";
    int n;
    cin>>n;
    cout<<"Sum of digits is "<<sum(n);
}
