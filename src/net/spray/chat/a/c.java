// osef aussi


package net.spray.chat.a;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.PrintStream;

//tiktamar ok

public class c extends Canvas
{

    public c(j j1, int k, Applet applet)
    {
        _fldif = null;
        g = "";
        b = false;
        _fldint = 0;
        _fldfor = 0;
        _fldnew = 24;
        h = 0;
        _fldbyte = 0;
        i = 0;
        _fldtry = -1;
        _fldtry = k;
        _fldchar = applet;
        if(j1 != null)
        {
            _flddo = j1;
            _flddo.a(0, 0, 0, 0);
            _flddo.a(1);
            _flddo._mthif(1);
        }
        setVisible(true);
    }

    public void a()
    {
        _mthint();
    }

    private synchronized boolean _mthint()
    {
        if(j == null)
        {
            Image image = _fldchar.getImage(_fldchar.getCodeBase(), "smiley.gif");
            MediaTracker mediatracker = new MediaTracker(this);
            mediatracker.addImage(image, 1);
            try
            {
                mediatracker.waitForID(1);
            }
            catch(InterruptedException interruptedexception)
            {
                return false;
            }
            if(mediatracker.isErrorID(1))
                return false;
            int k;
            int l;
            do
            {
                k = image.getWidth(null);
                l = image.getHeight(null);
            } while(k == -1 || l == -1);
            int ai[] = new int[k * l];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, k, l, ai, 0, k);
            try
            {
                pixelgrabber.grabPixels();
            }
            catch(InterruptedException interruptedexception1)
            {
                System.out.println("caught interrupted exception");
            }
            j = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(k, l, ai, 0, k));
            mediatracker.removeImage(image, 1);
            mediatracker = null;
            image = null;
            _fldgoto = j.getHeight(this) / 20;
            _fldcase = j.getWidth(this) / 32;
            f = new h(_fldgoto, _fldcase, _fldtry);
            f f1 = new f(j, 640, 20, _fldgoto);
            f1._mthdo(20);
            _fldlong = new Image[_fldgoto];
            _fldvoid = new Image[_fldgoto * _fldcase];
            e = new Image[_fldgoto * _fldcase];
            for(int i1 = 0; i1 < _fldgoto; i1++)
            {
                _fldlong[i1] = f1.a(i1);
                for(int j1 = 0; j1 < _fldcase; j1++)
                {
                    f f2 = new f(_fldlong[i1], 32, 20, _fldcase);
                    f2._mthif(32);
                    e[i1 * _fldcase + j1] = f2.a(j1);
                }

                if((_fldtry & 1 << i1) == 0)
                    _fldlong[i1] = a(_fldlong[i1], 640, 20);
                for(int k1 = 0; k1 < _fldcase; k1++)
                {
                    f f3 = new f(_fldlong[i1], 32, 20, _fldcase);
                    f3._mthif(32);
                    _fldvoid[i1 * _fldcase + k1] = f3.a(k1);
                }

            }

        }
        repaint();
        return true;
    }

    public int a(int k)
    {
        int l = k & 0xff000000;
        int i1 = k >> 16 & 0xff;
        int j1 = k >> 8 & 0xff;
        int k1 = k & 0xff;
        k = (i1 + j1 + k1) / 3;
        return l | k << 16 | k << 8 | k;
    }

    private Image a(Image image, int k, int l)
    {
        d = new int[k * l];
        c = new MemoryImageSource(k, l, d, 0, k);
        PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, k, l, d, 0, k);
        try
        {
            pixelgrabber.grabPixels();
        }
        catch(Exception exception) { }
        for(int i1 = 0; i1 < d.length; i1++)
            d[i1] = a(d[i1]);

        return createImage(c);
    }

    public Image[] _mthdo()
    {
        if(j != null)
            return e;
        else
            return null;
    }

    public synchronized void paint(Graphics g1)
    {
        Dimension dimension = getSize();
        if(_fldnull == null || _fldnull.getWidth(this) < dimension.width || _fldnull.getHeight(this) < dimension.height)
            _fldnull = createImage(dimension.width, dimension.height);
        if(_fldnull == null)
            return;
        Graphics g2 = _fldnull.getGraphics();
        g2.clearRect(0, 0, dimension.width, dimension.height);
        int k = dimension.height;
        int l = dimension.width;
        if(g2 != null)
        {
            _fldif = new e(l - 2, k - 2, _fldcase, _fldgoto, 1, 1, 32, 20);
            g2.setColor(Color.white);
            g2.fillRect(1, 1, l - 2, k - 2);
            _fldbyte = _fldif._mthif();
            i = (k - 2) / _fldnew;
            _mthnew();
            for(int i1 = h; i1 < _fldif._mthif(); i1++)
            {
                for(int j1 = 0; j1 < _fldif._mthdo(); j1++)
                    if(i1 <= (i + h) - 1 && j1 + i1 * _fldif._mthdo() < _fldgoto * _fldcase)
                        g2.drawImage(_fldvoid[j1 + i1 * _fldif._mthdo()], _fldif._mthif(j1) + 3, (_fldif.a(i1) - h * _fldnew) + 2, 32, 20, this);

            }

            int k1 = 0;
            int l1 = 0;
            int i2 = l;
            int j2 = k;
            g2.setColor(Color.gray);
            g2.drawLine(k1, l1, k1, j2 - 1);
            g2.drawLine(k1, l1, i2 - 1, l1);
            g2.drawLine(k1, j2 - 1, i2 - 1, j2 - 1);
            g2.drawLine(i2 - 1, l1 + 1, i2 - 1, j2);
        }
        if(g1 != null)
            g1.drawImage(_fldnull, 0, 0, this);
    }

    public void _mthfor()
    {
        _mthnew();
        repaint();
    }

    public void _mthbyte()
    {
        if(_flddo != null)
            h = _flddo._mthnew();
        repaint();
    }

    private void _mthnew()
    {
        if(h < 0)
            h = 0;
        if(_flddo != null)
            _flddo.a(h, i, 0, _fldbyte - i);
    }

    public void update(Graphics g1)
    {
        paint(g1);
    }

    public boolean mouseDown(Event event, int k, int l)
    {
        _fldint = _fldif._mthfor(k);
        _fldfor = _fldif._mthdo(l);
        if(_fldint != -1 && _fldfor != -1)
        {
            _fldfor += h;
            int i1 = _fldint + _fldif._mthdo() * _fldfor;
            if(i1 < _fldgoto * _fldcase)
            {
                g = f._mthif(i1);
                b = f.a(i1);
                postEvent(new Event(this, 1001, ""));
            }
        }
        return true;
    }

    public String _mthif()
    {
        String s = "";
        if(!g.equals(""))
        {
            s = g;
            g = "";
        } else
        {
            return null;
        }
        return s;
    }

    public boolean _mthtry()
    {
        return b;
    }

    public boolean mouseMove(Event event, int k, int l)
    {
        _fldint = _fldif._mthfor(k);
        _fldfor = _fldif._mthdo(l);
        if(_fldint != -1 && _fldfor != -1)
        {
            _fldfor += h;
            int i1 = _fldint + _fldif._mthdo() * _fldfor;
            if(i1 < _fldgoto * _fldcase)
                setCursor(new Cursor(12));
            else
                setCursor(new Cursor(0));
        } else
        {
            setCursor(new Cursor(0));
        }
        return true;
    }

    public boolean mouseExit(Event event, int k, int l)
    {
        setCursor(new Cursor(0));
        return true;
    }

    public void addNotify()
    {
        super.addNotify();
    }

    public Dimension minimumSize()
    {
        return new Dimension(167, 100);
    }

    public Dimension preferredSize()
    {
        return new Dimension(167, 100);
    }

    private e _fldif;
    private final int _fldelse = 167;
    private final int a = 100;
    private static h f = null;
    private String g;
    private boolean b;
    private Image _fldnull;
    private static Image j = null;
    private static Image _fldvoid[];
    private static Image e[];
    private static Image _fldlong[];
    private int _fldint;
    private int _fldfor;
    private Applet _fldchar;
    private static int _fldgoto = 0;
    private static int _fldcase = 0;
    private int _fldnew;
    private int h;
    private int _fldbyte;
    private int i;
    private j _flddo;
    private int d[];
    private MemoryImageSource c;
    private int _fldtry;

}
