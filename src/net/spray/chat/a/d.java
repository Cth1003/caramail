// osef aussi

package net.spray.chat.a;

import java.awt.*;

public class d extends Panel
{

    public d()
    {
        n = new Insets(28, 1, 1, 1);
        _fldlong = 32;
        _fldcase = false;
        w = false;
        _fldchar = false;
        q = new Font("Helvetica", 0, 12);
        _fldint = new Font("Helvetica", 1, 12);
        a = getFontMetrics(q);
        _fldbyte = getFontMetrics(_fldint);
        _fldnew = Color.lightGray;
        _fldelse = new Color(240, 200, 0);
        _fldelse = Color.lightGray;
        k = Color.black;
        s = Color.black;
        t = Color.gray;
        f = Color.black;
        p = Color.blue;
        A = Color.white;
        m = new String[20];
        v = new String[20];
        _fldfor = new int[20];
        r = new int[20];
        h = new Color[20];
        c = new Panel[20];
        l = new int[20];
        _fldnull = new int[20];
        _fldgoto = new String[20];
        _fldtry = -1;
        u = 0;
        j = 0;
        o = a.getHeight() + 10;
        g = 0;
        z = 0;
        setBackground(_fldnew);
        setLayout(new BorderLayout(0, 0));
    }

    public void a(Font font, Font font1)
    {
        q = font;
        _fldint = font1;
        a = getFontMetrics(q);
        _fldbyte = getFontMetrics(_fldint);
        o = a.getHeight() + 10;
        w = true;
    }

    public void a()
    {
        f = _fldnew;
        _fldcase = true;
    }

    public void _mthif(Color color)
    {
        f = color;
        _fldcase = true;
    }

    public synchronized void a(String s1, Panel panel, int i1, int j1, String s2)
    {
        a(s1, _fldnew, panel, i1, j1, s2);
        panel.hide();
        add("Center", panel);
        panel.reshape(1, 28, u - 3, j - 30);
        panel.validate();
        a(g);
        repaint();
    }

    public void a(int i1, String as[])
    {
        _fldtry = i1;
        b = as;
    }

    public int _mthif()
    {
        return _fldtry;
    }

    public int _mthdo(String s1, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
            if(m[j1].equals(s1) && l[j1] == i1 && _fldgoto[j1].equals(s2))
                return _fldnull[j1];

        return -1;
    }

    public synchronized void a(String s1, int i1)
    {
        for(int j1 = 0; j1 < z; j1++)
        {
            if(!m[j1].equals(s1))
                continue;
            l[j1] = i1;
            break;
        }

    }

    public synchronized void a(String s1, Color color, Panel panel, int i1, int j1, String s2)
    {
        if(z >= 20)
            return;
        _fldlong = 32;
        m[z] = s1;
        h[z] = color;
        l[z] = i1;
        _fldnull[z] = j1;
        _fldgoto[z] = s2;
        v[z] = s1;
        c[z] = panel;
        z++;
        do
        {
            for(int l1 = 0; l1 < z; l1++)
            {
                String s3 = "";
                if(_fldtry != -1 && _fldnull[l1] != _fldtry && _fldnull[l1] != -1)
                    s3 = "@" + b[_fldnull[l1]];
                if(m[l1].length() > _fldlong && l1 > 0)
                    v[l1] = new String((m[l1] + s3).substring(0, _fldlong - 2) + "..");
                else
                    v[l1] = m[l1] + s3;
                r[l1] = l1 == 0 ? 3 : _fldfor[l1 - 1] + 2;
                int k1 = a.stringWidth(v[l1]);
                if(_fldbyte.stringWidth(v[l1]) > k1)
                    k1 = _fldbyte.stringWidth(v[l1]);
                _fldfor[l1] = l1 == 0 ? 16 + k1 : r[l1] + 16 + k1;
            }

            if(_fldfor[z - 1] >= u)
                _fldlong--;
        } while(_fldfor[z - 1] >= u && _fldlong != 2);
    }

