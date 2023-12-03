package hr;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS113Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/r4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19081w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19083v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19082u = LogHelper.INSTANCE.makeLogTag(r4.class);

    public final void J(int i6) {
        View childAt = ((LinearLayout) _$_findCachedViewById(R.id.lls113List)).getChildAt(i6);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void K(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void M(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            UiUtils.Companion companion = UiUtils.Companion;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            Dialog fullScreenDialog = companion.getFullScreenDialog(R.layout.fragment_screen_popup3, activity);
            ((ImageView) fullScreenDialog.findViewById(R.id.ivEllipses)).setVisibility(4);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Header)).setText(str);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvLabel)).setText(str2);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Desc)).setText(str3);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3ExampleLabel)).setText(str4);
            ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvPop3Example)).setText(str5);
            ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setText(str6);
            fullScreenDialog.show();
            ((RobertoButton) fullScreenDialog.findViewById(R.id.btnPop3Button)).setOnClickListener(new nq.n(fullScreenDialog, 21));
            ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 22));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19082u, "exception", e10);
        }
    }

    public final void O(int i6) {
        View childAt = ((LinearLayout) _$_findCachedViewById(R.id.lls113List)).getChildAt(i6);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final void P(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19083v;
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
        return inflater.inflate(R.layout.fragment_screen_s113, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19083v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashSet, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2 = this.f19082u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (templateActivity.Q) {
                templateActivity.J0();
                return;
            }
            HashMap<String, Object> A0 = templateActivity.A0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new HashSet();
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s113_list"));
            ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s109_popup3_heading_list"));
            ArrayList<String> paramsMapToList3 = UtilFunKt.paramsMapToList(A0.get("s109_popup3_description_list"));
            ArrayList<String> paramsMapToList4 = UtilFunKt.paramsMapToList(A0.get("s109_popup3_example_list"));
            ArrayList<String> paramsMapToList5 = UtilFunKt.paramsMapToList(A0.get("s109_popup3_example_text_list"));
            String paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s109_popup3_btn_text"));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvs113Header)).setText(UtilFunKt.paramsMapToString(A0.get("s113_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.btns113Button)).setText(UtilFunKt.paramsMapToString(A0.get("s113_btn_text")));
            HashMap<String, Object> hashMap = templateActivity.F;
            try {
                if (hashMap.containsKey("s113_user_list")) {
                    Object obj = hashMap.get("s113_user_list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                    xVar.f23469u = (HashSet) obj;
                } else if (hashMap.containsKey("list")) {
                    Object obj2 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    xVar.f23469u = new HashSet((ArrayList) obj2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "exception", e10);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btns113Button)).setOnClickListener(new tk.q(xVar, A0, this, templateActivity, 20));
            int size = paramsMapToList.size();
            boolean z10 = false;
            int i6 = 0;
            while (i6 < size) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_checkbox_text_image, (LinearLayout) _$_findCachedViewById(R.id.lls113List), z10);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).setText(paramsMapToList.get(i6));
                if (((HashSet) xVar.f23469u).contains(paramsMapToList.get(i6))) {
                    K(relativeLayout);
                } else {
                    P(relativeLayout);
                }
                ((AppCompatImageView) relativeLayout.findViewById(R.id.ivRight)).setImageResource(R.drawable.ic_help_outline_gray_24dp);
                int i10 = size;
                str = str2;
                TemplateActivity templateActivity2 = templateActivity;
                int i11 = i6;
                try {
                    ((AppCompatImageView) relativeLayout.findViewById(R.id.ivRight)).setOnClickListener(new q4(this, paramsMapToList2, i6, paramsMapToList, paramsMapToList3, paramsMapToList4, paramsMapToList5, paramsMapToString));
                    relativeLayout.setOnClickListener(new el.c(xVar, paramsMapToList, i11, this, A0, 5));
                    ((LinearLayout) _$_findCachedViewById(R.id.lls113List)).addView(relativeLayout);
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new sq.p(this, 13, templateActivity2));
                    i6 = i11 + 1;
                    size = i10;
                    templateActivity = templateActivity2;
                    str2 = str;
                    z10 = false;
                } catch (Exception e11) {
                    e = e11;
                    LogHelper.INSTANCE.e(str, "exception in on view created", e);
                }
            }
        } catch (Exception e12) {
            e = e12;
            str = str2;
            LogHelper.INSTANCE.e(str, "exception in on view created", e);
        }
    }
}
