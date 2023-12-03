package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class d0<T> implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f5451u;

    public d0(j0 j0Var) {
        this.f5451u = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        ArrayList<String> arrayList;
        MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) t3;
        ArrayList<String> arrayList2 = null;
        if (miniCourseMetadata != null) {
            arrayList = miniCourseMetadata.getDomains();
        } else {
            arrayList = null;
        }
        kotlin.jvm.internal.i.d(arrayList);
        j0 j0Var = this.f5451u;
        Integer valueOf = Integer.valueOf(j0.e(j0Var, (String) is.u.g2(arrayList)));
        MiniCourseMetadata miniCourseMetadata2 = (MiniCourseMetadata) t10;
        if (miniCourseMetadata2 != null) {
            arrayList2 = miniCourseMetadata2.getDomains();
        }
        kotlin.jvm.internal.i.d(arrayList2);
        return sp.b.g(valueOf, Integer.valueOf(j0.e(j0Var, (String) is.u.g2(arrayList2))));
    }
}
