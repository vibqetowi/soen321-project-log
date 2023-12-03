package tk;

import android.content.Context;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33205u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar) {
        super(1);
        this.f33205u = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(Context context) {
        Context labelContext = context;
        kotlin.jvm.internal.i.g(labelContext, "$this$labelContext");
        c cVar = this.f33205u;
        yk.e eVar = cVar.f33172v;
        if (eVar != null) {
            ta.v.H(kc.f.H(eVar), null, 0, new yk.d(eVar, null), 3);
            eVar.f38676z.e(cVar.getViewLifecycleOwner(), new dk.a(10, new o(labelContext, cVar)));
        }
        return hs.k.f19476a;
    }
}
