package ys;

import at.j0;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: KTypeProjection.kt */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final p f38974c = new p(0, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f38975a;

    /* renamed from: b  reason: collision with root package name */
    public final n f38976b;

    /* compiled from: KTypeProjection.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38977a;

        static {
            int[] iArr = new int[v.h.e(3).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38977a = iArr;
        }
    }

    public p(int i6, j0 j0Var) {
        boolean z10;
        boolean z11;
        String str;
        this.f38975a = i6;
        this.f38976b = j0Var;
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j0Var == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z10 == z11)) {
            if (i6 == 0) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + ri.e.m(i6) + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f38975a == pVar.f38975a && kotlin.jvm.internal.i.b(this.f38976b, pVar.f38976b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d10;
        int i6 = 0;
        int i10 = this.f38975a;
        if (i10 == 0) {
            d10 = 0;
        } else {
            d10 = v.h.d(i10);
        }
        int i11 = d10 * 31;
        n nVar = this.f38976b;
        if (nVar != null) {
            i6 = nVar.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        int i6;
        int i10 = this.f38975a;
        if (i10 == 0) {
            i6 = -1;
        } else {
            i6 = a.f38977a[v.h.d(i10)];
        }
        if (i6 != -1) {
            n nVar = this.f38976b;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        return "out " + nVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + nVar;
            }
            return String.valueOf(nVar);
        }
        return "*";
    }
}
