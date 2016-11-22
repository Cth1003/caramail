// osef aussi


package net.spray.chat.a;


public class e
{

    public e(int i, int j, int k, int l)
    {
        _fldfor = i;
        _fldif = j;
        _flddo = k;
        _fldint = l;
        a = new int[_flddo + 1];
        _fldnew = new int[_fldint + 1];
        for(int i1 = 0; i1 < _flddo + 1; i1++)
            a[i1] = i1 * (_fldfor / _flddo);

        for(int j1 = 0; j1 < _fldint + 1; j1++)
            _fldnew[j1] = j1 * (_fldif / _fldint);

    }

    public e(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        int i2 = k * l;
        _fldfor = i;
        _fldif = j;
        _flddo = _fldfor / (k1 + 6);
        _fldint = i2 / _flddo;
        if(i2 % _flddo != 0)
            _fldint++;
        a = new int[_flddo + 1];
        _fldnew = new int[_fldint + 1];
        for(int j2 = 0; j2 < _flddo + 1; j2++)
            a[j2] = j2 * (k1 + 6) + i1;

        for(int k2 = 0; k2 < _fldint + 1; k2++)
            _fldnew[k2] = k2 * (l1 + 4) + j1;

    }

    public int _mthif(int i)
    {
        return a[i];
    }

    public int a(int i)
    {
        return _fldnew[i];
    }

    public void _mthif(int i, int j)
    {
        a[i] = j;
    }

    public void a(int i, int j)
    {
        _fldnew[i] = j;
    }

    public int _mthfor(int i)
    {
        int j = -1;
        for(int k = 0; k < _flddo; k++)
            if(a[k] < i && i < a[k + 1])
                j = k;

        return j;
    }

    public int _mthdo(int i)
    {
        int j = -1;
        for(int k = 0; k < _fldint; k++)
            if(_fldnew[k] < i && i < _fldnew[k + 1])
                j = k;

        return j;
    }

    public int a()
    {
        return _fldfor / _flddo;
    }

    public int _mthfor()
    {
        return _fldif / _fldint;
    }

    public int _mthif()
    {
        return _fldint;
    }

    public int _mthdo()
    {
        return _flddo;
    }

    private int a[];
    private int _fldnew[];
    private int _fldfor;
    private int _fldif;
    private int _flddo;
    private int _fldint;
}
