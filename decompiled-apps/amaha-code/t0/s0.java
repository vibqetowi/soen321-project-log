package t0;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.theinnerhour.b2b.utils.Constants;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t0.d;
import t0.d0;
/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f32350b;

    /* renamed from: a  reason: collision with root package name */
    public final k f32351a;

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f32352a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f32353b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f32354c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f32355d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f32352a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f32353b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f32354c = declaredField3;
                declaredField3.setAccessible(true);
                f32355d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(s0 s0Var) {
            super(s0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public e() {
            this(new s0());
        }

        public s0 b() {
            throw null;
        }

        public void c(j0.e eVar) {
            throw null;
        }

        public void d(j0.e eVar) {
            throw null;
        }

        public e(s0 s0Var) {
        }

        public final void a() {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f32362h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f32363i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f32364j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f32365k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f32366l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f32367c;

        /* renamed from: d  reason: collision with root package name */
        public j0.e[] f32368d;

        /* renamed from: e  reason: collision with root package name */
        public j0.e f32369e;
        public s0 f;

        /* renamed from: g  reason: collision with root package name */
        public j0.e f32370g;

        public f(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f32369e = null;
            this.f32367c = windowInsets;
        }

        private j0.e r(int i6, boolean z10) {
            j0.e eVar = j0.e.f21622e;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) != 0) {
                    j0.e s10 = s(i10, z10);
                    eVar = j0.e.a(Math.max(eVar.f21623a, s10.f21623a), Math.max(eVar.f21624b, s10.f21624b), Math.max(eVar.f21625c, s10.f21625c), Math.max(eVar.f21626d, s10.f21626d));
                }
            }
            return eVar;
        }

        private j0.e t() {
            s0 s0Var = this.f;
            if (s0Var != null) {
                return s0Var.f32351a.h();
            }
            return j0.e.f21622e;
        }

        private j0.e u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f32362h) {
                    v();
                }
                Method method = f32363i;
                if (method != null && f32364j != null && f32365k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f32365k.get(f32366l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return j0.e.a(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void v() {
            try {
                f32363i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f32364j = cls;
                f32365k = cls.getDeclaredField("mVisibleInsets");
                f32366l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f32365k.setAccessible(true);
                f32366l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f32362h = true;
        }

        @Override // t0.s0.k
        public void d(View view) {
            j0.e u10 = u(view);
            if (u10 == null) {
                u10 = j0.e.f21622e;
            }
            w(u10);
        }

        @Override // t0.s0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f32370g, ((f) obj).f32370g);
        }

        @Override // t0.s0.k
        public j0.e f(int i6) {
            return r(i6, false);
        }

        @Override // t0.s0.k
        public final j0.e j() {
            if (this.f32369e == null) {
                WindowInsets windowInsets = this.f32367c;
                this.f32369e = j0.e.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f32369e;
        }

        @Override // t0.s0.k
        public s0 l(int i6, int i10, int i11, int i12) {
            e bVar;
            s0 h10 = s0.h(this.f32367c, null);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                bVar = new d(h10);
            } else if (i13 >= 29) {
                bVar = new c(h10);
            } else {
                bVar = new b(h10);
            }
            bVar.d(s0.e(j(), i6, i10, i11, i12));
            bVar.c(s0.e(h(), i6, i10, i11, i12));
            return bVar.b();
        }

        @Override // t0.s0.k
        public boolean n() {
            return this.f32367c.isRound();
        }

        @Override // t0.s0.k
        public void o(j0.e[] eVarArr) {
            this.f32368d = eVarArr;
        }

        @Override // t0.s0.k
        public void p(s0 s0Var) {
            this.f = s0Var;
        }

        public j0.e s(int i6, boolean z10) {
            int i10;
            t0.d e10;
            int i11;
            int i12;
            int i13;
            int i14 = 0;
            if (i6 != 1) {
                j0.e eVar = null;
                if (i6 != 2) {
                    j0.e eVar2 = j0.e.f21622e;
                    if (i6 != 8) {
                        if (i6 != 16) {
                            if (i6 != 32) {
                                if (i6 != 64) {
                                    if (i6 != 128) {
                                        return eVar2;
                                    }
                                    s0 s0Var = this.f;
                                    if (s0Var != null) {
                                        e10 = s0Var.f32351a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = e10.f32287a;
                                        if (i15 >= 28) {
                                            i11 = d.a.d(displayCutout);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = d.a.f(displayCutout);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = d.a.e(displayCutout);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = d.a.c(displayCutout);
                                        }
                                        return j0.e.a(i11, i12, i13, i14);
                                    }
                                    return eVar2;
                                }
                                return k();
                            }
                            return g();
                        }
                        return i();
                    }
                    j0.e[] eVarArr = this.f32368d;
                    if (eVarArr != null) {
                        eVar = eVarArr[3];
                    }
                    if (eVar != null) {
                        return eVar;
                    }
                    j0.e j10 = j();
                    j0.e t3 = t();
                    int i16 = j10.f21626d;
                    if (i16 > t3.f21626d) {
                        return j0.e.a(0, 0, 0, i16);
                    }
                    j0.e eVar3 = this.f32370g;
                    if (eVar3 != null && !eVar3.equals(eVar2) && (i10 = this.f32370g.f21626d) > t3.f21626d) {
                        return j0.e.a(0, 0, 0, i10);
                    }
                    return eVar2;
                } else if (z10) {
                    j0.e t10 = t();
                    j0.e h10 = h();
                    return j0.e.a(Math.max(t10.f21623a, h10.f21623a), 0, Math.max(t10.f21625c, h10.f21625c), Math.max(t10.f21626d, h10.f21626d));
                } else {
                    j0.e j11 = j();
                    s0 s0Var2 = this.f;
                    if (s0Var2 != null) {
                        eVar = s0Var2.f32351a.h();
                    }
                    int i17 = j11.f21626d;
                    if (eVar != null) {
                        i17 = Math.min(i17, eVar.f21626d);
                    }
                    return j0.e.a(j11.f21623a, 0, j11.f21625c, i17);
                }
            } else if (z10) {
                return j0.e.a(0, Math.max(t().f21624b, j().f21624b), 0, 0);
            } else {
                return j0.e.a(0, j().f21624b, 0, 0);
            }
        }

        public void w(j0.e eVar) {
            this.f32370g = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public j0.e f32371m;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f32371m = null;
        }

        @Override // t0.s0.k
        public s0 b() {
            return s0.h(this.f32367c.consumeStableInsets(), null);
        }

        @Override // t0.s0.k
        public s0 c() {
            return s0.h(this.f32367c.consumeSystemWindowInsets(), null);
        }

        @Override // t0.s0.k
        public final j0.e h() {
            if (this.f32371m == null) {
                WindowInsets windowInsets = this.f32367c;
                this.f32371m = j0.e.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f32371m;
        }

        @Override // t0.s0.k
        public boolean m() {
            return this.f32367c.isConsumed();
        }

        @Override // t0.s0.k
        public void q(j0.e eVar) {
            this.f32371m = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // t0.s0.k
        public s0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f32367c.consumeDisplayCutout();
            return s0.h(consumeDisplayCutout, null);
        }

        @Override // t0.s0.k
        public t0.d e() {
            DisplayCutout displayCutout;
            displayCutout = this.f32367c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new t0.d(displayCutout);
        }

        @Override // t0.s0.f, t0.s0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Objects.equals(this.f32367c, hVar.f32367c) && Objects.equals(this.f32370g, hVar.f32370g)) {
                return true;
            }
            return false;
        }

        @Override // t0.s0.k
        public int hashCode() {
            return this.f32367c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i6) {
            int statusBars;
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i6 & i11) != 0) {
                    if (i11 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i11 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i11 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i11 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i11 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i11 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i11 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i11 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i10 |= statusBars;
                }
            }
            return i10;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f32350b = j.f32375q;
        } else {
            f32350b = k.f32376b;
        }
    }

    public s0(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f32351a = new j(this, windowInsets);
        } else if (i6 >= 29) {
            this.f32351a = new i(this, windowInsets);
        } else if (i6 >= 28) {
            this.f32351a = new h(this, windowInsets);
        } else {
            this.f32351a = new g(this, windowInsets);
        }
    }

    public static j0.e e(j0.e eVar, int i6, int i10, int i11, int i12) {
        int max = Math.max(0, eVar.f21623a - i6);
        int max2 = Math.max(0, eVar.f21624b - i10);
        int max3 = Math.max(0, eVar.f21625c - i11);
        int max4 = Math.max(0, eVar.f21626d - i12);
        if (max == i6 && max2 == i10 && max3 == i11 && max4 == i12) {
            return eVar;
        }
        return j0.e.a(max, max2, max3, max4);
    }

    public static s0 h(WindowInsets windowInsets, View view) {
        s0 j10;
        windowInsets.getClass();
        s0 s0Var = new s0(windowInsets);
        if (view != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.b(view)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    j10 = d0.j.a(view);
                } else {
                    j10 = d0.i.j(view);
                }
                k kVar = s0Var.f32351a;
                kVar.p(j10);
                kVar.d(view.getRootView());
            }
        }
        return s0Var;
    }

    @Deprecated
    public final int a() {
        return this.f32351a.j().f21626d;
    }

    @Deprecated
    public final int b() {
        return this.f32351a.j().f21623a;
    }

    @Deprecated
    public final int c() {
        return this.f32351a.j().f21625c;
    }

    @Deprecated
    public final int d() {
        return this.f32351a.j().f21624b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        return s0.b.a(this.f32351a, ((s0) obj).f32351a);
    }

    @Deprecated
    public final s0 f(int i6, int i10, int i11, int i12) {
        e bVar;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            bVar = new d(this);
        } else if (i13 >= 29) {
            bVar = new c(this);
        } else {
            bVar = new b(this);
        }
        bVar.d(j0.e.a(i6, i10, i11, i12));
        return bVar.b();
    }

    public final WindowInsets g() {
        k kVar = this.f32351a;
        if (kVar instanceof f) {
            return ((f) kVar).f32367c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f32351a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: c  reason: collision with root package name */
        public static Field f32356c = null;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f32357d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f32358e = null;
        public static boolean f = false;

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f32359a;

        /* renamed from: b  reason: collision with root package name */
        public j0.e f32360b;

        public b() {
            this.f32359a = e();
        }

        private static WindowInsets e() {
            if (!f32357d) {
                try {
                    f32356c = WindowInsets.class.getDeclaredField(Constants.COUPON_STATE_CONSUMED);
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f32357d = true;
            }
            Field field = f32356c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f) {
                try {
                    f32358e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = f32358e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // t0.s0.e
        public s0 b() {
            a();
            s0 h10 = s0.h(this.f32359a, null);
            k kVar = h10.f32351a;
            kVar.o(null);
            kVar.q(this.f32360b);
            return h10;
        }

        @Override // t0.s0.e
        public void c(j0.e eVar) {
            this.f32360b = eVar;
        }

        @Override // t0.s0.e
        public void d(j0.e eVar) {
            WindowInsets windowInsets = this.f32359a;
            if (windowInsets != null) {
                this.f32359a = windowInsets.replaceSystemWindowInsets(eVar.f21623a, eVar.f21624b, eVar.f21625c, eVar.f21626d);
            }
        }

        public b(s0 s0Var) {
            super(s0Var);
            this.f32359a = s0Var.g();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsets.Builder f32361a;

        public c() {
            this.f32361a = new WindowInsets.Builder();
        }

        @Override // t0.s0.e
        public s0 b() {
            WindowInsets build;
            a();
            build = this.f32361a.build();
            s0 h10 = s0.h(build, null);
            h10.f32351a.o(null);
            return h10;
        }

        @Override // t0.s0.e
        public void c(j0.e eVar) {
            this.f32361a.setStableInsets(eVar.c());
        }

        @Override // t0.s0.e
        public void d(j0.e eVar) {
            this.f32361a.setSystemWindowInsets(eVar.c());
        }

        public c(s0 s0Var) {
            super(s0Var);
            WindowInsets.Builder builder;
            WindowInsets g5 = s0Var.g();
            if (g5 != null) {
                builder = new WindowInsets.Builder(g5);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f32361a = builder;
        }
    }

    public s0() {
        this.f32351a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public j0.e f32372n;

        /* renamed from: o  reason: collision with root package name */
        public j0.e f32373o;

        /* renamed from: p  reason: collision with root package name */
        public j0.e f32374p;

        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f32372n = null;
            this.f32373o = null;
            this.f32374p = null;
        }

        @Override // t0.s0.k
        public j0.e g() {
            Insets mandatorySystemGestureInsets;
            if (this.f32373o == null) {
                mandatorySystemGestureInsets = this.f32367c.getMandatorySystemGestureInsets();
                this.f32373o = j0.e.b(mandatorySystemGestureInsets);
            }
            return this.f32373o;
        }

        @Override // t0.s0.k
        public j0.e i() {
            Insets systemGestureInsets;
            if (this.f32372n == null) {
                systemGestureInsets = this.f32367c.getSystemGestureInsets();
                this.f32372n = j0.e.b(systemGestureInsets);
            }
            return this.f32372n;
        }

        @Override // t0.s0.k
        public j0.e k() {
            Insets tappableElementInsets;
            if (this.f32374p == null) {
                tappableElementInsets = this.f32367c.getTappableElementInsets();
                this.f32374p = j0.e.b(tappableElementInsets);
            }
            return this.f32374p;
        }

        @Override // t0.s0.f, t0.s0.k
        public s0 l(int i6, int i10, int i11, int i12) {
            WindowInsets inset;
            inset = this.f32367c.inset(i6, i10, i11, i12);
            return s0.h(inset, null);
        }

        @Override // t0.s0.g, t0.s0.k
        public void q(j0.e eVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final s0 f32375q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f32375q = s0.h(windowInsets, null);
        }

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // t0.s0.f, t0.s0.k
        public j0.e f(int i6) {
            Insets insets;
            insets = this.f32367c.getInsets(l.a(i6));
            return j0.e.b(insets);
        }

        @Override // t0.s0.f, t0.s0.k
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final s0 f32376b;

        /* renamed from: a  reason: collision with root package name */
        public final s0 f32377a;

        static {
            e bVar;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                bVar = new d();
            } else if (i6 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f32376b = bVar.b().f32351a.a().f32351a.b().f32351a.c();
        }

        public k(s0 s0Var) {
            this.f32377a = s0Var;
        }

        public s0 a() {
            return this.f32377a;
        }

        public s0 b() {
            return this.f32377a;
        }

        public s0 c() {
            return this.f32377a;
        }

        public t0.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() == kVar.n() && m() == kVar.m() && s0.b.a(j(), kVar.j()) && s0.b.a(h(), kVar.h()) && s0.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public j0.e f(int i6) {
            return j0.e.f21622e;
        }

        public j0.e g() {
            return j();
        }

        public j0.e h() {
            return j0.e.f21622e;
        }

        public int hashCode() {
            return s0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public j0.e i() {
            return j();
        }

        public j0.e j() {
            return j0.e.f21622e;
        }

        public j0.e k() {
            return j();
        }

        public s0 l(int i6, int i10, int i11, int i12) {
            return f32376b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(View view) {
        }

        public void o(j0.e[] eVarArr) {
        }

        public void p(s0 s0Var) {
        }

        public void q(j0.e eVar) {
        }
    }
}
