package hq;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import hs.k;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: DepressionPleasurableAudioFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.assessmentActivities.DepressionPleasurableAudioFragment$confirmFileSize$2", f = "DepressionPleasurableAudioFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f18101u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f18102v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, v vVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f18101u = str;
        this.f18102v = vVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f18101u, this.f18102v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f18101u).openConnection());
        kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.f18102v.f23467u = httpURLConnection.getContentLength();
        httpURLConnection.disconnect();
        return k.f19476a;
    }
}
