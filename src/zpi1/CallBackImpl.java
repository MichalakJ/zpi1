/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zpi1;

/**
 *
 * @author student
 */
public class CallBackImpl implements CallBack{
    boolean var;
    
    
    @Override
    public void methodToCall(boolean b) {
        var = b;
    }

    @Override
    public boolean getResult() {
        return var;
    }

    
}
