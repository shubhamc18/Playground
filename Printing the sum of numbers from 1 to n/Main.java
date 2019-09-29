#include <stdio.h>
int main() {
	//Type your code
  int  n;
  scanf("%d",&n);
  int sum=0;
  for(int count=1;count<=n;count=count+1){
    sum=sum+count;
  }
  printf("%d\n",sum);
	return 0;
  
}