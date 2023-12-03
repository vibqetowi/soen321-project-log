package e9;

import com.google.android.exoplayer2.util.GlUtil;
import e9.e;
import java.nio.FloatBuffer;
/* compiled from: ProjectionRenderer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f13887i = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f13888j = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: k  reason: collision with root package name */
    public static final float[] f13889k = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f13890l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f13891m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f13892a;

    /* renamed from: b  reason: collision with root package name */
    public a f13893b;

    /* renamed from: c  reason: collision with root package name */
    public GlUtil.a f13894c;

    /* renamed from: d  reason: collision with root package name */
    public int f13895d;

    /* renamed from: e  reason: collision with root package name */
    public int f13896e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f13897g;

    /* renamed from: h  reason: collision with root package name */
    public int f13898h;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13899a;

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f13900b;

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f13901c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13902d;

        public a(e.b bVar) {
            float[] fArr = bVar.f13885c;
            this.f13899a = fArr.length / 3;
            this.f13900b = GlUtil.b(fArr);
            this.f13901c = GlUtil.b(bVar.f13886d);
            int i6 = bVar.f13884b;
            if (i6 != 1) {
                if (i6 != 2) {
                    this.f13902d = 4;
                    return;
                } else {
                    this.f13902d = 6;
                    return;
                }
            }
            this.f13902d = 5;
        }
    }

    public static boolean a(e eVar) {
        e.b[] bVarArr = eVar.f13878a.f13882a;
        if (bVarArr.length != 1 || bVarArr[0].f13883a != 0) {
            return false;
        }
        e.b[] bVarArr2 = eVar.f13879b.f13882a;
        if (bVarArr2.length != 1 || bVarArr2[0].f13883a != 0) {
            return false;
        }
        return true;
    }
}
