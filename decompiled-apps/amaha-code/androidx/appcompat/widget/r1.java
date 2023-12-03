package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t0.d0;
import t0.f0;
/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public final class r1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r1 E;
    public static r1 F;
    public int A;
    public s1 B;
    public boolean C;
    public boolean D;

    /* renamed from: u  reason: collision with root package name */
    public final View f1533u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f1534v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1535w;

    /* renamed from: x  reason: collision with root package name */
    public final q1 f1536x = new Runnable(this) { // from class: androidx.appcompat.widget.q1

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ r1 f1519v;

        {
            this.f1519v = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = r2;
            r1 r1Var = this.f1519v;
            switch (i6) {
                case 0:
                    r1Var.c(false);
                    return;
                default:
                    r1Var.a();
                    return;
            }
        }
    };

    /* renamed from: y  reason: collision with root package name */
    public final q1 f1537y = new Runnable(this) { // from class: androidx.appcompat.widget.q1

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ r1 f1519v;

        {
            this.f1519v = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = r2;
            r1 r1Var = this.f1519v;
            switch (i6) {
                case 0:
                    r1Var.c(false);
                    return;
                default:
                    r1Var.a();
                    return;
            }
        }
    };

    /* renamed from: z  reason: collision with root package name */
    public int f1538z;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.q1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.q1] */
    public r1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1533u = view;
        this.f1534v = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = t0.f0.f32310a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = f0.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1535w = scaledTouchSlop;
        this.D = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r1 r1Var) {
        r1 r1Var2 = E;
        if (r1Var2 != null) {
            r1Var2.f1533u.removeCallbacks(r1Var2.f1536x);
        }
        E = r1Var;
        if (r1Var != null) {
            r1Var.f1533u.postDelayed(r1Var.f1536x, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        r1 r1Var = F;
        View view = this.f1533u;
        if (r1Var == this) {
            F = null;
            s1 s1Var = this.B;
            if (s1Var != null) {
                View view2 = s1Var.f1543b;
                if (view2.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) s1Var.f1542a.getSystemService("window")).removeView(view2);
                }
                this.B = null;
                this.D = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (E == this) {
            b(null);
        }
        view.removeCallbacks(this.f1537y);
    }

    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i6;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        long longPressTimeout;
        long j10;
        long j11;
        boolean z12;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        View view = this.f1533u;
        if (!d0.g.b(view)) {
            return;
        }
        b(null);
        r1 r1Var = F;
        if (r1Var != null) {
            r1Var.a();
        }
        F = this;
        this.C = z10;
        s1 s1Var = new s1(view.getContext());
        this.B = s1Var;
        int i13 = this.f1538z;
        int i14 = this.A;
        boolean z13 = this.C;
        View view2 = s1Var.f1543b;
        if (view2.getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Context context = s1Var.f1542a;
        if (z11) {
            if (view2.getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        s1Var.f1544c.setText(this.f1534v);
        WindowManager.LayoutParams layoutParams = s1Var.f1545d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i6 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z13) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = s1Var.f1546e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i11 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i11 = 0;
                rect.set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = s1Var.f1547g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = s1Var.f;
            view.getLocationOnScreen(iArr2);
            int i15 = iArr2[i11] - iArr[i11];
            iArr2[i11] = i15;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i15 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i16 = iArr2[1];
            int i17 = ((i6 + i16) - dimensionPixelOffset3) - measuredHeight;
            int i18 = i16 + height + dimensionPixelOffset3;
            if (z13) {
                if (i17 >= 0) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i18;
                }
            } else if (measuredHeight + i18 <= rect.height()) {
                layoutParams.y = i18;
            } else {
                layoutParams.y = i17;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.C) {
            j11 = 2500;
        } else {
            if ((d0.d.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        q1 q1Var = this.f1537y;
        view.removeCallbacks(q1Var);
        view.postDelayed(q1Var, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.B != null && this.C) {
            return false;
        }
        View view2 = this.f1533u;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.D = true;
                a();
            }
        } else if (view2.isEnabled() && this.B == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.D) {
                int abs = Math.abs(x10 - this.f1538z);
                int i6 = this.f1535w;
                if (abs <= i6 && Math.abs(y10 - this.A) <= i6) {
                    z10 = false;
                    if (z10) {
                        b(this);
                    }
                }
            }
            this.f1538z = x10;
            this.A = y10;
            this.D = false;
            if (z10) {
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1538z = view.getWidth() / 2;
        this.A = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
