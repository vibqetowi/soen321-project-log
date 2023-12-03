package d9;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import c9.w;
import d9.e;
/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final d9.e f12678a = new d9.e();

    /* renamed from: b  reason: collision with root package name */
    public final b f12679b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12680c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12681d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f12682e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f12683g;

    /* renamed from: h  reason: collision with root package name */
    public float f12684h;

    /* renamed from: i  reason: collision with root package name */
    public float f12685i;

    /* renamed from: j  reason: collision with root package name */
    public int f12686j;

    /* renamed from: k  reason: collision with root package name */
    public long f12687k;

    /* renamed from: l  reason: collision with root package name */
    public long f12688l;

    /* renamed from: m  reason: collision with root package name */
    public long f12689m;

    /* renamed from: n  reason: collision with root package name */
    public long f12690n;

    /* renamed from: o  reason: collision with root package name */
    public long f12691o;

    /* renamed from: p  reason: collision with root package name */
    public long f12692p;

    /* renamed from: q  reason: collision with root package name */
    public long f12693q;

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f) {
            int i6;
            if (f == 0.0f) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            try {
                surface.setFrameRate(f, i6);
            } catch (IllegalStateException e10) {
                ca.a.Q("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        /* loaded from: classes.dex */
        public interface a {
        }

        void a(f0.b bVar);

        void b();
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: y  reason: collision with root package name */
        public static final e f12697y = new e();

        /* renamed from: u  reason: collision with root package name */
        public volatile long f12698u = -9223372036854775807L;

        /* renamed from: v  reason: collision with root package name */
        public final Handler f12699v;

        /* renamed from: w  reason: collision with root package name */
        public Choreographer f12700w;

        /* renamed from: x  reason: collision with root package name */
        public int f12701x;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i6 = w.f5205a;
            Handler handler = new Handler(looper, this);
            this.f12699v = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f12698u = j10;
            Choreographer choreographer = this.f12700w;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return false;
                    }
                    int i10 = this.f12701x - 1;
                    this.f12701x = i10;
                    if (i10 == 0) {
                        Choreographer choreographer = this.f12700w;
                        choreographer.getClass();
                        choreographer.removeFrameCallback(this);
                        this.f12698u = -9223372036854775807L;
                    }
                    return true;
                }
                int i11 = this.f12701x + 1;
                this.f12701x = i11;
                if (i11 == 1) {
                    Choreographer choreographer2 = this.f12700w;
                    choreographer2.getClass();
                    choreographer2.postFrameCallback(this);
                }
                return true;
            }
            this.f12700w = Choreographer.getInstance();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context) {
        b bVar;
        DisplayManager displayManager;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (w.f5205a >= 17 && (displayManager = (DisplayManager) applicationContext.getSystemService("display")) != null) {
                bVar = new d(displayManager);
            } else {
                bVar = null;
            }
            if (bVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    bVar = new c(windowManager);
                }
            }
            this.f12679b = bVar;
            this.f12680c = bVar != null ? e.f12697y : null;
            this.f12687k = -9223372036854775807L;
            this.f12688l = -9223372036854775807L;
            this.f = -1.0f;
            this.f12685i = 1.0f;
            this.f12686j = 0;
        }
        bVar = null;
        this.f12679b = bVar;
        this.f12680c = bVar != null ? e.f12697y : null;
        this.f12687k = -9223372036854775807L;
        this.f12688l = -9223372036854775807L;
        this.f = -1.0f;
        this.f12685i = 1.0f;
        this.f12686j = 0;
    }

    public final void a() {
        Surface surface;
        if (w.f5205a >= 30 && (surface = this.f12682e) != null && this.f12686j != Integer.MIN_VALUE && this.f12684h != 0.0f) {
            this.f12684h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (java.lang.Math.abs(r2 - r9.f12683g) < r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
        if (r0.f12632e >= 30) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        boolean z10;
        float f2;
        long j10;
        if (w.f5205a >= 30 && this.f12682e != null) {
            d9.e eVar = this.f12678a;
            if (eVar.a()) {
                if (eVar.a()) {
                    e.a aVar = eVar.f12628a;
                    long j11 = aVar.f12637e;
                    long j12 = 0;
                    if (j11 != 0) {
                        j12 = aVar.f / j11;
                    }
                    f = (float) (1.0E9d / j12);
                } else {
                    f = -1.0f;
                }
            } else {
                f = this.f;
            }
            float f10 = this.f12683g;
            if (f == f10) {
                return;
            }
            boolean z11 = true;
            int i6 = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
            if (i6 != 0 && f10 != -1.0f) {
                if (eVar.a()) {
                    if (eVar.a()) {
                        j10 = eVar.f12628a.f;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    if (j10 >= 5000000000L) {
                        z10 = true;
                        if (!z10) {
                            f2 = 0.02f;
                        } else {
                            f2 = 1.0f;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            } else {
                if (i6 == 0) {
                }
                if (z11) {
                    this.f12683g = f;
                    c(false);
                }
            }
        }
    }

    public final void c(boolean z10) {
        Surface surface;
        float f;
        if (w.f5205a >= 30 && (surface = this.f12682e) != null && this.f12686j != Integer.MIN_VALUE) {
            if (this.f12681d) {
                float f2 = this.f12683g;
                if (f2 != -1.0f) {
                    f = f2 * this.f12685i;
                    if (z10 && this.f12684h == f) {
                        return;
                    }
                    this.f12684h = f;
                    a.a(surface, f);
                }
            }
            f = 0.0f;
            if (z10) {
            }
            this.f12684h = f;
            a.a(surface, f);
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final WindowManager f12694a;

        public c(WindowManager windowManager) {
            this.f12694a = windowManager;
        }

        @Override // d9.l.b
        public final void a(f0.b bVar) {
            bVar.k(this.f12694a.getDefaultDisplay());
        }

        @Override // d9.l.b
        public final void b() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f12695a;

        /* renamed from: b  reason: collision with root package name */
        public b.a f12696b;

        public d(DisplayManager displayManager) {
            this.f12695a = displayManager;
        }

        @Override // d9.l.b
        public final void a(f0.b bVar) {
            this.f12696b = bVar;
            Handler j10 = w.j(null);
            DisplayManager displayManager = this.f12695a;
            displayManager.registerDisplayListener(this, j10);
            bVar.k(displayManager.getDisplay(0));
        }

        @Override // d9.l.b
        public final void b() {
            this.f12695a.unregisterDisplayListener(this);
            this.f12696b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i6) {
            b.a aVar = this.f12696b;
            if (aVar != null && i6 == 0) {
                ((f0.b) aVar).k(this.f12695a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i6) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i6) {
        }
    }
}
