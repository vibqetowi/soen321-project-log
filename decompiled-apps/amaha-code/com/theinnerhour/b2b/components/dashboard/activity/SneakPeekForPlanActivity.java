package com.theinnerhour.b2b.components.dashboard.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hc.d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import t0.u0;
import w5.i0;
/* compiled from: SneakPeekForPlanActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/activity/SneakPeekForPlanActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SneakPeekForPlanActivity extends c {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public CourseDayModelV1 f10648w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f10651z = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10647v = LogHelper.INSTANCE.makeLogTag(SneakPeekForPlanActivity.class);

    /* renamed from: x  reason: collision with root package name */
    public String f10649x = "";

    /* renamed from: y  reason: collision with root package name */
    public final d f10650y = new d();

    /* compiled from: SneakPeekForPlanActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final SneakPeekForPlanActivity f10652a;

        /* renamed from: b  reason: collision with root package name */
        public final RobertoTextView f10653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, RobertoTextView robertoTextView, SneakPeekForPlanActivity activity) {
            super(j10, 1000L);
            i.g(activity, "activity");
            this.f10652a = activity;
            this.f10653b = robertoTextView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            SneakPeekForPlanActivity sneakPeekForPlanActivity = this.f10652a;
            if (!sneakPeekForPlanActivity.isFinishing()) {
                sneakPeekForPlanActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("time_over_return", true);
                sneakPeekForPlanActivity.setResult(-1, intent);
                sneakPeekForPlanActivity.finish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j10) - TimeUnit.DAYS.toHours(timeUnit.toDays(j10));
            long minutes = timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10));
            long seconds = timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10));
            StringBuilder sb2 = new StringBuilder();
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1));
            i.f(format, "format(format, *args)");
            sb2.append(format);
            sb2.append(':');
            String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1));
            i.f(format2, "format(format, *args)");
            sb2.append(format2);
            sb2.append(':');
            String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds)}, 1));
            i.f(format3, "format(format, *args)");
            sb2.append(format3);
            this.f10653b.setText(sb2.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void o0(SneakPeekForPlanActivity sneakPeekForPlanActivity, TemplateModel templateModel) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        RobertoTextView robertoTextView = (RobertoTextView) sneakPeekForPlanActivity.n0(R.id.tvToolTitle);
        CourseDayModelV1 courseDayModelV1 = sneakPeekForPlanActivity.f10648w;
        Drawable drawable = null;
        if (courseDayModelV1 != null) {
            str = courseDayModelV1.getContent_label();
        } else {
            str = null;
        }
        robertoTextView.setText(str);
        ((RobertoTextView) sneakPeekForPlanActivity.n0(R.id.tvToolDescription)).setText(templateModel.getSneakPeekText());
        if (!TextUtils.isEmpty(sneakPeekForPlanActivity.f10649x)) {
            String str5 = sneakPeekForPlanActivity.f10649x;
            i.d(str5);
            CourseDayModelV1 courseDayModelV12 = sneakPeekForPlanActivity.f10648w;
            if (courseDayModelV12 != null) {
                str2 = courseDayModelV12.getSymptom();
            } else {
                str2 = null;
            }
            i.d(str2);
            sneakPeekForPlanActivity.f10650y.getClass();
            Integer Z = d.Z(str5, str2);
            RobertoTextView robertoTextView2 = (RobertoTextView) sneakPeekForPlanActivity.n0(R.id.tvToolsSymptomsValue);
            if (Z != null) {
                str3 = sneakPeekForPlanActivity.getString(Z.intValue());
            } else {
                CourseDayModelV1 courseDayModelV13 = sneakPeekForPlanActivity.f10648w;
                if (courseDayModelV13 != null) {
                    str3 = courseDayModelV13.getSymptom();
                } else {
                    str3 = null;
                }
            }
            robertoTextView2.setText(str3);
            String str6 = sneakPeekForPlanActivity.f10649x;
            i.d(str6);
            CourseDayModelV1 courseDayModelV14 = sneakPeekForPlanActivity.f10648w;
            if (courseDayModelV14 != null) {
                str4 = courseDayModelV14.getSymptom();
            } else {
                str4 = null;
            }
            i.d(str4);
            switch (str6.hashCode()) {
                case -2114782937:
                    if (str6.equals(Constants.COURSE_HAPPINESS)) {
                        if (i.b(str4, "gratitude")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_1);
                            break;
                        } else if (i.b(str4, "mindfulness")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_2);
                            break;
                        } else if (i.b(str4, "social-skills")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_3);
                            break;
                        } else if (i.b(str4, "self-esteem")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_4);
                            break;
                        } else if (i.b(str4, "thought-work")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_5);
                            break;
                        } else if (i.b(str4, "physical-activity")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_6);
                            break;
                        } else if (i.b(str4, "relaxation")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_happiness_7);
                            break;
                        }
                    }
                    num = null;
                    break;
                case -1617042330:
                    if (str6.equals(Constants.COURSE_DEPRESSION)) {
                        if (i.b(str4, "low-enjoyment")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_1);
                            break;
                        } else if (i.b(str4, "low-energy")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_2);
                            break;
                        } else if (i.b(str4, "lack-of-concentration")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_4);
                            break;
                        } else if (i.b(str4, "low-self-esteem")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_5);
                            break;
                        } else if (i.b(str4, "negative-thoughts")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_3);
                            break;
                        } else if (i.b(str4, "anxiety")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_depression_6);
                            break;
                        }
                    }
                    num = null;
                    break;
                case -891989580:
                    if (str6.equals(Constants.COURSE_STRESS)) {
                        if (i.b(str4, "relaxation")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_1);
                            break;
                        } else if (i.b(str4, "attention-training")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_3);
                            break;
                        } else if (i.b(str4, "problem-solving")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_2);
                            break;
                        } else if (i.b(str4, "assertiveness")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_6);
                            break;
                        } else if (i.b(str4, "thought-balancing")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_5);
                            break;
                        } else if (i.b(str4, "balancing-work-and-life")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_4);
                            break;
                        } else if (i.b(str4, "health")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_stress_7);
                            break;
                        }
                    }
                    num = null;
                    break;
                case 92960775:
                    if (str6.equals(Constants.COURSE_ANGER)) {
                        if (i.b(str4, "understanding-anger")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_1);
                            break;
                        } else if (i.b(str4, "self-calming")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_2);
                            break;
                        } else if (i.b(str4, "mindfulness")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_4);
                            break;
                        } else if (i.b(str4, "overcoming-rumination")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_6);
                            break;
                        } else if (i.b(str4, "communication")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_5);
                            break;
                        } else if (i.b(str4, "thought-work")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_6);
                            break;
                        } else if (i.b(str4, "relaxation")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_anger_3);
                            break;
                        }
                    }
                    num = null;
                    break;
                case 109522647:
                    if (str6.equals(Constants.COURSE_SLEEP)) {
                        if (i.b(str4, "sleep-hygiene")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_sleep_1);
                            break;
                        } else if (i.b(str4, Constants.SCREEN_THOUGHTS)) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_sleep_4);
                            break;
                        } else if (i.b(str4, "stimulus-control-and-sleep-restriction")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_sleep_2);
                            break;
                        } else if (i.b(str4, "relaxation")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_sleep_3);
                            break;
                        } else if (i.b(str4, "mindfulness")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_sleep_5);
                            break;
                        }
                    }
                    num = null;
                    break;
                case 113319009:
                    if (str6.equals(Constants.COURSE_WORRY)) {
                        if (i.b(str4, "managing-worry")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_2);
                            break;
                        } else if (i.b(str4, "tolerating-uncertainty")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_4);
                            break;
                        } else if (i.b(str4, "relaxation")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_1);
                            break;
                        } else if (i.b(str4, "focus-and-attention")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_5);
                            break;
                        } else if (i.b(str4, "thought-work")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_1);
                            break;
                        } else if (i.b(str4, "problem-solving-and-overcoming-avoidance")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_3);
                            break;
                        } else if (i.b(str4, "sleeping-well")) {
                            num = Integer.valueOf((int) R.drawable.ic_cd_worry_6);
                            break;
                        }
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) sneakPeekForPlanActivity.n0(R.id.ivSymptoms);
            if (num != null) {
                int intValue = num.intValue();
                Object obj = g0.a.f16164a;
                drawable = a.c.b(sneakPeekForPlanActivity, intValue);
            }
            appCompatImageView.setImageDrawable(drawable);
        }
        long j10 = 1000;
        long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds() + 86400;
        RobertoTextView tvTimeLeftValue = (RobertoTextView) sneakPeekForPlanActivity.n0(R.id.tvTimeLeftValue);
        i.f(tvTimeLeftValue, "tvTimeLeftValue");
        new a((todayTimeInSeconds - (System.currentTimeMillis() / j10)) * j10, tvTimeLeftValue, sneakPeekForPlanActivity).start();
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10651z;
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

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str = this.f10647v;
        super.onCreate(bundle);
        setContentView(R.layout.activity_sneak_peek);
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                new u0(window.getDecorView(), window).a(true);
            }
            window.setStatusBarColor(g0.a.b(this, R.color.csaDepressionBg));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
        }
        if (getIntent().hasExtra("planModel")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("planModel");
            i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.model.CourseDayModelV1");
            this.f10648w = (CourseDayModelV1) serializableExtra;
        }
        if (getIntent().hasExtra("course")) {
            this.f10649x = getIntent().getStringExtra("course");
        }
        if (getIntent().hasExtra(Constants.DAYMODEL_POSITION)) {
            getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
        }
        if (getIntent().hasExtra("variant")) {
            getIntent().getStringExtra("variant");
        }
        try {
            if (this.f10648w != null) {
                ((ConstraintLayout) n0(R.id.clSneakPeekLoadingLayout)).setVisibility(0);
                CourseDayModelV1 courseDayModelV1 = this.f10648w;
                i.d(courseDayModelV1);
                String content_id = courseDayModelV1.getContent_id();
                i.d(content_id);
                FireStoreUtilsKt.fetchCourseContentV3("en", content_id, new dl.a(this));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Error:", e11);
        }
        ((AppCompatImageView) n0(R.id.planHeaderArrowBack)).setOnClickListener(new i0(25, this));
    }
}
