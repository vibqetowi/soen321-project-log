package l4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f24028j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f24029a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f24030b;

    /* renamed from: c  reason: collision with root package name */
    public final a f24031c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24032d;

    /* renamed from: e  reason: collision with root package name */
    public long f24033e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f24034g;

    /* renamed from: h  reason: collision with root package name */
    public int f24035h;

    /* renamed from: i  reason: collision with root package name */
    public int f24036i;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public i(long j10) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i6 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i6 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f24032d = j10;
        this.f24029a = lVar;
        this.f24030b = unmodifiableSet;
        this.f24031c = new a();
    }

    @Override // l4.d
    public final void a(int i6) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i6);
        }
        if (i6 < 40 && (Build.VERSION.SDK_INT < 23 || i6 < 20)) {
            if (i6 >= 20 || i6 == 15) {
                h(this.f24032d / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // l4.d
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // l4.d
    public final Bitmap c(int i6, int i10, Bitmap.Config config) {
        Bitmap g5 = g(i6, i10, config);
        if (g5 == null) {
            if (config == null) {
                config = f24028j;
            }
            return Bitmap.createBitmap(i6, i10, config);
        }
        return g5;
    }

    @Override // l4.d
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.f24029a).getClass();
                        if (d5.j.c(bitmap) <= this.f24032d && this.f24030b.contains(bitmap.getConfig())) {
                            ((l) this.f24029a).getClass();
                            int c10 = d5.j.c(bitmap);
                            ((l) this.f24029a).f(bitmap);
                            this.f24031c.getClass();
                            this.f24035h++;
                            this.f24033e += c10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((l) this.f24029a).e(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                f();
                            }
                            h(this.f24032d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((l) this.f24029a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f24030b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // l4.d
    public final Bitmap e(int i6, int i10, Bitmap.Config config) {
        Bitmap g5 = g(i6, i10, config);
        if (g5 != null) {
            g5.eraseColor(0);
            return g5;
        }
        if (config == null) {
            config = f24028j;
        }
        return Bitmap.createBitmap(i6, i10, config);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.f24034g + ", puts=" + this.f24035h + ", evictions=" + this.f24036i + ", currentSize=" + this.f24033e + ", maxSize=" + this.f24032d + "\nStrategy=" + this.f24029a);
    }

    public final synchronized Bitmap g(int i6, int i10, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            j jVar = this.f24029a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f24028j;
            }
            b10 = ((l) jVar).b(i6, i10, config3);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    ((l) this.f24029a).getClass();
                    sb2.append(l.c(d5.j.b(i6, i10, config), config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f24034g++;
            } else {
                this.f++;
                long j10 = this.f24033e;
                ((l) this.f24029a).getClass();
                this.f24033e = j10 - d5.j.c(b10);
                this.f24031c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                ((l) this.f24029a).getClass();
                sb3.append(l.c(d5.j.b(i6, i10, config), config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b10;
    }

    public final synchronized void h(long j10) {
        while (this.f24033e > j10) {
            l lVar = (l) this.f24029a;
            Bitmap c10 = lVar.f24042b.c();
            if (c10 != null) {
                lVar.a(Integer.valueOf(d5.j.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f24033e = 0L;
                return;
            }
            this.f24031c.getClass();
            long j11 = this.f24033e;
            ((l) this.f24029a).getClass();
            this.f24033e = j11 - d5.j.c(c10);
            this.f24036i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((l) this.f24029a).e(c10));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c10.recycle();
        }
    }
}
