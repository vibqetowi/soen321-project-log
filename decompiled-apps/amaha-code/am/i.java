package am;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f651u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f651u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Long l2) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        bm.r rVar;
        RecyclerView recyclerView4;
        Long l10 = l2;
        if (l10 != null) {
            long longValue = l10.longValue();
            FirestoreGoalsActivity firestoreGoalsActivity = this.f651u;
            yp.b bVar = firestoreGoalsActivity.f11150w;
            RecyclerView recyclerView5 = null;
            if (bVar != null) {
                recyclerView = bVar.f38723o;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(firestoreGoalsActivity, 0, false));
            }
            yp.b bVar2 = firestoreGoalsActivity.f11150w;
            if (bVar2 != null) {
                recyclerView2 = bVar2.f38723o;
            } else {
                recyclerView2 = null;
            }
            if (recyclerView2 != null) {
                bm.r rVar2 = new bm.r(firestoreGoalsActivity, longValue * 1000, null, new d(firestoreGoalsActivity));
                firestoreGoalsActivity.f11153z = rVar2;
                recyclerView2.setAdapter(rVar2);
            }
            try {
                if (firestoreGoalsActivity.f11153z != null) {
                    yp.b bVar3 = firestoreGoalsActivity.f11150w;
                    if (bVar3 != null && (recyclerView4 = bVar3.f38723o) != null) {
                        recyclerView4.h0(rVar.H - 1);
                    }
                    bm.r rVar3 = firestoreGoalsActivity.f11153z;
                    if (rVar3 != null) {
                        rVar3.w(rVar3.H - 1, false);
                    } else {
                        kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                        throw null;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(firestoreGoalsActivity.f11149v, e10);
            }
            androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
            yp.b bVar4 = firestoreGoalsActivity.f11150w;
            if (bVar4 != null) {
                recyclerView5 = bVar4.f38723o;
            }
            wVar.a(recyclerView5);
            yp.b bVar5 = firestoreGoalsActivity.f11150w;
            if (bVar5 != null && (recyclerView3 = bVar5.f38723o) != null) {
                recyclerView3.i(new e(firestoreGoalsActivity));
            }
        }
        return hs.k.f19476a;
    }
}
