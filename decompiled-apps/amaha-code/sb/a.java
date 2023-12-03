package sb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.p1;
import com.theinnerhour.b2b.R;
import g0.a;
import java.util.WeakHashMap;
import k0.a;
import t0.d0;
import t0.o0;
import t0.x;
import u0.h;
import ug.l;
/* compiled from: NavigationBarItemView.java */
/* loaded from: classes.dex */
public abstract class a extends FrameLayout implements k.a {

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f31380b0 = {16842912};
    public static final c c0 = new c();

    /* renamed from: d0  reason: collision with root package name */
    public static final d f31381d0 = new d();
    public float A;
    public float B;
    public int C;
    public boolean D;
    public final FrameLayout E;
    public final View F;
    public final ImageView G;
    public final ViewGroup H;
    public final TextView I;
    public final TextView J;
    public int K;
    public androidx.appcompat.view.menu.h L;
    public ColorStateList M;
    public Drawable N;
    public Drawable O;
    public ValueAnimator P;
    public c Q;
    public float R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public cb.a f31382a0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f31383u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f31384v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f31385w;

    /* renamed from: x  reason: collision with root package name */
    public int f31386x;

    /* renamed from: y  reason: collision with root package name */
    public int f31387y;

    /* renamed from: z  reason: collision with root package name */
    public float f31388z;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: sb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0535a implements View.OnLayoutChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a f31389u;

