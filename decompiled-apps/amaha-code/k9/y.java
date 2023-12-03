package k9;

import android.os.Parcel;
import com.google.android.gms.common.api.a;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements com.google.android.gms.common.api.internal.n {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23198u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final f0 f23199v;

    /* renamed from: w  reason: collision with root package name */
    public final e.d f23200w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23201x;

    public y(f0 f0Var, String str, m9.g gVar) {
        this.f23199v = f0Var;
        this.f23201x = str;
        this.f23200w = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        boolean z10 = false;
        int i6 = this.f23198u;
        e.d dVar = this.f23200w;
        String str = this.f23201x;
        f0 f0Var = this.f23199v;
        switch (i6) {
            case 0:
                p9.z zVar = (p9.z) eVar;
                ya.i iVar = (ya.i) obj;
                if (f0Var.F != 1) {
                    z10 = true;
                }
                v9.o.j("Not active connection", z10);
                p9.e eVar2 = (p9.e) zVar.y();
                Parcel z11 = eVar2.z();
                z11.writeString(str);
                eVar2.S1(z11, 12);
                if (dVar != null) {
                    p9.e eVar3 = (p9.e) zVar.y();
                    Parcel z12 = eVar3.z();
                    z12.writeString(str);
                    eVar3.S1(z12, 11);
                }
                iVar.b(null);
                return;
            default:
                p9.z zVar2 = (p9.z) eVar;
                ya.i iVar2 = (ya.i) obj;
                if (f0Var.F != 1) {
                    z10 = true;
                }
                v9.o.j("Not active connection", z10);
                if (dVar != null) {
                    p9.e eVar4 = (p9.e) zVar2.y();
                    Parcel z13 = eVar4.z();
                    z13.writeString(str);
                    eVar4.S1(z13, 12);
                }
                iVar2.b(null);
                return;
        }
    }

    public y(f0 f0Var, e.d dVar, String str) {
        this.f23199v = f0Var;
        this.f23200w = dVar;
        this.f23201x = str;
    }
}
