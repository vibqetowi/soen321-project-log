package r4;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: BitmapEncoder.java */
/* loaded from: classes.dex */
public final class b implements h4.j<Bitmap> {

    /* renamed from: v  reason: collision with root package name */
    public static final h4.f<Integer> f30386v = h4.f.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: w  reason: collision with root package name */
    public static final h4.f<Bitmap.CompressFormat> f30387w = new h4.f<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, h4.f.f17167e);

    /* renamed from: u  reason: collision with root package name */
    public final l4.b f30388u;

    public b(l4.b bVar) {
        this.f30388u = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0077 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #6 {, blocks: (B:10:0x0028, B:23:0x0056, B:36:0x0071, B:38:0x0077, B:42:0x00ba, B:43:0x00bd, B:33:0x006c), top: B:57:0x0028 }] */
    @Override // h4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj, File file, h4.g gVar) {
        h4.f<Bitmap.CompressFormat> fVar;
        FileOutputStream fileOutputStream;
        boolean z10;
        Bitmap bitmap = (Bitmap) ((k4.v) obj).get();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) gVar.c(f30387w);
        if (compressFormat == null) {
            if (bitmap.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i6 = d5.f.f12193b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) gVar.c(f30386v)).intValue();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                l4.b bVar = this.f30388u;
                if (bVar != null) {
                    try {
                        fileOutputStream2 = new i4.c(fileOutputStream, bVar);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        z10 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    fileOutputStream2 = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, fileOutputStream2);
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                z10 = true;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + d5.j.c(bitmap) + " in " + d5.f.a(elapsedRealtimeNanos) + ", options format: " + gVar.c(fVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z10;
    }

    @Override // h4.j
    public final h4.c v(h4.g gVar) {
        return h4.c.TRANSFORMED;
    }
}
