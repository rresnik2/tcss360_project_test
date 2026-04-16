/* Course: TCSS 142 - Programming Principles
 * File Name: Project1.java
 * Assignment: 1
 * Due Date: 04/16/2025
 * Instructor: Dr. Torre
 *
 * This program draws an ASCII representation of the Space Needle.
 * @author Macy Willyard
 * @version 2024/10/04
 */
public class Project1 {
   public static final int SIZE = 1;
   
   public static void main(String[] args) {
      needle();
      hat();
      bowl();
      needle();
      body();
      hat();
   }
   /* Outputs the needle at the top of the structure.
    * Is also usedin between the base and the top
    */
   public static void needle() {
   for (int j =1; j <= SIZE; j++) {
   
    for(int i = 1; i <= SIZE * 3; i++) {
      System.out.print(" ");
      }
      System.out.print("||");
      System.out.println();
      }
   }
   /* Outputs the top of the roof for the structure.
    * Also used for the stand at the bottom
    */
   public static void hat() {
   for (int line = 1; line <= SIZE; line++) { 
    for (int i = 1; i <= -3 * line + 3 * SIZE; i++) {
      System.out.print(" ");
      }
      System.out.print("__/");
     for (int dot = 1; dot <= 3 * (line - 1); dot++) {
      System.out.print(":");
      }
      System.out.print("||");
     for (int dot = 1; dot <= 3 * (line - 1); dot++) {
      System.out.print(":");
      }
      System.out.print("\\__");
      System.out.println();
      }
      System.out.print("|");
     for (int butt = 1; butt <= 6 * SIZE; butt++) {
      System.out.print("\"");
      }
      System.out.print("|");
      System.out.println();
      }
      
      // Outputs the bottom of the bulb on top of the structure
   public static void bowl() {
   for (int line = 1; line <= SIZE; line++) {
      for (int i = 1; i <= 2 * line - 2; i++) {
         System.out.print(" ");
         }
         System.out.print("\\_");
      for (int angle = 3 * SIZE - line; angle >= line; angle--) {
         System.out.print("/\\");
         }
         System.out.print("_/");
         System.out.println();
         }
        }
   // Outputs the body of the Space Needle
   public static void body() {
   for (int line = 1; line <= 4 * SIZE; line++) {
      for (int i = 1; i <= 3 * SIZE - 3; i++) {
         System.out.print(" ");
         }
         System.out.println("|%%||%%|");
        }
      }
}  

