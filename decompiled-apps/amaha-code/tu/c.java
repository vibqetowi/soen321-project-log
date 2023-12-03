package tu;

import au.l;
import bu.a;
import gt.a0;
import gu.e;
import gu.n;
import java.io.InputStream;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import su.s;
import vu.l;
/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* loaded from: classes2.dex */
public final class c extends s implements dt.b {

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(fu.c fqName, l storageManager, a0 module, InputStream inputStream, boolean z10) {
            au.l lVar;
            i.g(fqName, "fqName");
            i.g(storageManager, "storageManager");
            i.g(module, "module");
            try {
                bu.a aVar = bu.a.f;
                bu.a a10 = a.C0098a.a(inputStream);
                bu.a aVar2 = bu.a.f;
                if (a10.b(aVar2)) {
                    e eVar = new e();
                    bu.b.a(eVar);
                    l.a aVar3 = au.l.E;
                    aVar3.getClass();
                    gu.d dVar = new gu.d(inputStream);
                    n nVar = (n) aVar3.a(dVar, eVar);
                    try {
                        dVar.a(0);
                        gu.b.b(nVar);
                        lVar = (au.l) nVar;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f23476u = nVar;
                        throw e10;
                    }
                } else {
                    lVar = null;
                }
                ca.a.z(inputStream, null);
                if (lVar != null) {
                    return new c(fqName, storageManager, module, lVar, a10);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + a10 + ". Please update Kotlin");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ca.a.z(inputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public c(fu.c cVar, vu.l lVar, a0 a0Var, au.l lVar2, bu.a aVar) {
        super(cVar, lVar, a0Var, lVar2, aVar);
    }

    @Override // kt.i0, kt.p
    public final String toString() {
        return "builtins package fragment for " + this.f23848y + " from " + mu.a.j(this);
    }
}
