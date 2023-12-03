package tt;

import gt.p0;
import java.util.Collection;
/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.f implements ss.l<fu.e, Collection<? extends p0>> {
    public h(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(k.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // ss.l
    public final Collection<? extends p0> invoke(fu.e eVar) {
        fu.e p02 = eVar;
        kotlin.jvm.internal.i.g(p02, "p0");
        return k.w((k) this.receiver, p02);
    }
}
