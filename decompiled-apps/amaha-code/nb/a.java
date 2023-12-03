package nb;

import android.content.Context;
import android.graphics.Color;
import com.theinnerhour.b2b.R;
import j0.d;
import ub.b;
/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25974a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25975b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25976c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25977d;

    /* renamed from: e  reason: collision with root package name */
    public final float f25978e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int D0 = f6.b.D0(context, R.attr.elevationOverlayColor, 0);
        int D02 = f6.b.D0(context, R.attr.elevationOverlayAccentColor, 0);
        int D03 = f6.b.D0(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f25974a = b10;
        this.f25975b = D0;
        this.f25976c = D02;
        this.f25977d = D03;
        this.f25978e = f2;
    }

    public final int a(float f2, int i6) {
        boolean z10;
        float f10;
        int i10;
        if (this.f25974a) {
            if (d.h(i6, 255) == this.f25977d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                float f11 = this.f25978e;
                if (f11 > 0.0f && f2 > 0.0f) {
                    f10 = Math.min(((((float) Math.log1p(f2 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f10 = 0.0f;
                }
                int alpha = Color.alpha(i6);
                int L0 = f6.b.L0(f10, d.h(i6, 255), this.f25975b);
                if (f10 > 0.0f && (i10 = this.f25976c) != 0) {
                    L0 = d.f(d.h(i10, f), L0);
                }
                return d.h(L0, alpha);
            }
        }
        return i6;
    }
}
