package ql;

import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NewDynamicActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class d0 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f29700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, String>> f29701b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(t tVar, ls.d<? super hs.f<String, String>> dVar) {
        this.f29700a = tVar;
        this.f29701b = dVar;
    }

    @Override // ya.e
    public final void onFailure(Exception e10) {
        kotlin.jvm.internal.i.g(e10, "e");
        LogHelper.INSTANCE.e(this.f29700a.f29789y, e10);
        this.f29701b.resumeWith(null);
    }
}
