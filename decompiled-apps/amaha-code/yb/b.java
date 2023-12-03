package yb;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f38422a;

    /* renamed from: b  reason: collision with root package name */
    public final float f38423b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f38422a;
            f += ((b) cVar).f38423b;
        }
        this.f38422a = cVar;
        this.f38423b = f;
    }

    @Override // yb.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f38422a.a(rectF) + this.f38423b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38422a.equals(bVar.f38422a) && this.f38423b == bVar.f38423b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38422a, Float.valueOf(this.f38423b)});
    }
}
