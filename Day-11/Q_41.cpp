//Write a program to Write function to find sum of two numbers. 
#include<iostream>
using namespace std;

int sum(int a, int b){
    int sum;
    sum=a+b;
    return sum;
}

int main(){
    int num1, num2;
    cout<<"Enter 2 numbers: ";
    cin>>num1>>num2;
    cout<<"The sum is: "<<sum(num1,num2);
}