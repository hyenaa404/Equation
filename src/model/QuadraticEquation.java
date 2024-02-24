package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class QuadraticEquation extends Equation {

    private float a;
    private float b;
    private float c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    

    public List<Float> calculateQuandraticEquation() {
        float delta = b*b - 4*a*c;
        if (delta<0){
            return null;
        }else if (delta > 0){
            float n1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            float n2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            result.add(n1);
            result.add(n2);
        }else if(delta == 0){
            float n = -b/ (2*a);
            result.add(n);
        }
        return result;
    }

    @Override
    public List<Float> findOdd() {
        if (isOdd(a)) {
            odd.add(a);
        }
        if (isOdd(b)) {
            odd.add(b);
        }
        if (isOdd(c)) {
            odd.add(c);
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
        if (!isOdd(c)) {
            even.add(c);
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
        if (isSquare(c)){
            square.add(c);
        }
        return square;
    }

}
