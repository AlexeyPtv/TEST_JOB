/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Job_2;

import com.sun.istack.internal.Nullable;

/**
 *
 * @author user-win7
 */
public class Allowance {
    
    private int[] price;
    private int discount;
    private int offset;
    private int readLength;
    private int[] priceOut;
    
    Allowance(int[] arr, int discount, int offset, int readLength){
        
        if(arr.length == 0){
            System.out.println("Массив скидок пустой ");
        }else{
            this.price = arr;
        }
        //******
        if(discount >= 0 ){
        switch((int)discount){
            case(0):
                System.out.println("Скидка не может быть 0% ");
                break;
            case(100):
                System.out.println("Скидка не может быть 100% ");
                break;
                
            default:
                this.discount = discount;
                System.out.println(this.discount + " + ");
            }
        }else{
            System.out.println("Скидка не может быть отрицательной ");
        }
        //******
        if(offset > price.length){
            System.out.println("Номер смещения не соответствует Массиву скидок ");
        }
        else if(offset < 0){
            System.out.println("Номер смещения не может быть отрицательной ");
        }
        else{
            this.offset = offset;
            System.out.println(this.offset + " + ");
        }
        //******
        if(readLength > price.length){
            System.out.println("Позиция не соответствует Массиву скидок ");
        }
        else if(readLength < 0){
            System.out.println("Позиция не может быть отрицательной ");
        }
        else{
           
            this.readLength = (price.length - 1) - offset;
            System.out.println(this.readLength + " + ");
        }
    }
    //******
    
    @Nullable
    public int[] decryptData(@NonNull int[] price, int discount, int offset, int readLength) {
        //TODO реализовать метод
        priceOut = new int[readLength];
        double count = discount / 100.0;
        //double count = 2.0;
        int j= 0;
        for(int i = offset; i <= readLength; i++){
           priceOut[j++] = (int) ((double)price[i] * count);
        }
        return priceOut;
    }
    
    void printPrice(){
        for(int i = 0; i < priceOut.length; i++){
            System.out.print(priceOut[i] + " ");
        }
    }
}
