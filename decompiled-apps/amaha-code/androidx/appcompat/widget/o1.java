package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import com.theinnerhour.b2b.R;
import g.k;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class o1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f1493a;

    /* renamed from: b  reason: collision with root package name */
    public int f1494b;

    /* renamed from: c  reason: collision with root package name */
    public e1 f1495c;

    /* renamed from: d  reason: collision with root package name */
    public View f1496d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1497e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1498g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1499h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1500i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1501j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1502k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1503l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1504m;

    /* renamed from: n  reason: collision with root package name */
    public c f1505n;

    /* renamed from: o  reason: collision with root package name */
    public int f1506o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1507p;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends kotlin.jvm.internal.b0 {
        public boolean e0 = false;

        /* renamed from: f0  reason: collision with root package name */
        public final /* synthetic */ int f1508f0;

        public a(int i6) {
            this.f1508f0 = i6;
        }

        @Override // kotlin.jvm.internal.b0, t0.p0
        public final void c(View view) {
            this.e0 = true;
        }

        @Override // kotlin.jvm.internal.b0, t0.p0
        public final void d() {
            o1.this.f1493a.setVisibility(0);
        }

        @Override // t0.p0
        public final void e() {
            if (!this.e0) {
                o1.this.f1493a.setVisibility(this.f1508f0);
            }
        }
    }

    public o1(Toolbar toolbar, boolean z10) {
        boolean z11;
        Drawable drawable;
        this.f1506o = 0;
        this.f1493a = toolbar;
        this.f1500i = toolbar.getTitle();
        this.f1501j = toolbar.getSubtitle();
        if (this.f1500i != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1499h = z11;
        this.f1498g = toolbar.getNavigationIcon();
        l1 m10 = l1.m(toolbar.getContext(), null, kc.f.f23236z, R.attr.actionBarStyle);
        int i6 = 15;
        this.f1507p = m10.e(15);
        if (z10) {
            CharSequence k10 = m10.k(27);
            if (!TextUtils.isEmpty(k10)) {
                this.f1499h = true;
                this.f1500i = k10;
                if ((this.f1494b & 8) != 0) {
                    toolbar.setTitle(k10);
                    if (this.f1499h) {
                        t0.d0.r(toolbar.getRootView(), k10);
                    }
                }
            }
            CharSequence k11 = m10.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f1501j = k11;
                if ((this.f1494b & 8) != 0) {
                    toolbar.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(20);
            if (e10 != null) {
                this.f = e10;
                u();
            }
            Drawable e11 = m10.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f1498g == null && (drawable = this.f1507p) != null) {
                this.f1498g = drawable;
                if ((this.f1494b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            k(m10.h(10, 0));
            int i10 = m10.i(9, 0);
            if (i10 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, (ViewGroup) toolbar, false);
                View view = this.f1496d;
                if (view != null && (this.f1494b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f1496d = inflate;
                if (inflate != null && (this.f1494b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                k(this.f1494b | 16);
            }
            int layoutDimension = m10.f1474b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c10 = m10.c(7, -1);
            int c11 = m10.c(3, -1);
            if (c10 >= 0 || c11 >= 0) {
                int max = Math.max(c10, 0);
                int max2 = Math.max(c11, 0);
                if (toolbar.N == null) {
                    toolbar.N = new d1();
                }
                toolbar.N.a(max, max2);
            }
            int i11 = m10.i(28, 0);
            if (i11 != 0) {
                Context context = toolbar.getContext();
                toolbar.F = i11;
                i0 i0Var = toolbar.f1315v;
                if (i0Var != null) {
                    i0Var.setTextAppearance(context, i11);
                }
            }
            int i12 = m10.i(26, 0);
            if (i12 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.G = i12;
                i0 i0Var2 = toolbar.f1316w;
                if (i0Var2 != null) {
                    i0Var2.setTextAppearance(context2, i12);
                }
            }
            int i13 = m10.i(22, 0);
            if (i13 != 0) {
                toolbar.setPopupTheme(i13);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1507p = toolbar.getNavigationIcon();
            } else {
                i6 = 11;
            }
            this.f1494b = i6;
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.f1506o) {
            this.f1506o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f1506o;
                String string = i14 != 0 ? getContext().getString(i14) : null;
                this.f1502k = string;
                if ((this.f1494b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f1506o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1502k);
                    }
                }
            }
        }
        this.f1502k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new n1(this));
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1493a.f1314u;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.N;
        if (cVar != null && cVar.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final void b() {
        this.f1504m = true;
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1493a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1314u) != null && actionMenuView.M) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o0
    public final void collapseActionView() {
        androidx.appcompat.view.menu.h hVar;
        Toolbar.f fVar = this.f1493a.f1306j0;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.f1325v;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void d(androidx.appcompat.view.menu.f fVar, k.c cVar) {
        c cVar2 = this.f1505n;
        Toolbar toolbar = this.f1493a;
        if (cVar2 == null) {
            c cVar3 = new c(toolbar.getContext());
            this.f1505n = cVar3;
            cVar3.C = R.id.action_menu_presenter;
        }
        c cVar4 = this.f1505n;
        cVar4.f1061y = cVar;
        if (fVar != null || toolbar.f1314u != null) {
            toolbar.e();
            androidx.appcompat.view.menu.f fVar2 = toolbar.f1314u.J;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.f1305i0);
                    fVar2.r(toolbar.f1306j0);
                }
                if (toolbar.f1306j0 == null) {
                    toolbar.f1306j0 = new Toolbar.f();
                }
                cVar4.L = true;
                if (fVar != null) {
                    fVar.b(cVar4, toolbar.D);
                    fVar.b(toolbar.f1306j0, toolbar.D);
                } else {
                    cVar4.h(toolbar.D, null);
                    toolbar.f1306j0.h(toolbar.D, null);
                    cVar4.d(true);
                    toolbar.f1306j0.d(true);
                }
                toolbar.f1314u.setPopupTheme(toolbar.E);
                toolbar.f1314u.setPresenter(cVar4);
                toolbar.f1305i0 = cVar4;
                toolbar.s();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean z10;
        boolean z11;
        ActionMenuView actionMenuView = this.f1493a.f1314u;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.N;
        if (cVar != null) {
            if (cVar.P == null && !cVar.j()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z10 = true;
                if (z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean f() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1493a.f1314u;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.N;
        if (cVar != null && cVar.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean g() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1493a.f1314u;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.N;
        if (cVar != null && cVar.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o0
    public final Context getContext() {
        return this.f1493a.getContext();
    }

    @Override // androidx.appcompat.widget.o0
    public final CharSequence getTitle() {
        return this.f1493a.getTitle();
    }

    @Override // androidx.appcompat.widget.o0
    public final void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f1493a.f1314u;
        if (actionMenuView != null && (cVar = actionMenuView.N) != null) {
            cVar.b();
            c.a aVar = cVar.O;
            if (aVar != null && aVar.b()) {
                aVar.f1151j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final boolean j() {
        Toolbar.f fVar = this.f1493a.f1306j0;
        if (fVar != null && fVar.f1325v != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o0
    public final void k(int i6) {
        View view;
        int i10 = this.f1494b ^ i6;
        this.f1494b = i6;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f1493a;
            if (i11 != 0) {
                if ((i6 & 4) != 0 && (i6 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1502k)) {
                        toolbar.setNavigationContentDescription(this.f1506o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1502k);
                    }
                }
                if ((this.f1494b & 4) != 0) {
                    Drawable drawable = this.f1498g;
                    if (drawable == null) {
                        drawable = this.f1507p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                u();
            }
            if ((i10 & 8) != 0) {
                if ((i6 & 8) != 0) {
                    toolbar.setTitle(this.f1500i);
                    toolbar.setSubtitle(this.f1501j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f1496d) != null) {
                if ((i6 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void l() {
        e1 e1Var = this.f1495c;
        if (e1Var != null) {
            ViewParent parent = e1Var.getParent();
            Toolbar toolbar = this.f1493a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1495c);
            }
        }
        this.f1495c = null;
    }

    @Override // androidx.appcompat.widget.o0
    public final void m(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = hc.d.H(getContext(), i6);
        } else {
            drawable = null;
        }
        this.f = drawable;
        u();
    }

    @Override // androidx.appcompat.widget.o0
    public final t0.o0 o(int i6, long j10) {
        float f;
        t0.o0 a10 = t0.d0.a(this.f1493a);
        if (i6 == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        a10.a(f);
        a10.c(j10);
        a10.d(new a(i6));
        return a10;
    }

    @Override // androidx.appcompat.widget.o0
    public final void p(int i6) {
        this.f1493a.setVisibility(i6);
    }

    @Override // androidx.appcompat.widget.o0
    public final int q() {
        return this.f1494b;
    }

    @Override // androidx.appcompat.widget.o0
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0
    public final void setIcon(int i6) {
        setIcon(i6 != 0 ? hc.d.H(getContext(), i6) : null);
    }

    @Override // androidx.appcompat.widget.o0
    public final void setWindowCallback(Window.Callback callback) {
        this.f1503l = callback;
    }

    @Override // androidx.appcompat.widget.o0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1499h) {
            this.f1500i = charSequence;
            if ((this.f1494b & 8) != 0) {
                Toolbar toolbar = this.f1493a;
                toolbar.setTitle(charSequence);
                if (this.f1499h) {
                    t0.d0.r(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.o0
    public final void t(boolean z10) {
        this.f1493a.setCollapsible(z10);
    }

    public final void u() {
        Drawable drawable;
        int i6 = this.f1494b;
        if ((i6 & 2) != 0) {
            if ((i6 & 1) != 0) {
                drawable = this.f;
                if (drawable == null) {
                    drawable = this.f1497e;
                }
            } else {
                drawable = this.f1497e;
            }
        } else {
            drawable = null;
        }
        this.f1493a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.o0
    public final void setIcon(Drawable drawable) {
        this.f1497e = drawable;
        u();
    }

    @Override // androidx.appcompat.widget.o0
    public final void i() {
    }

    @Override // androidx.appcompat.widget.o0
    public final void n() {
    }
}