    public void enable()
    {
        _fldchar = true;
        u = -1;
        repaint();
    }

    public void disable()
    {
        _fldchar = false;
        repaint();
    }

    public synchronized void _mthint(String s1, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
        {
            if(!m[j1].equals(s1) || l[j1] != i1 || !_fldgoto[j1].equals(s2))
                continue;
            remove(c[j1]);
            c[j1] = null;
            for(int i2 = j1; i2 < z - 1; i2++)
            {
                h[i2] = h[i2 + 1];
                m[i2] = m[i2 + 1];
                c[i2] = c[i2 + 1];
                l[i2] = l[i2 + 1];
                _fldgoto[i2] = _fldgoto[i2 + 1];
                _fldnull[i2] = _fldnull[i2 + 1];
            }

            break;
        }

        _fldlong = 32;
        int l1 = z - 1;
        z = 0;
        g = 0;
        for(int k1 = 0; k1 < l1; k1++)
            a(m[k1], h[k1], c[k1], l[k1], _fldnull[k1], _fldgoto[k1]);

        repaint();
    }

    public synchronized void a(int i1, String s1)
    {
        if(i1 < z)
            m[i1] = s1;
        else
            return;
        _fldlong = 32;
        int j1 = z;
        z = 0;
        g = 0;
        for(i1 = 0; i1 < j1; i1++)
            a(m[i1], h[i1], c[i1], l[i1], _fldnull[i1], _fldgoto[i1]);

        repaint();
    }

    public synchronized void a(String s1, Color color, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
        {
            if(!m[j1].equals(s1) || l[j1] != i1 || !_fldgoto[j1].equals(s2) || h[j1] == color)
                continue;
            h[j1] = color;
            repaint();
            break;
        }

    }

    public boolean a(String s1, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
            if(m[j1].equals(s1) && l[j1] == i1 && _fldgoto[j1].equals(s2))
                return true;

        return false;
    }

    public synchronized void _mthif(String s1, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
            if(m[j1].equals(s1) && l[j1] == i1 && _fldgoto[j1].equals(s2))
            {
                g = j1;
                h[j1] = _fldelse;
                c[j1].validate();
                c[j1].show();
                postEvent(new Event(this, 1001, m[j1]));
            } else
            {
                c[j1].hide();
            }

        repaint();
    }

    public synchronized void a(int i1)
    {
        if(i1 < z)
            _mthif(m[i1], l[i1], _fldgoto[i1]);
    }

    public String _mthdo()
    {
        return m[g];
    }

    public boolean _mthfor(String s1, int i1, String s2)
    {
        for(int j1 = 0; j1 < z; j1++)
            if(m[j1].equals(s1) && l[j1] == i1 && _fldgoto[j1].equals(s2) && g == j1)
                return true;

        return false;
    }

    private synchronized void a(int i1, Graphics g1)
    {
        if(i1 < 0 || i1 >= z)
            return;
        g1.setFont(g == i1 ? _fldint : q);
        if(i1 == g)
        {
            g1.setColor(A);
            g1.fillRoundRect(r[i1] - 3, 0, (_fldfor[i1] - r[i1]) + 5, o + 3, 3, 3);
            g1.setColor(h[i1]);
            g1.fillRoundRect(r[i1] - 2, 1, (_fldfor[i1] - r[i1]) + 5, o + 2, 3, 3);
            if(_fldcase)
                g1.setColor(Color.gray);
            else
                g1.setColor(s);
            g1.drawLine(_fldfor[i1] + 2, 3, _fldfor[i1] + 2, o + 1);
            g1.drawLine(_fldfor[i1] + 1, 1, _fldfor[i1] + 2, 2);
            g1.setColor(A);
            g1.drawLine(0, o, r[i1] - 3, o);
            g1.drawLine(_fldfor[i1] + 2, o, u, o);
            g1.drawLine(0, o, 0, j - 1);
            if(_fldcase)
            {
                g1.setColor(Color.gray);
                g1.drawLine(0, j - 1, u - 1, j - 1);
                g1.drawLine(u - 1, o, u - 1, j - 1);
            }
        } else
        {
            g1.setColor(A);
            g1.fillRoundRect(r[i1] - 1, 3, (_fldfor[i1] - r[i1]) + 1, o, 3, 3);
            g1.setColor(h[i1]);
            g1.fillRoundRect(r[i1], 4, (_fldfor[i1] - r[i1]) + 1, o - 1, 3, 3);
            if(_fldcase)
                g1.setColor(Color.gray);
            else
                g1.setColor(s);
            g1.drawLine(_fldfor[i1], 5, _fldfor[i1], o + 2);
        }
        if(_fldchar)
            if(i1 == g)
                g1.setColor(p);
            else
                g1.setColor(k);
        if(i1 == g)
            g1.drawString(v[i1], r[i1] + 7, _fldbyte.getAscent() + 5);
        else
            g1.drawString(v[i1], r[i1] + 6, _fldbyte.getAscent() + 6);
    }

