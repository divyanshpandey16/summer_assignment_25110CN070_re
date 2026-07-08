#include<iostream>
#include<vector>
using namespace std;

int main(){
    cout<<"Enter a decimal number: ";
    int n;
    cin>>n;
    int r;
    vector<int>v;
    if(n==0){
        cout<<"0";
        exit(0);
    }
    while(n>=1){
        r=n%2;
        v.push_back(r);
        n/=2;
    }
    for(int i=v.size()-1; i>=0; i--){
        cout<<v[i];
    }
}