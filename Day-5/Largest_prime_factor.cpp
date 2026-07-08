#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    if(n<0){
        cout<<"Invalid output";
        exit(0);
    }
    cout<<"Prime factors are: ";
    int num;
    for(int i=2; i<=n; i++){
        bool isprime=true;
        num=i;
        if(n%i==0){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime)
            cout<<i<<" ";
        }
    }
}