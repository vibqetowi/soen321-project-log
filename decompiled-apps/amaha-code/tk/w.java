package tk;

import android.content.Context;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.k implements ss.l<Context, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33221u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<String> f33222v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c cVar, ArrayList arrayList) {
        super(1);
        this.f33221u = cVar;
        this.f33222v = arrayList;
    }

    @Override // ss.l
    public final hs.k invoke(Context context) {
        Context checkIfFragmentAttached = context;
        kotlin.jvm.internal.i.g(checkIfFragmentAttached, "$this$checkIfFragmentAttached");
        p.a aVar = new p.a(checkIfFragmentAttached);
        c cVar = this.f33221u;
        aVar.a(R.layout.communities_experiment_layout, (ViewGroup) cVar.requireView().findViewById(R.id.llCommunityVariantContainer), new i7.a(11, this.f33222v, checkIfFragmentAttached, cVar));
        return hs.k.f19476a;
    }
}
