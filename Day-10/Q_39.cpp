/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA  */

#include<iostream>
using namespace std;

int main(){
    char ch;
    for(int i=1; i<=5; i++){
        for(int j=i; j<=4; j++){
            cout<<" ";
        }
        ch='A';
        for(int k=1; k<=(2*i-1); k++){
            // cout<<ch;
            if(k<i){
                cout<<ch;
                ++ch;
            }
            else if(k==i)
            cout<<ch;
            else{
                --ch;
                cout<<ch;
            }
        }
        cout<<endl;
    }
}