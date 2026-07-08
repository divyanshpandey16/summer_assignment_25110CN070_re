#include<stdio.h>
int main()
{
    int n, sum, r;

    printf("Enter the number: ");
    scanf("%d", &n);

     while (n != 1 && n != 4)// 4 is used as it is smallest unhappy number.
    {
        sum = 0;

        while (n != 0)
        {
            r = n % 10;
            sum = sum + r * r;
            n = n / 10;
        }

        n = sum;
    }

    if (n == 1)
    {
        printf("Happy Number");
    }
    else
    {
        printf("not a Happy Number");
    }

    return 0;
}