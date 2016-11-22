// osef

package net.spray.chat.a;

import java.awt.*;

public class a extends Panel
{

    public a()
    {
        _fldint = false;
        a = new Insets(16, 6, 6, 6);
        _fldfor = true;
        _fldif = "";
        _fldint = false;
        _flddo = new Font("Helvetica", 0, 12);
    }

    public a(String s)
    {
        _fldint = false;
        a = new Insets(16, 6, 6, 6);
        _fldfor = true;
        _fldif = s;
        _fldint = true;
        _flddo = new Font("Helvetica", 0, 12);
    }

    public void addNotify()
    {
        super.addNotify();
    }

    public String a()
    {
        return _fldif;
    }

    public void a(String s)
    {
        _fldif = s;
        _fldint = true;
    }

    public Insets insets()
    {
        return a;
    }

    public void a(Insets insets1)
    {
        a = insets1;
    }

    public void paint(Graphics g)
    {
        if(_fldint)
            a(g);
        else
            _mthif(g);
    }

    public void setFont(Font font)
    {
        _flddo = font;
    }

    public Font getFont()
    {
        return _flddo;
    }

    protected void a(Graphics g)
    {
        super.paint(g);
        if(_fldfor && _flddo != null)
        {
            FontMetrics fontmetrics = getFontMetrics(_flddo);
            g.setFont(_flddo);
            int i = 0;
            int j = fontmetrics.getAscent() - 5;
            int k = size().width - 1;
            int l = size().height - 1;
            g.clearRect(location().x, location().y, size().width, size().height);
            g.setColor(Color.gray);
            g.drawLine(i, j, i, l - 1);
            g.drawLine(i, j, k - 1, j);
            g.setColor(Color.white);
            g.drawLine(i + 1, j + 1, i + 1, l - 2);
            g.drawLine(i + 1, j + 1, k - 3, j + 1);
            g.setColor(Color.gray);
            g.drawLine(i, l - 1, k - 1, l - 1);
            g.drawLine(k - 1, j + 2, k - 1, l);
            g.setColor(Color.white);
            g.drawLine(i, l, k, l);
            g.drawLine(k, j, k, l);
            g.clearRect(10, j, fontmetrics.stringWidth(_fldif) + 4, 4);
            g.setColor(Color.black);
            g.drawString(_fldif, 12, fontmetrics.getHeight() - fontmetrics.getDescent());
        }
    }

    protected void _mthif(Graphics g)
    {
        super.paint(g);
        if(_fldfor && _flddo != null)
        {
            FontMetrics fontmetrics = getFontMetrics(_flddo);
            int i = 0;
            int j = fontmetrics.getAscent() - 5;
            int k = size().width - 1;
            int l = size().height - 1;
            g.clearRect(location().x, location().y, size().width, size().height);
            g.setColor(Color.gray);
            g.drawLine(i, j, i, l - 1);
            g.drawLine(i, j, k - 1, j);
            g.setColor(Color.white);
            g.drawLine(i + 1, j + 1, i + 1, l - 2);
            g.drawLine(i + 1, j + 1, k - 3, j + 1);
            g.setColor(Color.gray);
            g.drawLine(i, l - 1, k - 1, l - 1);
            g.drawLine(k - 1, j + 2, k - 1, l);
            g.setColor(Color.white);
            g.drawLine(i, l, k, l);
            g.drawLine(k, j, k, l);
        }
    }

    public void a(boolean flag)
    {
        _fldfor = flag;
    }

    protected String _fldif;
    protected boolean _fldint;
    protected Insets a;
    protected Font _flddo;
    private boolean _fldfor;
}
