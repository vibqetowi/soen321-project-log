package hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS90Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q9 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19040z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19045y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19041u = LogHelper.INSTANCE.makeLogTag(q9.class);

    /* renamed from: v  reason: collision with root package name */
    public String f19042v = "";

    /* renamed from: w  reason: collision with root package name */
    public final androidx.lifecycle.m0 f19043w = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));

    /* renamed from: x  reason: collision with root package name */
    public final String f19044x = "result_11";

    /* compiled from: ScreenS90Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f19046u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19047v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str) {
            super(1);
            this.f19046u = aVar;
            this.f19047v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null && ((Boolean) fVar2.f19464u).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f19046u.o(this.f19047v, true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS90Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends HashMap<String, Object>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f19048u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q9 f19049v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fm.a f19050w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f19051x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TemplateActivity templateActivity, q9 q9Var, fm.a aVar, String str) {
            super(1);
            this.f19048u = templateActivity;
            this.f19049v = q9Var;
            this.f19050w = aVar;
            this.f19051x = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar) {
            hs.f<? extends Boolean, ? extends HashMap<String, Object>> fVar2 = fVar;
            if (fVar2 != null) {
                TemplateActivity templateActivity = this.f19048u;
                boolean z10 = templateActivity.K;
                String str = this.f19051x;
                fm.a aVar = this.f19050w;
                q9 q9Var = this.f19049v;
                B b10 = fVar2.f19465v;
                if (z10) {
                    ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(b10);
                    if (gratitudeLetterMapToObject.getGratitude_in_app_letter().size() > 0) {
                        is.q.V1(gratitudeLetterMapToObject.getGratitude_in_app_letter());
                    }
                    ArrayList<CompassionLetterModel> gratitude_in_app_letter = gratitudeLetterMapToObject.getGratitude_in_app_letter();
                    androidx.fragment.app.p activity = q9Var.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Object obj = ((TemplateActivity) activity).F.get("data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    gratitude_in_app_letter.add(new CompassionLetterModel((String) obj));
                    aVar.j(gratitudeLetterMapToObject, str);
                } else {
                    templateActivity.K = true;
                    ScreenResult11Model gratitudeLetterMapToObject2 = UtilFunKt.gratitudeLetterMapToObject(b10);
                    ArrayList<CompassionLetterModel> gratitude_in_app_letter2 = gratitudeLetterMapToObject2.getGratitude_in_app_letter();
                    androidx.fragment.app.p activity2 = q9Var.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Object obj2 = ((TemplateActivity) activity2).F.get("data");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    gratitude_in_app_letter2.add(new CompassionLetterModel((String) obj2));
                    aVar.j(gratitudeLetterMapToObject2, str);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS90Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ TemplateActivity f19052u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TemplateActivity templateActivity) {
            super(1);
            this.f19052u = templateActivity;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool != null) {
                TemplateActivity templateActivity = this.f19052u;
                if (templateActivity.getIntent().hasExtra("source") && r1.b0.c(templateActivity, "source", "goals")) {
                    templateActivity.n0();
                } else {
                    templateActivity.t0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19053u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19053u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19053u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19054u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19054u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19054u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19055u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f19055u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19055u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19045y;
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
        return inflater.inflate(R.layout.fragment_screen_s90, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.f19043w.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.f19045y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("MMMM yyyy");
            HashMap<String, Object> hashMap = templateActivity.F;
            if (kotlin.jvm.internal.i.b(hashMap.get("log"), Boolean.TRUE)) {
                hashMap.put("log", Boolean.FALSE);
                Object obj = hashMap.get("goalData");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.GratitudeLetterModel");
                GratitudeLetterModel gratitudeLetterModel = (GratitudeLetterModel) obj;
                ((RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonOne)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonTwo)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                long date = gratitudeLetterModel.getDate() * 1000;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(date);
                Date time = calendar.getTime();
                ((RobertoTextView) _$_findCachedViewById(R.id.tvDate)).setText(simpleDateFormat.format(time));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvDay)).setText(simpleDateFormat2.format(time));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMonthYear)).setText(simpleDateFormat3.format(time));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS90letter)).setText(gratitudeLetterModel.getLetter());
                String letter = gratitudeLetterModel.getLetter();
                kotlin.jvm.internal.i.d(letter);
                this.f19042v = letter;
            } else {
                Date date2 = new Date();
                ((RobertoTextView) _$_findCachedViewById(R.id.tvDate)).setText(simpleDateFormat.format(date2));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvDay)).setText(simpleDateFormat2.format(date2));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvMonthYear)).setText(simpleDateFormat3.format(date2));
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Object obj2 = ((TemplateActivity) activity2).F.get("data");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS90letter)).setText((String) obj2);
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Object obj3 = ((TemplateActivity) activity3).F.get("data");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                this.f19042v = (String) obj3;
                ((RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s90_btn_one_text")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonTwo);
                if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    paramsMapToString = "DONE";
                } else {
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s90_btn_two_text"));
                }
                robertoButton.setText(paramsMapToString);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o9

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q9 f18930v;

                    {
                        this.f18930v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        OnBackPressedDispatcher onBackPressedDispatcher;
                        int i6 = r2;
                        q9 this$0 = this.f18930v;
                        switch (i6) {
                            case 0:
                                int i10 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                if (activity4 != null && (onBackPressedDispatcher = activity4.getOnBackPressedDispatcher()) != null) {
                                    onBackPressedDispatcher.b();
                                    return;
                                }
                                return;
                            case 1:
                                int i11 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new hd.a(14, this$0);
                                a1Var.b();
                                return;
                            default:
                                int i12 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f19042v, "")) {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setFlags(268435456);
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", this$0.f19042v);
                                    this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.btnS90ButtonTwo)).setOnClickListener(new d9(templateActivity, 3, this));
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o9

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q9 f18930v;

                    {
                        this.f18930v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        OnBackPressedDispatcher onBackPressedDispatcher;
                        int i6 = r2;
                        q9 this$0 = this.f18930v;
                        switch (i6) {
                            case 0:
                                int i10 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                if (activity4 != null && (onBackPressedDispatcher = activity4.getOnBackPressedDispatcher()) != null) {
                                    onBackPressedDispatcher.b();
                                    return;
                                }
                                return;
                            case 1:
                                int i11 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new hd.a(14, this$0);
                                a1Var.b();
                                return;
                            default:
                                int i12 = q9.f19040z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f19042v, "")) {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setFlags(268435456);
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", this$0.f19042v);
                                    this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 11));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivShare)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivShare)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q9 f18930v;

                {
                    this.f18930v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OnBackPressedDispatcher onBackPressedDispatcher;
                    int i6 = r2;
                    q9 this$0 = this.f18930v;
                    switch (i6) {
                        case 0:
                            int i10 = q9.f19040z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            if (activity4 != null && (onBackPressedDispatcher = activity4.getOnBackPressedDispatcher()) != null) {
                                onBackPressedDispatcher.b();
                                return;
                            }
                            return;
                        case 1:
                            int i11 = q9.f19040z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(14, this$0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = q9.f19040z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!kotlin.jvm.internal.i.b(this$0.f19042v, "")) {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setFlags(268435456);
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", this$0.f19042v);
                                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19041u, "exception in on view created", e10);
        }
    }
}
