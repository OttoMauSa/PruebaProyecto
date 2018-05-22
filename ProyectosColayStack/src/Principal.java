
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Mauricio Sajché
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue <Integer> cola = new LinkedList<Integer>();
        Stack <Integer> nuevaPila = new Stack <Integer>();        
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        
        for(int i = 0; i <= 4; i++)
        {
            System.out.println("Ingrese dato ");
            int x;
            x=  teclado2.nextInt();
            nuevaPila.push(x);  
            cola.add(x);
        }

        int op;
        //Menu
        System.out.println("1. Ver Datos Apilados");
        System.out.println("2. Ver Datos Encolados");
        System.out.println("3. Ver Primer Dato Encolado");
        System.out.println("4. Ver Ultimo Dato Encolado");
        System.out.print("Ingrese opción: ");
        op=teclado.nextInt();
        
        
        
        switch (op)
        {
            case 1:
            {
                Vector nuevoVector = new Vector();
                while(!nuevaPila.isEmpty())
                {
                    nuevoVector.add(nuevaPila.pop());
                }

                System.out.print(nuevoVector);
                System.out.println(" ");
            }break;
            
            case 2:
            {
                System.out.println(cola);
            }break;
            
            case 3:
            {
                System.out.println("Primer dato de la cola: "+cola.peek());
            }break;
            
            case 4:
            {
                for(int j = 0; j <= 3; j++)
                {
                    cola.remove(); 
                }
                System.out.println("Ultimo dato de la cola: "+cola.peek());
            }break;
        }         
    }
}
