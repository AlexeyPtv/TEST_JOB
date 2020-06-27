/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Job_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author user-win7
 * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
* на количество позиций readLength. Новые цены округляем “вниз”,
* до меньшего целого числа.
* 
* @param discount - % скидки, от 1 до 99.
* @param offset - номер позиции, с которой нужно применить скидку.
* @param readLength - количество позиций, к которым нужно применить скидку.
* @return - массив новых цен.
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.PARAMETER)

public @interface IntRange {
    int from();
//    int discount() default 1;
//    int offset() default 0;
//    int readLength()default 1;
//    
//    int value();
}
