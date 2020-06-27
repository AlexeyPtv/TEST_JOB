/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Job_2;


class NewClass{
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        int[] arr = {5,100,20,66,16};
        
        
        
        Allowance al = new Allowance(arr, 50, 1, 3);
        al.decryptData(arr, 50, 1, 3);
        al.printPrice();
    }
}
