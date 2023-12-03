package u8;

import c9.w;
import java.util.Collections;
import java.util.List;
import p8.f;
/* compiled from: SsaSubtitle.java */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33965u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f33966v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f33967w;

    public /* synthetic */ d(Object obj, int i6, Object obj2) {
        this.f33965u = i6;
        this.f33966v = obj;
        this.f33967w = obj2;
    }

    @Override // p8.f
    public final int d(long j10) {
        int i6;
        int i10 = this.f33965u;
        Object obj = this.f33967w;
        switch (i10) {
            case 0:
                List list = (List) obj;
                Long valueOf = Long.valueOf(j10);
                int i11 = w.f5205a;
                int binarySearch = Collections.binarySearch(list, valueOf);
                if (binarySearch < 0) {
                    i6 = ~binarySearch;
                } else {
                    int size = list.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i6 = binarySearch;
                    } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
                    i6 = binarySearch;
                }
                if (i6 >= list.size()) {
                    return -1;
                }
                return i6;
            default:
                long[] jArr = (long[]) obj;
                int b10 = w.b(jArr, j10, false);
                if (b10 >= jArr.length) {
                    return -1;
                }
                return b10;
        }
    }

    @Override // p8.f
    public final long f(int i6) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int i10 = this.f33965u;
        Object obj = this.f33967w;
        switch (i10) {
            case 0:
                if (i6 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.q(z11);
                List list = (List) obj;
                if (i6 >= list.size()) {
                    z12 = false;
                }
                sc.b.q(z12);
                return ((Long) list.get(i6)).longValue();
            default:
                if (i6 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.q(z10);
                long[] jArr = (long[]) obj;
                if (i6 >= jArr.length) {
                    z12 = false;
                }
                sc.b.q(z12);
                return jArr[i6];
        }
    }

    @Override // p8.f
    public final List h(long j10) {
        p8.a aVar;
        int i6 = this.f33965u;
        Object obj = this.f33966v;
        Object obj2 = this.f33967w;
        switch (i6) {
            case 0:
                int d10 = w.d((List) obj2, Long.valueOf(j10), false);
                if (d10 == -1) {
                    return Collections.emptyList();
                }
                return (List) ((List) obj).get(d10);
            default:
                int f = w.f((long[]) obj2, j10, false);
                if (f != -1 && (aVar = ((p8.a[]) obj)[f]) != p8.a.L) {
                    return Collections.singletonList(aVar);
                }
                return Collections.emptyList();
        }
    }

    @Override // p8.f
    public final int i() {
        int i6 = this.f33965u;
        Object obj = this.f33967w;
        switch (i6) {
            case 0:
                return ((List) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }
}
