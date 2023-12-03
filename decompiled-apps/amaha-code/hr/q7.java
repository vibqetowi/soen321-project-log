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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS34Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/q7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q7 extends rr.b {
    public static final /* synthetic */ int H = 0;
    public final androidx.lifecycle.m0 A;
    public FirestoreGoal B;
    public TemplateActivity C;
    public boolean D;
    public boolean E;
    public long F;
    public final LinkedHashMap G = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19024u = LogHelper.INSTANCE.makeLogTag(q7.class);

    /* renamed from: v  reason: collision with root package name */
    public final SimpleDateFormat f19025v = new SimpleDateFormat("hh:mm a");

    /* renamed from: w  reason: collision with root package name */
    public final SimpleDateFormat f19026w = new SimpleDateFormat("hh:mm");

    /* renamed from: x  reason: collision with root package name */
    public Calendar f19027x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, Object> f19028y;

    /* renamed from: z  reason: collision with root package name */
    public final yn.a f19029z;

    /* compiled from: ScreenS34Fragment.kt */
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
            q7 q7Var = q7.this;
            if (z10) {
                q7Var.B = (FirestoreGoal) fVar2.f19465v;
            }
            int i6 = q7.H;
            q7Var.M();
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS34Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ CompoundButton f19031u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f19032v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CompoundButton compoundButton, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f19031u = compoundButton;
            this.f19032v = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            this.f19031u.setChecked(bool.booleanValue());
            com.google.android.material.bottomsheet.f fVar = this.f19032v.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS34Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<FirestoreGoal, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f19033u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q7 f19034v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fm.a aVar, q7 q7Var) {
            super(1);
            this.f19033u = aVar;
            this.f19034v = q7Var;
        }

        @Override // ss.l
        public final hs.k invoke(FirestoreGoal firestoreGoal) {
            FirestoreGoal firestoreGoal2 = firestoreGoal;
            if (firestoreGoal2 != null) {
                this.f19033u.x(firestoreGoal2);
                androidx.fragment.app.p activity = this.f19034v.getActivity();
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
        public final /* synthetic */ Fragment f19035u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19035u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19035u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19036u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f19036u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19036u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19037u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f19037u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19037u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public q7() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.f19027x = calendar;
        this.f19029z = new yn.a();
        this.A = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new d(this), new e(this), new f(this));
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((TemplateActivity) activity).F.put("s34_reminder_calendar", this.f19027x);
        return true;
    }

    public final HashMap<String, Object> J() {
        HashMap<String, Object> hashMap = this.f19028y;
        if (hashMap != null) {
            return hashMap;
        }
        kotlin.jvm.internal.i.q("params");
        throw null;
    }

    public final void K() {
        try {
            String timeStr = this.f19025v.format(this.f19027x.getTime());
            String paramsMapToString = UtilFunKt.paramsMapToString(J().get("s34_switch_two_text"));
            kotlin.jvm.internal.i.f(timeStr, "timeStr");
            SpannableString spannableString = new SpannableString(gv.n.F0(paramsMapToString, "%replace_time%", timeStr));
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(requireActivity().getBaseContext(), R.color.sea)), gv.r.O0(spannableString, timeStr, 0, false, 6), spannableString.length(), 33);
            ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText(spannableString);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19024u, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0312 A[Catch: Exception -> 0x0359, TryCatch #2 {Exception -> 0x0359, blocks: (B:3:0x0004, B:6:0x000a, B:8:0x0016, B:9:0x0028, B:11:0x0036, B:13:0x00ad, B:16:0x00c3, B:18:0x00c7, B:20:0x00ff, B:23:0x013f, B:41:0x01ba, B:22:0x010e, B:80:0x02f2, B:82:0x0312, B:83:0x031b, B:85:0x0326, B:86:0x0330, B:88:0x033b, B:43:0x01c3, B:45:0x01c9, B:46:0x01d1, B:48:0x01d7, B:50:0x01e9, B:54:0x01f8, B:56:0x01fd, B:58:0x0230, B:61:0x0274, B:79:0x02ed, B:60:0x023f, B:89:0x0345, B:90:0x0349, B:91:0x034a, B:92:0x034e, B:93:0x034f, B:94:0x0353, B:95:0x0354, B:96:0x0358, B:62:0x0278, B:64:0x0284, B:66:0x02ad, B:68:0x02b1, B:70:0x02b9, B:72:0x02bd, B:73:0x02cb, B:74:0x02cf, B:75:0x02d0, B:76:0x02e7, B:77:0x02eb, B:65:0x029d, B:24:0x0143, B:26:0x014f, B:28:0x0178, B:30:0x017c, B:32:0x0184, B:34:0x0188, B:35:0x0197, B:36:0x019b, B:37:0x019c, B:38:0x01b4, B:39:0x01b8, B:27:0x0168), top: B:102:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0326 A[Catch: Exception -> 0x0359, TryCatch #2 {Exception -> 0x0359, blocks: (B:3:0x0004, B:6:0x000a, B:8:0x0016, B:9:0x0028, B:11:0x0036, B:13:0x00ad, B:16:0x00c3, B:18:0x00c7, B:20:0x00ff, B:23:0x013f, B:41:0x01ba, B:22:0x010e, B:80:0x02f2, B:82:0x0312, B:83:0x031b, B:85:0x0326, B:86:0x0330, B:88:0x033b, B:43:0x01c3, B:45:0x01c9, B:46:0x01d1, B:48:0x01d7, B:50:0x01e9, B:54:0x01f8, B:56:0x01fd, B:58:0x0230, B:61:0x0274, B:79:0x02ed, B:60:0x023f, B:89:0x0345, B:90:0x0349, B:91:0x034a, B:92:0x034e, B:93:0x034f, B:94:0x0353, B:95:0x0354, B:96:0x0358, B:62:0x0278, B:64:0x0284, B:66:0x02ad, B:68:0x02b1, B:70:0x02b9, B:72:0x02bd, B:73:0x02cb, B:74:0x02cf, B:75:0x02d0, B:76:0x02e7, B:77:0x02eb, B:65:0x029d, B:24:0x0143, B:26:0x014f, B:28:0x0178, B:30:0x017c, B:32:0x0184, B:34:0x0188, B:35:0x0197, B:36:0x019b, B:37:0x019c, B:38:0x01b4, B:39:0x01b8, B:27:0x0168), top: B:102:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033b A[Catch: Exception -> 0x0359, TryCatch #2 {Exception -> 0x0359, blocks: (B:3:0x0004, B:6:0x000a, B:8:0x0016, B:9:0x0028, B:11:0x0036, B:13:0x00ad, B:16:0x00c3, B:18:0x00c7, B:20:0x00ff, B:23:0x013f, B:41:0x01ba, B:22:0x010e, B:80:0x02f2, B:82:0x0312, B:83:0x031b, B:85:0x0326, B:86:0x0330, B:88:0x033b, B:43:0x01c3, B:45:0x01c9, B:46:0x01d1, B:48:0x01d7, B:50:0x01e9, B:54:0x01f8, B:56:0x01fd, B:58:0x0230, B:61:0x0274, B:79:0x02ed, B:60:0x023f, B:89:0x0345, B:90:0x0349, B:91:0x034a, B:92:0x034e, B:93:0x034f, B:94:0x0353, B:95:0x0354, B:96:0x0358, B:62:0x0278, B:64:0x0284, B:66:0x02ad, B:68:0x02b1, B:70:0x02b9, B:72:0x02bd, B:73:0x02cb, B:74:0x02cf, B:75:0x02d0, B:76:0x02e7, B:77:0x02eb, B:65:0x029d, B:24:0x0143, B:26:0x014f, B:28:0x0178, B:30:0x017c, B:32:0x0184, B:34:0x0188, B:35:0x0197, B:36:0x019b, B:37:0x019c, B:38:0x01b4, B:39:0x01b8, B:27:0x0168), top: B:102:0x0004, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        TemplateActivity templateActivity;
        SwitchCompat switchCompat;
        RobertoButton robertoButton;
        ImageView imageView;
        String str = this.f19024u;
        try {
            templateActivity = this.C;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception in on view created", e10);
            return;
        }
        if (templateActivity != null) {
            if (templateActivity.O) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setVisibility(8);
                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setVisibility(8);
            }
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            TemplateActivity templateActivity2 = this.C;
            if (templateActivity2 != null) {
                HashMap<String, Object> A0 = templateActivity2.A0();
                kotlin.jvm.internal.i.g(A0, "<set-?>");
                this.f19028y = A0;
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(J().get("s34_title")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(J().get("s34_description")));
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText(UtilFunKt.paramsMapToString(J().get("s34_switch_one_text")));
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText(UtilFunKt.paramsMapToString(J().get("s34_btn_text")));
                TemplateActivity templateActivity3 = this.C;
                if (templateActivity3 != null) {
                    boolean z10 = templateActivity3.W;
                    SimpleDateFormat simpleDateFormat = this.f19026w;
                    if (z10) {
                        FirestoreGoal firestoreGoal = this.B;
                        if (firestoreGoal != null) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setChecked(firestoreGoal.isVisible());
                            this.D = firestoreGoal.isVisible();
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(firestoreGoal.getNotificationScheduled());
                            this.E = firestoreGoal.getNotificationScheduled();
                            firestoreGoal.getNotificationScheduled();
                            if (firestoreGoal.getNotificationScheduled() || ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).isChecked()) {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(new p7(this, 0));
                            }
                            Calendar calendar = Calendar.getInstance();
                            try {
                                if (firestoreGoal.getScheduledDate().getTime() == 0) {
                                    Object obj = J().get("s34_time");
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                                    calendar.setTime(simpleDateFormat.parse(UtilFunKt.paramsMapToString((String) obj)));
                                } else {
                                    calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * 1000);
                                }
                                TemplateActivity templateActivity4 = this.C;
                                if (templateActivity4 != null) {
                                    if (templateActivity4.F.containsKey("s34_reminder_calendar")) {
                                        TemplateActivity templateActivity5 = this.C;
                                        if (templateActivity5 != null) {
                                            Object obj2 = templateActivity5.F.get("s34_reminder_calendar");
                                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.Calendar");
                                            this.f19027x = (Calendar) obj2;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    } else {
                                        this.f19027x.set(11, calendar.get(11));
                                        this.f19027x.set(12, calendar.get(12));
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(str, "exception", e11);
                            }
                        }
                        K();
                        ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 7, uVar2));
                        switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_remind);
                        if (switchCompat != null) {
                            switchCompat.setOnCheckedChangeListener(new ib.a(5, this));
                        }
                        robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
                        if (robertoButton != null) {
                            robertoButton.setOnClickListener(new o4(8, this, uVar2, uVar));
                        }
                        imageView = (ImageView) _$_findCachedViewById(R.id.ivClose);
                        if (imageView == null) {
                            imageView.setOnClickListener(new p7(this, 2));
                            return;
                        }
                        return;
                    } else if (templateActivity3 != null) {
                        Goal y02 = templateActivity3.y0();
                        if (y02 != null) {
                            Iterator<GamificationModel> it = y02.getGoalgamificationList().iterator();
                            while (it.hasNext()) {
                                GamificationModel next = it.next();
                                if (!kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_GOAL_UPDATION_TASK) && !kotlin.jvm.internal.i.b(next.getTask(), Constants.GAMIFICATION_ADD_NEW_GOAL_TASK)) {
                                }
                                uVar.f23466u = true;
                            }
                        }
                        if (y02 != null) {
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setChecked(y02.isVisible());
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(false);
                            ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setChecked(y02.getNotificationScheduled());
                            y02.getNotificationScheduled();
                            if (y02.getNotificationScheduled() || ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).isChecked()) {
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setAlpha(1.0f);
                                ((SwitchCompat) _$_findCachedViewById(R.id.switch_remind)).setEnabled(true);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setAlpha(1.0f);
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setOnClickListener(new p7(this, 1));
                            }
                            Calendar calendar2 = Calendar.getInstance();
                            try {
                                if (y02.getScheduledDate().getTime() == 0) {
                                    Object obj3 = J().get("s34_time");
                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                    calendar2.setTime(simpleDateFormat.parse(UtilFunKt.paramsMapToString((String) obj3)));
                                } else {
                                    calendar2.setTimeInMillis(y02.getScheduledDate().getTime() * 1000);
                                }
                                TemplateActivity templateActivity6 = this.C;
                                if (templateActivity6 != null) {
                                    if (templateActivity6.F.containsKey("s34_reminder_calendar")) {
                                        TemplateActivity templateActivity7 = this.C;
                                        if (templateActivity7 != null) {
                                            Object obj4 = templateActivity7.F.get("s34_reminder_calendar");
                                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.Calendar");
                                            this.f19027x = (Calendar) obj4;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    } else {
                                        this.f19027x.set(11, calendar2.get(11));
                                        this.f19027x.set(12, calendar2.get(12));
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(str, "exception", e12);
                            }
                        }
                        K();
                        ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 7, uVar2));
                        switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_remind);
                        if (switchCompat != null) {
                        }
                        robertoButton = (RobertoButton) _$_findCachedViewById(R.id.button);
                        if (robertoButton != null) {
                        }
                        imageView = (ImageView) _$_findCachedViewById(R.id.ivClose);
                        if (imageView == null) {
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
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void O() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), new pl.b(this, 12), this.f19027x.get(11), this.f19027x.get(12), false);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.G;
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
        return inflater.inflate(R.layout.fragment_screen_s34, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = (fm.a) this.A.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.G.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        this.C = (TemplateActivity) activity;
        super.onViewCreated(view, bundle);
        try {
            TemplateActivity templateActivity = this.C;
            if (templateActivity != null) {
                if (templateActivity.W) {
                    TemplateModel templateModel = templateActivity.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a aVar = (fm.a) this.A.getValue();
                        aVar.f15178l0.e(getViewLifecycleOwner(), new r3(24, new a()));
                        aVar.l(label);
                        return;
                    }
                    return;
                }
                M();
                return;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19024u, "exception in on view created", e10);
        }
    }
}
