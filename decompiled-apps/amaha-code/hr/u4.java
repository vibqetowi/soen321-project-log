package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS118Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/u4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19237w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19239v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19238u = LogHelper.INSTANCE.makeLogTag(u4.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19239v;
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
        return inflater.inflate(R.layout.fragment_screen_s118, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19239v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s118b")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS118Question)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_question")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_btn_two_text")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS118Question)).setText(UtilFunKt.paramsMapToString(A0.get("s118_question")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s118_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s118_btn_two_text")));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonOne)).setOnClickListener(new i4(templateActivity, 5));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS118ButtonTwo)).setOnClickListener(new i4(templateActivity, 6));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 7));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19238u, "Exception", e10);
        }
    }
}
