#include <stdio.h>
int main()
{
    int n, i, a[1000];
    scanf("%d\n", &n);
    for (i = 0; i < n; i++)
    {
        scanf("%d ", &a[i]);
    }
    for (i = n - 1; i >= 0; i--)
    {
        printf("%d ", a[i]);
    }
    
    return 0;
}
