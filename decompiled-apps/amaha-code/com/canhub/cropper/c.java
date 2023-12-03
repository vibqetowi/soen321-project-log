package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: BitmapUtils.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f6078a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public static final RectF f6079b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public static final RectF f6080c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f6081d = new float[6];

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f6082e = new float[6];
    public static int f;

    /* renamed from: g  reason: collision with root package name */
    public static Pair<String, WeakReference<Bitmap>> f6083g;

    /* compiled from: BitmapUtils.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6084a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6085b;

        public a(int i6, Bitmap bitmap) {
            this.f6084a = bitmap;
            this.f6085b = i6;
        }
    }

    /* compiled from: BitmapUtils.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6086a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6087b;

        public b(int i6, Bitmap bitmap) {
            this.f6086a = bitmap;
            this.f6087b = i6;
        }
    }

    public static int a(int i6, int i10) {
        int i11 = 1;
        if (f == 0) {
            int i12 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
                int i13 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i13];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i13, iArr);
                int[] iArr2 = new int[1];
                int i14 = 0;
                for (int i15 = 0; i15 < iArr[0]; i15++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i15], 12332, iArr2);
                    int i16 = iArr2[0];
                    if (i14 < i16) {
                        i14 = i16;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i12 = Math.max(i14, (int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
            } catch (Exception unused) {
            }
            f = i12;
        }
        if (f > 0) {
            while (true) {
                int i17 = i10 / i11;
                int i18 = f;
                if (i17 <= i18 && i6 / i11 <= i18) {
                    break;
                }
                i11 *= 2;
            }
        }
        return i11;
    }

    public static int b(int i6, int i10, int i11, int i12) {
        int i13 = 1;
        if (i10 > i12 || i6 > i11) {
            while ((i10 / 2) / i13 > i12 && (i6 / 2) / i13 > i11) {
                i13 *= 2;
            }
        }
        return i13;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static a d(Context context, Uri uri, float[] fArr, int i6, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, boolean z11, boolean z12) {
        int i16 = 1;
        do {
            try {
                return e(context, uri, fArr, i6, i10, i11, z10, i12, i13, i14, i15, z11, z12, i16);
            } catch (OutOfMemoryError e10) {
                i16 *= 2;
                if (i16 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i16 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
            }
        } while (i16 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i16 + "): " + uri + "\r\n" + e10.getMessage(), e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a e(Context context, Uri uri, float[] fArr, int i6, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, boolean z11, boolean z12, int i16) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i17;
        Bitmap g5;
        a k10;
        Rect n10 = n(fArr, i10, i11, z10, i12, i13);
        int width = i14 > 0 ? i14 : n10.width();
        int height = i15 > 0 ? i15 : n10.height();
        Bitmap bitmap3 = null;
        try {
            k10 = k(context, uri, n10, width, height, i16);
            bitmap = k10.f6084a;
        } catch (Exception unused) {
            bitmap = null;
        }
        try {
            i17 = k10.f6085b;
            bitmap2 = bitmap;
        } catch (Exception unused2) {
            bitmap2 = bitmap;
            i17 = 1;
            if (bitmap2 == null) {
            }
        }
        if (bitmap2 == null) {
            if (i6 > 0 || z11 || z12) {
                try {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(i6);
                    matrix.postScale(z11 ? -1.0f : 1.0f, z12 ? -1.0f : 1.0f);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
                    if (createBitmap != bitmap2) {
                        bitmap2.recycle();
                    }
                    bitmap2 = createBitmap;
                } catch (OutOfMemoryError e10) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    throw e10;
                }
            }
            if (i6 % 90 != 0) {
                bitmap2 = h(bitmap2, fArr, n10, i6, z10, i12, i13);
            }
            return new a(i17, bitmap2);
        }
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int b10 = b(n10.width(), n10.height(), width, height) * i16;
                options.inSampleSize = b10;
                Bitmap i18 = i(context.getContentResolver(), uri, options);
                if (i18 != null) {
                    try {
                        int length = fArr.length;
                        float[] fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i19 = 0; i19 < length; i19++) {
                            fArr2[i19] = fArr2[i19] / options.inSampleSize;
                        }
                        g5 = g(i18, fArr2, i6, z10, i12, i13, 1.0f, z11, z12);
                        if (g5 != i18) {
                            try {
                            } catch (OutOfMemoryError e11) {
                                e = e11;
                                bitmap3 = g5;
                                if (bitmap3 != null) {
                                    bitmap3.recycle();
                                }
                                throw e;
                            }
                        }
                    } finally {
                    }
                } else {
                    g5 = null;
                }
                return new a(b10, g5);
            } catch (Exception e12) {
                throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e12.getMessage(), e12);
            }
        } catch (OutOfMemoryError e13) {
            e = e13;
        }
    }

    public static a f(Bitmap bitmap, float[] fArr, int i6, boolean z10, int i10, int i11, boolean z11, boolean z12) {
        int i12 = 1;
        do {
            try {
                return new a(i12, g(bitmap, fArr, i6, z10, i10, i11, 1.0f / i12, z11, z12));
            } catch (OutOfMemoryError e10) {
                i12 *= 2;
                if (i12 > 8) {
                    throw e10;
                }
            }
        } while (i12 > 8);
        throw e10;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, int i6, boolean z10, int i10, int i11, float f2, boolean z11, boolean z12) {
        float f10;
        float f11 = f2;
        Rect n10 = n(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i10, i11);
        Matrix matrix = new Matrix();
        matrix.setRotate(i6, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        if (z11) {
            f10 = -f11;
        } else {
            f10 = f11;
        }
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f10, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, n10.left, n10.top, n10.width(), n10.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        if (i6 % 90 != 0) {
            return h(createBitmap, fArr, n10, i6, z10, i10, i11);
        }
        return createBitmap;
    }

    public static Bitmap h(Bitmap bitmap, float[] fArr, Rect rect, int i6, boolean z10, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i6 % 90 != 0) {
            double radians = Math.toRadians(i6);
            if (i6 >= 90 && (i6 <= 180 || i6 >= 270)) {
                i12 = rect.right;
            } else {
                i12 = rect.left;
            }
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i17 < fArr.length) {
                    float f2 = fArr[i17];
                    if (f2 >= i12 - 1 && f2 <= i12 + 1) {
                        int i18 = i17 + 1;
                        int abs = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i18]));
                        int abs2 = (int) Math.abs(Math.cos(radians) * (fArr[i18] - rect.top));
                        int abs3 = (int) Math.abs((rect.bottom - fArr[i18]) / Math.cos(radians));
                        i15 = abs2;
                        i14 = abs3;
                        i13 = abs;
                        i16 = (int) Math.abs((fArr[i18] - rect.top) / Math.sin(radians));
                        break;
                    }
                    i17 += 2;
                } else {
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    break;
                }
            }
            rect.set(i13, i15, i16 + i13, i14 + i15);
            if (z10) {
                l(rect, i10, i11);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap i(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, f6078a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    c(inputStream);
                    if (options.inSampleSize > 512) {
                        throw new RuntimeException("Failed to decode image: " + uri);
                    }
                }
            } finally {
                c(inputStream);
            }
        } while (options.inSampleSize > 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    public static a j(p pVar, Uri uri, int i6, int i10) {
        InputStream inputStream;
        try {
            ContentResolver contentResolver = pVar.getContentResolver();
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, f6078a, options);
                    options.inJustDecodeBounds = false;
                    c(inputStream);
                    int i11 = options.outWidth;
                    if (i11 == -1 && options.outHeight == -1) {
                        throw new RuntimeException("File is not a picture");
                    }
                    options.inSampleSize = Math.max(b(i11, options.outHeight, i6, i10), a(options.outWidth, options.outHeight));
                    return new a(options.inSampleSize, i(contentResolver, uri, options));
                } catch (Throwable th2) {
                    th = th2;
                    c(inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Exception e10) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.BitmapRegionDecoder] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.graphics.BitmapRegionDecoder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a k(Context context, Uri uri, Rect rect, int i6, int i10, int i11) {
        Throwable th2;
        ?? r52;
        Exception e10;
        int i12;
        InputStream inputStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i11 * b(rect.width(), rect.height(), i6, i10);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                ?? newInstance = BitmapRegionDecoder.newInstance(openInputStream, false);
                do {
                    try {
                        try {
                            a aVar = new a(options.inSampleSize, newInstance.decodeRegion(rect, options));
                            c(openInputStream);
                            newInstance.recycle();
                            return aVar;
                        } catch (OutOfMemoryError unused) {
                            i12 = options.inSampleSize * 2;
                            options.inSampleSize = i12;
                            if (i12 > 512) {
                                c(openInputStream);
                                if (newInstance != 0) {
                                }
                                return new a(1, null);
                            }
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        inputStream = newInstance;
                        InputStream inputStream2 = inputStream;
                        inputStream = openInputStream;
                        r52 = inputStream2;
                        try {
                            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
                        } catch (Throwable th3) {
                            th2 = th3;
                            c(inputStream);
                            if (r52 != 0) {
                                r52.recycle();
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        inputStream = newInstance;
                        InputStream inputStream3 = inputStream;
                        inputStream = openInputStream;
                        r52 = inputStream3;
                        c(inputStream);
                        if (r52 != 0) {
                        }
                        throw th2;
                    }
                } while (i12 > 512);
                c(openInputStream);
                if (newInstance != 0) {
                    newInstance.recycle();
                }
                return new a(1, null);
            } catch (Exception e12) {
                e10 = e12;
            } catch (Throwable th5) {
                th2 = th5;
            }
        } catch (Exception e13) {
            e10 = e13;
            r52 = 0;
        } catch (Throwable th6) {
            th2 = th6;
            r52 = 0;
        }
    }

    public static void l(Rect rect, int i6, int i10) {
        if (i6 == i10 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float m(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Rect n(float[] fArr, int i6, int i10, boolean z10, int i11, int i12) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, o(fArr))), Math.round(Math.max(0.0f, q(fArr))), Math.round(Math.min(i6, p(fArr))), Math.round(Math.min(i10, m(fArr))));
        if (z10) {
            l(rect, i11, i12);
        }
        return rect;
    }

    public static float o(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Bitmap r(Bitmap bitmap, int i6, int i10, int i11) {
        Bitmap createScaledBitmap;
        if (i6 > 0 && i10 > 0 && (i11 == 4 || i11 == 3 || i11 == 5)) {
            try {
                if (i11 == 5) {
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, i10, false);
                } else {
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float max = Math.max(width / i6, height / i10);
                    if (max <= 1.0f && i11 != 4) {
                        createScaledBitmap = null;
                    }
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                }
                if (createScaledBitmap != null) {
                    if (createScaledBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createScaledBitmap;
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        return bitmap;
    }

    public static void s(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri);
            if (compressFormat == null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i6, openOutputStream);
            } else {
                bitmap.compress(compressFormat, i6, openOutputStream);
            }
            c(openOutputStream);
        } catch (Throwable th2) {
            c(null);
            throw th2;
        }
    }
}
