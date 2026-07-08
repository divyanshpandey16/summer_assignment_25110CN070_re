//Write a program to Write function to check  prime

#include<iostream>
using namespace std;
void prime(int n){
    
    bool isprime = true;
    int i=2;
    while(isprime && i<n){
        if(n%i==0)
        isprime = false;
        i++;
    }    
    if(isprime)
    cout<<"Prime";
    else
    cout<<"Not Prime";
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    prime(num);
}