package com.tbuonomo.viewpagerdotsindicator;

import ak.b;
import ak.c;
import ak.d;
import ak.e;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tr.r;
/* compiled from: DotsIndicator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lak/b;", "", "color", "Lhs/k;", "setSelectedPointColor", "value", "F", "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "(I)V", "selectedDotColor", "Lak/b$b;", "getType", "()Lak/b$b;", "type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DotsIndicator extends b {
    public static final /* synthetic */ int H = 0;
    public LinearLayout B;
    public float C;
    public boolean D;
    public float E;
    public int F;
    public final ArgbEvaluator G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.g(context, "context");
        this.G = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.B = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            addView(linearLayout2, -2, -2);
            this.C = 2.5f;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f33561u);
                i.f(obtainStyledAttributes, "context.obtainStyledAttr….styleable.DotsIndicator)");
                setSelectedDotColor(obtainStyledAttributes.getColor(8, -16711681));
                float f = obtainStyledAttributes.getFloat(6, 2.5f);
                this.C = f;
                if (f < 1.0f) {
                    Log.w("DotsIndicator", "The dotsWidthFactor can't be set under 1.0f, please set an higher value");
                    this.C = 1.0f;
                }
                this.D = obtainStyledAttributes.getBoolean(7, false);
                this.E = obtainStyledAttributes.getDimension(3, 0.0f);
                obtainStyledAttributes.recycle();
            }
            if (isInEditMode()) {
                for (int i6 = 0; i6 < 5; i6++) {
                    a(i6);
                }
                d();
                return;
            }
            return;
        }
        i.q("linearLayout");
        throw null;
    }

    @Override // ak.b
    public final void a(int i6) {
        int dotsColor;
        int dotsColor2;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.dot);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            inflate.setLayoutDirection(0);
            int dotsSize = (int) getDotsSize();
            layoutParams2.height = dotsSize;
            layoutParams2.width = dotsSize;
            layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
            c cVar = new c();
            cVar.setCornerRadius(getDotsCornerRadius());
            if (isInEditMode()) {
                if (i6 == 0) {
                    dotsColor2 = this.F;
                } else {
                    dotsColor2 = getDotsColor();
                }
                cVar.setColor(dotsColor2);
            } else {
                b.a pager = getPager();
                i.d(pager);
                if (pager.a() == i6) {
                    dotsColor = this.F;
                } else {
                    dotsColor = getDotsColor();
                }
                cVar.setColor(dotsColor);
            }
            imageView.setBackground(cVar);
            inflate.setOnClickListener(new d(i6, 0, this));
            int i10 = (int) (this.E * 0.8f);
            inflate.setPadding(i10, inflate.getPaddingTop(), i10, inflate.getPaddingBottom());
            int i11 = (int) (this.E * 2);
            inflate.setPadding(inflate.getPaddingLeft(), i11, inflate.getPaddingRight(), i11);
            imageView.setElevation(this.E);
            this.f593u.add(imageView);
            LinearLayout linearLayout = this.B;
            if (linearLayout != null) {
                linearLayout.addView(inflate);
                return;
            } else {
                i.q("linearLayout");
                throw null;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // ak.b
    public final e b() {
        return new e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r4 < r2.a()) goto L12;
     */
    @Override // ak.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i6) {
        c cVar;
        ImageView imageView = this.f593u.get(i6);
        i.f(imageView, "dots[index]");
        ImageView imageView2 = imageView;
        Drawable background = imageView2.getBackground();
        if (background instanceof c) {
            cVar = (c) background;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            b.a pager = getPager();
            i.d(pager);
            if (i6 != pager.a()) {
                if (this.D) {
                    b.a pager2 = getPager();
                    i.d(pager2);
                }
                cVar.setColor(getDotsColor());
            }
            cVar.setColor(this.F);
        }
        imageView2.setBackground(cVar);
        imageView2.invalidate();
    }

    @Override // ak.b
    public final void f() {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            if (linearLayout != null) {
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                ArrayList<ImageView> arrayList = this.f593u;
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            i.q("linearLayout");
            throw null;
        }
        i.q("linearLayout");
        throw null;
    }

    public final int getSelectedDotColor() {
        return this.F;
    }

    @Override // ak.b
    public b.EnumC0012b getType() {
        return b.EnumC0012b.DEFAULT;
    }

    public final void setSelectedDotColor(int i6) {
        this.F = i6;
        e();
    }

    public final void setSelectedPointColor(int i6) {
        setSelectedDotColor(i6);
    }
}
