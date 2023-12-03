package hr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult16Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18990w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18992v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18991u = LogHelper.INSTANCE.makeLogTag(q0.class);

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (r1.b0.c((TemplateActivity) activity2, "source", "goals")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (!((TemplateActivity) activity3).R) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).o0();
                    return false;
                }
            }
        }
        androidx.fragment.app.p activity5 = getActivity();
        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity5).R = false;
        return true;
    }

    public final void J() {
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) _$_findCachedViewById(R.id.ivEllipses));
        a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
        a1Var.f1346d = new fq.s(this, 7);
        a1Var.b();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18992v;
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
        return inflater.inflate(R.layout.fragment_screen_result_16, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18992v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x03f9, code lost:
        if (r13.getData().containsKey("result_16") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03fb, code lost:
        r0 = com.theinnerhour.b2b.utils.UtilFunKt.result16MapToObject(r13.getData().get("result_16"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x040d, code lost:
        if ((!r0.isEmpty()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x040f, code lost:
        r0 = is.u.o2(r0);
        r14.f23469u = r0;
        r4.put("list", ((com.theinnerhour.b2b.model.ScreenResult16Model) r0).getList());
        r4.put("s66_user_data", r14.f23469u);
        r4.put("model-16", r14.f23469u);
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.theinnerhour.b2b.model.ScreenResult16Model] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            templateActivity.Q = false;
            HashMap<String, Object> A0 = templateActivity.A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity3).y0();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult16Model(Utils.INSTANCE.getTimeInSeconds(), "");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("r16_heading")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("r16_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView7)).setText(UtilFunKt.paramsMapToString(A0.get("r16_first_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("r16_second_label")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(UtilFunKt.paramsMapToString(A0.get("r16_third_label")));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("r16_btn_one_text")));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button2);
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                paramsMapToString = "DONE";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("r16_btn_two_text"));
            }
            robertoButton.setText(paramsMapToString);
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.p0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q0 f18941v;

                {
                    this.f18941v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    q0 this$0 = this.f18941v;
                    switch (i6) {
                        case 0:
                            int i10 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity4).I = false;
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity5).R = true;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity6).onBackPressed();
                            return;
                        case 1:
                            int i11 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        case 2:
                            int i12 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        default:
                            int i13 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new ek.p(y02, templateActivity, "result_16", xVar, this, 5));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.p0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q0 f18941v;

                {
                    this.f18941v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    q0 this$0 = this.f18941v;
                    switch (i6) {
                        case 0:
                            int i10 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity4).I = false;
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity5).R = true;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity6).onBackPressed();
                            return;
                        case 1:
                            int i11 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        case 2:
                            int i12 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        default:
                            int i13 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new sq.p(this, 3, templateActivity));
            HashMap<String, Object> hashMap = templateActivity.F;
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                hashMap.put("log", Boolean.FALSE);
                Object obj = hashMap.get("data");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                xVar.f23469u = (ScreenResult16Model) obj;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView6)).setText(((ScreenResult16Model) xVar.f23469u).getText());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
                Calendar calendar = Calendar.getInstance();
                long j10 = 1000;
                calendar.setTimeInMillis(((ScreenResult16Model) xVar.f23469u).getFromTime() * j10);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(((ScreenResult16Model) xVar.f23469u).getTillTime() * j10);
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat.format(calendar.getTime()) + " to " + simpleDateFormat.format(calendar2.getTime()));
                Iterator<String> it = ((ScreenResult16Model) xVar.f23469u).getList().iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    View inflate = activity4.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    View view2 = (ConstraintLayout) inflate;
                    ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setText(it.next());
                    ViewGroup.LayoutParams layoutParams = ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    aVar.setMargins(0, 0, 0, 16);
                    ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.setMargins(0, 0, 0, 0);
                    view2.setLayoutParams(layoutParams3);
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(view2);
                }
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 7));
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                return;
            }
            if (!templateActivity.J && !templateActivity.I) {
                Object obj2 = hashMap.get("model-16");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult16Model");
                xVar.f23469u = (ScreenResult16Model) obj2;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView6)).setText(((ScreenResult16Model) xVar.f23469u).getText());
                Calendar calendar3 = Calendar.getInstance();
                long j11 = 1000;
                calendar3.setTimeInMillis(((ScreenResult16Model) xVar.f23469u).getFromTime() * j11);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTimeInMillis(j11 * ((ScreenResult16Model) xVar.f23469u).getTillTime());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm a");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat2.format(calendar3.getTime()) + " to " + simpleDateFormat2.format(calendar4.getTime()));
                Iterator<String> it2 = ((ScreenResult16Model) xVar.f23469u).getList().iterator();
                while (it2.hasNext()) {
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    View inflate2 = activity5.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    View view3 = (ConstraintLayout) inflate2;
                    ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).setText(it2.next());
                    ViewGroup.LayoutParams layoutParams4 = ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams4;
                    aVar2.setMargins(0, 0, 0, 16);
                    ((RobertoTextView) view3.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar2);
                    ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                    kotlin.jvm.internal.i.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    layoutParams6.setMargins(0, 0, 0, 0);
                    view3.setLayoutParams(layoutParams6);
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(view3);
                }
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.textView6)).setText(((ScreenResult16Model) xVar.f23469u).getText());
            Calendar calendar5 = Calendar.getInstance();
            long j12 = 1000;
            calendar5.setTimeInMillis(((ScreenResult16Model) xVar.f23469u).getFromTime() * j12);
            Calendar calendar6 = Calendar.getInstance();
            calendar6.setTimeInMillis(j12 * ((ScreenResult16Model) xVar.f23469u).getTillTime());
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("hh:mm a");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(simpleDateFormat3.format(calendar5.getTime()) + " to " + simpleDateFormat3.format(calendar6.getTime()));
            Iterator<String> it3 = ((ScreenResult16Model) xVar.f23469u).getList().iterator();
            while (it3.hasNext()) {
                androidx.fragment.app.p activity6 = getActivity();
                kotlin.jvm.internal.i.d(activity6);
                View inflate3 = activity6.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                kotlin.jvm.internal.i.e(inflate3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                View view4 = (ConstraintLayout) inflate3;
                ((RobertoTextView) view4.findViewById(R.id.tvSingleLine)).setText(it3.next());
                ViewGroup.LayoutParams layoutParams7 = ((RobertoTextView) view4.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams7;
                aVar3.setMargins(0, 0, 0, 16);
                ((RobertoTextView) view4.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar3);
                ViewGroup.LayoutParams layoutParams8 = view4.getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams8, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
                layoutParams9.setMargins(0, 0, 0, 0);
                view4.setLayoutParams(layoutParams9);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(view4);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.p0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q0 f18941v;

                {
                    this.f18941v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    int i6 = r2;
                    q0 this$0 = this.f18941v;
                    switch (i6) {
                        case 0:
                            int i10 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity42 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity42).I = false;
                            androidx.fragment.app.p activity52 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity52, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity52).R = true;
                            androidx.fragment.app.p activity62 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity62, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity62).onBackPressed();
                            return;
                        case 1:
                            int i11 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        case 2:
                            int i12 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        default:
                            int i13 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.p0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q0 f18941v;

                {
                    this.f18941v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    int i6 = r2;
                    q0 this$0 = this.f18941v;
                    switch (i6) {
                        case 0:
                            int i10 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity42 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity42).I = false;
                            androidx.fragment.app.p activity52 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity52, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity52).R = true;
                            androidx.fragment.app.p activity62 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity62, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity62).onBackPressed();
                            return;
                        case 1:
                            int i11 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        case 2:
                            int i12 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J();
                            return;
                        default:
                            int i13 = q0.f18990w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18991u, "Exception in on view created", e10);
        }
    }
}
