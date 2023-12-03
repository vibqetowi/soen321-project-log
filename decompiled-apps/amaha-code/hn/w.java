package hn;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel", f = "LoginSignupReworkViewModel.kt", l = {1061}, m = "initFirebase")
/* loaded from: classes2.dex */
public final class w extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public q f17945u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f17946v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q f17947w;

    /* renamed from: x  reason: collision with root package name */
    public int f17948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar, ls.d<? super w> dVar) {
        super(dVar);
        this.f17947w = qVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f17946v = obj;
        this.f17948x |= LinearLayoutManager.INVALID_OFFSET;
        return q.f(this.f17947w, this);
    }
}
