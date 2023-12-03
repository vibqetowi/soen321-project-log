package xu;

import kotlin.jvm.internal.y;
import wu.b0;
import xu.k;
/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.f implements ss.p<b0, b0, Boolean> {
    public r(p pVar) {
        super(2, pVar);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return y.a(p.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // ss.p
    public final Boolean invoke(b0 b0Var, b0 b0Var2) {
        boolean z10;
        b0 p02 = b0Var;
        b0 p12 = b0Var2;
        kotlin.jvm.internal.i.g(p02, "p0");
        kotlin.jvm.internal.i.g(p12, "p1");
        ((p) this.receiver).getClass();
        k.f38114b.getClass();
        l lVar = k.a.f38116b;
        if (lVar.d(p02, p12) && !lVar.d(p12, p02)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
