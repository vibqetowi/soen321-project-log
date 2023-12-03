package e9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import c9.w;
import e9.d;
import e9.k;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes.dex */
public final class j extends GLSurfaceView {
    public static final /* synthetic */ int F = 0;
    public SurfaceTexture A;
    public Surface B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f13910u;

    /* renamed from: v  reason: collision with root package name */
    public final SensorManager f13911v;

    /* renamed from: w  reason: collision with root package name */
    public final Sensor f13912w;

    /* renamed from: x  reason: collision with root package name */
    public final d f13913x;

    /* renamed from: y  reason: collision with root package name */
    public final Handler f13914y;

    /* renamed from: z  reason: collision with root package name */
    public final i f13915z;

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes.dex */
    public final class a implements GLSurfaceView.Renderer, k.a, d.a {
        public float A;
        public float B;

        /* renamed from: u  reason: collision with root package name */
        public final i f13916u;

        /* renamed from: x  reason: collision with root package name */
        public final float[] f13919x;

        /* renamed from: y  reason: collision with root package name */
        public final float[] f13920y;

        /* renamed from: z  reason: collision with root package name */
        public final float[] f13921z;

        /* renamed from: v  reason: collision with root package name */
        public final float[] f13917v = new float[16];

        /* renamed from: w  reason: collision with root package name */
        public final float[] f13918w = new float[16];
        public final float[] C = new float[16];
        public final float[] D = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f13919x = fArr;
            float[] fArr2 = new float[16];
            this.f13920y = fArr2;
            float[] fArr3 = new float[16];
            this.f13921z = fArr3;
            this.f13916u = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.B = 3.1415927f;
        }

        @Override // e9.d.a
        public final synchronized void a(float f, float[] fArr) {
            float[] fArr2 = this.f13919x;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.B = f2;
            Matrix.setRotateM(this.f13920y, 0, -this.A, (float) Math.cos(f2), (float) Math.sin(this.B), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.D, 0, this.f13919x, 0, this.f13921z, 0);
                Matrix.multiplyMM(this.C, 0, this.f13920y, 0, this.D, 0);
            }
            Matrix.multiplyMM(this.f13918w, 0, this.f13917v, 0, this.C, 0);
            this.f13916u.b(this.f13918w);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i6, int i10) {
            float f;
            boolean z10 = false;
            GLES20.glViewport(0, 0, i6, i10);
            float f2 = i6 / i10;
            if (f2 > 1.0f) {
                z10 = true;
            }
            if (z10) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.f13917v, 0, f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            j jVar = j.this;
            jVar.f13914y.post(new q7.f(jVar, 9, this.f13916u.e()));
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes.dex */
    public interface b {
        void n();

        void p(Surface surface);
    }

    public j(Context context) {
        super(context, null);
        this.f13910u = new CopyOnWriteArrayList<>();
        this.f13914y = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f13911v = sensorManager;
        Sensor defaultSensor = w.f5205a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f13912w = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f13915z = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener kVar = new k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f13913x = new d(windowManager.getDefaultDisplay(), kVar, aVar);
        this.C = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(kVar);
    }

    public final void a() {
        boolean z10;
        if (this.C && this.D) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sensor sensor = this.f13912w;
        if (sensor != null && z10 != this.E) {
            d dVar = this.f13913x;
            SensorManager sensorManager = this.f13911v;
            if (z10) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.E = z10;
        }
    }

    public e9.a getCameraMotionListener() {
        return this.f13915z;
    }

    public d9.j getVideoFrameMetadataListener() {
        return this.f13915z;
    }

    public Surface getVideoSurface() {
        return this.B;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13914y.post(new androidx.activity.b(24, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.D = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.D = true;
        a();
    }

    public void setDefaultStereoMode(int i6) {
        this.f13915z.E = i6;
    }

    public void setUseSensorRotation(boolean z10) {
        this.C = z10;
        a();
    }
}
