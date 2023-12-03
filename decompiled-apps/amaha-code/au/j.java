package au;

import gu.h;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public enum j implements h.a {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);
    

    /* renamed from: u  reason: collision with root package name */
    public final int f3750u;

    j(int i6) {
        this.f3750u = i6;
    }

    @Override // gu.h.a
    public final int e() {
        return this.f3750u;
    }
}
