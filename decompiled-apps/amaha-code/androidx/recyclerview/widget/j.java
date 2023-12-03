package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import o0.k;
/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: y  reason: collision with root package name */
    public static final ThreadLocal<j> f2981y = new ThreadLocal<>();

    /* renamed from: z  reason: collision with root package name */
    public static final a f2982z = new a();

    /* renamed from: v  reason: collision with root package name */
    public long f2984v;

    /* renamed from: w  reason: collision with root package name */
    public long f2985w;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<RecyclerView> f2983u = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<c> f2986x = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(c cVar, c cVar2) {
            boolean z10;
            boolean z11;
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f2994d;
            int i6 = 1;
            if (recyclerView == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar4.f2994d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                boolean z12 = cVar3.f2991a;
                if (z12 == cVar4.f2991a) {
                    int i10 = cVar4.f2992b - cVar3.f2992b;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = cVar3.f2993c - cVar4.f2993c;
                    if (i11 == 0) {
                        return 0;
                    }
                    return i11;
                }
            }
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2987a;

        /* renamed from: b  reason: collision with root package name */
        public int f2988b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2989c;

        /* renamed from: d  reason: collision with root package name */
        public int f2990d;

        public final void a(int i6, int i10) {
            if (i6 >= 0) {
                if (i10 >= 0) {
                    int i11 = this.f2990d * 2;
                    int[] iArr = this.f2989c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f2989c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i11 >= iArr.length) {
                        int[] iArr3 = new int[i11 * 2];
                        this.f2989c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f2989c;
                    iArr4[i11] = i6;
                    iArr4[i11 + 1] = i10;
                    this.f2990d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f2990d = 0;
            int[] iArr = this.f2989c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.H;
            if (recyclerView.G != null && mVar != null && mVar.isItemPrefetchEnabled()) {
                if (z10) {
                    if (!recyclerView.f2738y.g()) {
                        mVar.collectInitialPrefetchPositions(recyclerView.G.f(), this);
                    }
                } else {
                    if (!((!recyclerView.P || recyclerView.f2713b0 || recyclerView.f2738y.g()) ? true : true)) {
                        mVar.collectAdjacentPrefetchPositions(this.f2987a, this.f2988b, recyclerView.C0, this);
                    }
                }
                int i6 = this.f2990d;
                if (i6 > mVar.mPrefetchMaxCountObserved) {
                    mVar.mPrefetchMaxCountObserved = i6;
                    mVar.mPrefetchMaxObservedInInitialPrefetch = z10;
                    recyclerView.f2734w.m();
                }
            }
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2991a;

        /* renamed from: b  reason: collision with root package name */
        public int f2992b;

        /* renamed from: c  reason: collision with root package name */
        public int f2993c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2994d;

        /* renamed from: e  reason: collision with root package name */
        public int f2995e;
    }

    public static RecyclerView.c0 c(RecyclerView recyclerView, int i6, long j10) {
        boolean z10;
        int h10 = recyclerView.f2740z.h();
        int i10 = 0;
        while (true) {
            if (i10 < h10) {
                RecyclerView.c0 L = RecyclerView.L(recyclerView.f2740z.g(i10));
                if (L.f2753c == i6 && !L.l()) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f2734w;
        try {
            recyclerView.R();
            RecyclerView.c0 k10 = tVar.k(i6, j10);
            if (k10 != null) {
                if (k10.k() && !k10.l()) {
                    tVar.h(k10.f2751a);
                } else {
                    tVar.a(k10, false);
                }
            }
            return k10;
        } finally {
            recyclerView.S(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i6, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f2984v == 0) {
            this.f2984v = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.B0;
        bVar.f2987a = i6;
        bVar.f2988b = i10;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        ArrayList<RecyclerView> arrayList = this.f2983u;
        int size = arrayList.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = arrayList.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.B0;
                bVar.b(recyclerView3, false);
                i6 += bVar.f2990d;
            }
        }
        ArrayList<c> arrayList2 = this.f2986x;
        arrayList2.ensureCapacity(i6);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.B0;
                int abs = Math.abs(bVar2.f2988b) + Math.abs(bVar2.f2987a);
                for (int i13 = 0; i13 < bVar2.f2990d * 2; i13 += 2) {
                    if (i11 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i11);
                    }
                    int[] iArr = bVar2.f2989c;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f2991a = z10;
                    cVar2.f2992b = abs;
                    cVar2.f2993c = i14;
                    cVar2.f2994d = recyclerView4;
                    cVar2.f2995e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList2, f2982z);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i15)).f2994d) != null; i15++) {
            if (cVar.f2991a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.c0 c10 = c(recyclerView, cVar.f2995e, j11);
            if (c10 != null && c10.f2752b != null && c10.k() && !c10.l() && (recyclerView2 = c10.f2752b.get()) != null) {
                if (recyclerView2.f2713b0 && recyclerView2.f2740z.h() != 0) {
                    RecyclerView.j jVar = recyclerView2.f2720k0;
                    if (jVar != null) {
                        jVar.i();
                    }
                    RecyclerView.m mVar = recyclerView2.H;
                    RecyclerView.t tVar = recyclerView2.f2734w;
                    if (mVar != null) {
                        mVar.removeAndRecycleAllViews(tVar);
                        recyclerView2.H.removeAndRecycleScrapInt(tVar);
                    }
                    tVar.f2797a.clear();
                    tVar.f();
                }
                b bVar3 = recyclerView2.B0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f2990d != 0) {
                    try {
                        int i16 = o0.k.f26897a;
                        k.a.a("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.C0;
                        RecyclerView.e eVar = recyclerView2.G;
                        yVar.f2815d = 1;
                        yVar.f2816e = eVar.f();
                        yVar.f2817g = false;
                        yVar.f2818h = false;
                        yVar.f2819i = false;
                        for (int i17 = 0; i17 < bVar3.f2990d * 2; i17 += 2) {
                            c(recyclerView2, bVar3.f2989c[i17], j10);
                        }
                        k.a.b();
                        cVar.f2991a = false;
                        cVar.f2992b = 0;
                        cVar.f2993c = 0;
                        cVar.f2994d = null;
                        cVar.f2995e = 0;
                    } catch (Throwable th2) {
                        int i18 = o0.k.f26897a;
                        k.a.b();
                        throw th2;
                    }
                }
            }
            cVar.f2991a = false;
            cVar.f2992b = 0;
            cVar.f2993c = 0;
            cVar.f2994d = null;
            cVar.f2995e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i6 = o0.k.f26897a;
            k.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f2983u;
            if (arrayList.isEmpty()) {
                this.f2984v = 0L;
                k.a.b();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f2984v = 0L;
                k.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f2985w);
            this.f2984v = 0L;
            k.a.b();
        } catch (Throwable th2) {
            this.f2984v = 0L;
            int i11 = o0.k.f26897a;
            k.a.b();
            throw th2;
        }
    }
}
