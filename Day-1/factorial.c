#include <stdio.h>

int main()
{
    int n;
    long long fact = 1;
    printf("Enter a number: ");
    scanf("%d", &n);
    if(n<0){
        printf("Invalid");
        exit(0);
    }
    for (int i = 2; i <= n; i++)
        fact *= i;

    printf("%lld\n", fact);
    return 0;
}