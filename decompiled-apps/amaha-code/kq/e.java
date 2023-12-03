package kq;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.v;
/* compiled from: StressRelaxingActivityFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment", f = "StressRelaxingActivityFragment.kt", l = {680}, m = "confirmFileSize")
/* loaded from: classes2.dex */
public final class e extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public v f23796u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f23797v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.theinnerhour.b2b.fragment.coping.a f23798w;

    /* renamed from: x  reason: collision with root package name */
    public int f23799x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.theinnerhour.b2b.fragment.coping.a aVar, ls.d<? super e> dVar) {
        super(dVar);
        this.f23798w = aVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23797v = obj;
        this.f23799x |= LinearLayoutManager.INVALID_OFFSET;
        return com.theinnerhour.b2b.fragment.coping.a.K(this.f23798w, null, this);
    }
}
