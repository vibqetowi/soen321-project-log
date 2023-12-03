package wo;

import com.theinnerhour.b2b.utils.ApiNetworkStatus;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class r implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f36986b;

    public r(n nVar, ls.h hVar) {
        this.f36985a = nVar;
        this.f36986b = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f36985a.f36961c.i(ApiNetworkStatus.ERROR);
        this.f36986b.resumeWith(null);
    }
}
