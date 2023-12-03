package hr;

import android.content.Context;
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
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS17Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18453w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18455v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18454u = LogHelper.INSTANCE.makeLogTag(g6.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18455v;
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
        return inflater.inflate(R.layout.fragment_screen_s17, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18455v.clear();
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
            final TemplateActivity templateActivity = (TemplateActivity) activity2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MMMM yyyy");
            Date date = new Date();
            ((RobertoEditText) _$_findCachedViewById(R.id.edt_letter)).setHint(UtilFunKt.paramsMapToString(A0.get("s17_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS17ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s17_btn_two_text")));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDate)).setText(simpleDateFormat.format(date));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDay)).setText(simpleDateFormat2.format(date));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvMonthYear)).setText(simpleDateFormat3.format(date));
            if (templateActivity.F.containsKey("s17_user_data")) {
                Object obj = templateActivity.F.get("s17_user_data");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.edt_letter)).setText((String) obj);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS17ButtonTwo)).setOnClickListener(new o4(2, this, A0, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new View.OnClickListener() { // from class: hr.f6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r3;
                    g6 this$0 = this;
                    TemplateActivity act = templateActivity;
                    switch (i6) {
                        case 0:
                            int i10 = g6.f18453w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.F.put("prefix", "s17_");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            RobertoEditText edt_letter = (RobertoEditText) this$0._$_findCachedViewById(R.id.edt_letter);
                            kotlin.jvm.internal.i.f(edt_letter, "edt_letter");
                            ((TemplateActivity) activity3).D0(context, edt_letter);
                            act.s0(new b0());
                            return;
                        default:
                            int i11 = g6.f18453w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.F.put("s17_user_data", String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.edt_letter)).getText()));
                            Context context2 = this$0.getContext();
                            kotlin.jvm.internal.i.d(context2);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context2, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 29);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener() { // from class: hr.f6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r3;
                    g6 this$0 = this;
                    TemplateActivity act = templateActivity;
                    switch (i6) {
                        case 0:
                            int i10 = g6.f18453w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.F.put("prefix", "s17_");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            RobertoEditText edt_letter = (RobertoEditText) this$0._$_findCachedViewById(R.id.edt_letter);
                            kotlin.jvm.internal.i.f(edt_letter, "edt_letter");
                            ((TemplateActivity) activity3).D0(context, edt_letter);
                            act.s0(new b0());
                            return;
                        default:
                            int i11 = g6.f18453w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.F.put("s17_user_data", String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.edt_letter)).getText()));
                            Context context2 = this$0.getContext();
                            kotlin.jvm.internal.i.d(context2);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context2, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 29);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 18));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18454u, "exception in on view created", e10);
        }
    }
}
