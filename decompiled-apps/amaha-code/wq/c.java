package wq;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.model.HappinessAndEnviromentModel;
/* compiled from: HappinessAndEnviromentSelectionFragment.java */
/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ HappinessAndEnviromentModel f37056u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f37057v;

    public c(b bVar, HappinessAndEnviromentModel happinessAndEnviromentModel) {
        this.f37057v = bVar;
        this.f37056u = happinessAndEnviromentModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = b.f37052w;
        b bVar = this.f37057v;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("enviromental_model", this.f37056u.getId());
        e eVar = new e();
        eVar.setArguments(bundle);
        ((rr.a) bVar.getActivity()).r0(eVar);
    }
}
