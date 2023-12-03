package yq;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.activity.HappinessMindfulnessActivity;
import com.theinnerhour.b2b.model.MindfullnessModel;
/* compiled from: HappinessMindfulnessSelectionFragment.java */
/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MindfullnessModel f38916u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f38917v;

    public h(g gVar, MindfullnessModel mindfullnessModel) {
        this.f38917v = gVar;
        this.f38916u = mindfullnessModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = g.f38912w;
        g gVar = this.f38917v;
        ((HappinessMindfulnessActivity) gVar.getActivity()).C = true;
        Bundle bundle = new Bundle();
        bundle.putString("mindfulness_model", this.f38916u.getId());
        f fVar = new f();
        fVar.setArguments(bundle);
        ((rr.a) gVar.getActivity()).r0(fVar);
    }
}
