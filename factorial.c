#include<stdio.h>
int main(){
    int a,b,c=0,temp;
    

    scanf("%d",&a);
    temp=a;
    while(temp>0)
    {
        b=a%10;
        c=b*b*b;
        int n=n+c;
        a=a/10;
        if(n==c){
        printf("%d\n yes",c); 
        }
        else{
            printf("no");
        }
        
        
    }
    

    return 0;
}