package hr;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: ScreenS13AudioFileFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS13AudioFileFragment$confirmFileSize$2", f = "ScreenS13AudioFileFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n5 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f18885u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f18886v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(String str, kotlin.jvm.internal.v vVar, ls.d<? super n5> dVar) {
        super(2, dVar);
        this.f18885u = str;
        this.f18886v = vVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n5(this.f18885u, this.f18886v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n5) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f18885u).openConnection());
        kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        this.f18886v.f23467u = httpURLConnection.getContentLength();
        httpURLConnection.disconnect();
        return hs.k.f19476a;
    }
}
