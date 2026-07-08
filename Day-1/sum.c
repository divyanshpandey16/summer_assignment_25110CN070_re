#include <stdio.h>

int main(void) {
	int n, i;
	long long sum = 0;

	printf("Enter a positive integer: ");
	scanf("%d", &n);

	for (i = 1; i <= n; ++i) {
		sum += i;
	}

	printf("Sum of first %d natural numbers = %lld\n", n, sum);
	return 0;
}