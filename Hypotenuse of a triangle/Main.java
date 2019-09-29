#include<stdio.h>
int main()
{
  //Type your code here
 float base;
  float perpendicular;
  scanf("%f",&base);
  scanf("%f",&perpendicular);
  float hypotenuse;
  hypotenuse = (base*base)+(perpendicular*perpendicular);
  printf("%.2f",sqrt(hypotenuse));
  
 
  return 0;
}