package tk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import java.util.Timer;
import tk.c;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33193u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar) {
        super(1);
        this.f33193u = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(Context context) {
        boolean z10;
        Context checkIfFragmentAttached = context;
        kotlin.jvm.internal.i.g(checkIfFragmentAttached, "$this$checkIfFragmentAttached");
        c cVar = this.f33193u;
        cVar.f33174x = true;
        View inflate = LayoutInflater.from(checkIfFragmentAttached).inflate(R.layout.layout_community_v2_card, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rvCardV2);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new CenterZoomLayoutManager(cVar.requireActivity(), 0, false, 0.0f, 1.5f, null, 32, null));
        }
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.rvCardV2);
        if (recyclerView2 != null) {
            Boolean bool = cVar.C;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            recyclerView2.setAdapter(new c.a(z10, true ^ cVar.D.isEmpty()));
        }
        new androidx.recyclerview.widget.w().a((RecyclerView) inflate.findViewById(R.id.rvCardV2));
        Timer timer = cVar.f33175y;
        if (timer != null) {
            timer.scheduleAtFixedRate(new h(inflate, cVar), 5000L, 5000L);
        }
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.rvCardV2);
        if (recyclerView3 != null) {
            recyclerView3.i(new i(cVar));
        }
        RecyclerView recyclerView4 = (RecyclerView) inflate.findViewById(R.id.rvCardV2);
        if (recyclerView4 != null) {
            recyclerView4.post(new g(inflate, cVar, 0));
        }
        inflate.setOnClickListener(new e(cVar, 2));
        FrameLayout frameLayout = (FrameLayout) cVar.requireView().findViewById(R.id.llCommunityVariantContainer);
        if (frameLayout != null) {
            frameLayout.addView(inflate);
        }
        c.J(cVar, 0);
        return hs.k.f19476a;
    }
}
