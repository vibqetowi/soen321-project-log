package x8;

import java.util.Collections;
import java.util.List;
import p8.f;
/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: v  reason: collision with root package name */
    public static final b f37691v = new b();

    /* renamed from: u  reason: collision with root package name */
    public final List<p8.a> f37692u;

    public b(p8.a aVar) {
        this.f37692u = Collections.singletonList(aVar);
    }

    @Override // p8.f
    public final int d(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override // p8.f
    public final long f(int i6) {
        boolean z10;
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        return 0L;
    }

    @Override // p8.f
    public final List<p8.a> h(long j10) {
        if (j10 >= 0) {
            return this.f37692u;
        }
        return Collections.emptyList();
    }

    @Override // p8.f
    public final int i() {
        return 1;
    }

    public b() {
        this.f37692u = Collections.emptyList();
    }
}
