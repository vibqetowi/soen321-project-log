package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s extends l {

    /* renamed from: e  reason: collision with root package name */
    s f21171e;
    s f;

    /* renamed from: g  reason: collision with root package name */
    s f21172g;

    /* renamed from: h  reason: collision with root package name */
    s f21173h;

    /* renamed from: i  reason: collision with root package name */
    boolean f21174i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i6, Object obj, Object obj2, s sVar, s sVar2) {
        super(i6, obj, obj2, sVar);
        this.f21171e = sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i6) {
        return b(i6, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b(int i6, Object obj, Class cls) {
        int d10;
        if (obj != null) {
            s sVar = this;
            do {
                s sVar2 = sVar.f;
                s sVar3 = sVar.f21172g;
                int i10 = sVar.f21152a;
                if (i10 <= i6) {
                    if (i10 >= i6) {
                        Object obj2 = sVar.f21153b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return sVar;
                        }
                        if (sVar2 != null) {
                            if (sVar3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                    s b10 = sVar3.b(i6, obj, cls);
                                    if (b10 != null) {
                                        return b10;
                                    }
                                } else if (d10 >= 0) {
                                    sVar2 = sVar3;
                                }
                            }
                        }
                    }
                    sVar = sVar3;
                    continue;
                }
                sVar = sVar2;
                continue;
            } while (sVar != null);
            return null;
        }
        return null;
    }
}
