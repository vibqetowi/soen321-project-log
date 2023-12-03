package pl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N30ScreenFragment;
import com.theinnerhour.b2b.model.CourseDayModelV1;
/* compiled from: N30ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.p<String, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N30ScreenFragment f28598u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(N30ScreenFragment n30ScreenFragment) {
        super(2);
        this.f28598u = n30ScreenFragment;
    }

    @Override // ss.p
    public final hs.k invoke(String str, String str2) {
        boolean z10;
        String str3 = str;
        String str4 = str2;
        if (str3 != null) {
            NewDynamicParentActivity newDynamicParentActivity = null;
            N30ScreenFragment n30ScreenFragment = this.f28598u;
            if (str4 != null) {
                androidx.fragment.app.p requireActivity = n30ScreenFragment.requireActivity();
                Intent intent = new Intent(requireActivity, NewDynamicParentActivity.class);
                intent.putExtra("activity_id", str3);
                requireActivity.startActivity(intent);
                androidx.fragment.app.p requireActivity2 = n30ScreenFragment.requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.v0();
                }
                z10 = true;
            } else {
                androidx.fragment.app.p requireActivity3 = n30ScreenFragment.requireActivity();
                Intent intent2 = new Intent(requireActivity3, TemplateActivity.class);
                CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
                courseDayModelV1.setContent_id(str3);
                courseDayModelV1.setAssessment(Boolean.FALSE);
                hs.k kVar = hs.k.f19476a;
                intent2.putExtra("day_plan", courseDayModelV1);
                intent2.putExtra("type", "daily");
                intent2.putExtra("goalSource", "suggested_activity");
                requireActivity3.startActivity(intent2);
                androidx.fragment.app.p requireActivity4 = n30ScreenFragment.requireActivity();
                if (requireActivity4 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity4;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.v0();
                }
                z10 = false;
            }
            Bundle bundle = new Bundle();
            defpackage.d.m(bundle, "course");
            int i6 = N30ScreenFragment.f11045z;
            bundle.putString("activity_name", n30ScreenFragment.P().T);
            bundle.putBoolean("main_activity", n30ScreenFragment.P().K);
            bundle.putBoolean("is_revamped", z10);
            gk.a.b(bundle, "activity_related_act_click");
        }
        return hs.k.f19476a;
    }
}
