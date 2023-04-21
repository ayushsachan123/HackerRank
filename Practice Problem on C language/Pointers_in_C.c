#include <stdio.h>

void update(int *a, int *b)
{
    // Complete this function
    int d = *a + *b;
    printf("%d\n", d);
    int e = *a - *b;
    if (e > 0)
    {
        printf("%d", e);
    }
    else
    {
        printf("%d", e * (-1));
    }
}

int main()
{
    int a, b, *c, *d;
    scanf("%d %d", &a, &b);
    c = &a;
    d = &b;
    update(c, d);
    return 0;
}
