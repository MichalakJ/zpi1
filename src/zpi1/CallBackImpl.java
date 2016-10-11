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
    public void methodToCall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getResult() {
        return var;
    }

    
}
