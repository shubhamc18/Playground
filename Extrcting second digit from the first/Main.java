#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int second_digit;
  if(n>10000){
    second_digit=(n/1000)%10;
    printf("%d",second_digit);
  }
  else{
    second_digit=n%10;
    printf("%d",second_digit);
  }
  
	return 0;
}