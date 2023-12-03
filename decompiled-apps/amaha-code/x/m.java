package x;

import androidx.constraintlayout.widget.ConstraintLayout;
import x.e;
import y.b;
/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class m extends j {

    /* renamed from: y0  reason: collision with root package name */
    public int f37441y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f37442z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public boolean E0 = false;
    public int F0 = 0;
    public int G0 = 0;
    public final b.a H0 = new b.a();
    public b.InterfaceC0647b I0 = null;

    public final void W(e eVar, e.a aVar, int i6, e.a aVar2, int i10) {
        b.InterfaceC0647b interfaceC0647b;
        boolean z10;
        e eVar2;
        while (true) {
            interfaceC0647b = this.I0;
            if (interfaceC0647b != null || (eVar2 = this.W) == null) {
                break;
            }
            this.I0 = ((f) eVar2).A0;
        }
        b.a aVar3 = this.H0;
        aVar3.f38135a = aVar;
        aVar3.f38136b = aVar2;
        aVar3.f38137c = i6;
        aVar3.f38138d = i10;
        ((ConstraintLayout.b) interfaceC0647b).b(eVar, aVar3);
        eVar.R(aVar3.f38139e);
        eVar.O(aVar3.f);
        eVar.F = aVar3.f38141h;
        int i11 = aVar3.f38140g;
        eVar.f37366d0 = i11;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.F = z10;
    }

    @Override // x.j, x.i
    public final void c() {
        for (int i6 = 0; i6 < this.f37439x0; i6++) {
            e eVar = this.f37438w0[i6];
            if (eVar != null) {
                eVar.H = true;
            }
        }
    }

    public void V(int i6, int i10, int i11, int i12) {
    }
}
