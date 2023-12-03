package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.x0;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class b extends l.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Handler A;
    public View I;
    public View J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean Q;
    public j.a R;
    public ViewTreeObserver S;
    public PopupWindow.OnDismissListener T;
    public boolean U;

    /* renamed from: v  reason: collision with root package name */
    public final Context f1063v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1064w;

    /* renamed from: x  reason: collision with root package name */
    public final int f1065x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1066y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f1067z;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public final a D = new a();
    public final View$OnAttachStateChangeListenerC0020b E = new View$OnAttachStateChangeListenerC0020b();
    public final c F = new c();
    public int G = 0;
    public int H = 0;
    public boolean P = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.a()) {
                ArrayList arrayList = bVar.C;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f1071a.S) {
                    View view = bVar.J;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).f1071a.b();
                        }
                        return;
                    }
                    bVar.dismiss();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements w0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.w0
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            d dVar = null;
            bVar.A.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.C;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    if (fVar == ((d) arrayList.get(i6)).f1072b) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i10 = i6 + 1;
            if (i10 < arrayList.size()) {
                dVar = (d) arrayList.get(i10);
            }
            bVar.A.postAtTime(new androidx.appcompat.view.menu.c(this, dVar, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.w0
        public final void g(f fVar, MenuItem menuItem) {
            b.this.A.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final x0 f1071a;

        /* renamed from: b  reason: collision with root package name */
        public final f f1072b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1073c;

        public d(x0 x0Var, f fVar, int i6) {
            this.f1071a = x0Var;
            this.f1072b = fVar;
            this.f1073c = i6;
        }
    }

    public b(Context context, View view, int i6, int i10, boolean z10) {
        this.f1063v = context;
        this.I = view;
        this.f1065x = i6;
        this.f1066y = i10;
        this.f1067z = z10;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        this.K = d0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1064w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A = new Handler();
    }

    @Override // l.f
    public final boolean a() {
        ArrayList arrayList = this.C;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f1071a.a()) {
            return false;
        }
        return true;
    }

    @Override // l.f
    public final void b() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        arrayList.clear();
        View view = this.I;
        this.J = view;
        if (view != null) {
            if (this.S == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.S = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.D);
            }
            this.J.addOnAttachStateChangeListener(this.E);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        int i6;
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (fVar == ((d) arrayList.get(i10)).f1072b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f1072b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        dVar.f1072b.r(this);
        boolean z11 = this.U;
        x0 x0Var = dVar.f1071a;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 23) {
                x0.a.b(x0Var.T, null);
            } else {
                x0Var.getClass();
            }
            x0Var.T.setAnimationStyle(0);
        }
        x0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.K = ((d) arrayList.get(size2 - 1)).f1073c;
        } else {
            View view = this.I;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.e.d(view) == 1) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.K = i6;
        }
        if (size2 == 0) {
            dismiss();
            j.a aVar = this.R;
            if (aVar != null) {
                aVar.c(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.S;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.S.removeGlobalOnLayoutListener(this.D);
                }
                this.S = null;
            }
            this.J.removeOnAttachStateChangeListener(this.E);
            this.T.onDismiss();
        } else if (z10) {
            ((d) arrayList.get(0)).f1072b.c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f1071a.f1567w.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f1071a.a()) {
                        dVar.f1071a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.R = aVar;
    }

    @Override // l.f
    public final r0 j() {
        ArrayList arrayList = this.C;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f1071a.f1567w;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f1072b) {
                dVar.f1071a.f1567w.requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            n(mVar);
            j.a aVar = this.R;
            if (aVar != null) {
                aVar.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // l.d
    public final void n(f fVar) {
        fVar.b(this, this.f1063v);
        if (a()) {
            x(fVar);
        } else {
            this.B.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                dVar = (d) arrayList.get(i6);
                if (!dVar.f1071a.a()) {
                    break;
                }
                i6++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f1072b.c(false);
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
        if (this.I != view) {
            this.I = view;
            int i6 = this.G;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            this.H = Gravity.getAbsoluteGravity(i6, d0.e.d(view));
        }
    }

    @Override // l.d
    public final void q(boolean z10) {
        this.P = z10;
    }

    @Override // l.d
    public final void r(int i6) {
        if (this.G != i6) {
            this.G = i6;
            View view = this.I;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            this.H = Gravity.getAbsoluteGravity(i6, d0.e.d(view));
        }
    }

    @Override // l.d
    public final void s(int i6) {
        this.L = true;
        this.N = i6;
    }

    @Override // l.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.T = onDismissListener;
    }

    @Override // l.d
    public final void u(boolean z10) {
        this.Q = z10;
    }

    @Override // l.d
    public final void v(int i6) {
        this.M = true;
        this.O = i6;
    }

    public final void x(f fVar) {
        View view;
        d dVar;
        Rect rect;
        int i6;
        boolean z10;
        char c10;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        e eVar;
        int i12;
        int firstVisiblePosition;
        Context context = this.f1063v;
        LayoutInflater from = LayoutInflater.from(context);
        e eVar2 = new e(fVar, from, this.f1067z, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.P) {
            eVar2.f1088w = true;
        } else if (a()) {
            eVar2.f1088w = l.d.w(fVar);
        }
        int o10 = l.d.o(eVar2, context, this.f1064w);
        x0 x0Var = new x0(context, this.f1065x, this.f1066y);
        x0Var.X = this.F;
        x0Var.J = this;
        p pVar = x0Var.T;
        pVar.setOnDismissListener(this);
        x0Var.I = this.I;
        x0Var.F = this.H;
        x0Var.S = true;
        pVar.setFocusable(true);
        pVar.setInputMethodMode(2);
        x0Var.p(eVar2);
        x0Var.r(o10);
        x0Var.F = this.H;
        ArrayList arrayList = this.C;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            f fVar2 = dVar.f1072b;
            int size = fVar2.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    menuItem = fVar2.getItem(i13);
                    if (menuItem.hasSubMenu() && fVar == menuItem.getSubMenu()) {
                        break;
                    }
                    i13++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                r0 r0Var = dVar.f1071a.f1567w;
                ListAdapter adapter = r0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i12 = 0;
                }
                int count = eVar.getCount();
                int i14 = 0;
                while (true) {
                    if (i14 < count) {
                        if (menuItem == eVar.getItem(i14)) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + i12) - r0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r0Var.getChildCount()) {
                    view = r0Var.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            dVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = x0.Y;
                if (method != null) {
                    try {
                        method.invoke(pVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                x0.b.a(pVar, false);
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 23) {
                x0.a.a(pVar, null);
            }
            r0 r0Var2 = ((d) arrayList.get(arrayList.size() - 1)).f1071a.f1567w;
            int[] iArr = new int[2];
            r0Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.J.getWindowVisibleDisplayFrame(rect2);
            if (this.K != 1 ? iArr[0] - o10 < 0 : r0Var2.getWidth() + iArr[0] + o10 <= rect2.right) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i6 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K = i6;
            if (i15 >= 26) {
                x0Var.I = view;
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.I.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.H & 7) == 5) {
                    c10 = 0;
                    iArr2[0] = this.I.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c10 = 0;
                }
                i10 = iArr3[c10] - iArr2[c10];
                i11 = iArr3[1] - iArr2[1];
            }
            if ((this.H & 5) == 5) {
                if (z10) {
                    width = i10 + o10;
                    x0Var.f1570z = width;
                    x0Var.E = true;
                    x0Var.D = true;
                    x0Var.l(i11);
                } else {
                    o10 = view.getWidth();
                    width = i10 - o10;
                    x0Var.f1570z = width;
                    x0Var.E = true;
                    x0Var.D = true;
                    x0Var.l(i11);
                }
            } else {
                if (z10) {
                    width = i10 + view.getWidth();
                    x0Var.f1570z = width;
                    x0Var.E = true;
                    x0Var.D = true;
                    x0Var.l(i11);
                }
                width = i10 - o10;
                x0Var.f1570z = width;
                x0Var.E = true;
                x0Var.D = true;
                x0Var.l(i11);
            }
        } else {
            if (this.L) {
                x0Var.f1570z = this.N;
            }
            if (this.M) {
                x0Var.l(this.O);
            }
            Rect rect3 = this.f23987u;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            x0Var.R = rect;
        }
        arrayList.add(new d(x0Var, fVar, this.K));
        x0Var.b();
        r0 r0Var3 = x0Var.f1567w;
        r0Var3.setOnKeyListener(this);
        if (dVar == null && this.Q && fVar.f1104m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r0Var3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(fVar.f1104m);
            r0Var3.addHeaderView(frameLayout, null, false);
            x0Var.b();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0020b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0020b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.S;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.S = view.getViewTreeObserver();
                }
                bVar.S.removeGlobalOnLayoutListener(bVar.D);
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
}
