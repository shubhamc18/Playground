#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int first_digit;
  int second_digit;
  int sum;
  int num=1;
  while(num<n){
    if(n>10000){
    first_digit=n/10000;
    second_digit=n%10;
    num=num+1;
    }
    else{
      first_digit=n/1000;
      second_digit=n%10;
      num=num+1;
    }
    }
  printf("%d",first_digit+second_digit);
  
    
  
	return 0;
}