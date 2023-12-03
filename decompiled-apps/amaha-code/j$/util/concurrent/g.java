package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends l {

    /* renamed from: e  reason: collision with root package name */
    final l[] f21145e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.f21145e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.g) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r0 = ((j$.util.concurrent.g) r0).f21145e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(Object obj, int i6) {
        int length;
        l l2;
        Object obj2;
        l[] lVarArr = this.f21145e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (l2 = ConcurrentHashMap.l(lVarArr, (length - 1) & i6)) != null) {
            while (true) {
                int i10 = l2.f21152a;
                if (i10 != i6 || ((obj2 = l2.f21153b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i10 >= 0) {
                        l2 = l2.f21155d;
                        if (l2 == null) {
                            break loop0;
                        }
                    } else {
                        break;
                    }
                }
            }
            return l2;
        }
        return null;
    }
}
