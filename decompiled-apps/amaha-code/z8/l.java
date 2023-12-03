package z8;

import c9.w;
import com.google.android.exoplayer2.f0;
import o7.v;
import z8.f;
/* compiled from: TrackSelectorResult.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f39350a;

    /* renamed from: b  reason: collision with root package name */
    public final v[] f39351b;

    /* renamed from: c  reason: collision with root package name */
    public final d[] f39352c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f39353d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f39354e;

    public l(v[] vVarArr, d[] dVarArr, f0 f0Var, f.a aVar) {
        this.f39351b = vVarArr;
        this.f39352c = (d[]) dVarArr.clone();
        this.f39353d = f0Var;
        this.f39354e = aVar;
        this.f39350a = vVarArr.length;
    }

    public final boolean a(l lVar, int i6) {
        if (lVar == null || !w.a(this.f39351b[i6], lVar.f39351b[i6]) || !w.a(this.f39352c[i6], lVar.f39352c[i6])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i6) {
        if (this.f39351b[i6] != null) {
            return true;
        }
        return false;
    }
}
