package q6;

import java.util.ArrayList;
/* compiled from: AxisBase.java */
/* loaded from: classes.dex */
public abstract class a extends b {
    public s6.b f;

    /* renamed from: l  reason: collision with root package name */
    public int f29184l;

    /* renamed from: m  reason: collision with root package name */
    public int f29185m;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f29192u;

    /* renamed from: g  reason: collision with root package name */
    public final int f29179g = -7829368;

    /* renamed from: h  reason: collision with root package name */
    public final float f29180h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public final int f29181i = -7829368;

    /* renamed from: j  reason: collision with root package name */
    public final float f29182j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float[] f29183k = new float[0];

    /* renamed from: n  reason: collision with root package name */
    public int f29186n = 6;

    /* renamed from: o  reason: collision with root package name */
    public float f29187o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f29188p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f29189q = false;
    public boolean r = true;

    /* renamed from: s  reason: collision with root package name */
    public boolean f29190s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f29191t = true;

    /* renamed from: v  reason: collision with root package name */
    public float f29193v = 0.0f;

    /* renamed from: w  reason: collision with root package name */
    public float f29194w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public boolean f29195x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f29196y = false;

    /* renamed from: z  reason: collision with root package name */
    public float f29197z = 0.0f;
    public float A = 0.0f;
    public float B = 0.0f;

    public a() {
        this.f29201d = y6.f.c(10.0f);
        this.f29199b = y6.f.c(5.0f);
        this.f29200c = y6.f.c(5.0f);
        this.f29192u = new ArrayList();
    }

    public void a(float f, float f2) {
        float f10;
        float f11;
        if (this.f29195x) {
            f10 = this.A;
        } else {
            f10 = f - this.f29193v;
        }
        if (this.f29196y) {
            f11 = this.f29197z;
        } else {
            f11 = f2 + this.f29194w;
        }
        if (Math.abs(f11 - f10) == 0.0f) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        this.A = f10;
        this.f29197z = f11;
        this.B = Math.abs(f11 - f10);
    }

    public final String b(int i6) {
        if (i6 >= 0 && i6 < this.f29183k.length) {
            return d().a(this.f29183k[i6], this);
        }
        return "";
    }

    public final String c() {
        String str = "";
        for (int i6 = 0; i6 < this.f29183k.length; i6++) {
            String b10 = b(i6);
            if (b10 != null && str.length() < b10.length()) {
                str = b10;
            }
        }
        return str;
    }

    public final s6.b d() {
        s6.b bVar = this.f;
        if (bVar == null || ((bVar instanceof s6.a) && ((s6.a) bVar).f31290b != this.f29185m)) {
            this.f = new s6.a(this.f29185m);
        }
        return this.f;
    }
}
