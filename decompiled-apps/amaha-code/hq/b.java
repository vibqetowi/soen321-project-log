package hq;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.v;
/* compiled from: DepressionPleasurableAudioFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.assessmentActivities.DepressionPleasurableAudioFragment", f = "DepressionPleasurableAudioFragment.kt", l = {262}, m = "confirmFileSize")
/* loaded from: classes2.dex */
public final class b extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public v f18097u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f18098v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f18099w;

    /* renamed from: x  reason: collision with root package name */
    public int f18100x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ls.d<? super b> dVar) {
        super(dVar);
        this.f18099w = eVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f18098v = obj;
        this.f18100x |= LinearLayoutManager.INVALID_OFFSET;
        return e.K(this.f18099w, null, this);
    }
}
