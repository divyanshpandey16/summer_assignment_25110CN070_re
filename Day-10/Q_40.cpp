/*
    1
   121
  12321
 1234321
123454321  */

#include<iostream>
using namespace std;

int main(){
    int num;
    for(int i=1; i<=5; i++){
        for(int j=i; j<=4; j++){
            cout<<" ";
        }
        num=1;
        for(int k=1; k<=(2*i-1); k++){
            // cout<<ch;
            if(k<i){
                cout<<num;
                ++num;
            }
            else if(k==i)
            cout<<num;
            else{
                --num;
                cout<<num;
            }
        }
        cout<<endl;
    }
}