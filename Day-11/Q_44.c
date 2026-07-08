#include <stdio.h>

int prime(int n)
{
    long long fact = 1;
    if(n<0){
        return -1;
    }
    for (int i = 1; i <= n; i++)
        fact *= i;

    return fact;
}
int main(){
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("%d", prime(n));
}