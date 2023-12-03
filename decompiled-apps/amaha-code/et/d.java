package et;

import et.e;
import gt.u;
import is.w;
import java.util.List;
import kotlin.jvm.internal.i;
import vu.l;
/* compiled from: FunctionClassScope.kt */
/* loaded from: classes2.dex */
public final class d extends pu.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l storageManager, b containingClass) {
        super(storageManager, containingClass);
        i.g(storageManager, "storageManager");
        i.g(containingClass, "containingClass");
    }

    @Override // pu.e
    public final List<u> h() {
        gt.e eVar = this.f28996b;
        i.e(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        b bVar = (b) eVar;
        int ordinal = bVar.A.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return w.f20676u;
            }
            return ca.a.O0(e.a.a(bVar, true));
        }
        return ca.a.O0(e.a.a(bVar, false));
    }
}
