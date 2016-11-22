//caramail
//decompilé par cth103
//imports
package net.spray.chat.normal;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

// net.spray.chat.normal utilisé dans "b"

//class de l'applet
public class CaraNewChat extends Applet
{

    public CaraNewChat()
    {
		//c tou mdr
        _flddo = false;
        _fldif = null;
        _fldnew = 0L;
        _fldfor = 0L;
        a = null;
    }
    //init
    public void init()
    {
        try
        { 
		    //osef
            String s;
            if((s = getParameter("start")) != null)
                _fldnew = Long.parseLong(s);
            if((s = getParameter("time")) != null)
                _fldfor = Long.parseLong(s);
            if((a = getParameter("url")) != null)
                _flddo = _fldnew > 0L && _fldfor > 0L;
        }
        catch(NumberFormatException numberformatexception)
        {
            _flddo = false;
        }
    }

    public void start()
    {
        if(_flddo)
        {
			//ui
            for(Date date = new Date(); date.getTime() < _fldnew + _fldfor * 1000L;)
            {
				//ah.
                date = new Date(System.currentTimeMillis());
                try
                {
					//tu as trop chatté
                    Thread.sleep(1000L);
                }
                catch(Exception exception) { }
            }

            String s = "";
            try
            { //essaye
                String s1; 
				//detection de la chambre
                if((s1 = getParameter("room0")) != null)
                    s = s + "r0=" + b.a(s1.getBytes("UTF8"));
                else
                if((s1 = getParameter("room1")) != null)
                    s = s + "r1=" + b.a(s1.getBytes("UTF8"));
                if((s1 = getParameter("res")) != null)
                    s = s + "&r=" + s1;
				//c kwa kom mode?
                if((s1 = getParameter("mode")) != null)
                    s = s + "&m=" + s1;
				
                if((s1 = getParameter("prefs")) != null)
                    s = s + "&p=" + b.a(s1.getBytes("UTF8"));
            }
            catch(Exception exception1) { }
            try
            {
				//hop hop hop on go dans un site
                AppletContext appletcontext = getAppletContext();
                appletcontext.showDocument(new URL("http://" + getDocumentBase().getHost() + a + "?" + s), "chat"); //null?r0="ui"
            }
            catch(MalformedURLException malformedurlexception)
            {
                System.err.println("Je suis une erreur."); //ui
            }
        } else
        {
			//osef
            _fldif = new b(this);
            _fldif._mthtry();
        }
    }
    //osef aussi
    public boolean handleEvent(Event event)
    {
        if(_fldif != null)
        {
            if(_fldif.a(event))
                return true;
            else
                return super.handleEvent(event);
        } else
        {
            return super.handleEvent(event);
        }
    }

    public boolean action(Event event, Object obj)
    {
        if(_fldif != null)
        {
            if(_fldif.a(event, obj))
                return true;
            else
                return super.action(event, obj);
        } else
        {
            return super.action(event, obj);
        }
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
    }

    public void stop()
    {
        if(_fldif != null)
        {
            _fldif.stop();
            _fldif._mthfor();
            _fldif = null;
        }
    }

    public void destroy()
    {
        Runtime.getRuntime().gc();
    }

    private boolean _flddo;
    private Dimension _fldint;
    private b _fldif;
    private long _fldnew;
    private long _fldfor;
    private String a;
}
