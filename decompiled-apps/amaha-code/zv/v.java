package zv;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SegmentPool.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final u f39924a = new u(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f39925b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<u>[] f39926c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f39925b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i6 = 0; i6 < highestOneBit; i6++) {
            atomicReferenceArr[i6] = new AtomicReference<>();
        }
        f39926c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        boolean z10;
        int i6;
        boolean z11 = true;
        if (uVar.f == null && uVar.f39923g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (uVar.f39921d) {
                return;
            }
            AtomicReference<u> atomicReference = f39926c[(int) (Thread.currentThread().getId() & (f39925b - 1))];
            u uVar2 = atomicReference.get();
            if (uVar2 == f39924a) {
                return;
            }
            if (uVar2 == null) {
                i6 = 0;
            } else {
                i6 = uVar2.f39920c;
            }
            if (i6 >= 65536) {
                return;
            }
            uVar.f = uVar2;
            uVar.f39919b = 0;
            uVar.f39920c = i6 + 8192;
            while (true) {
                if (!atomicReference.compareAndSet(uVar2, uVar)) {
                    if (atomicReference.get() != uVar2) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z11) {
                uVar.f = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final u b() {
        AtomicReference<u> atomicReference = f39926c[(int) (Thread.currentThread().getId() & (f39925b - 1))];
        u uVar = f39924a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.f39920c = 0;
        return andSet;
    }
}
