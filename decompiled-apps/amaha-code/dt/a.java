package dt;

import gt.a0;
import gt.e0;
import is.u;
import java.util.ServiceLoader;
/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0196a f13350a = C0196a.f13351a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: dt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0196a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C0196a f13351a = new C0196a();

        /* renamed from: b  reason: collision with root package name */
        public static final hs.d<a> f13352b = sp.b.N(2, C0197a.f13353u);

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: dt.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0197a extends kotlin.jvm.internal.k implements ss.a<a> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0197a f13353u = new C0197a();

            public C0197a() {
                super(0);
            }

            @Override // ss.a
            public final a invoke() {
                ServiceLoader implementations = ServiceLoader.load(a.class, a.class.getClassLoader());
                kotlin.jvm.internal.i.f(implementations, "implementations");
                a aVar = (a) u.h2(implementations);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    e0 a(vu.l lVar, a0 a0Var, Iterable<? extends jt.b> iterable, jt.c cVar, jt.a aVar, boolean z10);
}
