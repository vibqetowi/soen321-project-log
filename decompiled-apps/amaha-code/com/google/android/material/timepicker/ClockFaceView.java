package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.theinnerhour.b2b.R;
import java.util.Arrays;
import t0.d0;
import u0.h;
import ug.l;
/* loaded from: classes.dex */
class ClockFaceView extends d implements ClockHandView.a {
    public final ClockHandView N;
    public final Rect O;
    public final RectF P;
    public final Rect Q;
    public final SparseArray<TextView> R;
    public final b S;
    public final int[] T;
    public final float[] U;
    public final int V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f9303a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f9304b0;
    public String[] c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f9305d0;
    public final ColorStateList e0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.O = new Rect();
        this.P = new RectF();
        this.Q = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.R = sparseArray;
        this.U = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34126i, R.attr.materialClockStyle, 2132083899);
        Resources resources = getResources();
        ColorStateList a10 = ub.d.a(context, obtainStyledAttributes, 1);
        this.e0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.N = clockHandView;
        this.V = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.T = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f9308w.add(this);
        int defaultColor = g0.a.c(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList a11 = ub.d.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.S = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.c0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i6 = 0; i6 < Math.max(this.c0.length, size); i6++) {
            TextView textView = sparseArray.get(i6);
            if (i6 >= this.c0.length) {
                removeView(textView);
                sparseArray.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i6, textView);
                    addView(textView);
                }
                textView.setText(this.c0[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                int i10 = (i6 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z10 = i10 > 1 ? true : z10;
                d0.q(textView, this.S);
                textView.setTextColor(this.e0);
            }
        }
        ClockHandView clockHandView2 = this.N;
        if (clockHandView2.f9307v && !z10) {
            clockHandView2.G = 1;
        }
        clockHandView2.f9307v = z10;
        clockHandView2.invalidate();
        this.W = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f9303a0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f9304b0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f) {
        if (Math.abs(this.f9305d0 - f) > 0.001f) {
            this.f9305d0 = f;
            m();
        }
    }

    @Override // com.google.android.material.timepicker.d
    public final void l() {
        super.l();
        int i6 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.R;
            if (i6 < sparseArray.size()) {
                sparseArray.get(i6).setVisibility(0);
                i6++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.N.A;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i6 = 0;
        while (true) {
            sparseArray = this.R;
            int size = sparseArray.size();
            rectF = this.P;
            rect = this.O;
            if (i6 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i6++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = sparseArray.get(i10);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.Q);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.T, this.U, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(1, this.c0.length, 1, false).f33747a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f9304b0 / Math.max(Math.max(this.W / displayMetrics.heightPixels, this.f9303a0 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
