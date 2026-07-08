#include<stdio.h>
int main(){
    int n, r;
    printf("enter a number: ");
    scanf("%d",&n);
    int c=0;
    while(n>0){
        r = n%10;
        c+=r;
        n/=10;
    }
    printf("The sum of digits are %d",c);
}