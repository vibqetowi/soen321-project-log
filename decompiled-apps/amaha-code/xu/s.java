package xu;

import kotlin.jvm.internal.y;
import wu.b0;
/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.f implements ss.p<b0, b0, Boolean> {
    public s(l lVar) {
        super(2, lVar);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "equalTypes";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return y.a(l.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // ss.p
    public final Boolean invoke(b0 b0Var, b0 b0Var2) {
        b0 p02 = b0Var;
        b0 p12 = b0Var2;
        kotlin.jvm.internal.i.g(p02, "p0");
        kotlin.jvm.internal.i.g(p12, "p1");
        return Boolean.valueOf(((l) this.receiver).c(p02, p12));
    }
}
