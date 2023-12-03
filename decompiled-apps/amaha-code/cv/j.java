package cv;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final fu.e f12064a;

    /* renamed from: b  reason: collision with root package name */
    public final gv.e f12065b;

    /* renamed from: c  reason: collision with root package name */
    public final Collection<fu.e> f12066c;

    /* renamed from: d  reason: collision with root package name */
    public final ss.l<gt.u, String> f12067d;

    /* renamed from: e  reason: collision with root package name */
    public final e[] f12068e;

    public j() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(fu.e eVar, gv.e eVar2, Collection<fu.e> collection, ss.l<? super gt.u, String> lVar, e... eVarArr) {
        this.f12064a = eVar;
        this.f12065b = eVar2;
        this.f12066c = collection;
        this.f12067d = lVar;
        this.f12068e = eVarArr;
    }

    public /* synthetic */ j(fu.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, g.f12061u);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(fu.e name, e[] eVarArr, ss.l<? super gt.u, String> additionalChecks) {
        this(name, null, null, additionalChecks, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ j(Set set, e[] eVarArr) {
        this(set, eVarArr, i.f12063u);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Collection<fu.e> nameList, e[] eVarArr, ss.l<? super gt.u, String> additionalChecks) {
        this(null, null, nameList, additionalChecks, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.i.g(nameList, "nameList");
        kotlin.jvm.internal.i.g(additionalChecks, "additionalChecks");
    }
}
