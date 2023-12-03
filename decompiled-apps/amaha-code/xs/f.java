package xs;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: x  reason: collision with root package name */
    public static final f f38003x = new f(1, 0);

    public f(int i6, int i10) {
        super(i6, i10, 1);
    }

    @Override // xs.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f37996u == fVar.f37996u) {
                    if (this.f37997v == fVar.f37997v) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xs.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f37996u * 31) + this.f37997v;
    }

    @Override // xs.d
    public final boolean isEmpty() {
        if (this.f37996u > this.f37997v) {
            return true;
        }
        return false;
    }

    public final boolean m(int i6) {
        if (this.f37996u <= i6 && i6 <= this.f37997v) {
            return true;
        }
        return false;
    }

    @Override // xs.d
    public final String toString() {
        return this.f37996u + ".." + this.f37997v;
    }
}
