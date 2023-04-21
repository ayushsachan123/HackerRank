#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
    printf("eight\n");
    printf("nine\n");
  for(int i=0;i<=b;i++)
  {
      if(i%2==0)
      {
          printf("even\n");
      }
      else
      {
          printf("odd");
      }
  }

    return 0;
}

