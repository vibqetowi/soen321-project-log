package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class f1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<LibraryCollection> f5542a;

    public f1(ls.h hVar) {
        this.f5542a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        LibraryCollection libraryCollection;
        ls.d<LibraryCollection> dVar = this.f5542a;
        kotlin.jvm.internal.i.g(it, "it");
        try {
            if (it.isSuccessful()) {
                fe.r result = it.getResult();
                kotlin.jvm.internal.i.f(result, "it.result");
                fe.q qVar = (fe.q) is.u.h2(result);
                if (qVar != null && (libraryCollection = (LibraryCollection) qVar.d(LibraryCollection.class)) != null) {
                    libraryCollection.setId(qVar.b());
                } else {
                    libraryCollection = null;
                }
                dVar.resumeWith(libraryCollection);
                return;
            }
            dVar.resumeWith(null);
        } catch (Exception unused) {
            dVar.resumeWith(null);
        }
    }
}
