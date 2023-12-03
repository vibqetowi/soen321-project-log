package av;

import gt.g;
import gt.u0;
import gt.v0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import wu.m1;
/* compiled from: TypeUtils.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<m1, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final b f3900u = new b();

    public b() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(m1 m1Var) {
        boolean z10;
        m1 it = m1Var;
        i.g(it, "it");
        g a10 = it.O0().a();
        if (a10 != null && ((a10 instanceof u0) || (a10 instanceof v0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
