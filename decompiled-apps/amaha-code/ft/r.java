package ft;

import dv.b;
import ft.k;
import kotlin.jvm.internal.x;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class r extends b.a<gt.e, k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x<k.a> f15906b;

    public r(String str, x<k.a> xVar) {
        this.f15905a = str;
        this.f15906b = xVar;
    }

    @Override // dv.b.c
    public final Object a() {
        k.a aVar = this.f15906b.f23469u;
        if (aVar == null) {
            return k.a.NOT_CONSIDERED;
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, ft.k$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, ft.k$a] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, ft.k$a] */
    @Override // dv.b.c
    public final boolean c(Object obj) {
        gt.e javaClassDescriptor = (gt.e) obj;
        kotlin.jvm.internal.i.g(javaClassDescriptor, "javaClassDescriptor");
        String n12 = ca.a.n1(javaClassDescriptor, this.f15905a);
        boolean contains = v.f15910b.contains(n12);
        x<k.a> xVar = this.f15906b;
        if (contains) {
            xVar.f23469u = k.a.HIDDEN;
        } else if (v.f15911c.contains(n12)) {
            xVar.f23469u = k.a.VISIBLE;
        } else if (v.f15909a.contains(n12)) {
            xVar.f23469u = k.a.DROP;
        }
        if (xVar.f23469u == null) {
            return true;
        }
        return false;
    }
}
