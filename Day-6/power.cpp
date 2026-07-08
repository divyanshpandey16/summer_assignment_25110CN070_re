#include<iostream>
using namespace std;

int main(){
    int x;
    int n;
    cout<<"Enter a number: ";
    cin>>x;
    cout<<"Enter the power: ";
    cin>>n;
    int p=1;
    for(int i=1; i<=n; i++){
        p*=x;
    }
    cout<<p;
}