package r4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
/* compiled from: RoundedCorners.java */
/* loaded from: classes.dex */
public final class q extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f30435c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(h4.e.f17166a);

    /* renamed from: b  reason: collision with root package name */
    public final int f30436b;

    public q(int i6) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kc.f.n("roundingRadius must be greater than 0.", z10);
        this.f30436b = i6;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f30435c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f30436b).array());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    @Override // r4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(l4.d dVar, Bitmap bitmap, int i6, int i10) {
        boolean z10;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap e10;
        Lock lock;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Paint paint = s.f30441a;
        int i11 = this.f30436b;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kc.f.n("roundingRadius must be greater than 0.", z10);
        int i12 = Build.VERSION.SDK_INT;
        try {
            if (i12 >= 26) {
                config4 = Bitmap.Config.RGBA_F16;
                if (config4.equals(bitmap.getConfig())) {
                    config = Bitmap.Config.RGBA_F16;
                    if (i12 >= 26) {
                        config3 = Bitmap.Config.RGBA_F16;
                        if (config3.equals(bitmap.getConfig())) {
                            config2 = Bitmap.Config.RGBA_F16;
                            if (config2.equals(bitmap.getConfig())) {
                                e10 = bitmap;
                            } else {
                                e10 = dVar.e(bitmap.getWidth(), bitmap.getHeight(), config2);
                                new Canvas(e10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            }
                            Bitmap e11 = dVar.e(e10.getWidth(), e10.getHeight(), config);
                            e11.setHasAlpha(true);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(e10, tileMode, tileMode);
                            Paint paint2 = new Paint();
                            paint2.setAntiAlias(true);
                            paint2.setShader(bitmapShader);
                            RectF rectF = new RectF(0.0f, 0.0f, e11.getWidth(), e11.getHeight());
                            lock = s.f30442b;
                            lock.lock();
                            Canvas canvas = new Canvas(e11);
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            float f = i11;
                            canvas.drawRoundRect(rectF, f, f, paint2);
                            canvas.setBitmap(null);
                            lock.unlock();
                            if (!e10.equals(bitmap)) {
                                dVar.d(e10);
                            }
                            return e11;
                        }
                    }
                    config2 = Bitmap.Config.ARGB_8888;
                    if (config2.equals(bitmap.getConfig())) {
                    }
                    Bitmap e112 = dVar.e(e10.getWidth(), e10.getHeight(), config);
                    e112.setHasAlpha(true);
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader2 = new BitmapShader(e10, tileMode2, tileMode2);
                    Paint paint22 = new Paint();
                    paint22.setAntiAlias(true);
                    paint22.setShader(bitmapShader2);
                    RectF rectF2 = new RectF(0.0f, 0.0f, e112.getWidth(), e112.getHeight());
                    lock = s.f30442b;
                    lock.lock();
                    Canvas canvas2 = new Canvas(e112);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    float f2 = i11;
                    canvas2.drawRoundRect(rectF2, f2, f2, paint22);
                    canvas2.setBitmap(null);
                    lock.unlock();
                    if (!e10.equals(bitmap)) {
                    }
                    return e112;
                }
            }
            Canvas canvas22 = new Canvas(e112);
            canvas22.drawColor(0, PorterDuff.Mode.CLEAR);
            float f22 = i11;
            canvas22.drawRoundRect(rectF2, f22, f22, paint22);
            canvas22.setBitmap(null);
            lock.unlock();
            if (!e10.equals(bitmap)) {
            }
            return e112;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
        config = Bitmap.Config.ARGB_8888;
        if (i12 >= 26) {
        }
        config2 = Bitmap.Config.ARGB_8888;
        if (config2.equals(bitmap.getConfig())) {
        }
        Bitmap e1122 = dVar.e(e10.getWidth(), e10.getHeight(), config);
        e1122.setHasAlpha(true);
        Shader.TileMode tileMode22 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader22 = new BitmapShader(e10, tileMode22, tileMode22);
        Paint paint222 = new Paint();
        paint222.setAntiAlias(true);
        paint222.setShader(bitmapShader22);
        RectF rectF22 = new RectF(0.0f, 0.0f, e1122.getWidth(), e1122.getHeight());
        lock = s.f30442b;
        lock.lock();
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof q) || this.f30436b != ((q) obj).f30436b) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        char[] cArr = d5.j.f12201a;
        return ((this.f30436b + 527) * 31) - 569625254;
    }
}
