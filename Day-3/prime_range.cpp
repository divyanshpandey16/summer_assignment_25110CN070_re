#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int s, e, i, c=0;
    cout<<"Enter start: ";
    cin>>s;
    cout<<"Enter end: ";
    cin>>e;
    bool isprime;
    for(int j=s; j<=e; j++){
        if(j<1){
        cout<<"Invalid "<<endl;
        continue;
    }
        i=2;
        isprime=true;
        while(isprime && i<j){
            if(j%i==0)
            isprime = false;
            i++;
        }    
        if(isprime)
        cout<<j<<" "; 
        cout<<endl;
    }
    
}