package e9;

import android.opengl.Matrix;
import c9.u;
import java.io.Serializable;
import r1.b0;
/* compiled from: FrameRotationQueue.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13867a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13868b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13869c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f13870d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f13871e;

    /* JADX WARN: Type inference failed for: r0v2, types: [float[], java.io.Serializable] */
    public c() {
        this.f13867a = 0;
        this.f13869c = new float[16];
        this.f13870d = new float[16];
        this.f13871e = new u();
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f10 = fArr2[10];
        fArr[0] = f10 / sqrt;
        float f11 = fArr2[8];
        fArr[2] = f11 / sqrt;
        fArr[8] = (-f11) / sqrt;
        fArr[10] = f10 / sqrt;
    }

    public final String toString() {
        switch (this.f13867a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("DatabaseInfo(databaseId:");
                sb2.append((ke.f) this.f13869c);
                sb2.append(" host:");
                return b0.b(sb2, (String) this.f13871e, ")");
            default:
                return super.toString();
        }
    }

    public c(ke.f fVar, String str, String str2, boolean z10) {
        this.f13867a = 1;
        this.f13869c = fVar;
        this.f13870d = str;
        this.f13871e = str2;
        this.f13868b = z10;
    }
}
