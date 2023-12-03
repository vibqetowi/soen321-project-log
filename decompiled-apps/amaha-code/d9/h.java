package d9;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: classes.dex */
public final class h extends GLSurfaceView implements i {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f12670v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final a f12671u;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.Renderer {
        public static final float[] D = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] E = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer F = GlUtil.b(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public GlUtil.a A;
        public int B;
        public r7.h C;

        /* renamed from: u  reason: collision with root package name */
        public final GLSurfaceView f12672u;

        /* renamed from: v  reason: collision with root package name */
        public final int[] f12673v = new int[3];

        /* renamed from: w  reason: collision with root package name */
        public final int[] f12674w = new int[3];

        /* renamed from: x  reason: collision with root package name */
        public final int[] f12675x = new int[3];

        /* renamed from: y  reason: collision with root package name */
        public final int[] f12676y = new int[3];

        /* renamed from: z  reason: collision with root package name */
        public final AtomicReference<r7.h> f12677z = new AtomicReference<>();

        public a(GLSurfaceView gLSurfaceView) {
            this.f12672u = gLSurfaceView;
            for (int i6 = 0; i6 < 3; i6++) {
                int[] iArr = this.f12675x;
                this.f12676y[i6] = -1;
                iArr[i6] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            r7.h andSet = this.f12677z.getAndSet(null);
            if (andSet == null && this.C == null) {
                return;
            }
            if (andSet != null) {
                r7.h hVar = this.C;
                if (hVar != null) {
                    hVar.getClass();
                    throw null;
                }
                this.C = andSet;
            }
            this.C.getClass();
            GLES20.glUniformMatrix3fv(this.B, 1, false, D, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i6, int i10) {
            GLES20.glViewport(0, 0, i6, i10);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            GlUtil.a aVar = new GlUtil.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.A = aVar;
            aVar.c();
            int b10 = this.A.b("in_pos");
            GLES20.glEnableVertexAttribArray(b10);
            GLES20.glVertexAttribPointer(b10, 2, 5126, false, 0, (Buffer) F);
            int b11 = this.A.b("in_tc_y");
            int[] iArr = this.f12674w;
            iArr[0] = b11;
            GLES20.glEnableVertexAttribArray(b11);
            int b12 = this.A.b("in_tc_u");
            iArr[1] = b12;
            GLES20.glEnableVertexAttribArray(b12);
            int b13 = this.A.b("in_tc_v");
            iArr[2] = b13;
            GLES20.glEnableVertexAttribArray(b13);
            GlUtil.a();
            this.B = GLES20.glGetUniformLocation(this.A.f7193a, "mColorConversion");
            GlUtil.a();
            int[] iArr2 = this.f12673v;
            GLES20.glGenTextures(3, iArr2, 0);
            for (int i6 = 0; i6 < 3; i6++) {
                GlUtil.a aVar2 = this.A;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(aVar2.f7193a, E[i6]), i6);
                GLES20.glActiveTexture(33984 + i6);
                GLES20.glBindTexture(3553, iArr2[i6]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            GlUtil.a();
            GlUtil.a();
        }
    }

    public h(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.f12671u = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(r7.h hVar) {
        a aVar = this.f12671u;
        if (aVar.f12677z.getAndSet(hVar) == null) {
            aVar.f12672u.requestRender();
            return;
        }
        throw null;
    }

    @Deprecated
    public i getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
