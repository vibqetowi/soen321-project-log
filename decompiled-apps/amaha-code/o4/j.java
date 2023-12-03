package o4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import i4.d;
import java.io.File;
import java.io.FileNotFoundException;
import o4.n;
/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27069a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27070a;

        public a(Context context) {
            this.f27070a = context;
        }

        @Override // o4.o
        public final n<Uri, File> b(r rVar) {
            return new j(this.f27070a);
        }
    }

    public j(Context context) {
        this.f27069a = context;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        return sc.b.Q(uri);
    }

    @Override // o4.n
    public final n.a<File> b(Uri uri, int i6, int i10, h4.g gVar) {
        Uri uri2 = uri;
        return new n.a<>(new c5.d(uri2), new b(this.f27069a, uri2));
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements i4.d<File> {

        /* renamed from: w  reason: collision with root package name */
        public static final String[] f27071w = {"_data"};

        /* renamed from: u  reason: collision with root package name */
        public final Context f27072u;

        /* renamed from: v  reason: collision with root package name */
        public final Uri f27073v;

        public b(Context context, Uri uri) {
            this.f27072u = context;
            this.f27073v = uri;
        }

        @Override // i4.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super File> aVar) {
            Cursor query = this.f27072u.getContentResolver().query(this.f27073v, f27071w, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.d(new FileNotFoundException("Failed to find file path for: " + this.f27073v));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // i4.d
        public final h4.a e() {
            return h4.a.LOCAL;
        }

        @Override // i4.d
        public final void b() {
        }

        @Override // i4.d
        public final void cancel() {
        }
    }
}
