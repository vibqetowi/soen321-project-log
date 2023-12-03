package o4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o4.n;
/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f27117b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f27118a;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // o4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new w(rVar.c(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f27118a = nVar;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        return f27117b.contains(uri.getScheme());
    }

    @Override // o4.n
    public final n.a b(Uri uri, int i6, int i10, h4.g gVar) {
        return this.f27118a.b(new f(uri.toString()), i6, i10, gVar);
    }
}
