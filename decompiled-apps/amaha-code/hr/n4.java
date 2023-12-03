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
/* compiled from: ScreenS10BFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/n4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n4 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public RelativeLayout f18880v;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18884z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18879u = LogHelper.INSTANCE.makeLogTag(n4.class);

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f18881w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f18882x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18883y = new ArrayList<>();

    public final void J(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llS10BList)).removeAllViews();
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                View inflate = activity.getLayoutInflater().inflate(R.layout.row_with_label_desc, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS10BList)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(arrayList.get(i6));
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setText(arrayList2.get(i6));
                if (this.f18881w.size() > 0 && kotlin.jvm.internal.i.b(this.f18881w.get(0), arrayList.get(i6))) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity4, R.color.selected_row_text));
                    this.f18880v = relativeLayout;
                }
                relativeLayout.setOnClickListener(new sq.p(this, 10, relativeLayout));
                ((LinearLayout) _$_findCachedViewById(R.id.llS10BList)).addView(relativeLayout);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18879u, "Exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18884z;
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
        return inflater.inflate(R.layout.fragment_screen_s10b, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18884z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            kotlin.jvm.internal.i.g(((TemplateActivity) activity).A0(), "<set-?>");
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            if (templateActivity.Q) {
                templateActivity.J0();
                return;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s10-b")) {
                if (A0.containsKey("s10b_heading")) {
                    Object obj = A0.get("s10b_heading");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS10BHeader)).setText((String) obj);
                }
                if (A0.containsKey("s10b_btn_text")) {
                    Object obj2 = A0.get("s10b_btn_text");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS10BButton)).setText((String) obj2);
                }
                if (A0.containsKey("s10b_heading_list")) {
                    this.f18882x = UtilFunKt.paramsMapToList(A0.get("s10b_heading_list"));
                }
                if (A0.containsKey("s10b_description_list")) {
                    this.f18883y = UtilFunKt.paramsMapToList(A0.get("s10b_description_list"));
                }
            }
            boolean z10 = templateActivity.J;
            HashMap<String, Object> hashMap = templateActivity.F;
            if (z10 && hashMap.containsKey("s10b_user_data")) {
                Object obj3 = hashMap.get("s10b_user_data");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                this.f18881w = (ArrayList) obj3;
            } else if (templateActivity.J && hashMap.containsKey("list")) {
                Object obj4 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                this.f18881w = (ArrayList) obj4;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS10BButton)).setOnClickListener(new sq.p(this, 9, templateActivity));
            J(this.f18882x, this.f18883y);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18879u, "exception in on view created", e10);
        }
    }
}
