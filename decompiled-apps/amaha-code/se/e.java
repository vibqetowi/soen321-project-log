package se;
/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final j f31482a;

    /* renamed from: b  reason: collision with root package name */
    public final ya.i<g> f31483b;

    public e(j jVar, ya.i<g> iVar) {
        this.f31482a = jVar;
        this.f31483b = iVar;
    }

    @Override // se.i
    public final boolean a(Exception exc) {
        this.f31483b.c(exc);
        return true;
    }

    @Override // se.i
    public final boolean b(ue.a aVar) {
        boolean z10;
        if (aVar.f() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f31482a.b(aVar)) {
            return false;
        }
        String str = aVar.f34028d;
        if (str != null) {
            Long valueOf = Long.valueOf(aVar.f);
            Long valueOf2 = Long.valueOf(aVar.f34030g);
            String str2 = "";
            if (valueOf == null) {
                str2 = "".concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = pl.a.f(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f31483b.b(new a(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }
}
