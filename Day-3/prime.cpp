#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    bool isprime = true;
    int i=2;
    while(isprime && i<n){
        if(n%i==0)
        isprime = false;
        i++;
    }    
    if(isprime)
    cout<<"Prime";
    else
    cout<<"Not prime";
    // return 0;
}
