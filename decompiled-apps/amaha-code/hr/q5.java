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
/* compiled from: ScreenS143Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q5 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19017w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19019v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19018u = LogHelper.INSTANCE.makeLogTag(q5.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19019v;
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
        return inflater.inflate(R.layout.fragment_screen_s143, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19019v.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        rr.b y2Var;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            String B0 = templateActivity.B0();
            if (templateActivity.Q) {
                if (kotlin.jvm.internal.i.b(B0, "s143-c")) {
                    templateActivity.J0();
                    return;
                }
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity2).W) {
                    y2Var = new a3();
                } else {
                    y2Var = new y2();
                }
                templateActivity.s0(y2Var);
                return;
            }
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            HashMap<String, Object> hashMap = templateActivity.F;
            Object obj = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            xVar.f23469u = (ArrayList) obj;
            HashMap<String, Object> A0 = templateActivity.A0();
            if (kotlin.jvm.internal.i.b(B0, "s142")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Heading)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_statement_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Rem)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143RemDesc)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s143b_btn_two_text")));
            } else if (kotlin.jvm.internal.i.b(B0, "s143-c")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Heading)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_statement_one")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_statement_two")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Rem)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143RemDesc)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s143c_btn_two_text")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Heading)).setText(UtilFunKt.paramsMapToString(A0.get("s143_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143_statement_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143Rem)).setText(UtilFunKt.paramsMapToString(A0.get("s143_remember_text")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143RemDesc)).setText(UtilFunKt.paramsMapToString(A0.get("s143_remember_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s143_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s143_btn_two_text")));
            }
            if (kotlin.jvm.internal.i.b(B0, "s142")) {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new z0(this, 21));
            }
            CharSequence charSequence3 = "";
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                hashMap.put("log", Boolean.FALSE);
                Object obj2 = hashMap.get("ans");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                xVar.f23469u = (ArrayList) obj2;
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonOne)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonTwo)).setVisibility(8);
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOneDesc);
                if (((ArrayList) xVar.f23469u).size() <= 2) {
                    charSequence2 = "";
                } else {
                    charSequence2 = (CharSequence) ((ArrayList) xVar.f23469u).get(2);
                }
                robertoTextView.setText(charSequence2);
            } else if (templateActivity.J && hashMap.containsKey("s143_user_list")) {
                Object obj3 = hashMap.get("s143_user_list");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                xVar.f23469u = (ArrayList) obj3;
            } else if (hashMap.containsKey("list")) {
                Object obj4 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ?? r02 = (ArrayList) obj4;
                xVar.f23469u = r02;
                hashMap.put("s143_user_list", r02);
            }
            if (kotlin.jvm.internal.i.b(B0, "s142")) {
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOneDesc);
                if (((ArrayList) xVar.f23469u).size() > 2) {
                    charSequence3 = (CharSequence) ((ArrayList) xVar.f23469u).get(2);
                }
                robertoTextView2.setText(charSequence3);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwo)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwoDesc)).setVisibility(8);
                _$_findCachedViewById(R.id.view3).setVisibility(8);
            } else if (kotlin.jvm.internal.i.b(B0, "s143-c")) {
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOneDesc);
                if (((ArrayList) xVar.f23469u).size() <= 0) {
                    charSequence = "";
                } else {
                    charSequence = (CharSequence) ((ArrayList) xVar.f23469u).get(0);
                }
                robertoTextView3.setText(charSequence);
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwoDesc);
                if (((ArrayList) xVar.f23469u).size() > 1) {
                    charSequence3 = (CharSequence) ((ArrayList) xVar.f23469u).get(1);
                }
                robertoTextView4.setText(charSequence3);
            } else {
                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtOneDesc);
                if (((ArrayList) xVar.f23469u).size() > 0) {
                    charSequence3 = (CharSequence) ((ArrayList) xVar.f23469u).get(0);
                }
                robertoTextView5.setText(charSequence3);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwo)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS143StmtTwoDesc)).setVisibility(8);
                _$_findCachedViewById(R.id.view3).setVisibility(8);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonOne)).setOnClickListener(new sq.p(B0, 18, templateActivity));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS143ButtonTwo)).setOnClickListener(new tk.q(B0, templateActivity, xVar, this, 21));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 14));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19018u, "exception", e10);
        }
    }
}
