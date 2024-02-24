
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhs
 */
public abstract class Equation {
    protected List<Float> result = new ArrayList<>();
    protected List<Float> odd = new ArrayList<>();
    protected List<Float> even = new ArrayList<>();
    protected List<Float> square = new ArrayList<>();

    public List<Float> getResult() {
        return result;
    }

    public void setResult(List<Float> result) {
        this.result = result;
    }
    
    public abstract List <Float> findOdd();
    
    public abstract List <Float> findEven();
    
    public abstract List <Float> findSquare();
    
    public boolean isOdd(float n){
        return n%2==1;
    }
    public boolean isSquare(float n){
        long sqrt = (long)Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    
   
    
}
