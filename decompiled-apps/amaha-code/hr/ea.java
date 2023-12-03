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
/* compiled from: ScreenS98Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/ea;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ea extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18352w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18354v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18353u = LogHelper.INSTANCE.makeLogTag(ea.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18354v;
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
        return inflater.inflate(R.layout.fragment_screen_s98, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18354v.clear();
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
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            Object obj = templateActivity.F.get("other_duration");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
            int parseInt = Integer.parseInt((String) obj);
            Object obj2 = templateActivity.F.get("sleep_duration");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
            int parseInt2 = Integer.parseInt((String) obj2);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS98Header)).setText(UtilFunKt.paramsMapToString(A0.get("s98_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS98ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s98_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS98ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s98_btn_two_text")));
            StringBuilder sb2 = new StringBuilder();
            int i6 = parseInt - parseInt2;
            sb2.append(i6);
            sb2.append(" hrs");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS98TextView)).setText(sb2.toString());
            if (i6 > 0) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS98TextTitle)).setText(UtilFunKt.paramsMapToString(A0.get("s98_more_text_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS98TextDesc)).setText(UtilFunKt.paramsMapToString(A0.get("s98_more_text_description")));
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS98TextTitle)).setText(UtilFunKt.paramsMapToString(A0.get("s98_equal_text_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS98TextDesc)).setText(UtilFunKt.paramsMapToString(A0.get("s98_equal_text_description")));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS98ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.da

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ea f18322v;

                {
                    this.f18322v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    ea this$0 = this.f18322v;
                    switch (i10) {
                        case 0:
                            int i11 = ea.f18352w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            activity3.onBackPressed();
                            return;
                        default:
                            int i12 = ea.f18352w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).s0(new ga());
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.btnS98ButtonTwo)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.da

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ea f18322v;

                {
                    this.f18322v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    ea this$0 = this.f18322v;
                    switch (i10) {
                        case 0:
                            int i11 = ea.f18352w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            activity3.onBackPressed();
                            return;
                        default:
                            int i12 = ea.f18352w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).s0(new ga());
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 16));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18353u, "exception", e10);
        }
    }
}
