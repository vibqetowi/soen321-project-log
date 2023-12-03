package tk;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class l extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f33194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f33195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f33196c;

    public l(c cVar, View view, kotlin.jvm.internal.v vVar) {
        this.f33194a = cVar;
        this.f33195b = view;
        this.f33196c = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        String str;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            RecyclerView.m layoutManager = ((RecyclerView) this.f33195b.findViewById(R.id.rvCommunityCardV3)).getLayoutManager();
            kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            c cVar = this.f33194a;
            cVar.f33173w = findFirstCompletelyVisibleItemPosition;
            xk.a aVar = cVar.H;
            if (aVar != null) {
                aVar.B(findFirstCompletelyVisibleItemPosition);
            }
            kotlin.jvm.internal.v vVar = this.f33196c;
            if (vVar.f23467u != cVar.f33173w) {
                if (!cVar.f33174x) {
                    String str2 = gk.a.f16573a;
                    Bundle f = defpackage.e.f("variant", "variant_c", "experiment", "comm_acquisition");
                    User f2 = defpackage.b.f(f, "platform", "android_app");
                    String str3 = null;
                    if (f2 != null) {
                        str = f2.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                    User f10 = defpackage.b.f(f, "domain", str);
                    if (f10 != null) {
                        str3 = f10.getCurrentCourseName();
                    }
                    f.putString("course", str3);
                    Boolean bool = cVar.C;
                    if (bool != null) {
                        f.putBoolean("onboarding_completed", bool.booleanValue());
                    }
                    f.putBoolean("group_joined", !cVar.D.isEmpty());
                    f.putInt("carousel_view_card", cVar.f33173w + 1);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(f, "comm_db_card_manual_scroll");
                }
                vVar.f23467u = cVar.f33173w;
            }
        }
    }
}
