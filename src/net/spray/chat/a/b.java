// osef aussi
package net.spray.chat.a;

import java.io.PrintStream;
import java.util.Date;
import java.util.StringTokenizer;

public class b
{

    public b()
    {
        _fldfor = false;
        c = new String[12];
        b = false;
        for(int i = 0; i < 12; i++)
            c[i] = "";

    }

    public b(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, boolean flag)
    {
        _fldfor = false;
        c = new String[12];
        b = false;
        _fldvoid = flag;
        c[0] = s;
        c[1] = s1;
        c[2] = s2;
        c[3] = s3;
        c[4] = s4;
        c[5] = s5;
        c[6] = s6;
        c[7] = s7;
        c[8] = s8;
        c[9] = s9;
        c[10] = s10;
        c[11] = "";
    }

    public void a(boolean flag)
    {
        _fldfor = flag;
    }

    public String _mthif(int i)
    {
        if(i < 12)
            return c[i];
        else
            return null;
    }

    public String a(String s, boolean flag, boolean flag1, boolean flag2, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer("");
        StringBuffer stringbuffer1 = new StringBuffer("");
        if(flag)
        {
            if(c[1].equals(""))
                return c[2];
            stringbuffer.append("-1");
            if(flag1)
            {
                if(c[10] != "")
                    stringbuffer.append(c[10]);
                else
                    stringbuffer.append("05");
            } else
            {
                stringbuffer.append("01");
            }
            if(!s.equals(c[7]) && !_fldfor)
                stringbuffer1.append("#");
            stringbuffer1.append(c[1]).append(s1);
            if(c[11].equals(""))
            {
                Date date = new Date();
                int i = date.getHours();
                int j = date.getMinutes();
                c[11] = "0100(" + (i >= 10 ? "" + i : "0" + i) + ":" + (j >= 10 ? "" + j : "0" + j) + ") ";
            }
            if(flag2)
                stringbuffer1.append('\r').append(c[11]);
        } else
        {
            return c[2];
        }
        return stringbuffer.append(stringbuffer1).append('\r').append(c[2]).toString();
    }

    public void a(String s, int i)
    {
        c[i] = new String(s);
    }

    public boolean _mthelse()
    {
        return b;
    }

    public boolean _mthgoto()
    {
        return _fldvoid;
    }

    public void _mthbyte()
    {
        b = true;
    }

    public void _mthtry()
    {
        b = false;
    }

    public void _mthint()
    {
        _fldvoid = true;
    }

    public void _mthcase()
    {
        _fldvoid = false;
    }

    public void _mthif(String s)
    {
        e = s;
    }

    public void a(String s)
    {
        _fldchar = s;
    }

    public void a(int i)
    {
        d = i;
    }

    public String _mthchar()
    {
        return e;
    }

    public String _mthdo()
    {
        return _fldchar;
    }

    public int _mthnew()
    {
        return d;
    }

    public int _mthif()
    {
        int i;
        try
        {
            i = Integer.parseInt(c[10]);
        }
        catch(NumberFormatException numberformatexception)
        {
            return 15;
        }
        switch(i)
        {
        case 1: // '\001'
            return 13;

        case 2: // '\002'
            return 16;

        case 3: // '\003'
            return 14;

        case 4: // '\004'
            return 19;

        case 5: // '\005'
            return 18;

        case 8: // '\b'
            return 17;

        case 10: // '\n'
            return 15;

        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
        default:
            return 15;
        }
    }

    public String a()
    {
        String s = "";
        for(int i = 3; i <= 7; i++)
            if(!c[i].equals("-1") && !c[i].equals("?") && !c[i].equals(""))
                if(i == 4)
                {
                    StringTokenizer stringtokenizer = new StringTokenizer(c[4], "*");
                    if(stringtokenizer.countTokens() == 2)
                    {
                        String s1 = stringtokenizer.nextToken();
                        if(s.equals(""))
                            s = stringtokenizer.nextToken();
                        else
                            s = s + ", " + stringtokenizer.nextToken();
                    }
                } else
                if(i != 7)
                {
                    if(s.equals(""))
                        s = c[i];
                    else
                        s = s + ", " + c[i];
                } else
                if(!c[1].equals(""))
                    if(s.equals(""))
                    {
                        if(_fldfor)
                        {
                            if(!c[7].equals(""))
                                s = c[7];
                        } else
                        {
                            s = c[1] + "@" + c[i];
                        }
                    } else
                    if(_fldfor)
                    {
                        if(!c[7].equals(""))
                            s = s + ", " + c[7];
                    } else
                    {
                        s = s + ", " + c[1] + "@" + c[i];
                    }

        return s;
    }

    public String _mthfor()
    {
        String s = "";
        for(int i = 0; i < 12; i++)
            if(s.equals(""))
                s = c[i];
            else
                s = s + "\t" + c[i];

        return s;
    }

    public String _mthdo(String s)
    {
        StringBuffer stringbuffer = new StringBuffer("");
        for(int i = 0; i < s.length(); i++)
            try
            {
                if(Integer.parseInt(s.substring(i, i + 1)) == 4)
                {
                    int j = Integer.parseInt(c[Integer.parseInt(s.substring(i, i + 1))].substring(0, 1));
                    switch(j)
                    {
                    case 0: // '\0'
                        stringbuffer.append("2");
                        break;

                    case 1: // '\001'
                        stringbuffer.append("3");
                        break;

                    case 2: // '\002'
                        stringbuffer.append("4");
                        break;

                    case 3: // '\003'
                        stringbuffer.append("5");
                        break;

                    case 4: // '\004'
                        stringbuffer.append("1");
                        break;

                    case 5: // '\005'
                        stringbuffer.append("0");
                        break;
                    }
                    stringbuffer.append(c[Integer.parseInt(s.substring(i, i + 1))].substring(1));
                } else
                {
                    stringbuffer.append(c[Integer.parseInt(s.substring(i, i + 1))]);
                }
            }
            catch(NumberFormatException numberformatexception)
            {
                System.err.println("getSortString : NumberFormatException");
            }

        return stringbuffer.toString();
    }

    private String c[];
    private String e;
    private String _fldchar;
    private int d;
    private boolean _fldfor;
    private final int a = 12;
    private final int _fldtry = 3;
    private final int _flddo = 4;
    private final int _fldif = 2;
    private final int _fldelse = 1;
    private final int f = 7;
    private final int _fldgoto = 8;
    private final int _fldbyte = 9;
    private final int _fldint = 10;
    private final int _fldlong = 11;
    private boolean b;
    private boolean _fldvoid;
    private boolean _fldcase;
    private boolean _fldnull;
    private boolean _fldnew;
}
