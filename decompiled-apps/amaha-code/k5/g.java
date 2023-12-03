package k5;

import g.v;
import java.util.List;
import java.util.Map;
import ss.p;
import w5.e0;
/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.k implements p<String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<Map<String, Object>> f22996u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.f22996u = list;
    }

    @Override // ss.p
    public final hs.k invoke(String str, Integer num) {
        e0 e0Var = e0.f36453a;
        try {
            h5.p.c().execute(new v(num, 19, this.f22996u));
        } catch (Exception unused) {
        }
        return hs.k.f19476a;
    }
}
