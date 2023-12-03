package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS8Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/m9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m9 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18846w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18848v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18847u = LogHelper.INSTANCE.makeLogTag(m9.class);

    @Override // rr.b
    public final boolean I() {
        TemplateActivity templateActivity;
        String str;
        Goal y02;
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                TemplateActivity templateActivity2 = null;
                if (activity3 instanceof TemplateActivity) {
                    templateActivity = (TemplateActivity) activity3;
                } else {
                    templateActivity = null;
                }
                if (templateActivity != null && (y02 = templateActivity.y0()) != null) {
                    str = y02.getGoalId();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.i.b(str, "JaR3ditHyPz8IGYXlSVl")) {
                    androidx.fragment.app.p activity4 = getActivity();
                    if (activity4 instanceof TemplateActivity) {
                        templateActivity2 = (TemplateActivity) activity4;
                    }
                    if (templateActivity2 != null) {
                        templateActivity2.J0();
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void J(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
    }

    public final void K(View view) {
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
        LinkedHashMap linkedHashMap = this.f18848v;
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
        return inflater.inflate(R.layout.fragment_screen_s8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18848v.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148 A[Catch: Exception -> 0x023f, TryCatch #0 {Exception -> 0x023f, blocks: (B:3:0x0010, B:6:0x002c, B:8:0x003a, B:10:0x003e, B:33:0x00f0, B:35:0x0126, B:37:0x0142, B:39:0x0148, B:43:0x016e, B:44:0x0176, B:46:0x017c, B:48:0x01bd, B:50:0x01c4, B:49:0x01c1, B:51:0x01f2, B:40:0x015b, B:42:0x0161, B:19:0x0062, B:22:0x006a, B:23:0x009c, B:26:0x00a5, B:27:0x00d6, B:30:0x00df, B:31:0x00ea, B:34:0x00f6), top: B:56:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b A[Catch: Exception -> 0x023f, TryCatch #0 {Exception -> 0x023f, blocks: (B:3:0x0010, B:6:0x002c, B:8:0x003a, B:10:0x003e, B:33:0x00f0, B:35:0x0126, B:37:0x0142, B:39:0x0148, B:43:0x016e, B:44:0x0176, B:46:0x017c, B:48:0x01bd, B:50:0x01c4, B:49:0x01c1, B:51:0x01f2, B:40:0x015b, B:42:0x0161, B:19:0x0062, B:22:0x006a, B:23:0x009c, B:26:0x00a5, B:27:0x00d6, B:30:0x00df, B:31:0x00ea, B:34:0x00f6), top: B:56:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c A[Catch: Exception -> 0x023f, TryCatch #0 {Exception -> 0x023f, blocks: (B:3:0x0010, B:6:0x002c, B:8:0x003a, B:10:0x003e, B:33:0x00f0, B:35:0x0126, B:37:0x0142, B:39:0x0148, B:43:0x016e, B:44:0x0176, B:46:0x017c, B:48:0x01bd, B:50:0x01c4, B:49:0x01c1, B:51:0x01f2, B:40:0x015b, B:42:0x0161, B:19:0x0062, B:22:0x006a, B:23:0x009c, B:26:0x00a5, B:27:0x00d6, B:30:0x00df, B:31:0x00ea, B:34:0x00f6), top: B:56:0x0010 }] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashSet, T] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.HashSet, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        T t3;
        HashMap<String, Object> hashMap;
        Iterator it;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            if (templateActivity.Q && ca.a.k("s8", "s8-b").contains(B0)) {
                templateActivity.J0();
                return;
            }
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            int hashCode = B0.hashCode();
            if (hashCode != 3621) {
                if (hashCode != 3474684) {
                    if (hashCode != 3474687) {
                        if (hashCode == 3481274 && B0.equals("s8-b")) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvS8Header)).setText(UtilFunKt.paramsMapToString(A0.get("s8b_heading")));
                            ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setText(UtilFunKt.paramsMapToString(A0.get("s8b_btn_text")));
                            t3 = UtilFunKt.paramsMapToList(A0.get("s8b_list"));
                            xVar.f23469u = t3;
                            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                            xVar2.f23469u = new HashSet();
                            kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                            xVar3.f23469u = new HashSet();
                            hashMap = templateActivity.F;
                            if (!hashMap.containsKey("list")) {
                                Object obj = hashMap.get("list");
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                xVar2.f23469u = new HashSet((ArrayList) obj);
                            } else if (hashMap.containsKey("s8_user_list")) {
                                Object obj2 = hashMap.get("s8_user_list");
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                                xVar2.f23469u = (HashSet) obj2;
                            }
                            it = ((ArrayList) xVar.f23469u).iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                androidx.fragment.app.p activity2 = getActivity();
                                kotlin.jvm.internal.i.d(activity2);
                                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS8List)), false);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                                FrameLayout frameLayout = (FrameLayout) inflate;
                                ((RobertoTextView) frameLayout.findViewById(R.id.tvLabel)).setText(str);
                                if (((HashSet) xVar2.f23469u).contains(str)) {
                                    J(frameLayout);
                                } else {
                                    K(frameLayout);
                                }
                                frameLayout.setOnClickListener(new l9(xVar2, str, this, xVar, xVar3, B0, A0));
                                ((LinearLayout) _$_findCachedViewById(R.id.llS8List)).addView(frameLayout);
                                it = it;
                                xVar = xVar;
                                xVar3 = xVar3;
                            }
                            ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar2, this, templateActivity, xVar3, xVar, A0));
                            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                        }
                        t3 = new ArrayList();
                        xVar.f23469u = t3;
                        kotlin.jvm.internal.x xVar22 = new kotlin.jvm.internal.x();
                        xVar22.f23469u = new HashSet();
                        kotlin.jvm.internal.x xVar32 = new kotlin.jvm.internal.x();
                        xVar32.f23469u = new HashSet();
                        hashMap = templateActivity.F;
                        if (!hashMap.containsKey("list")) {
                        }
                        it = ((ArrayList) xVar.f23469u).iterator();
                        while (it.hasNext()) {
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar22, this, templateActivity, xVar32, xVar, A0));
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                    } else if (B0.equals("s134")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS8Header)).setText(UtilFunKt.paramsMapToString(A0.get("s134_heading")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setText(UtilFunKt.paramsMapToString(A0.get("s134_btn")));
                        t3 = UtilFunKt.paramsMapToList(A0.get("s134_list"));
                        xVar.f23469u = t3;
                        kotlin.jvm.internal.x xVar222 = new kotlin.jvm.internal.x();
                        xVar222.f23469u = new HashSet();
                        kotlin.jvm.internal.x xVar322 = new kotlin.jvm.internal.x();
                        xVar322.f23469u = new HashSet();
                        hashMap = templateActivity.F;
                        if (!hashMap.containsKey("list")) {
                        }
                        it = ((ArrayList) xVar.f23469u).iterator();
                        while (it.hasNext()) {
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar222, this, templateActivity, xVar322, xVar, A0));
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                    } else {
                        t3 = new ArrayList();
                        xVar.f23469u = t3;
                        kotlin.jvm.internal.x xVar2222 = new kotlin.jvm.internal.x();
                        xVar2222.f23469u = new HashSet();
                        kotlin.jvm.internal.x xVar3222 = new kotlin.jvm.internal.x();
                        xVar3222.f23469u = new HashSet();
                        hashMap = templateActivity.F;
                        if (!hashMap.containsKey("list")) {
                        }
                        it = ((ArrayList) xVar.f23469u).iterator();
                        while (it.hasNext()) {
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar2222, this, templateActivity, xVar3222, xVar, A0));
                        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                    }
                } else if (B0.equals("s131")) {
                    t3 = UtilFunKt.paramsMapToList(A0.get("s28b_list"));
                    xVar.f23469u = t3;
                    kotlin.jvm.internal.x xVar22222 = new kotlin.jvm.internal.x();
                    xVar22222.f23469u = new HashSet();
                    kotlin.jvm.internal.x xVar32222 = new kotlin.jvm.internal.x();
                    xVar32222.f23469u = new HashSet();
                    hashMap = templateActivity.F;
                    if (!hashMap.containsKey("list")) {
                    }
                    it = ((ArrayList) xVar.f23469u).iterator();
                    while (it.hasNext()) {
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar22222, this, templateActivity, xVar32222, xVar, A0));
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                } else {
                    t3 = new ArrayList();
                    xVar.f23469u = t3;
                    kotlin.jvm.internal.x xVar222222 = new kotlin.jvm.internal.x();
                    xVar222222.f23469u = new HashSet();
                    kotlin.jvm.internal.x xVar322222 = new kotlin.jvm.internal.x();
                    xVar322222.f23469u = new HashSet();
                    hashMap = templateActivity.F;
                    if (!hashMap.containsKey("list")) {
                    }
                    it = ((ArrayList) xVar.f23469u).iterator();
                    while (it.hasNext()) {
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar222222, this, templateActivity, xVar322222, xVar, A0));
                    ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
                }
            }
            if (B0.equals("s8")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS8Header)).setText(UtilFunKt.paramsMapToString(A0.get("s8_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setText(UtilFunKt.paramsMapToString(A0.get("s8_btn_text")));
                t3 = UtilFunKt.paramsMapToList(A0.get("s8_list"));
                xVar.f23469u = t3;
                kotlin.jvm.internal.x xVar2222222 = new kotlin.jvm.internal.x();
                xVar2222222.f23469u = new HashSet();
                kotlin.jvm.internal.x xVar3222222 = new kotlin.jvm.internal.x();
                xVar3222222.f23469u = new HashSet();
                hashMap = templateActivity.F;
                if (!hashMap.containsKey("list")) {
                }
                it = ((ArrayList) xVar.f23469u).iterator();
                while (it.hasNext()) {
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar2222222, this, templateActivity, xVar3222222, xVar, A0));
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
            }
            t3 = new ArrayList();
            xVar.f23469u = t3;
            kotlin.jvm.internal.x xVar22222222 = new kotlin.jvm.internal.x();
            xVar22222222.f23469u = new HashSet();
            kotlin.jvm.internal.x xVar32222222 = new kotlin.jvm.internal.x();
            xVar32222222.f23469u = new HashSet();
            hashMap = templateActivity.F;
            if (!hashMap.containsKey("list")) {
            }
            it = ((ArrayList) xVar.f23469u).iterator();
            while (it.hasNext()) {
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS8Button)).setOnClickListener(new l9(B0, xVar22222222, this, templateActivity, xVar32222222, xVar, A0));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new d9(this, 1, templateActivity));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18847u, "exception in on view created", e10);
        }
    }
}
