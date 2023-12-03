package xu;

import wu.b0;
import wu.i0;
import wu.j1;
import wu.n1;
import wu.w0;
/* compiled from: ClassicTypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class b extends w0.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f38093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j1 f38094b;

    public b(a aVar, j1 j1Var) {
        this.f38093a = aVar;
        this.f38094b = j1Var;
    }

    @Override // wu.w0.b
    public final zu.i a(w0 state, zu.h type) {
        kotlin.jvm.internal.i.g(state, "state");
        kotlin.jvm.internal.i.g(type, "type");
        a aVar = this.f38093a;
        zu.i o02 = aVar.o0(type);
        kotlin.jvm.internal.i.e(o02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        n1 n1Var = n1.INVARIANT;
        i0 e10 = aVar.e(this.f38094b.i((b0) o02, n1Var));
        kotlin.jvm.internal.i.d(e10);
        return e10;
    }
}
