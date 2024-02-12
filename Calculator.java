class Calculator{

 int num1 ,num2;
 double result;
 String operation;

Calculator(){
   System.out.println("hello from calculator class ");
}

Calculator(int num1, int num2,String operation)
{
   this.num1=num1;
   this.num2=num2;
   this.operation=operation;
}

public void doCalculation(){

switch(operation)
{
case "add":{
result= num1+num2;
break;
}
case "sub" :{
result= num1-num2;
break;
}

case "multi" :{
result= num1*num2;
break;
}

case "div" :{
result= num1/num2;
break;
}

default :
    System.out.println("please enter correct value");
 }
}

public void pritResult(){
   
System.out.println("hello from print result method");

System.out.println("you have performed :"+operation+"  your result= "+result);

}

public static void main(String args[]){

Calculator obj1=new Calculator(50,20,"sub");
System.out.println("object 1 value");
obj1.doCalculation();
obj1.pritResult();


Calculator obj2 =new Calculator(100,30,"multi");
System.out.println("object 2 value");
obj2.doCalculation();
obj2.pritResult();

Calculator obj3 =new Calculator(100,30,"val");
System.out.println("object 3 value");
obj3.doCalculation();
obj3.pritResult();



}

}