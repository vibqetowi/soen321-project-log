package hr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS25Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/x6;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x6 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f19390w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f19392v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19391u = LogHelper.INSTANCE.makeLogTag(x6.class);

    public final void J() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editText1)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText editText1 = (RobertoEditText) _$_findCachedViewById(R.id.editText1);
            kotlin.jvm.internal.i.f(editText1, "editText1");
            ((TemplateActivity) activity).D0(context, editText1);
        } else if (((RobertoEditText) _$_findCachedViewById(R.id.editText2)).hasFocus()) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context2 = getContext();
            kotlin.jvm.internal.i.d(context2);
            RobertoEditText editText2 = (RobertoEditText) _$_findCachedViewById(R.id.editText2);
            kotlin.jvm.internal.i.f(editText2, "editText2");
            ((TemplateActivity) activity2).D0(context2, editText2);
        } else if (((RobertoEditText) _$_findCachedViewById(R.id.editText3)).hasFocus()) {
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context3 = getContext();
            kotlin.jvm.internal.i.d(context3);
            RobertoEditText editText3 = (RobertoEditText) _$_findCachedViewById(R.id.editText3);
            kotlin.jvm.internal.i.f(editText3, "editText3");
            ((TemplateActivity) activity3).D0(context3, editText3);
        }
    }

    public final void K() {
        String valueOf = String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText1)).getText());
        String valueOf2 = String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText2)).getText());
        String valueOf3 = String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText3)).getText());
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity).F.put("list", ca.a.k(valueOf, valueOf2, valueOf3));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19392v;
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
        return inflater.inflate(R.layout.fragment_screen_s25, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19392v.clear();
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity).Q) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).Q = false;
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).I = false;
            }
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity4).A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView25)).setText(UtilFunKt.paramsMapToString(A0.get("s25_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setHint(UtilFunKt.paramsMapToString(A0.get("s25_placeholder_one")));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText2)).setHint(UtilFunKt.paramsMapToString(A0.get("s25_placeholder_two")));
            ((RobertoEditText) _$_findCachedViewById(R.id.editText3)).setHint(UtilFunKt.paramsMapToString(A0.get("s25_placeholder_three")));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(A0.get("s25_btn_two_text")));
            final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ArrayList();
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity5).J) {
                androidx.fragment.app.p activity6 = getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity6).F.containsKey("list")) {
                    androidx.fragment.app.p activity7 = getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Object obj = ((TemplateActivity) activity7).F.get("list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    xVar.f23469u = (ArrayList) obj;
                }
            }
            if ((!((Collection) xVar.f23469u).isEmpty()) && ((ArrayList) xVar.f23469u).size() >= 3) {
                ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).post(new Runnable(this) { // from class: hr.v6

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ x6 f19298v;

                    {
                        this.f19298v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r3;
                        kotlin.jvm.internal.x answers = xVar;
                        x6 this$0 = this.f19298v;
                        switch (i6) {
                            case 0:
                                int i10 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText1)).setText((CharSequence) ((ArrayList) answers.f23469u).get(0));
                                return;
                            case 1:
                                int i11 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText2)).setText((CharSequence) ((ArrayList) answers.f23469u).get(1));
                                return;
                            default:
                                int i12 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText3)).setText((CharSequence) ((ArrayList) answers.f23469u).get(2));
                                return;
                        }
                    }
                });
                ((RobertoEditText) _$_findCachedViewById(R.id.editText2)).post(new Runnable(this) { // from class: hr.v6

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ x6 f19298v;

                    {
                        this.f19298v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r3;
                        kotlin.jvm.internal.x answers = xVar;
                        x6 this$0 = this.f19298v;
                        switch (i6) {
                            case 0:
                                int i10 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText1)).setText((CharSequence) ((ArrayList) answers.f23469u).get(0));
                                return;
                            case 1:
                                int i11 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText2)).setText((CharSequence) ((ArrayList) answers.f23469u).get(1));
                                return;
                            default:
                                int i12 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText3)).setText((CharSequence) ((ArrayList) answers.f23469u).get(2));
                                return;
                        }
                    }
                });
                ((RobertoEditText) _$_findCachedViewById(R.id.editText3)).post(new Runnable(this) { // from class: hr.v6

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ x6 f19298v;

                    {
                        this.f19298v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r3;
                        kotlin.jvm.internal.x answers = xVar;
                        x6 this$0 = this.f19298v;
                        switch (i6) {
                            case 0:
                                int i10 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText1)).setText((CharSequence) ((ArrayList) answers.f23469u).get(0));
                                return;
                            case 1:
                                int i11 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText2)).setText((CharSequence) ((ArrayList) answers.f23469u).get(1));
                                return;
                            default:
                                int i12 = x6.f19390w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(answers, "$answers");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText3)).setText((CharSequence) ((ArrayList) answers.f23469u).get(2));
                                return;
                        }
                    }
                });
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new sq.p(this, 22, A0));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.w6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x6 f19351v;

                {
                    this.f19351v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    x6 this$0 = this.f19351v;
                    switch (i6) {
                        case 0:
                            int i10 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(1, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity8 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity8).onBackPressed();
                            return;
                        default:
                            int i12 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            this$0.J();
                            androidx.fragment.app.p activity9 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity9).s0(new b0());
                            return;
                    }
                }
            });
            androidx.fragment.app.p activity8 = getActivity();
            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Intent intent = ((TemplateActivity) activity8).getIntent();
            if (intent != null && intent.hasExtra("source")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.fragment.app.p activity9 = getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (kotlin.jvm.internal.i.b(((TemplateActivity) activity9).getIntent().getStringExtra("source"), "goals")) {
                    androidx.fragment.app.p activity10 = getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity10).y0();
                    if (y02 != null) {
                        str = y02.getGoalId();
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                    }
                }
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.w6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x6 f19351v;

                {
                    this.f19351v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    x6 this$0 = this.f19351v;
                    switch (i6) {
                        case 0:
                            int i10 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(1, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity82 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity82, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity82).onBackPressed();
                            return;
                        default:
                            int i12 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            this$0.J();
                            androidx.fragment.app.p activity92 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity92, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity92).s0(new b0());
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.w6

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x6 f19351v;

                {
                    this.f19351v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    x6 this$0 = this.f19351v;
                    switch (i6) {
                        case 0:
                            int i10 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(1, this$0);
                            a1Var.b();
                            return;
                        case 1:
                            int i11 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity82 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity82, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity82).onBackPressed();
                            return;
                        default:
                            int i12 = x6.f19390w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K();
                            this$0.J();
                            androidx.fragment.app.p activity92 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity92, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity92).s0(new b0());
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19391u, "exception in on view created", e10);
        }
    }
}
