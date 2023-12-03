package q8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.f;
/* compiled from: CeaSubtitle.java */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29401u;

    /* renamed from: v  reason: collision with root package name */
    public final List f29402v;

    public /* synthetic */ d(int i6, List list) {
        this.f29401u = i6;
        this.f29402v = list;
    }

    @Override // p8.f
    public final int d(long j10) {
        switch (this.f29401u) {
            case 0:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
            case 1:
            case 2:
                return -1;
            default:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
        }
    }

    @Override // p8.f
    public final long f(int i6) {
        boolean z10 = false;
        switch (this.f29401u) {
            case 0:
                if (i6 == 0) {
                    z10 = true;
                }
                sc.b.q(z10);
                return 0L;
            case 1:
            case 2:
                return 0L;
            default:
                if (i6 == 0) {
                    z10 = true;
                }
                sc.b.q(z10);
                return 0L;
        }
    }

    @Override // p8.f
    public final List h(long j10) {
        int i6 = this.f29401u;
        List list = this.f29402v;
        switch (i6) {
            case 0:
                if (j10 < 0) {
                    return Collections.emptyList();
                }
                return list;
            case 1:
            case 2:
                return list;
            default:
                if (j10 < 0) {
                    return Collections.emptyList();
                }
                return list;
        }
    }

    @Override // p8.f
    public final int i() {
        return 1;
    }

    public d(ArrayList arrayList) {
        this.f29401u = 3;
        this.f29402v = Collections.unmodifiableList(arrayList);
    }
}
