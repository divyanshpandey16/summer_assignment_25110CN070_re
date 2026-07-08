#include<iostream>
using namespace std;

long factorial(int num){
    long fact=1;
    for(int i=1; i<=num; i++){
        fact*=i;
    }
    return fact;
}
int digit(int dig){
    int r,s=0;
    while(dig>0){
        r=dig%10;
        s+=factorial(r);
        dig/=10;
    }
    return s;
}
int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    if(n<0){
        cout<<"Invalid input";
        exit(0);
    }
    long s;
    s=digit(n);
    if(s==n)
    cout<<"Strong number";
    else
    cout<<"Not a strong number";
}
