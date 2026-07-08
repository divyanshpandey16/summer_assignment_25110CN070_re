#include<stdio.h>
int main(){
    int n, r;
    printf("enter a number: ");
    scanf("%d",&n);
    int c=0;
    int num=n;
    while(n>0){
        r = n%10;
        c = c*10 + r;
        n/=10;
    }
    if(num==c)
    printf("Palindrome");
    else
    printf("Not palindrome");
}