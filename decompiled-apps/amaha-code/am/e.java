package am;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f647a;

    public e(FirestoreGoalsActivity firestoreGoalsActivity) {
        this.f647a = firestoreGoalsActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        RecyclerView.m mVar;
        RecyclerView recyclerView2;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            FirestoreGoalsActivity firestoreGoalsActivity = this.f647a;
            if (firestoreGoalsActivity.f11153z != null) {
                yp.b bVar = firestoreGoalsActivity.f11150w;
                if (bVar != null && (recyclerView2 = bVar.f38723o) != null) {
                    mVar = recyclerView2.getLayoutManager();
                } else {
                    mVar = null;
                }
                kotlin.jvm.internal.i.e(mVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int findFirstVisibleItemPosition = ((LinearLayoutManager) mVar).findFirstVisibleItemPosition();
                if (firestoreGoalsActivity.A != findFirstVisibleItemPosition) {
                    bm.r rVar = firestoreGoalsActivity.f11153z;
                    if (rVar != null) {
                        rVar.x(findFirstVisibleItemPosition);
                        firestoreGoalsActivity.A = findFirstVisibleItemPosition;
                        return;
                    }
                    kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                    throw null;
                }
            }
        }
    }
}
