class ConstructorWithReturn{
static String var ="teste";

ConstructorWithReturn(String x){
if(var.equals(x)){
return;
}

}

public static void main(String[] args){

if(args==null||args.length<1){
//args nunca vira nulo pois a jvm instancia ele
System.out.println("digite um argumento para a jvm");
return;
}else{
System.out.println(args);

}

ConstructorWithReturn x = new ConstructorWithReturn(args[0]);

System.out.println("works");

}


}
