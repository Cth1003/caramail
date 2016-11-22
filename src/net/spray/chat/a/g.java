// osef aussi


package net.spray.chat.a;

import java.awt.*;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.text.Collator;
import java.util.*;

// niktamar ok

public class g extends Canvas
{

    private void a(String s1, int i1, int j1, int k1)
    {
        Y = new Font[k1 * 2];
        ac = new String[k1 * 2];
        for(int l1 = 0; l1 < k1; l1++)
        {
            if(System.getProperty("os.name").indexOf("Windows") != -1)
            {
                Object aobj[] = {
                    s1, new Integer(0), new Integer(i1 + l1 * j1)
                };
                Object aobj1[] = {
                    s1, new Integer(1), new Integer(i1 + l1 * j1)
                };
                Class aclass[] = {
                    java.lang.String.class, Integer.TYPE, Integer.TYPE
                };
                Class aclass1[] = {
                    java.lang.String.class, Integer.TYPE, Integer.TYPE
                };
                try
                {
                    Class class1 = Class.forName("com.ms.awt.FontX");
                    Constructor constructor = class1.getConstructor(aclass);
                    Y[l1] = (Font)constructor.newInstance(aobj);
                    Constructor constructor1 = class1.getConstructor(aclass1);
                    Y[l1 + k1] = (Font)constructor1.newInstance(aobj1);
                }
                catch(Exception exception)
                {
                    Y[l1] = new Font("Helvetica", 0, i1 + l1 * j1);
                    Y[l1 + k1] = new Font("Helvetica", 1, i1 + l1 * j1);
                }
            } else
            {
                Y[l1] = new Font("Helvetica", 0, i1 + l1 * j1);
                Y[l1 + k1] = new Font("Helvetica", 1, i1 + l1 * j1);
            }
            ac[l1] = String.valueOf(l1 + 1);
            ac[l1 + k1] = String.valueOf(l1 + 1);
        }

        R = k1;
        k = 0;
        for(int i2 = 0; i2 < Y.length; i2++)
        {
            FontMetrics fontmetrics = getFontMetrics(Y[i2]);
            k = Math.max(k, fontmetrics.getHeight());
        }

    }

    public g(j j1, int i1, boolean flag, boolean flag1, String s1, String s2, int k1, 
            int l1, int i2, boolean flag2, boolean flag3, boolean flag4, String s3, int j2, 
            int k2, Image aimage[])
    {
        V = false;
        ad = false;
        R = 4;
        G = -1;
        _fldnull = -1;
        f = -1;
        ag = -1;
        P = 0;
        i = 0;
        z = "";
        S = 0;
        F = null;
        B = 100;
        J = 100;
        _fldlong = 4;
        _fldgoto = 4;
        _fldelse = 0L;
        _fldchar = 0L;
        _fldtry = false;
        _fldvoid = j1;
        af = j2;
        g = i1;
        E = flag;
        _fldfor = flag1;
        z = s1;
        _fldvoid.a(0, 0, 0, 0);
        _fldvoid.a(1);
        _fldvoid._mthif(1);
        ab = new Vector();
        Z = s2;
        _fldnew = k1;
        j = l1;
        e = i2;
        ah = ah;
        X = flag2;
        h = flag3;
        O = s3;
        X = flag2;
        A = flag4;
        h = flag3;
        O = s3;
        Q = k2;
        _flddo = aimage;
        a(s2, k1, l1, i2);
    }

    public void a(String s1)
    {
        Z = s1;
        a(Z, _fldnew, j, e);
    }

    public void a(boolean flag)
    {
        A = flag;
    }

    public String _mthdo()
    {
        return Z;
    }

    private String _mthfor(String s1)
    {
        String s2 = ":;8'<|[B>%]}{O(";
        String s3 = "*!&-#=>oO$<";
        String s4 = ")(D|OoXxpP/\\*!{}#[$";
        StringBuffer stringbuffer = new StringBuffer("");
        int i1 = 0;
        while(i1 < s1.length()) 
        {
            if(s1.length() - i1 < 3)
            {
                stringbuffer.append(s1.substring(i1));
                break;
            }
            int j1;
            for(j1 = 0; j1 < s2.length() && s2.charAt(j1) != s1.charAt(i1); j1++);
            if(j1 != s2.length())
            {
                int k1;
                for(k1 = 0; k1 < s3.length() && s3.charAt(k1) != s1.charAt(i1 + 1); k1++);
                if(k1 != s3.length())
                {
                    int l1;
                    for(l1 = 0; l1 < s4.length() && s4.charAt(l1) != s1.charAt(i1 + 2); l1++);
                    if(l1 != s4.length())
                    {
                        long l2 = ((l1 << 4) + k1 << 4) + j1 << 4;
                        int j2 = 0;
                        if(s1.length() - i1 >= 4 && s1.charAt(i1 + 3) >= '0' && s1.charAt(i1 + 3) <= '9')
                        {
                            l2 += s1.charAt(i1 + 3) - 48;
                            j2++;
                        } else
                        {
                            l2 += 10L;
                        }
                        if(s1.length() - i1 >= 5 + j2 && s1.charAt(i1 + 3 + j2) == '#')
                        {
                            char c1 = s1.charAt(i1 + 4 + j2);
                            if(c1 == 'c' || c1 == 'd')
                            {
                                l2 += 1 << 17 + (c1 != 'd' ? 1 : 0);
                                j2 += 2;
                                if(s1.length() - i1 >= 4 + j2 && ((c1 = s1.charAt(i1 + 3 + j2)) == 'c' || c1 == 'd'))
                                {
                                    l2 += 1 << 19 + (c1 != 'd' ? 1 : 0);
                                    j2++;
                                }
                            }
                        }
                        stringbuffer.append('\t').append(l2 << 2).append('\t');
                        i1 += 3 + j2;
                        continue;
                    }
                }
            } else
            if(s1.charAt(i1) == '@' || s1.charAt(i1) == '#')
                try
                {
                    if(s1.charAt(i1 + 1) != '-')
                    {
                        int i2 = Integer.parseInt(s1.substring(i1 + 1, i1 + 3));
                        boolean flag = s1.charAt(i1) == '@';
                        if(!flag && i2 >= 0 && i2 <= 14)
                        {
                            int k2;
                            if(i2 == 13 || i2 == 14)
                                k2 = 1;
                            else
                                k2 = 10;
                            if((i2 == 2 || i2 == 4 || i2 == 13 || i2 == 14) && s1.length() - i1 >= 4 && s1.charAt(i1 + 3) >= '0' && s1.charAt(i1 + 3) <= '9')
                            {
                                k2 = s1.charAt(i1 + 3) - 48;
                                i1++;
                            }
                            stringbuffer.append('\t');
                            stringbuffer.append(((i2 << 4) + k2 << 2) + 1);
                            stringbuffer.append('\t');
                            i1 += 3;
                            continue;
                        }
                        if(flag && i2 >= 0 && i2 < _flddo.length)
                        {
                            stringbuffer.append('\t');
                            stringbuffer.append((i2 << 2) + 2);
                            stringbuffer.append('\t');
                            i1 += 3;
                            continue;
                        }
                    }
                }
                catch(NumberFormatException numberformatexception) { }
            stringbuffer.append(s1.charAt(i1));
            i1++;
        }
        return stringbuffer.toString();
    }

    public void _mthif(String s1)
    {
        if(s1.equals(""))
            ad = true;
        ah = s1;
    }

    private String a(String s1, String s2, String s3)
    {
        String as[] = new String[9];
        as[0] = "03";
        as[1] = "09";
        as[2] = "07";
        as[3] = "06";
        as[4] = "01";
        as[5] = "08";
        as[6] = "10";
        as[7] = "04";
        as[8] = "02";
        String as1[] = new String[4];
        as1[0] = "00";
        as1[1] = "01";
        as1[2] = "02";
        as1[3] = "01";
        Random random = new Random();
        int i1 = -1;
        int j1 = -1;
        int k1 = 0;
        if(s2.compareTo("03") == 0)
        {
            j1 = random.nextInt() % 4;
            if(j1 < 0)
                j1 *= -1;
        }
        if(s3.compareTo("11") == 0)
        {
            i1 = random.nextInt() % 9;
            if(i1 < 0)
                i1 *= -1;
        }
        StringBuffer stringbuffer = new StringBuffer("");
        for(int l1 = 0; l1 < s1.length(); l1++)
        {
            String s4 = s1.substring(l1, l1 + 1);
            if(j1 == -1)
                stringbuffer.append(s2);
            else
            if(s4.compareTo(" ") != 0)
            {
                stringbuffer.append(as1[j1]);
                if(k1 % 2 == 0)
                    j1++;
                k1++;
            } else
            {
                stringbuffer.append("00");
            }
            if(i1 != -1)
            {
                if(s4.compareTo(" ") != 0)
                {
                    stringbuffer.append(as[i1]);
                    i1++;
                } else
                {
                    stringbuffer.append("00");
                }
            } else
            {
                stringbuffer.append(s3);
            }
            stringbuffer.append(l1 == s1.length() - 1 ? s4 : s4 + "\r");
            if(i1 == 9)
                i1 = 0;
            if(j1 == 4)
                j1 = 0;
        }

        return stringbuffer.toString();
    }

    private int a(Graphics g1, int i1, int j1, boolean flag)
    {
        int k1 = 0;
        if(flag)
        {
            String s1 = _mthfor(i1)._mthif(2);
            String s3 = "";
            String s5 = "";
            if(s1 != null && !s1.equals(""))
            {
                String s4 = s1.substring(2, 4);
                String s6 = s1.substring(0, 2);
                if(s4.equals("11") || s6.equals("03"))
                    _mthfor(i1).a(a(s1.substring(4), s6, s4), 2);
            }
            String s7 = _mthfor(i1).a(ah, X, h, A, O);
            StringBuffer stringbuffer = new StringBuffer("");
            try
            {
                int j2 = 0;
                k1 = 0;
                int k2;
                do
                {
                    boolean flag1 = false;
                    int l1;
                    if((l1 = Integer.parseInt(s7.substring(0, 2))) < 0)
                    {
                        l1 *= -1;
                        flag1 = true;
                    }
                    if(_mthfor(i1)._mthgoto())
                        l1 += R;
                    int i2 = Integer.parseInt(s7.substring(2, 4));
                    FontMetrics fontmetrics = getFontMetrics(Y[l1]);
                    String s8 = s7.substring(4, (k2 = s7.indexOf('\r', 4)) >= 0 ? k2 : s7.length());
                    if(s8.length() != 0)
                    {
                        stringbuffer.append(l1).append('\t').append(i2).append('\t');
                        if(!flag1)
                            s8 = _mthfor(s8);
                        Object obj = null;
                        int j3;
                        do
                        {
                            String s9 = s8.substring(0, (j3 = s8.indexOf('\t')) >= 0 ? j3 : s8.length());
                            if(s9.length() != 0)
                            {
                                int l2;
                                for(int i3 = 0; i3 < s9.length(); i3 += l2)
                                {
                                    for(l2 = 0; i3 + l2 < s9.length() && j2 + fontmetrics.stringWidth(s9.substring(i3, i3 + l2 + 1)) <= B - _fldlong * 2; l2++);
                                    if(i3 + l2 < s9.length())
                                    {
                                        k1++;
                                        int k3 = s9.substring(i3, i3 + l2).lastIndexOf(" ");
                                        if(k3 != -1)
                                            l2 = k3;
                                        if(l2 == 0)
                                        {
                                            l2 = 1;
                                            if(j2 == 0)
                                            {
                                                stringbuffer.append(s9.charAt(i3)).append('\n');
                                            } else
                                            {
                                                stringbuffer.append('\n').append(s9.charAt(i3));
                                                j2 = fontmetrics.stringWidth(s9.substring(i3, i3 + l2));
                                            }
                                        } else
                                        {
                                            stringbuffer.append(s9.substring(i3, i3 + l2));
                                            stringbuffer.append('\n');
                                            j2 = 0;
                                        }
                                    } else
                                    {
                                        stringbuffer.append(s9.substring(i3, i3 + l2));
                                        j2 += fontmetrics.stringWidth(s9.substring(i3));
                                    }
                                }

                            }
                            if(j3 != -1)
                            {
                                s8 = s8.substring(j3 + 1);
                                long l3 = Integer.parseInt(s8.substring(0, j3 = s8.indexOf('\t')));
                                int i4;
                                if((l3 & 2L) != 0L)
                                {
                                    i4 = 32;
                                } else
                                {
                                    i4 = (l3 & 1L) != 1L ? 23 : 29;
                                    if((l3 & 3L) == 0L)
                                    {
                                        if((l3 & 0x180000L) != 0L)
                                            i4 += 9;
                                        if((l3 & 0x600000L) != 0L)
                                            i4 += 9;
                                    }
                                }
                                i4 += 2;
                                if(j2 + i4 > B - _fldlong * 2)
                                {
                                    k1++;
                                    if(j2 != 0)
                                    {
                                        stringbuffer.append("\n\t");
                                        stringbuffer.append(l3);
                                        stringbuffer.append('\t');
                                        j2 = i4;
                                    } else
                                    {
                                        stringbuffer.append('\t');
                                        stringbuffer.append(l3);
                                        stringbuffer.append("\t\n");
                                    }
                                } else
                                {
                                    stringbuffer.append('\t');
                                    stringbuffer.append(l3);
                                    stringbuffer.append('\t');
                                    j2 += i4;
                                }
                            }
                        } while(j3 != -1 && (s8 = s8.substring(j3 + 1)).length() != 0);
                        stringbuffer.append('\r');
                    }
                } while(k2 != -1 && (s7 = s7.substring(k2 + 1)).length() != 0);
                k1++;
                _mthfor(i1)._mthif(stringbuffer.toString());
                _mthfor(i1).a(k1);
                if(_mthfor(i1)._mthelse())
                    _fldnull = j1;
            }
            catch(Exception exception)
            {
                return -1;
            }
        } else
        {
            String s2 = _mthfor(i1)._mthchar();
            k1 = _mthfor(i1)._mthnew();
            if(j1 >= P - k1 && s2 != null && j1 <= P + i)
                a(g1, i1, s2, k1, j1);
        }
        return k1 + j1;
    }

