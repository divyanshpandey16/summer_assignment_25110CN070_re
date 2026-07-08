//Write a program to Write function to find  maximum

#include<iostream>
#include<math.h>
using namespace std;

int max(int a,int b,int c){
    int num_max=max(a,max(b,c));
    return num_max;
}
 int main(){
    int num1,num2,num3;
    cout<<"Enter 3 numbers: ";
    cin>>num1>>num2>>num3;
    cout<<"Largest number is: "<<max(num1,num2,num3);
}