package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.x0;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class l extends l.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final int A;
    public final int B;
    public final x0 C;
    public PopupWindow.OnDismissListener F;
    public View G;
    public View H;
    public j.a I;
    public ViewTreeObserver J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean O;

    /* renamed from: v  reason: collision with root package name */
    public final Context f1155v;

    /* renamed from: w  reason: collision with root package name */
    public final f f1156w;

    /* renamed from: x  reason: collision with root package name */
    public final e f1157x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1158y;

    /* renamed from: z  reason: collision with root package name */
    public final int f1159z;
    public final a D = new a();
    public final b E = new b();
    public int N = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.a() && !lVar.C.S) {
                View view = lVar.H;
                if (view != null && view.isShown()) {
                    lVar.C.b();
                } else {
                    lVar.dismiss();
                }
            }
        }
    }

    public l(int i6, int i10, Context context, View view, f fVar, boolean z10) {
        this.f1155v = context;
        this.f1156w = fVar;
        this.f1158y = z10;
        this.f1157x = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.A = i6;
        this.B = i10;
        Resources resources = context.getResources();
        this.f1159z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.G = view;
        this.C = new x0(context, i6, i10);
        fVar.b(this, context);
    }

    @Override // l.f
    public final boolean a() {
        if (!this.K && this.C.a()) {
            return true;
        }
        return false;
    }

    @Override // l.f
    public final void b() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!a()) {
            if (!this.K && (view = this.G) != null) {
                this.H = view;
                x0 x0Var = this.C;
                x0Var.T.setOnDismissListener(this);
                x0Var.J = this;
                x0Var.S = true;
                p pVar = x0Var.T;
                pVar.setFocusable(true);
                View view2 = this.H;
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.J = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.D);
                }
                view2.addOnAttachStateChangeListener(this.E);
                x0Var.I = view2;
                x0Var.F = this.N;
                boolean z12 = this.L;
                Context context = this.f1155v;
                e eVar = this.f1157x;
                if (!z12) {
                    this.M = l.d.o(eVar, context, this.f1159z);
                    this.L = true;
                }
                x0Var.r(this.M);
                pVar.setInputMethodMode(2);
                Rect rect2 = this.f23987u;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                x0Var.R = rect;
                x0Var.b();
                r0 r0Var = x0Var.f1567w;
                r0Var.setOnKeyListener(this);
                if (this.O) {
                    f fVar = this.f1156w;
                    if (fVar.f1104m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.f1104m);
                        }
                        frameLayout.setEnabled(false);
                        r0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                x0Var.p(eVar);
                x0Var.b();
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        if (fVar != this.f1156w) {
            return;
        }
        dismiss();
        j.a aVar = this.I;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        this.L = false;
        e eVar = this.f1157x;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        if (a()) {
            this.C.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.I = aVar;
    }

    @Override // l.f
    public final r0 j() {
        return this.C.f1567w;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(m mVar) {
        boolean z10;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.A, this.B, this.f1155v, this.H, mVar, this.f1158y);
            j.a aVar = this.I;
            iVar.f1150i = aVar;
            l.d dVar = iVar.f1151j;
            if (dVar != null) {
                dVar.f(aVar);
            }
            boolean w10 = l.d.w(mVar);
            iVar.f1149h = w10;
            l.d dVar2 = iVar.f1151j;
            if (dVar2 != null) {
                dVar2.q(w10);
            }
            iVar.f1152k = this.F;
            this.F = null;
            this.f1156w.c(false);
            x0 x0Var = this.C;
            int i6 = x0Var.f1570z;
            int o10 = x0Var.o();
            int i10 = this.N;
            View view = this.G;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if ((Gravity.getAbsoluteGravity(i10, d0.e.d(view)) & 7) == 5) {
                i6 += this.G.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f == null) {
                    z10 = false;
                    if (z10) {
                        j.a aVar2 = this.I;
                        if (aVar2 != null) {
                            aVar2.d(mVar);
                        }
                        return true;
                    }
                } else {
                    iVar.d(i6, o10, true, true);
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.K = true;
        this.f1156w.c(true);
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.J = this.H.getViewTreeObserver();
            }
            this.J.removeGlobalOnLayoutListener(this.D);
            this.J = null;
        }
        this.H.removeOnAttachStateChangeListener(this.E);
        PopupWindow.OnDismissListener onDismissListener = this.F;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i6 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // l.d
    public final void p(View view) {
        this.G = view;
    }

    @Override // l.d
    public final void q(boolean z10) {
        this.f1157x.f1088w = z10;
    }

    @Override // l.d
    public final void r(int i6) {
        this.N = i6;
    }

    @Override // l.d
    public final void s(int i6) {
        this.C.f1570z = i6;
    }

    @Override // l.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // l.d
    public final void u(boolean z10) {
        this.O = z10;
    }

    @Override // l.d
    public final void v(int i6) {
        this.C.l(i6);
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.J;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.J = view.getViewTreeObserver();
                }
                lVar.J.removeGlobalOnLayoutListener(lVar.D);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // l.d
    public final void n(f fVar) {
    }
}