    public void update(Graphics g1)
    {
        paint(g1);
    }

    public void paint(Graphics g1)
    {
        Object obj = null;
        if(_fldchar)
        {
            if(w || u != size().width || j != size().height)
            {
                u = size().width;
                j = size().height;
                w = false;
                _fldlong = 32;
                int i1 = z;
                z = 0;
                if(i1 > 0)
                {
                    for(int j1 = 0; j1 < i1; j1++)
                    {
                        a(m[j1], h[j1], c[j1], l[j1], _fldnull[j1], _fldgoto[j1]);
                        c[j1].reshape(1, 28, u - 3, j - 30);
                        c[j1].validate();
                        if(m[j1].equals(_mthdo()))
                        {
                            c[j1].validate();
                            c[j1].show();
                        } else
                        {
                            c[j1].hide();
                        }
                    }

                }
            }
            g1.setColor(f);
            g1.fillRect(0, 0, u, o);
            for(int k1 = 0; k1 < z; k1++)
                if(k1 != g)
                    a(k1, g1);

            a(g, g1);
            c[g].validate();
            g1.setColor(_fldnew);
            g1.fillRect(1, o + 1, u - 2, 2);
        }
    }

    public boolean mouseDown(Event event, int i1, int j1)
    {
        if(j1 < o)
        {
            for(int k1 = 0; k1 < z; k1++)
                if(i1 > r[k1] && i1 < _fldfor[k1] && k1 != g && _fldchar)
                {
                    _mthif(m[k1], l[k1], _fldgoto[k1]);
                    return true;
                }

        }
        return false;
    }

    public Insets insets()
    {
        return n;
    }

    public void addNotify()
    {
        super.addNotify();
    }

    public void a(Color color)
    {
        _fldnew = color;
        _fldelse = color;
        if(_fldcase)
            f = color;
        for(int i1 = 0; i1 < z; i1++)
        {
            c[i1].hide();
            h[i1] = color;
        }

    }

    public Dimension minimumSize()
    {
        return new Dimension(200, 200);
    }

    public Dimension preferredSize()
    {
        return new Dimension(200, 200);
    }

    protected Insets n;
    private Font q;
    private Font _fldint;
    private FontMetrics a;
    private FontMetrics _fldbyte;
    private Panel c[];
    private Color _fldnew;
    private Color _fldelse;
    private Color k;
    private Color p;
    private Color f;
    private Color A;
    private Color s;
    private Color t;
    private Color d;
    private int o;
    private int _fldtry;
    private int u;
    private int j;
    private final int i = 20;
    private int _fldlong;
    private boolean _fldcase;
    private boolean w;
    private String b[];
    private String m[];
    private String v[];
    private int _fldfor[];
    private int r[];
    private Color h[];
    private int z;
    private int l[];
    private int _fldnull[];
    private String _fldgoto[];
    private static final int _fldvoid = 0;
    private static final int e = 1;
    private static final int _flddo = 2;
    private int g;
    private int _fldif;
    private boolean _fldchar;
}
