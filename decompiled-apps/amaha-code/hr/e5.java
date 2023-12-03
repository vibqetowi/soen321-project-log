package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
/* compiled from: ScreenS123Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/e5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e5 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18337w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18339v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18338u = LogHelper.INSTANCE.makeLogTag(e5.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18339v;
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
        return inflater.inflate(R.layout.fragment_screen_s123, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18339v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS123Heading)).setText(UtilFunKt.paramsMapToString(A0.get("s123_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS123Button)).setText(UtilFunKt.paramsMapToString(A0.get("s123_btn_text")));
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s123_list"));
            int size = paramsMapToList.size();
            int i6 = 0;
            while (i6 < size) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS123List)), false);
                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) inflate;
                int i10 = i6 + 1;
                ((RobertoTextView) linearLayout.findViewById(R.id.textView1)).setText(String.valueOf(i10));
                ((RobertoTextView) linearLayout.findViewById(R.id.textView2)).setText(paramsMapToList.get(i6));
                ((LinearLayout) _$_findCachedViewById(R.id.llS123List)).addView(linearLayout);
                i6 = i10;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS123Button)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d5

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e5 f18311v;

                {
                    this.f18311v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = r2;
                    e5 this$0 = this.f18311v;
                    switch (i11) {
                        case 0:
                            int i12 = e5.f18337w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).t0();
                            return;
                        default:
                            int i13 = e5.f18337w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity4).onBackPressed();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d5

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e5 f18311v;

                {
                    this.f18311v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = r2;
                    e5 this$0 = this.f18311v;
                    switch (i11) {
                        case 0:
                            int i12 = e5.f18337w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).t0();
                            return;
                        default:
                            int i13 = e5.f18337w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity4).onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18338u, "Exception", e10);
        }
    }
}
