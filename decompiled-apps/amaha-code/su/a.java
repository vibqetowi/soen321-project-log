package su;

import java.io.InputStream;
import tu.c;
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.k implements ss.l<fu.c, gt.d0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f31974u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f31974u = bVar;
    }

    @Override // ss.l
    public final gt.d0 invoke(fu.c cVar) {
        tu.c cVar2;
        fu.c fqName = cVar;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        b bVar = this.f31974u;
        ft.u uVar = (ft.u) bVar;
        uVar.getClass();
        InputStream b10 = uVar.f31979b.b(fqName);
        if (b10 != null) {
            cVar2 = c.a.a(fqName, uVar.f31978a, uVar.f31980c, b10, false);
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return null;
        }
        l lVar = bVar.f31981d;
        if (lVar != null) {
            cVar2.M0(lVar);
            return cVar2;
        }
        kotlin.jvm.internal.i.q("components");
        throw null;
    }
}
