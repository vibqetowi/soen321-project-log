package xr;
/* compiled from: Protocol.java */
/* loaded from: classes2.dex */
public enum j {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f37980u;

    j(String str) {
        this.f37980u = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37980u;
    }
}