        public View$OnLayoutChangeListenerC0535a(eb.a aVar) {
            this.f31389u = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            boolean z10;
            a aVar = this.f31389u;
            if (aVar.G.getVisibility() == 0) {
                cb.a aVar2 = aVar.f31382a0;
                if (aVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Rect rect = new Rect();
                    ImageView imageView = aVar.G;
                    imageView.getDrawingRect(rect);
                    aVar2.setBounds(rect);
                    aVar2.g(imageView, null);
                }
            }
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f31390u;

        public b(int i6) {
            this.f31390u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.h(this.f31390u);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes.dex */
    public static class c {
        public float a(float f, float f2) {
            return 1.0f;
        }
    }

    /* compiled from: NavigationBarItemView.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // sb.a.c
        public final float a(float f, float f2) {
            LinearInterpolator linearInterpolator = ab.a.f449a;
            return (f * 0.6f) + 0.4f;
        }
    }

    public a(Context context) {
        super(context);
        this.f31383u = false;
        this.K = -1;
        this.Q = c0;
        this.R = 0.0f;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.E = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.F = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.G = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.H = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.I = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.J = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f31386x = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f31387y = viewGroup.getPaddingBottom();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(textView, 2);
        d0.d.s(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0535a((eb.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(TextView textView, int i6) {
        int i10;
        int complexToDimensionPixelSize;
        androidx.core.widget.k.e(textView, i6);
        Context context = textView.getContext();
        if (i6 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, l.N);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                if (Build.VERSION.SDK_INT >= 22) {
                    i10 = typedValue.getComplexUnit();
                } else {
                    i10 = (typedValue.data >> 0) & 15;
                }
                if (i10 == 2) {
                    complexToDimensionPixelSize = Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
                } else {
                    complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                }
                if (complexToDimensionPixelSize == 0) {
                    textView.setTextSize(0, complexToDimensionPixelSize);
                    return;
                }
                return;
            }
        }
        complexToDimensionPixelSize = 0;
        if (complexToDimensionPixelSize == 0) {
        }
    }

    public static void f(float f, float f2, int i6, TextView textView) {
        textView.setScaleX(f);
        textView.setScaleY(f2);
        textView.setVisibility(i6);
    }

    public static void g(View view, int i6, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i6;
        layoutParams.bottomMargin = i6;
        layoutParams.gravity = i10;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.E;
        if (frameLayout == null) {
            return this.G;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i6 = 0;
        for (int i10 = 0; i10 < indexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i6++;
            }
        }
        return i6;
    }

    private int getSuggestedIconHeight() {
        int i6;
        cb.a aVar = this.f31382a0;
        if (aVar != null) {
            i6 = aVar.getMinimumHeight() / 2;
        } else {
            i6 = 0;
        }
        return this.G.getMeasuredWidth() + Math.max(i6, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + i6;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        cb.a aVar = this.f31382a0;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.f31382a0.f5229y.f5232b.G.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.G.getMeasuredWidth() + max;
    }

    public static void i(int i6, ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i6);
    }

    public final void a(float f, float f2) {
        this.f31388z = f - f2;
        this.A = (f2 * 1.0f) / f;
        this.B = (f * 1.0f) / f2;
    }

    public final void b() {
        Drawable drawable = this.f31385w;
        ColorStateList colorStateList = this.f31384v;
        FrameLayout frameLayout = this.E;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.S && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(vb.b.c(this.f31384v), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(vb.b.a(this.f31384v), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(frameLayout, rippleDrawable);
        }
        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
        d0.d.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(androidx.appcompat.view.menu.h hVar) {
        CharSequence charSequence;
        int i6;
        this.L = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f1122e);
        setId(hVar.f1118a);
        if (!TextUtils.isEmpty(hVar.f1133q)) {
            setContentDescription(hVar.f1133q);
        }
        if (!TextUtils.isEmpty(hVar.r)) {
            charSequence = hVar.r;
        } else {
            charSequence = hVar.f1122e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            p1.a(this, charSequence);
        }
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        this.f31383u = true;
    }

    public final void d(float f, float f2) {
        float f10;
        float f11;
        View view = this.F;
        if (view != null) {
            c cVar = this.Q;
            cVar.getClass();
            LinearInterpolator linearInterpolator = ab.a.f449a;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(cVar.a(f, f2));
            int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i6 == 0) {
                f10 = 0.8f;
            } else {
                f10 = 0.0f;
            }
            if (i6 == 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.2f;
            }
            view.setAlpha(ab.a.a(0.0f, 1.0f, f10, f11, f));
        }
        this.R = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && this.S) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.F;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public cb.a getBadge() {
        return this.f31382a0;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.h getItemData() {
        return this.L;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.K;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.H;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.H;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void h(int i6) {
        boolean z10;
        int i10;
        View view = this.F;
        if (view == null) {
            return;
        }
        int min = Math.min(this.T, i6 - (this.W * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (this.V && this.C == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = min;
        } else {
            i10 = this.U;
        }
        layoutParams.height = i10;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        androidx.appcompat.view.menu.h hVar = this.L;
        if (hVar != null && hVar.isCheckable() && this.L.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31380b0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cb.a aVar = this.f31382a0;
        if (aVar != null && aVar.isVisible()) {
            androidx.appcompat.view.menu.h hVar = this.L;
            CharSequence charSequence = hVar.f1122e;
            if (!TextUtils.isEmpty(hVar.f1133q)) {
                charSequence = this.L.f1133q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f31382a0.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h.c.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f33748a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) h.a.f33735g.f33743a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        post(new b(i6));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.F;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        int i6;
        this.S = z10;
        b();
        View view = this.F;
        if (view != null) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            view.setVisibility(i6);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i6) {
        this.U = i6;
        h(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i6) {
        this.W = i6;
        h(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.V = z10;
    }

    public void setActiveIndicatorWidth(int i6) {
        this.T = i6;
        h(getWidth());
    }

    public void setBadge(cb.a aVar) {
        boolean z10;
        boolean z11;
        cb.a aVar2 = this.f31382a0;
        if (aVar2 == aVar) {
            return;
        }
        boolean z12 = true;
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.G;
        if (z10 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f31382a0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setClipChildren(true);
                setClipToPadding(true);
                cb.a aVar3 = this.f31382a0;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f31382a0 = null;
            }
        }
        this.f31382a0 = aVar;
        if (imageView != null) {
            if (aVar == null) {
                z12 = false;
            }
            if (z12) {
                setClipChildren(false);
                setClipToPadding(false);
                cb.a aVar4 = this.f31382a0;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar4.setBounds(rect);
                aVar4.g(imageView, null);
                if (aVar4.d() != null) {
                    aVar4.d().setForeground(aVar4);
                } else {
                    imageView.getOverlay().add(aVar4);
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z10) {
        float f;
        int i6;
        TextView textView = this.J;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.I;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        if (z10) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (this.S && this.f31383u) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.b(this)) {
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, f);
                this.P = ofFloat;
                ofFloat.addUpdateListener(new sb.b(this, f));
                this.P.setInterpolator(rb.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f450b));
                this.P.setDuration(rb.a.c(getContext(), R.attr.motionDurationLong2, getResources().getInteger(R.integer.material_motion_duration_long_1)));
                this.P.start();
                i6 = this.C;
                ViewGroup viewGroup = this.H;
                if (i6 == -1) {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                g(getIconOrContainer(), this.f31386x, 17);
                                textView.setVisibility(8);
                                textView2.setVisibility(8);
                            }
                        } else {
                            i(this.f31387y, viewGroup);
                            if (z10) {
                                g(getIconOrContainer(), (int) (this.f31386x + this.f31388z), 49);
                                f(1.0f, 1.0f, 0, textView);
                                float f2 = this.A;
                                f(f2, f2, 4, textView2);
                            } else {
                                g(getIconOrContainer(), this.f31386x, 49);
                                float f10 = this.B;
                                f(f10, f10, 4, textView);
                                f(1.0f, 1.0f, 0, textView2);
                            }
                        }
                    } else {
                        if (z10) {
                            g(getIconOrContainer(), this.f31386x, 49);
                            i(this.f31387y, viewGroup);
                            textView.setVisibility(0);
                        } else {
                            g(getIconOrContainer(), this.f31386x, 17);
                            i(0, viewGroup);
                            textView.setVisibility(4);
                        }
                        textView2.setVisibility(4);
                    }
                } else if (this.D) {
                    if (z10) {
                        g(getIconOrContainer(), this.f31386x, 49);
                        i(this.f31387y, viewGroup);
                        textView.setVisibility(0);
                    } else {
                        g(getIconOrContainer(), this.f31386x, 17);
                        i(0, viewGroup);
                        textView.setVisibility(4);
                    }
                    textView2.setVisibility(4);
                } else {
                    i(this.f31387y, viewGroup);
                    if (z10) {
                        g(getIconOrContainer(), (int) (this.f31386x + this.f31388z), 49);
                        f(1.0f, 1.0f, 0, textView);
                        float f11 = this.A;
                        f(f11, f11, 4, textView2);
                    } else {
                        g(getIconOrContainer(), this.f31386x, 49);
                        float f12 = this.B;
                        f(f12, f12, 4, textView);
                        f(1.0f, 1.0f, 0, textView2);
                    }
                }
                refreshDrawableState();
                setSelected(z10);
            }
        }
        d(f, f);
        i6 = this.C;
        ViewGroup viewGroup2 = this.H;
        if (i6 == -1) {
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        x xVar;
        super.setEnabled(z10);
        this.I.setEnabled(z10);
        this.J.setEnabled(z10);
        this.G.setEnabled(z10);
        if (z10) {
            Context context = getContext();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                xVar = new x(x.a.b(context, 1002));
            } else {
                xVar = new x(null);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (i6 >= 24) {
                d0.k.d(this, xVar.f32388a);
                return;
            }
            return;
        }
        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
        if (Build.VERSION.SDK_INT >= 24) {
            d0.k.d(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.N) {
            return;
        }
        this.N = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = k0.a.g(drawable).mutate();
            this.O = drawable;
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.G.setImageDrawable(drawable);
    }

    public void setIconSize(int i6) {
        ImageView imageView = this.G;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i6;
        layoutParams.height = i6;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.M = colorStateList;
        if (this.L != null && (drawable = this.O) != null) {
            a.b.h(drawable, colorStateList);
            this.O.invalidateSelf();
        }
    }

    public void setItemBackground(int i6) {
        Drawable b10;
        if (i6 == 0) {
            b10 = null;
        } else {
            Context context = getContext();
            Object obj = g0.a.f16164a;
            b10 = a.c.b(context, i6);
        }
        setItemBackground(b10);
    }

    public void setItemPaddingBottom(int i6) {
        if (this.f31387y != i6) {
            this.f31387y = i6;
            androidx.appcompat.view.menu.h hVar = this.L;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i6) {
        if (this.f31386x != i6) {
            this.f31386x = i6;
            androidx.appcompat.view.menu.h hVar = this.L;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i6) {
        this.K = i6;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f31384v = colorStateList;
        b();
    }

    public void setLabelVisibilityMode(int i6) {
        boolean z10;
        if (this.C != i6) {
            this.C = i6;
            if (this.V && i6 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.Q = f31381d0;
            } else {
                this.Q = c0;
            }
            h(getWidth());
            androidx.appcompat.view.menu.h hVar = this.L;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            androidx.appcompat.view.menu.h hVar = this.L;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i6) {
        TextView textView = this.J;
        e(textView, i6);
        a(this.I.getTextSize(), textView.getTextSize());
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i6) {
        TextView textView = this.I;
        e(textView, i6);
        a(textView.getTextSize(), this.J.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.I.setTextColor(colorStateList);
            this.J.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.I.setText(charSequence);
        this.J.setText(charSequence);
        androidx.appcompat.view.menu.h hVar = this.L;
        if (hVar == null || TextUtils.isEmpty(hVar.f1133q)) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.h hVar2 = this.L;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.L.r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            p1.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f31385w = drawable;
        b();
    }
}
