package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
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
/* compiled from: ScreenS6Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/t8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t8 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19209z = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f19211v;

    /* renamed from: w  reason: collision with root package name */
    public RelativeLayout f19212w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19214y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19210u = LogHelper.INSTANCE.makeLogTag(t8.class);

    /* renamed from: x  reason: collision with root package name */
    public String f19213x = "";

    public final void J(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_activity_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS6List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setText(str);
            if (kotlin.jvm.internal.i.b(this.f19211v, str)) {
                K(relativeLayout);
                ScrollView scrollView = (ScrollView) _$_findCachedViewById(R.id.scrollview);
                if (scrollView != null) {
                    scrollView.post(new nn.f(this, 10, relativeLayout));
                }
            }
            relativeLayout.setOnClickListener(new sq.p(this, 27, relativeLayout));
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.llS6List);
            if (linearLayout != null) {
                linearLayout.addView(relativeLayout);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19210u, "exception", e10);
        }
    }

    public final void K(RelativeLayout relativeLayout) {
        try {
            RelativeLayout relativeLayout2 = this.f19212w;
            if (relativeLayout2 != null) {
                relativeLayout2.setBackgroundColor(0);
                RelativeLayout relativeLayout3 = this.f19212w;
                kotlin.jvm.internal.i.d(relativeLayout3);
                ((TextView) relativeLayout3.findViewById(R.id.tvUnderline)).setVisibility(0);
                RelativeLayout relativeLayout4 = this.f19212w;
                kotlin.jvm.internal.i.d(relativeLayout4);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RobertoTextView) relativeLayout4.findViewById(R.id.label)).setTextColor(g0.a.b(activity, R.color.unselected_row_text));
            }
            this.f19212w = relativeLayout;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setTextColor(g0.a.b(activity3, R.color.selected_row_text));
            ((TextView) relativeLayout.findViewById(R.id.tvUnderline)).setVisibility(4);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19210u, "Exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19214y;
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
        return inflater.inflate(R.layout.fragment_screen_s6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19214y.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:3:0x0014, B:6:0x0034, B:8:0x003c, B:11:0x0043, B:12:0x0047, B:14:0x0050, B:18:0x0068, B:21:0x0070, B:23:0x0076, B:25:0x0082, B:27:0x00a9, B:26:0x0096, B:28:0x00bc, B:43:0x00ee, B:31:0x00c6, B:47:0x011e, B:34:0x00d0, B:37:0x00da, B:51:0x014c, B:53:0x0178, B:40:0x00e4, B:44:0x0115, B:48:0x0143, B:54:0x0182, B:57:0x018a, B:59:0x0190, B:63:0x01ae, B:65:0x01b2, B:70:0x01c7, B:71:0x01ce, B:72:0x01d2, B:74:0x01d8, B:75:0x01e2, B:60:0x019b, B:62:0x01a1, B:67:0x01b8), top: B:80:0x0014, inners: #1 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f19210u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            String B0 = templateActivity.B0();
            if (templateActivity.Q) {
                if (!kotlin.jvm.internal.i.b(B0, "s12c") && !kotlin.jvm.internal.i.b(B0, "s12-c")) {
                    templateActivity.J0();
                    return;
                }
                templateActivity.s0(new q5());
                return;
            }
            ArrayList<String> arrayList = new ArrayList();
            int hashCode = B0.hashCode();
            HashMap<String, Object> hashMap = templateActivity.F;
            switch (hashCode) {
                case 3619:
                    if (!B0.equals("s6")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6_btn_text")));
                    if (A0.containsKey("s6_error")) {
                        this.f19213x = UtilFunKt.paramsMapToString(A0.get("s6_error"));
                        break;
                    }
                    break;
                case 112287:
                    if (!B0.equals("s6b")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_btn_text")));
                    break;
                case 112288:
                    if (!B0.equals("s6c")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_btn_text")));
                    break;
                case 3474628:
                    if (!B0.equals("s117")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6_btn_text")));
                    if (A0.containsKey("s6_error")) {
                    }
                    break;
                case 3474654:
                    if (!B0.equals("s122")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_btn_text")));
                    break;
                case 3479352:
                    if (!B0.equals("s6-b")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_btn_text")));
                    break;
                case 3479353:
                    if (!B0.equals("s6-c")) {
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_heading")));
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6c_btn_text")));
                    break;
                case 107714218:
                    if (B0.equals("s12-c")) {
                        if (hashMap.containsKey("singleSelection") && kotlin.jvm.internal.i.b(hashMap.get("singleSelection"), Boolean.TRUE)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_heading_oneselection")));
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvS6Header)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_heading_multipleselection")));
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setText(UtilFunKt.paramsMapToString(A0.get("s6b_btn_text")));
                        break;
                    } else {
                        break;
                    }
                    break;
            }
            if (templateActivity.J && hashMap.containsKey("s6_user_list")) {
                Object obj = hashMap.get("s6_user_list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                arrayList = (ArrayList) obj;
            } else if (hashMap.containsKey("list")) {
                Object obj2 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                arrayList = (ArrayList) obj2;
                hashMap.put("s6_user_list", arrayList);
            }
            if (templateActivity.J && hashMap.containsKey("s6_user_data")) {
                try {
                    Object obj3 = hashMap.get("s6_user_data");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    this.f19211v = (String) obj3;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, "exception", e10);
                }
            }
            for (String str2 : arrayList) {
                J(str2);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS6Button)).setOnClickListener(new sq.p(this, 26, B0));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r8(1, this));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "exception in on view created", e11);
        }
    }
}