    private void a(Graphics g1, int i1, String s1, int j1, int k1)
    {
        boolean flag = true;
        Object obj = null;
        if(ag == i1)
        {
            N = _mthfor(i1).a();
            G = k1;
            T = L[_mthfor(i1)._mthif()];
            W.setColor(L[11]);
            W.fillRect(_fldlong, (k1 - P) * k + _fldgoto, B - _fldlong * 2, j1 * k);
        }
        byte byte0 = -1;
        int j2 = k1 + 1;
        int l1 = _fldlong;
        for(int k2 = 0; (k2 = s1.indexOf('\r')) != -1;)
        {
            String s2 = s1.substring(0, k2);
            int l2;
            int i3 = Integer.parseInt(s2.substring(0, l2 = s2.indexOf('\t')));
            g1.setFont(Y[i3]);
            FontMetrics fontmetrics = getFontMetrics(Y[i3]);
            s2 = s2.substring(l2 + 1);
            int j3 = Integer.parseInt(s2.substring(0, l2 = s2.indexOf('\t')));
            if(_mthfor(i1)._mthelse())
            {
                if(flag)
                {
                    W.setColor(L[12]);
                    W.fillRect(_fldlong, (k1 - P) * k + _fldgoto, B - _fldlong * 2, j1 * k);
                }
                g1.setColor(Color.white);
            } else
            {
                g1.setColor(L[j3]);
            }
            int i2 = ((j2 - P) * k - 1) + _fldgoto;
            s2 = s2.substring(l2 + 1);
            do
            {
                String s3;
                if((l2 = s2.indexOf('\n')) != -1)
                    s3 = s2.substring(0, l2);
                else
                    s3 = s2;
                int k3;
                while((k3 = s3.indexOf('\t')) != -1) 
                {
                    if(k3 != 0)
                    {
                        g1.drawString(s3.substring(0, k3), l1, i2 - (k - fontmetrics.getHeight()) / 2 - fontmetrics.getDescent());
                        l1 += fontmetrics.stringWidth(s3.substring(0, k3));
                    }
                    s3 = s3.substring(k3 + 1);
                    long l3 = Integer.parseInt(s3.substring(0, k3 = s3.indexOf('\t')));
                    int i4 = (int)(l3 & 3L);
                    int j4;
                    if(i4 == 2)
                    {
                        j4 = 32;
                        a(g1, (int)(l3 >> 2), l1 + 1, i2 - 20 - (k - 20) / 2);
                    } else
                    {
                        int l4 = -1;
                        int i5 = -1;
                        int j5 = 0;
                        int k5 = -1;
                        j5 = (int)((l3 >>>= 2) & 15L);
                        int k4 = (int)((l3 >>>= 4) & 15L);
                        int l5;
                        if(i4 == 1)
                        {
                            k4 += 17;
                            j4 = 29;
                            l5 = -21 - (k - 21) / 2;
                        } else
                        {
                            j4 = 23;
                            l5 = -22 - (k - 22) / 2;
                            l4 = (int)((l3 >>>= 4) & 15L);
                            i5 = (int)((l3 >>>= 4) & 31L);
                            k5 = (int)((l3 >>>= 5) & 15L);
                            if((k5 & 3) != 0)
                                j4 += 9;
                            if((k5 & 0xc) != 0)
                                j4 += 9;
                        }
                        a(g1, l1 + 1, k, i2 + l5, k4, l4, i5, k5, j5);
                    }
                    l1 += j4 + 2;
                    s3 = s3.substring(k3 + 1);
                }
                if(s3.length() != 0)
                {
                    g1.drawString(s3, l1, i2 - (k - fontmetrics.getHeight()) / 2 - fontmetrics.getDescent());
                    l1 += fontmetrics.stringWidth(s3);
                }
                if(l2 != -1)
                {
                    j2++;
                    i2 += k;
                    l1 = _fldlong;
                }
                flag = false;
            } while(l2 != -1 && (s2 = s2.substring(l2 + 1)).length() != 0);
            s1 = s1.substring(k2 + 1);
        }

    }

    private void a(Graphics g1, boolean flag)
    {
        int j1 = 0;
        for(int k1 = 0; k1 < _mthchar(); k1++)
        {
            int i1;
            if((i1 = a(g1, k1, j1, flag)) > 0)
                j1 = i1;
        }

        aa = j1;
    }

    private void a(Graphics g1, int i1, int j1, byte abyte0[][], int k1, int l1)
    {
        for(int i2 = 0; i2 < k1; i2++)
        {
            g1.setColor(abyte0[i2][0] != 1 ? I[abyte0[i2][0]] : u[l1]);
            g1.fillRect(i1 + abyte0[i2][1], j1 + abyte0[i2][2], abyte0[i2][3], abyte0[i2][4]);
        }

    }

    private void a(Graphics g1, int i1, int j1, int k1)
    {
        g1.drawImage(_flddo[i1], j1, k1, 32, 20, this);
    }

