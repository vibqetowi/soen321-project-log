package pl;

import android.os.Bundle;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N3ScreenFragment;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.HashMap;
import java.util.List;
/* compiled from: N3ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.k implements ss.p<Integer, Long, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N3ScreenFragment f28623u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<?> f28624v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(N3ScreenFragment n3ScreenFragment, List<?> list) {
        super(2);
        this.f28623u = n3ScreenFragment;
        this.f28624v = list;
    }

    @Override // ss.p
    public final hs.k invoke(Integer num, Long l2) {
        NewDynamicParentActivity newDynamicParentActivity;
        HashMap hashMap;
        int i6;
        int intValue = num.intValue();
        Long l10 = l2;
        Bundle bundle = new Bundle();
        N3ScreenFragment n3ScreenFragment = this.f28623u;
        bundle.putString("source", n3ScreenFragment.f11054y);
        bundle.putString("log_entry_number", String.valueOf(intValue + 1));
        if (l10 != null) {
            bundle.putString("log_date", n3ScreenFragment.P().f29790z.d(l10.longValue(), "dd MMMM, hh:mm a"));
        }
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_name", n3ScreenFragment.P().T);
        bundle.putBoolean("main_activity", n3ScreenFragment.P().K);
        bundle.putBoolean("is_revamped", true);
        gk.a.b(bundle, "activity_logs_click");
        androidx.fragment.app.p requireActivity = n3ScreenFragment.requireActivity();
        String str = null;
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            Object j22 = is.u.j2(intValue, this.f28624v);
            if (j22 instanceof HashMap) {
                hashMap = (HashMap) j22;
            } else {
                hashMap = null;
            }
            ql.t P = n3ScreenFragment.P();
            String str2 = n3ScreenFragment.f11054y;
            if (str2 == null) {
                str2 = "";
            }
            Integer num2 = n3ScreenFragment.f11055z;
            if (num2 != null) {
                i6 = num2.intValue();
            } else {
                i6 = -1;
            }
            Object k10 = P.k(i6, str2, "display_n10_id");
            if (k10 instanceof String) {
                str = (String) k10;
            }
            newDynamicParentActivity.K0(str, hashMap);
        }
        return hs.k.f19476a;
    }
}
