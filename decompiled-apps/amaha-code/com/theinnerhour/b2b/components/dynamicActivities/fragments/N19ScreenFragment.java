package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N19ScreenFragment;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.m;
import gv.r;
import hs.f;
import hs.j;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import ss.l;
import t0.d0;
import tk.q;
/* compiled from: N19ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N19ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N19ScreenFragment extends rr.d {
    public static final /* synthetic */ int K = 0;
    public final Calendar A;
    public final Calendar B;
    public final ZoneOffset C;
    public View D;
    public boolean E;
    public final yn.a F;
    public final int G;
    public final int H;
    public final int I;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11009w = LogHelper.INSTANCE.makeLogTag("N19ScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f11010x = b0.j(this, y.a(t.class), new b(this), new c(this), new d(this));

    /* renamed from: y  reason: collision with root package name */
    public String f11011y = "";

    /* renamed from: z  reason: collision with root package name */
    public Calendar f11012z;

    /* compiled from: N19ScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            NewDynamicParentActivity newDynamicParentActivity;
            p requireActivity = N19ScreenFragment.this.requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                int i6 = NewDynamicParentActivity.F;
                newDynamicParentActivity.L0(false);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11014u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11014u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11014u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11015u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11015u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11015u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11016u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11016u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11016u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public N19ScreenFragment() {
        Calendar calendar = Calendar.getInstance();
        Utils utils = Utils.INSTANCE;
        long j10 = 1000;
        calendar.setTimeInMillis(utils.getTodayTimeInSeconds() * j10);
        calendar.add(11, 9);
        this.f11012z = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(utils.getTodayTimeInSeconds() * j10);
        calendar2.add(11, 9);
        this.A = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        calendar3.add(11, 24);
        this.B = calendar3;
        this.C = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        this.E = true;
        this.F = new yn.a();
        WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
        this.G = d0.e.a();
        this.H = d0.e.a();
        this.I = d0.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f0 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0028, B:9:0x002e, B:11:0x003b, B:13:0x0041, B:15:0x004e, B:17:0x0054, B:23:0x0075, B:35:0x0093, B:41:0x00a9, B:44:0x00b0, B:54:0x00e3, B:56:0x010a, B:57:0x0111, B:65:0x0128, B:66:0x012b, B:68:0x014e, B:87:0x019f, B:75:0x017a, B:78:0x0181, B:79:0x0186, B:82:0x018d, B:83:0x0192, B:86:0x0199, B:88:0x01a6, B:107:0x01e3, B:109:0x01f0, B:111:0x01f5, B:95:0x01bd, B:98:0x01c4, B:99:0x01c9, B:102:0x01d0, B:103:0x01d5, B:106:0x01dd, B:45:0x00bb, B:48:0x00c2, B:49:0x00cd, B:52:0x00d5, B:27:0x007f, B:31:0x0089, B:112:0x01fb, B:114:0x0203, B:116:0x0208), top: B:121:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0028, B:9:0x002e, B:11:0x003b, B:13:0x0041, B:15:0x004e, B:17:0x0054, B:23:0x0075, B:35:0x0093, B:41:0x00a9, B:44:0x00b0, B:54:0x00e3, B:56:0x010a, B:57:0x0111, B:65:0x0128, B:66:0x012b, B:68:0x014e, B:87:0x019f, B:75:0x017a, B:78:0x0181, B:79:0x0186, B:82:0x018d, B:83:0x0192, B:86:0x0199, B:88:0x01a6, B:107:0x01e3, B:109:0x01f0, B:111:0x01f5, B:95:0x01bd, B:98:0x01c4, B:99:0x01c9, B:102:0x01d0, B:103:0x01d5, B:106:0x01dd, B:45:0x00bb, B:48:0x00c2, B:49:0x00cd, B:52:0x00d5, B:27:0x007f, B:31:0x0089, B:112:0x01fb, B:114:0x0203, B:116:0x0208), top: B:121:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    @Override // rr.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        String str;
        String str2;
        String str3;
        String str4;
        Long valueOf;
        Date time;
        p requireActivity;
        String str5;
        try {
            NewDynamicParentActivity newDynamicParentActivity = null;
            r2 = null;
            r2 = null;
            r2 = null;
            Date time2 = null;
            NewDynamicParentActivity newDynamicParentActivity2 = null;
            if (this.E) {
                String str6 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("activity_name", P().T);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                bundle.putString("course", str);
                j<String, String, String> jVar = P().O;
                if (jVar != null) {
                    str2 = jVar.f19473u;
                } else {
                    str2 = null;
                }
                bundle.putString(Constants.GOAL_ID, str2);
                j<String, String, String> jVar2 = P().O;
                if (jVar2 != null) {
                    str3 = jVar2.f19474v;
                } else {
                    str3 = null;
                }
                bundle.putString(Constants.GOAL_NAME, str3);
                String str7 = this.f11011y;
                int hashCode = str7.hashCode();
                if (hashCode != -2070778647) {
                    if (hashCode != -1036290639) {
                        if (hashCode == 777898929 && str7.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            str4 = "weekly";
                        }
                        str4 = null;
                    } else if (str7.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        str4 = "one_time";
                    } else {
                        str4 = null;
                    }
                } else {
                    if (str7.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                        str4 = "daily";
                    }
                    str4 = null;
                }
                bundle.putString("type", str4);
                String str8 = this.f11011y;
                int hashCode2 = str8.hashCode();
                Calendar calendar = this.B;
                Calendar calendar2 = this.A;
                if (hashCode2 != -2070778647) {
                    if (hashCode2 != -1036290639) {
                        if (hashCode2 == 777898929 && str8.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            valueOf = Long.valueOf(calendar2.getTimeInMillis() / 1000);
                        }
                        valueOf = null;
                    } else if (str8.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        valueOf = Long.valueOf(calendar.getTimeInMillis() / 1000);
                    } else {
                        valueOf = null;
                    }
                } else {
                    if (str8.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                        valueOf = Long.valueOf(this.f11012z.getTimeInMillis() / 1000);
                    }
                    valueOf = null;
                }
                if (valueOf != null) {
                    bundle.putString("time_set", LocalDateTime.ofEpochSecond(valueOf.longValue(), 0, this.C).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(Locale.ENGLISH)));
                    if (i.b(this.f11011y, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        switch (calendar2.get(7)) {
                            case 1:
                                str5 = "sunday";
                                break;
                            case 2:
                                str5 = "monday";
                                break;
                            case 3:
                                str5 = "tuesday";
                                break;
                            case 4:
                                str5 = "wednesday";
                                break;
                            case 5:
                                str5 = "thursday";
                                break;
                            case 6:
                                str5 = "friday";
                                break;
                            default:
                                str5 = "saturday";
                                break;
                        }
                        bundle.putString("day_set", str5);
                    }
                }
                bundle.putString("source", "template_activity");
                bundle.putBoolean("main_activity", P().K);
                bundle.putBoolean("is_revamped", true);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "add_goal");
                if (sp.b.K()) {
                    t P = P();
                    P.f29784h0.e(getViewLifecycleOwner(), new hl.p(21, new a()));
                    String str9 = this.f11011y;
                    int hashCode3 = str9.hashCode();
                    if (hashCode3 != -2070778647) {
                        if (hashCode3 != -1036290639) {
                            if (hashCode3 == 777898929 && str9.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                time2 = calendar2.getTime();
                            }
                        } else if (str9.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            time2 = calendar.getTime();
                        }
                    } else if (str9.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                        time2 = this.f11012z.getTime();
                    }
                    P.h(str9, time2, this.E);
                    return;
                }
                t P2 = P();
                String str10 = this.f11011y;
                int hashCode4 = str10.hashCode();
                if (hashCode4 != -2070778647) {
                    if (hashCode4 != -1036290639) {
                        if (hashCode4 == 777898929 && str10.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            time = calendar2.getTime();
                            P2.i(str10, time, this.E);
                            requireActivity = requireActivity();
                            if (requireActivity instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity;
                            }
                            if (newDynamicParentActivity2 == null) {
                                int i6 = NewDynamicParentActivity.F;
                                newDynamicParentActivity2.L0(false);
                                return;
                            }
                            return;
                        }
                        time = null;
                        P2.i(str10, time, this.E);
                        requireActivity = requireActivity();
                        if (requireActivity instanceof NewDynamicParentActivity) {
                        }
                        if (newDynamicParentActivity2 == null) {
                        }
                    } else if (str10.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        time = calendar.getTime();
                        P2.i(str10, time, this.E);
                        requireActivity = requireActivity();
                        if (requireActivity instanceof NewDynamicParentActivity) {
                        }
                        if (newDynamicParentActivity2 == null) {
                        }
                    } else {
                        time = null;
                        P2.i(str10, time, this.E);
                        requireActivity = requireActivity();
                        if (requireActivity instanceof NewDynamicParentActivity) {
                        }
                        if (newDynamicParentActivity2 == null) {
                        }
                    }
                } else {
                    if (str10.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                        time = this.f11012z.getTime();
                        P2.i(str10, time, this.E);
                        requireActivity = requireActivity();
                        if (requireActivity instanceof NewDynamicParentActivity) {
                        }
                        if (newDynamicParentActivity2 == null) {
                        }
                    }
                    time = null;
                    P2.i(str10, time, this.E);
                    requireActivity = requireActivity();
                    if (requireActivity instanceof NewDynamicParentActivity) {
                    }
                    if (newDynamicParentActivity2 == null) {
                    }
                }
            } else {
                p requireActivity2 = requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                }
                if (newDynamicParentActivity != null) {
                    int i10 = NewDynamicParentActivity.F;
                    newDynamicParentActivity.L0(false);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11009w, e10);
        }
    }

    public final t P() {
        return (t) this.f11010x.getValue();
    }

    public final void Q(RobertoTextView robertoTextView, String str) {
        try {
            U(str);
            View view = this.D;
            if (view != null) {
                view.setBackgroundTintList(null);
            }
            this.D = robertoTextView;
            if (robertoTextView != null) {
                robertoTextView.setBackgroundTintList(g0.a.c(R.color.amahaLightGreen, requireContext()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11009w, e10);
        }
    }

    public final void S(Chip chip, boolean z10) {
        if (chip == null) {
            return;
        }
        try {
            if (z10) {
                chip.setChipBackgroundColorResource(R.color.amahaLightGreen);
                chip.setChipStrokeColorResource(R.color.amahaLightGreen);
                chip.setTextColor(g0.a.b(chip.getContext(), R.color.amahaGreen));
                AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
                Context context = chip.getContext();
                i.f(context, "view.context");
                chip.setTypeface(assetProviderSingleton.getTypeface(context, "Quicksand-Bold.ttf"));
            } else {
                chip.setTextColor(g0.a.b(chip.getContext(), R.color.amahaDarkGray));
                chip.setChipStrokeColorResource(R.color.proDashboardFooter);
                chip.setChipBackgroundColorResource(R.color.white);
                AssetProviderSingleton assetProviderSingleton2 = AssetProviderSingleton.INSTANCE;
                Context context2 = chip.getContext();
                i.f(context2, "view.context");
                chip.setTypeface(assetProviderSingleton2.getTypeface(context2, "Quicksand-Medium.ttf"));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11009w, e10);
        }
    }

    public final void U(String str) {
        int i6;
        try {
            Locale ENGLISH = Locale.ENGLISH;
            i.f(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            switch (lowerCase.hashCode()) {
                case -1266285217:
                    if (lowerCase.equals("friday")) {
                        i6 = 6;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case -1068502768:
                    if (lowerCase.equals("monday")) {
                        i6 = 2;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case -977343923:
                    if (lowerCase.equals("tuesday")) {
                        i6 = 3;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case -891186736:
                    if (lowerCase.equals("sunday")) {
                        i6 = 1;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case 1393530710:
                    if (lowerCase.equals("wednesday")) {
                        i6 = 4;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                case 1572055514:
                    if (lowerCase.equals("thursday")) {
                        i6 = 5;
                        break;
                    } else {
                        i6 = 7;
                        break;
                    }
                default:
                    i6 = 7;
                    break;
            }
            this.A.set(7, i6);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11009w, e10);
        }
    }

    public final void X() {
        Calendar calendar = this.A;
        Calendar calendar2 = this.B;
        try {
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener(this) { // from class: pl.y

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ N19ScreenFragment f28670v;

                {
                    this.f28670v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    N19ScreenFragment this$0 = this.f28670v;
                    switch (i11) {
                        case 0:
                            int i12 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j10 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j10, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f11012z = calendar3;
                            return;
                        case 1:
                            int i13 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.A;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.B;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, this.f11012z.get(11), this.f11012z.get(12), false);
            timePickerDialog.setTitle("Pick time");
            TimePickerDialog timePickerDialog2 = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener(this) { // from class: pl.y

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ N19ScreenFragment f28670v;

                {
                    this.f28670v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    N19ScreenFragment this$0 = this.f28670v;
                    switch (i11) {
                        case 0:
                            int i12 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j10 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j10, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f11012z = calendar3;
                            return;
                        case 1:
                            int i13 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.A;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.B;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, calendar.get(11), calendar.get(12), false);
            timePickerDialog2.setTitle("Pick time");
            TimePickerDialog timePickerDialog3 = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener(this) { // from class: pl.y

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ N19ScreenFragment f28670v;

                {
                    this.f28670v = this;
                }

                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                    int i11 = r2;
                    N19ScreenFragment this$0 = this.f28670v;
                    switch (i11) {
                        case 0:
                            int i12 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar3 = Calendar.getInstance();
                            long j10 = 1000;
                            calendar3.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * j10);
                            calendar3.add(11, i6);
                            calendar3.add(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar3.getTimeInMillis() / j10, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            this$0.f11012z = calendar3;
                            return;
                        case 1:
                            int i13 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar4 = this$0.A;
                            calendar4.set(11, i6);
                            calendar4.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar4.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                        default:
                            int i14 = N19ScreenFragment.K;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Calendar calendar5 = this$0.B;
                            calendar5.set(11, i6);
                            calendar5.set(12, i10);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(calendar5.getTimeInMillis() / 1000, 0, this$0.C).format(DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:mm a").withLocale(Locale.ENGLISH)));
                            return;
                    }
                }
            }, calendar2.get(11), calendar2.get(12), false);
            timePickerDialog3.setTitle("Pick time");
            DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog3, 1), calendar2.get(1), calendar2.get(2), calendar2.get(5));
            datePickerDialog.getDatePicker().setMinDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setOnClickListener(new q(this, timePickerDialog, timePickerDialog2, datePickerDialog, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11009w, e10);
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.J.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n19_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.D = null;
        super.onDestroy();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03dc A[Catch: Exception -> 0x05fd, TryCatch #0 {Exception -> 0x05fd, blocks: (B:122:0x019c, B:124:0x01a4, B:126:0x01a8, B:132:0x01b1, B:134:0x01b9, B:137:0x01c1, B:139:0x01cb, B:141:0x01d1, B:142:0x01d5, B:144:0x01db, B:148:0x01ee, B:150:0x01f2, B:154:0x0202, B:156:0x0208, B:162:0x0219, B:165:0x0221, B:166:0x022b, B:168:0x0230, B:171:0x023a, B:172:0x026a, B:238:0x03d0, B:242:0x03e8, B:244:0x03f0, B:247:0x0404, B:241:0x03dc, B:174:0x026e, B:175:0x027d, B:176:0x028c, B:177:0x029b, B:178:0x02aa, B:179:0x02b9, B:180:0x02c8, B:182:0x02db, B:185:0x02e4, B:186:0x02f5, B:192:0x0307, B:189:0x02fe, B:198:0x0343, B:200:0x034b, B:202:0x034f, B:205:0x0355, B:206:0x035e, B:208:0x0364, B:210:0x036c, B:211:0x0370, B:212:0x0377, B:214:0x037d, B:216:0x038d, B:223:0x03a1, B:227:0x03aa, B:231:0x03b3, B:237:0x03c6), top: B:340:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f0 A[Catch: Exception -> 0x05fd, TRY_LEAVE, TryCatch #0 {Exception -> 0x05fd, blocks: (B:122:0x019c, B:124:0x01a4, B:126:0x01a8, B:132:0x01b1, B:134:0x01b9, B:137:0x01c1, B:139:0x01cb, B:141:0x01d1, B:142:0x01d5, B:144:0x01db, B:148:0x01ee, B:150:0x01f2, B:154:0x0202, B:156:0x0208, B:162:0x0219, B:165:0x0221, B:166:0x022b, B:168:0x0230, B:171:0x023a, B:172:0x026a, B:238:0x03d0, B:242:0x03e8, B:244:0x03f0, B:247:0x0404, B:241:0x03dc, B:174:0x026e, B:175:0x027d, B:176:0x028c, B:177:0x029b, B:178:0x02aa, B:179:0x02b9, B:180:0x02c8, B:182:0x02db, B:185:0x02e4, B:186:0x02f5, B:192:0x0307, B:189:0x02fe, B:198:0x0343, B:200:0x034b, B:202:0x034f, B:205:0x0355, B:206:0x035e, B:208:0x0364, B:210:0x036c, B:211:0x0370, B:212:0x0377, B:214:0x037d, B:216:0x038d, B:223:0x03a1, B:227:0x03aa, B:231:0x03b3, B:237:0x03c6), top: B:340:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0404 A[Catch: Exception -> 0x05fd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x05fd, blocks: (B:122:0x019c, B:124:0x01a4, B:126:0x01a8, B:132:0x01b1, B:134:0x01b9, B:137:0x01c1, B:139:0x01cb, B:141:0x01d1, B:142:0x01d5, B:144:0x01db, B:148:0x01ee, B:150:0x01f2, B:154:0x0202, B:156:0x0208, B:162:0x0219, B:165:0x0221, B:166:0x022b, B:168:0x0230, B:171:0x023a, B:172:0x026a, B:238:0x03d0, B:242:0x03e8, B:244:0x03f0, B:247:0x0404, B:241:0x03dc, B:174:0x026e, B:175:0x027d, B:176:0x028c, B:177:0x029b, B:178:0x02aa, B:179:0x02b9, B:180:0x02c8, B:182:0x02db, B:185:0x02e4, B:186:0x02f5, B:192:0x0307, B:189:0x02fe, B:198:0x0343, B:200:0x034b, B:202:0x034f, B:205:0x0355, B:206:0x035e, B:208:0x0364, B:210:0x036c, B:211:0x0370, B:212:0x0377, B:214:0x037d, B:216:0x038d, B:223:0x03a1, B:227:0x03aa, B:231:0x03b3, B:237:0x03c6), top: B:340:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0446 A[Catch: Exception -> 0x043a, TRY_ENTER, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0486 A[Catch: Exception -> 0x043a, TRY_ENTER, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04bc A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ca A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04d8 A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ef A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x053d A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0560 A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x057b A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x058f A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05a3 A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05b7 A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05cb A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05df A[Catch: Exception -> 0x043a, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05f3 A[Catch: Exception -> 0x043a, TRY_LEAVE, TryCatch #2 {Exception -> 0x043a, blocks: (B:249:0x0420, B:251:0x0436, B:259:0x0446, B:261:0x0479, B:267:0x0486, B:269:0x04b5, B:272:0x04bc, B:274:0x04ca, B:276:0x04d8, B:277:0x04e4, B:279:0x04ef, B:280:0x04f7, B:306:0x0554, B:314:0x056d, B:316:0x057b, B:317:0x0584, B:319:0x058f, B:320:0x0598, B:322:0x05a3, B:323:0x05ac, B:325:0x05b7, B:326:0x05c0, B:328:0x05cb, B:329:0x05d4, B:331:0x05df, B:332:0x05e8, B:334:0x05f3, B:309:0x0560, B:313:0x056a, B:287:0x050b, B:290:0x0512, B:292:0x051d, B:293:0x0521, B:296:0x052a, B:298:0x0535, B:300:0x053d, B:303:0x0546, B:305:0x0551), top: B:343:0x0420 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        NewDynamicParentActivity newDynamicParentActivity;
        Object obj;
        Object obj2;
        String str2;
        String str3;
        String str4;
        Goal goal;
        Object obj3;
        Object obj4;
        ArrayList arrayList;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        SwitchCompat switchCompat;
        SwitchCompat switchCompat2;
        Object obj5;
        final Chip chip;
        Object obj6;
        int i10;
        final Chip chip2;
        final Chip chip3;
        ChipGroup chipGroup;
        int hashCode;
        Object obj7;
        ChipGroup chipGroup2;
        ConstraintLayout constraintLayout;
        int i11;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        RobertoTextView robertoTextView7;
        ChipGroup chipGroup3;
        ChipGroup chipGroup4;
        boolean z14;
        String str5;
        boolean z15;
        CustomDate scheduledDate;
        User user;
        ArrayList<Goal> userGoals;
        Object obj8;
        String str6;
        NewDynamicParentActivity newDynamicParentActivity2;
        NewDynamicParentActivity newDynamicParentActivity3;
        NewDynamicParentActivity newDynamicParentActivity4;
        NewDynamicParentActivity newDynamicParentActivity5;
        int i12;
        int i13;
        Integer w02;
        Integer w03;
        Object obj9;
        String str7;
        Object obj10;
        String str8;
        Object obj11;
        String str9;
        Object obj12;
        String str10;
        Object obj13;
        String str11;
        Object obj14;
        String str12;
        Boolean bool;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        t P = P();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("slug");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num = null;
        }
        HashMap m10 = P.m(num, str);
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            if (m10 != null) {
                obj13 = m10.get("cta1");
            } else {
                obj13 = null;
            }
            if (obj13 instanceof String) {
                str11 = (String) obj13;
            } else {
                str11 = null;
            }
            if (m10 != null) {
                obj14 = m10.get("cta2");
            } else {
                obj14 = null;
            }
            if (obj14 instanceof String) {
                str12 = (String) obj14;
            } else {
                str12 = null;
            }
            NewDynamicParentActivity.F0(newDynamicParentActivity, str11, str12, null, null, 12);
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                bool = Boolean.valueOf(arguments3.getBoolean("show_info_button"));
            } else {
                bool = null;
            }
            newDynamicParentActivity.O0(bool);
            newDynamicParentActivity.E0("cta_type_1");
        }
        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19ScreenTitle);
        if (robertoTextView8 != null) {
            if (m10 != null) {
                obj12 = m10.get("title");
            } else {
                obj12 = null;
            }
            if (obj12 instanceof String) {
                str10 = (String) obj12;
            } else {
                str10 = null;
            }
            robertoTextView8.setText(str10);
        }
        RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19ScreenDesc);
        if (robertoTextView9 != null) {
            if (m10 != null) {
                obj11 = m10.get("description");
            } else {
                obj11 = null;
            }
            if (obj11 instanceof String) {
                str9 = (String) obj11;
            } else {
                str9 = null;
            }
            robertoTextView9.setText(str9);
        }
        RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19ScreenReminderTitle);
        if (robertoTextView10 != null) {
            if (m10 != null) {
                obj10 = m10.get("reminder_title");
            } else {
                obj10 = null;
            }
            if (obj10 instanceof String) {
                str8 = (String) obj10;
            } else {
                str8 = null;
            }
            robertoTextView10.setText(str8);
        }
        String str13 = this.f11009w;
        if (m10 != null) {
            try {
                obj = m10.get(Constants.SCREEN_PROGRESS);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str13, "exception", e10);
            }
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str6 = (String) obj;
        } else {
            str6 = null;
        }
        p requireActivity2 = requireActivity();
        if (requireActivity2 instanceof NewDynamicParentActivity) {
            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
        } else {
            newDynamicParentActivity2 = null;
        }
        if (newDynamicParentActivity2 != null) {
            if (m10 != null) {
                obj9 = m10.get("heading");
            } else {
                obj9 = null;
            }
            if (obj9 instanceof String) {
                str7 = (String) obj9;
            } else {
                str7 = null;
            }
            newDynamicParentActivity2.I0(str7);
        }
        if (str6 != null) {
            List a12 = r.a1(str6, new String[]{"/"}, 0, 6);
            String str14 = (String) u.j2(0, a12);
            String str15 = (String) u.j2(1, a12);
            p requireActivity3 = requireActivity();
            if (requireActivity3 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity3;
            } else {
                newDynamicParentActivity4 = null;
            }
            if (newDynamicParentActivity4 != null) {
                newDynamicParentActivity4.M0();
            }
            p requireActivity4 = requireActivity();
            if (requireActivity4 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity5 = (NewDynamicParentActivity) requireActivity4;
            } else {
                newDynamicParentActivity5 = null;
            }
            if (newDynamicParentActivity5 != null) {
                if (str14 != null && (w03 = m.w0(str14)) != null) {
                    i12 = w03.intValue();
                } else {
                    i12 = 0;
                }
                if (str15 != null && (w02 = m.w0(str15)) != null) {
                    i13 = w02.intValue();
                } else {
                    i13 = 0;
                }
                newDynamicParentActivity5.G0(i12, i13);
            }
        } else {
            p requireActivity5 = requireActivity();
            if (requireActivity5 instanceof NewDynamicParentActivity) {
                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity5;
            } else {
                newDynamicParentActivity3 = null;
            }
            if (newDynamicParentActivity3 != null) {
                newDynamicParentActivity3.y0();
            }
        }
        if (m10 != null) {
            try {
                obj2 = m10.get("default_goal_frequency");
            } catch (Exception e11) {
                e = e11;
                str2 = str13;
                LogHelper.INSTANCE.e(str2, e);
                return;
            }
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str3 = (String) obj2;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "daily";
        }
        j<String, String, String> jVar = P().O;
        if (jVar != null) {
            str4 = jVar.f19473u;
        } else {
            str4 = null;
        }
        if (str4 != null && (user = FirebasePersistence.getInstance().getUser()) != null && (userGoals = user.getUserGoals()) != null) {
            Iterator<T> it = userGoals.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj8 = it.next();
                    if (i.b(((Goal) obj8).getGoalId(), str4)) {
                        break;
                    }
                } else {
                    obj8 = null;
                    break;
                }
            }
            goal = (Goal) obj8;
        } else {
            goal = null;
        }
        if (P().C) {
            if (goal != null && (scheduledDate = goal.getScheduledDate()) != null && scheduledDate.getTime() == 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                if (goal != null) {
                    str5 = goal.getType();
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -2070778647:
                            if (!str5.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                                break;
                            }
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(goal.getmScheduleDate().getTime());
                            Calendar calendar2 = this.f11012z;
                            obj3 = "weekly";
                            calendar2.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                            calendar2.set(11, calendar.get(11));
                            calendar2.set(12, calendar.get(12));
                            str3 = "daily";
                            z13 = true;
                            z10 = false;
                            z12 = false;
                            break;
                        case -1408757131:
                            if (str5.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.setTimeInMillis(goal.getmScheduleDate().getTime());
                                Calendar calendar22 = this.f11012z;
                                obj3 = "weekly";
                                calendar22.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                                calendar22.set(11, calendar3.get(11));
                                calendar22.set(12, calendar3.get(12));
                                str3 = "daily";
                                z13 = true;
                                z10 = false;
                                z12 = false;
                                break;
                            }
                            break;
                        case -1036290639:
                            if (str5.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                this.B.setTimeInMillis(goal.getmScheduleDate().getTime());
                                obj3 = "weekly";
                                str3 = "one_time";
                                z15 = true;
                                z10 = z15;
                                z13 = false;
                                z12 = false;
                                break;
                            } else {
                                break;
                            }
                        case 777898929:
                            if (str5.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                Calendar calendar4 = Calendar.getInstance();
                                calendar4.setTimeInMillis(goal.getmScheduleDate().getTime());
                                Calendar calendar5 = this.A;
                                calendar5.setTimeInMillis(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
                                calendar5.set(11, calendar4.get(11));
                                calendar5.set(12, calendar4.get(12));
                                switch (calendar4.get(7)) {
                                    case 1:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                        break;
                                    case 2:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                        break;
                                    case 3:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                        break;
                                    case 4:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                        break;
                                    case 5:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                        break;
                                    case 6:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                        break;
                                    case 7:
                                        Q((RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                        break;
                                }
                                str3 = "weekly";
                                obj3 = str3;
                                z13 = false;
                                z10 = false;
                                z12 = true;
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                    switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
                    if (switchCompat != null) {
                        this.F.getClass();
                        switchCompat.setChecked(yn.a.b());
                    }
                    switchCompat2 = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
                    if (switchCompat2 != null) {
                        switchCompat2.setOnCheckedChangeListener(new ib.a(1, this));
                    }
                    int i14 = this.G;
                    if (z13) {
                        int i15 = bn.a.f4534a;
                        p requireActivity6 = requireActivity();
                        i.f(requireActivity6, "requireActivity()");
                        ChipGroup cgN19ScreenFrequencyContainer = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                        i.f(cgN19ScreenFrequencyContainer, "cgN19ScreenFrequencyContainer");
                        str2 = str13;
                        try {
                            obj5 = obj3;
                            chip = bn.a.h(requireActivity6, "Daily", cgN19ScreenFrequencyContainer, false, new f(64, 32));
                            if (chip != null) {
                                chip.setId(i14);
                                int i16 = this.H;
                                if (z12) {
                                    obj6 = "daily";
                                    i10 = i14;
                                } else {
                                    int i17 = bn.a.f4534a;
                                    p requireActivity7 = requireActivity();
                                    i.f(requireActivity7, "requireActivity()");
                                    ChipGroup cgN19ScreenFrequencyContainer2 = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                                    i.f(cgN19ScreenFrequencyContainer2, "cgN19ScreenFrequencyContainer");
                                    i10 = i14;
                                    obj6 = "daily";
                                    chip2 = bn.a.h(requireActivity7, "Weekly", cgN19ScreenFrequencyContainer2, false, new f(64, 32));
                                    if (chip2 != null) {
                                        chip2.setId(i16);
                                        int i18 = this.I;
                                        if (z10) {
                                            int i19 = bn.a.f4534a;
                                            p requireActivity8 = requireActivity();
                                            i.f(requireActivity8, "requireActivity()");
                                            ChipGroup cgN19ScreenFrequencyContainer3 = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                                            i.f(cgN19ScreenFrequencyContainer3, "cgN19ScreenFrequencyContainer");
                                            chip3 = bn.a.h(requireActivity8, "Just Once", cgN19ScreenFrequencyContainer3, false, new f(64, 32));
                                            if (chip3 != null) {
                                                chip3.setId(i18);
                                                if (z13) {
                                                    ((ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)).addView(chip);
                                                }
                                                if (z12) {
                                                    ((ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)).addView(chip2);
                                                }
                                                if (z10) {
                                                    ((ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)).addView(chip3);
                                                }
                                                chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                                                if (chipGroup != null) {
                                                    chipGroup.setOnCheckedStateChangeListener(new ChipGroup.d() { // from class: pl.w
                                                        @Override // com.google.android.material.chip.ChipGroup.d
                                                        public final void n(ChipGroup chipGroup5, ArrayList arrayList2) {
                                                            ChipGroup chipGroup6;
                                                            ChipGroup chipGroup7;
                                                            ChipGroup chipGroup8;
                                                            int i20 = N19ScreenFragment.K;
                                                            N19ScreenFragment this$0 = N19ScreenFragment.this;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            kotlin.jvm.internal.i.g(chipGroup5, "<anonymous parameter 0>");
                                                            boolean isEmpty = arrayList2.isEmpty();
                                                            int i21 = this$0.I;
                                                            int i22 = this$0.H;
                                                            int i23 = this$0.G;
                                                            if (isEmpty) {
                                                                String str16 = this$0.f11011y;
                                                                int hashCode2 = str16.hashCode();
                                                                if (hashCode2 != -791707519) {
                                                                    if (hashCode2 != 3415681) {
                                                                        if (hashCode2 == 95346201 && str16.equals("daily") && (chipGroup8 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                                            chipGroup8.b(i23);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    } else if (str16.equals("once") && (chipGroup7 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                                        chipGroup7.b(i21);
                                                                        return;
                                                                    } else {
                                                                        return;
                                                                    }
                                                                } else if (str16.equals("weekly") && (chipGroup6 = (ChipGroup) this$0._$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                                    chipGroup6.b(i22);
                                                                    return;
                                                                } else {
                                                                    return;
                                                                }
                                                            }
                                                            Integer num2 = (Integer) is.u.g2(arrayList2);
                                                            Chip chip4 = chip;
                                                            Chip chip5 = chip2;
                                                            Chip chip6 = chip3;
                                                            ZoneOffset zoneOffset = this$0.C;
                                                            if (num2 != null && num2.intValue() == i23) {
                                                                this$0.S(chip4, true);
                                                                this$0.S(chip5, false);
                                                                this$0.S(chip6, false);
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                                                if (constraintLayout2 != null) {
                                                                    constraintLayout2.setVisibility(8);
                                                                }
                                                                this$0.f11011y = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                                                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(this$0.f11012z.getTimeInMillis() / 1000, 0, zoneOffset).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                                                            } else if (num2 != null && num2.intValue() == i22) {
                                                                this$0.S(chip4, false);
                                                                this$0.S(chip5, true);
                                                                this$0.S(chip6, false);
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                                                if (constraintLayout3 != null) {
                                                                    constraintLayout3.setVisibility(0);
                                                                }
                                                                this$0.f11011y = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                                                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(this$0.A.getTimeInMillis() / 1000, 0, zoneOffset).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
                                                            } else if (num2 != null && num2.intValue() == i21) {
                                                                this$0.S(chip4, false);
                                                                this$0.S(chip5, false);
                                                                this$0.S(chip6, true);
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                                                if (constraintLayout4 != null) {
                                                                    constraintLayout4.setVisibility(8);
                                                                }
                                                                this$0.f11011y = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                                                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19ScreenTimeTextDaily)).setText(LocalDateTime.ofEpochSecond(this$0.B.getTimeInMillis() / 1000, 0, zoneOffset).format(DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:mm a").withLocale(Locale.ENGLISH)));
                                                            }
                                                        }
                                                    });
                                                }
                                                hashCode = str3.hashCode();
                                                if (hashCode == -791707519) {
                                                    if (hashCode != 95346201) {
                                                        if (hashCode == 2002414854 && str3.equals("one_time") && (chipGroup4 = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                            chipGroup4.b(i18);
                                                        }
                                                    } else if (str3.equals(obj6) && (chipGroup3 = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                        chipGroup3.b(i10);
                                                    }
                                                    obj7 = obj5;
                                                } else {
                                                    obj7 = obj5;
                                                    if (str3.equals(obj7) && (chipGroup2 = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer)) != null) {
                                                        chipGroup2.b(i16);
                                                    }
                                                }
                                                constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                                if (constraintLayout != null) {
                                                    if (i.b(str3, obj7)) {
                                                        i11 = 0;
                                                    } else {
                                                        i11 = 8;
                                                    }
                                                    constraintLayout.setVisibility(i11);
                                                }
                                                X();
                                                robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
                                                if (robertoTextView != null) {
                                                    robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
                                                if (robertoTextView2 != null) {
                                                    robertoTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
                                                if (robertoTextView3 != null) {
                                                    robertoTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
                                                if (robertoTextView4 != null) {
                                                    robertoTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
                                                if (robertoTextView5 != null) {
                                                    robertoTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
                                                if (robertoTextView6 != null) {
                                                    robertoTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                }
                                                robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
                                                if (robertoTextView7 == null) {
                                                    robertoTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: pl.x

                                                        /* renamed from: v  reason: collision with root package name */
                                                        public final /* synthetic */ N19ScreenFragment f28666v;

                                                        {
                                                            this.f28666v = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            int i20 = r2;
                                                            N19ScreenFragment this$0 = this.f28666v;
                                                            switch (i20) {
                                                                case 0:
                                                                    int i21 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek1), "sunday");
                                                                    return;
                                                                case 1:
                                                                    int i22 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek2), "monday");
                                                                    return;
                                                                case 2:
                                                                    int i23 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek3), "tuesday");
                                                                    return;
                                                                case 3:
                                                                    int i24 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek4), "wednesday");
                                                                    return;
                                                                case 4:
                                                                    int i25 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek5), "thursday");
                                                                    return;
                                                                case 5:
                                                                    int i26 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek6), "friday");
                                                                    return;
                                                                default:
                                                                    int i27 = N19ScreenFragment.K;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    this$0.Q((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN19DayOfWeek7), "saturday");
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        chip3 = null;
                                        if (z13) {
                                        }
                                        if (z12) {
                                        }
                                        if (z10) {
                                        }
                                        chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                                        if (chipGroup != null) {
                                        }
                                        hashCode = str3.hashCode();
                                        if (hashCode == -791707519) {
                                        }
                                        constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                        if (constraintLayout != null) {
                                        }
                                        X();
                                        robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
                                        if (robertoTextView != null) {
                                        }
                                        robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
                                        if (robertoTextView2 != null) {
                                        }
                                        robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
                                        if (robertoTextView3 != null) {
                                        }
                                        robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
                                        if (robertoTextView4 != null) {
                                        }
                                        robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
                                        if (robertoTextView5 != null) {
                                        }
                                        robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
                                        if (robertoTextView6 != null) {
                                        }
                                        robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
                                        if (robertoTextView7 == null) {
                                        }
                                    }
                                }
                                chip2 = null;
                                int i182 = this.I;
                                if (z10) {
                                }
                                chip3 = null;
                                if (z13) {
                                }
                                if (z12) {
                                }
                                if (z10) {
                                }
                                chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                                if (chipGroup != null) {
                                }
                                hashCode = str3.hashCode();
                                if (hashCode == -791707519) {
                                }
                                constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                                if (constraintLayout != null) {
                                }
                                X();
                                robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
                                if (robertoTextView != null) {
                                }
                                robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
                                if (robertoTextView2 != null) {
                                }
                                robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
                                if (robertoTextView3 != null) {
                                }
                                robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
                                if (robertoTextView4 != null) {
                                }
                                robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
                                if (robertoTextView5 != null) {
                                }
                                robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
                                if (robertoTextView6 != null) {
                                }
                                robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
                                if (robertoTextView7 == null) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            LogHelper.INSTANCE.e(str2, e);
                            return;
                        }
                    } else {
                        str2 = str13;
                        obj5 = obj3;
                    }
                    chip = null;
                    int i162 = this.H;
                    if (z12) {
                    }
                    chip2 = null;
                    int i1822 = this.I;
                    if (z10) {
                    }
                    chip3 = null;
                    if (z13) {
                    }
                    if (z12) {
                    }
                    if (z10) {
                    }
                    chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                    if (chipGroup != null) {
                    }
                    hashCode = str3.hashCode();
                    if (hashCode == -791707519) {
                    }
                    constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                    if (constraintLayout != null) {
                    }
                    X();
                    robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
                    if (robertoTextView != null) {
                    }
                    robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
                    if (robertoTextView2 != null) {
                    }
                    robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
                    if (robertoTextView3 != null) {
                    }
                    robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
                    if (robertoTextView4 != null) {
                    }
                    robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
                    if (robertoTextView5 != null) {
                    }
                    robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
                    if (robertoTextView6 != null) {
                    }
                    robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
                    if (robertoTextView7 == null) {
                    }
                }
                obj3 = "weekly";
                z15 = false;
                z10 = z15;
                z13 = false;
                z12 = false;
                switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
                if (switchCompat != null) {
                }
                switchCompat2 = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
                if (switchCompat2 != null) {
                }
                int i142 = this.G;
                if (z13) {
                }
                chip = null;
                int i1622 = this.H;
                if (z12) {
                }
                chip2 = null;
                int i18222 = this.I;
                if (z10) {
                }
                chip3 = null;
                if (z13) {
                }
                if (z12) {
                }
                if (z10) {
                }
                chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
                if (chipGroup != null) {
                }
                hashCode = str3.hashCode();
                if (hashCode == -791707519) {
                }
                constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
                if (constraintLayout != null) {
                }
                X();
                robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
                if (robertoTextView != null) {
                }
                robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
                if (robertoTextView2 != null) {
                }
                robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
                if (robertoTextView3 != null) {
                }
                robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
                if (robertoTextView4 != null) {
                }
                robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
                if (robertoTextView5 != null) {
                }
                robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
                if (robertoTextView6 != null) {
                }
                robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
                if (robertoTextView7 == null) {
                }
            }
        }
        obj3 = "weekly";
        if (m10 != null) {
            obj4 = m10.get("goal_frequency_list");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof ArrayList) {
            arrayList = (ArrayList) obj4;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj15 : arrayList) {
                if (obj15 instanceof HashMap) {
                    arrayList2.add(obj15);
                }
            }
            Iterator it2 = arrayList2.iterator();
            z10 = false;
            z11 = false;
            z12 = false;
            while (it2.hasNext()) {
                String str16 = (String) ((HashMap) it2.next()).get("list_key");
                if (str16 != null) {
                    int hashCode2 = str16.hashCode();
                    if (hashCode2 != -791707519) {
                        if (hashCode2 != 95346201) {
                            if (hashCode2 == 2002414854 && str16.equals("one_time")) {
                                z10 = true;
                            }
                        } else if (str16.equals("daily")) {
                            z11 = true;
                        }
                    } else if (str16.equals(obj3)) {
                        z12 = true;
                    }
                }
            }
            i6 = R.id.tvN19DayOfWeek1;
        } else {
            i6 = R.id.tvN19DayOfWeek1;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        Q((RobertoTextView) _$_findCachedViewById(i6), "sunday");
        z13 = z11;
        switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
        if (switchCompat != null) {
        }
        switchCompat2 = (SwitchCompat) _$_findCachedViewById(R.id.scN19ScreenReminderToggle);
        if (switchCompat2 != null) {
        }
        int i1422 = this.G;
        if (z13) {
        }
        chip = null;
        int i16222 = this.H;
        if (z12) {
        }
        chip2 = null;
        int i182222 = this.I;
        if (z10) {
        }
        chip3 = null;
        if (z13) {
        }
        if (z12) {
        }
        if (z10) {
        }
        chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgN19ScreenFrequencyContainer);
        if (chipGroup != null) {
        }
        hashCode = str3.hashCode();
        if (hashCode == -791707519) {
        }
        constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clN19DayOfWeekInfoContainer);
        if (constraintLayout != null) {
        }
        X();
        robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek1);
        if (robertoTextView != null) {
        }
        robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek2);
        if (robertoTextView2 != null) {
        }
        robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek3);
        if (robertoTextView3 != null) {
        }
        robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek4);
        if (robertoTextView4 != null) {
        }
        robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek5);
        if (robertoTextView5 != null) {
        }
        robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek6);
        if (robertoTextView6 != null) {
        }
        robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvN19DayOfWeek7);
        if (robertoTextView7 == null) {
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
