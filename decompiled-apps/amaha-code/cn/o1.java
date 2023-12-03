package cn;

import com.theinnerhour.b2b.model.LearningHubModel;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class o1 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, LearningHubModel>> f5665a;

    public o1(ls.h hVar) {
        this.f5665a = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f5665a.resumeWith(null);
    }
}
