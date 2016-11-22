// osef aussi


package net.spray.chat.a;

import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;

public class f extends Canvas
{

    public f(Image image, int i, int j, int k)
    {
        _flddo = null;
        a = null;
        _fldfor = null;
        _fldif = null;
        _fldif = image;
        width = i;
        height = j;
        _fldint = k;
    }

    public void _mthif(int i)
    {
        _flddo = new ImageFilter[_fldint];
        a = new ImageProducer[_fldint];
        _fldfor = new Image[_fldint];
        try
        {
            for(int j = 0; j < _fldint; j++)
            {
                _flddo[j] = new CropImageFilter(i * j, 0, width, height);
                a[j] = new FilteredImageSource(_fldif.getSource(), _flddo[j]);
                _fldfor[j] = createImage(a[j]);
            }

        }
        catch(Exception exception)
        {
            System.out.println("Exception" + exception);
        }
    }

    public void _mthdo(int i)
    {
        _flddo = new ImageFilter[_fldint];
        a = new ImageProducer[_fldint];
        _fldfor = new Image[_fldint];
        try
        {
            for(int j = 0; j < _fldint; j++)
            {
                _flddo[j] = new CropImageFilter(0, j * i, width, height);
                a[j] = new FilteredImageSource(_fldif.getSource(), _flddo[j]);
                _fldfor[j] = createImage(a[j]);
            }

        }
        catch(Exception exception)
        {
            System.out.println("Exception" + exception);
        }
    }

    public Image a(int i, int j, int k, int l)
    {
        _flddo = new ImageFilter[1];
        a = new ImageProducer[1];
        _fldfor = new Image[1];
        try
        {
            _flddo[0] = new CropImageFilter(i, j, k, l);
            a[0] = new FilteredImageSource(_fldif.getSource(), _flddo[0]);
            _fldfor[0] = createImage(a[0]);
        }
        catch(Exception exception)
        {
            System.out.println("Exception" + exception);
        }
        return _fldfor[0];
    }

    public Image a(int i)
    {
        return _fldfor[i];
    }

    private ImageFilter _flddo[];
    private ImageProducer a[];
    private Image _fldfor[];
    private Image _fldif;
    private int _fldint;
    private int width;
    private int height;
}
