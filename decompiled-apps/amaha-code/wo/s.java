package wo;

import android.net.Uri;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.l<Uri, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f36987u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f36988v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(n nVar, ls.d<? super String> dVar) {
        super(1);
        this.f36987u = nVar;
        this.f36988v = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(Uri uri) {
        Uri uri2 = uri;
        ls.d<String> dVar = this.f36988v;
        n nVar = this.f36987u;
        try {
            String uri3 = uri2.toString();
            kotlin.jvm.internal.i.f(uri3, "tt.toString()");
            nVar.f36961c.i(ApiNetworkStatus.SUCCESS);
            dVar.resumeWith(uri3);
        } catch (Exception e10) {
            dVar.resumeWith(null);
            nVar.f36961c.i(ApiNetworkStatus.EXCEPTION);
            LogHelper.INSTANCE.e(nVar.f36959a, e10);
        }
        return hs.k.f19476a;
    }
}
