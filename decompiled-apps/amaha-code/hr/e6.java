package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedDispatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS16Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/e6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e6 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18340x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18343w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18341u = LogHelper.INSTANCE.makeLogTag(e6.class);

    /* renamed from: v  reason: collision with root package name */
    public int f18342v = 5;

    public final void J(String str, String str2, boolean z10) {
        View inflate = requireActivity().getLayoutInflater().inflate(R.layout.s16_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS16List)), false);
        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ((RobertoTextView) relativeLayout.findViewById(R.id.tvlabel)).setText(str);
        if (kotlin.jvm.internal.i.b(str, "On paper") || z10) {
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((ImageView) relativeLayout.findViewById(R.id.s16RowImage)).setImageDrawable(a.c.b(requireContext, R.drawable.ic_pen_paper));
        }
        ((RobertoTextView) relativeLayout.findViewById(R.id.tvDescription)).setText(str2);
        relativeLayout.setOnClickListener(new sq.p(this, 20, relativeLayout));
        ((LinearLayout) _$_findCachedViewById(R.id.llS16List)).addView(relativeLayout);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18343w;
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
        return inflater.inflate(R.layout.fragment_screen_s16, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18343w.clear();
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
            String B0 = templateActivity.B0();
            this.f18342v = 5;
            if (kotlin.jvm.internal.i.b(B0, "s16")) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS16Header)).setText(UtilFunKt.paramsMapToString(A0.get("s16_heading")));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS16Button)).setText(UtilFunKt.paramsMapToString(A0.get("s16_btn_text")));
                J(UtilFunKt.paramsMapToString(A0.get("s16_pen_paper_title")), UtilFunKt.paramsMapToString(A0.get("s16_pen_paper_note")), true);
                J(UtilFunKt.paramsMapToString(A0.get("s16_on_app_title")), UtilFunKt.paramsMapToString(A0.get("s16_on_app_note")), false);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS16Button)).setOnClickListener(new sq.p(this, 19, A0));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e6 f18313v;

                {
                    this.f18313v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    int i6 = r2;
                    e6 this$0 = this.f18313v;
                    switch (i6) {
                        case 0:
                            int i10 = e6.f18340x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 28);
                            a1Var.b();
                            return;
                        default:
                            int i11 = e6.f18340x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
                                onBackPressedDispatcher.b();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            if (templateActivity.getIntent().hasExtra("source")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.d6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e6 f18313v;

                {
                    this.f18313v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    int i6 = r2;
                    e6 this$0 = this.f18313v;
                    switch (i6) {
                        case 0:
                            int i10 = e6.f18340x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 28);
                            a1Var.b();
                            return;
                        default:
                            int i11 = e6.f18340x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
                                onBackPressedDispatcher.b();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18341u, "exception in on view created", e10);
        }
    }
}