    private void a(Graphics g1, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2)
    {
        Color color = g1.getColor();
        float f1 = j1;
        if(l1 >= 17)
        {
            a(g1, i1, k1, v[l1 - 17], C[l1 - 17], l2);
        } else
        {
            if((k2 & 3) != 0)
            {
                g1.setColor(u[l2]);
                if((k2 & 3) == 1)
                {
                    byte byte0 = 0;
                    if(i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9)
                        byte0 = 4;
                    else
                    if(i2 == 4 || i2 == 10)
                        byte0 = 1;
                    else
                    if(i2 == 1)
                        byte0 = 2;
                    else
                    if(i2 == 2)
                        byte0 = 3;
                    i1 += byte0;
                    g1.fillRect(i1 + 3, k1 + 4 + 3, 3, 11);
                    g1.fillRect(i1 + 2, k1 + 8 + 3, 5, 4);
                    g1.fillRect(i1 + 1, k1 + 9 + 3, 1, 1);
                    g1.setColor(L[0]);
                    g1.drawLine(i1 + 4, k1 + 3 + 3, i1 + 4, k1 + 3 + 3);
                    g1.drawLine(i1 + 3, k1 + 4 + 3, i1 + 3, k1 + 8 + 3);
                    g1.drawLine(i1 + 5, k1 + 4 + 3, i1 + 5, k1 + 8 + 3);
                    g1.drawLine(i1 + 5, k1 + 7 + 3, i1 + 7, k1 + 7 + 3);
                    g1.drawLine(i1 + 7, k1 + 7 + 3, i1 + 7, k1 + 10 + 3);
                    g1.drawLine(i1 + 6, k1 + 11 + 3, i1 + 6, k1 + 14 + 3);
                    g1.drawLine(i1 + 3, k1 + 14 + 3, i1 + 6, k1 + 14 + 3);
                    g1.drawLine(i1 + 3, k1 + 12 + 3, i1 + 3, k1 + 14 + 3);
                    g1.drawLine(i1 + 0, k1 + 9 + 3, i1 + 3, k1 + 12 + 3);
                    g1.drawLine(i1 + 0, k1 + 9 + 3, i1 + 3, k1 + 6 + 3);
                    i1 -= byte0;
                } else
                {
                    int i3 = 2;
                    if(i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9)
                        i3 += 4;
                    else
                    if(i2 == 4 || i2 == 10)
                        i3++;
                    else
                    if(i2 == 1 || i2 == 2)
                        i3 += 2;
                    i1 += i3;
                    g1.drawLine((i1 + 5) - 2, k1 + 5 + 3, (i1 + 5) - 2, k1 + 7 + 3);
                    g1.fillRect((i1 + 3) - 2, k1 + 8 + 3, 4, 6);
                    g1.setColor(L[0]);
                    g1.drawLine(i1 + 3, k1 + 4 + 3, i1 + 4, k1 + 4 + 3);
                    g1.drawLine(i1 + 2, k1 + 5 + 3, i1 + 2, k1 + 7 + 3);
                    g1.drawLine(i1 + 4, k1 + 5 + 3, i1 + 4, k1 + 7 + 3);
                    g1.drawLine(i1 + 1, k1 + 8 + 3, i1 + 1, k1 + 8 + 3);
                    g1.drawLine(i1 + 3, k1 + 8 + 3, i1 + 5, k1 + 8 + 3);
                    g1.drawLine(i1 + 0, k1 + 9 + 3, i1 + 0, k1 + 12 + 3);
                    g1.drawLine(i1 + 1, k1 + 13 + 3, i1 + 1, k1 + 13 + 3);
                    g1.drawLine(i1 + 2, k1 + 14 + 3, i1 + 5, k1 + 14 + 3);
                    g1.drawLine(i1 + 2, k1 + 14 + 3, i1 + 5, k1 + 14 + 3);
                    g1.drawLine(i1 + 5, k1 + 9 + 3, i1 + 5, k1 + 13 + 3);
                    g1.drawLine(i1 + 3, k1 + 10 + 3, i1 + 4, k1 + 10 + 3);
                    g1.drawLine(i1 + 3, k1 + 12 + 3, i1 + 4, k1 + 12 + 3);
                    i1 -= i3;
                }
                i1 += 9;
            }
            if((k2 & 0xc) != 0)
            {
                i1 += 24;
                g1.setColor(u[l2]);
                if((k2 & 0xc) == 4)
                {
                    byte byte1 = 0;
                    if(i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9)
                        byte1 = -4;
                    else
                    if(i2 == 4 || i2 == 10 || i2 == 1)
                        byte1 = -1;
                    else
                    if(i2 == 2)
                        byte1 = -2;
                    i1 += byte1;
                    g1.fillRect(i1 + 1, k1 + 5 + 3 + 3, 4, 6);
                    g1.drawLine(i1 + 3, k1 + 1 + 3 + 3, i1 + 3, k1 + 4 + 3 + 3);
                    g1.drawLine(i1 + 5, k1 + 5 + 3 + 3, i1 + 5, k1 + 7 + 3 + 3);
                    g1.drawLine(i1 + 6, k1 + 6 + 3 + 3, i1 + 6, k1 + 6 + 3 + 3);
                    g1.setColor(L[0]);
                    g1.drawLine(i1 + 0, k1 + 8 + 3, i1 + 0, k1 + 10 + 3);
                    g1.drawLine(i1 + 0, k1 + 7 + 3, i1 + 1, k1 + 7 + 3);
                    g1.drawLine(i1 + 1, k1 + 11 + 3, i1 + 1, k1 + 14 + 3);
                    g1.drawLine(i1 + 2, k1 + 4 + 3, i1 + 2, k1 + 8 + 3);
                    g1.drawLine(i1 + 2, k1 + 14 + 3, i1 + 3, k1 + 14 + 3);
                    g1.drawLine(i1 + 3, k1 + 3 + 3, i1 + 3, k1 + 3 + 3);
                    g1.drawLine(i1 + 4, k1 + 4 + 3, i1 + 4, k1 + 8 + 3);
                    g1.drawLine(i1 + 4, k1 + 12 + 3, i1 + 4, k1 + 14 + 3);
                    g1.drawLine(i1 + 5, k1 + 7 + 3, i1 + 5, k1 + 7 + 3);
                    g1.drawLine(i1 + 5, k1 + 11 + 3, i1 + 5, k1 + 11 + 3);
                    g1.drawLine(i1 + 6, k1 + 8 + 3, i1 + 6, k1 + 8 + 3);
                    g1.drawLine(i1 + 6, k1 + 10 + 3, i1 + 6, k1 + 10 + 3);
                    g1.drawLine(i1 + 7, k1 + 9 + 3, i1 + 7, k1 + 9 + 3);
                    i1 -= byte1;
                } else
                {
                    byte byte2 = 0;
                    if(i2 == 10)
                        byte2 = -1;
                    else
                    if(i2 == 4 || i2 == 2)
                        byte2 = -2;
                    else
                    if(i2 != 0 && i2 != 1)
                        byte2 = -4;
                    i1 += byte2;
                    g1.drawLine(i1 + 2, k1 + 5 + 3, i1 + 2, k1 + 7 + 3);
                    g1.fillRect(i1 + 1, k1 + 8 + 3, 4, 6);
                    g1.setColor(L[0]);
                    g1.drawLine(i1 + 1, k1 + 4 + 3, i1 + 2, k1 + 4 + 3);
                    g1.drawLine(i1 + 1, k1 + 5 + 3, i1 + 1, k1 + 7 + 3);
                    g1.drawLine(i1 + 3, k1 + 5 + 3, i1 + 3, k1 + 7 + 3);
                    g1.drawLine(i1 + 0, k1 + 8 + 3, i1 + 2, k1 + 8 + 3);
                    g1.drawLine(i1 + 4, k1 + 8 + 3, i1 + 4, k1 + 8 + 3);
                    g1.drawLine(i1 + 0, k1 + 9 + 3, i1 + 0, k1 + 14 + 3);
                    g1.drawLine(i1 + 1, k1 + 14 + 3, i1 + 3, k1 + 14 + 3);
                    g1.drawLine(i1 + 4, k1 + 13 + 3, i1 + 4, k1 + 13 + 3);
                    g1.drawLine(i1 + 5, k1 + 9 + 3, i1 + 5, k1 + 12 + 3);
                    g1.drawLine(i1 + 1, k1 + 10 + 3, i1 + 2, k1 + 10 + 3);
                    g1.drawLine(i1 + 1, k1 + 12 + 3, i1 + 2, k1 + 12 + 3);
                    i1 -= byte2;
                }
                i1 -= 24;
            }
            switch(i2)
            {
            case 0: // '\0'
                a(g1, i1, k1, w, a[0], l2);
                break;

            case 1: // '\001'
                a(g1, i1, k1, t, a[1], l2);
                break;

            case 2: // '\002'
                a(g1, i1, k1, s, a[2], l2);
                break;

            case 3: // '\003'
                a(g1, i1, k1, r, a[3], l2);
                break;

            case 4: // '\004'
                a(g1, i1, k1, q, a[4], l2);
                break;

            case 5: // '\005'
                a(g1, i1, k1, p, a[5], l2);
                break;

            case 6: // '\006'
                a(g1, i1, k1, o, a[6], l2);
                break;

            case 7: // '\007'
                a(g1, i1, k1, n, a[7], l2);
                break;

            case 8: // '\b'
                a(g1, i1, k1, m, a[8], l2);
                break;

            case 9: // '\t'
                a(g1, i1, k1, l, a[9], l2);
                break;

            case 10: // '\n'
                a(g1, i1, k1, ae, a[10], l2);
                break;
            }
            if(j2 == 18)
                k1--;
            if(i2 == 0)
                k1++;
            else
            if(i2 == 1)
            {
                i1 -= 2;
                k1 += 2;
            } else
            if(i2 == 2)
            {
                i1 += 2;
                k1--;
            } else
            if(i2 == 4)
            {
                i1 += 2;
                k1++;
            } else
            if(i2 == 5 || i2 == 6)
                k1++;
            else
            if(i2 == 9)
                k1 += 3;
            switch(l1)
            {
            case 0: // '\0'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillRect(i1 + 13, k1 + 8, 2, 2);
                break;

            case 1: // '\001'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillRect(i1 + 13, k1 + 9, 2, 1);
                break;

            case 2: // '\002'
                g1.setColor(L[0]);
                g1.fillOval(i1 + 7, k1 + 6, 4, 4);
                g1.fillOval(i1 + 12, k1 + 6, 4, 4);
                g1.drawLine(i1 + 8, k1 + 7, i1 + 12, k1 + 7);
                break;

            case 3: // '\003'
                g1.setColor(L[0]);
                g1.drawLine(i1 + 8, k1 + 8, i1 + 9, k1 + 7);
                g1.drawLine(i1 + 13, k1 + 7, i1 + 14, k1 + 8);
                break;

            case 4: // '\004'
                g1.setColor(L[0]);
                g1.drawLine(i1 + 7, k1 + 8, i1 + 8, k1 + 7);
                g1.drawLine(i1 + 8, k1 + 7, i1 + 9, k1 + 7);
                g1.drawLine(i1 + 14, k1 + 7, i1 + 15, k1 + 8);
                g1.drawLine(i1 + 13, k1 + 7, i1 + 14, k1 + 7);
                break;

            case 5: // '\005'
                g1.setColor(L[0]);
                g1.drawOval(i1 + 4, k1 + 3, 14, 14);
                g1.fillRect(i1 + 8, k1 + 8, 2, 1);
                g1.fillRect(i1 + 13, k1 + 8, 2, 1);
                break;

            case 6: // '\006'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillRect(i1 + 13, k1 + 8, 2, 2);
                g1.fillRect(i1 + 8, k1 + 6, 2, 1);
                g1.fillRect(i1 + 13, k1 + 6, 2, 1);
                break;

            case 7: // '\007'
                g1.setColor(Color.white);
                g1.fillOval(i1 + 7, k1 + 6, 4, 3);
                g1.fillOval(i1 + 12, k1 + 6, 4, 3);
                g1.setColor(L[0]);
                g1.drawOval(i1 + 7, k1 + 6, 3, 3);
                g1.drawOval(i1 + 12, k1 + 6, 3, 3);
                break;

            case 8: // '\b'
                g1.setColor(L[0]);
                g1.drawLine(i1 + 8, k1 + 7, i1 + 9, k1 + 8);
                g1.drawLine(i1 + 13, k1 + 8, i1 + 14, k1 + 7);
                g1.drawLine(i1 + 8, k1 + 9, i1 + 9, k1 + 9);
                g1.drawLine(i1 + 13, k1 + 9, i1 + 14, k1 + 9);
                break;

            case 9: // '\t'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillOval(i1 + 12, k1 + 7, 4, 4);
                g1.drawLine(i1 + 6, k1 + 5, i1 + 16, k1 + 9);
                break;

            case 10: // '\n'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 9, 2, 1);
                g1.fillRect(i1 + 13, k1 + 9, 2, 1);
                g1.drawLine(i1 + 7, k1 + 8, i1 + 7, k1 + 8);
                g1.drawLine(i1 + 10, k1 + 8, i1 + 10, k1 + 8);
                g1.drawLine(i1 + 12, k1 + 8, i1 + 12, k1 + 8);
                g1.drawLine(i1 + 15, k1 + 8, i1 + 15, k1 + 8);
                g1.fillRect(i1 + 8, k1 + 6, 2, 1);
                g1.fillRect(i1 + 13, k1 + 6, 2, 1);
                break;

            case 11: // '\013'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillRect(i1 + 13, k1 + 8, 2, 2);
                g1.fillRect(i1 + 5, k1 + 6, 2, 2);
                g1.fillRect(i1 + 16, k1 + 6, 2, 2);
                g1.fillRect(i1 + 6, k1 + 4, 2, 2);
                g1.fillRect(i1 + 15, k1 + 4, 2, 2);
                break;

            case 12: // '\f'
                g1.setColor(L[0]);
                g1.fillRect(i1 + 8, k1 + 8, 2, 2);
                g1.fillRect(i1 + 13, k1 + 8, 2, 2);
                g1.fillRect(i1 + 10, k1 + 2, 3, 1);
                g1.fillRect(i1 + 9, k1 + 3, 5, 1);
                g1.fillRect(i1 + 9, k1 + 4, 5, 1);
                g1.fillRect(i1 + 10, k1 + 5, 3, 1);
                g1.fillRect(i1 + 11, k1 + 6, 1, 1);
                break;

            case 13: // '\r'
                g1.setColor(L[0]);
                g1.setColor(Color.white);
                g1.fillOval(i1 + 9, k1 + 6, 5, 5);
                g1.setColor(L[0]);
                g1.drawOval(i1 + 9, k1 + 6, 4, 4);
                g1.drawLine(i1 + 11, k1 + 8, i1 + 11, k1 + 8);
                break;

            case 14: // '\016'
                g1.setColor(L[0]);
                g1.drawLine(i1 + 7, k1 + 8, i1 + 9, k1 + 6);
                g1.drawLine(i1 + 9, k1 + 9, i1 + 9, k1 + 9);
                g1.drawLine(i1 + 13, k1 + 6, i1 + 15, k1 + 8);
                g1.drawLine(i1 + 13, k1 + 9, i1 + 13, k1 + 9);
                break;
            }
        }
        g1.setColor(L[0]);
        switch(j2)
        {
        case 0: // '\0'
            g1.drawLine(i1 + 8, k1 + 11, i1 + 8, k1 + 12);
            g1.drawLine(i1 + 14, k1 + 11, i1 + 14, k1 + 12);
            g1.drawLine(i1 + 8, k1 + 12, i1 + 9, k1 + 13);
            g1.drawLine(i1 + 14, k1 + 12, i1 + 13, k1 + 13);
            g1.drawLine(i1 + 12, k1 + 14, i1 + 10, k1 + 14);
            break;

        case 1: // '\001'
            g1.drawLine(i1 + 4 + 4, k1 + 11 + 3, i1 + 4 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 11 + 3, i1 + 10 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 10 + 3, i1 + 5 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 10 + 3, i1 + 9 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 8 + 4, k1 + 8 + 3, i1 + 6 + 4, k1 + 8 + 3);
            break;

        case 2: // '\002'
            g1.setColor(Color.white);
            g1.fillRect(i1 + 5 + 4, k1 + 9 + 3, 5, 3);
            g1.setColor(L[0]);
            g1.drawLine(i1 + 4 + 4, k1 + 9 + 3, i1 + 10 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 9 + 3, i1 + 4 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 9 + 3, i1 + 10 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 10 + 3, i1 + 5 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 10 + 3, i1 + 9 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 8 + 4, k1 + 12 + 3, i1 + 6 + 4, k1 + 12 + 3);
            break;

        case 3: // '\003'
            g1.drawLine(i1 + 13, k1 + 13, i1 + 9, k1 + 13);
            break;

        case 4: // '\004'
            g1.setColor(Color.white);
            g1.fillRect(i1 + 6 + 4, k1 + 9 + 3, 3, 3);
            g1.setColor(L[0]);
            g1.drawLine(i1 + 6 + 4, k1 + 8 + 3, i1 + 8 + 4, k1 + 8 + 3);
            g1.drawLine(i1 + 6 + 4, k1 + 12 + 3, i1 + 8 + 4, k1 + 12 + 3);
            g1.drawLine(i1 + 5 + 4, k1 + 9 + 3, i1 + 5 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 9 + 3, i1 + 9 + 4, k1 + 11 + 3);
            break;

        case 5: // '\005'
            g1.setColor(Color.white);
            g1.fillRect(i1 + 6 + 4, k1 + 9 + 3, 4, 2);
            g1.setColor(L[2]);
            g1.drawLine(i1 + 4 + 4, k1 + 9 + 3, i1 + 10 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 6 + 4, k1 + 11 + 3, i1 + 8 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 5 + 4, k1 + 10 + 3, i1 + 5 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 10 + 3, i1 + 9 + 4, k1 + 10 + 3);
            break;

        case 6: // '\006'
        case 7: // '\007'
            g1.drawLine(i1 + 12, k1 + 11, i1 + 10, k1 + 14);
            g1.drawLine(i1 + 12, k1 + 14, i1 + 10, k1 + 11);
            break;

        case 8: // '\b'
        case 9: // '\t'
            g1.setColor(L[2]);
            g1.fillRect(i1 + 13, k1 + 12, 2, 2);
            g1.fillRect(i1 + 14, k1 + 13, 2, 2);
            g1.setColor(L[0]);
            g1.drawLine(i1 + 8, k1 + 11, i1 + 8, k1 + 11);
            g1.drawLine(i1 + 14, k1 + 11, i1 + 14, k1 + 11);
            g1.drawLine(i1 + 8, k1 + 11, i1 + 9, k1 + 12);
            g1.drawLine(i1 + 14, k1 + 11, i1 + 13, k1 + 12);
            g1.drawLine(i1 + 12, k1 + 13, i1 + 10, k1 + 13);
            break;

        case 10: // '\n'
            g1.drawLine(i1 + 8, k1 + 12, i1 + 10, k1 + 12);
            g1.drawLine(i1 + 11, k1 + 13, i1 + 12, k1 + 13);
            g1.drawLine(i1 + 13, k1 + 14, i1 + 13, k1 + 14);
            break;

        case 11: // '\013'
            g1.drawLine(i1 + 12, k1 + 12, i1 + 14, k1 + 12);
            g1.drawLine(i1 + 10, k1 + 13, i1 + 11, k1 + 13);
            g1.drawLine(i1 + 9, k1 + 14, i1 + 9, k1 + 14);
            break;

        case 12: // '\f'
            g1.fillRect(i1 + 11, k1 + 13, 1, 2);
            break;

        case 13: // '\r'
            g1.drawLine(i1 + 8, k1 + 13, i1 + 9, k1 + 12);
            g1.drawLine(i1 + 10, k1 + 12, i1 + 12, k1 + 13);
            g1.drawLine(i1 + 13, k1 + 13, i1 + 14, k1 + 12);
            break;

        case 14: // '\016'
            g1.drawLine(i1 + 13, k1 + 12, i1 + 9, k1 + 12);
            g1.drawLine(i1 + 14, k1 + 13, i1 + 14, k1 + 13);
            g1.drawLine(i1 + 8, k1 + 13, i1 + 8, k1 + 13);
            g1.drawLine(i1 + 12, k1 + 14, i1 + 10, k1 + 14);
            break;

        case 15: // '\017'
            g1.drawLine(i1 + 9 + 4, k1 + 9 + 3, i1 + 5 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 10 + 3, i1 + 10 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 10 + 3, i1 + 4 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 8 + 4, k1 + 11 + 3, i1 + 6 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 13 + 3, i1 + 5 + 4, k1 + 13 + 3);
            g1.drawLine(i1 + 2 + 4, k1 + 11 + 3, i1 + 3 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 3 + 4, k1 + 12 + 3, i1 + 4 + 4, k1 + 12 + 3);
            g1.drawLine(i1 + 11 + 4, k1 + 11 + 3, i1 + 12 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 10 + 4, k1 + 12 + 3, i1 + 11 + 4, k1 + 12 + 3);
            break;

        case 16: // '\020'
            g1.drawLine(i1 + 5 + 4, k1 + 8 + 3, i1 + 9 + 4, k1 + 8 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 9 + 3, i1 + 10 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 10 + 3, i1 + 10 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 5 + 4, k1 + 11 + 3, i1 + 9 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 6 + 4, k1 + 12 + 3, i1 + 8 + 4, k1 + 12 + 3);
            g1.setColor(Color.white);
            g1.drawLine(i1 + 5 + 4, k1 + 9 + 3, i1 + 5 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 7 + 4, k1 + 9 + 3, i1 + 7 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 9 + 3, i1 + 9 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 6 + 4, k1 + 11 + 3, i1 + 6 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 8 + 4, k1 + 11 + 3, i1 + 8 + 4, k1 + 11 + 3);
            break;

        case 17: // '\021'
            g1.setColor(L[2]);
            g1.drawLine(i1 + 5 + 4, k1 + 9 + 3, i1 + 9 + 4, k1 + 9 + 3);
            g1.drawLine(i1 + 4 + 4, k1 + 10 + 3, i1 + 10 + 4, k1 + 10 + 3);
            g1.setColor(Color.white);
            g1.drawLine(i1 + 5 + 4, k1 + 10 + 3, i1 + 5 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 7 + 4, k1 + 10 + 3, i1 + 7 + 4, k1 + 10 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 10 + 3, i1 + 9 + 4, k1 + 10 + 3);
            g1.setColor(L[0]);
            g1.drawLine(i1 + 5 + 4, k1 + 11 + 3, i1 + 5 + 4, k1 + 11 + 3);
            g1.drawLine(i1 + 9 + 4, k1 + 11 + 3, i1 + 9 + 4, k1 + 11 + 3);
            break;

        case 18: // '\022'
            g1.setColor(Color.white);
            g1.fillRect(i1 + 7, k1 + 12, 9, 2);
            g1.drawLine(i1 + 8, k1 + 14, i1 + 14, k1 + 14);
            g1.drawLine(i1 + 10, k1 + 15, i1 + 12, k1 + 15);
            g1.setColor(L[0]);
            g1.drawLine(i1 + 6, k1 + 11, i1 + 6, k1 + 13);
            g1.drawLine(i1 + 16, k1 + 11, i1 + 16, k1 + 13);
            g1.drawLine(i1 + 9, k1 + 11, i1 + 9, k1 + 16);
            g1.drawLine(i1 + 13, k1 + 11, i1 + 13, k1 + 16);
            g1.drawLine(i1 + 6, k1 + 11, i1 + 16, k1 + 11);
            g1.drawLine(i1 + 9, k1 + 16, i1 + 13, k1 + 16);
            g1.drawLine(i1 + 6, k1 + 13, i1 + 9, k1 + 16);
            g1.drawLine(i1 + 16, k1 + 13, i1 + 13, k1 + 16);
            break;
        }
        g1.setColor(color);
    }

