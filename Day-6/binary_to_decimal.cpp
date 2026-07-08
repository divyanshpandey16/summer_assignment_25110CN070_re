#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int bin;
    cout<<"Enter a binary number: ";
    cin>>bin;
    int r,d=0,c=0;
    if(bin==0){
        cout<<"0";
        exit(0);
    }
    while(bin>0){
        r = bin%10;
        if(r==1){
            d+=pow(2,c);
        }
        ++c;
        bin/=10;
    }
    cout<<d;
}