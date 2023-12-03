package p4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import h4.g;
import i4.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o4.n;
import o4.o;
import o4.r;
/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class e<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27890a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f27891b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f27892c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f27893d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27894a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f27895b;

        public a(Context context, Class<DataT> cls) {
            this.f27894a = context;
            this.f27895b = cls;
        }

        @Override // o4.o
        public final n<Uri, DataT> b(r rVar) {
            Class<DataT> cls = this.f27895b;
            return new e(this.f27894a, rVar.c(File.class, cls), rVar.c(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements i4.d<DataT> {
        public static final String[] E = {"_data"};
        public final g A;
        public final Class<DataT> B;
        public volatile boolean C;
        public volatile i4.d<DataT> D;

        /* renamed from: u  reason: collision with root package name */
        public final Context f27896u;

        /* renamed from: v  reason: collision with root package name */
        public final n<File, DataT> f27897v;

        /* renamed from: w  reason: collision with root package name */
        public final n<Uri, DataT> f27898w;

        /* renamed from: x  reason: collision with root package name */
        public final Uri f27899x;

        /* renamed from: y  reason: collision with root package name */
        public final int f27900y;

        /* renamed from: z  reason: collision with root package name */
        public final int f27901z;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i6, int i10, g gVar, Class<DataT> cls) {
            this.f27896u = context.getApplicationContext();
            this.f27897v = nVar;
            this.f27898w = nVar2;
            this.f27899x = uri;
            this.f27900y = i6;
            this.f27901z = i10;
            this.A = gVar;
            this.B = cls;
        }

        @Override // i4.d
        public final Class<DataT> a() {
            return this.B;
        }

        @Override // i4.d
        public final void b() {
            i4.d<DataT> dVar = this.D;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super DataT> aVar) {
            try {
                i4.d<DataT> d10 = d();
                if (d10 == null) {
                    aVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f27899x));
                    return;
                }
                this.D = d10;
                if (this.C) {
                    cancel();
                } else {
                    d10.c(dVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.d(e10);
            }
        }

        @Override // i4.d
        public final void cancel() {
            this.C = true;
            i4.d<DataT> dVar = this.D;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final i4.d<DataT> d() {
            boolean isExternalStorageLegacy;
            int checkSelfPermission;
            boolean z10;
            n.a<DataT> b10;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            g gVar = this.A;
            int i6 = this.f27901z;
            int i10 = this.f27900y;
            Context context = this.f27896u;
            if (!isExternalStorageLegacy) {
                checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                if (checkSelfPermission == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Uri uri = this.f27899x;
                if (z10) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                b10 = this.f27898w.b(uri, i10, i6, gVar);
            } else {
                Uri uri2 = this.f27899x;
                try {
                    Cursor query = context.getContentResolver().query(uri2, E, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b10 = this.f27897v.b(file, i10, i6, gVar);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri2);
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (b10 == null) {
                return null;
            }
            return b10.f27081c;
        }

        @Override // i4.d
        public final h4.a e() {
            return h4.a.LOCAL;
        }
    }

    public e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f27890a = context.getApplicationContext();
        this.f27891b = nVar;
        this.f27892c = nVar2;
        this.f27893d = cls;
    }

    @Override // o4.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && sc.b.Q(uri2)) {
            return true;
        }
        return false;
    }

    @Override // o4.n
    public final n.a b(Uri uri, int i6, int i10, g gVar) {
        Uri uri2 = uri;
        return new n.a(new c5.d(uri2), new d(this.f27890a, this.f27891b, this.f27892c, uri2, i6, i10, gVar, this.f27893d));
    }
}
