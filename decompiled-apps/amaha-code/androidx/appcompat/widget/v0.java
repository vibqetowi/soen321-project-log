package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.widget.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class v0 implements l.f {
    public static final Method U;
    public static final Method V;
    public static final Method W;
    public int A;
    public boolean C;
    public boolean D;
    public boolean E;
    public d H;
    public View I;
    public AdapterView.OnItemClickListener J;
    public AdapterView.OnItemSelectedListener K;
    public final Handler P;
    public Rect R;
    public boolean S;
    public final p T;

    /* renamed from: u  reason: collision with root package name */
    public final Context f1565u;

    /* renamed from: v  reason: collision with root package name */
    public ListAdapter f1566v;

    /* renamed from: w  reason: collision with root package name */
    public r0 f1567w;

    /* renamed from: z  reason: collision with root package name */
    public int f1570z;

    /* renamed from: x  reason: collision with root package name */
    public final int f1568x = -2;

    /* renamed from: y  reason: collision with root package name */
    public int f1569y = -2;
    public final int B = 1002;
    public int F = 0;
    public final int G = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    public final g L = new g();
    public final f M = new f();
    public final e N = new e();
    public final c O = new c();
    public final Rect Q = new Rect();

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i6, boolean z10) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i6, z10);
            return maxAvailableHeight;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0 r0Var = v0.this.f1567w;
            if (r0Var != null) {
                r0Var.setListSelectionHidden(true);
                r0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            v0 v0Var = v0.this;
            if (v0Var.a()) {
                v0Var.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            v0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            p pVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            v0 v0Var = v0.this;
            if (action == 0 && (pVar = v0Var.T) != null && pVar.isShowing() && x10 >= 0) {
                p pVar2 = v0Var.T;
                if (x10 < pVar2.getWidth() && y10 >= 0 && y10 < pVar2.getHeight()) {
                    v0Var.P.postDelayed(v0Var.L, 250L);
                    return false;
                }
            }
            if (action == 1) {
                v0Var.P.removeCallbacks(v0Var.L);
                return false;
            }
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v0 v0Var = v0.this;
            r0 r0Var = v0Var.f1567w;
            if (r0Var != null) {
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                if (d0.g.b(r0Var) && v0Var.f1567w.getCount() > v0Var.f1567w.getChildCount() && v0Var.f1567w.getChildCount() <= v0Var.G) {
                    v0Var.T.setInputMethodMode(2);
                    v0Var.b();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                U = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                W = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                V = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public v0(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.f1565u = context;
        this.P = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kc.f.N, i6, i10);
        this.f1570z = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.C = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i6, i10);
        this.T = pVar;
        pVar.setInputMethodMode(1);
    }

    @Override // l.f
    public final boolean a() {
        return this.T.isShowing();
    }

    @Override // l.f
    public final void b() {
        int i6;
        boolean z10;
        int a10;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z11;
        r0 r0Var;
        int i12;
        int i13;
        r0 r0Var2 = this.f1567w;
        p pVar = this.T;
        Context context = this.f1565u;
        if (r0Var2 == null) {
            r0 q10 = q(!this.S, context);
            this.f1567w = q10;
            q10.setAdapter(this.f1566v);
            this.f1567w.setOnItemClickListener(this.J);
            this.f1567w.setFocusable(true);
            this.f1567w.setFocusableInTouchMode(true);
            this.f1567w.setOnItemSelectedListener(new u0(this));
            this.f1567w.setOnScrollListener(this.N);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.K;
            if (onItemSelectedListener != null) {
                this.f1567w.setOnItemSelectedListener(onItemSelectedListener);
            }
            pVar.setContentView(this.f1567w);
        } else {
            ViewGroup viewGroup = (ViewGroup) pVar.getContentView();
        }
        Drawable background = pVar.getBackground();
        int i14 = 0;
        Rect rect = this.Q;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i6 = rect.bottom + i15;
            if (!this.C) {
                this.A = -i15;
            }
        } else {
            rect.setEmpty();
            i6 = 0;
        }
        if (pVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.I;
        int i16 = this.A;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = V;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(pVar, view, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = pVar.getMaxAvailableHeight(view, i16);
        } else {
            a10 = a.a(pVar, view, i16, z10);
        }
        int i17 = this.f1568x;
        if (i17 == -1) {
            i11 = a10 + i6;
        } else {
            int i18 = this.f1569y;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), LinearLayoutManager.INVALID_OFFSET);
            }
            int a11 = this.f1567w.a(makeMeasureSpec, a10 + 0);
            if (a11 > 0) {
                i10 = this.f1567w.getPaddingBottom() + this.f1567w.getPaddingTop() + i6 + 0;
            } else {
                i10 = 0;
            }
            i11 = a11 + i10;
        }
        if (pVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        androidx.core.widget.j.b(pVar, this.B);
        if (pVar.isShowing()) {
            View view2 = this.I;
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            if (!d0.g.b(view2)) {
                return;
            }
            int i19 = this.f1569y;
            if (i19 == -1) {
                i19 = -1;
            } else if (i19 == -2) {
                i19 = this.I.getWidth();
            }
            if (i17 == -1) {
                if (z11) {
                    i17 = i11;
                } else {
                    i17 = -1;
                }
                if (z11) {
                    if (this.f1569y == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    pVar.setWidth(i13);
                    pVar.setHeight(0);
                } else {
                    if (this.f1569y == -1) {
                        i14 = -1;
                    }
                    pVar.setWidth(i14);
                    pVar.setHeight(-1);
                }
            } else if (i17 == -2) {
                i17 = i11;
            }
            pVar.setOutsideTouchable(true);
            View view3 = this.I;
            int i20 = this.f1570z;
            int i21 = this.A;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i17 < 0) {
                i12 = -1;
            } else {
                i12 = i17;
            }
            pVar.update(view3, i20, i21, i19, i12);
            return;
        }
        int i22 = this.f1569y;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.I.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        pVar.setWidth(i22);
        pVar.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = U;
            if (method2 != null) {
                try {
                    method2.invoke(pVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(pVar, true);
        }
        pVar.setOutsideTouchable(true);
        pVar.setTouchInterceptor(this.M);
        if (this.E) {
            androidx.core.widget.j.a(pVar, this.D);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = W;
            if (method3 != null) {
                try {
                    method3.invoke(pVar, this.R);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(pVar, this.R);
        }
        j.a.a(pVar, this.I, this.f1570z, this.A, this.F);
        this.f1567w.setSelection(-1);
        if ((!this.S || this.f1567w.isInTouchMode()) && (r0Var = this.f1567w) != null) {
            r0Var.setListSelectionHidden(true);
            r0Var.requestLayout();
        }
        if (!this.S) {
            this.P.post(this.O);
        }
    }

    public final int c() {
        return this.f1570z;
    }

    @Override // l.f
    public final void dismiss() {
        p pVar = this.T;
        pVar.dismiss();
        pVar.setContentView(null);
        this.f1567w = null;
        this.P.removeCallbacks(this.L);
    }

    public final void e(int i6) {
        this.f1570z = i6;
    }

    public final Drawable h() {
        return this.T.getBackground();
    }

    @Override // l.f
    public final r0 j() {
        return this.f1567w;
    }

    public final void k(Drawable drawable) {
        this.T.setBackgroundDrawable(drawable);
    }

    public final void l(int i6) {
        this.A = i6;
        this.C = true;
    }

    public final int o() {
        if (!this.C) {
            return 0;
        }
        return this.A;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.H;
        if (dVar == null) {
            this.H = new d();
        } else {
            ListAdapter listAdapter2 = this.f1566v;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1566v = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.H);
        }
        r0 r0Var = this.f1567w;
        if (r0Var != null) {
            r0Var.setAdapter(this.f1566v);
        }
    }

    public r0 q(boolean z10, Context context) {
        return new r0(z10, context);
    }

    public final void r(int i6) {
        Drawable background = this.T.getBackground();
        if (background != null) {
            Rect rect = this.Q;
            background.getPadding(rect);
            this.f1569y = rect.left + rect.right + i6;
            return;
        }
        this.f1569y = i6;
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i6) {
            boolean z10 = true;
            if (i6 == 1) {
                v0 v0Var = v0.this;
                if (v0Var.T.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && v0Var.T.getContentView() != null) {
                    Handler handler = v0Var.P;
                    g gVar = v0Var.L;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i6, int i10, int i11) {
        }
    }
}
