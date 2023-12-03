package o8;

import android.os.Bundle;
import com.google.common.collect.x;
import java.util.Arrays;
/* compiled from: TrackGroupArray.java */
/* loaded from: classes.dex */
public final class p implements com.google.android.exoplayer2.f {

    /* renamed from: x  reason: collision with root package name */
    public static final p f27305x = new p(new o[0]);

    /* renamed from: u  reason: collision with root package name */
    public final int f27306u;

    /* renamed from: v  reason: collision with root package name */
    public final o[] f27307v;

    /* renamed from: w  reason: collision with root package name */
    public int f27308w;

    static {
        new p7.e(18);
    }

    public p(o... oVarArr) {
        this.f27307v = oVarArr;
        this.f27306u = oVarArr.length;
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), c9.a.c(x.c(this.f27307v)));
        return bundle;
    }

    public final int b(o oVar) {
        for (int i6 = 0; i6 < this.f27306u; i6++) {
            if (this.f27307v[i6] == oVar) {
                return i6;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f27306u == pVar.f27306u && Arrays.equals(this.f27307v, pVar.f27307v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27308w == 0) {
            this.f27308w = Arrays.hashCode(this.f27307v);
        }
        return this.f27308w;
    }
}
