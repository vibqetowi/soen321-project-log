package au;

import gu.h;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public enum w implements h.a {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);
    

    /* renamed from: u  reason: collision with root package name */
    public final int f3898u;

    w(int i6) {
        this.f3898u = i6;
    }

    @Override // gu.h.a
    public final int e() {
        return this.f3898u;
    }
}
