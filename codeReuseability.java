class codeReuseability {
    public static int getNum(int a){
        return a*a;
    }
    public static void main(String[] args){
        for (int i=200 ;i<=205; i++){
        int result=getNum(i);
        System.out.println("the square value of "+i+" is :"+result);
        }
    }
}
      