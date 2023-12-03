package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class m1 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, MiniCourseMetadata>> f5649a;

    public m1(ls.h hVar) {
        this.f5649a = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f5649a.resumeWith(null);
    }
}
