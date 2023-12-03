package fm;

import android.content.Context;
/* compiled from: FirestoreGoalsViewModel.kt */
/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.k implements ss.a<em.d> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f15600u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a aVar) {
        super(0);
        this.f15600u = aVar;
    }

    @Override // ss.a
    public final em.d invoke() {
        Context applicationContext = this.f15600u.f2382x.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
        return new em.d(applicationContext);
    }
}
