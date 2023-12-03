package cm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: AddCustomGoalDisclaimerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f5309w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f5311v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5310u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f5311v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_add_custom_goal_disclaimer, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f5311v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: cm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f5306v;

            {
                this.f5306v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f5306v;
                switch (i6) {
                    case 0:
                        int i10 = b.f5309w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddCustomGoalsActivity");
                            ((AddCustomGoalsActivity) requireActivity).finish();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f5310u, e10);
                            return;
                        }
                    default:
                        int i11 = b.f5309w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            HashMap<String, Object> appConfig = firebasePersistence.getUser().getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig, "user.appConfig");
                            appConfig.put("custom_goal_disclaimer", Boolean.TRUE);
                            firebasePersistence.updateUserOnFirebase();
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddCustomGoalsActivity");
                            ((AddCustomGoalsActivity) requireActivity2).t0();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f5310u, e11);
                            return;
                        }
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.customDisclaimerCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: cm.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f5306v;

            {
                this.f5306v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f5306v;
                switch (i6) {
                    case 0:
                        int i10 = b.f5309w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddCustomGoalsActivity");
                            ((AddCustomGoalsActivity) requireActivity).finish();
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f5310u, e10);
                            return;
                        }
                    default:
                        int i11 = b.f5309w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                            HashMap<String, Object> appConfig = firebasePersistence.getUser().getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig, "user.appConfig");
                            appConfig.put("custom_goal_disclaimer", Boolean.TRUE);
                            firebasePersistence.updateUserOnFirebase();
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddCustomGoalsActivity");
                            ((AddCustomGoalsActivity) requireActivity2).t0();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f5310u, e11);
                            return;
                        }
                }
            }
        });
    }
}
