package tk;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class i extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f33190a;

    public i(c cVar) {
        this.f33190a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i10;
        String str;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            String str2 = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                i10 = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            } else {
                i10 = 0;
            }
            c cVar = this.f33190a;
            cVar.f33173w = i10;
            xk.a aVar = cVar.H;
            if (aVar != null) {
                aVar.B(i10);
            }
            boolean z10 = cVar.f33174x;
            if (!z10 && !z10) {
                String str3 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                String str4 = cVar.B;
                bundle.putString("variant", str4);
                bundle.putString("experiment", "comm_acquisition");
                bundle.putString("platform", "android_app");
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                User f = defpackage.b.f(bundle, "domain", str);
                if (f != null) {
                    str2 = f.getCurrentCourseName();
                }
                bundle.putString("course", str2);
                bundle.putBoolean("group_joined", !cVar.D.isEmpty());
                Boolean bool = cVar.C;
                if (bool != null) {
                    bundle.putBoolean("onboarding_completed", bool.booleanValue());
                }
                if (ca.a.k("variant_b", "variant_c").contains(str4)) {
                    bundle.putInt("carousel_view_card", i10 + 1);
                }
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "comm_db_card_manual_scroll");
            }
            c.J(cVar, i10);
        }
    }
}
