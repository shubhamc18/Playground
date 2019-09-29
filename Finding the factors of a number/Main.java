#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int factor;
  int num=1;
  for(int factor_count=1;factor_count<=n;factor_count++){
    factor = n%num;
    if(factor==0)
    printf("%d\n",num);
    num = num+1;
  }
}
    