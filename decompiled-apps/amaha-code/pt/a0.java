package pt;

import java.util.Map;
/* compiled from: Jsr305Settings.kt */
/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.k implements ss.a<String[]> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b0 f28847u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(0);
        this.f28847u = b0Var;
    }

    @Override // ss.a
    public final String[] invoke() {
        js.a aVar = new js.a();
        b0 b0Var = this.f28847u;
        aVar.add(b0Var.f28851a.f28913u);
        h0 h0Var = b0Var.f28852b;
        if (h0Var != null) {
            aVar.add("under-migration:" + h0Var.f28913u);
        }
        for (Map.Entry<fu.c, h0> entry : b0Var.f28853c.entrySet()) {
            aVar.add("@" + entry.getKey() + ':' + entry.getValue().f28913u);
        }
        ca.a.o(aVar);
        return (String[]) aVar.toArray(new String[0]);
    }
}
