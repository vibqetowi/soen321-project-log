package h3;
/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f17108a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17109b;

    public g(String str, int i6, boolean z10) {
        this.f17108a = i6;
        this.f17109b = z10;
    }

    @Override // h3.b
    public final c3.b a(a3.j jVar, i3.b bVar) {
        if (!jVar.F) {
            m3.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new c3.k(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + defpackage.e.w(this.f17108a) + '}';
    }
}
