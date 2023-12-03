package xs;
/* compiled from: Progressions.kt */
/* loaded from: classes2.dex */
public class d implements Iterable<Integer>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final int f37996u;

    /* renamed from: v  reason: collision with root package name */
    public final int f37997v;

    /* renamed from: w  reason: collision with root package name */
    public final int f37998w;

    public d(int i6, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f37996u = i6;
                this.f37997v = sp.b.F(i6, i10, i11);
                this.f37998w = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f37996u != dVar.f37996u || this.f37997v != dVar.f37997v || this.f37998w != dVar.f37998w) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: g */
    public final e iterator() {
        return new e(this.f37996u, this.f37997v, this.f37998w);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f37996u * 31) + this.f37997v) * 31) + this.f37998w;
    }

    public boolean isEmpty() {
        int i6 = this.f37998w;
        int i10 = this.f37997v;
        int i11 = this.f37996u;
        if (i6 > 0) {
            if (i11 > i10) {
                return true;
            }
        } else if (i11 < i10) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i6 = this.f37997v;
        int i10 = this.f37996u;
        int i11 = this.f37998w;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i6);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i6);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
