package yq;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import hs.k;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: HappinessMindfulnessDetailFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.mindfulness.HappinessMindfulnessDetailFragment$confirmFileSize$2", f = "HappinessMindfulnessDetailFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f38896u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f38897v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, v vVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f38896u = str;
        this.f38897v = vVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f38896u, this.f38897v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f38896u).openConnection());
        kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.f38897v.f23467u = httpURLConnection.getContentLength();
        httpURLConnection.disconnect();
        return k.f19476a;
    }
}
