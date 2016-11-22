// osef aussi psk c'est de la merde de gui

package net.spray.chat.normal;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.Collator;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import net.spray.chat.a.a;
import net.spray.chat.a.c;
import net.spray.chat.a.d;
import net.spray.chat.a.g;
import net.spray.chat.a.i;
import net.spray.chat.a.j;

public class b extends Thread
{

    b(CaraNewChat caranewchat)
    {
        aR = 0;
        bJ = null;
        O = false;
        aT = false;
        cg = new boolean[3];
        _fldtry = new boolean[3];
        ab = new boolean[8];
        bq = false;
        dM = false;
        cw = true;
        cs = 0;
        _fldelse = 0;
        p = 0;
        bX = 4096;
        dk = null;
        _fldgoto = "";
        C = "Helvetica";
        dQ = "Helvetica";
        i = "";
        dy = "";
        a1 = "";
        d1 = "";
        dY = "";
        bC = "";
        cX = "";
        bI = "";
        c4 = new Color(192, 192, 192);
        aY = new Color(192, 192, 192);
        m = null;
        bU = new Vector();
        b8 = new Vector();
        ep = false;
        aV = false;
        dR = true;
        aP = false;
        c = false;
        ex = false;
        c6 = true;
        h = null;
        cN = null;
        eq = null;
        bx = null;
        a3 = new Vector();
        aS = 0;
        br = -1L;
        eb = null;
        bw = -1L;
        aO = 0;
        _fldvoid = new long[20];
        ea = new long[20];
        f = new int[20];
        c5 = new boolean[20];
        c2 = new boolean[20];
        c8 = new Insets(0, 2, 0, 2);
        eo = new Panel();
        aD = new Panel();
        K = new Panel();
        ei = new Panel();
        dw = new Panel();
        aB = new Panel();
        cn = new Panel();
        dp = new j(1);
        cF = new j(1);
        cc = new Panel();
        bk = new Panel();
        aM = new Panel();
        a0 = new Panel();
        c0 = new Panel();
        cu = new j(1);
        bB = new Checkbox[3];
        ay = new Checkbox[3];
        d8 = new Label[3];
        bZ = new Panel();
        cM = new Panel();
        dB = new Panel();
        cQ = new Panel();
        bv = new Panel[20];
        b3 = new Panel[20];
        bP = new Panel[20];
        _fldnull = new Panel[20];
        ac = new Panel[20];
        c3 = new Panel[20];
        dz = new Panel[20];
        _fldnew = new Panel[20];
        dG = new j[20];
        bR = new g[20];
        s = new a[20];
        er = new a[20];
        cS = new a[20];
        e = new Button[20];
        dA = new Button[20];
        dH = new Button[20];
        du = new Button[20];
        dc = new Button[20];
        ar = new Button[20];
        w = new Button[20];
        ah = new Button[20];
        d6 = new Button[20];
        cT = new TextField[20];
        bf = new Choice[20];
        eF = new Choice[20];
        u = new Button[20];
        Y = new String[20];
        bT = new String[20];
        cx = new String[20];
        dv = new boolean[20];
        eu = new String[20];
        bG = new String[20];
        b4 = new String[20];
        U = new Checkbox[20];
        L = new j(1);
        b = new Panel();
        bj = new Panel();
        dS = new Panel();
        eC = new Choice();
        aG = new Panel();
        cl = new Panel();
        ce = new Panel();
        d2 = new Panel();
        c9 = new Panel();
        bL = new Panel();
        _fldif = new Panel();
        z = new Panel();
        y = new Panel();
        dV = new Panel();
        cW = new Panel();
        a9 = new Panel();
        d4 = new j(1);
        bK = new Checkbox[3];
        bo = new CheckboxGroup();
        eM = new Label("");
        aJ = new TextField();
        eJ = new TextField();
        eL = new Panel();
        dD = new Panel();
        r = new Panel();
        aw = new Panel();
        al = new Panel();
        W = new Panel();
        b7 = new Panel();
        aW = new Label("");
        dh = new Label("");
        ez = new j(1);
        b6 = new Panel();
        v = new TextField();
        ae = new Choice();
        di = new Choice();
        d3 = new Choice();
        es = new Panel();
        dr = new Panel();
        dn = new Panel[20];
        bb = new d[20];
        bz = new Panel[20];
        ai = new Panel[20];
        dN = new j[20];
        by = new c[20];
        bd = new a[20];
        _fldcase = caranewchat;
    }

    private void _mthchar()
    {
        if((bC = _fldcase.getParameter("room0")) == null)
        {
            if((bC = _fldcase.getParameter("room1")) == null)
            {
                bC = "fr";
                dO = 0;
            } else
            {
                dO = 1;
            }
        } else
        {
            dO = 0;
        }
        if((cb = _fldcase.getParameter("language")) == null)
            cb = "en";
        if((k = _fldcase.getParameter("tempid")) == null)
            return;
        if((cP = _fldcase.getParameter("mode")) != null)
            try
            {
                int i1 = Integer.parseInt(cP);
                ep = (i1 & 0x7f) != 0;
                dR = (i1 & 0x80) != 0;
                a4 = (i1 & 0x100) != 0;
            }
            catch(Exception exception)
            {
                ep = false;
                dR = false;
            }
        String s1;
        if((s1 = _fldcase.getParameter("port")) == null)
            bi = 6666;
        else
            try
            {
                bi = Integer.parseInt(s1);
            }
            catch(NumberFormatException numberformatexception)
            {
                bi = 6666;
            }
        if((s1 = _fldcase.getParameter("httpport")) == null)
            p = 80;
        else
            try
            {
                p = Integer.parseInt(s1);
            }
            catch(NumberFormatException numberformatexception1)
            {
                p = 80;
            }
        if((s1 = _fldcase.getParameter("proxy")) != null && s1.equalsIgnoreCase("true"))
            aV = true;
        if((s1 = _fldcase.getParameter("prefs")) != null)
        {
            int j1 = 0;
            try
            {
                j1 = Integer.parseInt(s1);
            }
            catch(NumberFormatException numberformatexception2) { }
            cg[0] = (j1 & 1) != 0;
            cg[1] = (j1 & 2) != 0;
            cg[2] = (j1 & 4) != 0;
            _fldtry[0] = (j1 & 8) != 0;
            _fldtry[1] = (j1 & 0x10) != 0;
            _fldtry[2] = (j1 & 0x20) != 0;
            ab[0] = (j1 & 0x40) != 0;
            ab[1] = (j1 & 0x80) != 0;
            ab[2] = (j1 & 0x100) != 0;
            bq = (j1 & 0x200) != 0;
            dM = (j1 & 0x400) != 0;
            ab[3] = (j1 & 0x800) != 0;
            ab[4] = (j1 & 0x1000) != 0;
            ab[5] = (j1 & 0x2000) != 0;
            ab[6] = (j1 & 0x4000) != 0;
            aQ = j1 >> 15 & 0xf;
            ab[7] = (j1 & 0x80000) != 0;
        }
        if((C = _fldcase.getParameter("font")) == null)
            C = "Helvetica";
        dQ = C;
        if((s1 = _fldcase.getParameter("color")) != null)
        {
            StringTokenizer stringtokenizer = new StringTokenizer(s1, ",");
            if(stringtokenizer.countTokens() == 3)
            {
                try
                {
                    c4 = new Color(Integer.parseInt(stringtokenizer.nextToken()), Integer.parseInt(stringtokenizer.nextToken()), Integer.parseInt(stringtokenizer.nextToken()));
                }
                catch(Exception exception1) { }
                aY = c4;
            }
        }
        if((s1 = _fldcase.getParameter("bgcolor")) != null)
        {
            StringTokenizer stringtokenizer1 = new StringTokenizer(s1, ",");
            if(stringtokenizer1.countTokens() == 3)
                try
                {
                    m = new Color(Integer.parseInt(stringtokenizer1.nextToken()), Integer.parseInt(stringtokenizer1.nextToken()), Integer.parseInt(stringtokenizer1.nextToken()));
                }
                catch(Exception exception2)
                {
                    m = null;
                }
        }
        if((dk = _fldcase.getParameter("a")) != null && (dk = dk.trim()).length() == 0)
            dk = null;
    }

    public void _mthint()
    {
        _mthchar();
        I = new Date(System.currentTimeMillis());
        char ac1[] = new char[0x30d40];
        int i1 = 0;
        try
        {
            int k1 = 0;
            int j5 = 0;
            URL url = new URL("http://" + _fldcase.getCodeBase().getHost() + ':' + p + '/' + cb);
            InputStream inputstream = url.openStream();
            BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
            InputStreamReader inputstreamreader = new InputStreamReader(bufferedinputstream);
            while((j5 = inputstreamreader.read()) != -1) 
            {
                if(i1 < 0x30d40)
                {
                    if(j5 != 10)
                    {
                        ac1[i1] = (char)j5;
                        i1++;
                    }
                } else
                {
                    i1 = 0;
                }
                if(j5 == 10)
                {
                    StringTokenizer stringtokenizer = new StringTokenizer(new String(ac1, 0, i1) + "\n", "\t\n");
                    if(stringtokenizer.countTokens() == 2)
                        try
                        {
                            try
                            {
                                k1 = Integer.parseInt(stringtokenizer.nextToken());
                            }
                            catch(NumberFormatException numberformatexception) { }
                            String s1 = _mthif(stringtokenizer.nextToken());
                            bU.addElement(s1);
                            if(k1 == 0)
                            {
                                StringTokenizer stringtokenizer1 = new StringTokenizer(s1, "*");
                                int k3 = stringtokenizer1.countTokens();
                                E = new String[k3];
                                for(int l1 = 0; l1 < k3; l1++)
                                    E[l1] = stringtokenizer1.nextToken();

                            } else
                            if(k1 == 1)
                            {
                                StringTokenizer stringtokenizer2 = new StringTokenizer(s1, "*");
                                int l3 = stringtokenizer2.countTokens();
                                ct = new String[l3];
                                for(int i2 = 0; i2 < l3; i2++)
                                    ct[i2] = stringtokenizer2.nextToken();

                            } else
                            if(k1 == 2)
                            {
                                StringTokenizer stringtokenizer3 = new StringTokenizer(s1, "*");
                                int i4 = stringtokenizer3.countTokens();
                                dX = new String[stringtokenizer3.countTokens()];
                                for(int j2 = 0; j2 < i4; j2++)
                                    dX[j2] = stringtokenizer3.nextToken();

                            } else
                            if(k1 == 4)
                            {
                                StringTokenizer stringtokenizer4 = new StringTokenizer(s1, "*");
                                int j4 = stringtokenizer4.countTokens();
                                em = new String[stringtokenizer4.countTokens()];
                                for(int k2 = 0; k2 < j4; k2++)
                                    em[k2] = stringtokenizer4.nextToken();

                            } else
                            if(k1 == 135)
                            {
                                StringTokenizer stringtokenizer5 = new StringTokenizer(s1, "*");
                                int k4 = stringtokenizer5.countTokens();
                                X = new String[stringtokenizer5.countTokens()];
                                for(int l2 = 0; l2 < k4; l2++)
                                    X[l2] = stringtokenizer5.nextToken();

                            } else
                            if(k1 == 5)
                            {
                                StringTokenizer stringtokenizer6 = new StringTokenizer(s1, "*");
                                int l4 = stringtokenizer6.countTokens();
                                ey = new String[stringtokenizer6.countTokens()];
                                for(int i3 = 0; i3 < l4; i3++)
                                    ey[i3] = stringtokenizer6.nextToken();

                            } else
                            if(k1 == 6)
                            {
                                StringTokenizer stringtokenizer7 = new StringTokenizer(s1, "*");
                                int i5 = stringtokenizer7.countTokens();
                                at = new String[stringtokenizer7.countTokens()];
                                for(int j3 = 0; j3 < i5; j3++)
                                    at[j3] = stringtokenizer7.nextToken();

                            }
                        }
                        catch(NumberFormatException numberformatexception1) { }
                    i1 = 0;
                }
            }
        }
        catch(Exception exception)
        {
            System.err.println(exception);
            return;
        }
        bt = new Vector(10, 5);
        V = new Vector();
        eD = new Vector();
        eE = new Vector(10, 5);
        cv = new Hashtable();
        try
        {
            _mthbyte();
        }
        catch(Exception exception1)
        {
            exception1.printStackTrace();
        }
        dg.disable();
        cH.enable();
        aE.disable();
        bc.enable();
        bA.disable();
        cY.disable();
        bp.disable();
        de.disable();
        cy.disable();
        a.disable();
        t.disable();
        dP.disable();
        l.disable();
        J.disable();
        for(int j1 = 0; j1 < 3; j1++)
        {
            bB[j1].setState(cg[j1]);
            ay[j1].setState(_fldtry[j1]);
        }

    }

