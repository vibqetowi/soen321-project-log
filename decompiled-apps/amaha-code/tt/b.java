package tt;

import java.util.Collection;
import java.util.Set;
/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: DeclaredMemberIndex.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33600a = new a();

        @Override // tt.b
        public final Set<fu.e> a() {
            return is.y.f20678u;
        }

        @Override // tt.b
        public final wt.v b(fu.e name) {
            kotlin.jvm.internal.i.g(name, "name");
            return null;
        }

        @Override // tt.b
        public final wt.n c(fu.e name) {
            kotlin.jvm.internal.i.g(name, "name");
            return null;
        }

        @Override // tt.b
        public final Set<fu.e> d() {
            return is.y.f20678u;
        }

        @Override // tt.b
        public final Set<fu.e> e() {
            return is.y.f20678u;
        }

        @Override // tt.b
        public final Collection f(fu.e name) {
            kotlin.jvm.internal.i.g(name, "name");
            return is.w.f20676u;
        }
    }

    Set<fu.e> a();

    wt.v b(fu.e eVar);

    wt.n c(fu.e eVar);

    Set<fu.e> d();

    Set<fu.e> e();

    Collection<wt.q> f(fu.e eVar);
}
