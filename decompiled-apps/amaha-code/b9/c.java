package b9;

import c9.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: BaseDataSource.java */
/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4115a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<u> f4116b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    public int f4117c;

    /* renamed from: d  reason: collision with root package name */
    public h f4118d;

    public c(boolean z10) {
        this.f4115a = z10;
    }

    @Override // b9.f
    public final void c(u uVar) {
        uVar.getClass();
        ArrayList<u> arrayList = this.f4116b;
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
            this.f4117c++;
        }
    }

    @Override // b9.f
    public Map j() {
        return Collections.emptyMap();
    }

    public final void n(int i6) {
        h hVar = this.f4118d;
        int i10 = w.f5205a;
        for (int i11 = 0; i11 < this.f4117c; i11++) {
            this.f4116b.get(i11).a(hVar, this.f4115a, i6);
        }
    }

    public final void o() {
        h hVar = this.f4118d;
        int i6 = w.f5205a;
        for (int i10 = 0; i10 < this.f4117c; i10++) {
            this.f4116b.get(i10).g(hVar, this.f4115a);
        }
        this.f4118d = null;
    }

    public final void p(h hVar) {
        for (int i6 = 0; i6 < this.f4117c; i6++) {
            this.f4116b.get(i6).b();
        }
    }

    public final void q(h hVar) {
        this.f4118d = hVar;
        for (int i6 = 0; i6 < this.f4117c; i6++) {
            this.f4116b.get(i6).f(hVar, this.f4115a);
        }
    }
}
