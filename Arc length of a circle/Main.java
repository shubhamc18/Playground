#include<stdio.h>
int main(){
float radius;
float angle;
scanf("%f",&radius);
scanf("%f",&angle);
float arc_length = 2*3.14*radius*(angle/360);
printf("%.2f",arc_length);
}