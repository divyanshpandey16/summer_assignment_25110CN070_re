#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int n, r, arm=0;
    cout<<"enter a number: ";
    cin>>n;
    int num=n;
    int no=n;
    int c=0;
    while(n>0){
        n/=10;
        ++c;
    }
    while(num>0){
        r = num%10;
        arm += round(pow(r,c));
        // cout<<pow(r,c)<<endl;
        num/=10;
    }
    cout<<arm<<endl;
    if(no==arm)
    cout<<"Armstrong number";
    else
    cout<<"not an armstrong number";
}