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
/* compiled from: ScreenS1AFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/l6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18748w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18750v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18749u = LogHelper.INSTANCE.makeLogTag(l6.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18750v;
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
        this.f18750v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("s1a_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(A0.get("s1a_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(UtilFunKt.paramsMapToString(A0.get("s1a_description")));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(A0.get("s1a_btn_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.k6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ l6 f18689v;

                {
                    this.f18689v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    l6 this$0 = this.f18689v;
                    switch (i6) {
                        case 0:
                            int i10 = l6.f18748w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).s0(new n6());
                            return;
                        default:
                            int i11 = l6.f18748w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).o0();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.k6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ l6 f18689v;

                {
                    this.f18689v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    l6 this$0 = this.f18689v;
                    switch (i6) {
                        case 0:
                            int i10 = l6.f18748w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).s0(new n6());
                            return;
                        default:
                            int i11 = l6.f18748w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).o0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18749u, "exception", e10);
        }
    }
}
