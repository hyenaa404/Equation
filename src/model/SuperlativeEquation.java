/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class SuperlativeEquation extends Equation {
    private float a;
    private float b;

    public SuperlativeEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public SuperlativeEquation() {
        
    }
    
    

    public List<Float> calculateEquation() {
        if (a==0){
            return null;
        }
        float rs = -b/a;
        result.add(rs);
        return result;
    }

    

    @Override
    public List<Float> findOdd() {
        if (isOdd(a)){
            odd.add(a);
        }
        if (isOdd(b)){
            odd.add(b);
        }
        return odd;
    }

    @Override
    public List<Float> findEven() {
        if (!isOdd(a)){
            even.add(a);
        }
        if (!isOdd(b)){
            even.add(b);
        }
        return even;
    }

    @Override
    public List<Float> findSquare() {
        if (isSquare(a)){
            square.add(a);
        }
        if (isSquare(b)){
            square.add(b);
        }
        return square;
    }
    
}
