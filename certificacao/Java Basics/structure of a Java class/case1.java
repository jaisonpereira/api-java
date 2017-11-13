
 package a.b.c;

 import java.util.*;

 class case1 {
   public static void main(String[] args) {
   ArrayList<String> existing = new ArrayList<String>();

   for (String arg : args) {
      if (new E().exists(arg)){
        existing.add(arg);
          }
        }
      }
 }

 import java.io.*;

 class E {
    public boolean exists(String name) {
    File f = new File(name);
    return f.exists();
     }
   }


//a) O arquivo não compila.
//b) O arquivo compila mas dá erro de execução pois o array é nulo.
//c) O arquivo compila mas dá erro de execução pois o array tem tamanho
//zero.
//d) Roda e imprime false.
//e) Roda e imprime true.
//f) Roda e não imprime nada.
