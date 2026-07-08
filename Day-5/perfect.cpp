#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    if(n<0){
        cout<<"Invalid input";
        exit(0);
    }
    int s=0;
    for(int i=1; i<n; i++){
        if(n%i==0)
        s+=i;
    }
    if(s==n)
    cout<<"Perfect number";
    else
    cout<<"Not a perfect number";
}
