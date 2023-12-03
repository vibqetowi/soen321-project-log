package r6;

import android.graphics.Color;
import java.util.ArrayList;
import r6.j;
/* compiled from: LineRadarDataSet.java */
/* loaded from: classes.dex */
public abstract class k<T extends j> extends e<Object> implements v6.e<T>, v6.f<Object> {
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f30522u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f30523v;

    /* renamed from: w  reason: collision with root package name */
    public final float f30524w;

    /* renamed from: x  reason: collision with root package name */
    public int f30525x;

    /* renamed from: y  reason: collision with root package name */
    public int f30526y;

    /* renamed from: z  reason: collision with root package name */
    public float f30527z;

    public k(ArrayList arrayList) {
        super(arrayList);
        this.f30522u = true;
        this.f30523v = true;
        this.f30524w = 0.5f;
        this.f30524w = y6.f.c(0.5f);
        this.f30525x = Color.rgb(140, 234, 255);
        this.f30526y = 85;
        this.f30527z = 2.5f;
        this.A = false;
    }

    @Override // v6.e
    public final int c() {
        return this.f30525x;
    }

    @Override // v6.e
    public final int e() {
        return this.f30526y;
    }

    @Override // v6.f
    public final boolean g0() {
        return this.f30522u;
    }

    @Override // v6.e
    public final float h() {
        return this.f30527z;
    }

    @Override // v6.f
    public final boolean i0() {
        return this.f30523v;
    }

    @Override // v6.f
    public final float q() {
        return this.f30524w;
    }

    @Override // v6.e
    public final boolean y() {
        return this.A;
    }

    @Override // v6.f
    public final /* bridge */ /* synthetic */ void K() {
    }

    @Override // v6.e
    public final void s() {
    }
}
