package g;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.t1;
import androidx.appcompat.widget.u1;
import androidx.lifecycle.j;
import com.appsflyer.R;
import com.google.firebase.database.core.ValidationPath;
import g.b0;
import g.j;
import g.t;
import g.z;
import i0.f;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import k.a;
import k.e;
import t.g;
import t0.d0;
import t0.g;
import t0.o0;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class k extends g.j implements f.a, LayoutInflater.Factory2 {
    public static final t.h<String, Integer> C0 = new t.h<>();
    public static final int[] D0 = {16842836};
    public static final boolean E0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean F0 = true;
    public OnBackInvokedDispatcher A0;
    public OnBackInvokedCallback B0;
    public final Object D;
    public final Context E;
    public Window F;
    public i G;
    public final g.h H;
    public g.a I;
    public k.f J;
    public CharSequence K;
    public n0 L;
    public c M;
    public o N;
    public k.a O;
    public ActionBarContextView P;
    public PopupWindow Q;
    public g.n R;
    public boolean U;
    public ViewGroup V;
    public TextView W;
    public View X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f16060a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f16061b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16062d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f16063f0;

    /* renamed from: g0  reason: collision with root package name */
    public n[] f16064g0;

    /* renamed from: h0  reason: collision with root package name */
    public n f16065h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16066i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f16067j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f16068k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f16069l0;

    /* renamed from: m0  reason: collision with root package name */
    public Configuration f16070m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f16071n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f16072o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f16073p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f16074q0;

    /* renamed from: r0  reason: collision with root package name */
    public l f16075r0;

    /* renamed from: s0  reason: collision with root package name */
    public j f16076s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f16077t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f16078u0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f16080w0;

    /* renamed from: x0  reason: collision with root package name */
    public Rect f16081x0;

    /* renamed from: y0  reason: collision with root package name */
    public Rect f16082y0;

    /* renamed from: z0  reason: collision with root package name */
    public t f16083z0;
    public o0 S = null;
    public final boolean T = true;

    /* renamed from: v0  reason: collision with root package name */
    public final a f16079v0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            if ((kVar.f16078u0 & 1) != 0) {
                kVar.I(0);
            }
            if ((kVar.f16078u0 & 4096) != 0) {
                kVar.I(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            kVar.f16077t0 = false;
            kVar.f16078u0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class c implements j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            k.this.E(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback O = k.this.O();
            if (O != null) {
                O.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0348a {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0348a f16086a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends kotlin.jvm.internal.b0 {
            public a() {
            }

            @Override // t0.p0
            public final void e() {
                d dVar = d.this;
                k.this.P.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.Q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.P.getParent() instanceof View) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.h.c((View) kVar.P.getParent());
                }
                kVar.P.h();
                kVar.S.d(null);
                kVar.S = null;
                ViewGroup viewGroup = kVar.V;
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                d0.h.c(viewGroup);
            }
        }

        public d(e.a aVar) {
            this.f16086a = aVar;
        }

        @Override // k.a.InterfaceC0348a
        public final boolean a(k.a aVar, MenuItem menuItem) {
            return this.f16086a.a(aVar, menuItem);
        }

        @Override // k.a.InterfaceC0348a
        public final boolean b(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = k.this.V;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.h.c(viewGroup);
            return this.f16086a.b(aVar, fVar);
        }

        @Override // k.a.InterfaceC0348a
        public final boolean c(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f16086a.c(aVar, fVar);
        }

        @Override // k.a.InterfaceC0348a
        public final void d(k.a aVar) {
            this.f16086a.d(aVar);
            k kVar = k.this;
            if (kVar.Q != null) {
                kVar.F.getDecorView().removeCallbacks(kVar.R);
            }
            if (kVar.P != null) {
                o0 o0Var = kVar.S;
                if (o0Var != null) {
                    o0Var.b();
                }
                o0 a10 = d0.a(kVar.P);
                a10.a(0.0f);
                kVar.S = a10;
                a10.d(new a());
            }
            g.h hVar = kVar.H;
            if (hVar != null) {
                hVar.J();
            }
            kVar.O = null;
            ViewGroup viewGroup = kVar.V;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.h.c(viewGroup);
            kVar.W();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class e {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class f {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class g {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static o0.g b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return o0.g.b(languageTags);
        }

        public static void c(o0.g gVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(gVar.f26891a.a());
            LocaleList.setDefault(forLanguageTags);
        }

        public static void d(Configuration configuration, o0.g gVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(gVar.f26891a.a());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class h {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final k kVar) {
            Objects.requireNonNull(kVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: g.p
                public final void onBackInvoked() {
                    k.this.R();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class j extends AbstractC0243k {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f16093c;

        public j(Context context) {
            super();
            this.f16093c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // g.k.AbstractC0243k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // g.k.AbstractC0243k
        public final int c() {
            if (this.f16093c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        @Override // g.k.AbstractC0243k
        public final void d() {
            k.this.A(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: g.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public abstract class AbstractC0243k {

        /* renamed from: a  reason: collision with root package name */
        public a f16095a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: g.k$k$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                AbstractC0243k.this.d();
            }
        }

        public AbstractC0243k() {
        }

        public final void a() {
            a aVar = this.f16095a;
            if (aVar != null) {
                try {
                    k.this.E.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f16095a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f16095a == null) {
                    this.f16095a = new a();
                }
                k.this.E.registerReceiver(this.f16095a, b10);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class l extends AbstractC0243k {

        /* renamed from: c  reason: collision with root package name */
        public final b0 f16098c;

        public l(b0 b0Var) {
            super();
            this.f16098c = b0Var;
        }

        @Override // g.k.AbstractC0243k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // g.k.AbstractC0243k
        public final int c() {
            boolean z10;
            Location location;
            boolean z11;
            long j10;
            long j11;
            Location location2;
            b0 b0Var = this.f16098c;
            b0.a aVar = b0Var.f16011c;
            boolean z12 = false;
            if (aVar.f16013b > System.currentTimeMillis()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = aVar.f16012a;
            } else {
                Context context = b0Var.f16009a;
                int y10 = ca.a.y(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = b0Var.f16010b;
                if (y10 == 0) {
                    try {
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (ca.a.y(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (a0.f16002d == null) {
                        a0.f16002d = new a0();
                    }
                    a0 a0Var = a0.f16002d;
                    a0Var.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    a0Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                    if (a0Var.f16005c == 1) {
                        z12 = true;
                    }
                    long j12 = a0Var.f16004b;
                    long j13 = a0Var.f16003a;
                    a0Var.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                    long j14 = a0Var.f16004b;
                    if (j12 != -1 && j13 != -1) {
                        if (currentTimeMillis > j13) {
                            j11 = j14 + 0;
                        } else if (currentTimeMillis > j12) {
                            j11 = j13 + 0;
                        } else {
                            j11 = j12 + 0;
                        }
                        j10 = j11 + 60000;
                    } else {
                        j10 = 43200000 + currentTimeMillis;
                    }
                    aVar.f16012a = z12;
                    aVar.f16013b = j10;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i6 = Calendar.getInstance().get(11);
                    if (i6 < 6 || i6 >= 22) {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (!z11) {
                return 1;
            }
            return 2;
        }

        @Override // g.k.AbstractC0243k
        public final void d() {
            k.this.A(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class m extends ContentFrameLayout {
        public m(k.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!k.this.H(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= -5 && y10 >= -5 && x10 <= getWidth() + 5 && y10 <= getHeight() + 5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    k kVar = k.this;
                    kVar.F(kVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i6) {
            setBackgroundDrawable(hc.d.H(getContext(), i6));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        public final int f16100a;

        /* renamed from: b  reason: collision with root package name */
        public int f16101b;

        /* renamed from: c  reason: collision with root package name */
        public int f16102c;

        /* renamed from: d  reason: collision with root package name */
        public int f16103d;

        /* renamed from: e  reason: collision with root package name */
        public m f16104e;
        public View f;

        /* renamed from: g  reason: collision with root package name */
        public View f16105g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f16106h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f16107i;

        /* renamed from: j  reason: collision with root package name */
        public k.c f16108j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f16109k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16110l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f16111m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f16112n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f16113o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f16114p;

        public n(int i6) {
            this.f16100a = i6;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class o implements j.a {
        public o() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            boolean z11;
            int i6;
            n nVar;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i10 = 0;
            if (k10 != fVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                fVar = k10;
            }
            k kVar = k.this;
            n[] nVarArr = kVar.f16064g0;
            if (nVarArr != null) {
                i6 = nVarArr.length;
            } else {
                i6 = 0;
            }
            while (true) {
                if (i10 < i6) {
                    nVar = nVarArr[i10];
                    if (nVar != null && nVar.f16106h == fVar) {
                        break;
                    }
                    i10++;
                } else {
                    nVar = null;
                    break;
                }
            }
            if (nVar != null) {
                if (z11) {
                    kVar.D(nVar.f16100a, nVar, k10);
                    kVar.F(nVar, true);
                    return;
                }
                kVar.F(nVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback O;
            if (fVar == fVar.k()) {
                k kVar = k.this;
                if (kVar.f16060a0 && (O = kVar.O()) != null && !kVar.f16069l0) {
                    O.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public k(Context context, Window window, g.h hVar, Object obj) {
        t.h<String, Integer> hVar2;
        Integer orDefault;
        androidx.appcompat.app.c cVar;
        this.f16071n0 = -100;
        this.E = context;
        this.H = hVar;
        this.D = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof androidx.appcompat.app.c) {
                    cVar = (androidx.appcompat.app.c) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            cVar = null;
            if (cVar != null) {
                this.f16071n0 = cVar.k0().g();
            }
        }
        if (this.f16071n0 == -100 && (orDefault = (hVar2 = C0).getOrDefault(this.D.getClass().getName(), null)) != null) {
            this.f16071n0 = orDefault.intValue();
            hVar2.remove(this.D.getClass().getName());
        }
        if (window != null) {
            B(window);
        }
        androidx.appcompat.widget.j.d();
    }

    public static o0.g C(Context context) {
        o0.g gVar;
        o0.g b10;
        Locale c10;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33 || (gVar = g.j.f16056w) == null) {
            return null;
        }
        o0.g M = M(context.getApplicationContext().getResources().getConfiguration());
        o0.i iVar = gVar.f26891a;
        if (i6 >= 24) {
            if (iVar.isEmpty()) {
                b10 = o0.g.f26890b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i10 = 0; i10 < M.f26891a.size() + iVar.size(); i10++) {
                    if (i10 < iVar.size()) {
                        c10 = gVar.c(i10);
                    } else {
                        c10 = M.c(i10 - iVar.size());
                    }
                    if (c10 != null) {
                        linkedHashSet.add(c10);
                    }
                }
                b10 = o0.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (iVar.isEmpty()) {
            b10 = o0.g.f26890b;
        } else {
            b10 = o0.g.b(gVar.c(0).toString());
        }
        if (!b10.f26891a.isEmpty()) {
            return b10;
        }
        return M;
    }

    public static Configuration G(Context context, int i6, o0.g gVar, Configuration configuration, boolean z10) {
        int i10;
        if (i6 != 1) {
            if (i6 != 2) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                g.d(configuration2, gVar);
            } else {
                e.b(configuration2, gVar.c(0));
                e.a(configuration2, gVar.c(0));
            }
        }
        return configuration2;
    }

    public static o0.g M(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return g.b(configuration);
        }
        return o0.g.b(f.a(configuration.locale));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(boolean z10, boolean z11) {
        o0.g gVar;
        int i6;
        Configuration configuration;
        int i10;
        int i11;
        o0.g M;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        Activity activity;
        Map map;
        Object obj;
        Object obj2;
        Object obj3;
        Activity activity2;
        int i13;
        if (this.f16069l0) {
            return false;
        }
        int i14 = this.f16071n0;
        if (i14 == -100) {
            i14 = g.j.f16055v;
        }
        Context context = this.E;
        int Q = Q(i14, context);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 33) {
            gVar = C(context);
        } else {
            gVar = null;
        }
        if (!z11 && gVar != null) {
            gVar = M(context.getResources().getConfiguration());
        }
        Configuration G = G(context, Q, gVar, null, false);
        boolean z15 = this.f16074q0;
        Object obj4 = this.D;
        if (!z15 && (obj4 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i6 = 0;
                configuration = this.f16070m0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i10 = configuration.uiMode & 48;
                i11 = G.uiMode & 48;
                o0.g M2 = M(configuration);
                if (gVar != null) {
                    M = null;
                } else {
                    M = M(G);
                }
                if (i10 == i11) {
                    i12 = 512;
                } else {
                    i12 = 0;
                }
                if (M != null && !M2.equals(M)) {
                    i12 = i12 | 4 | 8192;
                }
                if (((~i6) & i12) != 0 && z10 && this.f16067j0 && ((E0 || this.f16068k0) && (obj4 instanceof Activity))) {
                    activity2 = (Activity) obj4;
                    if (!activity2.isChild()) {
                        int i16 = f0.a.f14598c;
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity2.recreate();
                        } else {
                            new Handler(activity2.getMainLooper()).post(new androidx.activity.b(3, activity2));
                        }
                        z12 = true;
                        if (z12 && i12 != 0) {
                            if ((i6 & i12) == i12) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i11;
                            if (M != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    g.d(configuration2, M);
                                } else {
                                    e.b(configuration2, M.c(0));
                                    e.a(configuration2, M.c(0));
                                }
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i17 = Build.VERSION.SDK_INT;
                            if (i17 < 26 && i17 < 28) {
                                if (i17 >= 24) {
                                    if (!y.f16150h) {
                                        try {
                                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                            y.f16149g = declaredField;
                                            declaredField.setAccessible(true);
                                        } catch (NoSuchFieldException e10) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                                        }
                                        y.f16150h = true;
                                    }
                                    Field field = y.f16149g;
                                    if (field != null) {
                                        try {
                                            obj2 = field.get(resources);
                                        } catch (IllegalAccessException e11) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                                            obj2 = null;
                                        }
                                        if (obj2 != null) {
                                            if (!y.f16145b) {
                                                try {
                                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                                    y.f16144a = declaredField2;
                                                    declaredField2.setAccessible(true);
                                                } catch (NoSuchFieldException e12) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                                }
                                                y.f16145b = true;
                                            }
                                            Field field2 = y.f16144a;
                                            if (field2 != null) {
                                                try {
                                                    obj3 = field2.get(obj2);
                                                } catch (IllegalAccessException e13) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                                }
                                                if (obj3 != null) {
                                                    y.a(obj3);
                                                }
                                            }
                                            obj3 = null;
                                            if (obj3 != null) {
                                            }
                                        }
                                    }
                                } else if (i17 >= 23) {
                                    if (!y.f16145b) {
                                        try {
                                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                            y.f16144a = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e14) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                                        }
                                        y.f16145b = true;
                                    }
                                    Field field3 = y.f16144a;
                                    if (field3 != null) {
                                        try {
                                            obj = field3.get(resources);
                                        } catch (IllegalAccessException e15) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                                        }
                                        if (obj != null) {
                                            y.a(obj);
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                    }
                                } else {
                                    if (!y.f16145b) {
                                        try {
                                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                                            y.f16144a = declaredField4;
                                            declaredField4.setAccessible(true);
                                        } catch (NoSuchFieldException e16) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e16);
                                        }
                                        y.f16145b = true;
                                    }
                                    Field field4 = y.f16144a;
                                    if (field4 != null) {
                                        try {
                                            map = (Map) field4.get(resources);
                                        } catch (IllegalAccessException e17) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e17);
                                            map = null;
                                        }
                                        if (map != null) {
                                            map.clear();
                                        }
                                    }
                                }
                            }
                            int i18 = this.f16072o0;
                            if (i18 != 0) {
                                context.setTheme(i18);
                                if (Build.VERSION.SDK_INT >= 23) {
                                    context.getTheme().applyStyle(this.f16072o0, true);
                                    if (z14 && (obj4 instanceof Activity)) {
                                        activity = (Activity) obj4;
                                        if (!(activity instanceof androidx.lifecycle.p)) {
                                            if (((androidx.lifecycle.p) activity).getLifecycle().b().d(j.c.CREATED)) {
                                                activity.onConfigurationChanged(configuration2);
                                            }
                                        } else if (this.f16068k0 && !this.f16069l0) {
                                            activity.onConfigurationChanged(configuration2);
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                            if (z14) {
                                activity = (Activity) obj4;
                                if (!(activity instanceof androidx.lifecycle.p)) {
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (z13 && (obj4 instanceof androidx.appcompat.app.c)) {
                            if ((i12 & 512) != 0) {
                                ((androidx.appcompat.app.c) obj4).getClass();
                            }
                            if ((i12 & 4) != 0) {
                                ((androidx.appcompat.app.c) obj4).getClass();
                            }
                        }
                        if (z13 && M != null) {
                            o0.g M3 = M(context.getResources().getConfiguration());
                            if (Build.VERSION.SDK_INT < 24) {
                                g.c(M3);
                            } else {
                                Locale.setDefault(M3.c(0));
                            }
                        }
                        if (i14 == 0) {
                            L(context).e();
                        } else {
                            l lVar = this.f16075r0;
                            if (lVar != null) {
                                lVar.a();
                            }
                        }
                        if (i14 == 3) {
                            if (this.f16076s0 == null) {
                                this.f16076s0 = new j(context);
                            }
                            this.f16076s0.e();
                        } else {
                            j jVar = this.f16076s0;
                            if (jVar != null) {
                                jVar.a();
                            }
                        }
                        return z13;
                    }
                }
                z12 = false;
                if (z12) {
                }
                z13 = z12;
                if (z13) {
                    if ((i12 & 512) != 0) {
                    }
                    if ((i12 & 4) != 0) {
                    }
                }
                if (z13) {
                    o0.g M32 = M(context.getResources().getConfiguration());
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                }
                if (i14 == 0) {
                }
                if (i14 == 3) {
                }
                return z13;
            }
            if (i15 >= 29) {
                i13 = 269221888;
            } else if (i15 >= 24) {
                i13 = 786432;
            } else {
                i13 = 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i13);
                if (activityInfo != null) {
                    this.f16073p0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e18) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e18);
                this.f16073p0 = 0;
            }
        }
        this.f16074q0 = true;
        i6 = this.f16073p0;
        configuration = this.f16070m0;
        if (configuration == null) {
        }
        i10 = configuration.uiMode & 48;
        i11 = G.uiMode & 48;
        o0.g M22 = M(configuration);
        if (gVar != null) {
        }
        if (i10 == i11) {
        }
        if (M != null) {
            i12 = i12 | 4 | 8192;
        }
        if (((~i6) & i12) != 0) {
            activity2 = (Activity) obj4;
            if (!activity2.isChild()) {
            }
        }
        z12 = false;
        if (z12) {
        }
        z13 = z12;
        if (z13) {
        }
        if (z13) {
        }
        if (i14 == 0) {
        }
        if (i14 == 3) {
        }
        return z13;
    }

    public final void B(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.F == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof i)) {
                i iVar = new i(callback);
                this.G = iVar;
                window.setCallback(iVar);
                Context context = this.E;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, D0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
                    synchronized (a10) {
                        drawable = a10.f1441a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.F = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.A0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.B0) != null) {
                        h.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.B0 = null;
                    }
                    Object obj = this.D;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.A0 = h.a(activity);
                            W();
                            return;
                        }
                    }
                    this.A0 = null;
                    W();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void D(int i6, n nVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (nVar == null && i6 >= 0) {
                n[] nVarArr = this.f16064g0;
                if (i6 < nVarArr.length) {
                    nVar = nVarArr[i6];
                }
            }
            if (nVar != null) {
                fVar = nVar.f16106h;
            }
        }
        if ((nVar == null || nVar.f16111m) && !this.f16069l0) {
            i iVar = this.G;
            Window.Callback callback = this.F.getCallback();
            iVar.getClass();
            try {
                iVar.f16091y = true;
                callback.onPanelClosed(i6, fVar);
            } finally {
                iVar.f16091y = false;
            }
        }
    }

    public final void E(androidx.appcompat.view.menu.f fVar) {
        if (this.f16063f0) {
            return;
        }
        this.f16063f0 = true;
        this.L.i();
        Window.Callback O = O();
        if (O != null && !this.f16069l0) {
            O.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
        }
        this.f16063f0 = false;
    }

    public final void F(n nVar, boolean z10) {
        m mVar;
        n0 n0Var;
        if (z10 && nVar.f16100a == 0 && (n0Var = this.L) != null && n0Var.a()) {
            E(nVar.f16106h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.E.getSystemService("window");
        if (windowManager != null && nVar.f16111m && (mVar = nVar.f16104e) != null) {
            windowManager.removeView(mVar);
            if (z10) {
                D(nVar.f16100a, nVar, null);
            }
        }
        nVar.f16109k = false;
        nVar.f16110l = false;
        nVar.f16111m = false;
        nVar.f = null;
        nVar.f16112n = true;
        if (this.f16065h0 == nVar) {
            this.f16065h0 = null;
        }
        if (nVar.f16100a == 0) {
            W();
        }
    }

    public final boolean H(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj = this.D;
        boolean z13 = true;
        if (((obj instanceof g.a) || (obj instanceof r)) && (decorView = this.F.getDecorView()) != null && t0.g.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            i iVar = this.G;
            Window.Callback callback = this.F.getCallback();
            iVar.getClass();
            try {
                iVar.f16090x = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                iVar.f16090x = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    n N = N(0);
                    if (N.f16111m) {
                        return true;
                    }
                    U(N, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z13 = false;
                }
                this.f16066i0 = z13;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.O != null) {
                    return true;
                }
                n N2 = N(0);
                n0 n0Var = this.L;
                Context context = this.E;
                if (n0Var != null && n0Var.c() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.L.a()) {
                        if (!this.f16069l0 && U(N2, keyEvent)) {
                            z11 = this.L.g();
                        }
                        z11 = false;
                    } else {
                        z11 = this.L.f();
                    }
                } else {
                    boolean z14 = N2.f16111m;
                    if (!z14 && !N2.f16110l) {
                        if (N2.f16109k) {
                            if (N2.f16113o) {
                                N2.f16109k = false;
                                z12 = U(N2, keyEvent);
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                S(N2, keyEvent);
                                z11 = true;
                            }
                        }
                        z11 = false;
                    } else {
                        F(N2, true);
                        z11 = z14;
                    }
                }
                if (!z11) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (R()) {
            return true;
        }
        return false;
    }

    public final void I(int i6) {
        n N = N(i6);
        if (N.f16106h != null) {
            Bundle bundle = new Bundle();
            N.f16106h.u(bundle);
            if (bundle.size() > 0) {
                N.f16114p = bundle;
            }
            N.f16106h.z();
            N.f16106h.clear();
        }
        N.f16113o = true;
        N.f16112n = true;
        if ((i6 == 108 || i6 == 0) && this.L != null) {
            n N2 = N(0);
            N2.f16109k = false;
            U(N2, null);
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.U) {
            int[] iArr = kc.f.I;
            Context context2 = this.E;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
                    t(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                    t(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                    t(10);
                }
                this.f16062d0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.F.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.e0) {
                    if (this.f16062d0) {
                        viewGroup = (ViewGroup) from.inflate(com.theinnerhour.b2b.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f16061b0 = false;
                        this.f16060a0 = false;
                    } else if (this.f16060a0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.theinnerhour.b2b.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        n0 n0Var = (n0) viewGroup.findViewById(com.theinnerhour.b2b.R.id.decor_content_parent);
                        this.L = n0Var;
                        n0Var.setWindowCallback(O());
                        if (this.f16061b0) {
                            this.L.h(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                        }
                        if (this.Y) {
                            this.L.h(2);
                        }
                        if (this.Z) {
                            this.L.h(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.c0 ? (ViewGroup) from.inflate(com.theinnerhour.b2b.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.theinnerhour.b2b.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    g.l lVar = new g.l(this);
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.i.u(viewGroup, lVar);
                    if (this.L == null) {
                        this.W = (TextView) viewGroup.findViewById(com.theinnerhour.b2b.R.id.title);
                    }
                    Method method = u1.f1563a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.theinnerhour.b2b.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.F.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.F.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new g.m(this));
                    this.V = viewGroup;
                    Object obj = this.D;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.K;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        n0 n0Var2 = this.L;
                        if (n0Var2 != null) {
                            n0Var2.setWindowTitle(charSequence);
                        } else {
                            g.a aVar = this.I;
                            if (aVar != null) {
                                aVar.p(charSequence);
                            } else {
                                TextView textView = this.W;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.V.findViewById(16908290);
                    View decorView = this.F.getDecorView();
                    contentFrameLayout2.A.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    if (d0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.U = true;
                    n N = N(0);
                    if (!this.f16069l0 && N.f16106h == null) {
                        this.f16078u0 |= 4096;
                        if (!this.f16077t0) {
                            d0.d.m(this.F.getDecorView(), this.f16079v0);
                            this.f16077t0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f16060a0 + ", windowActionBarOverlay: " + this.f16061b0 + ", android:windowIsFloating: " + this.f16062d0 + ", windowActionModeOverlay: " + this.c0 + ", windowNoTitle: " + this.e0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.F == null) {
            Object obj = this.D;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.F != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final AbstractC0243k L(Context context) {
        if (this.f16075r0 == null) {
            if (b0.f16008d == null) {
                Context applicationContext = context.getApplicationContext();
                b0.f16008d = new b0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f16075r0 = new l(b0.f16008d);
        }
        return this.f16075r0;
    }

    public final n N(int i6) {
        n[] nVarArr = this.f16064g0;
        if (nVarArr == null || nVarArr.length <= i6) {
            n[] nVarArr2 = new n[i6 + 1];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.f16064g0 = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i6];
        if (nVar == null) {
            n nVar2 = new n(i6);
            nVarArr[i6] = nVar2;
            return nVar2;
        }
        return nVar;
    }

    public final Window.Callback O() {
        return this.F.getCallback();
    }

    public final void P() {
        J();
        if (this.f16060a0 && this.I == null) {
            Object obj = this.D;
            if (obj instanceof Activity) {
                this.I = new c0((Activity) obj, this.f16061b0);
            } else if (obj instanceof Dialog) {
                this.I = new c0((Dialog) obj);
            }
            g.a aVar = this.I;
            if (aVar != null) {
                aVar.l(this.f16080w0);
            }
        }
    }

    public final int Q(int i6, Context context) {
        if (i6 == -100) {
            return -1;
        }
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    if (i6 == 3) {
                        if (this.f16076s0 == null) {
                            this.f16076s0 = new j(context);
                        }
                        return this.f16076s0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i6;
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return L(context).c();
            }
        }
        return i6;
    }

    public final boolean R() {
        boolean z10 = this.f16066i0;
        this.f16066i0 = false;
        n N = N(0);
        if (N.f16111m) {
            if (!z10) {
                F(N, true);
            }
            return true;
        }
        k.a aVar = this.O;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        P();
        g.a aVar2 = this.I;
        if (aVar2 == null || !aVar2.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0178, code lost:
        if (r2.f1083z.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(n nVar, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        Context context;
        int i6;
        ViewGroup.LayoutParams layoutParams;
        boolean z12;
        if (!nVar.f16111m && !this.f16069l0) {
            Context context2 = this.E;
            int i10 = nVar.f16100a;
            if (i10 == 0) {
                if ((context2.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            Window.Callback O = O();
            if (O != null && !O.onMenuOpened(i10, nVar.f16106h)) {
                F(nVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) context2.getSystemService("window");
            if (windowManager == null || !U(nVar, keyEvent)) {
                return;
            }
            m mVar = nVar.f16104e;
            if (mVar != null && !nVar.f16112n) {
                View view = nVar.f16105g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i6 = -1;
                    nVar.f16110l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i6, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = nVar.f16102c;
                    layoutParams2.windowAnimations = nVar.f16103d;
                    windowManager.addView(nVar.f16104e, layoutParams2);
                    nVar.f16111m = true;
                    if (i10 != 0) {
                        W();
                        return;
                    }
                    return;
                }
            } else {
                if (mVar == null) {
                    P();
                    g.a aVar = this.I;
                    if (aVar != null) {
                        context = aVar.e();
                    } else {
                        context = null;
                    }
                    if (context != null) {
                        context2 = context;
                    }
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme newTheme = context2.getResources().newTheme();
                    newTheme.setTo(context2.getTheme());
                    newTheme.resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarPopupTheme, typedValue, true);
                    int i11 = typedValue.resourceId;
                    if (i11 != 0) {
                        newTheme.applyStyle(i11, true);
                    }
                    newTheme.resolveAttribute(com.theinnerhour.b2b.R.attr.panelMenuListTheme, typedValue, true);
                    int i12 = typedValue.resourceId;
                    if (i12 != 0) {
                        newTheme.applyStyle(i12, true);
                    } else {
                        newTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
                    }
                    k.c cVar = new k.c(context2, 0);
                    cVar.getTheme().setTo(newTheme);
                    nVar.f16108j = cVar;
                    TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(kc.f.I);
                    nVar.f16101b = obtainStyledAttributes.getResourceId(86, 0);
                    nVar.f16103d = obtainStyledAttributes.getResourceId(1, 0);
                    obtainStyledAttributes.recycle();
                    nVar.f16104e = new m(nVar.f16108j);
                    nVar.f16102c = 81;
                } else if (nVar.f16112n && mVar.getChildCount() > 0) {
                    nVar.f16104e.removeAllViews();
                }
                View view2 = nVar.f16105g;
                if (view2 != null) {
                    nVar.f = view2;
                } else {
                    if (nVar.f16106h != null) {
                        if (this.N == null) {
                            this.N = new o();
                        }
                        o oVar = this.N;
                        if (nVar.f16107i == null) {
                            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(nVar.f16108j);
                            nVar.f16107i = dVar;
                            dVar.f1082y = oVar;
                            androidx.appcompat.view.menu.f fVar = nVar.f16106h;
                            fVar.b(dVar, fVar.f1093a);
                        }
                        androidx.appcompat.view.menu.d dVar2 = nVar.f16107i;
                        m mVar2 = nVar.f16104e;
                        if (dVar2.f1081x == null) {
                            dVar2.f1081x = (ExpandedMenuView) dVar2.f1079v.inflate(com.theinnerhour.b2b.R.layout.abc_expanded_menu_layout, (ViewGroup) mVar2, false);
                            if (dVar2.f1083z == null) {
                                dVar2.f1083z = new d.a();
                            }
                            dVar2.f1081x.setAdapter((ListAdapter) dVar2.f1083z);
                            dVar2.f1081x.setOnItemClickListener(dVar2);
                        }
                        ExpandedMenuView expandedMenuView = dVar2.f1081x;
                        nVar.f = expandedMenuView;
                    }
                    z10 = false;
                    if (z10) {
                        if (nVar.f != null) {
                            if (nVar.f16105g == null) {
                                androidx.appcompat.view.menu.d dVar3 = nVar.f16107i;
                                if (dVar3.f1083z == null) {
                                    dVar3.f1083z = new d.a();
                                }
                            }
                            z11 = true;
                            if (z11) {
                                ViewGroup.LayoutParams layoutParams3 = nVar.f.getLayoutParams();
                                if (layoutParams3 == null) {
                                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                nVar.f16104e.setBackgroundResource(nVar.f16101b);
                                ViewParent parent = nVar.f.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(nVar.f);
                                }
                                nVar.f16104e.addView(nVar.f, layoutParams3);
                                if (!nVar.f.hasFocus()) {
                                    nVar.f.requestFocus();
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                    nVar.f16112n = true;
                    return;
                }
                z10 = true;
                if (z10) {
                }
                nVar.f16112n = true;
                return;
            }
            i6 = -2;
            nVar.f16110l = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i6, -2, 0, 0, 1002, 8519680, -3);
            layoutParams22.gravity = nVar.f16102c;
            layoutParams22.windowAnimations = nVar.f16103d;
            windowManager.addView(nVar.f16104e, layoutParams22);
            nVar.f16111m = true;
            if (i10 != 0) {
            }
        }
    }

    public final boolean T(n nVar, int i6, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!nVar.f16109k && !U(nVar, keyEvent)) || (fVar = nVar.f16106h) == null) {
            return false;
        }
        return fVar.performShortcut(i6, keyEvent, 1);
    }

    public final boolean U(n nVar, KeyEvent keyEvent) {
        boolean z10;
        n0 n0Var;
        n0 n0Var2;
        Resources.Theme theme;
        int i6;
        boolean z11;
        n0 n0Var3;
        n0 n0Var4;
        if (this.f16069l0) {
            return false;
        }
        if (nVar.f16109k) {
            return true;
        }
        n nVar2 = this.f16065h0;
        if (nVar2 != null && nVar2 != nVar) {
            F(nVar2, false);
        }
        Window.Callback O = O();
        int i10 = nVar.f16100a;
        if (O != null) {
            nVar.f16105g = O.onCreatePanelView(i10);
        }
        if (i10 != 0 && i10 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (n0Var4 = this.L) != null) {
            n0Var4.b();
        }
        if (nVar.f16105g == null && (!z10 || !(this.I instanceof z))) {
            androidx.appcompat.view.menu.f fVar = nVar.f16106h;
            if (fVar == null || nVar.f16113o) {
                if (fVar == null) {
                    Context context = this.E;
                    if ((i10 == 0 || i10 == 108) && this.L != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            k.c cVar = new k.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f1097e = this;
                    androidx.appcompat.view.menu.f fVar3 = nVar.f16106h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(nVar.f16107i);
                        }
                        nVar.f16106h = fVar2;
                        androidx.appcompat.view.menu.d dVar = nVar.f16107i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f1093a);
                        }
                    }
                    if (nVar.f16106h == null) {
                        return false;
                    }
                }
                if (z10 && (n0Var2 = this.L) != null) {
                    if (this.M == null) {
                        this.M = new c();
                    }
                    n0Var2.d(nVar.f16106h, this.M);
                }
                nVar.f16106h.z();
                if (!O.onCreatePanelMenu(i10, nVar.f16106h)) {
                    androidx.appcompat.view.menu.f fVar4 = nVar.f16106h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(nVar.f16107i);
                        }
                        nVar.f16106h = null;
                    }
                    if (z10 && (n0Var = this.L) != null) {
                        n0Var.d(null, this.M);
                    }
                    return false;
                }
                nVar.f16113o = false;
            }
            nVar.f16106h.z();
            Bundle bundle = nVar.f16114p;
            if (bundle != null) {
                nVar.f16106h.s(bundle);
                nVar.f16114p = null;
            }
            if (!O.onPreparePanel(0, nVar.f16105g, nVar.f16106h)) {
                if (z10 && (n0Var3 = this.L) != null) {
                    n0Var3.d(null, this.M);
                }
                nVar.f16106h.y();
                return false;
            }
            if (keyEvent != null) {
                i6 = keyEvent.getDeviceId();
            } else {
                i6 = -1;
            }
            if (KeyCharacterMap.load(i6).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            nVar.f16106h.setQwertyMode(z11);
            nVar.f16106h.y();
        }
        nVar.f16109k = true;
        nVar.f16110l = false;
        this.f16065h0 = nVar;
        return true;
    }

    public final void V() {
        if (!this.U) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void W() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.A0 != null && (N(0).f16111m || this.O != null)) {
                z10 = true;
            }
            if (z10 && this.B0 == null) {
                this.B0 = h.b(this.A0, this);
            } else if (!z10 && (onBackInvokedCallback = this.B0) != null) {
                h.c(this.A0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i6;
        n nVar;
        Window.Callback O = O();
        if (O != null && !this.f16069l0) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            n[] nVarArr = this.f16064g0;
            if (nVarArr != null) {
                i6 = nVarArr.length;
            } else {
                i6 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    nVar = nVarArr[i10];
                    if (nVar != null && nVar.f16106h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    nVar = null;
                    break;
                }
            }
            if (nVar != null) {
                return O.onMenuItemSelected(nVar.f16100a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        n0 n0Var = this.L;
        if (n0Var != null && n0Var.c() && (!ViewConfiguration.get(this.E).hasPermanentMenuKey() || this.L.e())) {
            Window.Callback O = O();
            if (this.L.a()) {
                this.L.f();
                if (!this.f16069l0) {
                    O.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, N(0).f16106h);
                    return;
                }
                return;
            } else if (O != null && !this.f16069l0) {
                if (this.f16077t0 && (1 & this.f16078u0) != 0) {
                    View decorView = this.F.getDecorView();
                    a aVar = this.f16079v0;
                    decorView.removeCallbacks(aVar);
                    aVar.run();
                }
                n N = N(0);
                androidx.appcompat.view.menu.f fVar2 = N.f16106h;
                if (fVar2 != null && !N.f16113o && O.onPreparePanel(0, N.f16105g, fVar2)) {
                    O.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, N.f16106h);
                    this.L.g();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        n N2 = N(0);
        N2.f16112n = true;
        F(N2, false);
        S(N2, null);
    }

    @Override // g.j
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.V.findViewById(16908290)).addView(view, layoutParams);
        this.G.a(this.F.getCallback());
    }

    @Override // g.j
    public final Context d(final Context context) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = true;
        this.f16067j0 = true;
        int i17 = this.f16071n0;
        if (i17 == -100) {
            i17 = g.j.f16055v;
        }
        int Q = Q(i17, context);
        if (g.j.l(context) && g.j.l(context)) {
            if (o0.a.a()) {
                if (!g.j.f16059z) {
                    g.j.f16054u.execute(new Runnable() { // from class: g.i
                        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
                            if (r5 != null) goto L19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            o0.g gVar;
                            Object obj;
                            Context f2;
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context2 = context;
                                ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                                if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                                    if (o0.a.a()) {
                                        Iterator<WeakReference<j>> it = j.A.iterator();
                                        while (true) {
                                            g.a aVar = (g.a) it;
                                            if (aVar.hasNext()) {
                                                j jVar = (j) ((WeakReference) aVar.next()).get();
                                                if (jVar != null && (f2 = jVar.f()) != null) {
                                                    obj = f2.getSystemService("locale");
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        if (obj != null) {
                                            gVar = new o0.g(new o0.j(j.b.a(obj)));
                                            if (gVar.f26891a.isEmpty()) {
                                                String b10 = w.b(context2);
                                                Object systemService = context2.getSystemService("locale");
                                                if (systemService != null) {
                                                    j.b.b(systemService, j.a.a(b10));
                                                }
                                            }
                                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                        }
                                        gVar = o0.g.f26890b;
                                        if (gVar.f26891a.isEmpty()) {
                                        }
                                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                    } else {
                                        gVar = j.f16056w;
                                    }
                                }
                            }
                            j.f16059z = true;
                        }
                    });
                }
            } else {
                synchronized (g.j.C) {
                    o0.g gVar = g.j.f16056w;
                    if (gVar == null) {
                        if (g.j.f16057x == null) {
                            g.j.f16057x = o0.g.b(w.b(context));
                        }
                        if (!g.j.f16057x.f26891a.isEmpty()) {
                            g.j.f16056w = g.j.f16057x;
                        }
                    } else if (!gVar.equals(g.j.f16057x)) {
                        o0.g gVar2 = g.j.f16056w;
                        g.j.f16057x = gVar2;
                        w.a(context, gVar2.f26891a.a());
                    }
                }
            }
        }
        o0.g C = C(context);
        Configuration configuration = null;
        boolean z11 = false;
        if (F0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(G(context, Q, C, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof k.c) {
            try {
                ((k.c) context).a(G(context, Q, C, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!E0) {
            return context;
        }
        int i18 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f10 = configuration4.fontScale;
                if (f2 != f10) {
                    configuration.fontScale = f10;
                }
                int i19 = configuration3.mcc;
                int i20 = configuration4.mcc;
                if (i19 != i20) {
                    configuration.mcc = i20;
                }
                int i21 = configuration3.mnc;
                int i22 = configuration4.mnc;
                if (i21 != i22) {
                    configuration.mnc = i22;
                }
                if (i18 >= 24) {
                    g.a(configuration3, configuration4, configuration);
                } else if (!s0.b.a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i23 = configuration3.touchscreen;
                int i24 = configuration4.touchscreen;
                if (i23 != i24) {
                    configuration.touchscreen = i24;
                }
                int i25 = configuration3.keyboard;
                int i26 = configuration4.keyboard;
                if (i25 != i26) {
                    configuration.keyboard = i26;
                }
                int i27 = configuration3.keyboardHidden;
                int i28 = configuration4.keyboardHidden;
                if (i27 != i28) {
                    configuration.keyboardHidden = i28;
                }
                int i29 = configuration3.navigation;
                int i30 = configuration4.navigation;
                if (i29 != i30) {
                    configuration.navigation = i30;
                }
                int i31 = configuration3.navigationHidden;
                int i32 = configuration4.navigationHidden;
                if (i31 != i32) {
                    configuration.navigationHidden = i32;
                }
                int i33 = configuration3.orientation;
                int i34 = configuration4.orientation;
                if (i33 != i34) {
                    configuration.orientation = i34;
                }
                int i35 = configuration3.screenLayout & 15;
                int i36 = configuration4.screenLayout & 15;
                if (i35 != i36) {
                    configuration.screenLayout |= i36;
                }
                int i37 = configuration3.screenLayout & 192;
                int i38 = configuration4.screenLayout & 192;
                if (i37 != i38) {
                    configuration.screenLayout |= i38;
                }
                int i39 = configuration3.screenLayout & 48;
                int i40 = configuration4.screenLayout & 48;
                if (i39 != i40) {
                    configuration.screenLayout |= i40;
                }
                int i41 = configuration3.screenLayout & ValidationPath.MAX_PATH_LENGTH_BYTES;
                int i42 = configuration4.screenLayout & ValidationPath.MAX_PATH_LENGTH_BYTES;
                if (i41 != i42) {
                    configuration.screenLayout |= i42;
                }
                if (i18 >= 26) {
                    i6 = configuration3.colorMode;
                    int i43 = i6 & 3;
                    i10 = configuration4.colorMode;
                    if (i43 != (i10 & 3)) {
                        i15 = configuration.colorMode;
                        i16 = configuration4.colorMode;
                        configuration.colorMode = i15 | (i16 & 3);
                    }
                    i11 = configuration3.colorMode;
                    int i44 = i11 & 12;
                    i12 = configuration4.colorMode;
                    if (i44 != (i12 & 12)) {
                        i13 = configuration.colorMode;
                        i14 = configuration4.colorMode;
                        configuration.colorMode = i13 | (i14 & 12);
                    }
                }
                int i45 = configuration3.uiMode & 15;
                int i46 = configuration4.uiMode & 15;
                if (i45 != i46) {
                    configuration.uiMode |= i46;
                }
                int i47 = configuration3.uiMode & 48;
                int i48 = configuration4.uiMode & 48;
                if (i47 != i48) {
                    configuration.uiMode |= i48;
                }
                int i49 = configuration3.screenWidthDp;
                int i50 = configuration4.screenWidthDp;
                if (i49 != i50) {
                    configuration.screenWidthDp = i50;
                }
                int i51 = configuration3.screenHeightDp;
                int i52 = configuration4.screenHeightDp;
                if (i51 != i52) {
                    configuration.screenHeightDp = i52;
                }
                int i53 = configuration3.smallestScreenWidthDp;
                int i54 = configuration4.smallestScreenWidthDp;
                if (i53 != i54) {
                    configuration.smallestScreenWidthDp = i54;
                }
                int i55 = configuration3.densityDpi;
                int i56 = configuration4.densityDpi;
                if (i55 != i56) {
                    configuration.densityDpi = i56;
                }
            }
        }
        Configuration G = G(context, Q, C, configuration, true);
        k.c cVar = new k.c(context, 2132083324);
        cVar.a(G);
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            f.C0298f.a(cVar.getTheme());
        }
        return cVar;
    }

    @Override // g.j
    public final <T extends View> T e(int i6) {
        J();
        return (T) this.F.findViewById(i6);
    }

    @Override // g.j
    public final Context f() {
        return this.E;
    }

    @Override // g.j
    public final int g() {
        return this.f16071n0;
    }

    @Override // g.j
    public final MenuInflater h() {
        Context context;
        if (this.J == null) {
            P();
            g.a aVar = this.I;
            if (aVar != null) {
                context = aVar.e();
            } else {
                context = this.E;
            }
            this.J = new k.f(context);
        }
        return this.J;
    }

    @Override // g.j
    public final g.a i() {
        P();
        return this.I;
    }

    @Override // g.j
    public final void j() {
        LayoutInflater from = LayoutInflater.from(this.E);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.j
    public final void k() {
        if (this.I != null) {
            P();
            if (!this.I.f()) {
                this.f16078u0 |= 1;
                if (!this.f16077t0) {
                    View decorView = this.F.getDecorView();
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.m(decorView, this.f16079v0);
                    this.f16077t0 = true;
                }
            }
        }
    }

    @Override // g.j
    public final void m(Configuration configuration) {
        if (this.f16060a0 && this.U) {
            P();
            g.a aVar = this.I;
            if (aVar != null) {
                aVar.g();
            }
        }
        androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
        Context context = this.E;
        synchronized (a10) {
            a10.f1441a.k(context);
        }
        this.f16070m0 = new Configuration(this.E.getResources().getConfiguration());
        A(false, false);
    }

    @Override // g.j
    public final void n() {
        String str;
        this.f16067j0 = true;
        A(false, true);
        K();
        Object obj = this.D;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = f0.n.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                g.a aVar = this.I;
                if (aVar == null) {
                    this.f16080w0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (g.j.B) {
                g.j.s(this);
                g.j.A.add(new WeakReference<>(this));
            }
        }
        this.f16070m0 = new Configuration(this.E.getResources().getConfiguration());
        this.f16068k0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // g.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        g.a aVar;
        l lVar;
        j jVar;
        if (this.D instanceof Activity) {
            synchronized (g.j.B) {
                g.j.s(this);
            }
        }
        if (this.f16077t0) {
            this.F.getDecorView().removeCallbacks(this.f16079v0);
        }
        this.f16069l0 = true;
        if (this.f16071n0 != -100) {
            Object obj = this.D;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                C0.put(this.D.getClass().getName(), Integer.valueOf(this.f16071n0));
                aVar = this.I;
                if (aVar != null) {
                    aVar.h();
                }
                lVar = this.f16075r0;
                if (lVar != null) {
                    lVar.a();
                }
                jVar = this.f16076s0;
                if (jVar == null) {
                    jVar.a();
                    return;
                }
                return;
            }
        }
        C0.remove(this.D.getClass().getName());
        aVar = this.I;
        if (aVar != null) {
        }
        lVar = this.f16075r0;
        if (lVar != null) {
        }
        jVar = this.f16076s0;
        if (jVar == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
        if (r9.equals("ImageButton") == false) goto L129;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        if (this.f16083z0 == null) {
            int[] iArr = kc.f.I;
            Context context2 = this.E;
            String string = context2.obtainStyledAttributes(iArr).getString(R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f16083z0 = new t();
            } else {
                try {
                    this.f16083z0 = (t) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f16083z0 = new t();
                }
            }
        }
        t tVar = this.f16083z0;
        int i6 = t1.f1560a;
        tVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.Y, 0, 0);
        char c10 = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof k.c) && ((k.c) context).f22696a == resourceId)) ? context : new k.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        View view3 = null;
        switch (c10) {
            case 0:
                view2 = new androidx.appcompat.widget.u(cVar, attributeSet);
                break;
            case 1:
                view2 = new androidx.appcompat.widget.g(cVar, attributeSet);
                break;
            case 2:
                view2 = new androidx.appcompat.widget.o(cVar, attributeSet);
                break;
            case 3:
                i0 e10 = tVar.e(cVar, attributeSet);
                tVar.g(e10, str);
                view2 = e10;
                break;
            case 4:
                view2 = new AppCompatImageButton(cVar, attributeSet);
                break;
            case 5:
                view2 = new AppCompatSeekBar(cVar, attributeSet);
                break;
            case 6:
                view2 = new AppCompatSpinner(cVar, attributeSet);
                break;
            case 7:
                androidx.appcompat.widget.t d10 = tVar.d(cVar, attributeSet);
                tVar.g(d10, str);
                view2 = d10;
                break;
            case '\b':
                view2 = new m0(cVar, attributeSet);
                break;
            case '\t':
                view2 = new AppCompatImageView(cVar, attributeSet);
                break;
            case '\n':
                androidx.appcompat.widget.d a10 = tVar.a(cVar, attributeSet);
                tVar.g(a10, str);
                view2 = a10;
                break;
            case 11:
                AppCompatCheckBox c11 = tVar.c(cVar, attributeSet);
                tVar.g(c11, str);
                view2 = c11;
                break;
            case '\f':
                view2 = new androidx.appcompat.widget.k(cVar, attributeSet);
                break;
            case '\r':
                androidx.appcompat.widget.f b10 = tVar.b(cVar, attributeSet);
                tVar.g(b10, str);
                view2 = b10;
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != cVar) {
            Object[] objArr = tVar.f16129a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = t.f16127g;
                        if (i10 < 3) {
                            View f2 = tVar.f(cVar, str, strArr[i10]);
                            if (f2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view3 = f2;
                            } else {
                                i10++;
                            }
                        }
                    }
                } else {
                    View f10 = tVar.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view3 = f10;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            view2 = view3;
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.c.a(view2)) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, t.f16124c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new t.a(view2, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = cVar.obtainStyledAttributes(attributeSet, t.f16125d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z10 = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    new t0.c0().e(view2, Boolean.valueOf(z10));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, t.f16126e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    d0.r(view2, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, t.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z11 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, o0> weakHashMap3 = d0.f32288a;
                    new t0.z().e(view2, Boolean.valueOf(z11));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }

    @Override // g.j
    public final void p() {
        P();
        g.a aVar = this.I;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override // g.j
    public final void q() {
        A(true, false);
    }

    @Override // g.j
    public final void r() {
        P();
        g.a aVar = this.I;
        if (aVar != null) {
            aVar.o(false);
        }
    }

    @Override // g.j
    public final boolean t(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i6 = R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        } else if (i6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i6 = R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        if (this.e0 && i6 == 108) {
            return false;
        }
        if (this.f16060a0 && i6 == 1) {
            this.f16060a0 = false;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 5) {
                    if (i6 != 10) {
                        if (i6 != 108) {
                            if (i6 != 109) {
                                return this.F.requestFeature(i6);
                            }
                            V();
                            this.f16061b0 = true;
                            return true;
                        }
                        V();
                        this.f16060a0 = true;
                        return true;
                    }
                    V();
                    this.c0 = true;
                    return true;
                }
                V();
                this.Z = true;
                return true;
            }
            V();
            this.Y = true;
            return true;
        }
        V();
        this.e0 = true;
        return true;
    }

    @Override // g.j
    public final void u(int i6) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.E).inflate(i6, viewGroup);
        this.G.a(this.F.getCallback());
    }

    @Override // g.j
    public final void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.G.a(this.F.getCallback());
    }

    @Override // g.j
    public final void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.G.a(this.F.getCallback());
    }

    @Override // g.j
    public final void x(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.D;
        if (!(obj instanceof Activity)) {
            return;
        }
        P();
        g.a aVar = this.I;
        if (!(aVar instanceof c0)) {
            this.J = null;
            if (aVar != null) {
                aVar.h();
            }
            this.I = null;
            if (toolbar != null) {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.K;
                }
                z zVar = new z(toolbar, charSequence, this.G);
                this.I = zVar;
                this.G.f16088v = zVar.f16153c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.G.f16088v = null;
            }
            k();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // g.j
    public final void y(int i6) {
        this.f16072o0 = i6;
    }

    @Override // g.j
    public final void z(CharSequence charSequence) {
        this.K = charSequence;
        n0 n0Var = this.L;
        if (n0Var != null) {
            n0Var.setWindowTitle(charSequence);
            return;
        }
        g.a aVar = this.I;
        if (aVar != null) {
            aVar.p(charSequence);
            return;
        }
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i extends k.h {

        /* renamed from: v  reason: collision with root package name */
        public b f16088v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f16089w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f16090x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f16091y;

        public i(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f16089w = true;
                callback.onContentChanged();
            } finally {
                this.f16089w = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
            if (t0.d0.g.c(r11) != false) goto L55;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final k.e b(ActionMode.Callback callback) {
            Context context;
            k kVar = k.this;
            e.a aVar = new e.a(kVar.E, callback);
            k.a aVar2 = kVar.O;
            if (aVar2 != null) {
                aVar2.c();
            }
            d dVar = new d(aVar);
            kVar.P();
            g.a aVar3 = kVar.I;
            g.h hVar = kVar.H;
            if (aVar3 != null) {
                k.a q10 = aVar3.q(dVar);
                kVar.O = q10;
                if (q10 != null && hVar != null) {
                    hVar.X();
                }
            }
            if (kVar.O == null) {
                o0 o0Var = kVar.S;
                if (o0Var != null) {
                    o0Var.b();
                }
                k.a aVar4 = kVar.O;
                if (aVar4 != null) {
                    aVar4.c();
                }
                if (hVar != null && !kVar.f16069l0) {
                    try {
                        hVar.r();
                    } catch (AbstractMethodError unused) {
                    }
                }
                boolean z10 = true;
                if (kVar.P == null) {
                    boolean z11 = kVar.f16062d0;
                    Context context2 = kVar.E;
                    if (z11) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context2.getTheme();
                        theme.resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = context2.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            k.c cVar = new k.c(context2, 0);
                            cVar.getTheme().setTo(newTheme);
                            context2 = cVar;
                        }
                        kVar.P = new ActionBarContextView(context2, null);
                        PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) com.theinnerhour.b2b.R.attr.actionModePopupWindowStyle);
                        kVar.Q = popupWindow;
                        androidx.core.widget.j.b(popupWindow, 2);
                        kVar.Q.setContentView(kVar.P);
                        kVar.Q.setWidth(-1);
                        context2.getTheme().resolveAttribute(com.theinnerhour.b2b.R.attr.actionBarSize, typedValue, true);
                        kVar.P.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                        kVar.Q.setHeight(-2);
                        kVar.R = new g.n(kVar);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) kVar.V.findViewById(com.theinnerhour.b2b.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            kVar.P();
                            g.a aVar5 = kVar.I;
                            if (aVar5 != null) {
                                context = aVar5.e();
                            } else {
                                context = null;
                            }
                            if (context != null) {
                                context2 = context;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                            kVar.P = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (kVar.P != null) {
                    o0 o0Var2 = kVar.S;
                    if (o0Var2 != null) {
                        o0Var2.b();
                    }
                    kVar.P.h();
                    k.d dVar2 = new k.d(kVar.P.getContext(), kVar.P, dVar);
                    if (dVar.c(dVar2, dVar2.B)) {
                        dVar2.i();
                        kVar.P.f(dVar2);
                        kVar.O = dVar2;
                        if (kVar.U && (r11 = kVar.V) != null) {
                            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        }
                        z10 = false;
                        if (z10) {
                            kVar.P.setAlpha(0.0f);
                            o0 a10 = d0.a(kVar.P);
                            a10.a(1.0f);
                            kVar.S = a10;
                            a10.d(new g.o(kVar));
                        } else {
                            kVar.P.setAlpha(1.0f);
                            kVar.P.setVisibility(0);
                            if (kVar.P.getParent() instanceof View) {
                                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                                d0.h.c((View) kVar.P.getParent());
                            }
                        }
                        if (kVar.Q != null) {
                            kVar.F.getDecorView().post(kVar.R);
                        }
                    } else {
                        kVar.O = null;
                    }
                }
                if (kVar.O != null && hVar != null) {
                    hVar.X();
                }
                kVar.W();
                kVar.O = kVar.O;
            }
            kVar.W();
            k.a aVar6 = kVar.O;
            if (aVar6 == null) {
                return null;
            }
            return aVar.e(aVar6);
        }

        @Override // k.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f16090x) {
                return this.f22750u.dispatchKeyEvent(keyEvent);
            }
            if (!k.this.H(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // k.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z10;
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            k kVar = k.this;
            kVar.P();
            g.a aVar = kVar.I;
            if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                n nVar = kVar.f16065h0;
                if (nVar != null && kVar.T(nVar, keyEvent.getKeyCode(), keyEvent)) {
                    n nVar2 = kVar.f16065h0;
                    if (nVar2 != null) {
                        nVar2.f16110l = true;
                    }
                } else {
                    if (kVar.f16065h0 == null) {
                        n N = kVar.N(0);
                        kVar.U(N, keyEvent);
                        boolean T = kVar.T(N, keyEvent.getKeyCode(), keyEvent);
                        N.f16109k = false;
                    }
                    z10 = false;
                    if (!z10) {
                        return true;
                    }
                    return false;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f16089w) {
                this.f22750u.onContentChanged();
            }
        }

        @Override // k.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i6, Menu menu) {
            if (i6 == 0 && !(menu instanceof androidx.appcompat.view.menu.f)) {
                return false;
            }
            return super.onCreatePanelMenu(i6, menu);
        }

        @Override // k.h, android.view.Window.Callback
        public final View onCreatePanelView(int i6) {
            View view;
            b bVar = this.f16088v;
            if (bVar != null) {
                z.e eVar = (z.e) bVar;
                if (i6 == 0) {
                    view = new View(z.this.f16151a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i6);
        }

        @Override // k.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i6, Menu menu) {
            super.onMenuOpened(i6, menu);
            k kVar = k.this;
            if (i6 == 108) {
                kVar.P();
                g.a aVar = kVar.I;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                kVar.getClass();
            }
            return true;
        }

        @Override // k.h, android.view.Window.Callback
        public final void onPanelClosed(int i6, Menu menu) {
            if (this.f16091y) {
                this.f22750u.onPanelClosed(i6, menu);
                return;
            }
            super.onPanelClosed(i6, menu);
            k kVar = k.this;
            if (i6 == 108) {
                kVar.P();
                g.a aVar = kVar.I;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i6 == 0) {
                n N = kVar.N(i6);
                if (N.f16111m) {
                    kVar.F(N, false);
                }
            } else {
                kVar.getClass();
            }
        }

        @Override // k.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i6, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i6 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f1114x = true;
            }
            b bVar = this.f16088v;
            if (bVar != null) {
                z.e eVar = (z.e) bVar;
                if (i6 == 0) {
                    z zVar = z.this;
                    if (!zVar.f16154d) {
                        zVar.f16151a.f1504m = true;
                        zVar.f16154d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i6, view, menu);
            if (fVar != null) {
                fVar.f1114x = false;
            }
            return onPreparePanel;
        }

        @Override // k.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i6) {
            androidx.appcompat.view.menu.f fVar = k.this.N(0).f16106h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i6);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i6);
            }
        }

        @Override // k.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
            if (k.this.T && i6 == 0) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback, i6);
        }

        @Override // k.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (k.this.T) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
