package p4;

import h4.g;
import java.io.InputStream;
import java.net.URL;
import o4.n;
import o4.o;
import o4.r;
/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public final class f implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<o4.f, InputStream> f27902a;

    /* compiled from: UrlLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // o4.o
        public final n<URL, InputStream> b(r rVar) {
            return new f(rVar.c(o4.f.class, InputStream.class));
        }
    }

    public f(n<o4.f, InputStream> nVar) {
        this.f27902a = nVar;
    }

    @Override // o4.n
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // o4.n
    public final n.a<InputStream> b(URL url, int i6, int i10, g gVar) {
        return this.f27902a.b(new o4.f(url), i6, i10, gVar);
    }
}
