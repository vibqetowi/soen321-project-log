package com.theinnerhour.b2b.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import hc.d;
import java.util.ArrayList;
import rr.e;
/* loaded from: classes2.dex */
public class LoadingDots extends LinearLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int[] H;
    public int[] I;
    public int[] J;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f11839u;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f11840v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11841w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11842x;

    /* renamed from: y  reason: collision with root package name */
    public int f11843y;

    /* renamed from: z  reason: collision with root package name */
    public int f11844z;

    public LoadingDots(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        Resources resources = context2.getResources();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, d.J);
        this.f11842x = obtainStyledAttributes.getBoolean(0, true);
        this.f11843y = obtainStyledAttributes.getColor(1, -7829368);
        this.f11844z = obtainStyledAttributes.getInt(2, 3);
        this.A = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.LoadingDots_dots_size_default));
        this.B = obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.LoadingDots_dots_space_default));
        this.C = obtainStyledAttributes.getInt(7, 600);
        this.D = obtainStyledAttributes.getInt(8, 100);
        this.E = obtainStyledAttributes.getInt(5, 400);
        this.F = obtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(R.dimen.LoadingDots_jump_height_default));
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(80);
        a();
        c(context2);
    }

    public final void a() {
        d();
        int i6 = this.C;
        int i10 = this.E;
        int i11 = i6 - (this.D + i10);
        int i12 = this.f11844z;
        int i13 = i11 / (i12 - 1);
        this.G = i10 / 2;
        this.H = new int[i12];
        this.I = new int[i12];
        this.J = new int[i12];
        for (int i14 = 0; i14 < this.f11844z; i14++) {
            int i15 = (i13 * i14) + this.D;
            this.H[i14] = i15;
            this.I[i14] = this.G + i15;
            this.J[i14] = i15 + this.E;
        }
    }

    public final void b() {
        if (this.f11842x && this.f11840v == null) {
            a();
            c(getContext());
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.C);
            this.f11840v = ofInt;
            ofInt.addUpdateListener(new e(this));
            this.f11840v.setDuration(this.C);
            this.f11840v.setRepeatCount(-1);
        }
    }

    public final void c(Context context) {
        d();
        removeAllViews();
        this.f11839u = new ArrayList(this.f11844z);
        int i6 = this.A;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.B, this.A);
        for (int i10 = 0; i10 < this.f11844z; i10++) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.loading_dots_dot);
            ((GradientDrawable) imageView.getDrawable()).setColor(this.f11843y);
            addView(imageView, layoutParams);
            this.f11839u.add(imageView);
            if (i10 < this.f11844z - 1) {
                addView(new View(context), layoutParams2);
            }
        }
    }

    public final void d() {
        if (this.f11840v == null) {
            return;
        }
        throw new IllegalStateException("Can't change properties while animation is running!");
    }

    public boolean getAutoPlay() {
        return this.f11842x;
    }

    public int getDotsColor() {
        return this.f11843y;
    }

    public int getDotsCount() {
        return this.f11844z;
    }

    public int getDotsSize() {
        return this.A;
    }

    public int getDotsSpace() {
        return this.B;
    }

    public int getJumpDuration() {
        return this.E;
    }

    public int getJumpHeight() {
        return this.F;
    }

    public int getLoopDuration() {
        return this.C;
    }

    public int getLoopStartDelay() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11841w = true;
        b();
        if (this.f11840v != null && getVisibility() == 0) {
            this.f11840v.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11841w = false;
        ValueAnimator valueAnimator = this.f11840v;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.F);
    }

    public void setAutoPlay(boolean z10) {
        this.f11842x = z10;
    }

    public void setDotsColor(int i6) {
        d();
        this.f11843y = i6;
    }

    public void setDotsColorRes(int i6) {
        setDotsColor(getContext().getResources().getColor(i6));
    }

    public void setDotsCount(int i6) {
        d();
        this.f11844z = i6;
    }

    public void setDotsSize(int i6) {
        d();
        this.A = i6;
    }

    public void setDotsSizeRes(int i6) {
        setDotsSize(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setDotsSpace(int i6) {
        d();
        this.B = i6;
    }

    public void setDotsSpaceRes(int i6) {
        setDotsSpace(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setJumpDuraiton(int i6) {
        d();
        this.E = i6;
    }

    public void setJumpHeight(int i6) {
        d();
        this.F = i6;
    }

    public void setJumpHeightRes(int i6) {
        setJumpHeight(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setLoopDuration(int i6) {
        d();
        this.C = i6;
    }

    public void setLoopStartDelay(int i6) {
        d();
        this.D = i6;
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        ValueAnimator valueAnimator;
        super.setVisibility(i6);
        if (i6 != 0) {
            if ((i6 == 4 || i6 == 8) && (valueAnimator = this.f11840v) != null) {
                valueAnimator.end();
                return;
            }
            return;
        }
        b();
        if (this.f11841w && !this.f11840v.isRunning()) {
            this.f11840v.start();
        }
    }
}