    private void _mthbyte()
    {
        aI = new String((String)bU.elementAt(175));
        c c10 = new c(null, aQ, _fldcase);
        c10.a();
        cA = new g(ez, 2000, true, true, "", "Helvetica", 10, 2, 4, true, true, false, " - ", 2, -1, c10._mthdo());
        cB = new g(d4, 2000, true, true, "8", "Helvetica", 10, 2, 4, false, false, false, "", 2, -1, c10._mthdo());
        q = new g(L, 40, true, false, "", "Helvetica", 10, 2, 4, false, false, false, "", 0, -1, c10._mthdo());
        aL = new g(cF, 40, true, true, "41", "Helvetica", 10, 2, 4, true, true, false, "", 2, -1, c10._mthdo());
        dT = new g(dp, 40, false, true, "", "Helvetica", 10, 2, 4, true, true, false, "> ", 0, -1, c10._mthdo());
        bN = new g(cu, 2000, true, true, "01", "Helvetica", 10, 2, 4, true, true, false, " - ", 2, -1, c10._mthdo());
        dJ = new Panel();
        az = new j(1);
        D = new c(az, aQ, _fldcase);
        aU = new a((String)bU.elementAt(194));
        es = new Panel();
        d9 = new d();
        d9.a();
        F = new a((String)bU.elementAt(7));
        bH = new a((String)bU.elementAt(8));
        bc = new Button((String)bU.elementAt(114));
        aE = new Button((String)bU.elementAt(9));
        cY = new Button((String)bU.elementAt(113));
        eH = new Button((String)bU.elementAt(10));
        bA = new Button((String)bU.elementAt(11));
        an = new Button((String)bU.elementAt(45));
        aj = new Label("");
        T = new Label("");
        H = new TextField(192);
        dg = new Checkbox((String)bU.elementAt(14));
        cH = new Checkbox((String)bU.elementAt(112));
        ef = new Choice();
        S = new Choice();
        aB = new Panel();
        cn = new Panel();
        dZ = new Label((String)bU.elementAt(179) + " :");
        b9 = new CheckboxGroup();
        cK = new Checkbox((String)bU.elementAt(47), b9, false);
        dt = new Checkbox((String)bU.elementAt(46), b9, false);
        bh = new Checkbox((String)bU.elementAt(49), b9, true);
        dJ.setLayout(new BorderLayout(0, 0));
        dJ.add("Center", D);
        dJ.add("East", az);
        ei.setLayout(new BorderLayout(0, 0));
        ei.add("Center", dT);
        ei.add("East", dp);
        dw.setLayout(new BorderLayout(0, 0));
        dw.add("Center", aL);
        dw.add("East", cF);
        GridBagLayout gridbaglayout = new GridBagLayout();
        cc.setLayout(gridbaglayout);
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        gridbagconstraints.weightx = 1.0D;
        gridbagconstraints.weighty = 0.0D;
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.fill = 1;
        gridbaglayout.setConstraints(dZ, gridbagconstraints);
        cc.add(dZ);
        gridbagconstraints.gridx = 1;
        gridbaglayout.setConstraints(cK, gridbagconstraints);
        cc.add(cK);
        gridbagconstraints.gridx = 2;
        gridbaglayout.setConstraints(bh, gridbagconstraints);
        cc.add(bh);
        GridBagLayout gridbaglayout1 = new GridBagLayout();
        aD.setLayout(gridbaglayout1);
        GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
        gridbagconstraints1.gridx = 0;
        gridbagconstraints1.gridy = 0;
        gridbagconstraints1.gridwidth = 3;
        gridbagconstraints1.weightx = 3D;
        gridbagconstraints1.weighty = 1.0D;
        gridbagconstraints1.fill = 1;
        gridbagconstraints1.insets.top = 4;
        gridbagconstraints1.insets.left = 4;
        gridbagconstraints1.insets.bottom = 4;
        gridbagconstraints1.insets.right = 4;
        gridbaglayout1.setConstraints(dw, gridbagconstraints1);
        aD.add(dw);
        gridbagconstraints1.gridy = 1;
        gridbagconstraints1.weighty = 0.0D;
        gridbagconstraints1.fill = 2;
        gridbaglayout1.setConstraints(T, gridbagconstraints1);
        aD.add(T);
        gridbagconstraints1.gridy = 2;
        gridbagconstraints1.gridwidth = 2;
        gridbagconstraints1.weightx = 1.0D;
        gridbaglayout1.setConstraints(cc, gridbagconstraints1);
        aD.add(cc);
        gridbagconstraints1.gridwidth = 1;
        gridbagconstraints1.gridy = 3;
        gridbaglayout1.setConstraints(aE, gridbagconstraints1);
        aD.add(aE);
        gridbagconstraints1.gridx = 1;
        gridbaglayout1.setConstraints(bA, gridbagconstraints1);
        aD.add(bA);
        if(!ep)
        {
            if(!ab[4])
            {
                gridbagconstraints1.gridy = 4;
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridwidth = 2;
                gridbaglayout1.setConstraints(bc, gridbagconstraints1);
                aD.add(bc);
                bc.setBackground(Color.orange);
            }
        } else
        {
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 4;
            gridbaglayout1.setConstraints(cY, gridbagconstraints1);
            aD.add(cY);
            gridbagconstraints1.gridx = 1;
            gridbaglayout1.setConstraints(an, gridbagconstraints1);
            aD.add(an);
            an.setBackground(Color.red);
        }
        ef.addItem(em[0]);
        ef.addItem(em[1]);
        ef.addItem(em[2]);
        ef.addItem(em[3]);
        ef.addItem(em[4]);
        ef.addItem(em[5]);
        ef.addItem(em[6]);
        ef.addItem(em[7]);
        ef.addItem(em[8]);
        ef.addItem(em[9]);
        ef.addItem(em[10]);
        ef.addItem(em[11]);
        S.addItem(ey[0]);
        S.addItem(ey[1]);
        S.addItem(ey[2]);
        S.addItem(ey[3]);
        bH.setLayout(new BorderLayout(0, 8));
        GridBagLayout gridbaglayout2 = new GridBagLayout();
        K.setLayout(gridbaglayout2);
        GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
        gridbagconstraints2.gridx = 0;
        gridbagconstraints2.gridy = 0;
        gridbagconstraints2.gridwidth = 6;
        gridbagconstraints2.weightx = 1.0D;
        gridbagconstraints2.weighty = 1.0D;
        gridbagconstraints2.fill = 1;
        gridbagconstraints2.insets.top = 4;
        gridbagconstraints2.insets.left = 4;
        gridbagconstraints2.insets.bottom = 4;
        gridbagconstraints2.insets.right = 4;
        gridbaglayout2.setConstraints(ei, gridbagconstraints2);
        K.add(ei);
        gridbagconstraints2.gridy = 1;
        gridbagconstraints2.weighty = 0.0D;
        gridbagconstraints2.fill = 2;
        gridbaglayout2.setConstraints(aj, gridbagconstraints2);
        K.add(aj);
        gridbagconstraints2.gridx = 0;
        gridbagconstraints2.gridy = 2;
        gridbagconstraints2.gridwidth = 1;
        gridbagconstraints2.weightx = 0.0D;
        gridbaglayout2.setConstraints(dg, gridbagconstraints2);
        K.add(dg);
        dg.setBackground(Color.lightGray);
        gridbagconstraints2.gridx = 1;
        gridbagconstraints2.gridwidth = 5;
        gridbaglayout2.setConstraints(H, gridbagconstraints2);
        K.add(H);
        gridbagconstraints2.gridx = 0;
        gridbagconstraints2.gridy = 3;
        gridbagconstraints2.gridwidth = 1;
        gridbaglayout2.setConstraints(cH, gridbagconstraints2);
        K.add(cH);
        cH.setBackground(Color.lightGray);
        cH.enable();
        gridbagconstraints2.gridx = 1;
        gridbaglayout2.setConstraints(ef, gridbagconstraints2);
        K.add(ef);
        gridbagconstraints2.gridx = 2;
        gridbaglayout2.setConstraints(S, gridbagconstraints2);
        K.add(S);
        if(!ep)
        {
            gridbagconstraints2.gridx = 3;
            gridbagconstraints2.gridwidth = 2;
            gridbagconstraints2.weightx = 1.0D;
            gridbaglayout2.setConstraints(aB, gridbagconstraints2);
            K.add(aB);
        } else
        {
            gridbagconstraints2.gridx = 3;
            gridbagconstraints2.gridwidth = 1;
            gridbagconstraints2.weightx = 1.0D;
            gridbaglayout2.setConstraints(aB, gridbagconstraints2);
            K.add(aB);
        }
        gridbagconstraints2.gridwidth = 1;
        gridbagconstraints2.weightx = 0.0D;
        gridbagconstraints2.gridx = 5;
        gridbaglayout2.setConstraints(eH, gridbagconstraints2);
        K.add(eH);
        GridBagLayout gridbaglayout3 = new GridBagLayout();
        dr.setLayout(gridbaglayout3);
        GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
        gridbagconstraints3.gridx = 0;
        gridbagconstraints3.gridy = 0;
        gridbagconstraints3.gridwidth = 1;
        gridbagconstraints3.weightx = 1.0D;
        gridbagconstraints3.weighty = 1.0D;
        gridbagconstraints3.fill = 1;
        gridbagconstraints3.insets.top = 4;
        gridbagconstraints3.insets.left = 4;
        gridbagconstraints3.insets.bottom = 4;
        gridbagconstraints3.insets.right = 4;
        gridbaglayout3.setConstraints(dJ, gridbagconstraints3);
        dr.add(dJ);
        bH.setLayout(new BorderLayout(0, 0));
        bH.add("Center", K);
        F.setLayout(new BorderLayout(0, 0));
        F.add("Center", aD);
        aU.setLayout(new BorderLayout(0, 0));
        aU.add("Center", dr);
        d9.a((String)bU.elementAt(195), F, 0, -1, "");
        d9.enable();
        d9.repaint();
        GridBagLayout gridbaglayout4 = new GridBagLayout();
        es.setLayout(gridbaglayout4);
        GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
        gridbagconstraints4.gridx = 0;
        gridbagconstraints4.gridy = 0;
        gridbagconstraints4.weightx = 1.0D;
        gridbagconstraints4.weighty = 1.0D;
        gridbagconstraints4.fill = 1;
        gridbaglayout4.setConstraints(d9, gridbagconstraints4);
        es.add(d9);
        GridBagLayout gridbaglayout5 = new GridBagLayout();
        eo.setLayout(gridbaglayout5);
        GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
        gridbagconstraints5.gridx = 0;
        gridbagconstraints5.gridy = 0;
        gridbagconstraints5.gridheight = 1;
        gridbagconstraints5.gridwidth = 1;
        gridbagconstraints5.weightx = 3D;
        gridbagconstraints5.weighty = 1.0D;
        gridbagconstraints5.fill = 1;
        gridbagconstraints5.insets.top = 4;
        gridbagconstraints5.insets.left = 4;
        gridbagconstraints5.insets.bottom = 4;
        gridbagconstraints5.insets.right = 4;
        gridbaglayout5.setConstraints(bH, gridbagconstraints5);
        eo.add(bH);
        gridbagconstraints5.gridheight = 1;
        gridbagconstraints5.gridx = 1;
        gridbagconstraints5.gridy = 0;
        gridbagconstraints5.weightx = 0.0D;
        gridbaglayout5.setConstraints(es, gridbagconstraints5);
        eo.add(es);
        N = new Checkbox((String)bU.elementAt(19));
        _fldbyte = new Checkbox((String)bU.elementAt(189), ab[6]);
        cy = new Button((String)bU.elementAt(27));
        cG = new i(aY);
        cG.setVisible(true);
        cG.setLocation(0, 0);
        cG.setSize(190, 100);
        au = new a((String)bU.elementAt(173));
        P = new Label((String)bU.elementAt(174) + " :");
        R = new Button((String)bU.elementAt(178));
        ci = new Button((String)bU.elementAt(180));
        cJ = new Button((String)bU.elementAt(120));
        String as1[] = null;
        try
        {
            Class class1 = Class.forName("com.ms.awt.FontX");
            Method method = class1.getMethod("getFontList", null);
            as1 = (String[])method.invoke(null, null);
        }
        catch(Exception exception)
        {
            c6 = false;
        }
        if(as1 != null)
        {
            int i1 = 0;
            a(as1, 0, as1.length - 1);
            for(int j1 = 0; j1 < as1.length; j1++)
            {
                if(as1[j1].compareTo(C) == 0)
                    i1 = j1;
                eC.addItem(as1[j1]);
            }

            eC.select(i1);
        } else
        {
            c6 = false;
        }
        b.setLayout(new BorderLayout(0, 0));
        b.add("Center", q);
        b.add("East", L);
        try
        {
            if(Integer.parseInt(M) < 18)
            {
                String s1 = new String("0102" + (String)bU.elementAt(111));
                q.a(new net.spray.chat.a.b("", "", s1, "", "", "", "", "", "", "", "", false));
            }
        }
        catch(Exception exception1) { }
        GridBagLayout gridbaglayout6 = new GridBagLayout();
        dS.setLayout(gridbaglayout6);
        GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
        gridbagconstraints6.gridx = 0;
        gridbagconstraints6.gridy = 0;
        gridbagconstraints6.gridwidth = 4;
        gridbagconstraints6.weightx = 1.0D;
        gridbagconstraints6.weighty = 1.0D;
        gridbagconstraints6.fill = 1;
        gridbagconstraints6.insets.top = 4;
        gridbagconstraints6.insets.left = 4;
        gridbagconstraints6.insets.bottom = 4;
        gridbagconstraints6.insets.right = 4;
        gridbaglayout6.setConstraints(b, gridbagconstraints6);
        dS.add(b);
        if(ep)
        {
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 1;
            gridbagconstraints6.gridwidth = 1;
            gridbagconstraints6.weightx = 0.0D;
            gridbagconstraints6.weighty = 0.0D;
            gridbaglayout6.setConstraints(cy, gridbagconstraints6);
            dS.add(cy);
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridwidth = 3;
            gridbaglayout6.setConstraints(N, gridbagconstraints6);
            dS.add(N);
        }
        o = new a((String)bU.elementAt(23));
        o.setLayout(new BorderLayout(8, 8));
        o.add("Center", dS);
        GridBagLayout gridbaglayout7 = new GridBagLayout();
        aG.setLayout(gridbaglayout7);
        GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
        gridbagconstraints7.gridx = 0;
        gridbagconstraints7.gridy = 0;
        gridbagconstraints7.fill = 1;
        gridbagconstraints7.weightx = 0.0D;
        gridbagconstraints7.weighty = 0.0D;
        gridbagconstraints7.gridwidth = 2;
        gridbagconstraints7.insets.top = 4;
        gridbagconstraints7.insets.left = 4;
        gridbagconstraints7.insets.bottom = 4;
        gridbagconstraints7.insets.right = 4;
        gridbaglayout7.setConstraints(cG, gridbagconstraints7);
        aG.add(cG);
        int k1 = 1;
        if(c6)
        {
            gridbagconstraints7.weightx = 0.0D;
            gridbagconstraints7.gridy = k1;
            gridbagconstraints7.gridwidth = 1;
            gridbaglayout7.setConstraints(P, gridbagconstraints7);
            aG.add(P);
            gridbagconstraints7.gridx = 1;
            gridbaglayout7.setConstraints(eC, gridbagconstraints7);
            aG.add(eC);
            k1++;
        }
        gridbagconstraints7.gridx = 0;
        gridbagconstraints7.gridy = k1 + 1;
        gridbagconstraints7.weightx = 0.0D;
        gridbagconstraints7.gridwidth = 2;
        gridbaglayout7.setConstraints(_fldbyte, gridbagconstraints7);
        aG.add(_fldbyte);
        gridbagconstraints7.gridx = 0;
        gridbagconstraints7.gridy = k1 + 2;
        gridbagconstraints7.weightx = 0.0D;
        gridbagconstraints7.gridwidth = 2;
        gridbaglayout7.setConstraints(R, gridbagconstraints7);
        aG.add(R);
        gridbagconstraints7.gridy = k1 + 3;
        gridbaglayout7.setConstraints(ci, gridbagconstraints7);
        aG.add(ci);
        gridbagconstraints7.gridy = k1 + 4;
        gridbagconstraints7.gridwidth = 2;
        gridbaglayout7.setConstraints(cJ, gridbagconstraints7);
        aG.add(cJ);
        au.setLayout(new BorderLayout(8, 8));
        au.add("Center", aG);
        GridBagLayout gridbaglayout8 = new GridBagLayout();
        cl.setLayout(gridbaglayout8);
        GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
        gridbagconstraints8.gridx = 0;
        gridbagconstraints8.fill = 1;
        gridbagconstraints8.gridwidth = 1;
        gridbagconstraints8.weightx = 0.0D;
        gridbagconstraints8.weighty = 0.0D;
        gridbagconstraints8.gridy = 0;
        gridbaglayout8.setConstraints(au, gridbagconstraints8);
        cl.add(au);
        gridbagconstraints8.weighty = 1.0D;
        gridbagconstraints8.gridy = 1;
        gridbaglayout8.setConstraints(ce, gridbagconstraints8);
        cl.add(ce);
        GridBagLayout gridbaglayout9 = new GridBagLayout();
        bj.setLayout(gridbaglayout9);
        GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
        gridbagconstraints9.gridx = 0;
        gridbagconstraints9.gridy = 0;
        gridbagconstraints9.gridheight = 1;
        gridbagconstraints9.gridwidth = 1;
        gridbagconstraints9.weightx = 1.0D;
        gridbagconstraints9.weighty = 1.0D;
        gridbagconstraints9.fill = 1;
        gridbagconstraints9.insets.top = 4;
        gridbagconstraints9.insets.left = 4;
        gridbagconstraints9.insets.bottom = 4;
        gridbagconstraints9.insets.right = 4;
        gridbaglayout9.setConstraints(o, gridbagconstraints9);
        bj.add(o);
        if(!ab[5])
        {
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.weightx = 0.0D;
            gridbagconstraints9.weighty = 0.0D;
            gridbaglayout9.setConstraints(cl, gridbagconstraints9);
            bj.add(cl);
        }
        b1 = new Button((String)bU.elementAt(24));
        ev = new Button((String)bU.elementAt(25));
        c1 = new Button((String)bU.elementAt(26));
        bp = new Button((String)bU.elementAt(27));
        a5 = new Button((String)bU.elementAt(27));
        de = new Button((String)bU.elementAt(28));
        de.setBackground(Color.orange);
        de.setBackground(Color.red);
        aC = new Label((String)bU.elementAt(29));
        bM = new Label((String)bU.elementAt(30) + " :");
        dC = new Label((String)bU.elementAt(30) + " :");
        ds = new a((String)bU.elementAt(31));
        cE = new a((String)bU.elementAt(32));
        ej = new a((String)bU.elementAt(33));
        bK[0] = new Checkbox((String)bU.elementAt(34), bo, true);
        bK[1] = new Checkbox((String)bU.elementAt(35), bo, false);
        bL.setLayout(new BorderLayout(0, 0));
        bL.add("Center", cB);
        bL.add("East", d4);
        GridBagLayout gridbaglayout10 = new GridBagLayout();
        dV.setLayout(gridbaglayout10);
        GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
        gridbagconstraints10.gridx = 0;
        gridbagconstraints10.gridy = 0;
        gridbagconstraints10.gridwidth = 1;
        gridbagconstraints10.weightx = 0.0D;
        gridbagconstraints10.weighty = 0.0D;
        gridbagconstraints10.fill = 1;
        gridbagconstraints10.insets.top = 4;
        gridbagconstraints10.insets.left = 4;
        gridbagconstraints10.insets.bottom = 4;
        gridbagconstraints10.insets.right = 4;
        gridbaglayout10.setConstraints(b1, gridbagconstraints10);
        dV.add(b1);
        gridbagconstraints10.gridx = 1;
        gridbaglayout10.setConstraints(ev, gridbagconstraints10);
        dV.add(ev);
        gridbagconstraints10.gridx = 2;
        gridbagconstraints10.weightx = 1.0D;
        gridbagconstraints10.gridwidth = 1;
        gridbaglayout10.setConstraints(z, gridbagconstraints10);
        dV.add(z);
        gridbagconstraints10.gridx = 3;
        gridbagconstraints10.weightx = 0.0D;
        gridbagconstraints10.gridwidth = 2;
        gridbaglayout10.setConstraints(y, gridbagconstraints10);
        dV.add(y);
        gridbagconstraints10.gridx = 0;
        gridbagconstraints10.gridy = 1;
        gridbagconstraints10.gridwidth = 5;
        gridbagconstraints10.weighty = 1.0D;
        gridbagconstraints10.weightx = 1.0D;
        gridbaglayout10.setConstraints(bL, gridbagconstraints10);
        dV.add(bL);
        if(!ep)
        {
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 2;
            gridbagconstraints10.gridwidth = 4;
            gridbagconstraints10.weighty = 0.0D;
            gridbagconstraints10.weightx = 1.0D;
            gridbaglayout10.setConstraints(eM, gridbagconstraints10);
            dV.add(eM);
            gridbagconstraints10.gridx = 4;
            gridbagconstraints10.gridwidth = 1;
            gridbagconstraints10.weightx = 0.0D;
            gridbaglayout10.setConstraints(bp, gridbagconstraints10);
            dV.add(bp);
        } else
        {
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 2;
            gridbagconstraints10.gridwidth = 3;
            gridbagconstraints10.weighty = 0.0D;
            gridbagconstraints10.weightx = 1.0D;
            gridbaglayout10.setConstraints(eM, gridbagconstraints10);
            dV.add(eM);
            gridbagconstraints10.gridx = 3;
            gridbagconstraints10.gridwidth = 1;
            gridbagconstraints10.weightx = 0.0D;
            gridbaglayout10.setConstraints(bp, gridbagconstraints10);
            dV.add(bp);
            gridbagconstraints10.gridx = 4;
            gridbaglayout10.setConstraints(de, gridbagconstraints10);
            dV.add(de);
        }
        GridBagLayout gridbaglayout11 = new GridBagLayout();
        a9.setLayout(gridbaglayout11);
        GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
        gridbagconstraints11.gridx = 1;
        gridbagconstraints11.gridy = 0;
        gridbagconstraints11.gridwidth = 1;
        gridbagconstraints11.weightx = 0.0D;
        gridbagconstraints11.weighty = 0.0D;
        gridbagconstraints11.fill = 1;
        gridbagconstraints11.insets.top = 4;
        gridbagconstraints11.insets.left = 4;
        gridbagconstraints11.insets.bottom = 4;
        gridbagconstraints11.insets.right = 4;
        gridbagconstraints11.gridx = 0;
        gridbaglayout11.setConstraints(dC, gridbagconstraints11);
        a9.add(dC);
        gridbagconstraints11.gridx = 1;
        gridbagconstraints11.weightx = 1.0D;
        gridbaglayout11.setConstraints(eJ, gridbagconstraints11);
        a9.add(eJ);
        gridbagconstraints11.gridx = 2;
        gridbagconstraints11.weightx = 0.0D;
        gridbaglayout11.setConstraints(a5, gridbagconstraints11);
        a9.add(a5);
        GridBagLayout gridbaglayout12 = new GridBagLayout();
        cW.setLayout(gridbaglayout12);
        GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
        gridbagconstraints12.gridx = 0;
        gridbagconstraints12.gridy = 0;
        gridbagconstraints12.gridheight = 1;
        gridbagconstraints12.gridwidth = 1;
        gridbagconstraints12.weightx = 0.0D;
        gridbagconstraints12.weighty = 0.0D;
        gridbagconstraints12.fill = 1;
        gridbagconstraints12.insets.top = 4;
        gridbagconstraints12.insets.left = 4;
        gridbagconstraints12.insets.bottom = 4;
        gridbagconstraints12.insets.right = 4;
        gridbaglayout12.setConstraints(aC, gridbagconstraints12);
        cW.add(aC);
        gridbagconstraints12.gridx = 1;
        gridbaglayout12.setConstraints(bK[0], gridbagconstraints12);
        cW.add(bK[0]);
        bK[0].setBackground(Color.lightGray);
        gridbagconstraints12.gridx = 2;
        gridbagconstraints12.gridwidth = 2;
        gridbaglayout12.setConstraints(bK[1], gridbagconstraints12);
        cW.add(bK[1]);
        bK[1].setBackground(Color.lightGray);
        gridbagconstraints12.gridwidth = 1;
        gridbagconstraints12.gridx = 0;
        gridbagconstraints12.gridy = 2;
        gridbaglayout12.setConstraints(bM, gridbagconstraints12);
        cW.add(bM);
        gridbagconstraints12.gridx = 1;
        gridbagconstraints12.weightx = 1.0D;
        gridbagconstraints12.gridwidth = 2;
        gridbaglayout12.setConstraints(aJ, gridbagconstraints12);
        cW.add(aJ);
        gridbagconstraints12.gridx = 3;
        gridbagconstraints12.weightx = 0.0D;
        gridbaglayout12.setConstraints(c1, gridbagconstraints12);
        cW.add(c1);
        ds.setLayout(new BorderLayout(0, 0));
        ds.add("Center", dV);
        cE.setLayout(new BorderLayout(0, 0));
        cE.add("Center", cW);
        ej.setLayout(new BorderLayout(0, 0));
        ej.add("Center", a9);
        GridBagLayout gridbaglayout13 = new GridBagLayout();
        c9.setLayout(gridbaglayout13);
        GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
        gridbagconstraints13.gridx = 0;
        gridbagconstraints13.gridy = 0;
        gridbagconstraints13.gridheight = 3;
        gridbagconstraints13.gridwidth = 1;
        gridbagconstraints13.weightx = 2D;
        gridbagconstraints13.weighty = 1.0D;
        gridbagconstraints13.fill = 1;
        gridbagconstraints13.insets.top = 4;
        gridbagconstraints13.insets.left = 4;
        gridbagconstraints13.insets.bottom = 4;
        gridbagconstraints13.insets.right = 4;
        gridbaglayout13.setConstraints(ds, gridbagconstraints13);
        c9.add(ds);
        gridbagconstraints13.gridx = 1;
        gridbagconstraints13.weighty = 0.0D;
        gridbagconstraints13.weightx = 0.0D;
        gridbagconstraints13.gridheight = 1;
        gridbaglayout13.setConstraints(cE, gridbagconstraints13);
        c9.add(cE);
        gridbagconstraints13.gridy = 1;
        gridbaglayout13.setConstraints(ej, gridbagconstraints13);
        c9.add(ej);
        gridbagconstraints13.gridy = 2;
        gridbagconstraints13.weighty = 1.0D;
        gridbaglayout13.setConstraints(_fldif, gridbagconstraints13);
        c9.add(_fldif);
        for(int l1 = 0; l1 < 20; l1++)
        {
            _fldvoid[l1] = -1L;
            ea[l1] = -1L;
            f[l1] = 0;
            c5[l1] = false;
            c2[l1] = false;
            s[l1] = new a();
            er[l1] = new a((String)bU.elementAt(141));
            cS[l1] = new a((String)bU.elementAt(3));
            cS[l1].a(false);
            e[l1] = new Button((String)bU.elementAt(41));
            dA[l1] = new Button((String)bU.elementAt(10));
            dH[l1] = new Button((String)bU.elementAt(145));
            dH[l1].disable();
            du[l1] = new Button((String)bU.elementAt(147));
            du[l1].disable();
            dc[l1] = new Button((String)bU.elementAt(148));
            dc[l1].disable();
            w[l1] = new Button((String)bU.elementAt(12));
            w[l1].setBackground(Color.orange);
            w[l1].disable();
            ah[l1] = new Button((String)bU.elementAt(13));
            ah[l1].disable();
            d6[l1] = new Button((String)bU.elementAt(20));
            d6[l1].disable();
            U[l1] = new Checkbox((String)bU.elementAt(188), false);
            cT[l1] = new TextField(192);
            bf[l1] = new Choice();
            eF[l1] = new Choice();
            u[l1] = new Button((String)bU.elementAt(44));
            c3[l1] = new Panel();
            ac[l1] = new Panel();
            b3[l1] = new Panel();
            bP[l1] = new Panel();
            _fldnull[l1] = new Panel();
            bP[l1].setVisible(false);
            bv[l1] = new Panel();
            dz[l1] = new Panel();
            _fldnew[l1] = new Panel();
            ar[l1] = new Button((String)bU.elementAt(45));
            dn[l1] = new Panel();
            bb[l1] = new d();
            bb[l1].a();
            bz[l1] = new Panel();
            ai[l1] = new Panel();
            dN[l1] = new j(1);
            by[l1] = new c(dN[l1], aQ, _fldcase);
            dG[l1] = new j(1);
            bR[l1] = new g(dG[l1], 60, false, true, "", "Helvetica", 10, 2, 4, true, true, ab[6], "> ", 0, -1, c10._mthdo());
            c3[l1].setLayout(new BorderLayout(0, 0));
            c3[l1].add("Center", bR[l1]);
            c3[l1].add("East", dG[l1]);
            bd[l1] = new a((String)bU.elementAt(194));
            bf[l1].addItem(em[0]);
            bf[l1].addItem(em[1]);
            bf[l1].addItem(em[2]);
            bf[l1].addItem(em[3]);
            bf[l1].addItem(em[4]);
            bf[l1].addItem(em[5]);
            bf[l1].addItem(em[6]);
            bf[l1].addItem(em[7]);
            bf[l1].addItem(em[8]);
            bf[l1].addItem(em[9]);
            bf[l1].addItem(em[10]);
            bf[l1].addItem(em[11]);
            eF[l1].addItem(ey[0]);
            eF[l1].addItem(ey[1]);
            eF[l1].addItem(ey[2]);
            eF[l1].addItem(ey[3]);
            s[l1].setLayout(new BorderLayout(0, 8));
            GridBagLayout gridbaglayout14 = new GridBagLayout();
            ac[l1].setLayout(gridbaglayout14);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 0;
            gridbagconstraints14.gridy = 0;
            gridbagconstraints14.gridwidth = 8;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.weighty = 1.0D;
            gridbagconstraints14.fill = 1;
            gridbagconstraints14.insets.top = 4;
            gridbagconstraints14.insets.left = 4;
            gridbagconstraints14.insets.bottom = 4;
            gridbagconstraints14.insets.right = 4;
            gridbaglayout14.setConstraints(c3[l1], gridbagconstraints14);
            ac[l1].add(c3[l1]);
            gridbagconstraints14.gridx = 0;
            gridbagconstraints14.gridy = 1;
            gridbagconstraints14.weighty = 0.0D;
            gridbaglayout14.setConstraints(cT[l1], gridbagconstraints14);
            ac[l1].add(cT[l1]);
            gridbagconstraints14.gridy = 2;
            gridbagconstraints14.gridx = 0;
            gridbagconstraints14.gridwidth = 1;
            gridbagconstraints14.weightx = 0.0D;
            gridbaglayout14.setConstraints(bf[l1], gridbagconstraints14);
            ac[l1].add(bf[l1]);
            gridbagconstraints14.gridx = 1;
            gridbaglayout14.setConstraints(eF[l1], gridbagconstraints14);
            ac[l1].add(eF[l1]);
            int j2 = 0;
            if(!ep)
                j2++;
            gridbagconstraints14.gridx = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.gridwidth = 1 + j2;
            gridbaglayout14.setConstraints(dz[l1], gridbagconstraints14);
            ac[l1].add(dz[l1]);
            gridbagconstraints14.weightx = 0.0D;
            gridbagconstraints14.gridwidth = 1;
            if(ep)
            {
                gridbagconstraints14.gridx = 3 + j2;
                gridbagconstraints14.weightx = 0.0D;
                gridbaglayout14.setConstraints(ar[l1], gridbagconstraints14);
                ar[l1].setBackground(Color.orange);
                ac[l1].add(ar[l1]);
            }
            gridbagconstraints14.gridx = 4 + j2;
            gridbaglayout14.setConstraints(e[l1], gridbagconstraints14);
            ac[l1].add(e[l1]);
            gridbagconstraints14.gridx = 5 + j2;
            gridbaglayout14.setConstraints(u[l1], gridbagconstraints14);
            ac[l1].add(u[l1]);
            gridbagconstraints14.gridx = 6 + j2;
            gridbaglayout14.setConstraints(dA[l1], gridbagconstraints14);
            ac[l1].add(dA[l1]);
            s[l1].setLayout(new BorderLayout(0, 0));
            s[l1].add("Center", ac[l1]);
            GridBagLayout gridbaglayout16 = new GridBagLayout();
            _fldnull[l1].setLayout(gridbaglayout16);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            if(!ab[0] || !ab[1] || !ab[2] || !ab[3])
            {
                gridbagconstraints16.weighty = 0.0D;
                gridbagconstraints16.weightx = 1.0D;
                gridbagconstraints16.gridwidth = 1;
                gridbagconstraints16.gridx = 0;
                gridbagconstraints16.fill = 2;
                int k2 = 0;
                GridBagLayout gridbaglayout20 = new GridBagLayout();
                b3[l1].setLayout(gridbaglayout20);
                GridBagConstraints gridbagconstraints20 = new GridBagConstraints();
                gridbagconstraints20.weighty = 0.0D;
                gridbagconstraints20.weightx = 1.0D;
                gridbagconstraints20.fill = 2;
                gridbagconstraints20.gridx = 0;
                gridbagconstraints20.insets.top = 4;
                gridbagconstraints20.insets.left = 4;
                gridbagconstraints20.insets.bottom = 4;
                gridbagconstraints20.insets.right = 4;
                gridbagconstraints20.gridy = 0;
                gridbaglayout20.setConstraints(U[l1], gridbagconstraints20);
                b3[l1].add(U[l1]);
                if(!ab[0] || !ab[1] || !ab[2])
                {
                    int l2 = 1;
                    if(!ab[2])
                    {
                        gridbagconstraints20.gridy = l2;
                        gridbaglayout20.setConstraints(du[l1], gridbagconstraints20);
                        b3[l1].add(du[l1]);
                        l2++;
                    }
                    if(!ab[0])
                    {
                        dc[l1].setBackground(Color.orange);
                        gridbagconstraints20.gridy = l2;
                        gridbaglayout20.setConstraints(dc[l1], gridbagconstraints20);
                        b3[l1].add(dc[l1]);
                        l2++;
                    }
                    if(!ab[1])
                    {
                        gridbagconstraints20.gridy = l2;
                        gridbaglayout20.setConstraints(dH[l1], gridbagconstraints20);
                        b3[l1].add(dH[l1]);
                        l2++;
                    }
                }
                er[l1].setLayout(new BorderLayout(0, 0));
                er[l1].add("Center", b3[l1]);
                gridbagconstraints16.gridy = k2;
                gridbaglayout16.setConstraints(er[l1], gridbagconstraints16);
                _fldnull[l1].add(er[l1]);
                k2++;
                if(!ab[3])
                {
                    GridBagLayout gridbaglayout23 = new GridBagLayout();
                    bP[l1].setLayout(gridbaglayout23);
                    GridBagConstraints gridbagconstraints23 = new GridBagConstraints();
                    gridbagconstraints23.weighty = 0.0D;
                    gridbagconstraints23.weightx = 1.0D;
                    gridbagconstraints23.gridwidth = 1;
                    gridbagconstraints23.fill = 2;
                    gridbagconstraints23.gridx = 0;
                    gridbagconstraints23.insets.top = 4;
                    gridbagconstraints23.insets.left = 4;
                    gridbagconstraints23.insets.bottom = 4;
                    gridbagconstraints23.insets.right = 4;
                    gridbagconstraints23.gridy = 0;
                    gridbaglayout23.setConstraints(w[l1], gridbagconstraints23);
                    bP[l1].add(w[l1]);
                    gridbagconstraints23.gridy = 1;
                    gridbaglayout23.setConstraints(ah[l1], gridbagconstraints23);
                    bP[l1].add(ah[l1]);
                    gridbagconstraints23.gridy = 2;
                    gridbaglayout23.setConstraints(d6[l1], gridbagconstraints23);
                    bP[l1].add(d6[l1]);
                    cS[l1].setLayout(new BorderLayout(0, 0));
                    cS[l1].add("Center", bP[l1]);
                    gridbagconstraints16.gridy = k2;
                    gridbaglayout16.setConstraints(cS[l1], gridbagconstraints16);
                    _fldnull[l1].add(cS[l1]);
                    k2++;
                }
                gridbagconstraints16.gridy = k2;
                gridbagconstraints16.weighty = 1.0D;
                gridbaglayout16.setConstraints(_fldnew[l1], gridbagconstraints16);
                _fldnull[l1].add(_fldnew[l1]);
            }
            ai[l1].setLayout(new BorderLayout(0, 0));
            ai[l1].add("Center", by[l1]);
            ai[l1].add("East", dN[l1]);
            GridBagLayout gridbaglayout18 = new GridBagLayout();
            bz[l1].setLayout(gridbaglayout18);
            GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
            gridbagconstraints18.gridx = 0;
            gridbagconstraints18.gridy = 0;
            gridbagconstraints18.gridwidth = 1;
            gridbagconstraints18.weightx = 1.0D;
            gridbagconstraints18.weighty = 1.0D;
            gridbagconstraints18.fill = 1;
            gridbagconstraints18.insets.top = 4;
            gridbagconstraints18.insets.left = 4;
            gridbagconstraints18.insets.bottom = 4;
            gridbagconstraints18.insets.right = 4;
            gridbaglayout18.setConstraints(ai[l1], gridbagconstraints18);
            bz[l1].add(ai[l1]);
            bd[l1].setLayout(new BorderLayout(0, 0));
            bd[l1].add("Center", bz[l1]);
            bb[l1].a((String)bU.elementAt(43), _fldnull[l1], 0, -1, "");
            bb[l1].enable();
            bb[l1].repaint();
            GridBagLayout gridbaglayout21 = new GridBagLayout();
            dn[l1].setLayout(gridbaglayout21);
            GridBagConstraints gridbagconstraints21 = new GridBagConstraints();
            gridbagconstraints21.gridx = 0;
            gridbagconstraints21.gridy = 0;
            gridbagconstraints21.weightx = 1.0D;
            gridbagconstraints21.weighty = 1.0D;
            gridbagconstraints21.fill = 1;
            gridbaglayout21.setConstraints(bb[l1], gridbagconstraints21);
            dn[l1].add(bb[l1]);
            GridBagLayout gridbaglayout24 = new GridBagLayout();
            bv[l1].setLayout(gridbaglayout24);
            GridBagConstraints gridbagconstraints24 = new GridBagConstraints();
            gridbagconstraints24.gridx = 0;
            gridbagconstraints24.gridy = 0;
            gridbagconstraints24.gridheight = 1;
            gridbagconstraints24.gridwidth = 1;
            gridbagconstraints24.weightx = 1.0D;
            gridbagconstraints24.weighty = 1.0D;
            gridbagconstraints24.fill = 1;
            gridbagconstraints24.insets.top = 4;
            gridbagconstraints24.insets.left = 4;
            gridbagconstraints24.insets.bottom = 4;
            gridbagconstraints24.insets.right = 4;
            gridbaglayout24.setConstraints(s[l1], gridbagconstraints24);
            bv[l1].add(s[l1]);
            gridbagconstraints24.gridx = 1;
            gridbagconstraints24.weightx = 0.0D;
            gridbaglayout24.setConstraints(dn[l1], gridbagconstraints24);
            bv[l1].add(dn[l1]);
            bT[l1] = "";
            Y[l1] = "";
            cx[l1] = "";
            dv[l1] = false;
            eu[l1] = "";
            bG[l1] = "";
            b4[l1] = "";
        }

        n = new Label((String)bU.elementAt(46) + " :");
        cC = new Label((String)bU.elementAt(49) + " :");
        ax = new Label((String)bU.elementAt(108));
        a = new Button((String)bU.elementAt(50));
        t = new Button((String)bU.elementAt(51));
        dP = new Button((String)bU.elementAt(52));
        dL = new Button((String)bU.elementAt(53));
        ca = new TextField();
        for(int i2 = 0; i2 < E.length; i2++)
            ae.addItem(E[i2]);

        di.addItem(ct[0]);
        di.addItem(ct[1]);
        di.addItem(ct[2]);
        di.addItem(ct[3]);
        d3.addItem((String)bU.elementAt(109));
        d3.addItem((String)bU.elementAt(110));
        dD.setLayout(new BorderLayout(0, 0));
        dD.add("Center", cA);
        dD.add("East", ez);
        GridBagLayout gridbaglayout15 = new GridBagLayout();
        r.setLayout(gridbaglayout15);
        GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
        gridbagconstraints15.gridx = 0;
        gridbagconstraints15.gridy = 0;
        gridbagconstraints15.gridwidth = 5;
        gridbagconstraints15.weightx = 1.0D;
        gridbagconstraints15.weighty = 2D;
        gridbagconstraints15.fill = 1;
        gridbagconstraints15.insets.top = 4;
        gridbagconstraints15.insets.left = 4;
        gridbagconstraints15.insets.bottom = 4;
        gridbagconstraints15.insets.right = 4;
        gridbaglayout15.setConstraints(dD, gridbagconstraints15);
        r.add(dD);
        gridbagconstraints15.gridy = 1;
        gridbagconstraints15.weighty = 0.0D;
        gridbaglayout15.setConstraints(aW, gridbagconstraints15);
        r.add(aW);
        gridbagconstraints15.gridy = 2;
        gridbagconstraints15.gridwidth = 2;
        gridbagconstraints15.gridx = 0;
        gridbagconstraints15.weightx = 1.0D;
        gridbaglayout15.setConstraints(b7, gridbagconstraints15);
        r.add(b7);
        gridbagconstraints15.gridx = 2;
        gridbagconstraints15.weightx = 0.0D;
        gridbagconstraints15.gridwidth = 1;
        gridbaglayout15.setConstraints(a, gridbagconstraints15);
        r.add(a);
        gridbagconstraints15.gridx = 3;
        gridbaglayout15.setConstraints(t, gridbagconstraints15);
        r.add(t);
        gridbagconstraints15.gridx = 4;
        gridbaglayout15.setConstraints(dP, gridbagconstraints15);
        r.add(dP);
        GridBagLayout gridbaglayout17 = new GridBagLayout();
        al.setLayout(gridbaglayout17);
        GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridy = 0;
        gridbagconstraints17.gridheight = 1;
        gridbagconstraints17.gridwidth = 2;
        gridbagconstraints17.weightx = 0.0D;
        gridbagconstraints17.weighty = 0.0D;
        gridbagconstraints17.fill = 1;
        gridbagconstraints17.anchor = 13;
        gridbagconstraints17.insets.top = 4;
        gridbagconstraints17.insets.left = 4;
        gridbagconstraints17.insets.bottom = 4;
        gridbagconstraints17.insets.right = 4;
        gridbaglayout17.setConstraints(dh, gridbagconstraints17);
        al.add(dh);
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridy = 1;
        gridbaglayout17.setConstraints(d3, gridbagconstraints17);
        al.add(d3);
        gridbagconstraints17.gridy = 2;
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridwidth = 1;
        gridbaglayout17.setConstraints(ca, gridbagconstraints17);
        al.add(ca);
        gridbagconstraints17.gridx = 1;
        gridbaglayout17.setConstraints(ax, gridbagconstraints17);
        al.add(ax);
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridy = 3;
        gridbaglayout17.setConstraints(n, gridbagconstraints17);
        al.add(n);
        gridbagconstraints17.gridx = 1;
        gridbaglayout17.setConstraints(ae, gridbagconstraints17);
        al.add(ae);
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridy = 4;
        gridbaglayout17.setConstraints(cC, gridbagconstraints17);
        al.add(cC);
        gridbagconstraints17.gridx = 1;
        gridbaglayout17.setConstraints(di, gridbagconstraints17);
        al.add(di);
        gridbagconstraints17.gridx = 0;
        gridbagconstraints17.gridy = 5;
        gridbaglayout17.setConstraints(b6, gridbagconstraints17);
        al.add(b6);
        gridbagconstraints17.gridx = 1;
        gridbaglayout17.setConstraints(dL, gridbagconstraints17);
        al.add(dL);
        A = new a((String)bU.elementAt(81));
        eA = new a((String)bU.elementAt(82));
        A.setLayout(new BorderLayout(0, 0));
        A.add("Center", r);
        eA.setLayout(new BorderLayout(0, 0));
        eA.add("Center", al);
        GridBagLayout gridbaglayout19 = new GridBagLayout();
        eL.setLayout(gridbaglayout19);
        GridBagConstraints gridbagconstraints19 = new GridBagConstraints();
        gridbagconstraints19.gridx = 0;
        gridbagconstraints19.gridy = 0;
        gridbagconstraints19.gridheight = 5;
        gridbagconstraints19.gridwidth = 1;
        gridbagconstraints19.weightx = 1.0D;
        gridbagconstraints19.weighty = 1.0D;
        gridbagconstraints19.fill = 1;
        gridbagconstraints19.insets.top = 4;
        gridbagconstraints19.insets.left = 4;
        gridbagconstraints19.insets.bottom = 4;
        gridbagconstraints19.insets.right = 4;
        gridbaglayout19.setConstraints(A, gridbagconstraints19);
        eL.add(A);
        gridbagconstraints19.gridx = 1;
        gridbagconstraints19.weighty = 0.0D;
        gridbagconstraints19.gridheight = 1;
        gridbagconstraints19.weightx = 0.0D;
        gridbagconstraints19.fill = 1;
        gridbaglayout19.setConstraints(eA, gridbagconstraints19);
        eL.add(eA);
        gridbagconstraints19.gridy = 2;
        gridbagconstraints19.weighty = 1.0D;
        gridbaglayout19.setConstraints(W, gridbagconstraints19);
        eL.add(W);
        d7 = new a((String)bU.elementAt(118));
        l = new Button((String)bU.elementAt(50));
        J = new Button((String)bU.elementAt(145));
        d5 = new Button((String)bU.elementAt(121));
        el = new Label((String)bU.elementAt(122));
        d0 = new Label((String)bU.elementAt(123));
        b2 = new Label("");
        cU = new TextField((String)bU.elementAt(124), 80);
        a7 = new Button((String)bU.elementAt(139));
        am = new Button((String)bU.elementAt(133));
        db = new Button((String)bU.elementAt(150));
        dF = new Checkbox((String)bU.elementAt(184));
        ak = new a((String)bU.elementAt(132));
        d8[0] = new Label(X[0]);
        d8[1] = new Label(X[1]);
        d8[2] = new Label(X[2]);
        bg = new Label((String)bU.elementAt(130));
        et = new Label((String)bU.elementAt(131));
        ed = new Button((String)bU.elementAt(134));
        cf = new a((String)bU.elementAt(141));
        GridBagLayout gridbaglayout22 = new GridBagLayout();
        bZ.setLayout(gridbaglayout22);
        GridBagConstraints gridbagconstraints22 = new GridBagConstraints();
        gridbagconstraints22.gridx = 0;
        gridbagconstraints22.gridy = 0;
        gridbagconstraints22.gridwidth = 1;
        gridbagconstraints22.weightx = 1.0D;
        gridbagconstraints22.weighty = 0.0D;
        gridbagconstraints22.fill = 2;
        gridbagconstraints22.insets.top = 4;
        gridbagconstraints22.insets.left = 4;
        gridbagconstraints22.insets.bottom = 4;
        gridbagconstraints22.insets.right = 4;
        gridbaglayout22.setConstraints(dB, gridbagconstraints22);
        bZ.add(dB);
        gridbagconstraints22.gridx = 1;
        gridbaglayout22.setConstraints(bg, gridbagconstraints22);
        bZ.add(bg);
        gridbagconstraints22.gridx = 2;
        gridbaglayout22.setConstraints(et, gridbagconstraints22);
        bZ.add(et);
        for(int i3 = 0; i3 < 3; i3++)
        {
            bB[i3] = new Checkbox();
            ay[i3] = new Checkbox();
            gridbagconstraints22.gridy = i3 + 1;
            gridbagconstraints22.gridx = 0;
            gridbaglayout22.setConstraints(d8[i3], gridbagconstraints22);
            bZ.add(d8[i3]);
            gridbagconstraints22.gridx = 1;
            gridbaglayout22.setConstraints(bB[i3], gridbagconstraints22);
            bZ.add(bB[i3]);
            bB[i3].setBackground(Color.lightGray);
            gridbagconstraints22.gridx = 2;
            gridbaglayout22.setConstraints(ay[i3], gridbagconstraints22);
            bZ.add(ay[i3]);
            ay[i3].setBackground(Color.lightGray);
        }

        gridbagconstraints22.gridx = 0;
        gridbagconstraints22.gridy = 4;
        gridbagconstraints22.gridwidth = 3;
        gridbaglayout22.setConstraints(ed, gridbagconstraints22);
        bZ.add(ed);
        ak.setLayout(new BorderLayout(0, 0));
        ak.add("Center", bZ);
        GridBagLayout gridbaglayout25 = new GridBagLayout();
        cM.setLayout(gridbaglayout25);
        GridBagConstraints gridbagconstraints25 = new GridBagConstraints();
        if(!ab[0] || !ab[1] || !ab[2])
        {
            db.setBackground(Color.orange);
            gridbagconstraints25.gridx = 0;
            gridbagconstraints25.gridwidth = 1;
            gridbagconstraints25.weightx = 1.0D;
            gridbagconstraints25.weighty = 0.0D;
            gridbagconstraints25.fill = 2;
            gridbagconstraints25.insets.top = 4;
            gridbagconstraints25.insets.left = 4;
            gridbagconstraints25.insets.bottom = 4;
            gridbagconstraints25.insets.right = 4;
            int j3 = 0;
            if(!ab[1])
            {
                gridbagconstraints25.gridy = 0;
                gridbaglayout25.setConstraints(a7, gridbagconstraints25);
                cM.add(a7);
            } else
            {
                j3++;
            }
            if(!ab[2])
            {
                gridbagconstraints25.gridy = 1 - j3;
                gridbaglayout25.setConstraints(am, gridbagconstraints25);
                cM.add(am);
            } else
            {
                j3++;
            }
            if(!ab[0])
            {
                gridbagconstraints25.gridy = 2 - j3;
                gridbaglayout25.setConstraints(db, gridbagconstraints25);
                cM.add(db);
            }
            cf.setLayout(new BorderLayout(0, 0));
            cf.add("Center", cM);
        }
        aM.setLayout(new BorderLayout(0, 0));
        aM.add("Center", bN);
        aM.add("East", cu);
        GridBagLayout gridbaglayout26 = new GridBagLayout();
        bk.setLayout(gridbaglayout26);
        GridBagConstraints gridbagconstraints26 = new GridBagConstraints();
        gridbagconstraints26.gridx = 0;
        gridbagconstraints26.gridy = 0;
        gridbagconstraints26.gridwidth = 6;
        gridbagconstraints26.weightx = 1.0D;
        gridbagconstraints26.weighty = 2D;
        gridbagconstraints26.fill = 1;
        gridbagconstraints26.insets.top = 4;
        gridbagconstraints26.insets.left = 4;
        gridbagconstraints26.insets.bottom = 4;
        gridbagconstraints26.insets.right = 4;
        gridbaglayout26.setConstraints(aM, gridbagconstraints26);
        bk.add(aM);
        gridbagconstraints26.gridy = 1;
        gridbagconstraints26.weightx = 0.0D;
        gridbagconstraints26.weighty = 0.0D;
        gridbagconstraints26.gridwidth = 1;
        gridbaglayout26.setConstraints(d0, gridbagconstraints26);
        bk.add(d0);
        gridbagconstraints26.gridx = 2;
        gridbagconstraints26.weightx = 1.0D;
        gridbagconstraints26.weighty = 0.0D;
        gridbaglayout26.setConstraints(b2, gridbagconstraints26);
        bk.add(b2);
        gridbagconstraints26.gridx = 3;
        gridbagconstraints26.weightx = 0.0D;
        gridbagconstraints26.weighty = 0.0D;
        gridbagconstraints26.gridwidth = 4;
        gridbaglayout26.setConstraints(dF, gridbagconstraints26);
        bk.add(dF);
        gridbagconstraints26.gridx = 0;
        gridbagconstraints26.gridy = 2;
        gridbagconstraints26.weightx = 0.0D;
        gridbagconstraints26.gridwidth = 1;
        gridbaglayout26.setConstraints(el, gridbagconstraints26);
        bk.add(el);
        gridbagconstraints26.gridx = 1;
        gridbagconstraints26.weightx = 1.0D;
        int k3 = 0;
        if(ab[1])
        {
            gridbagconstraints26.gridwidth = 3;
            k3 = 1;
        } else
        {
            gridbagconstraints26.gridwidth = 2;
        }
        gridbaglayout26.setConstraints(cU, gridbagconstraints26);
        bk.add(cU);
        gridbagconstraints26.gridx = 3 + k3;
        gridbagconstraints26.gridwidth = 1;
        gridbagconstraints26.weightx = 0.0D;
        gridbaglayout26.setConstraints(d5, gridbagconstraints26);
        bk.add(d5);
        gridbagconstraints26.gridx = 4 + k3;
        gridbaglayout26.setConstraints(l, gridbagconstraints26);
        bk.add(l);
        if(!ab[1])
        {
            gridbagconstraints26.gridx = 5;
            gridbaglayout26.setConstraints(J, gridbagconstraints26);
            bk.add(J);
        }
        d7.setLayout(new BorderLayout(0, 0));
        d7.add("Center", bk);
        GridBagLayout gridbaglayout27 = new GridBagLayout();
        a0.setLayout(gridbaglayout27);
        GridBagConstraints gridbagconstraints27 = new GridBagConstraints();
        gridbagconstraints27.gridx = 0;
        gridbagconstraints27.gridy = 0;
        gridbagconstraints27.weightx = 1.0D;
        gridbagconstraints27.weighty = 0.0D;
        gridbagconstraints27.gridwidth = 1;
        gridbagconstraints27.gridheight = 3;
        gridbagconstraints27.fill = 1;
        gridbagconstraints27.insets.top = 4;
        gridbagconstraints27.insets.left = 4;
        gridbagconstraints27.insets.bottom = 4;
        gridbagconstraints27.insets.right = 4;
        gridbaglayout27.setConstraints(d7, gridbagconstraints27);
        a0.add(d7);
        gridbagconstraints27.gridx = 1;
        gridbagconstraints27.weightx = 0.0D;
        gridbagconstraints27.weighty = 0.0D;
        gridbagconstraints27.gridheight = 1;
        gridbaglayout27.setConstraints(ak, gridbagconstraints27);
        a0.add(ak);
        int l3 = 0;
        if(!ab[0] || !ab[1] || !ab[2])
        {
            gridbagconstraints27.gridy = 1;
            gridbagconstraints27.weightx = 0.0D;
            gridbagconstraints27.weighty = 0.0D;
            gridbaglayout27.setConstraints(cf, gridbagconstraints27);
            a0.add(cf);
        } else
        {
            l3 = 1;
        }
        gridbagconstraints27.gridy = 2 - l3;
        gridbagconstraints27.weightx = 0.0D;
        gridbagconstraints27.weighty = 1 + l3;
        gridbaglayout27.setConstraints(cQ, gridbagconstraints27);
        a0.add(cQ);
        dx = new d();
        if(C.equals(eC.getSelectedItem()))
            _mthbyte(C);
        if(aY != null)
            a(aY);
        if(m != null)
            dx._mthif(m);
        if(!bq)
            dx.a(_mthnew(dy), dX);
        if(!a4)
        {
            dx.a(at[0], c9, 0, -1, "");
            dx.a(at[1], eL, 0, -1, "");
        }
        dx.a(at[2], bj, 0, -1, "");
        if(!dR)
        {
            dx.a(at[3], a0, 0, -1, "");
            _fldelse = 0;
        } else
        {
            _fldelse = 1;
        }
        dx._mthif(at[2], 0, "");
        _fldcase.setLayout(null);
        _fldcase.removeAll();
        _fldcase.setLayout(new BorderLayout(0, 0));
        _fldcase.setBackground(Color.black);
        _fldcase.add("Center", dx);
        _fldcase.validate();
        _fldcase.setVisible(true);
        _fldcase.paintComponents(_fldcase.getGraphics());
    }

