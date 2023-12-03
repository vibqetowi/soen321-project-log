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
/* compiled from: ScreenS118bFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w4 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19344w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19346v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19345u = LogHelper.INSTANCE.makeLogTag(w4.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19346v;
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
        return inflater.inflate(R.layout.fragment_screen_s118b, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19346v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final String B0 = ((TemplateActivity) activity2).B0();
            if (kotlin.jvm.internal.i.b(B0, "s118-b")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS118bQuestion)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_question")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s118b_btn_two_text")));
            } else if (kotlin.jvm.internal.i.b(B0, "s124")) {
                Object obj = A0.get("s124_question");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS118bQuestion)).setText((String) obj);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s124_btn_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s124_btn_two_text")));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonOne)).setOnClickListener(new View.OnClickListener() { // from class: hr.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    TemplateActivity act = templateActivity;
                    w4 this$0 = this;
                    String slug = B0;
                    switch (i6) {
                        case 0:
                            int i10 = w4.f19344w;
                            kotlin.jvm.internal.i.g(slug, "$slug");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            try {
                                if (kotlin.jvm.internal.i.b(slug, "s124")) {
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity3).s0(new g9());
                                } else if (kotlin.jvm.internal.i.b(slug, "s118-b")) {
                                    act.F.put("prefix", "s86");
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity4).s0(new g9());
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f19345u, "exception", e10);
                                return;
                            }
                        default:
                            int i11 = w4.f19344w;
                            kotlin.jvm.internal.i.g(slug, "$slug");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            try {
                                if (kotlin.jvm.internal.i.b(slug, "s124")) {
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity5).s0(new x4());
                                } else if (kotlin.jvm.internal.i.b(slug, "s118-b")) {
                                    act.F.put("prefix", "s86b");
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity6).s0(new g9());
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f19345u, "exception", e11);
                                return;
                            }
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.btnS118bButtonTwo)).setOnClickListener(new View.OnClickListener() { // from class: hr.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    TemplateActivity act = templateActivity;
                    w4 this$0 = this;
                    String slug = B0;
                    switch (i6) {
                        case 0:
                            int i10 = w4.f19344w;
                            kotlin.jvm.internal.i.g(slug, "$slug");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            try {
                                if (kotlin.jvm.internal.i.b(slug, "s124")) {
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity3).s0(new g9());
                                } else if (kotlin.jvm.internal.i.b(slug, "s118-b")) {
                                    act.F.put("prefix", "s86");
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity4).s0(new g9());
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f19345u, "exception", e10);
                                return;
                            }
                        default:
                            int i11 = w4.f19344w;
                            kotlin.jvm.internal.i.g(slug, "$slug");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(act, "$act");
                            try {
                                if (kotlin.jvm.internal.i.b(slug, "s124")) {
                                    androidx.fragment.app.p activity5 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity5).s0(new x4());
                                } else if (kotlin.jvm.internal.i.b(slug, "s118-b")) {
                                    act.F.put("prefix", "s86b");
                                    androidx.fragment.app.p activity6 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                    ((rr.a) activity6).s0(new g9());
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f19345u, "exception", e11);
                                return;
                            }
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new z0(this, 17));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19345u, "exception", e10);
        }
    }
}
