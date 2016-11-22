// la meme merde que au root
package net.spray.chat.normal;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class CaraNewChat extends Applet
{

    public CaraNewChat()
    {
        _flddo = false;
        _fldif = null;
        _fldnew = 0L;
        _fldfor = 0L;
        a = null;
    }

    public void init()
    {
        try
        {
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
            for(Date date = new Date(); date.getTime() < _fldnew + _fldfor * 1000L;)
            {
                date = new Date(System.currentTimeMillis());
                try
                {
                    Thread.sleep(1000L);
                }
                catch(Exception exception) { }
            }

            String s = "";
            try
            {
                String s1;
                if((s1 = getParameter("room0")) != null)
                    s = s + "r0=" + b.a(s1.getBytes("UTF8"));
                else
                if((s1 = getParameter("room1")) != null)
                    s = s + "r1=" + b.a(s1.getBytes("UTF8"));
                if((s1 = getParameter("res")) != null)
                    s = s + "&r=" + s1;
                if((s1 = getParameter("mode")) != null)
                    s = s + "&m=" + s1;
                if((s1 = getParameter("prefs")) != null)
                    s = s + "&p=" + b.a(s1.getBytes("UTF8"));
            }
            catch(Exception exception1) { }
            try
            {
                AppletContext appletcontext = getAppletContext();
                appletcontext.showDocument(new URL("http://" + getDocumentBase().getHost() + a + "?" + s), "chat");
            }
            catch(MalformedURLException malformedurlexception)
            {
                System.err.println("malformed URL");
            }
        } else
        {
            _fldif = new b(this);
            _fldif._mthtry();
        }
    }

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
