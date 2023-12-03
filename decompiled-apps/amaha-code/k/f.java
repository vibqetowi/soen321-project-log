package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.q0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import t0.m;
/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f22711e;
    public static final Class<?>[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f22712a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f22713b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f22714c;

    /* renamed from: d  reason: collision with root package name */
    public Object f22715d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f22716c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f22717a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f22718b;

        public a(Object obj, String str) {
            this.f22717a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f22718b = cls.getMethod(str, f22716c);
            } catch (Exception e10) {
                StringBuilder g5 = defpackage.d.g("Couldn't resolve menu item onClick handler ", str, " in class ");
                g5.append(cls.getName());
                InflateException inflateException = new InflateException(g5.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f22718b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f22717a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f22719a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22725h;

        /* renamed from: i  reason: collision with root package name */
        public int f22726i;

        /* renamed from: j  reason: collision with root package name */
        public int f22727j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f22728k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f22729l;

        /* renamed from: m  reason: collision with root package name */
        public int f22730m;

        /* renamed from: n  reason: collision with root package name */
        public char f22731n;

        /* renamed from: o  reason: collision with root package name */
        public int f22732o;

        /* renamed from: p  reason: collision with root package name */
        public char f22733p;

        /* renamed from: q  reason: collision with root package name */
        public int f22734q;
        public int r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f22735s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f22736t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f22737u;

        /* renamed from: v  reason: collision with root package name */
        public int f22738v;

        /* renamed from: w  reason: collision with root package name */
        public int f22739w;

        /* renamed from: x  reason: collision with root package name */
        public String f22740x;

        /* renamed from: y  reason: collision with root package name */
        public String f22741y;

        /* renamed from: z  reason: collision with root package name */
        public t0.b f22742z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f22720b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f22721c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f22722d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f22723e = 0;
        public boolean f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f22724g = true;

        public b(Menu menu) {
            this.f22719a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f22714c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f22735s).setVisible(this.f22736t).setEnabled(this.f22737u);
            boolean z11 = false;
            if (this.r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f22729l).setIcon(this.f22730m);
            int i6 = this.f22738v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            String str = this.f22741y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.f22714c.isRestricted()) {
                    if (fVar.f22715d == null) {
                        fVar.f22715d = f.a(fVar.f22714c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f22715d, this.f22741y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).f(true);
                } else if (menuItem instanceof l.c) {
                    l.c cVar = (l.c) menuItem;
                    try {
                        Method method = cVar.f23978e;
                        m0.b bVar = cVar.f23977d;
                        if (method == null) {
                            cVar.f23978e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f23978e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f22740x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f22711e, fVar.f22712a));
                z11 = true;
            }
            int i10 = this.f22739w;
            if (i10 > 0) {
                if (!z11) {
                    menuItem.setActionView(i10);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            t0.b bVar2 = this.f22742z;
            if (bVar2 != null) {
                if (menuItem instanceof m0.b) {
                    ((m0.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof m0.b;
            if (z12) {
                ((m0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((m0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.m(menuItem, charSequence2);
            }
            char c10 = this.f22731n;
            int i11 = this.f22732o;
            if (z12) {
                ((m0.b) menuItem).setAlphabeticShortcut(c10, i11);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.g(menuItem, c10, i11);
            }
            char c11 = this.f22733p;
            int i12 = this.f22734q;
            if (z12) {
                ((m0.b) menuItem).setNumericShortcut(c11, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.k(menuItem, c11, i12);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((m0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z12) {
                    ((m0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f22711e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f22714c = context;
        Object[] objArr = {context};
        this.f22712a = objArr;
        this.f22713b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i6;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i6 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = bVar.f22719a;
                if (eventType != i6) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.f22720b = 0;
                            bVar.f22721c = 0;
                            bVar.f22722d = 0;
                            bVar.f22723e = 0;
                            bVar.f = true;
                            bVar.f22724g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f22725h) {
                                t0.b bVar2 = bVar.f22742z;
                                if (bVar2 != null && bVar2.a()) {
                                    bVar.f22725h = true;
                                    bVar.b(menu2.addSubMenu(bVar.f22720b, bVar.f22726i, bVar.f22727j, bVar.f22728k).getItem());
                                } else {
                                    bVar.f22725h = true;
                                    bVar.b(menu2.add(bVar.f22720b, bVar.f22726i, bVar.f22727j, bVar.f22728k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z11 = true;
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f22714c.obtainStyledAttributes(attributeSet, kc.f.O);
                        bVar.f22720b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f22721c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f22722d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f22723e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f22724g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = fVar.f22714c;
                        l1 l1Var = new l1(context, context.obtainStyledAttributes(attributeSet, kc.f.P));
                        bVar.f22726i = l1Var.i(2, 0);
                        bVar.f22727j = (l1Var.h(5, bVar.f22721c) & (-65536)) | (l1Var.h(6, bVar.f22722d) & 65535);
                        bVar.f22728k = l1Var.k(7);
                        bVar.f22729l = l1Var.k(8);
                        bVar.f22730m = l1Var.i(0, 0);
                        String j10 = l1Var.j(9);
                        if (j10 == null) {
                            charAt = 0;
                        } else {
                            charAt = j10.charAt(0);
                        }
                        bVar.f22731n = charAt;
                        bVar.f22732o = l1Var.h(16, 4096);
                        String j11 = l1Var.j(10);
                        if (j11 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j11.charAt(0);
                        }
                        bVar.f22733p = charAt2;
                        bVar.f22734q = l1Var.h(20, 4096);
                        if (l1Var.l(11)) {
                            bVar.r = l1Var.a(11, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.f22723e;
                        }
                        bVar.f22735s = l1Var.a(3, false);
                        bVar.f22736t = l1Var.a(4, bVar.f);
                        bVar.f22737u = l1Var.a(1, bVar.f22724g);
                        bVar.f22738v = l1Var.h(21, -1);
                        bVar.f22741y = l1Var.j(12);
                        bVar.f22739w = l1Var.i(13, 0);
                        bVar.f22740x = l1Var.j(15);
                        String j12 = l1Var.j(14);
                        if (j12 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && bVar.f22739w == 0 && bVar.f22740x == null) {
                            bVar.f22742z = (t0.b) bVar.a(j12, f, fVar.f22713b);
                        } else {
                            if (z10) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f22742z = null;
                        }
                        bVar.A = l1Var.k(17);
                        bVar.B = l1Var.k(22);
                        if (l1Var.l(19)) {
                            bVar.D = q0.c(l1Var.h(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (l1Var.l(18)) {
                            bVar.C = l1Var.b(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        l1Var.n();
                        bVar.f22725h = false;
                    } else if (name3.equals("menu")) {
                        bVar.f22725h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(bVar.f22720b, bVar.f22726i, bVar.f22727j, bVar.f22728k);
                        bVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z12 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i6 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i6, Menu menu) {
        if (!(menu instanceof m0.a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f22714c.getResources().getLayout(i6);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
