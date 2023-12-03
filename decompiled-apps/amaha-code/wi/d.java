package wi;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class d extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f36728u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(0);
        this.f36728u = bVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" deleteExpiredCampaignsFromDb() :", this.f36728u.f36709d);
    }
}
