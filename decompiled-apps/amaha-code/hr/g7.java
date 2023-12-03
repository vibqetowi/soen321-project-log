package hr;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS30Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/g7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g7 extends rr.b {
    public static final /* synthetic */ int J = 0;
    public final yn.a A;
    public final androidx.lifecycle.m0 B;
    public FirestoreGoal C;
    public TemplateActivity D;
    public HashMap<String, Object> E;
    public boolean F;
    public boolean G;
    public long H;
    public final LinkedHashMap I = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18456u = LogHelper.INSTANCE.makeLogTag(g7.class);

    /* renamed from: v  reason: collision with root package name */
    public final SimpleDateFormat f18457v = new SimpleDateFormat("hh:mm a");

    /* renamed from: w  reason: collision with root package name */
    public final SimpleDateFormat f18458w = new SimpleDateFormat("hh:mm");

    /* renamed from: x  reason: collision with root package name */
    public final SimpleDateFormat f18459x = new SimpleDateFormat("d MMMM yyyy");

    /* renamed from: y  reason: collision with root package name */
    public Calendar f18460y;

    /* renamed from: z  reason: collision with root package name */
    public String f18461z;

    /* compiled from: ScreenS30Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (((java.lang.Boolean) r3.f19464u).booleanValue() == true) goto L5;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                z10 = true;
            }
            z10 = false;
            g7 g7Var = g7.this;
            if (z10) {
                g7Var.C = (FirestoreGoal) fVar2.f19465v;
            }
            int i6 = g7.J;
            g7Var.M();
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS30Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ CompoundButton f18463u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f18464v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CompoundButton compoundButton, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f18463u = compoundButton;
            this.f18464v = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            this.f18463u.setChecked(bool.booleanValue());
            com.google.android.material.bottomsheet.f fVar = this.f18464v.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS30Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<FirestoreGoal, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f18465u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ g7 f18466v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fm.a aVar, g7 g7Var) {
            super(1);
            this.f18465u = aVar;
            this.f18466v = g7Var;
        }

        @Override // ss.l
        public final hs.k invoke(FirestoreGoal firestoreGoal) {
            FirestoreGoal firestoreGoal2 = firestoreGoal;
            if (firestoreGoal2 != null) {
                this.f18465u.x(firestoreGoal2);
                androidx.fragment.app.p activity = this.f18466v.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18467u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18467u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18467u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18468u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18468u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18468u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18469u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f18469u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18469u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public g7() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.f18460y = calendar;
        this.f18461z = "";
        this.A = new yn.a();
        this.B = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity).F.put("s30_reminder_calendar", this.f18460y);
        return true;
    }

    public final HashMap<String, Object> J() {
        HashMap<String, Object> hashMap = this.E;
        if (hashMap != null) {
            return hashMap;
        }
        kotlin.jvm.internal.i.q("params");
        throw null;
    }

    public final void K(String str, String str2) {
        SpannableString spannableString = new SpannableString(gv.n.F0(gv.n.F0(this.f18461z, "%replace_time%", str), "%replace_date%", str2));
        int O0 = gv.r.O0(spannableString, str2, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(g0.a.b(requireContext(), R.color.sea)), O0, str2.length() + O0, 33);
        int O02 = gv.r.O0(spannableString, str, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(g0.a.b(requireContext(), R.color.sea)), O02, str.length() + O02, 33);
        ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0413 A[Catch: Exception -> 0x0493, TryCatch #2 {Exception -> 0x0493, blocks: (B:3:0x0004, B:6:0x0014, B:8:0x009b, B:11:0x00b3, B:13:0x00b7, B:15:0x00bd, B:16:0x00c6, B:18:0x00e4, B:20:0x0107, B:40:0x021c, B:21:0x014a, B:22:0x0188, B:84:0x03c9, B:86:0x0413, B:87:0x041c, B:89:0x0444, B:91:0x0448, B:92:0x0462, B:93:0x047f, B:94:0x0483, B:42:0x0225, B:44:0x022b, B:45:0x0233, B:47:0x0239, B:49:0x024d, B:53:0x025d, B:55:0x0262, B:57:0x0268, B:58:0x0275, B:60:0x028b, B:62:0x02ab, B:63:0x02f2, B:64:0x0330, B:83:0x03c4, B:95:0x0484, B:96:0x0488, B:97:0x0489, B:98:0x048d, B:99:0x048e, B:100:0x0492, B:23:0x019e, B:25:0x01ae, B:27:0x01da, B:29:0x01de, B:31:0x01e6, B:33:0x01ea, B:34:0x01f9, B:35:0x01fd, B:36:0x01fe, B:37:0x0216, B:38:0x021a, B:26:0x01ca, B:66:0x0348, B:68:0x0358, B:70:0x0384, B:72:0x0388, B:74:0x0390, B:76:0x0394, B:77:0x03a2, B:78:0x03a6, B:79:0x03a7, B:80:0x03be, B:81:0x03c2, B:69:0x0374), top: B:106:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0444 A[Catch: Exception -> 0x0493, TryCatch #2 {Exception -> 0x0493, blocks: (B:3:0x0004, B:6:0x0014, B:8:0x009b, B:11:0x00b3, B:13:0x00b7, B:15:0x00bd, B:16:0x00c6, B:18:0x00e4, B:20:0x0107, B:40:0x021c, B:21:0x014a, B:22:0x0188, B:84:0x03c9, B:86:0x0413, B:87:0x041c, B:89:0x0444, B:91:0x0448, B:92:0x0462, B:93:0x047f, B:94:0x0483, B:42:0x0225, B:44:0x022b, B:45:0x0233, B:47:0x0239, B:49:0x024d, B:53:0x025d, B:55:0x0262, B:57:0x0268, B:58:0x0275, B:60:0x028b, B:62:0x02ab, B:63:0x02f2, B:64:0x0330, B:83:0x03c4, B:95:0x0484, B:96:0x0488, B:97:0x0489, B:98:0x048d, B:99:0x048e, B:100:0x0492, B:23:0x019e, B:25:0x01ae, B:27:0x01da, B:29:0x01de, B:31:0x01e6, B:33:0x01ea, B:34:0x01f9, B:35:0x01fd, B:36:0x01fe, B:37:0x0216, B:38:0x021a, B:26:0x01ca, B:66:0x0348, B:68:0x0358, B:70:0x0384, B:72:0x0388, B:74:0x0390, B:76:0x0394, B:77:0x03a2, B:78:0x03a6, B:79:0x03a7, B:80:0x03be, B:81:0x03c2, B:69:0x0374), top: B:106:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x047f A[Catch: Exception -> 0x0493, TryCatch #2 {Exception -> 0x0493, blocks: (B:3:0x0004, B:6:0x0014, B:8:0x009b, B:11:0x00b3, B:13:0x00b7, B:15:0x00bd, B:16:0x00c6, B:18:0x00e4, B:20:0x0107, B:40:0x021c, B:21:0x014a, B:22:0x0188, B:84:0x03c9, B:86:0x0413, B:87:0x041c, B:89:0x0444, B:91:0x0448, B:92:0x0462, B:93:0x047f, B:94:0x0483, B:42:0x0225, B:44:0x022b, B:45:0x0233, B:47:0x0239, B:49:0x024d, B:53:0x025d, B:55:0x0262, B:57:0x0268, B:58:0x0275, B:60:0x028b, B:62:0x02ab, B:63:0x02f2, B:64:0x0330, B:83:0x03c4, B:95:0x0484, B:96:0x0488, B:97:0x0489, B:98:0x048d, B:99:0x048e, B:100:0x0492, B:23:0x019e, B:25:0x01ae, B:27:0x01da, B:29:0x01de, B:31:0x01e6, B:33:0x01ea, B:34:0x01f9, B:35:0x01fd, B:36:0x01fe, B:37:0x0216, B:38:0x021a, B:26:0x01ca, B:66:0x0348, B:68:0x0358, B:70:0x0384, B:72:0x0388, B:74:0x0390, B:76:0x0394, B:77:0x03a2, B:78:0x03a6, B:79:0x03a7, B:80:0x03be, B:81:0x03c2, B:69:0x0374), top: B:106:0x0004, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        kotlin.jvm.internal.u uVar;
        kotlin.jvm.internal.u uVar2;
        TemplateActivity templateActivity;
        SwitchCompat switchCompat;
        TemplateActivity templateActivity2;
        String str = this.f18456u;
        try {
            uVar = new kotlin.jvm.internal.u();
            uVar2 = new kotlin.jvm.internal.u();
            templateActivity = this.D;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception in on view created", e10);
            return;
        }
        if (templateActivity != null) {
            HashMap<String, Object> A0 = templateActivity.A0();
            kotlin.jvm.internal.i.g(A0, "<set-?>");
            this.E = A0;
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(J().get("s30_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(J().get("s30_description")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(J().get("s30_switch_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(J().get("s30_btn_text")));
            this.f18461z = UtilFunKt.paramsMapToString(J().get("s30_switch_two_text"));
            TemplateActivity templateActivity3 = this.D;
            if (templateActivity3 != null) {
                boolean z10 = templateActivity3.W;
                SimpleDateFormat simpleDateFormat = this.f18458w;
                if (z10) {
                    FirestoreGoal firestoreGoal = this.C;
                    if (firestoreGoal != null) {
                        if (firestoreGoal.isVisible()) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                        }
                        ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setChecked(firestoreGoal.isVisible());
                        this.F = firestoreGoal.isVisible();
                        if (firestoreGoal.isVisible()) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(firestoreGoal.getNotificationScheduled());
                            this.G = firestoreGoal.getNotificationScheduled();
                            if (firestoreGoal.isVisible()) {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(firestoreGoal.getNotificationScheduled());
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(new f7(this, 0));
                            } else {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(0.5f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(0.5f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(null);
                            }
                        } else {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                        }
                        try {
                            Calendar calendar = Calendar.getInstance();
                            if (firestoreGoal.getScheduledDate().getTime() == 0) {
                                Object obj = J().get("s30_time");
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                                Date parse = simpleDateFormat.parse(UtilFunKt.paramsMapToString((String) obj));
                                kotlin.jvm.internal.i.e(parse, "null cannot be cast to non-null type java.util.Date");
                                calendar.setTime(parse);
                            } else {
                                calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * 1000);
                            }
                            TemplateActivity templateActivity4 = this.D;
                            if (templateActivity4 != null) {
                                if (templateActivity4.F.containsKey("s30_reminder_calendar")) {
                                    TemplateActivity templateActivity5 = this.D;
                                    if (templateActivity5 != null) {
                                        Object obj2 = templateActivity5.F.get("s30_reminder_calendar");
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                                        this.f18460y = (Calendar) obj2;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    this.f18460y.set(11, calendar.get(11));
                                    this.f18460y.set(12, calendar.get(12));
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(str, "exception", e11);
                        }
                    }
                    String format = this.f18457v.format(Long.valueOf(this.f18460y.getTimeInMillis()));
                    kotlin.jvm.internal.i.f(format, "timeFormat.format(calendar.timeInMillis)");
                    String format2 = this.f18459x.format(Long.valueOf(this.f18460y.getTimeInMillis()));
                    kotlin.jvm.internal.i.f(format2, "dateFormat.format(calendar.timeInMillis)");
                    K(format, format2);
                    ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 5, uVar2));
                    switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_remind);
                    if (switchCompat != null) {
                        switchCompat.setOnCheckedChangeListener(new ib.a(4, this));
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new o4(6, this, uVar2, uVar));
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new f7(this, 2));
                    templateActivity2 = this.D;
                    if (templateActivity2 == null) {
                        if (templateActivity2.N) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setVisibility(0);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setVisibility(0);
                            return;
                        }
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setVisibility(8);
                        ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setVisibility(8);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                } else if (templateActivity3 != null) {
                    Goal y02 = templateActivity3.y0();
                    if (y02 != null) {
                        Iterator<GamificationModel> it = y02.getGoalgamificationList().iterator();
                        while (it.hasNext()) {
                            GamificationModel next = it.next();
                            Iterator<GamificationModel> it2 = it;
                            if (!kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_GOAL_UPDATION_TASK) && !kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_ADD_NEW_GOAL_TASK)) {
                                it = it2;
                            }
                            uVar.f23466u = true;
                        }
                    }
                    if (y02 != null) {
                        if (y02.isVisible()) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                        }
                        ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setChecked(y02.isVisible());
                        if (y02.isVisible()) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(y02.getNotificationScheduled());
                            if (y02.isVisible()) {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(y02.getNotificationScheduled());
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(new f7(this, 1));
                            } else {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(0.5f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(0.5f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(null);
                            }
                        } else {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(false);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                        }
                    }
                    if (y02 != null) {
                        try {
                            Calendar calendar2 = Calendar.getInstance();
                            if (y02.getScheduledDate().getTime() == 0) {
                                Object obj3 = J().get("s30_time");
                                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                Date parse2 = simpleDateFormat.parse(UtilFunKt.paramsMapToString((String) obj3));
                                kotlin.jvm.internal.i.e(parse2, "null cannot be cast to non-null type java.util.Date");
                                calendar2.setTime(parse2);
                            } else {
                                calendar2.setTimeInMillis(y02.getScheduledDate().getTime() * 1000);
                            }
                            TemplateActivity templateActivity6 = this.D;
                            if (templateActivity6 != null) {
                                if (templateActivity6.F.containsKey("s30_reminder_calendar")) {
                                    TemplateActivity templateActivity7 = this.D;
                                    if (templateActivity7 != null) {
                                        Object obj4 = templateActivity7.F.get("s30_reminder_calendar");
                                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.Calendar");
                                        this.f18460y = (Calendar) obj4;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                } else {
                                    this.f18460y.set(11, calendar2.get(11));
                                    this.f18460y.set(12, calendar2.get(12));
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(str, "exception", e12);
                        }
                    }
                    String format3 = this.f18457v.format(Long.valueOf(this.f18460y.getTimeInMillis()));
                    kotlin.jvm.internal.i.f(format3, "timeFormat.format(calendar.timeInMillis)");
                    String format22 = this.f18459x.format(Long.valueOf(this.f18460y.getTimeInMillis()));
                    kotlin.jvm.internal.i.f(format22, "dateFormat.format(calendar.timeInMillis)");
                    K(format3, format22);
                    ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 5, uVar2));
                    switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_remind);
                    if (switchCompat != null) {
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new o4(6, this, uVar2, uVar));
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new f7(this, 2));
                    templateActivity2 = this.D;
                    if (templateActivity2 == null) {
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                LogHelper.INSTANCE.e(str, "exception in on view created", e10);
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void O() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), new pl.b(this, 11), this.f18460y.get(11), this.f18460y.get(12), false);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.I;
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
        return inflater.inflate(R.layout.fragment_screen_s30, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.B.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.I.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity;
        this.D = templateActivity;
        try {
            if (templateActivity.W) {
                fm.a aVar = (fm.a) this.B.getValue();
                TemplateActivity templateActivity2 = this.D;
                if (templateActivity2 != null) {
                    TemplateModel templateModel = templateActivity2.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        aVar.f15178l0.e(getViewLifecycleOwner(), new r3(17, new a()));
                        aVar.l(label);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            M();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18456u, "exception in on view created", e10);
        }
    }
}
