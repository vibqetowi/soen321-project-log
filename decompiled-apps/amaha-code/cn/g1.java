package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class g1 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f5551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<LibraryCollection> f5552b;

    public g1(e1 e1Var, ls.h hVar) {
        this.f5551a = e1Var;
        this.f5552b = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper.INSTANCE.e(this.f5551a.f5468b, it);
        this.f5552b.resumeWith(null);
    }
}
