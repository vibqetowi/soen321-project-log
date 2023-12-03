package t6;

import q6.i;
/* compiled from: Highlight.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f32419a;

    /* renamed from: b  reason: collision with root package name */
    public final float f32420b;

    /* renamed from: c  reason: collision with root package name */
    public final float f32421c;

    /* renamed from: d  reason: collision with root package name */
    public final float f32422d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32423e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32424g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a f32425h;

    public c(float f, float f2, float f10, float f11, int i6, i.a aVar) {
        this.f32419a = Float.NaN;
        this.f32420b = Float.NaN;
        this.f32423e = -1;
        this.f32424g = -1;
        this.f32419a = f;
        this.f32420b = f2;
        this.f32421c = f10;
        this.f32422d = f11;
        this.f = i6;
        this.f32425h = aVar;
    }

    public final boolean a(c cVar) {
        if (cVar == null || this.f != cVar.f || this.f32419a != cVar.f32419a || this.f32424g != cVar.f32424g || this.f32423e != cVar.f32423e) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Highlight, x: " + this.f32419a + ", y: " + this.f32420b + ", dataSetIndex: " + this.f + ", stackIndex (only stacked barentry): " + this.f32424g;
    }

    public c(float f, float f2, float f10, float f11, int i6, i.a aVar, int i10) {
        this(f, f2, f10, f11, i6, aVar);
        this.f32424g = -1;
    }
}
