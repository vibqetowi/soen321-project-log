package p4;

import android.content.Context;
import android.net.Uri;
import h4.g;
import j4.a;
import java.io.InputStream;
import o4.n;
import o4.o;
import o4.r;
import r4.v;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes.dex */
public final class d implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27888a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27889a;

        public a(Context context) {
            this.f27889a = context;
        }

        @Override // o4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new d(this.f27889a);
        }
    }

    public d(Context context) {
        this.f27888a = context.getApplicationContext();
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (sc.b.Q(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // o4.n
    public final n.a<InputStream> b(Uri uri, int i6, int i10, g gVar) {
        boolean z10;
        Uri uri2 = uri;
        boolean z11 = true;
        if (i6 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i6 <= 512 && i10 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Long l2 = (Long) gVar.c(v.f30444d);
            if ((l2 == null || l2.longValue() != -1) ? false : false) {
                c5.d dVar = new c5.d(uri2);
                Context context = this.f27888a;
                return new n.a<>(dVar, j4.a.d(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
