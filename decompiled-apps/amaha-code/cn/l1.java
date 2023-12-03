package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class l1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, MiniCourseMetadata>> f5640a;

    public l1(ls.h hVar) {
        this.f5640a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> task) {
        MiniCourseMetadata miniCourseMetadata;
        String str;
        kotlin.jvm.internal.i.g(task, "task");
        boolean isSuccessful = task.isSuccessful();
        ls.d<hs.f<String, MiniCourseMetadata>> dVar = this.f5640a;
        hs.f fVar = null;
        if (isSuccessful && !task.getResult().f15006v.f17520b.f23278u.isEmpty()) {
            fe.g gVar = (fe.g) is.u.i2(task.getResult().e());
            if (gVar != null) {
                miniCourseMetadata = (MiniCourseMetadata) gVar.d(MiniCourseMetadata.class);
            } else {
                miniCourseMetadata = null;
            }
            if (miniCourseMetadata != null) {
                str = miniCourseMetadata.getSlug();
            } else {
                str = null;
            }
            if (str != null) {
                fVar = new hs.f(str, miniCourseMetadata);
            }
            dVar.resumeWith(fVar);
            return;
        }
        dVar.resumeWith(null);
    }
}