    public boolean a(Event event)
    {
        if(event.id == 1004)
        {
            cw = true;
            return true;
        }
        if(event.id == 1005)
        {
            cw = false;
            return true;
        }
        if(event.target == cu)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                bN._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == dp)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                dT._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == cF)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                aL._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == L)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                q._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == ez)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                cA._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == d4)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                cB._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == az)
        {
            switch(event.id)
            {
            case 601: // Event.SCROLL_LINE_UP
            case 602: // Event.SCROLL_LINE_DOWN
            case 603: // Event.SCROLL_PAGE_UP
            case 604: // Event.SCROLL_PAGE_DOWN
            case 605: // Event.SCROLL_ABSOLUTE
                D._mthbyte();
                break;
            }
            return true;
        }
        if(event.target == D)
        {
            String s1 = "";
            String s2 = "";
            s1 = D._mthif();
            if(s1 != null)
                if(D._mthtry())
                {
                    if(H.getText().length() > 0)
                        s2 = H.getText();
                    s2 = s2 + s1;
                    H.setText(s2);
                    H.requestFocus();
                    H.select(H.getText().length(), H.getText().length());
                    s2 = "";
                } else
                {
                    try
                    {
                        AppletContext appletcontext = _fldcase.getAppletContext();
                        appletcontext.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(197)), "empty");
                    }
                    catch(Exception exception)
                    {
                        System.err.println("malformed URL");
                    }
                }
            return true;
        }
        if(event.target == cA)
        {
            net.spray.chat.a.b b10 = cA._mthelse();
            if(b10 != null)
            {
                boolean flag = eD.contains(b10._mthif(0));
                if(b10._mthif(0).equals(dy))
                {
                    dP.disable();
                    t.disable();
                    a.disable();
                    aq = false;
                } else
                {
                    ao = b10._mthif(0);
                    ee = b10._mthif(1);
                    _fldint = b10._mthif(8);
                    if(!_fldint.equals(""))
                        dP.enable();
                    else
                        dP.disable();
                    t.enable();
                    if(bt.contains(ee + ao.substring(ao.lastIndexOf(":"))))
                    {
                        t.setLabel((String)bU.elementAt(75));
                        a.disable();
                        aq = false;
                    } else
                    {
                        t.setLabel((String)bU.elementAt(51));
                        if(!flag || ep)
                        {
                            a.enable();
                            a.setLabel((String)bU.elementAt(11));
                        } else
                        {
                            a.setLabel((String)bU.elementAt(126));
                            a.disable();
                        }
                        aq = true;
                    }
                    t.enable();
                }
                if("DoubleClic".equals((String)event.arg) && ee != null && ao != null)
                    _mthif(ee, ao);
            }
            return true;
        }
        if(event.target == bN)
        {
            net.spray.chat.a.b b11 = bN._mthelse();
            if(b11 != null)
                if(b11._mthif(0).equals(""))
                {
                    l.disable();
                    cm = false;
                } else
                {
                    _fldlong = b11._mthif(0);
                    as = b11._mthif(1);
                    a2 = b11._mthif(8);
                    int j1 = as.indexOf((String)bU.elementAt(129));
                    if(j1 != -1)
                        as = as.substring(j1 + ((String)bU.elementAt(129)).length() + 1);
                    if(bt.contains(as + _fldlong.substring(_fldlong.lastIndexOf(":"))))
                    {
                        l.disable();
                        cm = false;
                    } else
                    {
                        l.enable();
                        cm = true;
                    }
                }
            if("DoubleClic".equals((String)event.arg) && as != null && _fldlong != null)
                _mthif(as, _fldlong);
            return true;
        }
        if(event.target == q)
        {
            if(ep)
            {
                net.spray.chat.a.b b12 = q._mthelse();
                if(b12 != null)
                {
                    bn = b12._mthif(8);
                    if(bn.equals(""))
                        cy.disable();
                    else
                        cy.enable();
                }
            }
            return true;
        }
        if(event.target == cB)
        {
            net.spray.chat.a.b b13 = cB._mthelse();
            if(b13 != null)
            {
                dd = b13._mthif(8);
                if(!ex)
                    de.enable();
                bp.enable();
                if("DoubleClic".equals((String)event.arg))
                    if(dd.equals(bC))
                        dx._mthif(_mthcase(bC), 1, "");
                    else
                    if(a(dd, b8) != null)
                        _mthint("40\t" + dd + "\t0");
            }
            return true;
        }
        if(event.target == dT)
        {
            net.spray.chat.a.b b14 = dT._mthnew();
            if(b14 != null && !b14._mthif(0).equals(dy))
            {
                bO = b14._mthif(1);
                dY = b14._mthif(0);
                dg.disable();
                boolean flag1 = V.contains(dY);
                int k1 = H.getText().indexOf("> ");
                if(!dY.substring(0, 1).equals("*"))
                {
                    if(!flag1 || ep)
                    {
                        dg.enable();
                        dg.setState(false);
                    }
                    if(k1 != -1)
                    {
                        H.setText(bO + "> " + H.getText().substring(k1 + 2));
                    } else
                    {
                        int l1 = H.getText().indexOf(">");
                        if(l1 != -1)
                            H.setText(bO + "> " + H.getText().substring(l1 + 1));
                        else
                            H.setText(bO + "> ");
                    }
                    H.requestFocus();
                    H.select(H.getText().length(), H.getText().length());
                }
            }
            return true;
        }
        if(event.target == aL)
        {
            net.spray.chat.a.b b15 = aL._mthelse();
            if(b15 != null)
            {
                ap = b15._mthif(0);
                cO = b15._mthif(1);
                cX = new String(ap);
                bI = new String(cO);
                boolean flag2 = V.contains(ap);
                if(!ap.equals(dy))
                {
                    if(!flag2 || ep)
                    {
                        bA.enable();
                        bA.setLabel((String)bU.elementAt(11));
                    } else
                    {
                        bA.disable();
                        bA.setLabel((String)bU.elementAt(126));
                    }
                    aE.enable();
                    cY.enable();
                    if(bt.contains(cO + ap.substring(ap.lastIndexOf(":"))))
                    {
                        aE.setLabel((String)bU.elementAt(75));
                        eB = false;
                    } else
                    {
                        aE.setLabel((String)bU.elementAt(51));
                        eB = true;
                    }
                    if(eE.contains(cO.substring(1) + ap.substring(ap.lastIndexOf(":"))))
                    {
                        cY.setLabel((String)bU.elementAt(75));
                        dI = false;
                    } else
                    {
                        cY.setLabel((String)bU.elementAt(113));
                        dI = true;
                    }
                } else
                {
                    bA.disable();
                    aE.disable();
                    cY.disable();
                }
                if("DoubleClic".equals((String)event.arg) && cO != null && ap != null)
                    _mthif(cO, ap);
            }
            return true;
        }
        for(int i1 = 0; i1 < 20; i1++)
        {
            if(event.target == by[i1])
            {
                String s3 = "";
                String s4 = "";
                s3 = by[i1]._mthif();
                if(s3 != null)
                    if(by[i1]._mthtry())
                    {
                        if(cT[i1].getText().length() > 0)
                            s4 = cT[i1].getText();
                        s4 = s4 + s3;
                        cT[i1].setText(s4);
                        cT[i1].requestFocus();
                        cT[i1].select(cT[i1].getText().length(), cT[i1].getText().length());
                        s4 = "";
                    } else
                    {
                        try
                        {
                            AppletContext appletcontext1 = _fldcase.getAppletContext();
                            appletcontext1.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(197)), "empty");
                        }
                        catch(Exception exception1)
                        {
                            System.err.println("malformed URL");
                        }
                    }
                return true;
            }
            if(event.target == dN[i1])
            {
                switch(event.id)
                {
                case 601: // Event.SCROLL_LINE_UP
                case 602: // Event.SCROLL_LINE_DOWN
                case 603: // Event.SCROLL_PAGE_UP
                case 604: // Event.SCROLL_PAGE_DOWN
                case 605: // Event.SCROLL_ABSOLUTE
                    by[i1]._mthbyte();
                    break;
                }
                return true;
            }
            if(event.target == dG[i1])
            {
                switch(event.id)
                {
                case 601: // Event.SCROLL_LINE_UP
                case 602: // Event.SCROLL_LINE_DOWN
                case 603: // Event.SCROLL_PAGE_UP
                case 604: // Event.SCROLL_PAGE_DOWN
                case 605: // Event.SCROLL_ABSOLUTE
                    bR[i1]._mthbyte();
                    break;
                }
                return true;
            }
        }

        return false;
    }

    public Insets a()
    {
        return c8;
    }

    private void _mthif(int i1)
    {
        bT[i1] = "";
        cx[i1] = "";
        w[i1].disable();
        ah[i1].disable();
        d6[i1].disable();
        U[i1].setState(ab[6]);
        c5[i1] = false;
        c2[i1] = false;
        if(!ab[3])
        {
            cS[i1].a(false);
            bP[i1].setVisible(false);
        }
        dv[i1] = false;
        Y[i1] = "";
        bR[i1]._mthnull();
        _fldvoid[i1] = -1L;
        f[i1] = 0;
    }

    private int a(String s1, String s2)
    {
        int i1;
        for(i1 = 0; i1 < 20 && bT[i1] != ""; i1++);
        if(Z)
            _mthint("19\t0\t" + s1);
        if(i1 >= 20)
            return -1;
        bT[i1] = s1;
        cx[i1] = s2;
        if(!ab[3])
        {
            cS[i1].a(false);
            bP[i1].setVisible(false);
        }
        dH[i1].enable();
        if(bT[i1].substring(bT[i1].lastIndexOf(":") + 1).equals("0"))
        {
            if(!a4)
                du[i1].enable();
            if(_mthnew(bT[i1]) == _mthnew(dy))
                dc[i1].enable();
        }
        eF[i1].select(0);
        bf[i1].select(0);
        U[i1].setState(ab[6]);
        s[i1].a((String)bU.elementAt(83) + " " + cx[i1]);
        bR[i1]._mthnull();
        cT[i1].setText("");
        cT[i1].requestFocus();
        try
        {
            if(Integer.parseInt(M) < 18)
            {
                String s3 = new String("0102" + (String)bU.elementAt(111));
                bR[i1].a(new net.spray.chat.a.b("", "", s3, "", "", "", "", "", "", "", "", false));
            }
        }
        catch(Exception exception) { }
        bR[i1]._mthif();
        return i1;
    }

    public void _mthtry()
    {
        _mthint();
        if(aP)
            return;
        if(aP = _mthnew())
        {
            start();
            if(!a4 && !dM)
            {
                bJ = new net.spray.chat.normal.a(this);
                bJ.start();
            }
        }
    }

    private String _mthfor(String s1)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(s1, ":");
        String s2;
        for(s2 = ""; stringtokenizer.hasMoreElements(); s2 = stringtokenizer.nextToken());
        int i1;
        try
        {
            i1 = Integer.parseInt(s2);
        }
        catch(NumberFormatException numberformatexception)
        {
            i1 = 0;
        }
        if(bq)
            return "";
        else
            return dX[i1];
    }

    private int _mthnew(String s1)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(s1, ":");
        String s2;
        for(s2 = ""; stringtokenizer.hasMoreElements(); s2 = stringtokenizer.nextToken());
        int i1;
        try
        {
            i1 = Integer.parseInt(s2);
        }
        catch(NumberFormatException numberformatexception)
        {
            i1 = 0;
        }
        return i1;
    }

    private String _mthif()
    {
        return "rand" + k + bX++;
    }

    public static String a(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int i1 = 0; i1 < abyte0.length; i1++)
            if(abyte0[i1] == 46 || abyte0[i1] == 45 || abyte0[i1] == 42 || abyte0[i1] == 95 || abyte0[i1] >= 97 && abyte0[i1] <= 122 || abyte0[i1] >= 65 && abyte0[i1] <= 90 || abyte0[i1] >= 48 && abyte0[i1] <= 57)
            {
                stringbuffer.append((char)abyte0[i1]);
            } else
            {
                String s1 = Integer.toHexString(abyte0[i1]);
                if(s1.length() > 2)
                    s1 = s1.substring(s1.length() - 2);
                else
                if(s1.length() == 1)
                    s1 = '0' + s1;
                stringbuffer.append('%').append(s1);
            }

        return stringbuffer.toString();
    }

    private boolean _mthint(String s1)
    {
        if(!_fldfor)
        {
            s1 = s1 + "\n";
            try
            {
                bx.write(s1, 0, s1.length());
                bx.flush();
            }
            catch(IOException ioexception)
            {
                return false;
            }
        } else
        {
            try
            {
                String s2 = "id" + dy + "jid" + a1 + "cmd" + a(s1.getBytes("UTF8"));
                URL url = new URL("http://" + _fldcase.getCodeBase().getHost() + ":" + p + "/" + _mthif());
                URLConnection urlconnection = url.openConnection();
                urlconnection.setDoOutput(true);
                urlconnection.setDoInput(true);
                urlconnection.setAllowUserInteraction(false);
                DataOutputStream dataoutputstream = new DataOutputStream(urlconnection.getOutputStream());
                dataoutputstream.writeBytes(s2);
                dataoutputstream.close();
                DataInputStream datainputstream;
                for(datainputstream = new DataInputStream(urlconnection.getInputStream()); datainputstream.readLine() != null;);
                datainputstream.close();
            }
            catch(IOException ioexception1)
            {
                return false;
            }
        }
        return true;
    }

    private boolean a(int i1)
    {
        try
        {
            h = new Socket(_fldcase.getCodeBase().getHost(), i1);
            eq = new InputStreamReader(new BufferedInputStream(h.getInputStream()), "UTF8");
            bx = new OutputStreamWriter(new BufferedOutputStream(h.getOutputStream()), "UTF8");
            return true;
        }
        catch(IOException ioexception) { }
        try
        {
            if(h != null)
            {
                h.close();
                h = null;
            }
        }
        catch(IOException ioexception1) { }
        return false;
    }

    private boolean _mthcase()
    {
        int i1 = 0;
        do
            try
            {
                StringBuffer stringbuffer = new StringBuffer();
                if(!aP)
                    stringbuffer.append("cmd").append(!aV ? 0 : 1).append("%09").append(cP != null ? cP : "0").append("%09").append(k);
                else
                    stringbuffer.append("id").append(dy).append("jid").append(a1);
                URL url = new URL("http://" + _fldcase.getCodeBase().getHost() + ":" + p + "/" + _mthif());
                URLConnection urlconnection = url.openConnection();
                urlconnection.setDoOutput(true);
                urlconnection.setDoInput(true);
                urlconnection.setAllowUserInteraction(false);
                DataOutputStream dataoutputstream = new DataOutputStream(urlconnection.getOutputStream());
                dataoutputstream.writeBytes(stringbuffer.toString());
                dataoutputstream.close();
                cN = new DataInputStream(urlconnection.getInputStream());
                return true;
            }
            catch(IOException ioexception)
            {
                System.out.println("unable to connect through HTTP port");
            }
        while(++i1 <= 5);
        return false;
    }

    private boolean _mthnew()
    {
        if(a(bi))
        {
            _fldfor = false;
            _mthint("0\t" + (cP != null ? cP : "0") + '\t' + k);
            return true;
        } else
        {
            _fldfor = true;
            return _mthcase();
        }
    }

    private int a(String s1)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        StringTokenizer stringtokenizer = new StringTokenizer(s1, "\t\n");
        if(!stringtokenizer.hasMoreElements())
            return -1;
        int i1;
        try
        {
            i1 = Integer.parseInt(stringtokenizer.nextToken());
        }
        catch(NumberFormatException numberformatexception)
        {
            return -1;
        }
        switch(i1)
        {
        case 100: // 'd'
        case 204: 
        default:
            break;

        case 0: // '\0'
            if(stringtokenizer.countTokens() < 3)
                return -1;
            dy = stringtokenizer.nextToken();
            a1 = stringtokenizer.nextToken();
            d1 = stringtokenizer.nextToken();
            try
            {
                ew = Integer.parseInt(d1) >> 5;
            }
            catch(NumberFormatException numberformatexception1)
            {
                ew = 0;
            }
            bl = stringtokenizer.nextToken();
            _mthint("82\t" + dy);
            _mthint("84");
            _mthint("200\t4");
            _mthint("200\t5");
            if(!a4)
            {
                if(a(bC, b8) != null)
                    _mthint("20\t" + bC + "\t" + dO);
                else
                    _mthint("20\t" + (String)bU.elementAt(177) + "\t" + dO);
            } else
            {
                bC = "";
                dx.enable();
                dx.repaint();
                dx._mthif(at[3], 0, "");
            }
            cU.setText("");
            cU.requestFocus();
            if(ep)
            {
                N.enable();
                N.setState(false);
            }
            dx.repaint();
            if(!bq)
                cD = _mthfor(dy);
            else
                cD = "";
            bN._mthif(cD);
            cA._mthif(cD);
            cB._mthif(cD);
            q._mthif(cD);
            aL._mthif(cD);
            dT._mthif(cD);
            for(int j1 = 0; j1 < 20; j1++)
                bR[j1]._mthif(cD);

            java.awt.Dimension dimension = _fldcase.size();
            break;

        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            bC = "";
            dx.enable();
            dx.repaint();
            dx._mthif(at[2], 0, "");
            a(i1, ((StringTokenizer) (null)));
            return -2;

        case 16: // '\020'
            int k1;
            try
            {
                k1 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception3)
            {
                break;
            }
            if(k1 == -1)
            {
                eE.removeAllElements();
                for(; stringtokenizer.hasMoreTokens(); eE.addElement(stringtokenizer.nextToken()));
                aL._mthif();
            }
            break;

        case 18: // '\022'
            int l1;
            try
            {
                l1 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception4)
            {
                break;
            }
            if(l1 == -1)
            {
                bt.removeAllElements();
                for(; stringtokenizer.hasMoreTokens(); bt.addElement(stringtokenizer.nextToken()));
                cA._mthint();
                aL._mthint();
                _mthint("85");
            }
            break;

        case 20: // '\024'
        case 21: // '\025'
            if(!stringtokenizer.hasMoreElements())
                return -1;
            int i2 = Integer.parseInt(stringtokenizer.nextToken()) & 3;
            bC = stringtokenizer.nextToken();
            if(i2 == 0 && a(bC, b8) == null)
            {
                _mthint("20\t" + (String)bU.elementAt(177) + "\t" + i2);
            } else
            {
                dx.a(_mthcase(bC), eo, 1, -1, "");
                dx.a(_mthcase(bC), Color.orange, 1, "");
                aT = true;
                dx.enable();
                if(ab[7])
                {
                    d9.a((String)bU.elementAt(196), aU, 0, -1, "");
                    d9.a((String)bU.elementAt(196), Color.orange, 0, "");
                    d9.enable();
                    d9.repaint();
                    for(int k3 = 0; k3 < 20; k3++)
                    {
                        bb[k3].a((String)bU.elementAt(196), bd[k3], 0, -1, "");
                        bb[k3].a((String)bU.elementAt(196), Color.orange, 0, "");
                        bb[k3].enable();
                        bb[k3].repaint();
                    }

                }
                dx.a(4 - _fldelse);
                dx.repaint();
                aL._mthnull();
                dT._mthnull();
                dT._mthif();
                aL._mthif();
                aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC));
                _mthint("94");
                bp.disable();
                b1.disable();
                _mthint("85");
                if(ep)
                    _mthint("16");
                bA.disable();
                aE.disable();
                cY.disable();
                T.setText((String)bU.elementAt(73));
                _mthint("82\t" + dy);
            }
            break;

        case 23: // '\027'
            if(stringtokenizer.countTokens() != 2)
                return -1;
            int j2;
            try
            {
                j2 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception5) { }
            q.a(new net.spray.chat.a.b("", "", "0102" + (String)bU.elementAt(72) + " " + _mthcase(stringtokenizer.nextToken()), "", "", "", "", "", "", "", "", true));
            q._mthif();
            if(!aT)
            {
                aT = true;
                _mthint("40\t" + (String)bU.elementAt(177) + "\t0");
            }
            break;

        case 25: // '\031'
            if(!ab[3])
            {
                if(stringtokenizer.countTokens() != 2)
                    return -1;
                String s2 = stringtokenizer.nextToken();
                int l3;
                try
                {
                    l3 = Integer.parseInt(stringtokenizer.nextToken());
                }
                catch(NumberFormatException numberformatexception9)
                {
                    return -1;
                }
                int k4;
                for(k4 = 0; k4 < 20 && !bT[k4].equals(s2); k4++);
                cS[k4].a((l3 & 7) == 0);
                bP[k4].setVisible((l3 & 7) == 0);
                cS[k4].setLayout(new BorderLayout(0, 0));
                cS[k4].add("Center", bP[k4]);
                bP[k4].repaint();
                cS[k4].repaint();
                dx.repaint();
            }
            break;

        case 26: // '\032'
            if(stringtokenizer.countTokens() != 1)
                return -1;
            int k2;
            try
            {
                k2 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception6)
            {
                return -1;
            }
            cH.setState((k2 & 2) != 0);
            N.setState((k2 & 4) != 0);
            dF.setState((k2 & 0x40) != 0);
            break;

        case 40: // '('
        case 41: // ')'
            if(stringtokenizer.countTokens() != 4)
                return -1;
            try
            {
                dO = (Integer.parseInt(stringtokenizer.nextToken()) & 3) != 0 ? 1 : 0;
            }
            catch(NumberFormatException numberformatexception2)
            {
                return -1;
            }
            bC = stringtokenizer.nextToken();
            if(dO == 0 && a(bC, b8) == null)
            {
                _mthint("40\t" + (String)bU.elementAt(177) + "\t" + dO);
            } else
            {
                String s3 = stringtokenizer.nextToken();
                String s23 = stringtokenizer.nextToken();
                dx.a(4 - _fldelse, _mthcase(bC));
                dx.a(4 - _fldelse);
                aL._mthnull();
                dT._mthnull();
                dT._mthif();
                aL._mthif();
                if(!s23.equals("?"))
                    aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC) + " " + (String)bU.elementAt(36) + " " + s23);
                else
                    aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC));
                _mthint("85");
                if(ep)
                    _mthint("16");
                bA.disable();
                aE.disable();
                cY.disable();
                T.setText((String)bU.elementAt(73));
            }
            break;

        case 56: // '8'
        case 58: // ':'
            String as1[] = {
                "|", "/", "-", "\\", "|", "/", "-", "\\"
            };
            boolean flag13 = false;
            int i12 = 0;
            String s100 = "";
            String s88 = stringtokenizer.nextToken();
            StringTokenizer stringtokenizer2 = new StringTokenizer(s88, ":");
            if(stringtokenizer2.countTokens() == 3)
            {
                stringtokenizer2.nextToken();
                stringtokenizer2.nextToken();
                s100 = stringtokenizer2.nextToken();
            }
            String s4 = "";
            String s81 = "";
            String s24 = "";
            String s41 = "";
            String s50 = "";
            String s63 = "";
            String s74 = "";
            String s90 = "";
            cA._mthnull();
            eD.removeAllElements();
            aW.setText((String)bU.elementAt(68));
            while(stringtokenizer.hasMoreElements()) 
            {
                String s5 = "";
                String s82 = "";
                String s25 = "";
                String s42 = "";
                String s51 = "";
                String s64 = "";
                String s75 = "";
                s5 = stringtokenizer.nextToken();
                s82 = stringtokenizer.nextToken();
                int l11 = Integer.parseInt(stringtokenizer.nextToken());
                int l12 = l11;
                if(l11 != 0)
                    eD.addElement(s5);
                boolean flag14 = (l12 & 0x40) == 64;
                s25 = stringtokenizer.nextToken();
                if(s100.compareTo("-2") == 0)
                    s42 = stringtokenizer.nextToken();
                else
                    s42 = s100;
                s51 = stringtokenizer.nextToken();
                if(bq)
                    s90 = stringtokenizer.nextToken();
                s64 = stringtokenizer.nextToken();
                s75 = stringtokenizer.nextToken();
                if(s51.compareTo("?") == 0)
                    s51 = "";
                if(bt.contains(s82 + s5.substring(s5.lastIndexOf(":"))))
                    s42 = "3*" + (String)bU.elementAt(62);
                else
                if(s42.compareTo("0") == 0)
                    s42 = "0*" + (String)bU.elementAt(59);
                else
                if(s42.compareTo("1") == 0)
                    s42 = "1*" + (String)bU.elementAt(60);
                else
                    s42 = "2*" + (String)bU.elementAt(61);
                String s95;
                if(s75.equals("0") || s75.equals("4"))
                    s95 = "0100(" + (String)bU.elementAt(65) + " " + _mthcase(s64) + ")";
                else
                if(s75.equals("1") || s75.equals("5"))
                {
                    s95 = "0102" + (String)bU.elementAt(66);
                    s64 = "";
                } else
                {
                    s95 = "";
                    s64 = "";
                }
                if(i1 == 58 && !s51.equals(""))
                {
                    String s94 = "0102" + s51.substring(0, 1).toUpperCase() + s51.substring(1).toLowerCase() + " ";
                    s95 = s94 + "\r" + s95;
                }
                if(!bq)
                    cA.a(new net.spray.chat.a.b(s5, s82, s95, s25, s42, s51, "", _mthfor(s5), s64, "", flag14 ? _mthtry("6*") : _mthtry(s42), false));
                else
                    cA.a(new net.spray.chat.a.b(s5, s82, s95, s25, s42, s51, "", s90, s64, "", flag14 ? _mthtry("6*") : _mthtry(s42), false));
                if(i12 % 10 == 0)
                    aW.setText((String)bU.elementAt(68) + " " + as1[(i12 / 10) % 8]);
                i12++;
            }
            cA._mthdo(i1 != 56 ? "451" : "41");
            cA._mthif();
            if(i12 > 0)
                aW.setText(String.valueOf(i12) + " " + (String)bU.elementAt(69));
            if(i12 == 1)
                aW.setText(String.valueOf(i12) + " " + (String)bU.elementAt(70));
            if(i12 == 0)
                aW.setText((String)bU.elementAt(71));
            if(!dx._mthdo().equals(at[1]))
                dx.a(at[1], Color.orange, 0, "");
            break;

        case 70: // 'F'
            if(stringtokenizer.countTokens() != 4)
                return -1;
            String s6 = stringtokenizer.nextToken();
            String s26 = stringtokenizer.nextToken();
            String s43 = stringtokenizer.nextToken();
            String s52 = stringtokenizer.nextToken();
            String s65 = s43 + s6.substring(s6.lastIndexOf(":"));
            if(bt.contains(s65))
                break;
            boolean flag5;
            if(!(flag5 = s6.equals(dy)))
            {
                long l10 = (new Date()).getTime();
                if(eb != null && eb.equals(s65) && bw > 0L && l10 - bw < 10000L)
                {
                    if(++aO > 5)
                    {
                        eb = null;
                        _mthint("18\t0\t" + s65);
                        break;
                    }
                } else
                {
                    eb = s65;
                    bw = l10;
                    aO = 1;
                }
            }
            if(flag5 || a(s52, a3) != null)
            {
                if(s52.indexOf(bl + " ") != -1 || s52.indexOf(bl + ">") != -1)
                {
                    flag5 = true;
                    if(!s6.equals(dy) && !dx._mthdo().equals(_mthcase(bC)))
                        dx.a(_mthcase(bC), Color.orange, 1, "");
                }
                if(dT.a(s6, 0) == null)
                {
                    if(!s6.substring(0, 1).equals("*"))
                        _mthint("82\t" + s6);
                    if(!bq)
                        dT.a(new net.spray.chat.a.b(s6, s43, s52, "", "", "", "", _mthfor(s6), "", "", _mthtry("3*"), flag5));
                    else
                        dT.a(new net.spray.chat.a.b(s6, s43, s52, "", "", "", "", "", "", "", _mthtry("3*"), flag5));
                    dT._mthif();
                } else
                {
                    net.spray.chat.a.b b10 = dT.a(s6, 0);
                    if(!bq)
                        dT.a(new net.spray.chat.a.b(s6, s43, s52, b10._mthif(3), b10._mthif(4), b10._mthif(5), "", _mthfor(s6), "", "", _mthtry(b10._mthif(4)), flag5));
                    else
                        dT.a(new net.spray.chat.a.b(s6, s43, s52, b10._mthif(3), b10._mthif(4), b10._mthif(5), "", b10._mthif(7), "", "", _mthtry(b10._mthif(4)), flag5));
                    dT._mthif();
                }
            }
            break;

        case 72: // 'H'
        case 73: // 'I'
        case 79: // 'O'
            if(stringtokenizer.countTokens() < 4 && stringtokenizer.countTokens() > 5)
                return -1;
            String s7 = stringtokenizer.nextToken();
            String s27 = stringtokenizer.nextToken();
            String s44 = stringtokenizer.nextToken();
            String s53 = stringtokenizer.nextToken();
            String s66 = s44;
            String s76 = (String)cv.get(s44 + s7.substring(s7.lastIndexOf(":")));
            if(s76 != null && (_fldtry[2] || cg[2]))
            {
                if(_fldtry[2])
                    flag1 = true;
                if(cg[2])
                    flag2 = true;
                flag = true;
            }
            if(bt.contains(s44 + s7.substring(s7.lastIndexOf(":"))))
                break;
            int j10 = 0;
            if(dx.a(s44, 2, s7))
            {
                if(!dx._mthfor(s44, 2, s7))
                    dx.a(s44, Color.orange, 2, s7);
                for(; j10 < 20 && (!cx[j10].equals(s44) || !bT[j10].equals(s7)); j10++);
                if(j10 < 20)
                {
                    if(!bT[j10].equals(s7))
                    {
                        dv[j10] = false;
                        bT[j10] = s7;
                        cx[j10] = s44;
                        cT[j10].setText("");
                        cT[j10].requestFocus();
                    }
                    if(i1 == 79)
                        bR[j10].a(new net.spray.chat.a.b("", "", "0102" + cx[j10] + " : " + stringtokenizer.nextToken(), "", "", "", "", "", "", "", "", true));
                    if(i1 == 72)
                    {
                        ea[j10] = (new Date()).getTime();
                        if(_fldvoid[j10] > 0L && ea[j10] - _fldvoid[j10] < 10000L)
                        {
                            if(++f[j10] > 5)
                            {
                                bt.addElement(s44 + s7.substring(s7.lastIndexOf(":")));
                                net.spray.chat.a.b b11 = aL.a(s7, 0);
                                if(b11 != null)
                                {
                                    aL._mthif(s7, 0);
                                    aL.a(new net.spray.chat.a.b(s7, s44, "", "", "3*" + (String)bU.elementAt(62), "", "", _mthfor(s7), "", "", _mthtry("3*"), false));
                                    aL._mthif();
                                }
                                break;
                            }
                        } else
                        {
                            _fldvoid[j10] = ea[j10];
                            f[j10] = 1;
                        }
                        if(dv[j10])
                        {
                            if(!bq)
                                bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, eu[j10], bG[j10], b4[j10], "", _mthfor(s7), "", "", _mthtry(bG[j10]), false));
                            else
                                bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, eu[j10], bG[j10], b4[j10], "", Y[j10], "", "", _mthtry(bG[j10]), false));
                        } else
                        {
                            if(!bq)
                                bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, "", "", "", "", _mthfor(s7), "", "", "", false));
                            else
                                bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, "", "", "", "", "", "", "", "", false));
                            _mthint("82\t" + s7);
                        }
                    } else
                    if(!bq)
                        bR[j10].a(new net.spray.chat.a.b(dy, bl, s53, M, cZ, a8, "", cD, "", "", _mthtry(cZ), true));
                    else
                        bR[j10].a(new net.spray.chat.a.b(dy, bl, s53, M, cZ, a8, "", dU, "", "", _mthtry(cZ), true));
                }
            } else
            {
                j10 = a(s7, s44);
                if(j10 != -1)
                {
                    _mthint("82\t" + s7);
                    if(bq)
                        dx.a(s44, bv[j10], 2, -1, s7);
                    else
                        dx.a(s44, bv[j10], 2, _mthnew(s7), s7);
                    dx.a(s44, Color.orange, 2, s7);
                    if(i1 == 79)
                        bR[j10].a(new net.spray.chat.a.b("", "", "0102" + cx[j10] + " : " + stringtokenizer.nextToken(), "", "", "", "", "", "", "", "", true));
                    if(i1 == 72)
                    {
                        if(!bq)
                            bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, "", "", "", "", _mthfor(s7), "", "", "", false));
                        else
                            bR[j10].a(new net.spray.chat.a.b(s7, s66, s53, "", "", "", "", "", "", "", "", false));
                    } else
                    if(!bq)
                        bR[j10].a(new net.spray.chat.a.b(dy, bl, s53, M, cZ, a8, "", cD, "", "", _mthtry(cZ), true));
                    else
                        bR[j10].a(new net.spray.chat.a.b(dy, bl, s53, M, cZ, a8, "", dU, "", "", _mthtry(cZ), false));
                }
            }
            int k10 = bR[j10]._mthchar();
            boolean flag8 = false;
            boolean flag9 = false;
            if(!ab[3] && k10 > 2 && (!c5[j10] || !c2[j10]))
            {
                for(int j11 = 0; j11 < k10; j11++)
                {
                    net.spray.chat.a.b b12 = bR[j10]._mthfor(j11);
                    String s97 = b12._mthif(0);
                    if(!s97.equals(""))
                        if(s97.compareTo(dy) != 0)
                            c5[j10] = true;
                        else
                            c2[j10] = true;
                    if(!c5[j10] || !c2[j10])
                        continue;
                    w[j10].enable();
                    _mthint("25\t" + s7);
                    break;
                }

            }
            if(dF.getState())
            {
                U[j10].setState(true);
                bR[j10].a(true);
            }
            bR[j10]._mthif();
            break;

        case 74: // 'J'
            if(stringtokenizer.countTokens() != 1)
                return -1;
            String s8 = stringtokenizer.nextToken();
            StringTokenizer stringtokenizer1 = new StringTokenizer(s8, ":");
            int l4 = 0;
            if(stringtokenizer1.countTokens() != 2)
            {
                for(; l4 < 20 && !bT[l4].equals(s8); l4++);
            } else
            {
                for(String s9 = stringtokenizer1.nextToken(); l4 < 20 && !cx[l4].equals(s9); l4++);
            }
            if(l4 < 20)
            {
                bR[l4].a(new net.spray.chat.a.b("", "", "0102" + cx[l4] + " " + (String)bU.elementAt(84), "", "", "", "", cD, "", "", "", true));
                bR[l4]._mthif();
                w[l4].disable();
                d6[l4].disable();
                ah[l4].disable();
            }
            break;

        case 75: // 'K'
            if(stringtokenizer.countTokens() != 2)
                return -1;
            String s10 = stringtokenizer.nextToken();
            String s28 = stringtokenizer.nextToken();
            int i5 = bT.length;
            for(int l6 = 0; l6 < i5; l6++)
                if(bT[l6].compareTo(s10) == 0 && cx[l6].compareTo(s28) == 0)
                {
                    bR[l6].a(new net.spray.chat.a.b("", "", "0102" + s28 + " " + (String)bU.elementAt(107), "", "", "", "", "", "", "", "", true));
                    bR[l6]._mthif();
                }

            break;

        case 76: // 'L'
            if(!stringtokenizer.hasMoreElements())
                return -1;
            String s11 = new String(stringtokenizer.nextToken());
            try
            {
                int j5 = Integer.parseInt(s11);
                String s29 = "0102";
                switch(j5)
                {
                default:
                    break;

                case 1: // '\001'
                    s29 = s29 + (String)bU.elementAt(86) + " " + stringtokenizer.nextToken();
                    break;

                case 2: // '\002'
                    s29 = s29 + stringtokenizer.nextToken() + " " + (String)bU.elementAt(87);
                    break;

                case 3: // '\003'
                    s29 = s29 + stringtokenizer.nextToken() + " " + (String)bU.elementAt(88);
                    break;

                case 4: // '\004'
                    s29 = s29 + stringtokenizer.nextToken() + " " + (String)bU.elementAt(89);
                    break;

                case 5: // '\005'
                    String s54 = stringtokenizer.nextToken();
                    String s67 = stringtokenizer.nextToken();
                    if(s54.substring(s54.lastIndexOf(":")).compareTo(dy.substring(dy.lastIndexOf(":"))) != 0)
                        s67 = "#" + s67;
                    if(stringtokenizer.hasMoreElements())
                    {
                        String s77 = stringtokenizer.nextToken();
                        String s83 = stringtokenizer.nextToken();
                        if(s77.compareTo(s54) == 0)
                        {
                            s29 = s29 + s67 + " " + (String)bU.elementAt(106);
                            break;
                        }
                        if(s77.substring(s77.lastIndexOf(":")).compareTo(dy.substring(dy.lastIndexOf(":"))) != 0)
                            s83 = "#" + s83;
                        s29 = s29 + s67 + " " + (String)bU.elementAt(90) + " " + s83;
                    } else
                    {
                        s29 = s29 + s67 + " " + (String)bU.elementAt(106);
                    }
                    break;

                case 6: // '\006'
                    String s55 = stringtokenizer.nextToken();
                    String s68 = stringtokenizer.nextToken();
                    String s78 = "";
                    if(s55.substring(s55.lastIndexOf(":")).compareTo(dy.substring(dy.lastIndexOf(":"))) != 0)
                        s78 = s78 + "#";
                    s29 = s29 + (String)bU.elementAt(91) + " " + s78 + s68;
                    break;

                case 7: // '\007'
                    String s56 = stringtokenizer.nextToken();
                    int j8 = Integer.parseInt(stringtokenizer.nextToken());
                    int k9 = Integer.parseInt(stringtokenizer.nextToken());
                    String s84;
                    if((j8 & 2) == 1)
                        s84 = (String)bU.elementAt(63);
                    else
                    if((j8 & 2) == 2)
                        s84 = (String)bU.elementAt(64);
                    else
                        s84 = "";
                    if(k9 != Integer.parseInt(cD))
                        s56 = "#" + s56;
                    s29 = s29 + s84 + " " + s56 + " " + (String)bU.elementAt(92) + " " + stringtokenizer.nextToken();
                    break;

                case 8: // '\b'
                    String s57 = stringtokenizer.nextToken();
                    int k8 = Integer.parseInt(stringtokenizer.nextToken());
                    int l9 = Integer.parseInt(stringtokenizer.nextToken());
                    String s85;
                    if((k8 & 2) == 1)
                        s85 = (String)bU.elementAt(63);
                    else
                    if((k8 & 2) == 2)
                        s85 = (String)bU.elementAt(64);
                    else
                        s85 = "";
                    if(l9 != Integer.parseInt(cD))
                        s57 = "#" + s57;
                    s29 = s29 + s85 + " " + s57 + " " + (String)bU.elementAt(89) + " " + stringtokenizer.nextToken();
                    break;
                }
                q.a(new net.spray.chat.a.b("", "", s29, "", "", "", "", "", "", "", "", true));
                q._mthif();
                if(!dx._mthdo().equals(at[2]))
                    dx.a(at[2], Color.orange, 0, "");
            }
            catch(NumberFormatException numberformatexception11) { }
            break;

        case 77: // 'M'
            if(!stringtokenizer.hasMoreElements())
                return -1;
            String s12 = new String(stringtokenizer.nextToken());
            q.a(new net.spray.chat.a.b("", "", s12, "", "", "", "", "", "", "", "", false));
            q._mthif();
            if(!dx._mthdo().equals(at[2]))
                dx.a(at[2], Color.orange, 0, "");
            break;

        case 82: // 'R'
            if(stringtokenizer.countTokens() < 5 && 6 < stringtokenizer.countTokens())
                return -1;
            String s13 = stringtokenizer.nextToken();
            String s30 = stringtokenizer.nextToken();
            String s45 = stringtokenizer.nextToken();
            String s58 = stringtokenizer.nextToken();
            String s69 = stringtokenizer.nextToken();
            boolean flag6 = false;
            String s86 = "";
            if(stringtokenizer.hasMoreElements())
            {
                s86 = stringtokenizer.nextToken();
                flag6 = true;
            }
            int i11 = 0;
            if(s30.equals("0"))
            {
                if(s58.compareTo("0") == 0)
                    s58 = "0*" + (String)bU.elementAt(59);
                else
                if(s58.compareTo("1") == 0)
                    s58 = "1*" + (String)bU.elementAt(60);
                else
                    s58 = "2*" + (String)bU.elementAt(61);
            } else
            {
                if(s30.compareTo("1") == 0)
                    s58 = "4*" + (String)bU.elementAt(63);
                else
                if(s30.compareTo("2") == 0)
                    s58 = "5*" + (String)bU.elementAt(64);
                s69 = "";
                s45 = "";
            }
            if(s69.compareTo("?") == 0)
                s69 = "";
            if(s13.equals(dy))
            {
                cZ = s58;
                a8 = s69;
                M = s45;
                dU = s86;
            }
            for(; i11 < 20 && !s13.equals(bT[i11]); i11++);
            if(i11 < 20)
            {
                dv[i11] = true;
                eu[i11] = s45;
                bG[i11] = s58;
                b4[i11] = s69;
                Y[i11] = s86;
                bR[i11]._mthif(s13, 0, s45, 3);
                bR[i11]._mthif(s13, 0, s58, 4);
                bR[i11]._mthif(s13, 0, s69, 5);
                bR[i11]._mthif(s13, 0, _mthtry(s58), 10);
                if(bq && flag6)
                    bR[i11]._mthif(s13, 0, s86, 7);
                bR[i11]._mthif();
            }
            dT._mthif(s13, 0, s45, 3);
            dT._mthif(s13, 0, s58, 4);
            dT._mthif(s13, 0, s69, 5);
            dT._mthif(s13, 0, _mthtry(s58), 10);
            if(bq && flag6)
                dT._mthif(s13, 0, s86, 7);
            dT._mthif();
            break;

        case 84: // 'T'
            if(stringtokenizer.countTokens() != 1)
                return -1;
            try
            {
                String s14 = stringtokenizer.nextToken();
                b2.setText(s14);
                if(dF.getState() && !O)
                    af = s14;
                else
                    O = false;
            }
            catch(Exception exception) { }
            break;

        case 85: // 'U'
            int l2;
            try
            {
                l2 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception7)
            {
                break;
            }
            if(l2 == -1)
            {
                aL._mthnull();
                V.removeAllElements();
                l2 = 0;
            }
            if(l2 == 1 && stringtokenizer.hasMoreElements())
            {
                String s31 = stringtokenizer.nextToken();
                aL._mthif(s31, 0);
                V.removeElement(s31);
            }
            if(l2 == 0)
            {
                boolean flag3 = false;
                String s96 = "";
                while(stringtokenizer.hasMoreElements()) 
                {
                    String s32 = stringtokenizer.nextToken();
                    int k5 = Integer.parseInt(stringtokenizer.nextToken());
                    String s59 = stringtokenizer.nextToken();
                    int k11 = Integer.parseInt(stringtokenizer.nextToken());
                    boolean flag4 = (k11 & 4) == 4;
                    boolean flag7 = (k11 & 0x40) == 64;
                    String s87 = stringtokenizer.nextToken();
                    String s89 = stringtokenizer.nextToken();
                    String s91 = stringtokenizer.nextToken();
                    if(bq)
                        s96 = stringtokenizer.nextToken();
                    aL._mthif(s32, 0);
                    if(V.contains(s32))
                        V.removeElement(s32);
                    if(flag4)
                        V.addElement(s32);
                    if(k5 == 1)
                        s89 = "4*" + (String)bU.elementAt(63);
                    else
                    if(k5 == 2)
                        s89 = "5*" + (String)bU.elementAt(64);
                    else
                    if(bt.contains(s59 + s32.substring(s32.lastIndexOf(":"))))
                        s89 = "3*" + (String)bU.elementAt(62);
                    else
                    if(s89.compareTo("0") == 0)
                        s89 = "0*" + (String)bU.elementAt(59);
                    else
                    if(s89.compareTo("1") == 0)
                        s89 = "1*" + (String)bU.elementAt(60);
                    else
                        s89 = "2*" + (String)bU.elementAt(61);
                    if(eE.contains(s59 + s32.substring(s32.lastIndexOf(":"))))
                        s59 = "*" + s59;
                    if(k5 == 1 || k5 == 2)
                    {
                        if(!bq)
                            aL.a(new net.spray.chat.a.b(s32, s59, "", "", s89, "", "", _mthfor(s32), "", "", flag7 ? _mthtry("6*") : _mthtry(s89), false));
                        else
                            aL.a(new net.spray.chat.a.b(s32, s59, "", "", s89, "", "", s96, "", "", flag7 ? _mthtry("6*") : _mthtry(s89), false));
                    } else
                    if(!bq)
                        aL.a(new net.spray.chat.a.b(s32, s59, "", s87, s89, s91, "", _mthfor(s32), "", "", flag7 ? _mthtry("6*") : _mthtry(s89), false));
                    else
                        aL.a(new net.spray.chat.a.b(s32, s59, "", s87, s89, s91, "", s96, "", "", flag7 ? _mthtry("6*") : _mthtry(s89), false));
                }
            }
            int i4 = aL._mthchar();
            int l5 = 0;
            int i7 = 0;
            for(int l8 = 0; l8 < i4; l8++)
            {
                String s79 = aL._mthfor(l8)._mthif(4);
                if(s79.substring(0, 1).equals("0"))
                    l5++;
                else
                if(s79.substring(0, 1).equals("1"))
                    i7++;
            }

            i4 = aL._mthchar();
            T.setText(i4 + " " + (String)bU.elementAt(16) + " - " + l5 + " " + (String)bU.elementAt(59) + " - " + i7 + " " + (String)bU.elementAt(60));
            aL._mthif();
            bA.disable();
            aE.disable();
            cY.disable();
            break;

        case 90: // 'Z'
        case 94: // '^'
            int i9 = 0;
            cB._mthnull();
            while(stringtokenizer.hasMoreElements()) 
            {
                String s15 = stringtokenizer.nextToken();
                String s46 = stringtokenizer.nextToken();
                String s60 = stringtokenizer.nextToken();
                String s33 = stringtokenizer.nextToken();
                if(a(s15, b8) != null)
                {
                    if(!s60.equals("?"))
                        cB.a(new net.spray.chat.a.b(s46, "", "0100" + _mthcase(s15) + " (\r0102" + s33 + "\r0100)", (String)bU.elementAt(85) + " " + s60, "", "", "", "", s15, "", "", false));
                    else
                        cB.a(new net.spray.chat.a.b("", "", "0100" + _mthcase(s15) + " (\r0102" + s33 + "\r0100)", "", "", "", "", "", s15, "", "", false));
                    i9++;
                }
            }
            ev.enable();
            b1.enable();
            cB._mthif();
            if(i1 == 90)
            {
                if(i9 < 2)
                    eM.setText(new String(String.valueOf(i9) + " " + (String)bU.elementAt(37)));
                else
                    eM.setText(new String(String.valueOf(i9) + " " + (String)bU.elementAt(38)));
            } else
            if(i9 < 2)
                eM.setText(new String(String.valueOf(i9) + " " + (String)bU.elementAt(39)));
            else
                eM.setText(new String(String.valueOf(i9) + " " + (String)bU.elementAt(40)));
            break;

        case 101: // 'e'
            a(i1, ((StringTokenizer) (null)));
            return -2;

        case 199: 
            if(!stringtokenizer.hasMoreElements())
                return -1;
            i = new String(stringtokenizer.nextToken());
            if(i.equals("0"))
                dh.setText((String)bU.elementAt(56));
            if(i.equals("1"))
                dh.setText((String)bU.elementAt(57));
            else
                dh.setText(i + " " + (String)bU.elementAt(58));
            break;

        case 200: 
            if(!stringtokenizer.hasMoreElements())
                return -1;
            int i3;
            int j4;
            try
            {
                if((i3 = Integer.parseInt(stringtokenizer.nextToken())) != 4 && i3 != 5)
                    break;
                j4 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception10)
            {
                break;
            }
            if(j4 == 1)
            {
                if(i3 == 4)
                    for(; stringtokenizer.hasMoreElements(); a3.removeElement(stringtokenizer.nextToken()));
                else
                    for(; stringtokenizer.hasMoreElements(); b8.removeElement(stringtokenizer.nextToken()));
            } else
            {
                if(j4 == -1)
                {
                    if(i3 == 4)
                        a3.removeAllElements();
                    else
                        b8.removeAllElements();
                    j4 = 0;
                }
                if(j4 == 0)
                    if(i3 == 4)
                        for(; stringtokenizer.hasMoreElements(); a3.addElement(stringtokenizer.nextToken().toLowerCase()));
                    else
                        for(; stringtokenizer.hasMoreElements(); b8.addElement(stringtokenizer.nextToken().toLowerCase()));
            }
            break;

        case 330: 
            int j3;
            try
            {
                j3 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception8)
            {
                break;
            }
            if(j3 == -1)
            {
                cv.clear();
                j3 = 0;
            }
            if(j3 == 0 || j3 == -1)
                if(stringtokenizer.hasMoreTokens())
                    while(stringtokenizer.hasMoreTokens()) 
                    {
                        String s34 = stringtokenizer.nextToken();
                        int i6 = s34.indexOf("<");
                        int j7 = s34.indexOf(">");
                        if(i6 != -1 && j7 != -1)
                            cv.put(s34.substring(0, i6), s34.substring(i6 + 1, j7));
                        else
                            cv.put(s34, s34.substring(0, s34.indexOf(":")));
                    }
                else
                    bN.a(new net.spray.chat.a.b("", "", "0102" + (String)bU.elementAt(125), "", "", "", "", "", "", "", "", true));
            break;

        case 332: 
            String s80 = "";
            boolean flag10 = false;
            boolean flag11 = false;
            String s16 = "";
            String s70 = "";
            String s35 = "";
            String s47 = "";
            String s61 = "";
            int j12;
            try
            {
                j12 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception12)
            {
                break;
            }
            if(j12 == 1)
            {
                if(stringtokenizer.hasMoreElements())
                {
                    flag10 = true;
                    String s71 = stringtokenizer.nextToken();
                    String s17 = stringtokenizer.nextToken();
                    String s98 = (String)cv.get(s71 + ":" + s17);
                    String s92 = s71 + ":" + s17;
                    if(s98 != null)
                    {
                        if(!s98.equals(s71))
                            s98 = s98 + " " + (String)bU.elementAt(129) + " " + s71;
                        else
                            s98 = s71;
                    } else
                    {
                        s98 = s71;
                    }
                    bN._mthif(s92, 9);
                    if(!bq)
                        bN.a(new net.spray.chat.a.b("", s98, "0105" + (String)bU.elementAt(119), "", "", "", "", _mthfor(s17), "", s92, "", false));
                    else
                        bN.a(new net.spray.chat.a.b("", s98, "0105" + (String)bU.elementAt(119), "", "", "", "", "", "", s92, "", false));
                    bN._mthdo(s92, 9);
                    if(_fldtry[1] || cg[1])
                    {
                        if(_fldtry[1])
                            flag1 = true;
                        if(cg[1])
                            flag2 = true;
                        flag = true;
                    }
                }
            } else
            {
                if(j12 == -1)
                    bN._mthnull();
                if(j12 == 0 || j12 == -1)
                {
                    if(j12 == 0)
                        flag10 = true;
                    String s93;
                    for(; stringtokenizer.hasMoreElements(); bN._mthdo(s93, 9))
                    {
                        String s18 = stringtokenizer.nextToken();
                        String s72 = stringtokenizer.nextToken();
                        s93 = s72 + s18.substring(s18.lastIndexOf(":"));
                        String s99 = (String)cv.get(s93);
                        if(s99 != null)
                        {
                            if(!s99.equals(s72))
                                s99 = s99 + " " + (String)bU.elementAt(129) + " " + s72;
                            else
                                s99 = s72;
                        } else
                        {
                            s99 = s72;
                        }
                        int k12 = Integer.parseInt(stringtokenizer.nextToken());
                        boolean flag12 = (k12 & 0x40) == 64;
                        String s36 = stringtokenizer.nextToken();
                        String s48 = stringtokenizer.nextToken();
                        String s62 = stringtokenizer.nextToken();
                        if(bq)
                            s80 = stringtokenizer.nextToken();
                        if(s62.compareTo("?") == 0)
                            s62 = "";
                        if(bt.contains(s72 + s18.substring(s18.lastIndexOf(":"))))
                            s48 = "3*" + (String)bU.elementAt(62);
                        else
                        if(s48.compareTo("0") == 0)
                            s48 = "0*" + (String)bU.elementAt(59);
                        else
                        if(s48.compareTo("1") == 0)
                            s48 = "1*" + (String)bU.elementAt(60);
                        else
                            s48 = "2*" + (String)bU.elementAt(61);
                        if(bN.a(s93, 9) == null)
                        {
                            if(_fldtry[0] || cg[0])
                            {
                                if(_fldtry[0])
                                    flag1 = true;
                                if(cg[0])
                                    flag2 = true;
                                flag = true;
                            }
                            J.enable();
                        }
                        bN._mthif(s93, 9);
                        if(!bq)
                            bN.a(new net.spray.chat.a.b(s18, s99, "0100" + stringtokenizer.nextToken(), s36, s48, s62, "", _mthfor(s18), "", s93, flag12 ? _mthtry("6*") : _mthtry(s48), false));
                        else
                            bN.a(new net.spray.chat.a.b(s18, s99, "0100" + stringtokenizer.nextToken(), s36, s48, s62, "", s80, "", s93, flag12 ? _mthtry("6*") : _mthtry(s48), false));
                    }

                }
            }
            bN._mthif();
            if(!dx._mthdo().equals(at[3]) && flag10)
                dx.a(at[3], Color.orange, 0, "");
            break;

        case 550: 
            if(stringtokenizer.countTokens() == 2)
            {
                if(ep)
                {
                    String s19 = stringtokenizer.nextToken();
                    String s37 = stringtokenizer.nextToken();
                    q.a(new net.spray.chat.a.b("", "", "0102" + s37 + " " + (String)bU.elementAt(117) + " " + _mthcase(s19), "", "", "", "", "", s19, "", "", true));
                }
            } else
            {
                q.a(new net.spray.chat.a.b("", "", "0102" + (String)bU.elementAt(115), "", "", "", "", "", "", "", "", true));
            }
            q._mthif();
            if(!dx._mthdo().equals(at[2]))
                dx.a(at[2], Color.orange, 0, "");
            break;

        case 551: 
            q.a(new net.spray.chat.a.b("", "", "0102" + (String)bU.elementAt(116), "", "", "", "", "", "", "", "", true));
            q._mthif();
            if(!dx._mthdo().equals(at[2]))
                dx.a(at[2], Color.orange, 0, "");
            break;

        case 555: 
            a(i1, stringtokenizer);
            return -2;

        case 667: 
            _mthint("667");
            break;

        case 799: 
            q.a(new net.spray.chat.a.b("", "", "0102" + (String)bU.elementAt(170), "", "", "", "", "", "", "", "", true));
            q._mthif();
            if(!dx._mthdo().equals(at[2]))
                dx.a(at[2], Color.orange, 0, "");
            break;

        case 850: 
            if(stringtokenizer.countTokens() != 3)
                return -1;
            String s20 = stringtokenizer.nextToken();
            String s38 = stringtokenizer.nextToken();
            int j6 = Integer.parseInt(stringtokenizer.nextToken());
            int k7 = 0;
            if(!bt.contains(s38 + s20.substring(s20.lastIndexOf(":"))))
            {
                if(dx.a(s38, 2, s20))
                {
                    if(!s38.equals(dx._mthdo()))
                        dx.a(s38, Color.orange, 2, s20);
                    for(; k7 < 20 && (!cx[k7].equals(s38) || !bT[k7].equals(s20)); k7++);
                    if(k7 < 20)
                        bR[k7].a(new net.spray.chat.a.b("", "", aI + (String)bU.elementAt(j6), "", "", "", "", "", "", "", "", false));
                } else
                {
                    k7 = a(s20, s38);
                    if(k7 != -1)
                    {
                        if(bq)
                            dx.a(s38, bv[k7], 2, -1, s20);
                        else
                            dx.a(s38, bv[k7], 2, _mthnew(s20), s20);
                        dx.a(s38, Color.orange, 2, s20);
                        bR[k7].a(new net.spray.chat.a.b("", "", aI + (String)bU.elementAt(j6), "", "", "", "", "", "", "", "", false));
                        bR[k7]._mthif();
                    }
                }
                bR[k7]._mthif();
            }
            break;

        case 851: 
            if(stringtokenizer.countTokens() != 4)
                return -1;
            String s21 = stringtokenizer.nextToken();
            String s39 = new String("0102caraline> \r");
            String s49 = stringtokenizer.nextToken();
            int l7 = Integer.parseInt(stringtokenizer.nextToken());
            String s73 = stringtokenizer.nextToken();
            int i10 = 0;
            if(!bt.contains(s49 + s21.substring(s21.lastIndexOf(":"))))
            {
                if(dx.a(s49, 2, s21))
                {
                    if(!s49.equals(dx._mthdo()))
                        dx.a(s49, Color.orange, 2, s21);
                    for(; i10 < 20 && (!cx[i10].equals(s49) || !bT[i10].equals(s21)); i10++);
                    if(i10 < 20)
                        if(l7 == 164 || l7 == 159 || l7 == 168)
                            bR[i10].a(new net.spray.chat.a.b("", "", aI + (String)bU.elementAt(l7) + " " + s73, "", "", "", "", "", "", "", "", false));
                        else
                            bR[i10].a(new net.spray.chat.a.b("", "", aI + s73 + " " + (String)bU.elementAt(l7), "", "", "", "", "", "", "", "", false));
                } else
                {
                    i10 = a(s21, s49);
                    if(i10 != -1)
                    {
                        if(bq)
                            dx.a(s49, bv[i10], 2, -1, s21);
                        else
                            dx.a(s49, bv[i10], 2, _mthnew(s21), s21);
                        dx.a(s49, Color.orange, 2, s21);
                        if(l7 == 164)
                            bR[i10].a(new net.spray.chat.a.b("", "", aI + (String)bU.elementAt(l7) + " " + s73, "", "", "", "", "", "", "", "", false));
                        else
                            bR[i10].a(new net.spray.chat.a.b("", "", aI + s73 + " " + (String)bU.elementAt(l7), "", "", "", "", "", "", "", "", false));
                    }
                }
                bR[i10]._mthif();
            }
            break;

        case 860: 
            if(stringtokenizer.countTokens() != 4)
                return -1;
            String s22 = stringtokenizer.nextToken();
            String s40 = stringtokenizer.nextToken();
            int k6 = Integer.parseInt(stringtokenizer.nextToken());
            int i8 = 0;
            int j9 = Integer.parseInt(stringtokenizer.nextToken());
            for(; i8 < 20 && (!cx[i8].equals(s40) || !bT[i8].equals(s22)); i8++);
            if(i8 < 20)
            {
                if(k6 == 0)
                    if(j9 == 1)
                        w[i8].enable();
                    else
                        w[i8].disable();
                if(k6 == 1)
                    if(j9 == 1)
                        ah[i8].enable();
                    else
                        ah[i8].disable();
                if(k6 == 2)
                    if(j9 == 1)
                        d6[i8].enable();
                    else
                        d6[i8].disable();
            }
            break;
        }
        if(!cw && flag)
        {
            if(flag1)
                try
                {
                    AppletContext appletcontext = _fldcase.getAppletContext();
                    appletcontext.showDocument(new URL("http://" + _fldcase.getCodeBase().getHost() + ":" + p + "/" + (String)bU.elementAt(137)), "empty");
                }
                catch(MalformedURLException malformedurlexception)
                {
                    System.err.println("malformed URL");
                }
            if(flag2)
                try
                {
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    toolkit.beep();
                }
                catch(Throwable throwable) { }
        }
        return 0;
    }

    public void _mthdo()
    {
        try
        {
            AppletContext appletcontext = _fldcase.getAppletContext();
            StringBuffer stringbuffer = new StringBuffer("http://");
            stringbuffer.append(_fldcase.getDocumentBase().getHost()).append('/').append((String)bU.elementAt(136));
            if(dk != null)
                stringbuffer.append("?p=").append(dk);
            appletcontext.showDocument(new URL(stringbuffer.toString()), "pub");
        }
        catch(MalformedURLException malformedurlexception)
        {
            System.err.println("malformed URL");
        }
    }

    public boolean a(Event event, Object obj)
    {
        if(event.target.equals(dx))
        {
            String s1 = (String)obj;
            int l2;
            for(l2 = 0; l2 < 20 && !cx[l2].equals(s1); l2++);
            if(l2 < 20)
                cT[l2].requestFocus();
            else
            if(s1.equals(at[3]))
                cU.requestFocus();
            else
            if(s1.equals(at[1]))
                _mthint("199");
            else
            if(s1.equals(at[0]))
            {
                ev.enable();
                b1.enable();
            } else
            if(bC != null && s1.equals(_mthcase(bC)))
            {
                H.requestFocus();
                if(!d9._mthdo().equals((String)bU.elementAt(196)))
                {
                    d9.a((String)bU.elementAt(196), Color.orange, 0, "");
                    d9.repaint();
                }
            }
            return true;
        }
        if(event.target.equals(d9))
        {
            String s2 = (String)obj;
            if(s2.equals((String)bU.elementAt(195)))
            {
                d9.a((String)bU.elementAt(196), Color.orange, 0, "");
                d9.repaint();
            }
            return true;
        }
        if(event.target.equals(cK))
        {
            aL._mthdo("1");
            aL._mthif();
            return true;
        }
        if(event.target.equals(dt))
        {
            aL._mthdo("3");
            aL._mthif();
            return true;
        }
        if(event.target.equals(bh))
        {
            aL._mthdo("41");
            aL._mthif();
            return true;
        }
        if(event.target.equals(R))
        {
            if(!c4.equals(cG.a()))
                a(cG.a());
            if(c6 && !C.equals(eC.getSelectedItem()))
                _mthbyte(eC.getSelectedItem());
            _fldcase.setLayout(null);
            _fldcase.removeAll();
            _fldcase.setLayout(new BorderLayout(0, 0));
            _fldcase.setBackground(Color.black);
            _fldcase.add("Center", dx);
            _fldcase.validate();
            _fldcase.setVisible(true);
            _fldcase.paintComponents(_fldcase.getGraphics());
            dx.repaint();
            dx._mthif(at[2], 0, "");
            return true;
        }
        if(event.target.equals(ci))
        {
            if(!c4.equals(aY))
                a(aY);
            if(c6)
            {
                _mthbyte(dQ);
                eC.select(dQ);
            }
            dx.repaint();
            _fldcase.setLayout(null);
            _fldcase.removeAll();
            _fldcase.setLayout(new BorderLayout(0, 0));
            _fldcase.setBackground(Color.black);
            _fldcase.add("Center", dx);
            _fldcase.validate();
            _fldcase.setVisible(true);
            dx.repaint();
            dx._mthif(at[2], 0, "");
            return true;
        }
        if(event.target.equals(cJ))
        {
            int i1 = 0;
            if(cg[0])
                i1++;
            if(cg[1])
                i1 += 2;
            if(cg[2])
                i1 += 4;
            if(_fldtry[0])
                i1 += 8;
            if(_fldtry[1])
                i1 += 16;
            if(_fldtry[2])
                i1 += 32;
            if(_fldbyte.getState())
                i1 += 16384;
            try
            {
                AppletContext appletcontext3 = _fldcase.getAppletContext();
                appletcontext3.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(138) + "?f=" + C + "&r=" + c4.getRed() + "&g=" + c4.getGreen() + "&b=" + c4.getBlue() + "&prefs=" + i1), "empty");
            }
            catch(MalformedURLException malformedurlexception3)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(_fldbyte))
        {
            for(int j1 = 0; j1 < 20; j1++)
            {
                U[j1].setState(_fldbyte.getState());
                bR[j1].a(_fldbyte.getState());
                bR[j1]._mthif();
            }

            return true;
        }
        if(event.target.equals(a))
        {
            _mthif(ee, ao);
            return true;
        }
        if((event.target.equals(cU) || event.target.equals(d5)) && cU.getText().length() > 0)
        {
            String s3 = cU.getText().trim();
            if(s3.length() > 80)
                s3 = s3.substring(0, 80).trim();
            _mthint("84\t" + s3);
            cU.setText("");
            cU.requestFocus();
            return true;
        }
        if((event.target.equals(cU) || event.target.equals(d5)) && cU.getText().length() == 0)
        {
            cU.setText("");
            return true;
        }
        if(event.target.equals(a7))
        {
            try
            {
                AppletContext appletcontext = _fldcase.getAppletContext();
                appletcontext.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(140)), "empty");
            }
            catch(MalformedURLException malformedurlexception)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(am))
        {
            try
            {
                AppletContext appletcontext1 = _fldcase.getAppletContext();
                appletcontext1.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(143)), "empty");
            }
            catch(MalformedURLException malformedurlexception1)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(db))
        {
            try
            {
                AppletContext appletcontext2 = _fldcase.getAppletContext();
                appletcontext2.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(151)), "empty");
            }
            catch(MalformedURLException malformedurlexception2)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(ed))
        {
            int k1 = 0;
            if(cg[0])
                k1++;
            if(cg[1])
                k1 += 2;
            if(cg[2])
                k1 += 4;
            if(_fldtry[0])
                k1 += 8;
            if(_fldtry[1])
                k1 += 16;
            if(_fldtry[2])
                k1 += 32;
            try
            {
                AppletContext appletcontext4 = _fldcase.getAppletContext();
                appletcontext4.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(138) + "?prefs=" + k1), "empty");
            }
            catch(MalformedURLException malformedurlexception4)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(l))
        {
            _mthif(as, _fldlong);
            return true;
        }
        if(event.target.equals(J))
        {
            String s4 = as;
            try
            {
                AppletContext appletcontext5 = _fldcase.getAppletContext();
                appletcontext5.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(144) + "?address=" + URLEncoder.encode(s4)), "empty");
            }
            catch(MalformedURLException malformedurlexception5)
            {
                System.err.println("malformed URL");
            }
            return true;
        }
        if(event.target.equals(bc))
        {
            _mthint("550");
            return true;
        }
        if(event.target.equals(aE))
        {
            if(eE.contains(cO))
                cO = cO.substring(1);
            if(eB)
                _mthint("18\t0\t" + cO + ap.substring(ap.lastIndexOf(":")));
            else
                _mthint("18\t1\t" + cO + ap.substring(ap.lastIndexOf(":")));
            _mthint("85");
            bA.disable();
            aE.disable();
            T.setText((String)bU.elementAt(73));
            return true;
        }
        if(event.target.equals(cY))
        {
            if(dI)
                _mthint("16\t0\t" + cO + ap.substring(ap.lastIndexOf(":")));
            else
                _mthint("16\t1\t" + cO.substring(1) + ap.substring(ap.lastIndexOf(":")));
            _mthint("85");
            bA.disable();
            aE.disable();
            cY.disable();
            T.setText((String)bU.elementAt(73));
            return true;
        }
        if(event.target.equals(bA))
        {
            String s5 = cO;
            if(s5.startsWith("*"))
                s5 = s5.substring(1);
            _mthif(s5, ap);
            return true;
        }
        if(event.target.equals(t))
        {
            if(aq)
                _mthint("18\t0\t" + ee + ao.substring(ao.lastIndexOf(":")));
            else
                _mthint("18\t1\t" + ee + ao.substring(ao.lastIndexOf(":")));
            return true;
        }
        if(event.target.equals(dP))
        {
            if(a(_fldint, b8) != null)
                _mthint("40\t" + _fldint + "\t0");
            return true;
        }
        if(event.target.equals(bp))
        {
            if(dd.equals(bC))
                dx._mthif(_mthcase(bC), 1, "");
            else
            if(a(dd, b8) != null)
                _mthint("40\t" + dd + "\t0");
            return true;
        }
        if(event.target.equals(de))
        {
            _mthint("255\t" + dd);
            _mthint("90");
            bp.disable();
            ev.disable();
            de.disable();
            eM.setText((String)bU.elementAt(73));
            return true;
        }
        if(event.target.equals(an))
        {
            _mthint("555\t" + bI + cX.substring(cX.lastIndexOf(":")));
            _mthint("85");
            return true;
        }
        if(event.target.equals(dF))
        {
            if(dF.getState())
            {
                af = b2.getText();
                _mthint("84\t" + (String)bU.elementAt(185));
                O = true;
            } else
            {
                b2.setText(af);
            }
            _mthint("26\t" + (dF.getState() ? (aR += 64) : (aR -= 64)));
            return true;
        }
        if(ep && event.target.equals(N))
        {
            _mthint("26\t" + (N.getState() ? (aR += 4) : (aR -= 4)));
            return true;
        }
        if(event.target.equals(cH))
        {
            if(!(Z = cH.getState()))
            {
                _mthint("26\t" + (aR -= 2));
                _mthint("19\t-1");
            } else
            {
                int l1 = bT.length;
                StringBuffer stringbuffer = new StringBuffer("19\t0");
                for(int i3 = 0; i3 < l1; i3++)
                    stringbuffer.append("\t").append(bT[i3]);

                _mthint("26\t" + (aR += 2));
                _mthint(stringbuffer.toString());
            }
            return true;
        }
        if(event.target.equals(dg))
        {
            if(dg.getState())
            {
                int i2 = H.getText().indexOf("> ");
                if(i2 != -1)
                {
                    H.setText(H.getText().substring(i2 + 2));
                } else
                {
                    int j2 = H.getText().indexOf(">");
                    if(j2 != -1)
                        H.setText(H.getText().substring(j2 + 1));
                }
                aj.setText((String)bU.elementAt(74) + " " + bO);
            } else
            {
                aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC));
            }
            return true;
        }
        if(event.target.equals(bB[0]))
        {
            cg[0] = bB[0].getState();
            return true;
        }
        if(event.target.equals(ay[0]))
        {
            _fldtry[0] = ay[0].getState();
            return true;
        }
        if(event.target.equals(bB[1]))
        {
            cg[1] = bB[1].getState();
            return true;
        }
        if(event.target.equals(ay[1]))
        {
            _fldtry[1] = ay[1].getState();
            return true;
        }
        if(event.target.equals(bB[2]))
        {
            cg[2] = bB[2].getState();
            return true;
        }
        if(event.target.equals(ay[2]))
        {
            _fldtry[2] = ay[2].getState();
            return true;
        }
        if((event.target.equals(H) || event.target.equals(eH)) && H.getText().length() == 0)
        {
            dY = "";
            bO = "";
            aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC));
            dg.setState(false);
            dg.disable();
            return true;
        }
        if(event.target.equals(b1))
        {
            _mthint("94");
            b1.disable();
            bp.disable();
            de.disable();
            eM.setText((String)bU.elementAt(73));
            ex = true;
            return true;
        }
        if(event.target.equals(ev))
        {
            _mthint("90");
            bp.disable();
            ev.disable();
            de.disable();
            eM.setText((String)bU.elementAt(73));
            ex = false;
            return true;
        }
        if(event.target.equals(dL))
        {
            byte byte0 = 97;
            int j3 = -2;
            String s16 = new String("58\t");
            a.disable();
            t.disable();
            dP.disable();
            if(di.getSelectedIndex() < 3)
                j3 = di.getSelectedIndex() - 1;
            String s14 = ca.getText();
            int k3 = ae.getSelectedIndex();
            if(k3 == 0)
                k3 = -2;
            if(k3 == 11)
                k3 = -1;
            if(s14.length() > 4)
                s14 = s14.substring(0, 4);
            if(_mthchar(s14) && (s14 = s14.trim().toLowerCase()).length() >= 2)
            {
                if(d3.getSelectedIndex() == 0)
                    s16 = "56\t";
                switch(di.getSelectedIndex())
                {
                case 0: // '\0'
                    _mthint(s16 + s14 + "\t" + k3 + "\t-2");
                    break;

                case 1: // '\001'
                    _mthint(s16 + s14 + "\t" + k3 + "\t0");
                    break;

                case 2: // '\002'
                    _mthint(s16 + s14 + "\t" + k3 + "\t1");
                    break;

                case 3: // '\003'
                    _mthint(s16 + s14 + "\t" + k3 + "\t-1");
                    break;
                }
                aW.setText((String)bU.elementAt(73));
            }
            return true;
        }
        if((event.target.equals(aJ) || event.target.equals(c1)) && aJ.getText().length() > 0)
        {
            if(bK[0].getState())
            {
                if(a(aJ.getText(), b8) != null)
                {
                    String s6 = "40\t" + aJ.getText() + "\t0";
                    _mthint(s6);
                }
            } else
            {
                String s7 = "40\t" + aJ.getText() + "\t1";
                _mthint(s7);
            }
            aJ.setText("");
            aJ.requestFocus();
            return true;
        }
        if((event.target.equals(eJ) || event.target.equals(a5)) && eJ.getText().length() > 0)
        {
            _mthint("40\t" + eJ.getText() + "\t1");
            eJ.setText("");
            eJ.requestFocus();
            return true;
        }
        if(event.target.equals(cy))
        {
            if(a(bn, b8) != null)
                _mthint("40\t" + bn + "\t0");
            return true;
        }
        String s8;
        if(event.target.equals(H) || event.target.equals(eH))
        {
            if((s8 = H.getText().trim()).length() > 0)
            {
                if(dF.getState())
                    _mthint("26\t" + (aR -= 64));
                StringBuffer stringbuffer1 = new StringBuffer("");
                if(s8.length() > 192)
                    s8 = s8.substring(0, 192).trim();
                if(!dg.getState())
                {
                    Vector vector = null;
                    if((vector = _mthelse(s8)) != null)
                    {
                        s8 = (String)vector.elementAt(2);
                        stringbuffer1.append("72\t").append((String)vector.elementAt(0)).append(':').append(((Integer)vector.elementAt(1)).intValue()).append('\t');
                    } else
                    if(a(s8, a3) != null)
                        stringbuffer1.append("70\t");
                    else
                        stringbuffer1.append("170\t");
                } else
                {
                    stringbuffer1.append("72\t").append(dY).append('\t');
                }
                switch(S.getSelectedIndex())
                {
                case 0: // '\0'
                    stringbuffer1.append("01");
                    break;

                case 1: // '\001'
                    stringbuffer1.append("00");
                    break;

                case 2: // '\002'
                    stringbuffer1.append("02");
                    break;

                case 3: // '\003'
                    stringbuffer1.append("03");
                    break;
                }
                switch(ef.getSelectedIndex())
                {
                case 0: // '\0'
                    stringbuffer1.append("00");
                    break;

                case 1: // '\001'
                    stringbuffer1.append("01");
                    break;

                case 2: // '\002'
                    stringbuffer1.append("02");
                    break;

                case 3: // '\003'
                    stringbuffer1.append("03");
                    break;

                case 4: // '\004'
                    stringbuffer1.append("04");
                    break;

                case 5: // '\005'
                    stringbuffer1.append("05");
                    break;

                case 6: // '\006'
                    stringbuffer1.append("06");
                    break;

                case 7: // '\007'
                    stringbuffer1.append("07");
                    break;

                case 8: // '\b'
                    stringbuffer1.append("08");
                    break;

                case 9: // '\t'
                    stringbuffer1.append("09");
                    break;

                case 10: // '\n'
                    stringbuffer1.append("10");
                    break;

                case 11: // '\013'
                    stringbuffer1.append("11");
                    break;
                }
                stringbuffer1.append(s8);
                long l3 = (new Date()).getTime();
                if(br > 0L && l3 - br < 10000L)
                {
                    if(++aS > 5)
                        _mthint("555\t" + bl + dy.substring(dy.lastIndexOf(":")));
                    else
                        _mthint(stringbuffer1.toString());
                } else
                {
                    br = l3;
                    aS = 1;
                    _mthint(stringbuffer1.toString());
                }
                aj.setText((String)bU.elementAt(17) + " " + _mthcase(bC));
                H.setText("");
                H.requestFocus();
                dY = "";
                bO = "";
                dg.setState(false);
                dg.disable();
                return true;
            }
        } else
        {
            for(int k2 = 0; k2 < 20; k2++)
                if(!bT[k2].equals(""))
                {
                    if((event.target.equals(cT[k2]) || event.target.equals(dA[k2])) && cT[k2].getText().length() > 0)
                    {
                        String s9 = cT[k2].getText().trim();
                        StringBuffer stringbuffer2 = new StringBuffer("");
                        String s15 = "";
                        String s17 = "";
                        if(s9.length() > 192)
                            s9 = s9.substring(0, 192).trim();
                        if(dF.getState())
                            _mthint("26\t" + (aR -= 64));
                        stringbuffer2.append("72\t");
                        stringbuffer2.append(bT[k2]);
                        stringbuffer2.append('\t');
                        switch(eF[k2].getSelectedIndex())
                        {
                        case 0: // '\0'
                            stringbuffer2.append("01");
                            break;

                        case 1: // '\001'
                            stringbuffer2.append("00");
                            break;

                        case 2: // '\002'
                            stringbuffer2.append("02");
                            break;

                        case 3: // '\003'
                            stringbuffer2.append("03");
                            break;
                        }
                        switch(bf[k2].getSelectedIndex())
                        {
                        case 0: // '\0'
                            stringbuffer2.append("00");
                            break;

                        case 1: // '\001'
                            stringbuffer2.append("01");
                            break;

                        case 2: // '\002'
                            stringbuffer2.append("02");
                            break;

                        case 3: // '\003'
                            stringbuffer2.append("03");
                            break;

                        case 4: // '\004'
                            stringbuffer2.append("04");
                            break;

                        case 5: // '\005'
                            stringbuffer2.append("05");
                            break;

                        case 6: // '\006'
                            stringbuffer2.append("06");
                            break;

                        case 7: // '\007'
                            stringbuffer2.append("07");
                            break;

                        case 8: // '\b'
                            stringbuffer2.append("08");
                            break;

                        case 9: // '\t'
                            stringbuffer2.append("09");
                            break;

                        case 10: // '\n'
                            stringbuffer2.append("10");
                            break;

                        case 11: // '\013'
                            stringbuffer2.append("11");
                            break;
                        }
                        stringbuffer2.append(s9);
                        if(s9.length() > 0)
                            _mthint(stringbuffer2.toString());
                        cT[k2].setText("");
                        cT[k2].requestFocus();
                        return true;
                    }
                    if(event.target.equals(e[k2]))
                    {
                        _mthint("18\t0\t" + cx[k2] + bT[k2].substring(bT[k2].lastIndexOf(":")));
                        dx._mthint(cx[k2], 2, bT[k2]);
                        if(a4)
                            dx._mthif(at[3], 0, "");
                        else
                            dx._mthif(_mthcase(bC), 1, "");
                        _mthint("85");
                        bA.disable();
                        aE.disable();
                        T.setText((String)bU.elementAt(73));
                        _mthif(k2);
                        H.requestFocus();
                        return true;
                    }
                    if(event.target.equals(u[k2]))
                    {
                        if(Z)
                            _mthint("19\t1\t" + bT[k2]);
                        dx._mthint(cx[k2], 2, bT[k2]);
                        if(a4)
                            dx._mthif(at[3], 0, "");
                        else
                            dx._mthif(_mthcase(bC), 1, "");
                        _mthif(k2);
                        H.requestFocus();
                        return true;
                    }
                    if(event.target.equals(ar[k2]))
                    {
                        _mthint("555\t" + cx[k2] + bT[k2].substring(bT[k2].lastIndexOf(":")));
                        dx._mthint(cx[k2], 2, bT[k2]);
                        dx._mthif(_mthcase(bC), 1, "");
                        _mthif(k2);
                        H.requestFocus();
                        return true;
                    }
                    if(event.target.equals(w[k2]))
                    {
                        _mthint("800\t" + bT[k2]);
                        w[k2].disable();
                        return true;
                    }
                    if(event.target.equals(ah[k2]))
                    {
                        _mthint("801\t" + bT[k2]);
                        ah[k2].disable();
                        d6[k2].disable();
                        return true;
                    }
                    if(event.target.equals(d6[k2]))
                    {
                        _mthint("802\t" + bT[k2]);
                        d6[k2].disable();
                        ah[k2].disable();
                        return true;
                    }
                    if(event.target.equals(U[k2]))
                    {
                        bR[k2].a(U[k2].getState());
                        bR[k2]._mthif();
                        cT[k2].requestFocus();
                        return true;
                    }
                    if(event.target.equals(dH[k2]))
                    {
                        String s10;
                        s10 = s10 = cx[k2] + "@" + _mthfor(bT[k2]);
                        try
                        {
                            AppletContext appletcontext6 = _fldcase.getAppletContext();
                            appletcontext6.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(144) + "?address=" + URLEncoder.encode(s10)), "empty");
                        }
                        catch(MalformedURLException malformedurlexception6)
                        {
                            System.err.println("malformed URL");
                        }
                        return true;
                    }
                    if(event.target.equals(du[k2]))
                    {
                        String s11 = cx[k2];
                        try
                        {
                            AppletContext appletcontext7 = _fldcase.getAppletContext();
                            appletcontext7.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(146) + "?s=" + URLEncoder.encode(s11)), "empty");
                        }
                        catch(MalformedURLException malformedurlexception7)
                        {
                            System.err.println("malformed URL");
                        }
                        return true;
                    }
                    if(event.target.equals(dc[k2]))
                    {
                        String s12 = cx[k2];
                        try
                        {
                            AppletContext appletcontext8 = _fldcase.getAppletContext();
                            appletcontext8.showDocument(new URL("http://" + _fldcase.getDocumentBase().getHost() + "/" + (String)bU.elementAt(149) + "?s=" + a(s12.getBytes("UTF8"))), "empty");
                        }
                        catch(Exception exception)
                        {
                            System.err.println("malformed URL");
                        }
                        return true;
                    }
                    if(event.target.equals(bb[k2]))
                    {
                        String s13 = (String)obj;
                        if(s13.equals((String)bU.elementAt(43)))
                        {
                            bb[k2].a((String)bU.elementAt(196), Color.orange, 0, "");
                            bb[k2].repaint();
                        }
                        return true;
                    }
                }

        }
        return false;
    }

    public void run()
    {
        ck = new Date();
        boolean flag = true;
        boolean flag1 = false;
        if(_fldfor)
        {
            int i1 = 0;
            byte abyte0[] = new byte[0x927c0];
            while(flag) 
                try
                {
                    int k1 = cN.read();
                    if(k1 == -1)
                    {
                        cN.close();
                        cN = null;
                        i1 = 0;
                        _mthint("666");
                        flag = _mthcase();
                    } else
                    if(i1 < 0x30d40)
                    {
                        if(k1 != 10)
                        {
                            abyte0[i1++] = (byte)k1;
                        } else
                        {
                            try
                            {
                                if(flag1 = a(new String(abyte0, 0, i1, "UTF8") + "\n") < -1)
                                    flag = false;
                            }
                            catch(UnsupportedEncodingException unsupportedencodingexception)
                            {
                                flag = false;
                            }
                            i1 = 0;
                        }
                    } else
                    {
                        i1 = 0;
                    }
                }
                catch(IOException ioexception)
                {
                    try
                    {
                        cN.close();
                        cN = null;
                    }
                    catch(IOException ioexception2) { }
                    i1 = 0;
                    _mthint("666");
                    flag = _mthcase();
                }
        } else
        {
            int j1 = 0;
            char ac1[] = new char[0x30d40];
            while(flag) 
                try
                {
                    int l1 = eq.read();
                    if(l1 == -1)
                        flag = false;
                    else
                    if(j1 < 0x30d40)
                    {
                        if(l1 != 10)
                        {
                            ac1[j1++] = (char)l1;
                        } else
                        {
                            if(flag1 = a(new String(ac1, 0, j1) + "\n") < -1)
                                flag = false;
                            j1 = 0;
                        }
                    } else
                    {
                        j1 = 0;
                    }
                }
                catch(IOException ioexception1)
                {
                    flag = false;
                }
        }
        if(!flag1)
            a(0, ((StringTokenizer) (null)));
        _mthfor();
    }

    public void a(int i1, StringTokenizer stringtokenizer)
    {
        String s1 = null;
        switch(i1)
        {
        case 0: // '\0'
            s1 = "0102" + (String)bU.elementAt(142);
            break;

        case 11: // '\013'
            s1 = "0102" + (String)bU.elementAt(78);
            break;

        case 12: // '\f'
            s1 = "0102" + (String)bU.elementAt(79);
            break;

        case 13: // '\r'
            s1 = "0102" + (String)bU.elementAt(80);
            break;

        case 14: // '\016'
            s1 = "0102" + (String)bU.elementAt(199);
            break;

        case 555: 
            if(stringtokenizer.countTokens() == 2)
            {
                String s2 = stringtokenizer.nextToken();
                String s3 = stringtokenizer.nextToken();
                if(s2.compareTo(dy) != 0)
                {
                    String s4 = "";
                    if(s2.substring(s2.lastIndexOf(":")).compareTo(dy.substring(dy.lastIndexOf(":"))) != 0)
                        s4 = s4 + "#";
                    s1 = "0102" + (String)bU.elementAt(93) + " " + s4 + s3;
                } else
                {
                    s1 = "0102" + (String)bU.elementAt(94);
                }
            } else
            {
                s1 = "0102" + (String)bU.elementAt(94);
            }
            break;
        }
        if(s1 != null)
        {
            dx.enable();
            dx.repaint();
            dx._mthif(at[2], 0, "");
            q.a(new net.spray.chat.a.b("", "", s1, "", "", "", "", "", "", "", "", true));
            q._mthif();
        }
    }

    public void _mthfor()
    {
        try
        {
            if(h != null)
                h.close();
            if(cN != null)
                cN.close();
            if(eq != null)
                eq.close();
            if(bx != null)
                bx.close();
            if(bJ != null)
            {
                bJ.a();
                bJ = null;
            }
        }
        catch(IOException ioexception) { }
    }

    private void _mthif(String s1, String s2)
    {
        if(!s1.equals(bl))
        {
            int i1 = 0;
            String s3 = s1;
            if(s3.startsWith("*"))
                s3 = s3.substring(1);
            if(dx.a(s3, 2, s2))
            {
                dx._mthif(s3, 2, s2);
                for(; i1 < 20 && !cx[i1].equals(s3) && !bT[i1].equals(s2); i1++);
                if(i1 < 20)
                    bR[i1]._mthif();
            } else
            {
                int j1 = a(s2, s3);
                if(j1 != -1)
                {
                    if(bq)
                        dx.a(s3, bv[j1], 2, -1, s2);
                    else
                        dx.a(s3, bv[j1], 2, _mthnew(s2), s2);
                    dx._mthif(s3, 2, s2);
                    bR[j1]._mthif();
                }
            }
        }
    }

    private Vector _mthelse(String s1)
    {
        if(s1.charAt(0) == '/' && (s1 = s1.substring(1).trim()).length() > 0)
        {
            int i1 = s1.indexOf(':');
            if(i1 != -1)
            {
                String s2;
                if((s2 = s1.substring(0, i1).trim()).length() == 0)
                    return null;
                String s3 = s1.substring(i1 + 1).trim();
                int j1;
                if((j1 = s3.indexOf(' ')) < 0)
                    return null;
                try
                {
                    if((i1 = Integer.parseInt(s3.substring(0, j1))) < 0)
                        return null;
                }
                catch(NumberFormatException numberformatexception)
                {
                    return null;
                }
                Vector vector1 = new Vector();
                vector1.addElement(s2);
                vector1.addElement(new Integer(i1));
                vector1.addElement(s3.substring(j1 + 1));
                return vector1;
            }
            if((i1 = s1.indexOf(' ')) < 0)
            {
                return null;
            } else
            {
                Vector vector = new Vector();
                vector.addElement(s1.substring(0, i1));
                vector.addElement(new Integer(0));
                vector.addElement(s1.substring(i1 + 1));
                return vector;
            }
        } else
        {
            return null;
        }
    }

    private boolean _mthchar(String s1)
    {
        for(int i1 = 0; i1 < s1.length(); i1++)
            if(!Character.isLetter(s1.charAt(i1)) && !Character.isDigit(s1.charAt(i1)) && s1.charAt(i1) != '.' && s1.charAt(i1) != '-' && s1.charAt(i1) != '_')
                return false;

        return true;
    }

    private String _mthcase(String s1)
    {
        if(a4)
            return "";
        String s3 = "0";
        StringTokenizer stringtokenizer = new StringTokenizer(s1, "#");
        if(stringtokenizer.countTokens() >= 2)
        {
            String s2 = stringtokenizer.nextToken();
            if(stringtokenizer.hasMoreElements())
                s3 = stringtokenizer.nextToken();
            if(s3.equals("0"))
                return s2;
            else
                return s2 + " " + s3;
        } else
        {
            return s1;
        }
    }

    private String a(String s1, Vector vector)
    {
        s1 = new String(_mthdo(s1.toLowerCase().trim()));
        StringTokenizer stringtokenizer = new StringTokenizer(s1);
        String s2;
        for(s2 = ""; stringtokenizer.hasMoreTokens(); s2 = s2 + stringtokenizer.nextToken());
        s1 = s2;
        for(int i1 = 0; i1 < vector.size(); i1++)
        {
            String s3 = (String)vector.elementAt(i1);
            StringTokenizer stringtokenizer1 = new StringTokenizer(s3, "&");
            if(stringtokenizer1.hasMoreTokens())
            {
                boolean flag;
                for(flag = true; flag && stringtokenizer1.hasMoreTokens();)
                    if(s1.indexOf(stringtokenizer1.nextToken().trim()) == -1)
                        flag = false;

                if(flag)
                    return null;
            } else
            if(s1.indexOf(s3) != -1)
                return null;
        }

        return s1;
    }

    public String _mthdo(String s1)
    {
        StringBuffer stringbuffer = new StringBuffer("");
        for(StringTokenizer stringtokenizer = new StringTokenizer(s1); stringtokenizer.hasMoreTokens(); stringbuffer.append(stringtokenizer.nextToken()));
        return stringbuffer.toString();
    }

    public String _mthif(String s1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int i1 = 0; i1 < s1.length();)
            if(i1 <= s1.length() - 6)
            {
                if(s1.substring(i1, i1 + 2).equals("\\u"))
                {
                    stringbuffer.append((char)Integer.parseInt(s1.substring(i1 + 2, i1 + 6), 16));
                    i1 += 6;
                } else
                {
                    stringbuffer.append(s1.substring(i1, i1 + 1));
                    i1++;
                }
            } else
            {
                stringbuffer.append(s1.substring(i1, i1 + 1));
                i1++;
            }

        return stringbuffer.toString();
    }

    public void _mthbyte(String s1)
    {
        C = s1;
        Object obj = null;
        int i1 = 0;
        byte byte0 = 10;
        byte byte1 = 12;
        Font font;
        Font font1;
        if(System.getProperty("os.name").indexOf("Windows") != -1 && !s1.equals("Helvetica"))
        {
            Object aobj[] = {
                s1, new Integer(i1), new Integer(byte0)
            };
            Object aobj1[] = {
                s1, new Integer(i1), new Integer(byte1)
            };
            Object aobj2[] = {
                s1, new Integer(0), new Integer(byte1)
            };
            Object aobj3[] = {
                s1, new Integer(1), new Integer(byte1)
            };
            Class aclass[] = {
                java.lang.String.class, Integer.TYPE, Integer.TYPE
            };
            Class aclass1[] = {
                java.lang.String.class, Integer.TYPE, Integer.TYPE
            };
            Class aclass2[] = {
                java.lang.String.class, Integer.TYPE, Integer.TYPE
            };
            Class aclass3[] = {
                java.lang.String.class, Integer.TYPE, Integer.TYPE
            };
            try
            {
                Class class1 = Class.forName("com.ms.awt.FontX");
                Constructor constructor = class1.getConstructor(aclass);
                cr = (Font)constructor.newInstance(aobj);
                Constructor constructor1 = class1.getConstructor(aclass1);
                cq = (Font)constructor1.newInstance(aobj1);
                Constructor constructor2 = class1.getConstructor(aclass2);
                font = (Font)constructor2.newInstance(aobj2);
                Constructor constructor3 = class1.getConstructor(aclass3);
                font1 = (Font)constructor3.newInstance(aobj3);
            }
            catch(Exception exception)
            {
                cr = new Font("Helvetica", 0, 10);
                cq = new Font("Helvetica", 0, 12);
                font = new Font("Helvetica", 0, 12);
                font1 = new Font("Helvetica", 1, 12);
            }
        } else
        {
            cr = new Font("Helvetica", 0, 10);
            cq = new Font("Helvetica", 0, 12);
            font = new Font("Helvetica", 0, 12);
            font1 = new Font("Helvetica", 1, 12);
        }
        dx.a(font, font1);
        ak.setFont(cq);
        F.setFont(cq);
        bH.setFont(cq);
        o.setFont(cq);
        au.setFont(cq);
        ds.setFont(cq);
        cE.setFont(cq);
        ej.setFont(cq);
        A.setFont(cq);
        eA.setFont(cq);
        d7.setFont(cq);
        cf.setFont(cq);
        cA.a(s1);
        cB.a(s1);
        q.a(s1);
        aL.a(s1);
        dT.a(s1);
        bN.a(s1);
        b1.setFont(cq);
        ev.setFont(cq);
        c1.setFont(cq);
        bp.setFont(cq);
        a5.setFont(cq);
        de.setFont(cq);
        bc.setFont(cq);
        aE.setFont(cq);
        cY.setFont(cq);
        eH.setFont(cq);
        bA.setFont(cq);
        an.setFont(cq);
        cy.setFont(cq);
        R.setFont(cq);
        cJ.setFont(cq);
        ci.setFont(cq);
        a.setFont(cq);
        t.setFont(cq);
        dP.setFont(cq);
        dL.setFont(cq);
        l.setFont(cq);
        J.setFont(cq);
        d5.setFont(cq);
        a7.setFont(cq);
        am.setFont(cq);
        db.setFont(cq);
        ed.setFont(cq);
        P.setFont(cq);
        aj.setFont(cq);
        T.setFont(cq);
        dZ.setFont(cq);
        eM.setFont(cq);
        aC.setFont(cq);
        bM.setFont(cq);
        dC.setFont(cq);
        z.setFont(cq);
        y.setFont(cq);
        aW.setFont(cq);
        n.setFont(cq);
        cC.setFont(cq);
        ax.setFont(cq);
        dh.setFont(cq);
        el.setFont(cq);
        d0.setFont(cq);
        b2.setFont(cq);
        d8[0].setFont(cq);
        d8[1].setFont(cq);
        d8[2].setFont(cq);
        bg.setFont(cq);
        et.setFont(cq);
        H.setFont(cq);
        aJ.setFont(cq);
        eJ.setFont(cq);
        ca.setFont(cq);
        cU.setFont(cq);
        dg.setFont(cq);
        cH.setFont(cq);
        cK.setFont(cq);
        dt.setFont(cq);
        bh.setFont(cq);
        N.setFont(cq);
        bK[0].setFont(cq);
        bK[1].setFont(cq);
        ef.setFont(cr);
        S.setFont(cr);
        eC.setFont(cq);
        d3.setFont(cq);
        di.setFont(cq);
        ae.setFont(cq);
        d9.a(font, font1);
        aU.setFont(cq);
        for(int j1 = 0; j1 < 20; j1++)
        {
            s[j1].setFont(cq);
            er[j1].setFont(cq);
            cS[j1].setFont(cq);
            bR[j1].a(s1);
            e[j1].setFont(cq);
            dA[j1].setFont(cq);
            dH[j1].setFont(cq);
            du[j1].setFont(cq);
            dc[j1].setFont(cq);
            u[j1].setFont(cq);
            ar[j1].setFont(cq);
            w[j1].setFont(cq);
            ah[j1].setFont(cq);
            d6[j1].setFont(cq);
            cT[j1].setFont(cq);
            bf[j1].setFont(cr);
            eF[j1].setFont(cr);
            bb[j1].a(font, font1);
            bd[j1].setFont(cq);
        }

    }

    public void a(Color color)
    {
        c4 = color;
        ez.setForeground(color);
        d4.setForeground(color);
        L.setForeground(color);
        cF.setForeground(color);
        dp.setForeground(color);
        cu.setForeground(color);
        dx.setBackground(color);
        dx.a(color);
        cG.a(color);
        ak.setBackground(color);
        F.setBackground(color);
        bH.setBackground(color);
        o.setBackground(color);
        au.setBackground(color);
        ds.setBackground(color);
        cE.setBackground(color);
        ej.setBackground(color);
        A.setBackground(color);
        eA.setBackground(color);
        d7.setBackground(color);
        cf.setBackground(color);
        b1.setBackground(color);
        ev.setBackground(color);
        c1.setBackground(color);
        bp.setBackground(color);
        a5.setBackground(color);
        aE.setBackground(color);
        cY.setBackground(color);
        eH.setBackground(color);
        bA.setBackground(color);
        cy.setBackground(color);
        cJ.setBackground(color);
        R.setBackground(color);
        ci.setBackground(color);
        a.setBackground(color);
        t.setBackground(color);
        dP.setBackground(color);
        dL.setBackground(color);
        l.setBackground(color);
        J.setBackground(color);
        d5.setBackground(color);
        a7.setBackground(color);
        am.setBackground(color);
        db.setBackground(color);
        ed.setBackground(color);
        aj.setBackground(color);
        T.setBackground(color);
        dZ.setBackground(color);
        eM.setBackground(color);
        aC.setBackground(color);
        bM.setBackground(color);
        dC.setBackground(color);
        z.setBackground(color);
        y.setBackground(color);
        aW.setBackground(color);
        n.setBackground(color);
        cC.setBackground(color);
        ax.setBackground(color);
        dh.setBackground(color);
        el.setBackground(color);
        d0.setBackground(color);
        b2.setBackground(color);
        d8[0].setBackground(color);
        d8[1].setBackground(color);
        d8[2].setBackground(color);
        bg.setBackground(color);
        et.setBackground(color);
        cU.setBackground(color);
        cK.setBackground(color);
        dt.setBackground(color);
        bh.setBackground(color);
        dg.setBackground(color);
        cH.setBackground(color);
        bB[0].setBackground(color);
        bB[1].setBackground(color);
        bB[2].setBackground(color);
        ay[0].setBackground(color);
        ay[1].setBackground(color);
        ay[2].setBackground(color);
        N.setBackground(color);
        bK[0].setBackground(color);
        bK[1].setBackground(color);
        d9.setBackground(color);
        d9.a(color);
        d9._mthif(d9._mthdo(), 0, "");
        d9.repaint();
        aU.setBackground(color);
        az.setForeground(color);
        for(int i1 = 0; i1 < 20; i1++)
        {
            s[i1].setBackground(color);
            er[i1].setBackground(color);
            cS[i1].setBackground(color);
            dG[i1].setForeground(color);
            e[i1].setBackground(color);
            dA[i1].setBackground(color);
            dH[i1].setBackground(color);
            du[i1].setBackground(color);
            u[i1].setBackground(color);
            ah[i1].setBackground(color);
            d6[i1].setBackground(color);
            bb[i1].setBackground(color);
            bb[i1].a(color);
            bb[i1]._mthif(bb[i1]._mthdo(), 0, "");
            bb[i1].repaint();
            bd[i1].setBackground(color);
            dN[i1].setForeground(color);
        }

    }

    public static void a(String as1[], int i1, int j1)
    {
        if(i1 >= j1)
            return;
        int k1 = (i1 + j1) / 2;
        Collator collator = Collator.getInstance(Locale.getDefault());
        if(collator.compare(as1[i1], as1[k1]) > 0)
        {
            String s1 = as1[i1];
            as1[i1] = as1[k1];
            as1[k1] = s1;
        }
        if(collator.compare(as1[k1], as1[j1]) > 0)
        {
            String s2 = as1[k1];
            as1[k1] = as1[j1];
            as1[j1] = s2;
            if(collator.compare(as1[i1], as1[k1]) > 0)
            {
                String s3 = as1[i1];
                as1[i1] = as1[k1];
                as1[k1] = s3;
            }
        }
        int l1 = i1 + 1;
        int i2 = j1 - 1;
        if(l1 >= i2)
            return;
        String s4 = as1[k1];
        do
        {
            while(collator.compare(as1[i2], s4) > 0) 
                i2--;
            for(; l1 < i2 && collator.compare(as1[l1], s4) <= 0; l1++);
            if(l1 < i2)
            {
                String s5 = as1[l1];
                as1[l1] = as1[i2];
                as1[i2] = s5;
                i2--;
            } else
            {
                a(as1, i1, l1);
                a(as1, l1 + 1, j1);
                return;
            }
        } while(true);
    }

    public String _mthtry(String s1)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(s1, "*");
        int i1;
        if(stringtokenizer.countTokens() > 0)
            try
            {
                i1 = Integer.parseInt(stringtokenizer.nextToken());
            }
            catch(NumberFormatException numberformatexception)
            {
                i1 = 2;
            }
        else
            i1 = 3;
        switch(i1)
        {
        case 0: // '\0'
            return "03";

        case 1: // '\001'
            return "01";

        case 2: // '\002'
            return "10";

        case 3: // '\003'
            return "05";

        case 4: // '\004'
            return "08";

        case 5: // '\005'
            return "02";

        case 6: // '\006'
            return "04";
        }
        return "05";
    }

    private char bQ[];
    private CaraNewChat _fldcase;
    private int aR;
    private static final int dq = 0;
    private static final int bS = 1;
    private static final int aX = 2;
    private static final int _flddo = 0;
    private static final int bD = 1;
    private static final int B = 2;
    private static final int aA = 193;
    private static final int aF = 4;
    private static final int en = 5;
    private static final int aH = 6;
    private static final int co = 135;
    private static final int bs = 111;
    private static final String x = "en";
    private static final String Q = "fr";
    private static final int G = 0;
    private static final int ek = 1;
    private static final int a6 = 2;
    private static final int dl = 6666;
    private static final int bm = 80;
    private static final int cR = 0;
    private static final int g = 0;
    private static final int ch = 192;
    private static final int dj = 80;
    private static final int eG = 30;
    private static final int bE = 0x30d40;
    private static final int cd = 50;
    private static final long ad = 0x927c0L;
    private static final int av = 0;
    private static final int dW = 3;
    private static final int aZ = 4;
    private static final int d = 5;
    private static final int eI = 8;
    private static final int eg = 1;
    private static final int cL = 7;
    private static final String bY = "03";
    private static final String dK = "01";
    private static final String _fldchar = "10";
    private static final String cI = "05";
    private static final String dm = "02";
    private static final String dE = "08";
    private static final String bW = "04";
    private net.spray.chat.normal.a bJ;
    private boolean Z;
    private boolean O;
    private boolean a4;
    private boolean aT;
    private boolean cg[];
    private boolean _fldtry[];
    private boolean ab[];
    private boolean bq;
    private boolean dM;
    private boolean cw;
    private int cs;
    private int bi;
    private int _fldelse;
    private int p;
    private int bX;
    private Font cr;
    private Font cq;
    private String dk;
    private String _fldgoto;
    private String C;
    private String dQ;
    private String cb;
    private String i;
    private String M;
    private String cZ;
    private String a8;
    private String cz;
    private String bl;
    private String dy;
    private String a1;
    private String d1;
    private int ew;
    private String dY;
    private String bO;
    private String cD;
    private String bC;
    private String k;
    private String cP;
    private String cX;
    private String bI;
    private String bn;
    private String _fldint;
    private String ao;
    private String ee;
    private String dU;
    private String a2;
    private String _fldlong;
    private String as;
    private String af;
    private String dd;
    private Color c4;
    private Color aY;
    private Color m;
    private String ap;
    private String cO;
    private Vector bU;
    private Vector b8;
    private boolean cm;
    private boolean eB;
    private boolean dI;
    private boolean aq;
    private boolean _fldfor;
    private boolean ep;
    private boolean aV;
    private boolean dR;
    private boolean aP;
    private boolean c;
    private boolean ex;
    private boolean c6;
    private String aN;
    private Socket h;
    private InputStream cN;
    private InputStreamReader eq;
    private OutputStreamWriter bx;
    private String aI;
    private Vector eK;
    private Vector a3;
    private Hashtable cv;
    private Vector bt;
    private Vector eE;
    private Vector V;
    private Vector eD;
    private Date ck;
    private Date I;
    private int dO;
    private long be;
    private long aa;
    private int aS;
    private long br;
    private String eb;
    private long bw;
    private int aO;
    private static final int aK = 0;
    private static final int b0 = 1;
    private String dX[];
    private String ct[];
    private String E[];
    private String em[];
    private String X[];
    private String ey[];
    private String at[];
    private final int df = 40;
    private final int ag = 40;
    private final int cV = 2000;
    private final int c7 = 20;
    private final int bu = 60;
    private long _fldvoid[];
    private long ea[];
    private int f[];
    private boolean c5[];
    private boolean c2[];
    private final boolean bV = true;
    private final boolean bF = true;
    private final boolean b5 = true;
    private final boolean da = false;
    private final boolean ba = false;
    private final boolean ec = false;
    private final boolean j = false;
    private g cA;
    private g cB;
    private g q;
    private g aL;
    private g dT;
    private g bN;
    private d dx;
    private TextArea cp;
    protected Insets c8;
    private Panel eo;
    private Panel aD;
    private Panel K;
    private Panel ei;
    private Panel dw;
    private Panel aB;
    private Panel cn;
    private j dp;
    private j cF;
    private a F;
    private a bH;
    private Button bc;
    private Button aE;
    private Button eH;
    private Button bA;
    private Button an;
    private Button cY;
    private Label aj;
    private Label T;
    private Label dZ;
    private CheckboxGroup b9;
    private Checkbox dt;
    private Checkbox cK;
    private Checkbox bh;
    private Panel cc;
    private TextField H;
    private Checkbox dg;
    private Checkbox cH;
    private Choice ef;
    private Choice S;
    private Button d5;
    private Label el;
    private Label d0;
    private Label b2;
    private TextField cU;
    private Panel bk;
    private Panel aM;
    private Panel a0;
    private Panel c0;
    private j cu;
    private a d7;
    private Button l;
    private Button eh;
    private Button J;
    private Button a7;
    private Button am;
    private Button db;
    private a ak;
    private Checkbox bB[];
    private Checkbox ay[];
    private Checkbox dF;
    private Label d8[];
    private Label bg;
    private Label et;
    private Panel bZ;
    private Panel cM;
    private Button ed;
    private a cf;
    private Panel dB;
    private Panel cQ;
    private Panel bv[];
    private Panel b3[];
    private Panel bP[];
    private Panel _fldnull[];
    private Panel ac[];
    private Panel c3[];
    private Panel dz[];
    private Panel _fldnew[];
    private j dG[];
    private g bR[];
    private a s[];
    private a er[];
    private a cS[];
    private Button e[];
    private Button dA[];
    private Button dH[];
    private Button du[];
    private Button dc[];
    private Button ar[];
    private Button w[];
    private Button ah[];
    private Button d6[];
    private TextField cT[];
    private Choice bf[];
    private Choice eF[];
    private Button u[];
    private String Y[];
    private String bT[];
    private String cx[];
    private boolean dv[];
    private String eu[];
    private String bG[];
    private String b4[];
    private Checkbox U[];
    private j L;
    private a o;
    private Panel b;
    private Panel bj;
    private Panel dS;
    private Button cy;
    private Checkbox N;
    private Checkbox _fldbyte;
    private a au;
    private Choice eC;
    private Label P;
    private Panel aG;
    private Panel cl;
    private Panel ce;
    private Panel d2;
    private Button R;
    private Button cJ;
    private Button ci;
    private i cG;
    private Panel c9;
    private Panel bL;
    private Panel _fldif;
    private Panel z;
    private Panel y;
    private Panel dV;
    private Panel cW;
    private Panel a9;
    private a ds;
    private a cE;
    private a ej;
    private j d4;
    private Button b1;
    private Button ev;
    private Button c1;
    private Button bp;
    private Button a5;
    private Button de;
    private Checkbox bK[];
    private CheckboxGroup bo;
    private Label aC;
    private Label bM;
    private Label dC;
    private Label eM;
    private TextField aJ;
    private TextField eJ;
    private Panel eL;
    private Panel dD;
    private Panel r;
    private Panel aw;
    private Panel al;
    private Panel W;
    private Panel b7;
    private a A;
    private a eA;
    private Label aW;
    private Label dh;
    private Label n;
    private Label ax;
    private Label cC;
    private Label cj;
    private j ez;
    private Button a;
    private Button t;
    private Button dP;
    private Button dL;
    private Panel b6;
    private TextField ca;
    private TextField v;
    private Choice ae;
    private Choice di;
    private Choice d3;
    private int aQ;
    private Panel es;
    public d d9;
    private Panel dr;
    private Panel dJ;
    private j az;
    private c D;
    private a aU;
    private Panel dn[];
    public d bb[];
    private Panel bz[];
    private Panel ai[];
    private j dN[];
    private c by[];
    private a bd[];
}
