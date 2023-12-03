package r6;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import q6.i;
import r6.j;
/* compiled from: BaseDataSet.java */
/* loaded from: classes.dex */
public abstract class f<T extends j> implements v6.d<T> {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f30490a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f30491b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30492c;
    public transient s6.c f;

    /* renamed from: d  reason: collision with root package name */
    public final i.a f30493d = i.a.LEFT;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30494e = true;

    /* renamed from: g  reason: collision with root package name */
    public final int f30495g = 3;

    /* renamed from: h  reason: collision with root package name */
    public final float f30496h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public final float f30497i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public boolean f30498j = true;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f30499k = true;

    /* renamed from: l  reason: collision with root package name */
    public final y6.c f30500l = new y6.c();

    /* renamed from: m  reason: collision with root package name */
    public float f30501m = 17.0f;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f30502n = true;

    public f() {
        this.f30490a = null;
        this.f30491b = null;
        this.f30492c = "DataSet";
        this.f30490a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f30491b = arrayList;
        this.f30490a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.f30492c = "";
    }

    @Override // v6.d
    public final float A() {
        return this.f30496h;
    }

    @Override // v6.d
    public final int B(int i6) {
        List<Integer> list = this.f30490a;
        return list.get(i6 % list.size()).intValue();
    }

    @Override // v6.d
    public final boolean G() {
        if (this.f == null) {
            return true;
        }
        return false;
    }

    @Override // v6.d
    public final void H() {
        this.f30494e = false;
    }

    @Override // v6.d
    public final int J(int i6) {
        ArrayList arrayList = this.f30491b;
        return ((Integer) arrayList.get(i6 % arrayList.size())).intValue();
    }

    @Override // v6.d
    public final List<Integer> M() {
        return this.f30490a;
    }

    @Override // v6.d
    public final boolean W() {
        return this.f30498j;
    }

    @Override // v6.d
    public final void a() {
        this.f30501m = y6.f.c(8.0f);
    }

    @Override // v6.d
    public final i.a a0() {
        return this.f30493d;
    }

    @Override // v6.d
    public final int b() {
        return this.f30495g;
    }

    @Override // v6.d
    public final y6.c d0() {
        return this.f30500l;
    }

    @Override // v6.d
    public final int e0() {
        return this.f30490a.get(0).intValue();
    }

    @Override // v6.d
    public final boolean f0() {
        return this.f30494e;
    }

    @Override // v6.d
    public final boolean isVisible() {
        return this.f30502n;
    }

    @Override // v6.d
    public final boolean m() {
        return this.f30499k;
    }

    @Override // v6.d
    public final void n(s6.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f = cVar;
    }

    @Override // v6.d
    public final String p() {
        return this.f30492c;
    }

    @Override // v6.d
    public final float t() {
        return this.f30501m;
    }

    @Override // v6.d
    public final s6.c u() {
        if (G()) {
            return y6.f.f38296h;
        }
        return this.f;
    }

    @Override // v6.d
    public final float w() {
        return this.f30497i;
    }

    @Override // v6.d
    public final void E() {
    }

    @Override // v6.d
    public final void j() {
    }
}
