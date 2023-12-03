package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import y.o;
/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class j extends e implements i {

    /* renamed from: w0  reason: collision with root package name */
    public e[] f37438w0 = new e[4];

    /* renamed from: x0  reason: collision with root package name */
    public int f37439x0 = 0;

    public final void U(int i6, o oVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f37439x0; i10++) {
            e eVar = this.f37438w0[i10];
            ArrayList<e> arrayList2 = oVar.f38171a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i11 = 0; i11 < this.f37439x0; i11++) {
            y.i.a(this.f37438w0[i11], i6, arrayList, oVar);
        }
    }

    @Override // x.i
    public final void a() {
        this.f37439x0 = 0;
        Arrays.fill(this.f37438w0, (Object) null);
    }

    @Override // x.i
    public final void b(e eVar) {
        if (eVar != this && eVar != null) {
            int i6 = this.f37439x0 + 1;
            e[] eVarArr = this.f37438w0;
            if (i6 > eVarArr.length) {
                this.f37438w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f37438w0;
            int i10 = this.f37439x0;
            eVarArr2[i10] = eVar;
            this.f37439x0 = i10 + 1;
        }
    }

    @Override // x.e
    public void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        j jVar = (j) eVar;
        this.f37439x0 = 0;
        int i6 = jVar.f37439x0;
        for (int i10 = 0; i10 < i6; i10++) {
            b(hashMap.get(jVar.f37438w0[i10]));
        }
    }

    @Override // x.i
    public void c() {
    }
}
