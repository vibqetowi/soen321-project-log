package hl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements androidx.activity.result.b, BottomNavigationView.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f17657u;

    public /* synthetic */ b(g gVar) {
        this.f17657u = gVar;
    }

    @Override // androidx.activity.result.b
    public final void b(Object obj) {
        jl.e eVar;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        int i6 = g.K;
        g this$0 = this.f17657u;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (kotlin.jvm.internal.i.b(this$0.F, Boolean.FALSE) && (eVar = this$0.f17678v) != null) {
            ta.v.H(kc.f.H(eVar), null, 0, new jl.g(eVar, null), 3);
        }
    }

    @Override // sb.g.b
    public final boolean c(MenuItem item) {
        Intent putExtra;
        int i6 = g.K;
        g this$0 = this.f17657u;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(item, "item");
        switch (item.getItemId()) {
            case R.id.navigation_item_1 /* 2131365060 */:
                this$0.requireActivity().recreate();
                return true;
            case R.id.navigation_item_2 /* 2131365061 */:
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("source", "bottom_nav");
                UtilsKt.fireAnalytics("dashboard_lib_explore_click", analyticsBundle);
                this$0.startActivity(new Intent(this$0.requireActivity(), LibraryActivity.class));
                break;
            case R.id.navigation_item_3 /* 2131365062 */:
                if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    UtilsKt.fireAnalytics("dashboard_cope_click", UtilsKt.getAnalyticsBundle());
                    this$0.startActivity(new Intent(this$0.requireActivity(), BotPwaActivity.class));
                    break;
                }
                break;
            case R.id.navigation_item_4 /* 2131365063 */:
                this$0.H.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class));
                break;
            case R.id.navigation_item_5 /* 2131365064 */:
                if (this$0.E) {
                    if (sp.b.K()) {
                        putExtra = new Intent(this$0.requireContext(), FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                    } else {
                        putExtra = new Intent(this$0.requireContext(), V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                    }
                    this$0.startActivity(putExtra);
                    break;
                } else {
                    Extensions extensions = Extensions.INSTANCE;
                    Context requireContext = this$0.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    String string = this$0.getString(R.string.goalMigrationProgress);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                    extensions.toast(requireContext, string, 1);
                    break;
                }
        }
        return false;
    }
}
