#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    int a=0, b=1;
    int c;
    for(int i=3; i<=n; i++){
        c=a+b;
        a=b;
        b=c;
    }
    cout<<c;
}
