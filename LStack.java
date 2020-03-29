/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *@assignment 4b
 *description: LStack data structure adapted from Clifford Shaffers Data Structures and Algorithim Analysis, Chapter 4.2.2
 */

 public class LStack<E> implements StackADT<E>{
     private Node<E> top;
     private int size;

     /**
      * Constructors, for the LStack both ignore the size input and 
      *default to zero
      */
     public LStack(){
         top = null;
         size = 0;
     }

     public LStack(int size_){
         top = null;
         size = 0;
     }
 }