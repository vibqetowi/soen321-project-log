package kotlin.jvm.internal;
/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes2.dex */
public final class s extends r {
    public s(ys.f fVar, String str, String str2) {
        super(a.NO_RECEIVER, ((b) fVar).e(), str, str2, !(fVar instanceof ys.d) ? 1 : 0);
    }

    @Override // ys.l
    public final Object get(Object obj) {
        return n().call(obj);
    }
}
