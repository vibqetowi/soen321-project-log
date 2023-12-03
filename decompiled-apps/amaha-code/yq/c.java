package yq;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.v;
/* compiled from: HappinessMindfulnessDetailFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.mindfulness.HappinessMindfulnessDetailFragment", f = "HappinessMindfulnessDetailFragment.kt", l = {599}, m = "confirmFileSize")
/* loaded from: classes2.dex */
public final class c extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public v f38892u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f38893v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f38894w;

    /* renamed from: x  reason: collision with root package name */
    public int f38895x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ls.d<? super c> dVar) {
        super(dVar);
        this.f38894w = fVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f38893v = obj;
        this.f38895x |= LinearLayoutManager.INVALID_OFFSET;
        return f.K(this.f38894w, null, this);
    }
}
