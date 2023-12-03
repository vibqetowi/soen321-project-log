package e9;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import c9.q;
import c9.u;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.util.GlUtil;
import e9.e;
import e9.g;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SceneRenderer.java */
/* loaded from: classes.dex */
public final class i implements d9.j, a {
    public int C;
    public SurfaceTexture D;
    public byte[] G;

    /* renamed from: u  reason: collision with root package name */
    public final AtomicBoolean f13904u = new AtomicBoolean();

    /* renamed from: v  reason: collision with root package name */
    public final AtomicBoolean f13905v = new AtomicBoolean(true);

    /* renamed from: w  reason: collision with root package name */
    public final g f13906w = new g();

    /* renamed from: x  reason: collision with root package name */
    public final c f13907x = new c();

    /* renamed from: y  reason: collision with root package name */
    public final u f13908y = new u();

    /* renamed from: z  reason: collision with root package name */
    public final u f13909z = new u();
    public final float[] A = new float[16];
    public final float[] B = new float[16];
    public volatile int E = 0;
    public int F = -1;

    @Override // e9.a
    public final void a(long j10, float[] fArr) {
        ((u) this.f13907x.f13871e).a(j10, fArr);
    }

    public final void b(float[] fArr) {
        float[] fArr2;
        Object f;
        GLES20.glClear(16384);
        GlUtil.a();
        if (this.f13904u.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.D;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            GlUtil.a();
            if (this.f13905v.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.A, 0);
            }
            long timestamp = this.D.getTimestamp();
            u uVar = this.f13908y;
            synchronized (uVar) {
                f = uVar.f(false, timestamp);
            }
            Long l2 = (Long) f;
            if (l2 != null) {
                c cVar = this.f13907x;
                float[] fArr3 = this.A;
                float[] fArr4 = (float[]) ((u) cVar.f13871e).g(l2.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) cVar.f13870d;
                    float f2 = fArr4[0];
                    float f10 = -fArr4[1];
                    float f11 = -fArr4[2];
                    float length = Matrix.length(f2, f10, f11);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f2 / length, f10 / length, f11 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    boolean z10 = cVar.f13868b;
                    Object obj = cVar.f13869c;
                    if (!z10) {
                        c.a((float[]) obj, fArr5);
                        cVar.f13868b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) obj, 0, fArr5, 0);
                }
            }
            e eVar = (e) this.f13909z.g(timestamp);
            if (eVar != null) {
                g gVar = this.f13906w;
                gVar.getClass();
                if (g.a(eVar)) {
                    gVar.f13892a = eVar.f13880c;
                    gVar.f13893b = new g.a(eVar.f13878a.f13882a[0]);
                    if (!eVar.f13881d) {
                        new g.a(eVar.f13879b.f13882a[0]);
                    }
                    gVar.getClass();
                }
            }
        }
        Matrix.multiplyMM(this.B, 0, fArr, 0, this.A, 0);
        g gVar2 = this.f13906w;
        int i6 = this.C;
        float[] fArr6 = this.B;
        g.a aVar = gVar2.f13893b;
        if (aVar != null) {
            GlUtil.a aVar2 = gVar2.f13894c;
            aVar2.getClass();
            aVar2.c();
            GlUtil.a();
            GLES20.glEnableVertexAttribArray(gVar2.f);
            GLES20.glEnableVertexAttribArray(gVar2.f13897g);
            GlUtil.a();
            int i10 = gVar2.f13892a;
            if (i10 == 1) {
                fArr2 = g.f13890l;
            } else if (i10 == 2) {
                fArr2 = g.f13891m;
            } else {
                fArr2 = g.f13889k;
            }
            GLES20.glUniformMatrix3fv(gVar2.f13896e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(gVar2.f13895d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i6);
            GLES20.glUniform1i(gVar2.f13898h, 0);
            GlUtil.a();
            GLES20.glVertexAttribPointer(gVar2.f, 3, 5126, false, 12, (Buffer) aVar.f13900b);
            GlUtil.a();
            GLES20.glVertexAttribPointer(gVar2.f13897g, 2, 5126, false, 8, (Buffer) aVar.f13901c);
            GlUtil.a();
            GLES20.glDrawArrays(aVar.f13902d, 0, aVar.f13899a);
            GlUtil.a();
            GLES20.glDisableVertexAttribArray(gVar2.f);
            GLES20.glDisableVertexAttribArray(gVar2.f13897g);
        }
    }

    @Override // e9.a
    public final void c() {
        this.f13908y.b();
        c cVar = this.f13907x;
        ((u) cVar.f13871e).b();
        cVar.f13868b = false;
        this.f13905v.set(true);
    }

    @Override // d9.j
    public final void d(long j10, long j11, n nVar, MediaFormat mediaFormat) {
        float f;
        float f2;
        int i6;
        int i10;
        ArrayList<e.a> arrayList;
        boolean z10;
        this.f13908y.a(j11, Long.valueOf(j10));
        byte[] bArr = nVar.P;
        int i11 = nVar.Q;
        byte[] bArr2 = this.G;
        int i12 = this.F;
        this.G = bArr;
        if (i11 == -1) {
            i11 = this.E;
        }
        this.F = i11;
        if (i12 != i11 || !Arrays.equals(bArr2, this.G)) {
            byte[] bArr3 = this.G;
            e eVar = null;
            if (bArr3 != null) {
                int i13 = this.F;
                q qVar = new q(bArr3);
                try {
                    qVar.B(4);
                    int c10 = qVar.c();
                    qVar.A(0);
                    if (c10 == 1886547818) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z10) {
                    qVar.B(8);
                    int i14 = qVar.f5187b;
                    int i15 = qVar.f5188c;
                    while (i14 < i15) {
                        int c11 = qVar.c() + i14;
                        if (c11 <= i14 || c11 > i15) {
                            break;
                        }
                        int c12 = qVar.c();
                        if (c12 != 2037673328 && c12 != 1836279920) {
                            qVar.A(c11);
                            i14 = c11;
                        }
                        qVar.z(c11);
                        arrayList = f.a(qVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = f.a(qVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            eVar = new e(arrayList.get(0), arrayList.get(1), i13);
                        }
                    } else {
                        e.a aVar = arrayList.get(0);
                        eVar = new e(aVar, aVar, i13);
                    }
                }
            }
            if (eVar == null || !g.a(eVar)) {
                int i16 = this.F;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f10 = radians / 36;
                float f11 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 36; i17 < i20; i20 = 36) {
                    float f12 = radians / 2.0f;
                    float f13 = (i17 * f10) - f12;
                    int i21 = i17 + 1;
                    float f14 = (i21 * f10) - f12;
                    int i22 = 0;
                    while (i22 < 73) {
                        int i23 = i21;
                        int i24 = 0;
                        for (int i25 = 2; i24 < i25; i25 = 2) {
                            if (i24 == 0) {
                                f2 = f14;
                                f = f13;
                            } else {
                                f = f14;
                                f2 = f;
                            }
                            float f15 = i22 * f11;
                            float f16 = f13;
                            int i26 = i18 + 1;
                            float f17 = f11;
                            double d10 = 50.0f;
                            int i27 = i22;
                            double d11 = (f15 + 3.1415927f) - (radians2 / 2.0f);
                            float f18 = f10;
                            double d12 = f;
                            int i28 = i16;
                            int i29 = i24;
                            fArr[i18] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                            int i30 = i26 + 1;
                            fArr[i26] = (float) (Math.sin(d12) * d10);
                            int i31 = i30 + 1;
                            fArr[i30] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                            int i32 = i19 + 1;
                            fArr2[i19] = f15 / radians2;
                            int i33 = i32 + 1;
                            fArr2[i32] = ((i17 + i29) * f18) / radians;
                            if (i27 == 0 && i29 == 0) {
                                i6 = i27;
                                i10 = i29;
                            } else {
                                i6 = i27;
                                i10 = i29;
                                if (i6 != 72 || i10 != 1) {
                                    i19 = i33;
                                    i18 = i31;
                                    i24 = i10 + 1;
                                    i22 = i6;
                                    f14 = f2;
                                    f11 = f17;
                                    f13 = f16;
                                    f10 = f18;
                                    i16 = i28;
                                }
                            }
                            System.arraycopy(fArr, i31 - 3, fArr, i31, 3);
                            i31 += 3;
                            System.arraycopy(fArr2, i33 - 2, fArr2, i33, 2);
                            i33 += 2;
                            i19 = i33;
                            i18 = i31;
                            i24 = i10 + 1;
                            i22 = i6;
                            f14 = f2;
                            f11 = f17;
                            f13 = f16;
                            f10 = f18;
                            i16 = i28;
                        }
                        i22++;
                        i21 = i23;
                        f13 = f13;
                        i16 = i16;
                    }
                    i17 = i21;
                }
                e.a aVar2 = new e.a(new e.b(0, fArr, fArr2, 1));
                eVar = new e(aVar2, aVar2, i16);
            }
            this.f13909z.a(j11, eVar);
        }
    }

    public final SurfaceTexture e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.a();
        g gVar = this.f13906w;
        gVar.getClass();
        GlUtil.a aVar = new GlUtil.a(TextUtils.join("\n", g.f13887i), TextUtils.join("\n", g.f13888j));
        gVar.f13894c = aVar;
        gVar.f13895d = GLES20.glGetUniformLocation(aVar.f7193a, "uMvpMatrix");
        gVar.f13896e = GLES20.glGetUniformLocation(gVar.f13894c.f7193a, "uTexMatrix");
        gVar.f = gVar.f13894c.b("aPosition");
        gVar.f13897g = gVar.f13894c.b("aTexCoords");
        gVar.f13898h = GLES20.glGetUniformLocation(gVar.f13894c.f7193a, "uTexture");
        GlUtil.a();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GlUtil.a();
        this.C = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.C);
        this.D = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: e9.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f13904u.set(true);
            }
        });
        return this.D;
    }
}
