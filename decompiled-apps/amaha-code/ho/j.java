package ho;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import nn.v0;
/* compiled from: ProAssessmentIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/j;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18010w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18012v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18011u = LogHelper.INSTANCE.makeLogTag(j.class);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_pa_assessment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18012v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            LinkedHashMap linkedHashMap = this.f18012v;
            View view2 = (View) linkedHashMap.get(Integer.valueOf((int) R.id.paAssessmentIntroCta));
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null && (view2 = view3.findViewById(R.id.paAssessmentIntroCta)) != null) {
                    linkedHashMap.put(Integer.valueOf((int) R.id.paAssessmentIntroCta), view2);
                } else {
                    view2 = null;
                }
            }
            RobertoButton robertoButton = (RobertoButton) view2;
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new v0(12, this));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18011u, e10);
        }
    }
}
