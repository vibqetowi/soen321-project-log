package kq;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: StressRelaxingActivityFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment$confirmFileSize$2", f = "StressRelaxingActivityFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f23800u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f23801v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, v vVar, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f23800u = str;
        this.f23801v = vVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f23800u, this.f23801v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f23800u).openConnection());
        kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.f23801v.f23467u = httpURLConnection.getContentLength();
        httpURLConnection.disconnect();
        return hs.k.f19476a;
    }
}
