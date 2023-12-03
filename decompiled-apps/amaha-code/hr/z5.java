package hr;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: ScreenS15Fragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS15Fragment", f = "ScreenS15Fragment.kt", l = {296}, m = "confirmFileSize")
/* loaded from: classes2.dex */
public final class z5 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public kotlin.jvm.internal.v f19440u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f19441v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c6 f19442w;

    /* renamed from: x  reason: collision with root package name */
    public int f19443x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(c6 c6Var, ls.d<? super z5> dVar) {
        super(dVar);
        this.f19442w = c6Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f19441v = obj;
        this.f19443x |= LinearLayoutManager.INVALID_OFFSET;
        return c6.K(this.f19442w, null, this);
    }
}
