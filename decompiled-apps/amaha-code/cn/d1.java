package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class d1 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, LibraryCollection>> f5452a;

    public d1(ls.h hVar) {
        this.f5452a = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f5452a.resumeWith(null);
    }
}
