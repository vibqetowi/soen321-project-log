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
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS10Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/p4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p4 extends rr.b {
    public static final /* synthetic */ int F = 0;
    public int D;

    /* renamed from: v  reason: collision with root package name */
    public RelativeLayout f18954v;

    /* renamed from: w  reason: collision with root package name */
    public RelativeLayout f18955w;

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Object> f18956x;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18953u = LogHelper.INSTANCE.makeLogTag(p4.class);

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f18957y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<String> f18958z = new ArrayList<>();
    public ArrayList<String> A = new ArrayList<>();
    public ArrayList<String> B = new ArrayList<>();
    public ArrayList<String> C = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        int i6 = this.D;
        if (i6 > 0) {
            this.D = i6 - 1;
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS10Header);
            HashMap<String, Object> hashMap = this.f18956x;
            if (hashMap != null) {
                robertoTextView.setText(UtilFunKt.paramsMapToString(hashMap.get("s10_dos_heading")));
                J(this.f18957y, this.A);
                return false;
            }
            kotlin.jvm.internal.i.q("params");
            throw null;
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source") && this.D == 0) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity2).Q = true;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity3).J0();
            return false;
        }
        return true;
    }

    public final void J(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llS10List)).removeAllViews();
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                View inflate = activity.getLayoutInflater().inflate(R.layout.row_with_label_desc, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS10List)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(arrayList.get(i6));
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setText(arrayList2.get(i6));
                if (this.C.size() > 0 && kotlin.jvm.internal.i.b(this.C.get(0), arrayList.get(i6))) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity4, R.color.selected_row_text));
                    this.f18954v = relativeLayout;
                }
                if (this.C.size() > 1 && kotlin.jvm.internal.i.b(this.C.get(1), arrayList.get(i6))) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    relativeLayout.setBackgroundColor(g0.a.b(activity5, R.color.selected_row));
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.d(activity6);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity6, R.color.selected_row_text));
                    androidx.fragment.app.p activity7 = getActivity();
                    kotlin.jvm.internal.i.d(activity7);
                    ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity7, R.color.selected_row_text));
                    this.f18955w = relativeLayout;
                }
                relativeLayout.setOnClickListener(new sq.p(this, 12, relativeLayout));
                ((LinearLayout) _$_findCachedViewById(R.id.llS10List)).addView(relativeLayout);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18953u, "Exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        return inflater.inflate(R.layout.fragment_screen_s10, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.E.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            kotlin.jvm.internal.i.g(A0, "<set-?>");
            this.f18956x = A0;
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            HashMap<String, Object> A02 = templateActivity.A0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity3).Q) {
                templateActivity.J0();
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS10Header)).setText(UtilFunKt.paramsMapToString(A02.get("s10_dos_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.btnS10Button)).setText(UtilFunKt.paramsMapToString(A02.get("s10_btn_text")));
            this.f18957y = UtilFunKt.paramsMapToList(A02.get("s10_dos_list_heading"));
            this.A = UtilFunKt.paramsMapToList(A02.get("s10_dos_list_description"));
            this.f18958z = UtilFunKt.paramsMapToList(A02.get("s10_donts_list_heading"));
            this.B = UtilFunKt.paramsMapToList(A02.get("s10_donts_list_description"));
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s10_user_list")) {
                    Object obj = hashMap.get("s10_user_list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    this.C = (ArrayList) obj;
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.btnS10Button)).setOnClickListener(new o4(0, this, A02, templateActivity));
            J(this.f18957y, this.A);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new sq.p(this, 11, templateActivity));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18953u, "exception in on view created", e10);
        }
    }
}
