package g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0;
import com.theinnerhour.b2b.R;
import g.a;
import g.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.a;
import t0.d0;
import t0.o0;
import t0.q0;
/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public final class c0 extends g.a implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f16018a;

    /* renamed from: b  reason: collision with root package name */
    public Context f16019b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f16020c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f16021d;

    /* renamed from: e  reason: collision with root package name */
    public o0 f16022e;
    public ActionBarContextView f;

    /* renamed from: g  reason: collision with root package name */
    public final View f16023g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16024h;

    /* renamed from: i  reason: collision with root package name */
    public d f16025i;

    /* renamed from: j  reason: collision with root package name */
    public d f16026j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0348a f16027k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16028l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<a.b> f16029m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16030n;

    /* renamed from: o  reason: collision with root package name */
    public int f16031o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16032p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16033q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16034s;

    /* renamed from: t  reason: collision with root package name */
    public k.g f16035t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16036u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16037v;

    /* renamed from: w  reason: collision with root package name */
    public final a f16038w;

    /* renamed from: x  reason: collision with root package name */
    public final b f16039x;

    /* renamed from: y  reason: collision with root package name */
    public final c f16040y;

    /* renamed from: z  reason: collision with root package name */
    public static final AccelerateInterpolator f16017z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends kotlin.jvm.internal.b0 {
        public a() {
        }

        @Override // t0.p0
        public final void e() {
            View view;
            c0 c0Var = c0.this;
            if (c0Var.f16032p && (view = c0Var.f16023g) != null) {
                view.setTranslationY(0.0f);
                c0Var.f16021d.setTranslationY(0.0f);
            }
            c0Var.f16021d.setVisibility(8);
            c0Var.f16021d.setTransitioning(false);
            c0Var.f16035t = null;
            a.InterfaceC0348a interfaceC0348a = c0Var.f16027k;
            if (interfaceC0348a != null) {
                interfaceC0348a.d(c0Var.f16026j);
                c0Var.f16026j = null;
                c0Var.f16027k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c0Var.f16020c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
                d0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends kotlin.jvm.internal.b0 {
        public b() {
        }

        @Override // t0.p0
        public final void e() {
            c0 c0Var = c0.this;
            c0Var.f16035t = null;
            c0Var.f16021d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements q0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends k.a implements f.a {

        /* renamed from: w  reason: collision with root package name */
        public final Context f16042w;

        /* renamed from: x  reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f16043x;

        /* renamed from: y  reason: collision with root package name */
        public a.InterfaceC0348a f16044y;

        /* renamed from: z  reason: collision with root package name */
        public WeakReference<View> f16045z;

        public d(Context context, k.d dVar) {
            this.f16042w = context;
            this.f16044y = dVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f1103l = 1;
            this.f16043x = fVar;
            fVar.f1097e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0348a interfaceC0348a = this.f16044y;
            if (interfaceC0348a != null) {
                return interfaceC0348a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f16044y == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = c0.this.f.f1337x;
            if (cVar != null) {
                cVar.n();
            }
        }

        @Override // k.a
        public final void c() {
            c0 c0Var = c0.this;
            if (c0Var.f16025i != this) {
                return;
            }
            if (!(!c0Var.f16033q)) {
                c0Var.f16026j = this;
                c0Var.f16027k = this.f16044y;
            } else {
                this.f16044y.d(this);
            }
            this.f16044y = null;
            c0Var.r(false);
            ActionBarContextView actionBarContextView = c0Var.f;
            if (actionBarContextView.E == null) {
                actionBarContextView.h();
            }
            c0Var.f16020c.setHideOnContentScrollEnabled(c0Var.f16037v);
            c0Var.f16025i = null;
        }

        @Override // k.a
        public final View d() {
            WeakReference<View> weakReference = this.f16045z;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f16043x;
        }

        @Override // k.a
        public final MenuInflater f() {
            return new k.f(this.f16042w);
        }

        @Override // k.a
        public final CharSequence g() {
            return c0.this.f.getSubtitle();
        }

        @Override // k.a
        public final CharSequence h() {
            return c0.this.f.getTitle();
        }

        @Override // k.a
        public final void i() {
            if (c0.this.f16025i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f16043x;
            fVar.z();
            try {
                this.f16044y.b(this, fVar);
            } finally {
                fVar.y();
            }
        }

        @Override // k.a
        public final boolean j() {
            return c0.this.f.M;
        }

        @Override // k.a
        public final void k(View view) {
            c0.this.f.setCustomView(view);
            this.f16045z = new WeakReference<>(view);
        }

        @Override // k.a
        public final void l(int i6) {
            m(c0.this.f16018a.getResources().getString(i6));
        }

        @Override // k.a
        public final void m(CharSequence charSequence) {
            c0.this.f.setSubtitle(charSequence);
        }

        @Override // k.a
        public final void n(int i6) {
            o(c0.this.f16018a.getResources().getString(i6));
        }

        @Override // k.a
        public final void o(CharSequence charSequence) {
            c0.this.f.setTitle(charSequence);
        }

        @Override // k.a
        public final void p(boolean z10) {
            this.f22695v = z10;
            c0.this.f.setTitleOptional(z10);
        }
    }

    public c0(Activity activity, boolean z10) {
        new ArrayList();
        this.f16029m = new ArrayList<>();
        this.f16031o = 0;
        this.f16032p = true;
        this.f16034s = true;
        this.f16038w = new a();
        this.f16039x = new b();
        this.f16040y = new c();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z10) {
            return;
        }
        this.f16023g = decorView.findViewById(16908290);
    }

    @Override // g.a
    public final boolean b() {
        o0 o0Var = this.f16022e;
        if (o0Var != null && o0Var.j()) {
            this.f16022e.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // g.a
    public final void c(boolean z10) {
        if (z10 == this.f16028l) {
            return;
        }
        this.f16028l = z10;
        ArrayList<a.b> arrayList = this.f16029m;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
    }

    @Override // g.a
    public final int d() {
        return this.f16022e.q();
    }

    @Override // g.a
    public final Context e() {
        if (this.f16019b == null) {
            TypedValue typedValue = new TypedValue();
            this.f16018a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f16019b = new ContextThemeWrapper(this.f16018a, i6);
            } else {
                this.f16019b = this.f16018a;
            }
        }
        return this.f16019b;
    }

    @Override // g.a
    public final void g() {
        t(this.f16018a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.a
    public final boolean i(int i6, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        int i10;
        d dVar = this.f16025i;
        if (dVar == null || (fVar = dVar.f16043x) == null) {
            return false;
        }
        if (keyEvent != null) {
            i10 = keyEvent.getDeviceId();
        } else {
            i10 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i10).getKeyboardType() == 1) {
            z10 = false;
        }
        fVar.setQwertyMode(z10);
        return fVar.performShortcut(i6, keyEvent, 0);
    }

    @Override // g.a
    public final void l(boolean z10) {
        if (!this.f16024h) {
            m(z10);
        }
    }

    @Override // g.a
    public final void m(boolean z10) {
        int i6;
        if (z10) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        int q10 = this.f16022e.q();
        this.f16024h = true;
        this.f16022e.k((i6 & 4) | ((-5) & q10));
    }

    @Override // g.a
    public final void n() {
        this.f16022e.k((this.f16022e.q() & (-9)) | 0);
    }

    @Override // g.a
    public final void o(boolean z10) {
        k.g gVar;
        this.f16036u = z10;
        if (!z10 && (gVar = this.f16035t) != null) {
            gVar.a();
        }
    }

    @Override // g.a
    public final void p(CharSequence charSequence) {
        this.f16022e.setWindowTitle(charSequence);
    }

    @Override // g.a
    public final k.a q(k.d dVar) {
        d dVar2 = this.f16025i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f16020c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar3 = new d(this.f.getContext(), dVar);
        androidx.appcompat.view.menu.f fVar = dVar3.f16043x;
        fVar.z();
        try {
            if (dVar3.f16044y.c(dVar3, fVar)) {
                this.f16025i = dVar3;
                dVar3.i();
                this.f.f(dVar3);
                r(true);
                return dVar3;
            }
            return null;
        } finally {
            fVar.y();
        }
    }

    public final void r(boolean z10) {
        t0.o0 o10;
        t0.o0 e10;
        long j10;
        if (z10) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f16020c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16020c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        ActionBarContainer actionBarContainer = this.f16021d;
        WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
        if (d0.g.c(actionBarContainer)) {
            if (z10) {
                e10 = this.f16022e.o(4, 100L);
                o10 = this.f.e(0, 200L);
            } else {
                o10 = this.f16022e.o(0, 200L);
                e10 = this.f.e(8, 100L);
            }
            k.g gVar = new k.g();
            ArrayList<t0.o0> arrayList = gVar.f22743a;
            arrayList.add(e10);
            View view = e10.f32342a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = o10.f32342a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(o10);
            gVar.b();
        } else if (z10) {
            this.f16022e.p(4);
            this.f.setVisibility(0);
        } else {
            this.f16022e.p(0);
            this.f.setVisibility(8);
        }
    }

    public final void s(View view) {
        String str;
        o0 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f16020c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof o0) {
            wrapper = (o0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f16022e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f16021d = actionBarContainer;
        o0 o0Var = this.f16022e;
        if (o0Var != null && this.f != null && actionBarContainer != null) {
            this.f16018a = o0Var.getContext();
            if ((this.f16022e.q() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f16024h = true;
            }
            Context context = this.f16018a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f16022e.i();
            t(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f16018a.obtainStyledAttributes(null, kc.f.f23236z, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f16020c;
                if (actionBarOverlayLayout2.B) {
                    this.f16037v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f16021d;
                WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
                d0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(c0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void t(boolean z10) {
        this.f16030n = z10;
        if (!z10) {
            this.f16022e.l();
            this.f16021d.setTabContainer(null);
        } else {
            this.f16021d.setTabContainer(null);
            this.f16022e.l();
        }
        this.f16022e.n();
        o0 o0Var = this.f16022e;
        boolean z11 = this.f16030n;
        o0Var.t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f16020c;
        boolean z12 = this.f16030n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z10) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        boolean z12 = this.f16033q;
        if (this.r || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        bb.a aVar = null;
        View view = this.f16023g;
        c cVar = this.f16040y;
        if (z11) {
            if (!this.f16034s) {
                this.f16034s = true;
                k.g gVar = this.f16035t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f16021d.setVisibility(0);
                int i6 = this.f16031o;
                b bVar = this.f16039x;
                if (i6 == 0 && (this.f16036u || z10)) {
                    this.f16021d.setTranslationY(0.0f);
                    float f = -this.f16021d.getHeight();
                    if (z10) {
                        this.f16021d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.f16021d.setTranslationY(f);
                    k.g gVar2 = new k.g();
                    t0.o0 a10 = d0.a(this.f16021d);
                    a10.e(0.0f);
                    View view2 = a10.f32342a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            aVar = new bb.a(cVar, 2, view2);
                        }
                        o0.a.a(view2.animate(), aVar);
                    }
                    boolean z13 = gVar2.f22747e;
                    ArrayList<t0.o0> arrayList = gVar2.f22743a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f16032p && view != null) {
                        view.setTranslationY(f);
                        t0.o0 a11 = d0.a(view);
                        a11.e(0.0f);
                        if (!gVar2.f22747e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z14 = gVar2.f22747e;
                    if (!z14) {
                        gVar2.f22745c = decelerateInterpolator;
                    }
                    if (!z14) {
                        gVar2.f22744b = 250L;
                    }
                    if (!z14) {
                        gVar2.f22746d = bVar;
                    }
                    this.f16035t = gVar2;
                    gVar2.b();
                } else {
                    this.f16021d.setAlpha(1.0f);
                    this.f16021d.setTranslationY(0.0f);
                    if (this.f16032p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.e();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f16020c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
                    d0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f16034s) {
            this.f16034s = false;
            k.g gVar3 = this.f16035t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i10 = this.f16031o;
            a aVar2 = this.f16038w;
            if (i10 == 0 && (this.f16036u || z10)) {
                this.f16021d.setAlpha(1.0f);
                this.f16021d.setTransitioning(true);
                k.g gVar4 = new k.g();
                float f2 = -this.f16021d.getHeight();
                if (z10) {
                    this.f16021d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                t0.o0 a12 = d0.a(this.f16021d);
                a12.e(f2);
                View view3 = a12.f32342a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        aVar = new bb.a(cVar, 2, view3);
                    }
                    o0.a.a(view3.animate(), aVar);
                }
                boolean z15 = gVar4.f22747e;
                ArrayList<t0.o0> arrayList2 = gVar4.f22743a;
                if (!z15) {
                    arrayList2.add(a12);
                }
                if (this.f16032p && view != null) {
                    t0.o0 a13 = d0.a(view);
                    a13.e(f2);
                    if (!gVar4.f22747e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f16017z;
                boolean z16 = gVar4.f22747e;
                if (!z16) {
                    gVar4.f22745c = accelerateInterpolator;
                }
                if (!z16) {
                    gVar4.f22744b = 250L;
                }
                if (!z16) {
                    gVar4.f22746d = aVar2;
                }
                this.f16035t = gVar4;
                gVar4.b();
                return;
            }
            aVar2.e();
        }
    }

    public c0(Dialog dialog) {
        new ArrayList();
        this.f16029m = new ArrayList<>();
        this.f16031o = 0;
        this.f16032p = true;
        this.f16034s = true;
        this.f16038w = new a();
        this.f16039x = new b();
        this.f16040y = new c();
        s(dialog.getWindow().getDecorView());
    }
}
