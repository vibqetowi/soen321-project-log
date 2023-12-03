package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
/* compiled from: ScreenS23Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s6 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19154z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19159y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19155u = LogHelper.INSTANCE.makeLogTag(s6.class);

    /* renamed from: v  reason: collision with root package name */
    public int f19156v = -1;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, String> f19157w = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f19158x = new ArrayList<>();

    public final void J() {
        try {
            if (!this.f19158x.isEmpty()) {
                ((LinearLayout) _$_findCachedViewById(R.id.llS23List)).removeAllViews();
                for (int i6 = 0; i6 < 2; i6++) {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    View inflate = activity.getLayoutInflater().inflate(R.layout.row_top_2_selection, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS23List)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(this.f19158x.get(i6));
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setText(this.f19157w.get(this.f19158x.get(i6)));
                    if (i6 == this.f19156v) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
                        androidx.fragment.app.p activity4 = getActivity();
                        kotlin.jvm.internal.i.d(activity4);
                        ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity4, R.color.selected_row_text));
                    } else {
                        relativeLayout.setBackgroundResource(0);
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.d(activity5);
                        ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity5, R.color.title_high_contrast));
                        androidx.fragment.app.p activity6 = getActivity();
                        kotlin.jvm.internal.i.d(activity6);
                        ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity6, R.color.unselected_row_text));
                    }
                    relativeLayout.setOnClickListener(new ak.d(i6, 21, this));
                    ((LinearLayout) _$_findCachedViewById(R.id.llS23List)).addView(relativeLayout);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19155u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19159y;
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
        return inflater.inflate(R.layout.fragment_screen_s23, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19159y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity2).A0();
            String B0 = templateActivity.B0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity3).Q) {
                templateActivity.J0();
                return;
            }
            if (kotlin.jvm.internal.i.b(B0, "s23")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS23Header)).setText(UtilFunKt.paramsMapToString(A0.get("s23_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS23ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s23_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS23ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s23_btn_two_text")));
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("heading_desc_map")) {
                    Object obj = hashMap.get("heading_desc_map");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                    this.f19157w = (HashMap) obj;
                }
                if (templateActivity.J && hashMap.containsKey("s23_user_list")) {
                    Object obj2 = hashMap.get("s23_user_list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    this.f19158x = (ArrayList) obj2;
                    if (hashMap.containsKey("s23_user_data")) {
                        Object obj3 = hashMap.get("s23_user_data");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                        i6 = ((Integer) obj3).intValue();
                    } else {
                        i6 = -1;
                    }
                    this.f19156v = i6;
                } else if (hashMap.containsKey("list_selection")) {
                    Object obj4 = hashMap.get("list_selection");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    this.f19158x = (ArrayList) obj4;
                } else if (hashMap.containsKey("list")) {
                    Object obj5 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    this.f19158x = (ArrayList) obj5;
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS23ButtonOne)).setOnClickListener(new z0(this, 25));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS23ButtonTwo)).setOnClickListener(new o4(4, this, A0, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 19));
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19155u, "exception in onviewcreated", e10);
        }
    }
}
