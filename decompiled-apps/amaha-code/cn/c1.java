package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class c1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, LibraryCollection>> f5444a;

    public c1(ls.h hVar) {
        this.f5444a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> task) {
        String str;
        LibraryCollection libraryCollection;
        kotlin.jvm.internal.i.g(task, "task");
        boolean isSuccessful = task.isSuccessful();
        ls.d<hs.f<String, LibraryCollection>> dVar = this.f5444a;
        hs.f fVar = null;
        if (isSuccessful && !task.getResult().f15006v.f17520b.f23278u.isEmpty()) {
            fe.g gVar = (fe.g) is.u.i2(task.getResult().e());
            if (gVar != null) {
                str = gVar.b();
            } else {
                str = null;
            }
            fe.g gVar2 = (fe.g) is.u.i2(task.getResult().e());
            if (gVar2 != null) {
                libraryCollection = (LibraryCollection) gVar2.d(LibraryCollection.class);
            } else {
                libraryCollection = null;
            }
            if (libraryCollection != null && str != null) {
                fVar = new hs.f(str, libraryCollection);
            }
            dVar.resumeWith(fVar);
            return;
        }
        dVar.resumeWith(null);
    }
}
