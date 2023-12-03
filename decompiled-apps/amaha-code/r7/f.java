package r7;

import android.text.TextUtils;
import com.google.android.exoplayer2.n;
/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30541a;

    /* renamed from: b  reason: collision with root package name */
    public final n f30542b;

    /* renamed from: c  reason: collision with root package name */
    public final n f30543c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30544d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30545e;

    public f(String str, n nVar, n nVar2, int i6, int i10) {
        boolean z10;
        if (i6 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.q(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f30541a = str;
            nVar.getClass();
            this.f30542b = nVar;
            nVar2.getClass();
            this.f30543c = nVar2;
            this.f30544d = i6;
            this.f30545e = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f30544d == fVar.f30544d && this.f30545e == fVar.f30545e && this.f30541a.equals(fVar.f30541a) && this.f30542b.equals(fVar.f30542b) && this.f30543c.equals(fVar.f30543c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = pl.a.c(this.f30541a, (((this.f30544d + 527) * 31) + this.f30545e) * 31, 31);
        return this.f30543c.hashCode() + ((this.f30542b.hashCode() + c10) * 31);
    }
}
