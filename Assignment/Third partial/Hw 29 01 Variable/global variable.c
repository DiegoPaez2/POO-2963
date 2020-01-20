#include <conio.h>
#include <stdio.h>

int sum = 5;
int main()
{
    int n1, n2, producto;
    printf( "The value of the global variable is: %d\n", sum);
    printf( "Enter a number (whole): " );
    scanf( "%d", &n1 );
    printf( "Enter a number (whole): " );
    scanf( "%d", &n2 );

    sum = n1 + n2;
    printf( "\n   The sum is: %d", sum );

    return 0;
}
