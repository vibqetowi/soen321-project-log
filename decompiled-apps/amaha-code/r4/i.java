package r4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import r4.h;
/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class i {
    public static final h4.f<h4.b> f = h4.f.a(h4.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final h4.f<h4.h> f30402g = h4.f.a(h4.h.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final h4.f<Boolean> f30403h;

    /* renamed from: i  reason: collision with root package name */
    public static final h4.f<Boolean> f30404i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f30405j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f30406k;

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f30407l;

    /* renamed from: a  reason: collision with root package name */
    public final l4.d f30408a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f30409b;

    /* renamed from: c  reason: collision with root package name */
    public final l4.b f30410c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f30411d;

    /* renamed from: e  reason: collision with root package name */
    public final n f30412e;

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap, l4.d dVar);

        void b();
    }

    static {
        h.e eVar = h.f30396a;
        Boolean bool = Boolean.FALSE;
        f30403h = h4.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f30404i = h4.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f30405j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f30406k = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = d5.j.f12201a;
        f30407l = new ArrayDeque(0);
    }

    public i(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, l4.d dVar, l4.b bVar) {
        if (n.f30417g == null) {
            synchronized (n.class) {
                if (n.f30417g == null) {
                    n.f30417g = new n();
                }
            }
        }
        this.f30412e = n.f30417g;
        this.f30411d = list;
        kc.f.p(displayMetrics);
        this.f30409b = displayMetrics;
        kc.f.p(dVar);
        this.f30408a = dVar;
        kc.f.p(bVar);
        this.f30410c = bVar;
    }

    public static Bitmap c(o oVar, BitmapFactory.Options options, b bVar, l4.d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            oVar.c();
        }
        int i6 = options.outWidth;
        int i10 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = s.f30442b;
        lock.lock();
        try {
            try {
                Bitmap b10 = oVar.b(options);
                lock.unlock();
                return b10;
            } catch (IllegalArgumentException e10) {
                IOException e11 = e(e10, i6, i10, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", e11);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        dVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c10 = c(oVar, options, bVar, dVar);
                        s.f30442b.unlock();
                        return c10;
                    } catch (IOException unused) {
                        throw e11;
                    }
                }
                throw e11;
            }
        } catch (Throwable th2) {
            s.f30442b.unlock();
            throw th2;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i6, int i10, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i6 + ", outHeight: " + i10 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f30407l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(o oVar, int i6, int i10, h4.g gVar, b bVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.f30410c.c(65536, byte[].class);
        synchronized (i.class) {
            ArrayDeque arrayDeque = f30407l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        h4.b bVar2 = (h4.b) gVar.c(f);
        h4.h hVar = (h4.h) gVar.c(f30402g);
        h hVar2 = (h) gVar.c(h.f);
        boolean booleanValue = ((Boolean) gVar.c(f30403h)).booleanValue();
        h4.f<Boolean> fVar = f30404i;
        if (gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            return c.c(b(oVar, options2, hVar2, bVar2, hVar, z10, i6, i10, booleanValue, bVar), this.f30408a);
        } finally {
            f(options2);
            this.f30410c.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(o oVar, BitmapFactory.Options options, h hVar, h4.b bVar, h4.h hVar2, boolean z10, int i6, int i10, boolean z11, b bVar2) {
        long j10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        String str;
        l4.d dVar;
        String str2;
        int i14;
        int i15;
        String str3;
        int i16;
        String str4;
        String str5;
        boolean z13;
        int i17;
        int i18;
        int round;
        int i19;
        l4.d dVar2;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap c10;
        boolean z14;
        boolean z15;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i20;
        int i21;
        int min;
        int i22;
        l4.d dVar3;
        int floor;
        double floor2;
        int i23;
        int i24;
        int i25;
        int i26;
        int round2;
        int round3;
        int round4;
        int i27;
        int i28 = d5.f.f12193b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        l4.d dVar4 = this.f30408a;
        c(oVar, options, bVar2, dVar4);
        options.inJustDecodeBounds = false;
        int i29 = options.outWidth;
        int i30 = options.outHeight;
        String str6 = options.outMimeType;
        boolean z16 = (i29 == -1 || i30 == -1) ? false : z10;
        int a10 = oVar.a();
        switch (a10) {
            case 3:
            case 4:
                j10 = elapsedRealtimeNanos;
                i11 = SubsamplingScaleImageView.ORIENTATION_180;
                break;
            case 5:
            case 6:
                j10 = elapsedRealtimeNanos;
                i11 = 90;
                break;
            case 7:
            case 8:
                j10 = elapsedRealtimeNanos;
                i11 = SubsamplingScaleImageView.ORIENTATION_270;
                break;
            default:
                j10 = elapsedRealtimeNanos;
                i11 = 0;
                break;
        }
        switch (a10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        if (i6 == Integer.MIN_VALUE) {
            i12 = i11 == 90 || i11 == 270 ? i30 : i29;
        } else {
            i12 = i6;
        }
        if (i10 == Integer.MIN_VALUE) {
            i13 = i11 == 90 || i11 == 270 ? i29 : i30;
        } else {
            i13 = i10;
        }
        ImageHeaderParser.ImageType d10 = oVar.d();
        boolean z17 = z12;
        boolean z18 = z16;
        if (i29 > 0 && i30 > 0) {
            if (i11 == 90 || i11 == 270) {
                i21 = i29;
                i20 = i30;
            } else {
                i20 = i29;
                i21 = i30;
            }
            float b10 = hVar.b(i20, i21, i12, i13);
            if (b10 > 0.0f) {
                int i31 = i11;
                int a11 = hVar.a(i20, i21, i12, i13);
                if (a11 != 0) {
                    float f2 = i20;
                    float f10 = i21;
                    int i32 = i12;
                    int i33 = i20 / ((int) ((b10 * f2) + 0.5d));
                    int i34 = i21 / ((int) ((b10 * f10) + 0.5d));
                    if (a11 == 1) {
                        min = Math.max(i33, i34);
                    } else {
                        min = Math.min(i33, i34);
                    }
                    int i35 = Build.VERSION.SDK_INT;
                    if (i35 > 23 || !f30405j.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        i22 = (a11 != 1 || ((float) max) >= 1.0f / b10) ? max : max << 1;
                    } else {
                        i22 = 1;
                    }
                    options.inSampleSize = i22;
                    if (d10 == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i22, 8);
                        int ceil = (int) Math.ceil(f2 / min2);
                        int ceil2 = (int) Math.ceil(f10 / min2);
                        int i36 = i22 / 8;
                        if (i36 > 0) {
                            ceil /= i36;
                            ceil2 /= i36;
                        }
                        i23 = ceil;
                        i24 = ceil2;
                    } else {
                        if (d10 != ImageHeaderParser.ImageType.PNG && d10 != ImageHeaderParser.ImageType.PNG_A) {
                            if (d10 == ImageHeaderParser.ImageType.WEBP || d10 == ImageHeaderParser.ImageType.WEBP_A) {
                                dVar3 = dVar4;
                                if (i35 >= 24) {
                                    float f11 = i22;
                                    i23 = Math.round(f2 / f11);
                                    i24 = Math.round(f10 / f11);
                                    i16 = i32;
                                    int i37 = i23;
                                    i26 = i24;
                                    i25 = i37;
                                    double b11 = hVar.b(i25, i26, i16, i13);
                                    int i38 = (b11 > 1.0d ? 1 : (b11 == 1.0d ? 0 : -1));
                                    dVar = dVar3;
                                    int i39 = i22;
                                    options.inTargetDensity = (int) (((b11 / (round3 / round2)) * ((int) ((((int) Math.round((i38 > 0 ? b11 : 1.0d / b11) * 2.147483647E9d)) * b11) + 0.5d))) + 0.5d);
                                    round4 = (int) Math.round((i38 > 0 ? b11 : 1.0d / b11) * 2.147483647E9d);
                                    options.inDensity = round4;
                                    i27 = options.inTargetDensity;
                                    if (!(i27 <= 0 && round4 > 0 && i27 != round4)) {
                                        options.inScaled = true;
                                    } else {
                                        options.inTargetDensity = 0;
                                        options.inDensity = 0;
                                    }
                                    str2 = "Downsampler";
                                    if (Log.isLoggable(str2, 2)) {
                                        str = ", density: ";
                                        str3 = ", target density: ";
                                        i15 = i30;
                                        str4 = "x";
                                        i14 = i29;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("Calculate scaling, source: [");
                                        i14 = i29;
                                        sb2.append(i14);
                                        str4 = "x";
                                        sb2.append(str4);
                                        i15 = i30;
                                        sb2.append(i15);
                                        sb2.append("], degreesToRotate: ");
                                        sb2.append(i31);
                                        sb2.append(", target: [");
                                        sb2.append(i16);
                                        sb2.append(str4);
                                        sb2.append(i13);
                                        sb2.append("], power of two scaled: [");
                                        sb2.append(i25);
                                        sb2.append(str4);
                                        sb2.append(i26);
                                        sb2.append("], exact scale factor: ");
                                        sb2.append(b10);
                                        sb2.append(", power of 2 sample size: ");
                                        sb2.append(i39);
                                        sb2.append(", adjusted scale factor: ");
                                        sb2.append(b11);
                                        str3 = ", target density: ";
                                        sb2.append(str3);
                                        sb2.append(options.inTargetDensity);
                                        str = ", density: ";
                                        sb2.append(str);
                                        sb2.append(options.inDensity);
                                        Log.v(str2, sb2.toString());
                                    }
                                } else {
                                    float f12 = i22;
                                    floor = (int) Math.floor(f2 / f12);
                                    floor2 = Math.floor(f10 / f12);
                                }
                            } else if (i20 % i22 == 0 && i21 % i22 == 0) {
                                i24 = i21 / i22;
                                i23 = i20 / i22;
                            } else {
                                options.inJustDecodeBounds = true;
                                dVar3 = dVar4;
                                c(oVar, options, bVar2, dVar3);
                                options.inJustDecodeBounds = false;
                                i25 = options.outWidth;
                                i26 = options.outHeight;
                                i16 = i32;
                                double b112 = hVar.b(i25, i26, i16, i13);
                                int i382 = (b112 > 1.0d ? 1 : (b112 == 1.0d ? 0 : -1));
                                dVar = dVar3;
                                int i392 = i22;
                                options.inTargetDensity = (int) (((b112 / (round3 / round2)) * ((int) ((((int) Math.round((i382 > 0 ? b112 : 1.0d / b112) * 2.147483647E9d)) * b112) + 0.5d))) + 0.5d);
                                round4 = (int) Math.round((i382 > 0 ? b112 : 1.0d / b112) * 2.147483647E9d);
                                options.inDensity = round4;
                                i27 = options.inTargetDensity;
                                if (!(i27 <= 0 && round4 > 0 && i27 != round4)) {
                                }
                                str2 = "Downsampler";
                                if (Log.isLoggable(str2, 2)) {
                                }
                            }
                        } else {
                            dVar3 = dVar4;
                            float f13 = i22;
                            floor = (int) Math.floor(f2 / f13);
                            floor2 = Math.floor(f10 / f13);
                        }
                        i23 = floor;
                        i24 = (int) floor2;
                        i16 = i32;
                        int i372 = i23;
                        i26 = i24;
                        i25 = i372;
                        double b1122 = hVar.b(i25, i26, i16, i13);
                        int i3822 = (b1122 > 1.0d ? 1 : (b1122 == 1.0d ? 0 : -1));
                        dVar = dVar3;
                        int i3922 = i22;
                        options.inTargetDensity = (int) (((b1122 / (round3 / round2)) * ((int) ((((int) Math.round((i3822 > 0 ? b1122 : 1.0d / b1122) * 2.147483647E9d)) * b1122) + 0.5d))) + 0.5d);
                        round4 = (int) Math.round((i3822 > 0 ? b1122 : 1.0d / b1122) * 2.147483647E9d);
                        options.inDensity = round4;
                        i27 = options.inTargetDensity;
                        if (!(i27 <= 0 && round4 > 0 && i27 != round4)) {
                        }
                        str2 = "Downsampler";
                        if (Log.isLoggable(str2, 2)) {
                        }
                    }
                    dVar3 = dVar4;
                    i16 = i32;
                    int i3722 = i23;
                    i26 = i24;
                    i25 = i3722;
                    double b11222 = hVar.b(i25, i26, i16, i13);
                    int i38222 = (b11222 > 1.0d ? 1 : (b11222 == 1.0d ? 0 : -1));
                    dVar = dVar3;
                    int i39222 = i22;
                    options.inTargetDensity = (int) (((b11222 / (round3 / round2)) * ((int) ((((int) Math.round((i38222 > 0 ? b11222 : 1.0d / b11222) * 2.147483647E9d)) * b11222) + 0.5d))) + 0.5d);
                    round4 = (int) Math.round((i38222 > 0 ? b11222 : 1.0d / b11222) * 2.147483647E9d);
                    options.inDensity = round4;
                    i27 = options.inTargetDensity;
                    if (!(i27 <= 0 && round4 > 0 && i27 != round4)) {
                    }
                    str2 = "Downsampler";
                    if (Log.isLoggable(str2, 2)) {
                    }
                } else {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
            } else {
                throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + hVar + ", source: [" + i29 + "x" + i30 + "], target: [" + i12 + "x" + i13 + "]");
            }
        } else {
            str = ", density: ";
            dVar = dVar4;
            str2 = "Downsampler";
            i14 = i29;
            i15 = i30;
            str3 = ", target density: ";
            i16 = i12;
            str4 = "x";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Unable to determine dimensions for: " + d10 + " with target [" + i16 + str4 + i13 + "]");
            }
        }
        boolean a12 = this.f30412e.a(i16, i13, z18, z17);
        if (a12) {
            config3 = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config3;
            options.inMutable = false;
        }
        if (!a12) {
            str5 = str;
            if (bVar != h4.b.PREFER_ARGB_8888) {
                try {
                    z13 = oVar.d().hasAlpha();
                } catch (IOException e10) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                    }
                    z13 = false;
                }
                Bitmap.Config config4 = z13 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config4;
                if (config4 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i17 = Build.VERSION.SDK_INT;
            i18 = options.inSampleSize;
            if (i14 >= 0 || i15 < 0 || !z11) {
                int i40 = options.inTargetDensity;
                float f14 = !(i40 <= 0 && (i19 = options.inDensity) > 0 && i40 != i19) ? i40 / options.inDensity : 1.0f;
                float f15 = i18;
                round = Math.round(((int) Math.ceil(i14 / f15)) * f14);
                int round5 = Math.round(((int) Math.ceil(i15 / f15)) * f14);
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + round + str4 + round5 + "] for source [" + i14 + str4 + i15 + "], sampleSize: " + i18 + ", targetDensity: " + options.inTargetDensity + str5 + options.inDensity + ", density multiplier: " + f14);
                }
                i13 = round5;
            } else {
                round = i16;
            }
            Bitmap bitmap = null;
            if (round > 0 && i13 > 0) {
                if (i17 < 26) {
                    Bitmap.Config config5 = options.inPreferredConfig;
                    config2 = Bitmap.Config.HARDWARE;
                    if (config5 != config2) {
                        config = options.outConfig;
                    }
                } else {
                    config = null;
                }
                if (config == null) {
                    config = options.inPreferredConfig;
                }
                dVar2 = dVar;
                options.inBitmap = dVar2.c(round, i13, config);
                if (i17 < 28) {
                    if (hVar2 == h4.h.DISPLAY_P3) {
                        colorSpace3 = options.outColorSpace;
                        if (colorSpace3 != null) {
                            colorSpace4 = options.outColorSpace;
                            isWideGamut = colorSpace4.isWideGamut();
                            if (isWideGamut) {
                                z15 = true;
                                colorSpace2 = ColorSpace.get(!z15 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                options.inPreferredColorSpace = colorSpace2;
                            }
                        }
                    }
                    z15 = false;
                    colorSpace2 = ColorSpace.get(!z15 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    options.inPreferredColorSpace = colorSpace2;
                } else if (i17 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    options.inPreferredColorSpace = colorSpace;
                }
                c10 = c(oVar, options, bVar2, dVar2);
                bVar2.a(c10, dVar2);
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Decoded " + d(c10) + " from [" + i14 + str4 + i15 + "] " + str6 + " with inBitmap " + d(options.inBitmap) + " for [" + i6 + str4 + i10 + "], sample size: " + options.inSampleSize + str5 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + d5.f.a(j10));
                }
                if (c10 != null) {
                    c10.setDensity(this.f30409b.densityDpi);
                    switch (a10) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z14 = true;
                            break;
                        default:
                            z14 = false;
                            break;
                    }
                    if (z14) {
                        Matrix matrix = new Matrix();
                        switch (a10) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, c10.getWidth(), c10.getHeight());
                        matrix.mapRect(rectF);
                        Bitmap e11 = dVar2.e(Math.round(rectF.width()), Math.round(rectF.height()), c10.getConfig() != null ? c10.getConfig() : Bitmap.Config.ARGB_8888);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        e11.setHasAlpha(c10.hasAlpha());
                        s.a(c10, e11, matrix);
                        bitmap = e11;
                    } else {
                        bitmap = c10;
                    }
                    if (!c10.equals(bitmap)) {
                        dVar2.d(c10);
                    }
                }
                return bitmap;
            }
            dVar2 = dVar;
            if (i17 < 28) {
            }
            c10 = c(oVar, options, bVar2, dVar2);
            bVar2.a(c10, dVar2);
            if (Log.isLoggable(str2, 2)) {
            }
            if (c10 != null) {
            }
            return bitmap;
        }
        str5 = str;
        i17 = Build.VERSION.SDK_INT;
        i18 = options.inSampleSize;
        if (i14 >= 0) {
        }
        int i402 = options.inTargetDensity;
        if (!(i402 <= 0 && (i19 = options.inDensity) > 0 && i402 != i19)) {
        }
        float f152 = i18;
        round = Math.round(((int) Math.ceil(i14 / f152)) * f14);
        int round52 = Math.round(((int) Math.ceil(i15 / f152)) * f14);
        if (Log.isLoggable(str2, 2)) {
        }
        i13 = round52;
        Bitmap bitmap2 = null;
        if (round > 0) {
            if (i17 < 26) {
            }
            if (config == null) {
            }
            dVar2 = dVar;
            options.inBitmap = dVar2.c(round, i13, config);
            if (i17 < 28) {
            }
            c10 = c(oVar, options, bVar2, dVar2);
            bVar2.a(c10, dVar2);
            if (Log.isLoggable(str2, 2)) {
            }
            if (c10 != null) {
            }
            return bitmap2;
        }
        dVar2 = dVar;
        if (i17 < 28) {
        }
        c10 = c(oVar, options, bVar2, dVar2);
        bVar2.a(c10, dVar2);
        if (Log.isLoggable(str2, 2)) {
        }
        if (c10 != null) {
        }
        return bitmap2;
    }

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public class a implements b {
        @Override // r4.i.b
        public final void b() {
        }

        @Override // r4.i.b
        public final void a(Bitmap bitmap, l4.d dVar) {
        }
    }
}
