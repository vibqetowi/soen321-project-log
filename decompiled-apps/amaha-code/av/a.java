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
public final class a extends k implements l<m1, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f3899u = new a();

    public a() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(m1 m1Var) {
        boolean z10;
        m1 it = m1Var;
        i.g(it, "it");
        g a10 = it.O0().a();
        if (a10 != null && (a10 instanceof v0) && (((v0) a10).c() instanceof u0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
