package dw;
/* compiled from: ParameterHandler.java */
/* loaded from: classes2.dex */
public final class t extends v<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f13603a;

    public t(v vVar) {
        this.f13603a = vVar;
    }

    @Override // dw.v
    public final void a(x xVar, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 != null) {
            for (Object obj : iterable2) {
                this.f13603a.a(xVar, obj);
            }
        }
    }
}
