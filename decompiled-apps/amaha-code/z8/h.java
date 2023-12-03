package z8;

import java.util.Arrays;
/* compiled from: TrackSelectionArray.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final g[] f39318a;

    /* renamed from: b  reason: collision with root package name */
    public int f39319b;

    public h(g... gVarArr) {
        this.f39318a = gVarArr;
        int length = gVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return Arrays.equals(this.f39318a, ((h) obj).f39318a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39319b == 0) {
            this.f39319b = 527 + Arrays.hashCode(this.f39318a);
        }
        return this.f39319b;
    }
}
