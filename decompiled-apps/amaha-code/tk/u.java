package tk;

import android.content.Context;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33215u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<String> f33216v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c cVar, ArrayList arrayList) {
        super(1);
        this.f33215u = cVar;
        this.f33216v = arrayList;
    }

    @Override // ss.l
    public final hs.k invoke(Context context) {
        Context checkIfFragmentAttached = context;
        kotlin.jvm.internal.i.g(checkIfFragmentAttached, "$this$checkIfFragmentAttached");
        p.a aVar = new p.a(checkIfFragmentAttached);
        c cVar = this.f33215u;
        aVar.a(R.layout.layout_not_v4_db_community_card, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new dd.a(cVar, 26, this.f33216v));
        return hs.k.f19476a;
    }
}
