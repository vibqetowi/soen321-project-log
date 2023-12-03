package hr;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: ScreenS13AudioFileFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS13AudioFileFragment", f = "ScreenS13AudioFileFragment.kt", l = {250}, m = "confirmFileSize")
/* loaded from: classes2.dex */
public final class m5 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public kotlin.jvm.internal.v f18837u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f18838v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p5 f18839w;

    /* renamed from: x  reason: collision with root package name */
    public int f18840x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(p5 p5Var, ls.d<? super m5> dVar) {
        super(dVar);
        this.f18839w = p5Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f18838v = obj;
        this.f18840x |= LinearLayoutManager.INVALID_OFFSET;
        return p5.K(this.f18839w, null, this);
    }
}
