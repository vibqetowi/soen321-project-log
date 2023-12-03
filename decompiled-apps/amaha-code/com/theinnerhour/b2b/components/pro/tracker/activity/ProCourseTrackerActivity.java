package com.theinnerhour.b2b.components.pro.tracker.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProCourseTrackerActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.s;
import is.k;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import oo.b;
import rr.a;
import vs.c;
/* compiled from: ProCourseTrackerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/tracker/activity/ProCourseTrackerActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProCourseTrackerActivity extends a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f11556z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11553w = LogHelper.INSTANCE.makeLogTag(ProCourseTrackerActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f11554x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, Integer> f11555y = new HashMap<>();

    public ProCourseTrackerActivity() {
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(1:3)(1:102)|4|(1:6)(1:101)|7|(1:9)|10|(1:12)|13|(13:15|(1:(1:(1:19))(1:98))(1:99)|20|(1:22)(3:93|(1:95)(1:97)|96)|23|(1:25)(1:92)|26|27|(4:30|(2:32|33)(4:35|36|39|40)|34|28)|65|66|(1:88)(1:70)|(1:86)(8:74|(1:76)|77|(1:79)|80|(1:82)|83|84))|100|20|(0)(0)|23|(0)(0)|26|27|(1:28)|65|66|(1:68)|88|(2:72|86)(1:87)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x028f, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0290, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r9.f11553w, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e2 A[Catch: Exception -> 0x028f, TryCatch #0 {Exception -> 0x028f, blocks: (B:39:0x01d0, B:40:0x01dc, B:42:0x01e2, B:74:0x025d, B:45:0x0208, B:46:0x020c, B:73:0x025a, B:48:0x0210, B:52:0x021c, B:56:0x0228, B:60:0x0234, B:64:0x0240, B:68:0x024c), top: B:100:0x01d0 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        int i6;
        ArrayList<String> arrayList;
        boolean z10;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_course_tracker);
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
        } else {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
        }
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("trackers");
        } else {
            serializable = null;
        }
        ArrayList<String> arrayList2 = (ArrayList) serializable;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        this.f11554x = arrayList2;
        Calendar calendar = Calendar.getInstance();
        Locale locale = Locale.ENGLISH;
        String dateText = new SimpleDateFormat("dd", locale).format(Long.valueOf(calendar.getTimeInMillis()));
        i.f(dateText, "dateText");
        if (s.j1(dateText) == '0') {
            dateText = dateText.substring(1);
            i.f(dateText, "this as java.lang.String).substring(startIndex)");
        }
        if (!k.Q1(Integer.valueOf(calendar.get(5)), new Integer[]{11, 12, 13})) {
            int i10 = calendar.get(5) % 10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        str = "rd";
                    }
                } else {
                    str = "nd";
                }
            } else {
                str = "st";
            }
            ((RobertoTextView) u0(R.id.proCourseTrackerDateText)).setText(getString(R.string.pctDate, dateText + str + ' ' + new SimpleDateFormat("MMMM", locale).format(Long.valueOf(calendar.getTimeInMillis()))));
            ((AppCompatImageView) u0(R.id.proCourseTrackerBack)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ProCourseTrackerActivity f30837v;

                {
                    this.f30837v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    ProCourseTrackerActivity this$0 = this.f30837v;
                    switch (i11) {
                        case 0:
                            int i12 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 1:
                            int i13 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            UtilsKt.fireAnalytics("pro_old_tracker_done_click", new Bundle());
                            this$0.finish();
                            return;
                        default:
                            int i14 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_1", true);
                            ((RelativeLayout) this$0.u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(Constants.SCREEN_TRAKCER, "old");
                            bundle2.putBoolean("tracker_present", !this$0.f11554x.isEmpty());
                            UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                            return;
                    }
                }
            });
            ((RobertoButton) u0(R.id.proCourseTrackerButton)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ProCourseTrackerActivity f30837v;

                {
                    this.f30837v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    ProCourseTrackerActivity this$0 = this.f30837v;
                    switch (i11) {
                        case 0:
                            int i12 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 1:
                            int i13 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            UtilsKt.fireAnalytics("pro_old_tracker_done_click", new Bundle());
                            this$0.finish();
                            return;
                        default:
                            int i14 = ProCourseTrackerActivity.A;
                            i.g(this$0, "this$0");
                            ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_1", true);
                            ((RelativeLayout) this$0.u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(Constants.SCREEN_TRAKCER, "old");
                            bundle2.putBoolean("tracker_present", !this$0.f11554x.isEmpty());
                            UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                            return;
                    }
                }
            });
            if (!this.f11554x.isEmpty()) {
                ((AppCompatImageView) u0(R.id.proCourseTrackerNullState)).setVisibility(0);
                ((RobertoTextView) u0(R.id.proCourseTrackerNullStateText)).setVisibility(0);
                ((ConstraintLayout) u0(R.id.proCourseTrackerProgressLayout)).setVisibility(8);
                ((RobertoButton) u0(R.id.proCourseTrackerButton)).setVisibility(8);
            } else {
                ((AppCompatImageView) u0(R.id.proCourseTrackerNullState)).setVisibility(8);
                ((RobertoTextView) u0(R.id.proCourseTrackerNullStateText)).setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.proCourseTrackerProgressLayout);
                if (this.f11554x.size() > 1) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                constraintLayout.setVisibility(i6);
                ((RobertoButton) u0(R.id.proCourseTrackerButton)).setVisibility(0);
            }
            if (!ApplicationPersistence.getInstance().getBooleanValue("pro_course_tracker_alert_1", false)) {
                ((RelativeLayout) u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
            } else {
                ((RelativeLayout) u0(R.id.proCourseTrackerGotItCard)).setVisibility(0);
                ((RobertoButton) u0(R.id.proCourseTrackerInfoCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProCourseTrackerActivity f30837v;

                    {
                        this.f30837v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = r2;
                        ProCourseTrackerActivity this$0 = this.f30837v;
                        switch (i11) {
                            case 0:
                                int i12 = ProCourseTrackerActivity.A;
                                i.g(this$0, "this$0");
                                this$0.finish();
                                return;
                            case 1:
                                int i13 = ProCourseTrackerActivity.A;
                                i.g(this$0, "this$0");
                                UtilsKt.fireAnalytics("pro_old_tracker_done_click", new Bundle());
                                this$0.finish();
                                return;
                            default:
                                int i14 = ProCourseTrackerActivity.A;
                                i.g(this$0, "this$0");
                                ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_1", true);
                                ((RelativeLayout) this$0.u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(Constants.SCREEN_TRAKCER, "old");
                                bundle2.putBoolean("tracker_present", !this$0.f11554x.isEmpty());
                                UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                                return;
                        }
                    }
                });
            }
            int b10 = c.f36135u.b();
            for (String str3 : this.f11554x) {
                View inflate = getLayoutInflater().inflate(R.layout.row_pro_course_tracker_title, (ViewGroup) ((LinearLayout) u0(R.id.proCourseTrackerLL)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.proCourseTrackerName);
                if (robertoTextView != null) {
                    switch (str3.hashCode()) {
                        case -2114782937:
                            if (str3.equals(Constants.COURSE_HAPPINESS)) {
                                str2 = "Happiness tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        case -1617042330:
                            if (str3.equals(Constants.COURSE_DEPRESSION)) {
                                str2 = "Mood tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        case -891989580:
                            if (str3.equals(Constants.COURSE_STRESS)) {
                                str2 = "Stress tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        case 92960775:
                            if (str3.equals(Constants.COURSE_ANGER)) {
                                str2 = "Anger tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        case 109522647:
                            if (str3.equals(Constants.COURSE_SLEEP)) {
                                str2 = "Sleep tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        case 113319009:
                            if (str3.equals(Constants.COURSE_WORRY)) {
                                str2 = "Anxiety tracker";
                                break;
                            } else {
                                str2 = "";
                                break;
                            }
                        default:
                            str2 = "";
                            break;
                    }
                    robertoTextView.setText(str2);
                }
                ((LinearLayout) u0(R.id.proCourseTrackerLL)).addView(inflate);
                View inflate2 = getLayoutInflater().inflate(R.layout.row_campaign_blank, (ViewGroup) ((LinearLayout) u0(R.id.proCourseTrackerLL)), false);
                ((LinearLayout) u0(R.id.proCourseTrackerLL)).addView(inflate2);
                b10++;
                inflate2.setId(b10);
                this.f11555y.put(str3, Integer.valueOf(b10));
            }
            arrayList = this.f11554x;
            if (arrayList == null && !arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && !ApplicationPersistence.getInstance().getBooleanValue("pro_course_tracker_alert_2", false)) {
                View inflate3 = getLayoutInflater().inflate(R.layout.fragment_pro_tracker_bottom_sheet, (ViewGroup) ((ConstraintLayout) u0(R.id.proCourseTrackerParent)), false);
                i.f(inflate3, "layoutInflater.inflate(R…urseTrackerParent, false)");
                e eVar = new e(this, R.style.TransparentBottomSheetDialog);
                eVar.setContentView(inflate3);
                AppCompatImageView appCompatImageView = (AppCompatImageView) eVar.findViewById(R.id.proTrackerBottomSheetImg);
                if (appCompatImageView != null) {
                    Object obj = g0.a.f16164a;
                    appCompatImageView.setImageDrawable(a.c.b(this, R.drawable.ir_pro_course_tracker_bottom_sheet));
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) eVar.findViewById(R.id.proTrackerBottomSheetText);
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(getString(R.string.pctBottomSheet));
                }
                RobertoButton robertoButton = (RobertoButton) eVar.findViewById(R.id.proTrackerBottomSheetCTA);
                if (robertoButton != null) {
                    robertoButton.setOnClickListener(new b(eVar, 1));
                }
                eVar.setCancelable(false);
                eVar.show();
                return;
            }
        }
        str = "th";
        ((RobertoTextView) u0(R.id.proCourseTrackerDateText)).setText(getString(R.string.pctDate, dateText + str + ' ' + new SimpleDateFormat("MMMM", locale).format(Long.valueOf(calendar.getTimeInMillis()))));
        ((AppCompatImageView) u0(R.id.proCourseTrackerBack)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProCourseTrackerActivity f30837v;

            {
                this.f30837v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = r2;
                ProCourseTrackerActivity this$0 = this.f30837v;
                switch (i11) {
                    case 0:
                        int i12 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_old_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    default:
                        int i14 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "old");
                        bundle2.putBoolean("tracker_present", !this$0.f11554x.isEmpty());
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((RobertoButton) u0(R.id.proCourseTrackerButton)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProCourseTrackerActivity f30837v;

            {
                this.f30837v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = r2;
                ProCourseTrackerActivity this$0 = this.f30837v;
                switch (i11) {
                    case 0:
                        int i12 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_old_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    default:
                        int i14 = ProCourseTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proCourseTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "old");
                        bundle2.putBoolean("tracker_present", !this$0.f11554x.isEmpty());
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        if (!this.f11554x.isEmpty()) {
        }
        if (!ApplicationPersistence.getInstance().getBooleanValue("pro_course_tracker_alert_1", false)) {
        }
        int b102 = c.f36135u.b();
        while (r0.hasNext()) {
        }
        arrayList = this.f11554x;
        if (arrayList == null) {
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.f11556z;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }
}
