package tu;

import dt.n;
import gt.a0;
import gt.c0;
import gt.e0;
import gt.f0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.y;
import ss.l;
import su.e;
import su.p;
import su.t;
import su.u;
import tu.c;
/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class b implements dt.a {

    /* renamed from: b  reason: collision with root package name */
    public final d f33701b = new d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends f implements l<String, InputStream> {
        public a(d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return y.a(d.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // ss.l
        public final InputStream invoke(String str) {
            String p02 = str;
            i.g(p02, "p0");
            ((d) this.receiver).getClass();
            return d.a(p02);
        }
    }

    @Override // dt.a
    public e0 a(vu.l storageManager, a0 builtInsModule, Iterable<? extends jt.b> classDescriptorFactories, jt.c platformDependentDeclarationFilter, jt.a additionalClassPartsProvider, boolean z10) {
        i.g(storageManager, "storageManager");
        i.g(builtInsModule, "builtInsModule");
        i.g(classDescriptorFactories, "classDescriptorFactories");
        i.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        i.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<fu.c> packageFqNames = n.f13394n;
        a aVar = new a(this.f33701b);
        i.g(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList(is.i.H1(packageFqNames, 10));
        for (fu.c cVar : packageFqNames) {
            tu.a.f33700m.getClass();
            String a10 = tu.a.a(cVar);
            InputStream inputStream = (InputStream) aVar.invoke(a10);
            if (inputStream != null) {
                arrayList.add(c.a.a(cVar, storageManager, builtInsModule, inputStream, z10));
            } else {
                throw new IllegalStateException(defpackage.c.r("Resource not found in classpath: ", a10));
            }
        }
        f0 f0Var = new f0(arrayList);
        c0 c0Var = new c0(storageManager, builtInsModule);
        p pVar = new p(f0Var);
        tu.a aVar2 = tu.a.f33700m;
        su.l lVar = new su.l(storageManager, builtInsModule, pVar, new e(builtInsModule, c0Var, aVar2), f0Var, t.r, u.a.f32068u, classDescriptorFactories, c0Var, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.f31018a, null, new ou.b(storageManager), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).M0(lVar);
        }
        return f0Var;
    }
}
