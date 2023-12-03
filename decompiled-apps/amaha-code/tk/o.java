package tk;

import android.content.Context;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<vk.d, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f33203u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f33204v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, c cVar) {
        super(1);
        this.f33203u = context;
        this.f33204v = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(vk.d dVar) {
        Context context = this.f33203u;
        p.a aVar = new p.a(context);
        c cVar = this.f33204v;
        aVar.a(R.layout.layout_not_v4_dashboard_community_card_v3, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new i7.a(9, context, cVar, dVar));
        return hs.k.f19476a;
    }
}
