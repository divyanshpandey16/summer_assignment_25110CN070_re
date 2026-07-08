//Write a program to write function for palindrome
#include<stdio.h>

int pal(int n)
{
    int temp,rev=0,r;

    temp=n;
    while (temp!=0)
    {
        r=temp%10;
        rev=10*rev+r;
        temp=temp/10;
    }

    if(rev==n)
    {
        return 1; 
    }

    return 0;  
}
int main()
{
    int n;

    printf("Enter the number: ");
    scanf("%d",&n);

    if(pal(n))
    {
        printf("Palindrome Number");
    }

    else
    {
        printf("Not a Palindrome number");
    }
    return 0;
}