    public void update(Graphics g1)
    {
        paint(g1);
    }

    public void a()
    {
        if(_mthchar() > 0)
            a(((Graphics) (null)), true);
        _mthtry();
        repaint();
    }

    public void _mthbyte()
    {
        P = _fldvoid._mthnew();
        repaint();
    }

    public synchronized void paint(Graphics g1)
    {
        if(B != size().width || J != size().height)
        {
            B = size().width;
            J = size().height;
            F = null;
            F = createImage(B, J);
            if(W != null)
                W.dispose();
            W = F.getGraphics();
            i = ((J - _fldgoto * 2) + 1) / k;
            a();
        }
        W.setColor(Color.white);
        W.fillRect(0, 0, B, J);
        if(_mthchar() > 0)
            a(W, false);
        if(G != -1 && !N.equals("") && _fldfor)
            a(W);
        int i1 = 0;
        int j1 = 0;
        int k1 = B;
        int l1 = J;
        W.setColor(Color.gray);
        W.drawLine(i1, j1, i1, l1 - 1);
        W.drawLine(i1, j1, k1 - 1, j1);
        W.drawLine(i1, l1 - 1, k1 - 1, l1 - 1);
        W.drawLine(k1 - 1, j1 + 2, k1 - 1, l1);
        g1.drawImage(F, 0, 0, this);
        S++;
    }

    public void a(Image image, int i1, int j1)
    {
        c = image;
        _fldcase = i1;
        d = j1;
        _fldif = new MediaTracker(this);
        if(image != null)
        {
            _fldif.addImage(image, 0);
            try
            {
                _fldif.waitForID(0);
            }
            catch(Exception exception)
            {
                System.err.println("Erreur dans l'envoi de l'image : " + exception);
            }
            if(_fldif.isErrorID(0))
                System.out.println("Erreur ");
        }
        V = true;
    }

    private void _mthtry()
    {
        if(af == 0)
        {
            P = aa - i;
            if(P < 0)
                P = 0;
            _fldvoid.a(P, i, 0, aa - i);
        } else
        if(af == 2)
        {
            if(aa - i <= 0)
                P = 0;
            else
            if(_fldnull - i / 2 < 0)
                P = 0;
            else
            if((_fldnull - aa) + i / 2 >= 0)
                P = aa - i;
            else
                P = _fldnull - i / 2;
            _fldvoid.a(P, i, 0, aa - i);
        } else
        {
            P = 0;
            _fldvoid.a(0, i, 0, aa - i);
        }
    }

    private void a(Graphics g1)
    {
        W.setColor(T);
        FontMetrics fontmetrics = getFontMetrics(Y[0]);
        W.setFont(Y[0]);
        int i1 = (G * k - P * k - k) + _fldgoto;
        int j1 = (((-(k - fontmetrics.getHeight()) / 2 - fontmetrics.getDescent()) + G * k) - P * k) + _fldgoto;
        int k1 = fontmetrics.stringWidth(N) + _fldlong * 2;
        if(i1 < 0)
        {
            i1 += k * 2;
            j1 += k * 2;
        }
        W.fillRect(k / 2 + _fldlong, i1, k1, k);
        W.setColor(Color.black);
        W.drawRect(k / 2 + _fldlong, i1, k1, k);
        W.drawString(N, k / 2 + _fldlong * 2, j1);
        G = -1;
    }

    public boolean mouseExit(Event event, int i1, int j1)
    {
        G = -1;
        ag = -1;
        N = "";
        repaint();
        return true;
    }

    public boolean mouseMove(Event event, int i1, int j1)
    {
        if((_fldfor || E) && k > 0)
        {
            int k1 = (j1 - _fldgoto) / k + P;
            int i2 = 0;
            for(int j2 = 0; j2 < _mthchar(); j2++)
            {
                int l1 = _mthfor(j2)._mthnew();
                if(k1 >= i2 && k1 < i2 + l1)
                {
                    ag = j2;
                    repaint();
                }
                i2 += l1;
            }

        }
        return true;
    }

    public boolean mouseDown(Event event, int i1, int j1)
    {
        if(E)
        {
            int k1 = (j1 - _fldgoto) / k + P;
            int i2 = 0;
            for(int j2 = 0; j2 < _mthchar(); j2++)
            {
                int l1 = _mthfor(j2)._mthnew();
                if(k1 >= i2 && k1 < i2 + l1)
                {
                    _fldnull = i2;
                    ag = j2;
                    for(int k2 = 0; k2 < ab.size(); k2++)
                        if(k2 == j2)
                            ((b)ab.elementAt(k2))._mthbyte();
                        else
                            ((b)ab.elementAt(k2))._mthtry();

                    _mthint();
                }
                i2 += l1;
            }

        }
        Date date = new Date(System.currentTimeMillis());
        if(_fldelse == 0L)
        {
            _fldelse = date.getTime();
            f = _fldnull;
        } else
        if(f == _fldnull)
        {
            _fldchar = date.getTime();
        } else
        {
            _fldelse = date.getTime();
            f = _fldnull;
        }
        if(_fldchar != 0L)
        {
            if(_fldchar - _fldelse < 500L && _fldnull == f)
            {
                postEvent(new Event(this, 1001, "DoubleClic"));
                _fldelse = 0L;
            } else
            {
                _fldelse = date.getTime();
                f = _fldnull;
            }
            _fldchar = 0L;
        }
        return true;
    }

    public void _mthint()
    {
        int i1 = 0;
        for(int k1 = 0; k1 < _mthchar(); k1++)
        {
            int j1 = _mthfor(k1)._mthnew();
            if(_mthfor(k1)._mthelse())
                _fldnull = i1;
            i1 += j1;
        }

        _mthtry();
        repaint();
        postEvent(new Event(this, 1001, ""));
    }

    public void _mthif()
    {
        if(!z.equals(""))
            a(-1, -1);
        if(Q != -1)
            _mthdo(Q);
        if(_mthchar() > 0)
            a(((Graphics) (null)), true);
        _mthtry();
        repaint();
    }

    public int _mthchar()
    {
        return ab.size();
    }

    public b _mthfor(int i1)
    {
        return (b)ab.elementAt(i1);
    }

    public String _mthif(int i1)
    {
        return _mthfor(i1)._mthdo();
    }

    public void a(b b1)
    {
        if(ad)
            b1.a(true);
        ab.addElement(b1);
        if(g != -1 && _mthchar() > g)
            ab.removeElementAt(0);
        G = -1;
        ag = -1;
        for(int i1 = 0; i1 < ab.size(); i1++)
            ((b)ab.elementAt(i1))._mthtry();

    }

    public boolean _mthif(String s1, int i1, String s2, int j1)
    {
        if(_mthchar() > 0)
        {
            for(int k1 = 0; k1 < _mthchar(); k1++)
            {
                b b1 = (b)ab.elementAt(k1);
                if(b1._mthif(i1).equals(s1))
                    ((b)ab.elementAt(k1)).a(s2, j1);
            }

            return true;
        } else
        {
            return false;
        }
    }

    public void a(b b1, int i1)
    {
        if(i1 < _mthchar() && i1 >= 0)
            ab.setElementAt(b1, i1);
    }

    public void _mthfor()
    {
        if(_mthchar() > 0)
        {
            for(int i1 = 0; i1 < ab.size(); i1++)
            {
                b b1 = (b)ab.elementAt(i1);
                if(i1 == 0)
                    ((b)ab.elementAt(i1))._mthbyte();
                else
                    ((b)ab.elementAt(i1))._mthtry();
            }

        }
        _mthint();
    }

    public void _mthgoto()
    {
        if(_mthchar() > 0)
        {
            for(int i1 = 0; i1 < ab.size(); i1++)
            {
                b b1 = (b)ab.elementAt(i1);
                if(i1 == ab.size() - 1)
                    ((b)ab.elementAt(i1))._mthbyte();
                else
                    ((b)ab.elementAt(i1))._mthtry();
            }

        }
        _mthint();
    }

    public b a(int i1)
    {
        if(_mthchar() > 0 && i1 < _mthchar() && i1 >= 0)
        {
            for(int j1 = 0; j1 < ab.size(); j1++)
            {
                b b1 = (b)ab.elementAt(j1);
                if(j1 == i1)
                    ((b)ab.elementAt(j1))._mthbyte();
                else
                    ((b)ab.elementAt(j1))._mthtry();
            }

            _mthint();
            return (b)ab.elementAt(i1);
        } else
        {
            _mthint();
            return null;
        }
    }

    public b a(String s1, int i1)
    {
        if(_mthchar() > 0)
        {
            for(int j1 = 0; j1 < _mthchar(); j1++)
            {
                b b1 = (b)ab.elementAt(j1);
                if(b1._mthif(i1).equals(s1))
                    return b1;
            }

        }
        return null;
    }

    public b _mthnew()
    {
        if(ag < _mthchar() && ag > -1)
        {
            b b1 = (b)ab.elementAt(ag);
            return b1;
        } else
        {
            return null;
        }
    }

