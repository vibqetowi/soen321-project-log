package j4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import i4.d;
import i4.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: u  reason: collision with root package name */
    public final Uri f21660u;

    /* renamed from: v  reason: collision with root package name */
    public final c f21661v;

    /* renamed from: w  reason: collision with root package name */
    public InputStream f21662w;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: j4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0321a implements j4.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f21663b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f21664a;

        public C0321a(ContentResolver contentResolver) {
            this.f21664a = contentResolver;
        }

        @Override // j4.b
        public final Cursor a(Uri uri) {
            return this.f21664a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f21663b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    public static class b implements j4.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f21665b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f21666a;

        public b(ContentResolver contentResolver) {
            this.f21666a = contentResolver;
        }

        @Override // j4.b
        public final Cursor a(Uri uri) {
            return this.f21666a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f21665b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f21660u = uri;
        this.f21661v = cVar;
    }

    public static a d(Context context, Uri uri, j4.b bVar) {
        return new a(uri, new c(Glide.b(context).f5927x.f(), bVar, Glide.b(context).f5928y, context.getContentResolver()));
    }

    @Override // i4.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // i4.d
    public final void b() {
        InputStream inputStream = this.f21662w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // i4.d
    public final void c(com.bumptech.glide.d dVar, d.a<? super InputStream> aVar) {
        try {
            InputStream f = f();
            this.f21662w = f;
            aVar.f(f);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.d(e10);
        }
    }

    @Override // i4.d
    public final h4.a e() {
        return h4.a.LOCAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.lang.NullPointerException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream f() {
        SecurityException e10;
        Cursor cursor;
        ?? r72;
        InputStream openInputStream;
        int i6;
        Uri uri = this.f21660u;
        c cVar = this.f21661v;
        cVar.getClass();
        ?? r52 = 0;
        InputStream inputStream = null;
        boolean z10 = false;
        try {
            try {
                cursor = cVar.f21667a.a(uri);
            } catch (Throwable th2) {
                th = th2;
                r52 = r72;
                if (r52 != 0) {
                    r52.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e10 = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r52 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e12) {
                e10 = e12;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e10);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        z10 = true;
                    }
                    if (z10) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            openInputStream = cVar.f21669c.openInputStream(fromFile);
                            if (openInputStream != null) {
                                cVar.getClass();
                                try {
                                    try {
                                        inputStream = cVar.f21669c.openInputStream(uri);
                                        i6 = com.bumptech.glide.load.a.a(cVar.f21668b, inputStream, cVar.f21670d);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        if (0 != 0) {
                                            try {
                                                r52.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th4;
                                    }
                                } catch (IOException | NullPointerException e13) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e13);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                                if (i6 != -1) {
                                    return new g(openInputStream, i6);
                                }
                                return openInputStream;
                            }
                            i6 = -1;
                            if (i6 != -1) {
                            }
                        } catch (NullPointerException e14) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e14));
                        }
                    }
                }
                openInputStream = null;
                if (openInputStream != null) {
                }
                i6 = -1;
                if (i6 != -1) {
                }
            }
        }
    }

    @Override // i4.d
    public final void cancel() {
    }
}
