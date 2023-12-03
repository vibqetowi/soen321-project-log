package p4;

import android.net.Uri;
import h4.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o4.n;
import o4.o;
import o4.r;
/* compiled from: HttpUriLoader.java */
/* loaded from: classes.dex */
public final class b implements n<Uri, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f27884b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    public final n<o4.f, InputStream> f27885a;

    /* compiled from: HttpUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // o4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new b(rVar.c(o4.f.class, InputStream.class));
        }
    }

    public b(n<o4.f, InputStream> nVar) {
        this.f27885a = nVar;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        return f27884b.contains(uri.getScheme());
    }

    @Override // o4.n
    public final n.a<InputStream> b(Uri uri, int i6, int i10, g gVar) {
        return this.f27885a.b(new o4.f(uri.toString()), i6, i10, gVar);
    }
}