    public boolean _mthdo(String s1, int i1)
    {
        if(_mthchar() > 0)
        {
            for(int j1 = 0; j1 < _mthchar(); j1++)
            {
                b b1 = (b)ab.elementAt(j1);
                if(b1._mthif(i1).equals(s1))
                    ((b)ab.elementAt(j1))._mthbyte();
                else
                    ((b)ab.elementAt(j1))._mthtry();
            }

            _mthint();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean _mthdo(String s1, int i1, String s2, int j1)
    {
        if(_mthchar() > 0)
        {
            for(int k1 = 0; k1 < _mthchar(); k1++)
            {
                b b1 = (b)ab.elementAt(k1);
                if(b1._mthif(i1).equals(s1) && b1._mthif(j1).equals(s2))
                    ((b)ab.elementAt(k1))._mthbyte();
                else
                    ((b)ab.elementAt(k1))._mthtry();
            }

            _mthint();
            return true;
        } else
        {
            return false;
        }
    }

    public b _mthelse()
    {
        if(_mthchar() > 0)
        {
            for(int i1 = 0; i1 < _mthchar(); i1++)
            {
                b b1 = (b)ab.elementAt(i1);
                if(b1._mthelse())
                    return b1;
            }

        }
        return null;
    }

    public void _mthif(String s1, int i1)
    {
        for(int j1 = 0; j1 < _mthchar();)
        {
            b b1 = (b)ab.elementAt(j1);
            if(b1._mthif(i1).equals(s1))
                ab.removeElementAt(j1);
            else
                j1++;
        }

    }

    public void a(String s1, int i1, String s2, int j1)
    {
        for(int k1 = 0; k1 < _mthchar();)
        {
            b b1 = (b)ab.elementAt(k1);
            if(b1._mthif(i1).equals(s1) && b1._mthif(j1).equals(s2))
                ab.removeElementAt(k1);
            else
                k1++;
        }

    }

    public void _mthlong()
    {
        if(_mthchar() > 0)
        {
            for(int i1 = 0; i1 < _mthchar(); i1++)
            {
                b b1 = (b)ab.elementAt(i1);
                if(b1._mthelse())
                    b1._mthtry();
            }

        }
    }

    public void _mthcase()
    {
        for(int i1 = 0; i1 < _mthchar();)
        {
            b b1 = (b)ab.elementAt(i1);
            if(b1._mthelse())
            {
                ab.removeElementAt(i1);
                _mthfor();
            } else
            {
                i1++;
            }
        }

    }

    public void _mthdo(String s1)
    {
        z = s1;
    }

    private void _mthdo(int i1)
    {
        for(int j1 = 1; j1 < ab.size(); j1++)
        {
            String s1 = ((b)ab.elementAt(j1))._mthif(i1);
            String s2 = ((b)ab.elementAt(j1 - 1))._mthif(i1);
            if(s1.equals(s2))
            {
                ab.removeElementAt(j1);
                j1--;
            }
        }

    }

    private void a(int i1, int j1)
    {
        Collator collator = Collator.getInstance(Locale.getDefault());
        int k1;
        int l1;
        if(i1 == -1 && j1 == -1)
        {
            i1 = k1 = 0;
            j1 = l1 = ab.size() - 1;
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if(j1 > i1)
        {
            String s1 = ((b)ab.elementAt((i1 + j1) / 2))._mthdo(z).toUpperCase();
            while(k1 <= l1) 
            {
                while(k1 < j1 && collator.compare(((b)ab.elementAt(k1))._mthdo(z).toUpperCase(), s1) < 0) 
                    k1++;
                for(; l1 > i1 && collator.compare(((b)ab.elementAt(l1))._mthdo(z).toUpperCase(), s1) > 0; l1--);
                if(k1 <= l1)
                {
                    b b1 = (b)ab.elementAt(k1);
                    ab.setElementAt((b)ab.elementAt(l1), k1);
                    ab.setElementAt(b1, l1);
                    k1++;
                    l1--;
                }
            }
            if(i1 < l1)
                a(i1, l1);
            if(k1 < j1)
                a(k1, j1);
        }
    }

    public void _mthnull()
    {
        ab.removeAllElements();
        G = -1;
        ag = -1;
        _fldnull = -1;
        aa = 0;
    }

    public Dimension minimumSize()
    {
        return new Dimension(160, 100);
    }

    public Dimension preferredSize()
    {
        return new Dimension(160, 100);
    }

    private MediaTracker _fldif;
    private Image c;
    private int _fldcase;
    private int d;
    private boolean V;
    private final int D = 160;
    private final int _fldbyte = 100;
    private final int b = 7;
    private final int K = 0;
    private final int _fldint = 1;
    private final int U = 2;
    private boolean M;
    private boolean E;
    private boolean _fldfor;
    private boolean ad;
    private int R;
    private String N;
    private int G;
    private int _fldnull;
    private int f;
    private int ag;
    private int Q;
    private Image _flddo[];
    private int af;
    private boolean X;
    private boolean A;
    private boolean h;
    private String O;
    private Color T;
    private int P;
    private j _fldvoid;
    private int i;
    private int aa;
    private String z;
    private String ah;
    private int k;
    private int S;
    private Font Y[];
    private String ac[];
    private Image F;
    private Graphics W;
    private int B;
    private int J;
    private int _fldlong;
    private int _fldgoto;
    private long _fldelse;
    private long _fldchar;
    private Vector ab;
    private int g;
    private boolean _fldtry;
    private String Z;
    private String H;
    private int _fldnew;
    private int j;
    private int e;
    public static final Color u[] = {
        new Color(49407), new Color(0xff2020), new Color(0xff40c0), new Color(0xffc040), new Color(0xc0c0c0), new Color(0xc0c0ff), new Color(0xc0ff40), new Color(0x40ff40), new Color(0xffa0ff), new Color(0xffffff), 
        new Color(0xffff80)
    };
    public static final Color L[] = {
        new Color(0), new Color(255), new Color(0xff0000), new Color(0xff00c8), new Color(0xff9d00), new Color(0x646464), new Color(0x1a1a8c), new Color(0x7d0000), new Color(0x147300), new Color(0x6e265f), 
        new Color(0x9b9b14), new Color(0xeeeeff), new Color(128), new Color(49407), new Color(0xffc0c0), new Color(0xffffc0), new Color(0xff6060), new Color(0x74c900), new Color(0xa4a4a4), new Color(0xffdd80)
    };
    private static byte w[][] = {
        {
            1, 5, 9, 12, 4
        }, {
            1, 6, 7, 11, 2
        }, {
            1, 6, 13, 12, 1
        }, {
            1, 6, 14, 11, 2
        }, {
            1, 7, 6, 8, 1
        }, {
            1, 8, 16, 8, 1
        }, {
            1, 9, 5, 5, 1
        }, {
            1, 9, 17, 5, 1
        }, {
            1, 17, 10, 1, 3
        }, {
            6, 1, 9, 3, 3
        }, {
            6, 2, 5, 3, 3
        }, {
            6, 2, 13, 2, 3
        }, {
            6, 4, 14, 1, 2
        }, {
            6, 5, 2, 3, 3
        }, {
            6, 5, 6, 1, 1
        }, {
            6, 5, 17, 3, 2
        }, {
            6, 6, 5, 1, 1
        }, {
            6, 6, 19, 2, 1
        }, {
            6, 9, 2, 5, 1
        }, {
            6, 9, 3, 4, 1
        }, {
            6, 9, 19, 4, 1
        }, {
            6, 9, 20, 3, 1
        }, {
            6, 10, 1, 4, 1
        }, {
            6, 14, 3, 4, 1
        }, {
            6, 14, 19, 4, 1
        }, {
            6, 14, 20, 2, 1
        }, {
            6, 15, 2, 2, 1
        }, {
            6, 15, 4, 3, 1
        }, {
            6, 15, 18, 3, 1
        }, {
            6, 16, 5, 2, 1
        }, {
            6, 16, 17, 1, 1
        }, {
            6, 17, 16, 4, 1
        }, {
            6, 18, 7, 3, 2
        }, {
            6, 18, 15, 3, 1
        }, {
            6, 18, 17, 3, 1
        }, {
            6, 19, 9, 2, 1
        }, {
            6, 19, 11, 3, 3
        }, {
            9, 0, 9, 1, 3
        }, {
            9, 1, 5, 1, 4
        }, {
            9, 1, 12, 4, 1
        }, {
            9, 1, 13, 1, 3
        }, {
            9, 2, 4, 3, 1
        }, {
            9, 2, 8, 4, 1
        }, {
            9, 2, 16, 6, 1
        }, {
            9, 4, 2, 1, 2
        }, {
            9, 4, 9, 1, 3
        }, {
            9, 4, 13, 2, 1
        }, {
            9, 4, 17, 1, 3
        }, {
            9, 5, 1, 3, 1
        }, {
            9, 5, 5, 1, 1
        }, {
            9, 5, 7, 1, 1
        }, {
            9, 5, 14, 1, 2
        }, {
            9, 5, 19, 1, 1
        }, {
            9, 6, 6, 1, 1
        }, {
            9, 6, 20, 3, 1
        }, {
            9, 7, 5, 2, 1
        }, {
            9, 8, 2, 1, 3
        }, {
            9, 8, 17, 1, 3
        }, {
            9, 9, 1, 1, 1
        }, {
            9, 9, 4, 6, 1
        }, {
            9, 9, 18, 6, 1
        }, {
            9, 9, 21, 3, 1
        }, {
            9, 10, 0, 4, 1
        }, {
            9, 12, 20, 2, 1
        }, {
            9, 13, 3, 1, 1
        }, {
            9, 13, 19, 1, 1
        }, {
            9, 14, 1, 3, 1
        }, {
            9, 14, 2, 1, 1
        }, {
            9, 14, 5, 2, 1
        }, {
            9, 14, 17, 2, 1
        }, {
            9, 14, 21, 2, 1
        }, {
            9, 15, 6, 6, 1
        }, {
            9, 16, 16, 1, 1
        }, {
            9, 16, 20, 2, 1
        }, {
            9, 17, 2, 1, 1
        }, {
            9, 17, 7, 1, 3
        }, {
            9, 17, 14, 5, 1
        }, {
            9, 17, 15, 1, 1
        }, {
            9, 17, 17, 1, 1
        }, {
            9, 18, 3, 1, 3
        }, {
            9, 18, 9, 1, 5
        }, {
            9, 18, 18, 3, 1
        }, {
            9, 18, 19, 1, 1
        }, {
            9, 19, 10, 3, 1
        }, {
            9, 21, 7, 1, 3
        }, {
            9, 21, 15, 1, 3
        }, {
            9, 22, 11, 1, 3
        }
    };
    private static byte t[][] = {
        {
            1, 3, 7, 2, 12
        }, {
            1, 4, 6, 1, 1
        }, {
            1, 4, 19, 11, 1
        }, {
            1, 5, 8, 1, 11
        }, {
            1, 6, 9, 10, 10
        }, {
            1, 7, 20, 5, 1
        }, {
            1, 9, 7, 1, 2
        }, {
            1, 10, 8, 4, 1
        }, {
            3, 1, 3, 1, 1
        }, {
            3, 2, 1, 2, 1
        }, {
            3, 2, 2, 1, 1
        }, {
            3, 4, 3, 1, 1
        }, {
            3, 4, 5, 1, 1
        }, {
            3, 6, 0, 2, 1
        }, {
            3, 6, 4, 1, 1
        }, {
            3, 6, 8, 1, 1
        }, {
            3, 7, 7, 2, 1
        }, {
            3, 8, 3, 1, 1
        }, {
            3, 10, 5, 1, 1
        }, {
            3, 10, 7, 2, 1
        }, {
            3, 12, 1, 1, 1
        }, {
            3, 12, 3, 1, 1
        }, {
            3, 13, 6, 1, 1
        }, {
            3, 15, 1, 1, 1
        }, {
            3, 15, 4, 1, 1
        }, {
            3, 15, 6, 3, 1
        }, {
            3, 16, 2, 1, 1
        }, {
            3, 18, 5, 1, 1
        }, {
            9, 0, 3, 1, 1
        }, {
            9, 1, 2, 1, 1
        }, {
            9, 1, 4, 1, 1
        }, {
            9, 2, 5, 2, 2
        }, {
            9, 2, 7, 1, 12
        }, {
            9, 3, 2, 1, 1
        }, {
            9, 3, 4, 1, 1
        }, {
            9, 3, 19, 1, 1
        }, {
            9, 4, 1, 3, 1
        }, {
            9, 4, 20, 3, 1
        }, {
            9, 5, 7, 1, 1
        }, {
            9, 7, 8, 2, 1
        }, {
            9, 7, 21, 5, 1
        }, {
            9, 8, 0, 3, 1
        }, {
            9, 9, 6, 1, 1
        }, {
            9, 11, 1, 1, 1
        }, {
            9, 12, 7, 2, 1
        }, {
            9, 12, 20, 3, 1
        }, {
            9, 13, 1, 2, 1
        }, {
            9, 14, 8, 3, 1
        }, {
            9, 15, 2, 1, 1
        }, {
            9, 15, 19, 1, 1
        }, {
            9, 16, 3, 2, 1
        }, {
            9, 16, 9, 1, 10
        }, {
            9, 17, 7, 4, 1
        }, {
            9, 17, 12, 1, 1
        }, {
            9, 17, 14, 2, 1
        }, {
            9, 18, 11, 1, 1
        }, {
            9, 19, 4, 1, 2
        }, {
            9, 19, 9, 1, 2
        }, {
            9, 19, 13, 1, 1
        }, {
            9, 20, 5, 2, 1
        }, {
            9, 20, 8, 1, 1
        }, {
            9, 20, 12, 1, 1
        }, {
            9, 21, 10, 1, 2
        }, {
            9, 22, 6, 1, 4
        }
    };
    private static byte s[][] = {
        {
            1, 3, 16, 1, 1
        }, {
            1, 4, 14, 14, 1
        }, {
            1, 4, 15, 2, 1
        }, {
            1, 5, 13, 13, 1
        }, {
            1, 6, 10, 14, 1
        }, {
            1, 6, 11, 13, 2
        }, {
            1, 7, 7, 13, 3
        }, {
            1, 7, 18, 6, 1
        }, {
            1, 8, 5, 12, 2
        }, {
            1, 8, 17, 4, 1
        }, {
            1, 9, 4, 10, 1
        }, {
            1, 10, 3, 9, 1
        }, {
            1, 10, 16, 1, 1
        }, {
            1, 11, 15, 7, 1
        }, {
            1, 12, 2, 5, 1
        }, {
            1, 12, 16, 5, 1
        }, {
            1, 13, 17, 2, 1
        }, {
            3, 4, 17, 4, 1
        }, {
            3, 5, 18, 2, 1
        }, {
            3, 6, 16, 4, 1
        }, {
            3, 13, 19, 4, 1
        }, {
            3, 15, 18, 4, 1
        }, {
            3, 17, 17, 2, 1
        }, {
            9, 2, 16, 1, 1
        }, {
            9, 3, 14, 1, 2
        }, {
            9, 3, 17, 1, 2
        }, {
            9, 4, 13, 1, 1
        }, {
            9, 4, 16, 2, 1
        }, {
            9, 4, 18, 1, 1
        }, {
            9, 5, 10, 1, 3
        }, {
            9, 5, 19, 8, 1
        }, {
            9, 6, 7, 1, 3
        }, {
            9, 6, 15, 5, 1
        }, {
            9, 7, 5, 1, 2
        }, {
            9, 8, 4, 1, 1
        }, {
            9, 9, 3, 1, 1
        }, {
            9, 10, 2, 2, 1
        }, {
            9, 11, 16, 1, 1
        }, {
            9, 12, 1, 5, 1
        }, {
            9, 12, 17, 1, 1
        }, {
            9, 13, 18, 2, 1
        }, {
            9, 15, 17, 2, 1
        }, {
            9, 17, 2, 2, 1
        }, {
            9, 17, 16, 2, 1
        }, {
            9, 17, 19, 2, 1
        }, {
            9, 18, 13, 1, 3
        }, {
            9, 19, 3, 1, 2
        }, {
            9, 19, 11, 1, 2
        }, {
            9, 19, 17, 1, 2
        }, {
            9, 20, 5, 1, 6
        }
    };
    private static byte r[][] = {
        {
            1, 5, 8, 13, 5
        }, {
            1, 6, 6, 11, 2
        }, {
            1, 6, 13, 11, 2
        }, {
            1, 7, 5, 9, 1
        }, {
            1, 7, 15, 9, 1
        }, {
            1, 9, 4, 5, 1
        }, {
            1, 9, 16, 5, 1
        }, {
            9, 4, 8, 1, 5
        }, {
            9, 5, 6, 1, 2
        }, {
            9, 5, 13, 1, 2
        }, {
            9, 6, 5, 1, 1
        }, {
            9, 6, 15, 1, 1
        }, {
            9, 7, 4, 2, 1
        }, {
            9, 7, 16, 2, 1
        }, {
            9, 9, 3, 5, 1
        }, {
            9, 9, 17, 5, 1
        }, {
            9, 14, 4, 2, 1
        }, {
            9, 14, 16, 2, 1
        }, {
            9, 16, 5, 1, 1
        }, {
            9, 16, 15, 1, 1
        }, {
            9, 17, 6, 1, 2
        }, {
            9, 17, 13, 1, 2
        }, {
            9, 18, 8, 1, 5
        }
    };
    private static byte q[][] = {
        {
            1, 8, 10, 11, 4
        }, {
            1, 9, 8, 9, 2
        }, {
            1, 9, 14, 9, 1
        }, {
            1, 10, 7, 7, 1
        }, {
            1, 10, 15, 7, 1
        }, {
            1, 11, 16, 5, 1
        }, {
            3, 1, 13, 1, 2
        }, {
            3, 2, 11, 1, 2
        }, {
            3, 2, 15, 1, 1
        }, {
            3, 3, 16, 2, 1
        }, {
            3, 5, 15, 1, 1
        }, {
            3, 6, 13, 1, 2
        }, {
            3, 7, 9, 1, 1
        }, {
            3, 7, 15, 1, 2
        }, {
            3, 8, 17, 1, 1
        }, {
            3, 9, 18, 1, 1
        }, {
            3, 10, 19, 1, 1
        }, {
            3, 11, 20, 5, 1
        }, {
            3, 16, 19, 1, 1
        }, {
            3, 17, 18, 1, 1
        }, {
            3, 18, 17, 1, 1
        }, {
            3, 19, 9, 2, 1
        }, {
            3, 19, 15, 1, 2
        }, {
            3, 20, 6, 1, 3
        }, {
            3, 20, 10, 1, 5
        }, {
            6, 3, 10, 4, 2
        }, {
            6, 4, 7, 3, 3
        }, {
            6, 5, 5, 3, 1
        }, {
            6, 5, 6, 2, 1
        }, {
            6, 5, 12, 2, 1
        }, {
            6, 6, 4, 4, 1
        }, {
            6, 7, 3, 5, 1
        }, {
            6, 8, 2, 11, 1
        }, {
            6, 9, 1, 8, 1
        }, {
            6, 11, 0, 5, 1
        }, {
            6, 15, 3, 5, 1
        }, {
            6, 17, 4, 3, 1
        }, {
            6, 18, 5, 3, 1
        }
    };
    private static byte p[][] = {
        {
            1, 5, 7, 13, 9
        }, {
            1, 6, 6, 11, 1
        }, {
            1, 6, 16, 11, 1
        }, {
            1, 8, 17, 7, 1
        }, {
            1, 9, 4, 5, 1
        }, {
            4, 9, 5, 5, 1
        }, {
            9, 4, 7, 1, 9
        }, {
            9, 5, 6, 1, 1
        }, {
            9, 5, 16, 1, 1
        }, {
            9, 6, 5, 3, 1
        }, {
            9, 6, 17, 2, 1
        }, {
            9, 8, 4, 1, 1
        }, {
            9, 8, 18, 7, 1
        }, {
            9, 9, 3, 5, 1
        }, {
            9, 14, 4, 1, 2
        }, {
            9, 15, 5, 2, 1
        }, {
            9, 15, 17, 2, 1
        }, {
            9, 17, 6, 1, 1
        }, {
            9, 17, 16, 1, 1
        }, {
            9, 18, 7, 1, 9
        }
    };
    private static byte o[][] = {
        {
            1, 5, 5, 13, 1
        }, {
            1, 5, 6, 3, 10
        }, {
            1, 6, 4, 4, 1
        }, {
            1, 6, 16, 11, 2
        }, {
            1, 7, 18, 9, 1
        }, {
            1, 8, 3, 7, 1
        }, {
            1, 8, 7, 10, 9
        }, {
            1, 9, 19, 5, 1
        }, {
            1, 10, 2, 3, 1
        }, {
            1, 13, 4, 4, 1
        }, {
            1, 16, 6, 2, 1
        }, {
            9, 4, 5, 1, 11
        }, {
            9, 5, 4, 1, 1
        }, {
            9, 5, 16, 1, 2
        }, {
            9, 6, 3, 2, 1
        }, {
            9, 6, 18, 1, 1
        }, {
            9, 7, 19, 2, 1
        }, {
            9, 8, 2, 2, 1
        }, {
            9, 8, 6, 8, 1
        }, {
            9, 9, 20, 5, 1
        }, {
            9, 10, 1, 3, 1
        }, {
            9, 10, 4, 3, 1
        }, {
            9, 13, 2, 2, 1
        }, {
            9, 14, 19, 2, 1
        }, {
            9, 15, 3, 2, 1
        }, {
            9, 16, 18, 1, 1
        }, {
            9, 17, 4, 1, 1
        }, {
            9, 17, 16, 1, 2
        }, {
            9, 18, 5, 1, 11
        }
    };
    private static byte n[][] = {
        {
            1, 5, 8, 13, 1
        }, {
            1, 5, 9, 5, 4
        }, {
            1, 6, 6, 11, 2
        }, {
            1, 6, 13, 11, 2
        }, {
            1, 7, 5, 9, 1
        }, {
            1, 7, 15, 9, 1
        }, {
            1, 9, 4, 5, 1
        }, {
            1, 9, 16, 5, 1
        }, {
            1, 10, 12, 8, 1
        }, {
            1, 13, 9, 5, 3
        }, {
            2, 10, 9, 1, 1
        }, {
            2, 10, 11, 1, 1
        }, {
            2, 12, 9, 1, 1
        }, {
            2, 12, 11, 1, 1
        }, {
            6, 10, 10, 3, 1
        }, {
            6, 11, 9, 1, 1
        }, {
            6, 11, 11, 1, 1
        }, {
            9, 4, 8, 1, 5
        }, {
            9, 5, 6, 1, 2
        }, {
            9, 5, 13, 1, 2
        }, {
            9, 6, 5, 1, 1
        }, {
            9, 6, 15, 1, 1
        }, {
            9, 7, 4, 2, 1
        }, {
            9, 7, 16, 2, 1
        }, {
            9, 9, 3, 5, 1
        }, {
            9, 9, 17, 5, 1
        }, {
            9, 14, 4, 2, 1
        }, {
            9, 14, 16, 2, 1
        }, {
            9, 16, 5, 1, 1
        }, {
            9, 16, 15, 1, 1
        }, {
            9, 17, 6, 1, 2
        }, {
            9, 17, 13, 1, 2
        }, {
            9, 18, 8, 1, 5
        }
    };
    private static byte m[][] = {
        {
            1, 5, 8, 13, 1
        }, {
            1, 6, 6, 11, 2
        }, {
            1, 6, 9, 11, 1
        }, {
            1, 6, 14, 11, 1
        }, {
            1, 7, 5, 9, 1
        }, {
            1, 7, 13, 9, 1
        }, {
            1, 7, 15, 9, 1
        }, {
            1, 8, 10, 8, 1
        }, {
            1, 8, 11, 7, 2
        }, {
            1, 9, 4, 5, 1
        }, {
            1, 9, 16, 5, 1
        }, {
            2, 5, 9, 1, 4
        }, {
            2, 6, 10, 2, 3
        }, {
            2, 6, 13, 1, 1
        }, {
            2, 15, 11, 3, 2
        }, {
            2, 16, 10, 2, 1
        }, {
            2, 16, 13, 1, 1
        }, {
            2, 17, 9, 1, 1
        }, {
            9, 4, 8, 1, 5
        }, {
            9, 5, 6, 1, 2
        }, {
            9, 5, 13, 1, 2
        }, {
            9, 6, 5, 1, 1
        }, {
            9, 6, 15, 1, 1
        }, {
            9, 7, 4, 2, 1
        }, {
            9, 7, 16, 2, 1
        }, {
            9, 9, 3, 5, 1
        }, {
            9, 9, 17, 5, 1
        }, {
            9, 14, 4, 2, 1
        }, {
            9, 14, 16, 2, 1
        }, {
            9, 16, 5, 1, 1
        }, {
            9, 16, 15, 1, 1
        }, {
            9, 17, 6, 1, 2
        }, {
            9, 17, 13, 1, 2
        }, {
            9, 18, 8, 1, 5
        }
    };
    private static byte l[][] = {
        {
            1, 6, 13, 2, 3
        }, {
            1, 7, 16, 9, 1
        }, {
            1, 8, 14, 9, 2
        }, {
            1, 8, 17, 7, 1
        }, {
            1, 9, 18, 5, 1
        }, {
            1, 15, 13, 2, 1
        }, {
            3, 4, 11, 1, 1
        }, {
            3, 6, 9, 1, 1
        }, {
            3, 6, 12, 1, 1
        }, {
            3, 7, 10, 1, 1
        }, {
            3, 8, 9, 1, 1
        }, {
            3, 8, 13, 2, 1
        }, {
            3, 13, 13, 2, 1
        }, {
            3, 14, 9, 1, 1
        }, {
            3, 15, 10, 1, 1
        }, {
            3, 16, 9, 1, 1
        }, {
            3, 16, 12, 1, 1
        }, {
            3, 18, 11, 1, 1
        }, {
            9, 4, 1, 1, 10
        }, {
            9, 5, 5, 14, 4
        }, {
            9, 5, 9, 1, 7
        }, {
            9, 6, 3, 11, 2
        }, {
            9, 6, 10, 1, 2
        }, {
            9, 6, 16, 1, 1
        }, {
            9, 7, 11, 11, 1
        }, {
            9, 7, 12, 9, 1
        }, {
            9, 7, 17, 1, 1
        }, {
            9, 8, 2, 7, 1
        }, {
            9, 8, 18, 1, 1
        }, {
            9, 9, 9, 5, 1
        }, {
            9, 9, 19, 5, 1
        }, {
            9, 10, 10, 3, 1
        }, {
            9, 10, 13, 3, 1
        }, {
            9, 14, 18, 1, 1
        }, {
            9, 15, 17, 1, 1
        }, {
            9, 16, 10, 3, 1
        }, {
            9, 16, 16, 1, 1
        }, {
            9, 17, 9, 2, 1
        }, {
            9, 17, 12, 1, 4
        }, {
            9, 18, 1, 1, 4
        }
    };
    private static byte ae[][] = {
        {
            1, 2, 7, 2, 2
        }, {
            1, 2, 9, 1, 2
        }, {
            1, 3, 10, 1, 2
        }, {
            1, 4, 8, 1, 2
        }, {
            1, 4, 11, 1, 1
        }, {
            1, 5, 12, 13, 1
        }, {
            1, 6, 6, 11, 6
        }, {
            1, 6, 13, 11, 2
        }, {
            1, 7, 5, 9, 1
        }, {
            1, 7, 15, 9, 1
        }, {
            1, 9, 4, 5, 1
        }, {
            1, 9, 16, 5, 1
        }, {
            1, 18, 8, 3, 1
        }, {
            1, 18, 9, 1, 1
        }, {
            1, 18, 11, 2, 1
        }, {
            1, 19, 7, 2, 1
        }, {
            1, 19, 10, 2, 1
        }, {
            1, 20, 9, 1, 1
        }, {
            9, 1, 7, 1, 4
        }, {
            9, 2, 6, 2, 1
        }, {
            9, 2, 11, 1, 1
        }, {
            9, 3, 9, 1, 1
        }, {
            9, 3, 12, 2, 1
        }, {
            9, 4, 7, 2, 1
        }, {
            9, 4, 10, 2, 1
        }, {
            9, 5, 6, 1, 1
        }, {
            9, 5, 8, 1, 2
        }, {
            9, 5, 11, 1, 1
        }, {
            9, 5, 13, 1, 2
        }, {
            9, 6, 5, 1, 1
        }, {
            9, 6, 15, 1, 1
        }, {
            9, 7, 4, 2, 1
        }, {
            9, 7, 16, 2, 1
        }, {
            9, 9, 3, 5, 1
        }, {
            9, 9, 17, 5, 1
        }, {
            9, 14, 4, 2, 1
        }, {
            9, 14, 16, 2, 1
        }, {
            9, 16, 5, 1, 1
        }, {
            9, 16, 15, 1, 1
        }, {
            9, 17, 6, 1, 6
        }, {
            9, 17, 13, 1, 2
        }, {
            9, 18, 7, 1, 1
        }, {
            9, 18, 10, 1, 1
        }, {
            9, 18, 12, 2, 1
        }, {
            9, 19, 6, 2, 1
        }, {
            9, 19, 9, 1, 1
        }, {
            9, 20, 11, 1, 1
        }, {
            9, 21, 7, 1, 4
        }
    };
    private static byte v[][][] = {
        {
            {
                9, 5, 5, 1, 1
            }, {
                9, 5, 8, 1, 5
            }, {
                9, 5, 15, 1, 1
            }, {
                9, 6, 3, 2, 2
            }, {
                9, 6, 6, 1, 2
            }, {
                9, 6, 10, 12, 1
            }, {
                9, 6, 13, 1, 2
            }, {
                9, 6, 16, 3, 1
            }, {
                9, 7, 5, 3, 1
            }, {
                9, 7, 8, 1, 2
            }, {
                9, 7, 11, 1, 2
            }, {
                9, 7, 15, 3, 1
            }, {
                9, 7, 17, 1, 1
            }, {
                9, 8, 2, 1, 1
            }, {
                9, 8, 4, 1, 1
            }, {
                9, 8, 6, 1, 2
            }, {
                9, 8, 13, 1, 2
            }, {
                9, 8, 18, 1, 1
            }, {
                9, 9, 1, 1, 1
            }, {
                9, 9, 3, 1, 1
            }, {
                9, 9, 8, 1, 2
            }, {
                9, 9, 11, 1, 2
            }, {
                9, 9, 17, 1, 1
            }, {
                9, 9, 19, 1, 1
            }, {
                9, 10, 2, 2, 1
            }, {
                9, 10, 4, 2, 1
            }, {
                9, 10, 6, 2, 2
            }, {
                9, 10, 13, 9, 1
            }, {
                9, 10, 14, 2, 1
            }, {
                9, 10, 16, 2, 1
            }, {
                9, 10, 18, 2, 1
            }, {
                9, 11, 8, 2, 1
            }, {
                9, 11, 9, 1, 1
            }, {
                9, 11, 11, 1, 2
            }, {
                9, 12, 1, 5, 1
            }, {
                9, 12, 3, 5, 1
            }, {
                9, 12, 5, 5, 1
            }, {
                9, 12, 7, 7, 1
            }, {
                9, 12, 12, 1, 1
            }, {
                9, 12, 15, 5, 1
            }, {
                9, 12, 17, 5, 1
            }, {
                9, 12, 19, 5, 1
            }, {
                9, 13, 9, 3, 1
            }, {
                9, 13, 11, 3, 1
            }, {
                9, 14, 2, 1, 1
            }, {
                9, 14, 4, 1, 1
            }, {
                9, 14, 6, 1, 1
            }, {
                9, 14, 8, 1, 1
            }, {
                9, 14, 12, 1, 1
            }, {
                9, 14, 14, 1, 1
            }, {
                9, 14, 16, 1, 1
            }, {
                9, 14, 18, 1, 1
            }, {
                9, 16, 8, 2, 1
            }, {
                9, 16, 12, 2, 1
            }, {
                9, 17, 2, 2, 1
            }, {
                9, 17, 4, 2, 1
            }, {
                9, 17, 6, 2, 1
            }, {
                9, 17, 9, 1, 1
            }, {
                9, 17, 11, 1, 1
            }, {
                9, 17, 14, 2, 1
            }, {
                9, 17, 16, 2, 1
            }, {
                9, 17, 18, 2, 1
            }, {
                9, 19, 1, 1, 1
            }, {
                9, 19, 3, 1, 1
            }, {
                9, 19, 5, 3, 1
            }, {
                9, 19, 8, 1, 5
            }, {
                9, 19, 15, 3, 1
            }, {
                9, 19, 17, 1, 1
            }, {
                9, 19, 19, 1, 1
            }, {
                9, 20, 2, 1, 1
            }, {
                9, 20, 4, 3, 1
            }, {
                9, 20, 6, 1, 2
            }, {
                9, 20, 13, 1, 2
            }, {
                9, 20, 16, 3, 1
            }, {
                9, 20, 18, 1, 1
            }, {
                9, 21, 3, 1, 1
            }, {
                9, 21, 8, 1, 5
            }, {
                9, 21, 17, 1, 1
            }, {
                9, 22, 6, 1, 2
            }, {
                9, 22, 10, 2, 1
            }, {
                9, 22, 13, 1, 2
            }, {
                9, 23, 5, 1, 1
            }, {
                9, 23, 8, 1, 2
            }, {
                9, 23, 11, 1, 2
            }, {
                9, 23, 15, 1, 1
            }
        }, {
            {
                9, 7, 11, 1, 5
            }, {
                9, 8, 2, 2, 1
            }, {
                9, 8, 9, 1, 2
            }, {
                9, 8, 12, 14, 1
            }, {
                9, 8, 14, 14, 2
            }, {
                9, 8, 16, 13, 2
            }, {
                9, 9, 0, 1, 1
            }, {
                9, 9, 8, 1, 1
            }, {
                9, 9, 11, 13, 1
            }, {
                9, 9, 13, 13, 1
            }, {
                9, 9, 18, 11, 1
            }, {
                9, 10, 7, 1, 1
            }, {
                9, 10, 9, 11, 2
            }, {
                9, 10, 19, 9, 1
            }, {
                9, 11, 0, 1, 2
            }, {
                9, 11, 3, 1, 1
            }, {
                9, 11, 5, 1, 1
            }, {
                9, 11, 8, 9, 1
            }, {
                9, 12, 6, 5, 1
            }, {
                9, 12, 20, 5, 1
            }, {
                9, 13, 0, 1, 1
            }, {
                9, 13, 2, 2, 1
            }, {
                9, 13, 4, 4, 1
            }, {
                9, 13, 7, 1, 1
            }, {
                9, 14, 5, 3, 1
            }, {
                9, 15, 7, 4, 1
            }
        }, {
            {
                1, 8, 15, 2, 2
            }, {
                1, 9, 17, 2, 1
            }, {
                1, 10, 1, 2, 2
            }, {
                1, 10, 16, 1, 1
            }, {
                1, 12, 10, 4, 2
            }, {
                1, 13, 9, 2, 1
            }, {
                1, 13, 12, 3, 2
            }, {
                1, 13, 16, 2, 2
            }, {
                1, 14, 18, 2, 1
            }, {
                1, 15, 14, 1, 1
            }, {
                1, 15, 17, 1, 1
            }, {
                1, 17, 1, 2, 2
            }, {
                2, 10, 13, 1, 1
            }, {
                4, 8, 7, 4, 1
            }, {
                4, 8, 8, 2, 2
            }, {
                4, 8, 14, 2, 1
            }, {
                4, 9, 6, 2, 1
            }, {
                4, 9, 10, 2, 1
            }, {
                4, 10, 9, 1, 1
            }, {
                4, 10, 15, 2, 1
            }, {
                4, 11, 3, 1, 3
            }, {
                4, 11, 8, 7, 1
            }, {
                4, 11, 11, 1, 2
            }, {
                4, 11, 14, 2, 1
            }, {
                4, 11, 16, 1, 1
            }, {
                4, 12, 2, 5, 1
            }, {
                4, 12, 4, 5, 1
            }, {
                4, 12, 5, 1, 2
            }, {
                4, 12, 9, 1, 1
            }, {
                4, 12, 12, 1, 2
            }, {
                4, 13, 1, 3, 1
            }, {
                4, 13, 3, 2, 1
            }, {
                4, 13, 6, 3, 1
            }, {
                4, 13, 15, 2, 1
            }, {
                4, 15, 5, 2, 1
            }, {
                4, 15, 9, 2, 1
            }, {
                4, 15, 16, 3, 1
            }, {
                4, 16, 3, 2, 1
            }, {
                4, 16, 7, 5, 1
            }, {
                4, 16, 12, 1, 2
            }, {
                4, 16, 15, 2, 1
            }, {
                4, 16, 17, 1, 1
            }, {
                4, 17, 6, 4, 1
            }, {
                4, 17, 10, 3, 1
            }, {
                4, 17, 11, 2, 1
            }, {
                4, 17, 13, 2, 2
            }, {
                4, 18, 5, 2, 1
            }, {
                4, 18, 9, 3, 1
            }, {
                4, 19, 8, 2, 1
            }, {
                4, 19, 12, 1, 1
            }, {
                9, 7, 7, 1, 3
            }, {
                9, 7, 14, 1, 3
            }, {
                9, 8, 6, 1, 1
            }, {
                9, 8, 10, 1, 1
            }, {
                9, 8, 13, 2, 1
            }, {
                9, 8, 17, 1, 1
            }, {
                9, 9, 1, 1, 2
            }, {
                9, 9, 5, 2, 1
            }, {
                9, 9, 11, 2, 1
            }, {
                9, 9, 18, 2, 1
            }, {
                9, 10, 0, 2, 1
            }, {
                9, 10, 3, 1, 2
            }, {
                9, 10, 8, 1, 1
            }, {
                9, 10, 12, 1, 1
            }, {
                9, 10, 14, 1, 1
            }, {
                9, 11, 6, 1, 1
            }, {
                9, 11, 9, 1, 2
            }, {
                9, 11, 13, 1, 1
            }, {
                9, 11, 17, 2, 1
            }, {
                9, 12, 1, 1, 1
            }, {
                9, 12, 3, 1, 1
            }, {
                9, 12, 7, 4, 1
            }, {
                9, 12, 15, 1, 2
            }, {
                9, 13, 0, 3, 1
            }, {
                9, 13, 5, 2, 1
            }, {
                9, 13, 14, 2, 1
            }, {
                9, 13, 18, 1, 1
            }, {
                9, 14, 19, 2, 1
            }, {
                9, 15, 3, 1, 1
            }, {
                9, 15, 15, 1, 1
            }, {
                9, 16, 1, 1, 1
            }, {
                9, 16, 6, 1, 1
            }, {
                9, 16, 10, 1, 2
            }, {
                9, 16, 14, 1, 1
            }, {
                9, 16, 18, 1, 1
            }, {
                9, 17, 0, 2, 1
            }, {
                9, 17, 4, 3, 1
            }, {
                9, 17, 5, 1, 1
            }, {
                9, 17, 9, 1, 1
            }, {
                9, 17, 12, 2, 1
            }, {
                9, 17, 17, 1, 1
            }, {
                9, 18, 3, 1, 1
            }, {
                9, 18, 8, 1, 1
            }, {
                9, 18, 15, 1, 2
            }, {
                9, 19, 1, 1, 2
            }, {
                9, 19, 11, 2, 1
            }, {
                9, 19, 13, 1, 2
            }, {
                9, 20, 5, 1, 1
            }, {
                9, 20, 10, 1, 1
            }, {
                9, 20, 12, 1, 1
            }, {
                9, 21, 6, 1, 4
            }
        }, {
            {
                9, 10, 14, 4, 2
            }, {
                9, 11, 13, 3, 1
            }, {
                9, 11, 16, 2, 1
            }, {
                9, 13, 4, 1, 9
            }, {
                9, 14, 5, 1, 3
            }, {
                9, 15, 6, 1, 3
            }, {
                9, 16, 7, 1, 3
            }, {
                9, 16, 11, 1, 1
            }, {
                9, 17, 8, 1, 3
            }
        }, {
            {
                1, 10, 6, 9, 4
            }, {
                1, 11, 5, 7, 1
            }, {
                1, 11, 10, 7, 1
            }, {
                1, 12, 4, 5, 1
            }, {
                1, 12, 11, 5, 2
            }, {
                1, 13, 13, 3, 1
            }, {
                1, 15, 14, 1, 1
            }, {
                2, 15, 15, 1, 3
            }, {
                3, 13, 15, 2, 1
            }, {
                3, 13, 17, 2, 1
            }, {
                9, 5, 8, 1, 1
            }, {
                9, 6, 4, 1, 1
            }, {
                9, 7, 8, 1, 1
            }, {
                9, 7, 13, 1, 1
            }, {
                9, 8, 1, 1, 1
            }, {
                9, 8, 12, 1, 1
            }, {
                9, 9, 2, 1, 1
            }, {
                9, 9, 6, 1, 4
            }, {
                9, 10, 5, 1, 1
            }, {
                9, 10, 10, 1, 1
            }, {
                9, 11, 4, 1, 1
            }, {
                9, 11, 11, 1, 2
            }, {
                9, 12, 3, 5, 1
            }, {
                9, 12, 13, 1, 5
            }, {
                9, 13, 14, 2, 1
            }, {
                9, 13, 16, 2, 1
            }, {
                9, 13, 18, 3, 1
            }, {
                9, 14, 0, 1, 1
            }, {
                9, 14, 19, 1, 1
            }, {
                9, 16, 13, 1, 5
            }, {
                9, 17, 4, 1, 1
            }, {
                9, 17, 11, 1, 2
            }, {
                9, 18, 5, 1, 1
            }, {
                9, 18, 10, 1, 1
            }, {
                9, 19, 2, 1, 1
            }, {
                9, 19, 6, 1, 4
            }, {
                9, 20, 1, 1, 1
            }, {
                9, 20, 12, 1, 1
            }, {
                9, 21, 8, 1, 1
            }, {
                9, 21, 13, 1, 1
            }, {
                9, 22, 4, 1, 1
            }, {
                9, 23, 8, 1, 1
            }
        }, {
            {
                7, 13, 18, 3, 3
            }, {
                8, 8, 16, 13, 1
            }, {
                8, 9, 12, 11, 1
            }, {
                8, 9, 15, 11, 1
            }, {
                8, 10, 11, 9, 1
            }, {
                8, 10, 14, 9, 1
            }, {
                8, 11, 7, 7, 1
            }, {
                8, 11, 10, 7, 1
            }, {
                8, 12, 6, 5, 1
            }, {
                8, 12, 9, 5, 1
            }, {
                8, 12, 13, 5, 1
            }, {
                8, 13, 2, 3, 1
            }, {
                8, 13, 5, 3, 1
            }, {
                8, 13, 8, 3, 1
            }, {
                8, 14, 1, 1, 1
            }, {
                8, 14, 4, 1, 1
            }, {
                9, 6, 17, 17, 1
            }, {
                9, 7, 13, 5, 1
            }, {
                9, 7, 16, 1, 1
            }, {
                9, 8, 12, 1, 1
            }, {
                9, 8, 15, 1, 1
            }, {
                9, 9, 8, 4, 1
            }, {
                9, 9, 11, 1, 1
            }, {
                9, 9, 14, 1, 1
            }, {
                9, 10, 7, 1, 1
            }, {
                9, 10, 10, 1, 1
            }, {
                9, 11, 3, 7, 1
            }, {
                9, 11, 6, 1, 1
            }, {
                9, 11, 9, 1, 1
            }, {
                9, 12, 2, 1, 1
            }, {
                9, 12, 5, 1, 1
            }, {
                9, 13, 1, 1, 1
            }, {
                9, 13, 4, 1, 1
            }, {
                9, 14, 0, 1, 1
            }, {
                9, 15, 1, 1, 1
            }, {
                9, 15, 4, 1, 1
            }, {
                9, 16, 2, 1, 1
            }, {
                9, 16, 5, 1, 1
            }, {
                9, 16, 8, 4, 1
            }, {
                9, 17, 6, 1, 1
            }, {
                9, 17, 9, 1, 1
            }, {
                9, 17, 13, 5, 1
            }, {
                9, 18, 7, 1, 1
            }, {
                9, 18, 10, 1, 1
            }, {
                9, 19, 11, 1, 1
            }, {
                9, 19, 14, 1, 1
            }, {
                9, 20, 12, 1, 1
            }, {
                9, 20, 15, 1, 1
            }, {
                9, 21, 16, 1, 1
            }
        }, {
            {
                5, 6, 6, 2, 1
            }, {
                5, 6, 9, 3, 1
            }, {
                5, 6, 11, 3, 1
            }, {
                5, 6, 14, 2, 1
            }, {
                5, 7, 7, 4, 1
            }, {
                5, 7, 13, 4, 1
            }, {
                5, 8, 8, 4, 1
            }, {
                5, 8, 12, 4, 1
            }, {
                5, 9, 5, 2, 2
            }, {
                5, 9, 14, 2, 2
            }, {
                5, 11, 4, 6, 1
            }, {
                5, 11, 9, 6, 1
            }, {
                5, 11, 11, 6, 1
            }, {
                5, 11, 16, 6, 1
            }, {
                5, 12, 5, 4, 1
            }, {
                5, 12, 10, 4, 1
            }, {
                5, 12, 15, 4, 1
            }, {
                5, 13, 3, 2, 1
            }, {
                5, 13, 6, 2, 3
            }, {
                5, 13, 12, 2, 3
            }, {
                5, 13, 17, 2, 1
            }, {
                5, 16, 8, 4, 1
            }, {
                5, 16, 12, 4, 1
            }, {
                5, 17, 5, 2, 3
            }, {
                5, 17, 13, 4, 1
            }, {
                5, 17, 14, 2, 2
            }, {
                5, 19, 7, 2, 1
            }, {
                5, 19, 9, 3, 1
            }, {
                5, 19, 11, 3, 1
            }, {
                5, 20, 6, 2, 1
            }, {
                5, 20, 14, 2, 1
            }
        }, {
            {
                2, 11, 10, 3, 4
            }, {
                2, 12, 9, 10, 1
            }, {
                2, 12, 14, 3, 1
            }, {
                2, 13, 8, 8, 1
            }, {
                2, 13, 15, 1, 1
            }, {
                2, 14, 7, 7, 1
            }, {
                2, 14, 12, 9, 2
            }, {
                2, 15, 16, 4, 1
            }, {
                2, 16, 10, 2, 2
            }, {
                2, 16, 15, 2, 1
            }, {
                2, 19, 14, 3, 1
            }, {
                2, 20, 10, 3, 2
            }, {
                2, 20, 15, 1, 1
            }, {
                3, 4, 13, 1, 2
            }, {
                3, 5, 11, 1, 2
            }, {
                3, 5, 15, 1, 1
            }, {
                3, 6, 16, 2, 1
            }, {
                3, 8, 15, 1, 1
            }, {
                3, 9, 13, 1, 2
            }, {
                3, 10, 9, 1, 1
            }, {
                3, 10, 15, 1, 2
            }, {
                3, 11, 17, 1, 1
            }, {
                3, 12, 18, 1, 1
            }, {
                3, 13, 19, 1, 1
            }, {
                3, 14, 20, 6, 1
            }, {
                3, 20, 19, 1, 1
            }, {
                3, 21, 18, 1, 1
            }, {
                3, 22, 17, 1, 1
            }, {
                3, 23, 9, 2, 1
            }, {
                3, 23, 15, 1, 2
            }, {
                3, 24, 6, 1, 3
            }, {
                3, 24, 10, 1, 5
            }, {
                6, 6, 10, 4, 2
            }, {
                6, 7, 7, 3, 3
            }, {
                6, 8, 5, 3, 1
            }, {
                6, 8, 6, 2, 1
            }, {
                6, 8, 12, 2, 1
            }, {
                6, 9, 4, 5, 1
            }, {
                6, 10, 3, 5, 1
            }, {
                6, 11, 2, 12, 1
            }, {
                6, 12, 1, 9, 1
            }, {
                6, 14, 0, 5, 1
            }, {
                6, 18, 3, 6, 1
            }, {
                6, 21, 4, 3, 1
            }, {
                6, 22, 5, 3, 1
            }, {
                9, 14, 10, 2, 2
            }, {
                9, 18, 10, 2, 2
            }
        }, {
            {
                3, 1, 16, 3, 1
            }, {
                3, 1, 17, 2, 1
            }, {
                3, 1, 18, 1, 1
            }, {
                3, 2, 12, 3, 1
            }, {
                3, 2, 13, 2, 3
            }, {
                3, 3, 11, 7, 1
            }, {
                3, 4, 10, 9, 1
            }, {
                3, 4, 14, 3, 1
            }, {
                3, 4, 15, 1, 1
            }, {
                3, 5, 9, 17, 1
            }, {
                3, 5, 13, 6, 1
            }, {
                3, 6, 8, 15, 1
            }, {
                3, 6, 12, 4, 1
            }, {
                3, 7, 7, 13, 1
            }, {
                3, 8, 6, 10, 1
            }, {
                3, 8, 14, 4, 1
            }, {
                3, 9, 15, 2, 1
            }, {
                3, 10, 5, 6, 1
            }, {
                3, 11, 4, 3, 1
            }, {
                3, 11, 11, 1, 2
            }, {
                3, 12, 3, 2, 1
            }, {
                3, 13, 2, 1, 1
            }, {
                3, 20, 10, 4, 1
            }, {
                3, 21, 11, 4, 1
            }, {
                3, 23, 12, 4, 2
            }, {
                3, 23, 14, 1, 4
            }, {
                3, 24, 15, 1, 1
            }, {
                3, 26, 14, 1, 1
            }, {
                5, 5, 12, 1, 1
            }, {
                9, 2, 18, 1, 1
            }, {
                9, 3, 17, 1, 1
            }, {
                9, 4, 13, 1, 1
            }, {
                9, 4, 16, 1, 1
            }, {
                9, 5, 15, 2, 1
            }, {
                9, 7, 14, 1, 1
            }, {
                9, 10, 11, 1, 2
            }, {
                9, 11, 13, 1, 1
            }, {
                9, 11, 15, 2, 1
            }, {
                9, 12, 11, 1, 1
            }, {
                9, 12, 14, 1, 1
            }, {
                9, 13, 10, 7, 1
            }, {
                9, 20, 11, 1, 1
            }, {
                9, 21, 12, 2, 1
            }, {
                9, 22, 13, 1, 5
            }, {
                9, 24, 14, 2, 1
            }
        }, {
            {
                3, 6, 6, 1, 8
            }, {
                3, 7, 5, 1, 1
            }, {
                3, 7, 14, 1, 1
            }, {
                3, 8, 4, 1, 1
            }, {
                3, 8, 15, 1, 1
            }, {
                3, 9, 3, 2, 1
            }, {
                3, 9, 16, 1, 1
            }, {
                3, 10, 2, 2, 1
            }, {
                3, 10, 17, 5, 1
            }, {
                3, 11, 8, 1, 1
            }, {
                3, 12, 5, 1, 1
            }, {
                3, 12, 9, 1, 1
            }, {
                3, 13, 6, 1, 1
            }, {
                3, 13, 15, 2, 1
            }, {
                3, 14, 4, 1, 1
            }, {
                3, 15, 11, 1, 1
            }, {
                3, 15, 13, 1, 2
            }, {
                3, 16, 2, 2, 1
            }, {
                3, 16, 12, 1, 1
            }, {
                3, 16, 15, 1, 1
            }, {
                3, 16, 17, 2, 1
            }, {
                3, 18, 16, 1, 1
            }, {
                3, 20, 14, 1, 1
            }, {
                3, 21, 6, 1, 1
            }, {
                3, 21, 12, 1, 2
            }, {
                9, 10, 4, 3, 1
            }, {
                9, 10, 5, 2, 3
            }, {
                9, 11, 3, 8, 1
            }, {
                9, 12, 2, 4, 1
            }, {
                9, 12, 6, 1, 3
            }, {
                9, 13, 7, 9, 3
            }, {
                9, 13, 13, 2, 2
            }, {
                9, 14, 6, 7, 1
            }, {
                9, 14, 10, 8, 1
            }, {
                9, 15, 4, 5, 2
            }, {
                9, 15, 17, 1, 1
            }, {
                9, 16, 11, 6, 1
            }, {
                9, 16, 16, 2, 1
            }, {
                9, 17, 12, 4, 2
            }, {
                9, 17, 14, 3, 2
            }, {
                9, 20, 5, 1, 1
            }
        }, {
            {
                9, 4, 13, 7, 1
            }, {
                9, 5, 12, 5, 1
            }, {
                9, 6, 11, 3, 1
            }, {
                9, 6, 14, 3, 2
            }, {
                9, 7, 10, 1, 1
            }, {
                9, 7, 16, 4, 1
            }, {
                9, 8, 7, 13, 2
            }, {
                9, 8, 17, 13, 1
            }, {
                9, 10, 18, 9, 1
            }, {
                9, 11, 2, 3, 1
            }, {
                9, 11, 3, 2, 2
            }, {
                9, 12, 1, 5, 1
            }, {
                9, 12, 5, 5, 1
            }, {
                9, 12, 19, 5, 1
            }, {
                9, 13, 0, 3, 1
            }, {
                9, 13, 4, 1, 1
            }, {
                9, 13, 6, 3, 1
            }, {
                9, 13, 9, 3, 8
            }, {
                9, 15, 2, 3, 1
            }, {
                9, 15, 4, 3, 1
            }, {
                9, 16, 3, 2, 1
            }, {
                9, 18, 13, 7, 1
            }, {
                9, 18, 16, 4, 1
            }, {
                9, 19, 12, 5, 1
            }, {
                9, 20, 11, 3, 1
            }, {
                9, 20, 14, 3, 2
            }, {
                9, 21, 10, 1, 1
            }
        }, {
            {
                3, 0, 13, 3, 1
            }, {
                3, 0, 14, 2, 2
            }, {
                3, 0, 16, 1, 2
            }, {
                3, 1, 11, 3, 1
            }, {
                3, 1, 12, 2, 1
            }, {
                3, 2, 9, 3, 1
            }, {
                3, 2, 10, 2, 1
            }, {
                3, 3, 8, 3, 1
            }, {
                3, 4, 7, 3, 1
            }, {
                3, 5, 6, 3, 1
            }, {
                3, 6, 5, 3, 1
            }, {
                3, 8, 4, 3, 1
            }, {
                3, 10, 3, 3, 1
            }, {
                3, 11, 18, 2, 1
            }, {
                3, 12, 2, 2, 1
            }, {
                3, 12, 16, 8, 1
            }, {
                3, 12, 17, 4, 1
            }, {
                3, 13, 15, 10, 1
            }, {
                3, 14, 14, 13, 1
            }, {
                3, 18, 13, 10, 1
            }, {
                3, 21, 5, 1, 2
            }, {
                3, 21, 12, 2, 1
            }, {
                3, 22, 7, 1, 2
            }, {
                3, 23, 9, 1, 3
            }, {
                4, 5, 16, 3, 2
            }, {
                4, 6, 14, 3, 2
            }, {
                4, 7, 12, 3, 2
            }, {
                4, 8, 10, 3, 2
            }, {
                4, 9, 9, 3, 1
            }, {
                4, 10, 8, 3, 1
            }, {
                4, 11, 7, 2, 1
            }, {
                4, 12, 6, 2, 1
            }, {
                4, 13, 5, 2, 1
            }, {
                4, 14, 4, 2, 1
            }, {
                4, 17, 3, 1, 1
            }, {
                5, 1, 16, 3, 1
            }, {
                5, 1, 17, 2, 1
            }, {
                5, 2, 14, 3, 1
            }, {
                5, 2, 15, 2, 1
            }, {
                5, 3, 12, 3, 1
            }, {
                5, 3, 13, 2, 1
            }, {
                5, 4, 10, 3, 1
            }, {
                5, 4, 11, 2, 1
            }, {
                5, 5, 9, 3, 1
            }, {
                5, 6, 8, 3, 1
            }, {
                5, 7, 7, 3, 1
            }, {
                5, 8, 6, 3, 1
            }, {
                5, 9, 5, 4, 1
            }, {
                5, 11, 4, 3, 1
            }, {
                5, 13, 3, 2, 1
            }, {
                5, 14, 2, 2, 1
            }, {
                5, 22, 5, 1, 2
            }, {
                5, 23, 7, 1, 2
            }, {
                5, 24, 9, 1, 3
            }, {
                6, 8, 16, 4, 2
            }, {
                6, 9, 14, 4, 2
            }, {
                6, 10, 12, 3, 2
            }, {
                6, 11, 10, 3, 2
            }, {
                6, 12, 9, 3, 1
            }, {
                6, 13, 7, 4, 1
            }, {
                6, 13, 8, 3, 1
            }, {
                6, 14, 6, 4, 1
            }, {
                6, 15, 5, 6, 1
            }, {
                6, 16, 4, 7, 1
            }, {
                6, 18, 3, 5, 1
            }, {
                6, 24, 4, 1, 2
            }, {
                6, 25, 5, 1, 2
            }, {
                6, 26, 6, 1, 2
            }, {
                6, 27, 7, 1, 2
            }, {
                6, 28, 9, 1, 3
            }, {
                7, 23, 4, 1, 1
            }, {
                7, 24, 6, 1, 1
            }, {
                7, 25, 7, 1, 2
            }, {
                7, 26, 8, 1, 4
            }, {
                7, 27, 9, 1, 3
            }, {
                8, 3, 17, 2, 1
            }, {
                8, 4, 15, 2, 1
            }, {
                8, 4, 16, 1, 1
            }, {
                8, 5, 13, 2, 1
            }, {
                8, 5, 14, 1, 1
            }, {
                8, 6, 11, 2, 1
            }, {
                8, 6, 12, 1, 1
            }, {
                8, 7, 10, 1, 1
            }, {
                8, 8, 9, 1, 1
            }, {
                8, 9, 8, 1, 1
            }, {
                8, 10, 7, 1, 1
            }, {
                8, 11, 6, 1, 1
            }, {
                8, 15, 3, 2, 1
            }, {
                8, 16, 2, 5, 1
            }, {
                8, 23, 5, 1, 2
            }, {
                8, 24, 7, 1, 2
            }, {
                8, 25, 9, 1, 3
            }, {
                9, 0, 18, 11, 1
            }, {
                9, 23, 12, 6, 1
            }
        }, {
            {
                9, 6, 8, 2, 5
            }, {
                9, 7, 6, 2, 2
            }, {
                9, 7, 13, 5, 1
            }, {
                9, 7, 14, 4, 1
            }, {
                9, 8, 5, 2, 1
            }, {
                9, 8, 15, 2, 1
            }, {
                9, 9, 4, 3, 1
            }, {
                9, 9, 16, 3, 1
            }, {
                9, 10, 3, 9, 1
            }, {
                9, 10, 12, 9, 1
            }, {
                9, 10, 17, 9, 1
            }, {
                9, 11, 11, 7, 1
            }, {
                9, 12, 2, 5, 1
            }, {
                9, 12, 10, 5, 1
            }, {
                9, 12, 18, 5, 1
            }, {
                9, 13, 4, 3, 6
            }, {
                9, 13, 13, 3, 4
            }, {
                9, 17, 4, 3, 1
            }, {
                9, 17, 13, 5, 1
            }, {
                9, 17, 16, 3, 1
            }, {
                9, 18, 14, 4, 1
            }, {
                9, 19, 5, 2, 1
            }, {
                9, 19, 15, 2, 1
            }, {
                9, 20, 6, 2, 2
            }, {
                9, 21, 8, 2, 5
            }
        }, {
            {
                1, 6, 6, 17, 4
            }, {
                1, 7, 5, 7, 1
            }, {
                1, 7, 10, 15, 1
            }, {
                1, 8, 4, 5, 1
            }, {
                1, 8, 11, 13, 1
            }, {
                1, 9, 3, 3, 1
            }, {
                1, 9, 12, 11, 1
            }, {
                1, 10, 13, 9, 1
            }, {
                1, 11, 14, 7, 1
            }, {
                1, 12, 15, 5, 1
            }, {
                1, 13, 16, 3, 1
            }, {
                1, 14, 17, 1, 1
            }, {
                1, 15, 5, 7, 1
            }, {
                1, 16, 4, 5, 1
            }, {
                1, 17, 3, 3, 1
            }
        }, {
            {
                1, 6, 6, 5, 4
            }, {
                1, 7, 5, 7, 1
            }, {
                1, 7, 10, 6, 1
            }, {
                1, 8, 4, 5, 1
            }, {
                1, 8, 11, 6, 1
            }, {
                1, 9, 3, 3, 1
            }, {
                1, 9, 12, 4, 1
            }, {
                1, 10, 13, 1, 1
            }, {
                1, 11, 6, 1, 2
            }, {
                1, 12, 6, 1, 1
            }, {
                1, 12, 14, 5, 2
            }, {
                1, 13, 8, 10, 1
            }, {
                1, 13, 16, 3, 1
            }, {
                1, 14, 7, 9, 3
            }, {
                1, 14, 13, 4, 2
            }, {
                1, 14, 17, 1, 1
            }, {
                1, 15, 5, 7, 6
            }, {
                1, 16, 4, 1, 9
            }, {
                1, 17, 3, 3, 10
            }, {
                1, 18, 13, 1, 1
            }, {
                1, 20, 4, 1, 8
            }, {
                1, 22, 6, 1, 1
            }
        }
    };
    public static final Color I[] = {
        new Color(255, 255, 255), new Color(255, 255, 128), new Color(255, 160, 160), new Color(160, 160, 160), new Color(255, 200, 0), new Color(0, 128, 255), new Color(255, 0, 0), new Color(160, 64, 0), new Color(0, 160, 0), new Color(0, 0, 0)
    };
    private static byte a[] = {
        87, 64, 50, 23, 38, 20, 29, 33, 34, 40, 
        48
    };
    private static byte C[] = {
        85, 26, 101, 9, 42, 49, 31, 47, 45, 41, 
        27, 94, 25, 15, 22
    };

}
