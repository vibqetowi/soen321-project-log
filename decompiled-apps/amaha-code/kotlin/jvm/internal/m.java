package kotlin.jvm.internal;
/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes2.dex */
public final class m extends l {
    public m(ys.d dVar, String str, String str2) {
        super(a.NO_RECEIVER, ((b) dVar).e(), str, str2, !(dVar instanceof ys.d) ? 1 : 0);
    }

    @Override // ys.l
    public final Object get(Object obj) {
        return n().call(obj);
    }
}
