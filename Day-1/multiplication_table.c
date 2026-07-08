int main(){
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    for(int i=1; i<=10; i++){
        printf("\n%d x %d = %d", n,i,n*i);
    }
}