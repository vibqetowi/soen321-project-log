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
/* compiled from: ScreenS1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/p6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18972w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18974v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18973u = LogHelper.INSTANCE.makeLogTag(p6.class);

    @Override // rr.b
    public final boolean I() {
        if (getActivity() != null) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).o0();
                    return false;
                }
            }
        }
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18974v;
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
        return inflater.inflate(R.layout.fragment_screen_s1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18974v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (kotlin.jvm.internal.i.b(((TemplateActivity) activity2).B0(), "s122")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Object obj = ((TemplateActivity) activity3).F.get("prefix");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("s1_" + str + "_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("s1_" + str + "_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(UtilFunKt.paramsMapToString(A0.get("s1_" + str + "_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(A0.get("s1_" + str + "_btn_text")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("s1_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("s1_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(UtilFunKt.paramsMapToString(A0.get("s1_description")));
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(A0.get("s1_btn_text")));
            }
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity4).getIntent().hasExtra("source")) {
                androidx.fragment.app.p activity5 = getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (kotlin.jvm.internal.i.b(((TemplateActivity) activity5).getIntent().getStringExtra("source"), "goals")) {
                    ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("DONE");
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p6 f18920v;

                {
                    this.f18920v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    p6 this$0 = this.f18920v;
                    switch (i6) {
                        case 0:
                            int i10 = p6.f18972w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (r1.b0.c((TemplateActivity) activity7, "source", "goals")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity8).n0();
                                    return;
                                }
                            }
                            androidx.fragment.app.p activity9 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity9).t0();
                            return;
                        default:
                            int i11 = p6.f18972w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity10 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity10).o0();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p6 f18920v;

                {
                    this.f18920v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    p6 this$0 = this.f18920v;
                    switch (i6) {
                        case 0:
                            int i10 = p6.f18972w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity6).getIntent().hasExtra("source")) {
                                androidx.fragment.app.p activity7 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                if (r1.b0.c((TemplateActivity) activity7, "source", "goals")) {
                                    androidx.fragment.app.p activity8 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity8).n0();
                                    return;
                                }
                            }
                            androidx.fragment.app.p activity9 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity9).t0();
                            return;
                        default:
                            int i11 = p6.f18972w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity10 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity10).o0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18973u, "exception", e10);
        }
    }
}
