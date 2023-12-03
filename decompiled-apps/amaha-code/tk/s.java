package tk;

import android.content.Context;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.l<vk.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f33212u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f33213v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, c cVar) {
        super(1);
        this.f33212u = context;
        this.f33213v = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(vk.a aVar) {
        Context context = this.f33212u;
        p.a aVar2 = new p.a(context);
        c cVar = this.f33213v;
        aVar2.a(R.layout.layout_not_v4_dashboard_community_card_v4, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new i7.a(10, aVar, context, cVar));
        return hs.k.f19476a;
    }
}
