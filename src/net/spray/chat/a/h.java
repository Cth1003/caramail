// osef aussi


package net.spray.chat.a;


public class h
{

    public h(int i, int j, int k)
    {
        a = new String[i * j];
        _fldint = new boolean[i * j];
        int l = i * j;
        int i1 = 0;
        for(int j1 = 0; j1 < l / 10; j1++)
        {
            for(int k1 = 0; k1 < 10; k1++)
            {
                a[i1] = new String("@" + j1 + "" + k1);
                int l1 = i1 / 20;
                if((1 << l1 & k) != 0)
                    _fldint[i1] = true;
                i1++;
            }

        }

    }

    public h(h h1)
    {
        a = h1.a();
    }

    public String[] a()
    {
        return a;
    }

    public String _mthif(int i)
    {
        return a[i];
    }

    public boolean a(int i)
    {
        return _fldint[i];
    }

    private String a[];
    private boolean _fldint[];
    private int _flddo;
    public static String _fldfor = "0";
    public static String _fldnew = "1";
    public static String _fldif = "2";

}
