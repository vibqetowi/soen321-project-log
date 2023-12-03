package o8;

import android.os.Bundle;
import com.google.common.collect.x;
import java.util.Arrays;
/* compiled from: TrackGroup.java */
/* loaded from: classes.dex */
public final class o implements com.google.android.exoplayer2.f {

    /* renamed from: x  reason: collision with root package name */
    public static final p7.e f27301x = new p7.e(17);

    /* renamed from: u  reason: collision with root package name */
    public final int f27302u;

    /* renamed from: v  reason: collision with root package name */
    public final com.google.android.exoplayer2.n[] f27303v;

    /* renamed from: w  reason: collision with root package name */
    public int f27304w;

    public o(com.google.android.exoplayer2.n... nVarArr) {
        boolean z10;
        if (nVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.f27303v = nVarArr;
        this.f27302u = nVarArr.length;
        String str = nVarArr[0].f6652w;
        str = (str == null || str.equals("und")) ? "" : "";
        int i6 = nVarArr[0].f6654y | 16384;
        for (int i10 = 1; i10 < nVarArr.length; i10++) {
            String str2 = nVarArr[i10].f6652w;
            if (!str.equals((str2 == null || str2.equals("und")) ? "" : "")) {
                b(i10, "languages", nVarArr[0].f6652w, nVarArr[i10].f6652w);
                return;
            } else if (i6 != (nVarArr[i10].f6654y | 16384)) {
                b(i10, "role flags", Integer.toBinaryString(nVarArr[0].f6654y), Integer.toBinaryString(nVarArr[i10].f6654y));
                return;
            }
        }
    }

    public static void b(int i6, String str, String str2, String str3) {
        StringBuilder n10 = defpackage.e.n(ri.e.c(str3, ri.e.c(str2, str.length() + 78)), "Different ", str, " combined in one TrackGroup: '", str2);
        n10.append("' (track 0) and '");
        n10.append(str3);
        n10.append("' (track ");
        n10.append(i6);
        n10.append(")");
        ca.a.Q("TrackGroup", "", new IllegalStateException(n10.toString()));
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), c9.a.c(x.c(this.f27303v)));
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f27302u == oVar.f27302u && Arrays.equals(this.f27303v, oVar.f27303v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27304w == 0) {
            this.f27304w = 527 + Arrays.hashCode(this.f27303v);
        }
        return this.f27304w;
    }
}
