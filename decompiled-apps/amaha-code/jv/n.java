package jv;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlinx.coroutines.c1;
import ls.f;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.k implements ss.p<Integer, f.b, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l<?> f22684u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l<?> lVar) {
        super(2);
        this.f22684u = lVar;
    }

    @Override // ss.p
    public final Integer invoke(Integer num, f.b bVar) {
        int i6;
        int intValue = num.intValue();
        f.b bVar2 = bVar;
        f.c<?> key = bVar2.getKey();
        f.b e10 = this.f22684u.f22677v.e(key);
        int i10 = c1.f23495m;
        if (key != c1.b.f23496u) {
            if (bVar2 != e10) {
                i6 = LinearLayoutManager.INVALID_OFFSET;
            } else {
                i6 = intValue + 1;
            }
            return Integer.valueOf(i6);
        }
        c1 c1Var = (c1) e10;
        c1 c1Var2 = (c1) bVar2;
        while (true) {
            if (c1Var2 == null) {
                c1Var2 = null;
                break;
            } else if (c1Var2 == c1Var || !(c1Var2 instanceof kotlinx.coroutines.internal.p)) {
                break;
            } else {
                kotlinx.coroutines.n P = ((kotlinx.coroutines.internal.p) c1Var2).P();
                if (P != null) {
                    c1Var2 = P.getParent();
                } else {
                    c1Var2 = null;
                }
            }
        }
        if (c1Var2 == c1Var) {
            if (c1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + c1Var2 + ", expected child of " + c1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
