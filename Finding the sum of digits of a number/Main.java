#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int digit1;
  int digit2;
  int digit3;
  int digit4;
  int digit5;
  int num=0;
  while(num<=n){
  if(n>10000){
    digit1 = n/10000;
    digit2 = (n/1000)%10;
    digit3 = (n/100)%10;
    digit4 = (n%100)/10;
    digit5 = (n%10);
    num = num+1;
  }
    else{
      digit1 = (n/100);
      digit2 = n%10;
      digit3 = 0;
      digit4 = 0;
      digit5 = 0;
      num = num+1;
      
    }
  }
    printf("%d\n",digit1+digit2+digit3+digit4+digit5);
   
  
    
    
    
	return 0;
}