package tb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import androidx.core.widget.b;
import com.theinnerhour.b2b.R;
import ub.d;
import ug.l;
/* compiled from: MaterialRadioButton.java */
/* loaded from: classes.dex */
public final class a extends t {
    public static final int[][] A = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f32979y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f32980z;

    public a(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.radioButtonStyle, 2132083832), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d10 = qb.t.d(context2, attributeSet, l.f34140x, R.attr.radioButtonStyle, 2132083832, new int[0]);
        if (d10.hasValue(0)) {
            b.a.c(this, d.a(context2, d10, 0));
        }
        this.f32980z = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f32979y == null) {
            int C0 = f6.b.C0(R.attr.colorControlActivated, this);
            int C02 = f6.b.C0(R.attr.colorOnSurface, this);
            int C03 = f6.b.C0(R.attr.colorSurface, this);
            this.f32979y = new ColorStateList(A, new int[]{f6.b.L0(1.0f, C03, C0), f6.b.L0(0.54f, C03, C02), f6.b.L0(0.38f, C03, C02), f6.b.L0(0.38f, C03, C02)});
        }
        return this.f32979y;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32980z && b.a.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f32980z = z10;
        if (z10) {
            b.a.c(this, getMaterialThemeColorsTintList());
        } else {
            b.a.c(this, null);
        }
    }
}
