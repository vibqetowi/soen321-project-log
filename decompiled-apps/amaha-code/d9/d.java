package d9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import c9.w;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
/* compiled from: DummySurface.java */
/* loaded from: classes.dex */
public final class d extends Surface {

    /* renamed from: x  reason: collision with root package name */
    public static int f12618x;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f12619y;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f12620u;

    /* renamed from: v  reason: collision with root package name */
    public final a f12621v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12622w;

    /* compiled from: DummySurface.java */
    /* loaded from: classes.dex */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: u  reason: collision with root package name */
        public EGLSurfaceTexture f12623u;

        /* renamed from: v  reason: collision with root package name */
        public Handler f12624v;

        /* renamed from: w  reason: collision with root package name */
        public Error f12625w;

        /* renamed from: x  reason: collision with root package name */
        public RuntimeException f12626x;

        /* renamed from: y  reason: collision with root package name */
        public d f12627y;

        public a() {
            super("ExoPlayer:DummySurface");
        }

        public final void a(int i6) {
            EGLConfig eGLConfig;
            int[] iArr;
            int[] iArr2;
            EGLSurface eglCreatePbufferSurface;
            this.f12623u.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f12623u;
            eGLSurfaceTexture.getClass();
            boolean z10 = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                int[] iArr3 = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                    eGLSurfaceTexture.f7189w = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.A, 0, eGLConfigArr, 0, 1, iArr4, 0);
                    if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                        EGLDisplay eGLDisplay = eGLSurfaceTexture.f7189w;
                        if (i6 == 0) {
                            iArr = new int[]{12440, 2, 12344};
                        } else {
                            iArr = new int[]{12440, 2, 12992, 1, 12344};
                        }
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                        if (eglCreateContext != null) {
                            eGLSurfaceTexture.f7190x = eglCreateContext;
                            EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f7189w;
                            if (i6 == 1) {
                                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                if (i6 == 2) {
                                    iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                } else {
                                    iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                }
                                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                if (eglCreatePbufferSurface == null) {
                                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed");
                                }
                            }
                            if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                eGLSurfaceTexture.f7191y = eglCreatePbufferSurface;
                                int[] iArr5 = eGLSurfaceTexture.f7188v;
                                GLES20.glGenTextures(1, iArr5, 0);
                                GlUtil.a();
                                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
                                eGLSurfaceTexture.f7192z = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
                                SurfaceTexture surfaceTexture2 = this.f12623u.f7192z;
                                surfaceTexture2.getClass();
                                if (i6 != 0) {
                                    z10 = true;
                                }
                                this.f12627y = new d(this, surfaceTexture2, z10);
                                return;
                            }
                            throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed");
                        }
                        throw new EGLSurfaceTexture.GlException("eglCreateContext failed");
                    }
                    throw new EGLSurfaceTexture.GlException(w.k("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
                }
                throw new EGLSurfaceTexture.GlException("eglInitialize failed");
            }
            throw new EGLSurfaceTexture.GlException("eglGetDisplay failed");
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
        public final void b() {
            this.f12623u.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f12623u;
            eGLSurfaceTexture.f7187u.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f7192z;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f7188v, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f7189w;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f7189w;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f7191y;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f7189w, eGLSurfaceTexture.f7191y);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f7190x;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f7189w, eGLContext);
                }
                if (w.f5205a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f7189w;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f7189w);
                }
                eGLSurfaceTexture.f7189w = null;
                eGLSurfaceTexture.f7190x = null;
                eGLSurfaceTexture.f7191y = null;
                eGLSurfaceTexture.f7192z = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            try {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    ca.a.Q("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f12625w = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    ca.a.Q("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f12626x = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public d(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f12621v = aVar;
        this.f12620u = z10;
    }

    public static int a(Context context) {
        boolean z10;
        String eglQueryString;
        String eglQueryString2;
        int i6 = w.f5205a;
        boolean z11 = false;
        if (i6 >= 24 && ((i6 >= 26 || (!"samsung".equals(w.f5207c) && !"XT1650".equals(w.f5208d))) && ((i6 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        if (i6 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z11 = true;
        }
        if (z11) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (d.class) {
            z10 = true;
            if (!f12619y) {
                f12618x = a(context);
                f12619y = true;
            }
            if (f12618x == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static d c(boolean z10, Context context) {
        boolean z11;
        int i6;
        boolean z12 = false;
        if (z10 && !b(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        sc.b.C(z11);
        a aVar = new a();
        if (z10) {
            i6 = f12618x;
        } else {
            i6 = 0;
        }
        aVar.start();
        Handler handler = new Handler(aVar.getLooper(), aVar);
        aVar.f12624v = handler;
        aVar.f12623u = new EGLSurfaceTexture(handler);
        synchronized (aVar) {
            aVar.f12624v.obtainMessage(1, i6, 0).sendToTarget();
            while (aVar.f12627y == null && aVar.f12626x == null && aVar.f12625w == null) {
                try {
                    aVar.wait();
                } catch (InterruptedException unused) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = aVar.f12626x;
        if (runtimeException == null) {
            Error error = aVar.f12625w;
            if (error == null) {
                d dVar = aVar.f12627y;
                dVar.getClass();
                return dVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f12621v) {
            if (!this.f12622w) {
                a aVar = this.f12621v;
                aVar.f12624v.getClass();
                aVar.f12624v.sendEmptyMessage(2);
                this.f12622w = true;
            }
        }
    }
}
