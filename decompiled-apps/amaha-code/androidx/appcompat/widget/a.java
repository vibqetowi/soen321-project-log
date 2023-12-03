package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public boolean A;
    public boolean B;

    /* renamed from: u  reason: collision with root package name */
    public final C0021a f1334u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f1335v;

    /* renamed from: w  reason: collision with root package name */
    public ActionMenuView f1336w;

    /* renamed from: x  reason: collision with root package name */
    public c f1337x;

    /* renamed from: y  reason: collision with root package name */
    public int f1338y;

    /* renamed from: z  reason: collision with root package name */
    public t0.o0 f1339z;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0021a implements t0.p0 {

        /* renamed from: u  reason: collision with root package name */
        public boolean f1340u = false;

        /* renamed from: v  reason: collision with root package name */
        public int f1341v;

        public C0021a() {
        }

        @Override // t0.p0
        public final void c(View view) {
            this.f1340u = true;
        }

        @Override // t0.p0
        public final void d() {
            a.super.setVisibility(0);
            this.f1340u = false;
        }

        @Override // t0.p0
        public final void e() {
            if (this.f1340u) {
                return;
            }
            a aVar = a.this;
            aVar.f1339z = null;
            a.super.setVisibility(this.f1341v);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i6, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, LinearLayoutManager.INVALID_OFFSET), i10);
        return Math.max(0, (i6 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i6, int i10, int i11, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i6 - measuredWidth, i12, i6, measuredHeight + i12);
        } else {
            view.layout(i6, i12, i6 + measuredWidth, measuredHeight + i12);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final t0.o0 e(int i6, long j10) {
        t0.o0 o0Var = this.f1339z;
        if (o0Var != null) {
            o0Var.b();
        }
        C0021a c0021a = this.f1334u;
        if (i6 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            t0.o0 a10 = t0.d0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            a.this.f1339z = a10;
            c0021a.f1341v = i6;
            a10.d(c0021a);
            return a10;
        }
        t0.o0 a11 = t0.d0.a(this);
        a11.a(0.0f);
        a11.c(j10);
        a.this.f1339z = a11;
        c0021a.f1341v = i6;
        a11.d(c0021a);
        return a11;
    }

    public int getAnimatedVisibility() {
        if (this.f1339z != null) {
            return this.f1334u.f1341v;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1338y;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i6;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, kc.f.f23236z, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1337x;
        if (cVar != null) {
            Configuration configuration2 = cVar.f1058v.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
                if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                    if (i10 >= 360) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 5;
            }
            cVar.K = i6;
            androidx.appcompat.view.menu.f fVar = cVar.f1059w;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.B = false;
        }
        if (!this.B) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = false;
        }
        if (!this.A) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.A = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A = false;
        }
        return true;
    }

    public void setContentHeight(int i6) {
        this.f1338y = i6;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            t0.o0 o0Var = this.f1339z;
            if (o0Var != null) {
                o0Var.b();
            }
            super.setVisibility(i6);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1334u = new C0021a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f1335v = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1335v = context;
        }
    }
}
