// osef

package net.spray.chat.normal;

import java.io.PrintStream;


public class a extends Thread
{

    a(b b1)
    {
        _fldif = true;
        a = b1;
    }

    public void run()
    {
        while(_fldif && isAlive()) 
        {
            if(a != null)
            {
                if(a.isAlive())
                    a._mthdo();
                else
                    _fldif = false;
            } else
            {
                _fldif = false;
            }
            try
            {
                Thread.sleep(0x1d4c0L);
            }
            catch(InterruptedException interruptedexception)
            {
                System.err.println("InterruptedException");
            }
        }
    }

    public void a()
    {
        _fldif = false;
    }

    private boolean _fldif;
    private b a;
}
