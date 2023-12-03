package tk;

import android.content.Context;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33184u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(1);
        this.f33184u = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(Context context) {
        Context checkIfFragmentAttached = context;
        kotlin.jvm.internal.i.g(checkIfFragmentAttached, "$this$checkIfFragmentAttached");
        p.a aVar = new p.a(checkIfFragmentAttached);
        c cVar = this.f33184u;
        aVar.a(R.layout.layout_community_v1_card, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new d(cVar, 1));
        return hs.k.f19476a;
    }
}
