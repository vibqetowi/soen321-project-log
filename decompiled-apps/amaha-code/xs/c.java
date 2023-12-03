package xs;

import kotlin.jvm.internal.i;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public c(char c10, char c11) {
        super(c10, c11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.f37989u;
        char c11 = this.f37990v;
        if (i.i(c10, c11) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c cVar = (c) obj;
            if (i.i(cVar.f37989u, cVar.f37990v) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        c cVar2 = (c) obj;
        if (c10 != cVar2.f37989u || c11 != cVar2.f37990v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z10;
        char c10 = this.f37989u;
        char c11 = this.f37990v;
        if (i.i(c10, c11) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f37989u + ".." + this.f37990v;
    }
}
