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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS7Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/z8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z8 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19454w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19456v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19455u = LogHelper.INSTANCE.makeLogTag(z8.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19456v;
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
        return inflater.inflate(R.layout.fragment_screen_s7, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19456v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            Object obj = templateActivity.F.get("thought_index");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s7_heading_list"));
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS7Header);
            String str4 = "";
            if (intValue >= paramsMapToList.size()) {
                str = "";
            } else {
                str = paramsMapToList.get(intValue);
            }
            robertoTextView.setText(str);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS7ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s7_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS7ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s7_btn_two_text")));
            ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s7_list_one"));
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvS71Label);
            if (intValue >= paramsMapToList2.size()) {
                str2 = "";
            } else {
                str2 = paramsMapToList2.get(intValue);
            }
            robertoTextView2.setText(str2);
            ArrayList<String> paramsMapToList3 = UtilFunKt.paramsMapToList(A0.get("s7_list_two"));
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvS72Label);
            if (intValue >= paramsMapToList3.size()) {
                str3 = "";
            } else {
                str3 = paramsMapToList3.get(intValue);
            }
            robertoTextView3.setText(str3);
            ArrayList<String> paramsMapToList4 = UtilFunKt.paramsMapToList(A0.get("s7_description_list"));
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvS7Description);
            if (intValue < paramsMapToList4.size()) {
                str4 = paramsMapToList4.get(intValue);
            }
            robertoTextView4.setText(str4);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS7ButtonOne)).setOnClickListener(new r8(3, this));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS7ButtonTwo)).setOnClickListener(new b8(templateActivity, 4));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 5));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19455u, "Exception in on view created", e10);
        }
    }
}
