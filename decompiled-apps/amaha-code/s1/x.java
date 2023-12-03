package s1;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import s1.g0;
/* compiled from: NavGraphNavigator.kt */
@g0.b("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls1/x;", "Ls1/g0;", "Ls1/w;", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class x extends g0<w> {

    /* renamed from: c  reason: collision with root package name */
    public final i0 f31243c;

    public x(i0 i0Var) {
        this.f31243c = i0Var;
    }

    @Override // s1.g0
    public final w a() {
        return new w(this);
    }

    @Override // s1.g0
    public final void d(List list, a0 a0Var) {
        boolean z10;
        String str;
        u z11;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            w wVar = (w) fVar.f31115v;
            int i6 = wVar.F;
            String str2 = wVar.H;
            if (i6 == 0 && str2 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i10 = wVar.B;
                if (i10 != 0) {
                    str = wVar.f31230w;
                    if (str == null) {
                        str = String.valueOf(i10);
                    }
                } else {
                    str = "the root navigation";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (str2 != null) {
                z11 = wVar.C(str2, false);
            } else {
                z11 = wVar.z(i6, false);
            }
            if (z11 == null) {
                if (wVar.G == null) {
                    String str3 = wVar.H;
                    if (str3 == null) {
                        str3 = String.valueOf(wVar.F);
                    }
                    wVar.G = str3;
                }
                String str4 = wVar.G;
                kotlin.jvm.internal.i.d(str4);
                throw new IllegalArgumentException(defpackage.b.m("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            this.f31243c.b(z11.f31228u).d(ca.a.O0(b().a(z11, z11.m(fVar.f31116w))), a0Var);
        }
    }
}
