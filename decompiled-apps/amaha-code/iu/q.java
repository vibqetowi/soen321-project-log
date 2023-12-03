package iu;

import wu.b0;
import wu.w0;
/* compiled from: OverridingUtilTypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class q extends w0 {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r f20709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, xu.d dVar, xu.e eVar) {
        super(true, true, rVar, dVar, eVar);
        this.f20709i = rVar;
    }

    @Override // wu.w0
    public final boolean b(zu.h subType, zu.h superType) {
        kotlin.jvm.internal.i.g(subType, "subType");
        kotlin.jvm.internal.i.g(superType, "superType");
        if (subType instanceof b0) {
            if (superType instanceof b0) {
                return this.f20709i.f20714y.invoke(subType, superType).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
