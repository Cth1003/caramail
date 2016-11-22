// osef aussi


package net.spray.chat.a;

import java.awt.*;

public class i extends Canvas
{

    public i(Color color)
    {
        b = 0;
        _fldvoid = 0;
        _fldelse = true;
        i = new Color(192, 192, 192);
        m = color;
        _fldnull = 64;
        h = 32;
        _fldint = 16;
        o = 0;
        _fldbyte = 0;
        n = size().width - 1 - (_fldint + 8 + 1);
        _fldnew = _fldnull + 1;
        k = size().width - 1 - (_fldint + 1);
        _fldfor = 0;
        j = size().width - 1;
        _fldif = _fldnull + 1;
        d = 64;
        g = 128;
        l = 0.0F;
        f = 0.0F;
        p = 1.0F;
    }

    public void paint(Graphics g1)
    {
        o = 0;
        _fldbyte = 0;
        n = size().width - 1 - (_fldint + 8 + 1);
        _fldnew = _fldnull + 1;
        k = size().width - 1 - (_fldint + 1);
        _fldfor = 0;
        j = size().width - 1;
        _fldif = _fldnull + 1;
        if(_fldelse || _fldgoto == null || _fldgoto.getWidth(this) != size().width || _fldgoto.getHeight(this) != size().height)
        {
            d = size().width - 2 - (_fldint + 8 + 2);
            g = 64;
            _fldelse = false;
            a = createImage(size().width - 1 - (_fldint + 8 + 1) - 1, _fldnull);
            _fldlong = a.getGraphics();
            for(int i1 = 0; i1 < d; i1++)
            {
                for(int k1 = 0; k1 < g; k1++)
                {
                    l = (float)((double)(d - i1) / (double)d);
                    f = (float)((double)k1 / (double)g);
                    int l1 = Color.HSBtoRGB(l, f, p);
                    _fldlong.setColor(new Color(l1));
                    _fldlong.fillRect(i1, k1, 1, 1);
                }

            }

            _fldgoto = createImage(size().width, size().height);
            _flddo = _fldgoto.getGraphics();
        }
        if(o < b && b < n && _fldbyte < _fldvoid && _fldvoid < _fldnew)
        {
            _flddo.setColor(i);
            _flddo.fillRect(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - (_fldnull + 8 + 1 + 1));
            _flddo.setColor(m);
            _flddo.fillRect(size().width / 2 + 4 + 1, _fldnull + 8 + 1 + 1, size().width - 1 - (size().width / 2 + 4) - 1, size().height - 1 - (_fldnull + 8 + 1) - 1);
        } else
        {
            _flddo.setColor(Color.gray);
            _flddo.drawLine(0, 0, size().width - 1 - (_fldint + 8), 0);
            _flddo.drawLine(0, 0, 0, _fldnull + 1);
            _flddo.setColor(Color.white);
            _flddo.drawLine(1, _fldnull + 1, size().width - 1 - (_fldint + 8 + 2), _fldnull + 1);
            _flddo.drawLine(size().width - 1 - (_fldint + 8 + 2), 1, size().width - 1 - (_fldint + 8 + 2), _fldnull + 1);
            _flddo.drawImage(a, 1, 1, d, _fldnull, this);
            _flddo.setColor(Color.gray);
            _flddo.drawLine(size().width - 1 - (_fldint + 1), 0, size().width - 1, 0);
            _flddo.drawLine(size().width - 1 - (_fldint + 1), 0, size().width - 1 - (_fldint + 1), _fldnull + 1);
            _flddo.setColor(Color.white);
            _flddo.drawLine(size().width - 1 - _fldint, _fldnull + 1, size().width - 1, _fldnull + 1);
            _flddo.drawLine(size().width - 1, 1, size().width - 1, _fldnull + 1);
            for(int j1 = 1; j1 <= 8; j1++)
            {
                int i2 = Color.HSBtoRGB(0.0F, 0.0F, (float)((double)(9 - j1) / 8D));
                _flddo.setColor(new Color(i2));
                _flddo.fillRect(size().width - 1 - _fldint, 8 * (j1 - 1) + 1, _fldint, 8);
            }

            _flddo.setColor(Color.gray);
            _flddo.drawLine(0, _fldnull + 8 + 1, size().width / 2 - 4, _fldnull + 8 + 1);
            _flddo.drawLine(0, _fldnull + 8 + 1, 0, size().height - 1);
            _flddo.setColor(Color.white);
            _flddo.drawLine(1, size().height - 1, size().width / 2 - 4, size().height - 1);
            _flddo.drawLine(size().width / 2 - 4, _fldnull + 8 + 1 + 1, size().width / 2 - 4, size().height - 1);
            _flddo.setColor(i);
            _flddo.fillRect(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - (_fldnull + 8 + 1 + 1));
            _flddo.setColor(Color.black);
            _flddo.drawLine(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - 1);
            _flddo.drawLine(1, size().height - 1 - 1, size().width / 2 - 4 - 1, _fldnull + 8 + 1 + 1);
            _flddo.setColor(Color.gray);
            _flddo.drawLine(size().width / 2 + 4, _fldnull + 8 + 1, size().width - 1, _fldnull + 8 + 1);
            _flddo.drawLine(size().width / 2 + 4, _fldnull + 8 + 1, size().width / 2 + 4, size().height - 1);
            _flddo.setColor(Color.white);
            _flddo.drawLine(size().width / 2 + 4 + 1, size().height - 1, size().width - 1, size().height - 1);
            _flddo.drawLine(size().width - 1, _fldnull + 8 + 1 + 1, size().width - 1, size().height - 1);
            _flddo.setColor(m);
            _flddo.fillRect(size().width / 2 + 4 + 1, _fldnull + 8 + 1 + 1, size().width - 1 - (size().width / 2 + 4) - 1, size().height - 1 - (_fldnull + 8 + 1) - 1);
        }
        g1.drawImage(_fldgoto, 0, 0, this);
        g1.setColor(Color.lightGray);
    }

