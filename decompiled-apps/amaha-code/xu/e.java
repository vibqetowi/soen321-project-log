package xu;

import gt.a0;
import java.util.Collection;
import wu.b0;
/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes2.dex */
public abstract class e extends androidx.work.k {
    public abstract void D(fu.b bVar);

    public abstract void E(a0 a0Var);

    public abstract void F(gt.g gVar);

    public abstract Collection<b0> G(gt.e eVar);

    public abstract b0 H(zu.h hVar);

    /* compiled from: KotlinTypeRefiner.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        public static final a f38097b = new a();

        @Override // xu.e
        public final void F(gt.g descriptor) {
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
        }

        @Override // xu.e
        public final Collection<b0> G(gt.e classDescriptor) {
            kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
            Collection<b0> c10 = classDescriptor.l().c();
            kotlin.jvm.internal.i.f(c10, "classDescriptor.typeConstructor.supertypes");
            return c10;
        }

        @Override // xu.e
        public final b0 H(zu.h type) {
            kotlin.jvm.internal.i.g(type, "type");
            return (b0) type;
        }

        @Override // androidx.work.k
        public final b0 y(zu.h type) {
            kotlin.jvm.internal.i.g(type, "type");
            return (b0) type;
        }

        @Override // xu.e
        public final void D(fu.b bVar) {
        }

        @Override // xu.e
        public final void E(a0 a0Var) {
        }
    }
}
