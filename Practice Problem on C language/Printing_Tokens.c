#include <stdio.h>
#include <string.h>

int main()
{
    char a[1000];
    char b[] = " ";
    gets(a);
    char *split = strtok(a, b);
    while (split != NULL)
    {
        printf("%s\n", split);
        split = strtok(NULL, b);
    }
    return 0;
}