    public boolean mouseExit(Event event, int i1, int j1)
    {
        b = 0;
        _fldvoid = 0;
        i = new Color(192, 192, 192);
        repaint(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - (_fldnull + 8 + 1 + 1));
        return true;
    }

    public boolean mouseMove(Event event, int i1, int j1)
    {
        b = i1;
        _fldvoid = j1;
        if(o < i1 && i1 < n && _fldbyte < j1 && j1 < _fldnew)
        {
            l = (float)((double)(d - i1) / (double)d);
            f = (float)((double)j1 / (double)g);
            i = new Color(Color.HSBtoRGB(l, f, p));
            setCursor(Cursor.getPredefinedCursor(12));
            repaint(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - (_fldnull + 8 + 1 + 1));
        } else
        if(k < i1 && i1 < j && _fldfor < j1 && j1 < _fldif)
        {
            setCursor(Cursor.getPredefinedCursor(12));
        } else
        {
            setCursor(Cursor.getPredefinedCursor(0));
            i = new Color(192, 192, 192);
            repaint(1, _fldnull + 8 + 1 + 1, size().width / 2 - 4 - 1, size().height - 1 - (_fldnull + 8 + 1 + 1));
        }
        return true;
    }

    public boolean mouseDown(Event event, int i1, int j1)
    {
        b = i1;
        _fldvoid = j1;
        if(o < i1 && i1 < n && _fldbyte < j1 && j1 < _fldnew)
        {
            l = (float)((double)(d - i1) / (double)d);
            f = (float)((double)j1 / (double)g);
            m = new Color(Color.HSBtoRGB(l, f, p));
            repaint(size().width / 2 + 4 + 1, _fldnull + 8 + 1 + 1, size().width - 1 - (size().width / 2 + 4) - 1, size().height - 1 - (_fldnull + 8 + 1) - 1);
        } else
        if(k < i1 && i1 < j && _fldfor < j1 && j1 < _fldif)
        {
            float f1 = (float)((double)(9 - ((j1 - 1) / 8 + 1)) / 8D);
            if(f1 != p)
            {
                p = f1;
                _fldelse = true;
                repaint();
            }
        }
        return true;
    }

    public Color a()
    {
        return m;
    }

    public void a(Color color)
    {
        b = 0;
        _fldvoid = 0;
        _fldelse = true;
        setBackground(color);
        repaint();
    }

    public void update(Graphics g1)
    {
        paint(g1);
    }

    private Color c;
    private int _fldcase;
    private int _fldtry;
    private int _fldchar;
    private int e;
    private int o;
    private int n;
    private int _fldbyte;
    private int _fldnew;
    private int k;
    private int j;
    private int _fldfor;
    private int _fldif;
    private int b;
    private int _fldvoid;
    private int _fldnull;
    private int h;
    private int _fldint;
    private int d;
    private int g;
    private Image _fldgoto;
    private Image a;
    private Graphics _fldlong;
    private Graphics _flddo;
    private Color i;
    private Color m;
    private float l;
    private float f;
    private float p;
    private boolean _fldelse;
}
