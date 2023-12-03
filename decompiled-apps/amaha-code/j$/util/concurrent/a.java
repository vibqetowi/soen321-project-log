package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a extends q {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f21140i;

    /* renamed from: j  reason: collision with root package name */
    l f21141j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(l[] lVarArr, int i6, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i6, 0, i10);
        this.f21140i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f21161b != null;
    }

    public final boolean hasNext() {
        return this.f21161b != null;
    }

    public final void remove() {
        l lVar = this.f21141j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f21141j = null;
        this.f21140i.h(lVar.f21153b, null, null);
    }
}
