#include<iostream>
#include<math.h>
using namespace std;

int main(){
    int s,e;
    int r,num,no,c,arm;
    cout<<"Enter start: ";
    cin>>s;
    cout<<"Enter end: ";
    cin>>e;
    for(int n=s; n<=e; n++){
        num=n;
        no=n;
        c=0;
        arm=0;
    while(no>0){
        no/=10;
        ++c;
    }
    while(num>0){
        r = num%10;
        arm += round(pow(r,c));
        // cout<<pow(r,c)<<endl;
        num/=10;
    }
    // cout<<arm<<endl;
    if(n==arm)
    cout<<n<<endl;
}
}