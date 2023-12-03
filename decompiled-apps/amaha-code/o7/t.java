package o7;

import com.google.android.exoplayer2.e0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
public final class t extends com.google.android.exoplayer2.a {
    public final int A;
    public final int[] B;
    public final int[] C;
    public final e0[] D;
    public final Object[] E;
    public final HashMap<Object, Integer> F;

    /* renamed from: z  reason: collision with root package name */
    public final int f27252z;

    public t(List list, o8.l lVar) {
        super(lVar);
        int size = list.size();
        this.B = new int[size];
        this.C = new int[size];
        this.D = new e0[size];
        this.E = new Object[size];
        this.F = new HashMap<>();
        Iterator it = list.iterator();
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            this.D[i11] = qVar.b();
            this.C[i11] = i6;
            this.B[i11] = i10;
            i6 += this.D[i11].p();
            i10 += this.D[i11].i();
            this.E[i11] = qVar.a();
            this.F.put(this.E[i11], Integer.valueOf(i11));
            i11++;
        }
        this.f27252z = i6;
        this.A = i10;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int i() {
        return this.A;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int p() {
        return this.f27252z;
    }
}
