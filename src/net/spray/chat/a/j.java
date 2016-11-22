// osef aussi


package net.spray.chat.a;

import java.awt.*;

public class j extends Canvas
    implements Runnable
{

    public j()
    {
        this(1, 0, 1, 0, 0);
    }

    public j(int i1)
    {
        this(i1, 0, 1, 0, 0);
    }

    public j(int i1, int j1, int k1, int l1, int i2)
    {
        _fldelse = 0;
        _fldnew = 1;
        r = 1;
        q = 10;
        i = 0;
        visible = 1;
        _fldchar = true;
        b = true;
        m = true;
        e = 0;
        _fldfor = 0;
        g = 0;
        d = 0;
        _fldtry = 1;
        l = 0;
        _fldcase = 0;
        f = null;
        _fldif = null;
        _fldnew = i1;
        a(j1, k1, l1, i2);
        setForeground(Color.lightGray);
    }

    public void a(Color color)
    {
        setForeground(color);
    }

    public int _mthint()
    {
        return r;
    }

    public int _mthbyte()
    {
        return n;
    }

    public int _mthdo()
    {
        return h;
    }

    public int _mthcase()
    {
        return _fldnew;
    }

    public int a()
    {
        return q;
    }

    public int _mthnew()
    {
        return i;
    }

    public int _mthfor()
    {
        return visible;
    }

    public void a(int i1)
    {
        if(i1 < 0)
            i1 = 0;
        r = i1;
    }

    public void _mthif(int i1)
    {
        if(i1 < 0)
            i1 = 0;
        q = i1;
    }

    public void _mthdo(int i1)
    {
        if(i1 < h)
            i1 = h;
        if(i1 > n)
            i1 = n;
        i = i1;
        repaint();
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        if(j1 < 0)
            j1 = 0;
        visible = j1;
        if(l1 < k1)
            l1 = k1;
        h = k1;
        n = l1;
        if(i1 < k1)
            i1 = k1;
        if(i1 > l1)
            i1 = l1;
        i = i1;
        repaint();
    }

    public void update(Graphics g1)
    {
        paint(g1);
    }

    public void paint(Graphics g1)
    {
        if(_fldif == null)
        {
            f = createImage(size().width, size().height);
            _fldif = f.getGraphics();
        }
        a(_fldif);
        g1.drawImage(f, 0, 0, this);
    }

    public void a(Graphics g1)
    {
        int i1 = size().width;
        int j1 = size().height;
        Color color = getForeground();
        g1.setColor(color.darker());
        g1.fill3DRect(0, 0, i1, j1, false);
        g1.setColor(color);
        switch(_fldnew)
        {
        case 1: // '\001'
            a(0, 0, g1, color, 0, _fldchar);
            a(0, j1 - 13, g1, color, 3, b);
            break;

        case 0: // '\0'
            a(0, 0, g1, color, 1, _fldchar);
            a(i1 - 13 - 2, 0, g1, color, 2, b);
            break;
        }
        g1.setColor(color);
        int k1 = (n - h) + visible;
        switch(_fldnew)
        {
        default:
            break;

        case 1: // '\001'
            int l1 = j1 - 26;
            if(k1 == 0)
            {
                e = 13;
                _fldfor = l1;
            } else
            {
                e = 13 + ((i - h) * l1) / k1;
                _fldfor = (visible * l1) / k1;
            }
            if(_fldfor < 4)
                _fldfor = 4;
            if(e > j1 - 13 - 4)
            {
                e = j1 - 13 - 4;
                if(e < 13)
                    e = 13;
            }
            a(0, e, 13, _fldfor, m, g1, color);
            break;

        case 0: // '\0'
            int i2 = i1 - 26;
            if(k1 == 0)
            {
                e = 13;
                _fldfor = i2;
            } else
            {
                e = 13 + ((i - h) * i2) / k1;
                _fldfor = (visible * i2) / k1;
            }
            if(_fldfor < 4)
                _fldfor = 4;
            if(e > i1 - 13 - 4)
            {
                e = i1 - 13 - 4;
                if(e < 13)
                    e = 13;
            }
            a(e, 0, _fldfor, 13, m, g1, color);
            break;
        }
    }

    public boolean mouseDown(Event event, int i1, int j1)
    {
        switch(_fldnew)
        {
        default:
            break;

        case 1: // '\001'
            if(j1 < 13)
            {
                i -= r;
                if(i < h)
                    i = h;
                _fldchar = false;
                repaint();
                postEvent(new Event(this, 601, new Integer(i)));
                _fldelse = 1;
                _mthtry();
                break;
            }
            if(j1 > size().height - 13)
            {
                i += r;
                if(i > n)
                    i = n;
                b = false;
                repaint();
                postEvent(new Event(this, 602, new Integer(i)));
                _fldelse = 2;
                _mthtry();
                break;
            }
            if(j1 < e)
            {
                _fldtry = 1;
                i -= q;
                if(i < h)
                    i = h;
                repaint();
                postEvent(new Event(this, 603, new Integer(i)));
                break;
            }
            if(j1 >= e + _fldfor)
            {
                _fldtry = 2;
                i += q;
                if(i > n)
                    i = n;
                repaint();
                postEvent(new Event(this, 604, new Integer(i)));
            } else
            {
                l = j1;
                _fldcase = e;
                m = false;
                _fldtry = 4;
                repaint();
            }
            break;

        case 0: // '\0'
            if(i1 < 13)
            {
                i -= r;
                if(i < h)
                    i = h;
                _fldchar = false;
                repaint();
                postEvent(new Event(this, 601, new Integer(i)));
                _fldelse = 1;
                _mthtry();
                break;
            }
            if(i1 > size().width - 13)
            {
                i += r;
                if(i > n)
                    i = n;
                b = false;
                repaint();
                postEvent(new Event(this, 602, new Integer(i)));
                _fldelse = 2;
                _mthtry();
                break;
            }
            if(i1 < e)
            {
                _fldtry = 1;
                i -= q;
                if(i < h)
                    i = h;
                repaint();
                postEvent(new Event(this, 603, new Integer(i)));
                break;
            }
            if(i1 >= e + _fldfor)
            {
                _fldtry = 2;
                i += q;
                if(i > n)
                    i = n;
                repaint();
                postEvent(new Event(this, 604, new Integer(i)));
            } else
            {
                l = i1;
                _fldcase = e;
                m = false;
                _fldtry = 4;
                repaint();
            }
            break;
        }
        g = i1;
        d = j1;
        return false;
    }

    public boolean mouseUp(Event event, int i1, int j1)
    {
        b = true;
        _fldchar = true;
        m = true;
        _fldtry = 0;
        repaint();
        g = i1;
        d = j1;
        _mthif();
        return false;
    }

    public boolean mouseEnter(Event event, int i1, int j1)
    {
        g = i1;
        d = j1;
        if(a(i1, j1) || _mthif(i1, j1))
            repaint();
        return false;
    }

    public boolean mouseExit(Event event, int i1, int j1)
    {
        if(a(g, d) || _mthif(g, d))
            repaint();
        g = i1;
        d = j1;
        return false;
    }

    public boolean mouseDrag(Event event, int i1, int j1)
    {
        if(a(i1, j1) != a(g, d) || _mthif(i1, j1) != _mthif(g, d))
            repaint();
        switch(_fldnew)
        {
        default:
            break;

        case 1: // '\001'
            if(!m)
            {
                int k1 = (j1 - l) + _fldcase;
                int i2 = size().height - _fldfor - 13;
                if(i2 == 13)
                    return false;
                if(k1 < 13)
                    k1 = 13;
                else
                if(k1 > i2)
                    k1 = i2;
                i = ((k1 - 13) * (n - h)) / (i2 - 13) + h;
                repaint();
                postEvent(new Event(this, 605, new Integer(i)));
            }
            break;

        case 0: // '\0'
            if(m)
                break;
            int l1 = (i1 - l) + _fldcase;
            int j2 = size().width - _fldfor - 13;
            if(j2 == 13)
                return false;
            if(l1 < 13)
                l1 = 13;
            else
            if(l1 > j2)
                l1 = j2;
            i = ((l1 - 13) * (n - h)) / (j2 - 13) + h;
            repaint();
            postEvent(new Event(this, 605, new Integer(i)));
            break;
        }
        g = i1;
        d = j1;
        return false;
    }

    final boolean a(int i1, int j1)
    {
        switch(_fldnew)
        {
        case 1: // '\001'
            return i1 > -1 && j1 > -1 && i1 < size().width && j1 < 13;

        case 0: // '\0'
            return i1 > -1 && j1 > -1 && j1 < size().height && i1 < 13;
        }
        return false;
    }

    final boolean _mthif(int i1, int j1)
    {
        switch(_fldnew)
        {
        case 1: // '\001'
            return i1 > -1 && j1 > size().height - 13 && i1 < size().width && j1 < size().height;

        case 0: // '\0'
            return j1 > -1 && i1 > size().width - 13 && j1 < size().height && i1 < size().width;
        }
        return false;
    }

    public void reshape(int i1, int j1, int k1, int l1)
    {
        super.reshape(i1, j1, k1, l1);
        if(k1 > 0 && l1 > 0)
        {
            f = createImage(k1, l1);
            if(f != null)
                _fldif = f.getGraphics();
            repaint();
        }
    }

    public Dimension preferredSize()
    {
        switch(_fldnew)
        {
        case 1: // '\001'
            return new Dimension(15, 100);
        }
        return new Dimension(100, 15);
    }

    public Dimension minimumSize()
    {
        switch(_fldnew)
        {
        case 1: // '\001'
            return new Dimension(5, 50);
        }
        return new Dimension(50, 5);
    }

    private void a(int i1, int j1, int k1, int l1, boolean flag, Graphics g1, Color color)
    {
        int i2 = (i1 + k1) - 1;
        int j2 = (j1 + l1) - 1;
        if(flag)
        {
            g1.setColor(color);
            g1.fillRect(i1, j1, k1 - 1, l1);
            g1.setColor(Color.black);
            g1.drawLine(i1, j2, i2, j2);
            g1.drawLine(i2, j1, i2, j2);
            g1.setColor(color.brighter());
            g1.drawLine(i1 + 1, j1 + 1, i1 + 1, j2 - 2);
            g1.drawLine(i1 + 1, j1 + 1, i2 - 2, j1 + 1);
            g1.setColor(color.darker());
            g1.drawLine(i2 - 1, j2 - 1, i2 - 1, j1 + 1);
            g1.drawLine(i2 - 1, j2 - 1, i1 + 1, j2 - 1);
        } else
        {
            g1.setColor(color.darker());
            g1.fillRect(i1, j1, k1, l1);
            g1.setColor(color);
            g1.fillRect(i1 + 1, j1 + 1, k1 - 2, l1 - 2);
        }
    }

    private void a(int i1, int j1, Graphics g1, Color color, int k1, boolean flag)
    {
        int l1 = i1 + 13;
        int i2 = j1 + 13;
        a(i1, j1, 13, 13, flag, g1, color);
        g1.setColor(Color.black);
        switch(k1)
        {
        case 3: // '\003'
            g1.drawLine(i1 + 4, j1 + 5, i1 + 8, j1 + 5);
            g1.drawLine(i1 + 5, j1 + 6, i1 + 7, j1 + 6);
            g1.drawLine(i1 + 6, j1 + 7, i1 + 6, j1 + 7);
            break;

        case 0: // '\0'
            g1.drawLine(i1 + 4, i2 - 5, i1 + 8, i2 - 5);
            g1.drawLine(i1 + 5, i2 - 6, i1 + 7, i2 - 6);
            g1.drawLine(i1 + 6, i2 - 7, i1 + 6, i2 - 7);
            break;

        case 1: // '\001'
            g1.drawLine(l1 - 5, j1 + 4, l1 - 5, j1 + 8);
            g1.drawLine(l1 - 6, j1 + 5, l1 - 6, j1 + 7);
            g1.drawLine(l1 - 7, j1 + 6, l1 - 7, j1 + 6);
            break;

        case 2: // '\002'
            g1.drawLine(i1 + 5, j1 + 4, i1 + 5, j1 + 8);
            g1.drawLine(i1 + 6, j1 + 5, i1 + 6, j1 + 7);
            g1.drawLine(i1 + 7, j1 + 6, i1 + 7, j1 + 6);
            break;
        }
    }

    public void run()
    {
        while(_fldint != null) 
        {
            try
            {
                j _tmp = this;
                Thread.sleep(100L);
            }
            catch(InterruptedException interruptedexception) { }
            if(_fldelse == 1)
            {
                i -= r;
                if(i < h)
                    i = h;
                _fldchar = false;
                repaint();
                postEvent(new Event(this, 601, new Integer(i)));
            } else
            if(_fldelse == 2)
            {
                i += r;
                if(i > n)
                    i = n;
                b = false;
                repaint();
                postEvent(new Event(this, 602, new Integer(i)));
            }
        }
    }

    public void _mthtry()
    {
        if(_fldint == null)
        {
            _fldint = new Thread(this);
            _fldint.start();
        }
    }

    public void _mthif()
    {
        if(_fldint != null)
        {
            _fldint.stop();
            _fldint = null;
        }
        _fldelse = 0;
    }

    final int _fldnull = 0;
    final int s = 1;
    final int j = 2;
    final int p = 4;
    public static final int k = 1;
    public static final int t = 0;
    static final int _flddo = 0;
    static final int c = 1;
    static final int _fldbyte = 2;
    static final int o = 3;
    static final long _fldvoid = 100L;
    Thread _fldint;
    int _fldelse;
    int _fldnew;
    int r;
    int n;
    int h;
    int q;
    int i;
    int visible;
    static final int a = 13;
    boolean _fldchar;
    boolean b;
    boolean m;
    int e;
    int _fldfor;
    int g;
    int d;
    int _fldtry;
    int l;
    int _fldcase;
    Image f;
    Graphics _fldif;
    static final char _fldgoto[] = {
        '^'
    };
    static final char _fldlong[] = {
        'v'
    };

}
