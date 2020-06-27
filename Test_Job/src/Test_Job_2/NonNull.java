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
 * @param price - исходные цены.
 */

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.PARAMETER)

public @interface NonNull {
    
}
