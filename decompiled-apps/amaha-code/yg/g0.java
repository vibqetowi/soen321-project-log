package yg;
/* compiled from: SyncHandler.kt */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d0 f38573u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.p000firebaseauthapi.z f38574v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d0 d0Var, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        super(0);
        this.f38573u = d0Var;
        this.f38574v = zVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("Core_SyncHandler scheduleBackgroundSync() : Scheduling background sync, type: ");
        this.f38573u.getClass();
        sb2.append(this.f38574v);
        return sb2.toString();
    }
}
