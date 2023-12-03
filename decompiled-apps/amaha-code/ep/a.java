package ep;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.components.resources.model.ResourcesResponse;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ResourceFragment.kt */
/* loaded from: classes2.dex */
public final class a extends k implements l<ResourcesResponse, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f14446u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f14446u = bVar;
    }

    @Override // ss.l
    public final hs.k invoke(ResourcesResponse resourcesResponse) {
        RecyclerView.e eVar;
        ResourcesResponse resourcesResponse2 = resourcesResponse;
        if (resourcesResponse2 != null) {
            ArrayList<ResourceData> newResourceList = resourcesResponse2.getData();
            int i6 = b.f14447z;
            b bVar = this.f14446u;
            bVar.getClass();
            try {
                if (((RecyclerView) bVar._$_findCachedViewById(R.id.rvCustomDbResources)).getAdapter() == null) {
                    if (newResourceList.size() > 0) {
                        ((ConstraintLayout) bVar._$_findCachedViewById(R.id.clResourcesParentContainer)).setVisibility(0);
                        p requireActivity = bVar.requireActivity();
                        i.f(requireActivity, "requireActivity()");
                        ((RecyclerView) bVar._$_findCachedViewById(R.id.rvCustomDbResources)).setAdapter(new dp.a(requireActivity, newResourceList, new c(bVar)));
                    } else {
                        ((ConstraintLayout) bVar._$_findCachedViewById(R.id.clResourcesParentContainer)).setVisibility(8);
                    }
                } else {
                    RecyclerView recyclerView = (RecyclerView) bVar._$_findCachedViewById(R.id.rvCustomDbResources);
                    dp.a aVar = null;
                    if (recyclerView != null) {
                        eVar = recyclerView.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof dp.a) {
                        aVar = (dp.a) eVar;
                    }
                    if (aVar != null) {
                        i.g(newResourceList, "newResourceList");
                        ArrayList<ResourceData> arrayList = aVar.f13190z;
                        int size = arrayList.size();
                        arrayList.addAll(newResourceList);
                        aVar.f2769u.e(size, newResourceList.size());
                    }
                }
                bVar.I(true);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f14448v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
