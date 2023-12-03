package yb;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: RelativeCornerSize.java */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f38450a;

    public g(float f) {
        this.f38450a = f;
    }

    @Override // yb.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f38450a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f38450a == ((g) obj).f38450a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38450a)});
    }
}
