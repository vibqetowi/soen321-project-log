package y;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import x.e;
/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x.e> f38132a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f38133b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final x.f f38134c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.a f38135a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f38136b;

        /* renamed from: c  reason: collision with root package name */
        public int f38137c;

        /* renamed from: d  reason: collision with root package name */
        public int f38138d;

        /* renamed from: e  reason: collision with root package name */
        public int f38139e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f38140g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f38141h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f38142i;

        /* renamed from: j  reason: collision with root package name */
        public int f38143j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: y.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0647b {
    }

    public b(x.f fVar) {
        this.f38134c = fVar;
    }

    public final boolean a(int i6, x.e eVar, InterfaceC0647b interfaceC0647b) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e.a[] aVarArr = eVar.V;
        e.a aVar = aVarArr[0];
        a aVar2 = this.f38133b;
        aVar2.f38135a = aVar;
        boolean z14 = true;
        aVar2.f38136b = aVarArr[1];
        aVar2.f38137c = eVar.u();
        aVar2.f38138d = eVar.o();
        aVar2.f38142i = false;
        aVar2.f38143j = i6;
        e.a aVar3 = aVar2.f38135a;
        e.a aVar4 = e.a.MATCH_CONSTRAINT;
        if (aVar3 == aVar4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar2.f38136b == aVar4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && eVar.Z > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && eVar.Z > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        e.a aVar5 = e.a.FIXED;
        int[] iArr = eVar.f37396u;
        if (z12 && iArr[0] == 4) {
            aVar2.f38135a = aVar5;
        }
        if (z13 && iArr[1] == 4) {
            aVar2.f38136b = aVar5;
        }
        ((ConstraintLayout.b) interfaceC0647b).b(eVar, aVar2);
        eVar.R(aVar2.f38139e);
        eVar.O(aVar2.f);
        eVar.F = aVar2.f38141h;
        int i10 = aVar2.f38140g;
        eVar.f37366d0 = i10;
        if (i10 <= 0) {
            z14 = false;
        }
        eVar.F = z14;
        aVar2.f38143j = 0;
        return aVar2.f38142i;
    }

    public final void b(x.f fVar, int i6, int i10, int i11) {
        int i12 = fVar.e0;
        int i13 = fVar.f37368f0;
        fVar.e0 = 0;
        fVar.f37368f0 = 0;
        fVar.R(i10);
        fVar.O(i11);
        if (i12 < 0) {
            fVar.e0 = 0;
        } else {
            fVar.e0 = i12;
        }
        if (i13 < 0) {
            fVar.f37368f0 = 0;
        } else {
            fVar.f37368f0 = i13;
        }
        x.f fVar2 = this.f38134c;
        fVar2.f37411z0 = i6;
        fVar2.U();
    }

    public final void c(x.f fVar) {
        ArrayList<x.e> arrayList = this.f38132a;
        arrayList.clear();
        int size = fVar.f37443w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            x.e eVar = fVar.f37443w0.get(i6);
            e.a[] aVarArr = eVar.V;
            e.a aVar = aVarArr[0];
            e.a aVar2 = e.a.MATCH_CONSTRAINT;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f37410y0.f38147b = true;
    }
}
