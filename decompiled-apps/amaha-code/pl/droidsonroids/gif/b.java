package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import bw.c;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: GifDrawable.java */
/* loaded from: classes2.dex */
public final class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    public final GifInfoHandle A;
    public final ConcurrentLinkedQueue<bw.a> B;
    public ColorStateList C;
    public PorterDuffColorFilter D;
    public PorterDuff.Mode E;
    public final boolean F;
    public final bw.d G;
    public final e H;
    public final Rect I;
    public ScheduledFuture<?> J;
    public final int K;
    public final int L;

    /* renamed from: u  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28568u;

    /* renamed from: v  reason: collision with root package name */
    public volatile boolean f28569v;

    /* renamed from: w  reason: collision with root package name */
    public long f28570w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f28571x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f28572y;

    /* renamed from: z  reason: collision with root package name */
    public final Bitmap f28573z;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes2.dex */
    public class a extends f {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f28574v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, int i6) {
            super(bVar);
            this.f28574v = i6;
        }

        @Override // pl.droidsonroids.gif.f
        public final void a() {
            b bVar = b.this;
            bVar.A.s(this.f28574v, bVar.f28573z);
            this.f28582u.G.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public b(Resources resources, int i6) {
        this(new GifInfoHandle(resources.openRawResourceFd(i6)));
        List<String> list = d.f28577a;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i6, typedValue, true);
        int i10 = typedValue.density;
        if (i10 == 0) {
            i10 = 160;
        } else if (i10 == 65535) {
            i10 = 0;
        }
        int i11 = resources.getDisplayMetrics().densityDpi;
        float f = (i10 <= 0 || i11 <= 0) ? 1.0f : i11 / i10;
        this.L = (int) (this.A.e() * f);
        this.K = (int) (this.A.j() * f);
    }

    public final void a(long j10) {
        bw.d dVar = this.G;
        if (this.F) {
            this.f28570w = 0L;
            dVar.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.J;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        dVar.removeMessages(-1);
        this.J = this.f28568u.schedule(this.H, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        if (this.A.h() > 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        if (this.A.h() > 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.D;
        Paint paint = this.f28572y;
        if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.D);
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawBitmap(this.f28573z, this.I, this.f28571x, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28572y.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f28572y.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.A.k() && this.f28572y.getAlpha() >= 255) {
            return -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.F && this.f28569v) {
            long j10 = this.f28570w;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f28570w = Long.MIN_VALUE;
                this.f28568u.remove(this.H);
                this.J = this.f28568u.schedule(this.H, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f28569v;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f28569v;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!super.isStateful() && ((colorStateList = this.C) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f28571x.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.C;
        if (colorStateList != null && (mode = this.E) != null) {
            this.D = b(colorStateList, mode);
            return true;
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i6) {
        if (i6 >= 0) {
            this.f28568u.execute(new a(this, i6));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f28572y.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28572y.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f28572y.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f28572y.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = b(colorStateList, this.E);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        this.D = b(this.C, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.F) {
            if (z10) {
                if (z11) {
                    this.f28568u.execute(new pl.droidsonroids.gif.a(this, this));
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f28569v) {
                return;
            }
            this.f28569v = true;
            a(this.A.p());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (!this.f28569v) {
                return;
            }
            this.f28569v = false;
            ScheduledFuture<?> scheduledFuture = this.J;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.G.removeMessages(-1);
            this.A.r();
        }
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.A;
        return String.format(locale, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(gifInfoHandle.j()), Integer.valueOf(gifInfoHandle.e()), Integer.valueOf(gifInfoHandle.h()), Integer.valueOf(gifInfoHandle.g()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(ContentResolver contentResolver, Uri uri) {
        this(r3);
        GifInfoHandle gifInfoHandle;
        int i6 = GifInfoHandle.f28565b;
        if ("file".equals(uri.getScheme())) {
            gifInfoHandle = new GifInfoHandle(uri.getPath());
        } else {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                gifInfoHandle = new GifInfoHandle(openAssetFileDescriptor);
            } else {
                throw new IOException("Could not open AssetFileDescriptor for " + uri);
            }
        }
    }

    public b(GifInfoHandle gifInfoHandle) {
        this.f28569v = true;
        this.f28570w = Long.MIN_VALUE;
        this.f28571x = new Rect();
        this.f28572y = new Paint(6);
        this.B = new ConcurrentLinkedQueue<>();
        e eVar = new e(this);
        this.H = eVar;
        this.F = true;
        int i6 = bw.c.f4730u;
        this.f28568u = c.a.f4731a;
        this.A = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f28573z = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.I = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.G = new bw.d(this);
        eVar.a();
        this.K = gifInfoHandle.j();
        this.L = gifInfoHandle.e();
    }
}
