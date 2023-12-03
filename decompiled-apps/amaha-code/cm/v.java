package cm;

import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.ArrayList;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.k implements ss.l<ArrayList<RecommendedActivityModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5384u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p pVar) {
        super(1);
        this.f5384u = pVar;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<RecommendedActivityModel> arrayList) {
        RobertoButton robertoButton;
        RobertoButton robertoButton2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        ProgressBar progressBar;
        ArrayList<RecommendedActivityModel> arrayList2 = arrayList;
        if (arrayList2 != null) {
            p pVar = this.f5384u;
            yp.k kVar = pVar.f5370v;
            if (kVar != null && (progressBar = kVar.f) != null) {
                Extensions.INSTANCE.gone(progressBar);
            }
            if (pVar.A == null) {
                yp.k kVar2 = pVar.f5370v;
                if (kVar2 != null && (recyclerView = kVar2.f38845g) != null) {
                    RobertoButton robertoButton3 = kVar2.f38841b;
                    if (robertoButton3 != null) {
                        Extensions.INSTANCE.visible(robertoButton3);
                    }
                    CenterZoomLayoutManager centerZoomLayoutManager = new CenterZoomLayoutManager(pVar.requireActivity(), 0, false, 0.3f, 0.1f, null, 32, null);
                    yp.k kVar3 = pVar.f5370v;
                    RecyclerView recyclerView5 = null;
                    if (kVar3 != null) {
                        recyclerView2 = kVar3.f38845g;
                    } else {
                        recyclerView2 = null;
                    }
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutManager(centerZoomLayoutManager);
                    }
                    androidx.fragment.app.p requireActivity = pVar.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    bm.s sVar = new bm.s(requireActivity, arrayList2, recyclerView, new r(pVar));
                    pVar.A = sVar;
                    yp.k kVar4 = pVar.f5370v;
                    if (kVar4 != null) {
                        recyclerView5 = kVar4.f38845g;
                    }
                    if (recyclerView5 != null) {
                        recyclerView5.setAdapter(sVar);
                    }
                    yp.k kVar5 = pVar.f5370v;
                    if (kVar5 != null && (recyclerView4 = kVar5.f38845g) != null) {
                        recyclerView4.i(new s(pVar));
                    }
                    yp.k kVar6 = pVar.f5370v;
                    if (kVar6 != null && (recyclerView3 = kVar6.f38845g) != null) {
                        recyclerView3.post(new tl.o(3, pVar));
                    }
                    ((androidx.recyclerview.widget.r) pVar.f5374z.getValue()).a(recyclerView);
                }
                yp.k kVar7 = pVar.f5370v;
                if (kVar7 != null && (robertoButton2 = kVar7.f38841b) != null) {
                    robertoButton2.setOnClickListener(DebouncedOnClickListener.wrap(new n(pVar, 1)));
                }
            }
            yp.k kVar8 = pVar.f5370v;
            if (kVar8 != null && (robertoButton = kVar8.f38841b) != null) {
                Extensions.INSTANCE.visible(robertoButton);
            }
        }
        return hs.k.f19476a;
    }
}
