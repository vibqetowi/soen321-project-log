package com.theinnerhour.b2b.utils;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.OfferModel;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import is.u;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000\u001a.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002\u001a\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016\u001a\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002\u001a\u001e\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f\u001a&\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#\u001a\u0014\u0010(\u001a\u00020&*\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0000\u001a\u0006\u0010)\u001a\u00020\u0014¨\u0006*"}, d2 = {"Landroid/os/Bundle;", "getAnalyticsBundle", "", "event", "bundle", "Lhs/k;", "fireAnalytics", "Landroid/view/View;", "v", "", "startScaleY", "endScaleY", "startScaleX", "endScaleX", "scaleView", "", Constants.DAYMODEL_POSITION, "courseName", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "readAssessmentFromRaw", "", "checkActiveOffers", "", "startTime", "endTime", "getDaysBetweenTimes", "getCourseId", "Landroid/view/MenuItem;", "mi", "Landroid/graphics/Typeface;", "font", "color", "applyFontToMenuItem", "tag", "msg", "Lkotlin/Function0;", "doThis", "logError", "Lrr/b;", "argBundle", "withArgs", "isAccessingFirstActivity", "app_productionRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final void applyFontToMenuItem(MenuItem mi2, Typeface font, int i6) {
        kotlin.jvm.internal.i.g(mi2, "mi");
        kotlin.jvm.internal.i.g(font, "font");
        if (mi2.getTitle() != null) {
            SpannableString spannableString = new SpannableString(mi2.getTitle());
            spannableString.setSpan(new CustomTypefaceSpan("", font, i6), 0, spannableString.length(), 18);
            mi2.setTitle(spannableString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean checkActiveOffers() {
        boolean z10;
        ArrayList<HashMap> arrayList;
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("show_discount_40_time")) {
            Calendar calendar = Calendar.getInstance();
            Object obj = FirebasePersistence.getInstance().getUser().getAppConfig().get("show_discount_40_time");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Long");
            calendar.setTimeInMillis(((Long) obj).longValue() * 1000);
            calendar.add(5, 1);
            if (Calendar.getInstance().getTimeInMillis() < calendar.getTimeInMillis()) {
                z10 = true;
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("offers") && (arrayList = (ArrayList) ri.e.d("offer")) != null) {
                    for (HashMap hashMap : arrayList) {
                        Object obj2 = hashMap.get("slug");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        Object obj3 = hashMap.get("time");
                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                        long longValue = ((Long) obj3).longValue();
                        Object obj4 = hashMap.get("used");
                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        Object obj5 = hashMap.get("reusable");
                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        OfferModel offerModel = new OfferModel(str, longValue, booleanValue, ((Boolean) obj5).booleanValue());
                        if (!kotlin.jvm.internal.i.b(offerModel.getSlug(), Constants.LINK_OFFER_60_PLUS_ANNUAL)) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(offerModel.getTime() * 1000);
                            calendar2.add(5, 1);
                            if (Calendar.getInstance().getTimeInMillis() < calendar2.getTimeInMillis()) {
                                z10 = true;
                            }
                        }
                    }
                }
                return z10;
            }
        }
        z10 = false;
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("offers")) {
            while (r1.hasNext()) {
            }
        }
        return z10;
    }

    public static final void fireAnalytics(String event, Bundle bundle) {
        kotlin.jvm.internal.i.g(event, "event");
        kotlin.jvm.internal.i.g(bundle, "bundle");
        gk.a.b(bundle, event);
    }

    public static final Bundle getAnalyticsBundle() {
        Bundle bundle = new Bundle();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            bundle.putString("course", user.getCurrentCourseName());
        }
        return bundle;
    }

    public static final String getCourseId(String courseName) {
        kotlin.jvm.internal.i.g(courseName, "courseName");
        switch (courseName.hashCode()) {
            case -2114782937:
                if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                    return "07cd8acb-c988-49fe-9bad-9b3683ff26f0";
                }
                break;
            case -1617042330:
                if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                    return "33b80e0a-267a-49b4-9a80-2d87dce7f99a";
                }
                break;
            case -891989580:
                if (courseName.equals(Constants.COURSE_STRESS)) {
                    return "99577353-fd79-4470-943d-1bd65e2a1a2f";
                }
                break;
            case -80148009:
                if (courseName.equals(Constants.COURSE_GENERIC)) {
                    return "113aaa66-887f-11ea-bc55-0242ac130003";
                }
                break;
            case 109840:
                if (courseName.equals(Constants.COURSE_OCD)) {
                    return "16112da6-637b-48a1-915f-0112aca125ed";
                }
                break;
            case 2989151:
                if (courseName.equals(Constants.COURSE_ADHD)) {
                    return "25a56fe2-6361-4ab5-a04a-dd00a9e50766";
                }
                break;
            case 92960775:
                if (courseName.equals(Constants.COURSE_ANGER)) {
                    return "782730c9-04c0-4fb5-81e8-6f2739e1d8d9";
                }
                break;
            case 109522647:
                if (courseName.equals(Constants.COURSE_SLEEP)) {
                    return "84982153-2f9c-4982-9bd1-f5a614d96456";
                }
                break;
            case 113319009:
                if (courseName.equals(Constants.COURSE_WORRY)) {
                    return "db992ff7-a994-499c-a05b-3c3cb44fdfb5";
                }
                break;
            case 907087443:
                if (courseName.equals(Constants.LIBRARY_GOAL_COURSE)) {
                    return Constants.LIBRARY_GOAL_COURSE_ID;
                }
                break;
        }
        return "";
    }

    public static final long getDaysBetweenTimes(long j10, long j11) {
        return TimeUnit.DAYS.convert(j10 - j11, TimeUnit.MILLISECONDS);
    }

    public static final boolean isAccessingFirstActivity() {
        ArrayList<CourseDayModelV1> planV3;
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> planV32;
        CourseDayModelV1 courseDayModelV12;
        ArrayList<CourseDayModelV1> planV33;
        CourseDayModelV1 courseDayModelV13;
        ArrayList<CourseDayModelV1> planV34;
        CourseDayModelV1 courseDayModelV14;
        ArrayList<CourseDayModelV1> planV35;
        CourseDayModelV1 courseDayModelV15;
        ArrayList<CourseDayModelV1> planV36;
        CourseDayModelV1 courseDayModelV16;
        User user = FirebasePersistence.getInstance().getUser();
        AngerCourse anger = user.getAnger();
        if (anger != null && (planV36 = anger.getPlanV3()) != null && (courseDayModelV16 = (CourseDayModelV1) u.j2(1, planV36)) != null && courseDayModelV16.getStart_date() != 0) {
            return false;
        }
        DepressionCourse depression = user.getDepression();
        if (depression != null && (planV35 = depression.getPlanV3()) != null && (courseDayModelV15 = (CourseDayModelV1) u.j2(1, planV35)) != null && courseDayModelV15.getStart_date() != 0) {
            return false;
        }
        StressCourse stress = user.getStress();
        if (stress != null && (planV34 = stress.getPlanV3()) != null && (courseDayModelV14 = (CourseDayModelV1) u.j2(1, planV34)) != null && courseDayModelV14.getStart_date() != 0) {
            return false;
        }
        HappinessCourse happiness = user.getHappiness();
        if (happiness != null && (planV33 = happiness.getPlanV3()) != null && (courseDayModelV13 = (CourseDayModelV1) u.j2(1, planV33)) != null && courseDayModelV13.getStart_date() != 0) {
            return false;
        }
        SleepCourse sleep = user.getSleep();
        if (sleep != null && (planV32 = sleep.getPlanV3()) != null && (courseDayModelV12 = (CourseDayModelV1) u.j2(1, planV32)) != null && courseDayModelV12.getStart_date() != 0) {
            return false;
        }
        WorryCourse worry = user.getWorry();
        if (worry != null && (planV3 = worry.getPlanV3()) != null && (courseDayModelV1 = (CourseDayModelV1) u.j2(1, planV3)) != null && courseDayModelV1.getStart_date() != 0) {
            return false;
        }
        return true;
    }

    public static final void logError(String tag, String msg, ss.a<hs.k> doThis) {
        kotlin.jvm.internal.i.g(tag, "tag");
        kotlin.jvm.internal.i.g(msg, "msg");
        kotlin.jvm.internal.i.g(doThis, "doThis");
        try {
            doThis.invoke();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tag, e10, msg);
        }
    }

    public static /* synthetic */ void logError$default(String str, String str2, ss.a aVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = "";
        }
        logError(str, str2, aVar);
    }

    public static final CourseDayModelV1 readAssessmentFromRaw(int i6, String courseName) {
        BufferedReader bufferedReader;
        String c12;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        BufferedReader bufferedReader4;
        BufferedReader bufferedReader5;
        BufferedReader bufferedReader6;
        kotlin.jvm.internal.i.g(courseName, "courseName");
        String str = null;
        switch (courseName.hashCode()) {
            case -2114782937:
                if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                    InputStream openRawResource = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_happiness);
                    kotlin.jvm.internal.i.f(openRawResource, "MyApplication.instance.r…raw.assessment_happiness)");
                    InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                break;
            case -1617042330:
                if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                    InputStream openRawResource2 = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_depression);
                    kotlin.jvm.internal.i.f(openRawResource2, "MyApplication.instance.r…aw.assessment_depression)");
                    InputStreamReader inputStreamReader2 = new InputStreamReader(openRawResource2, gv.a.f16927b);
                    if (inputStreamReader2 instanceof BufferedReader) {
                        bufferedReader2 = (BufferedReader) inputStreamReader2;
                    } else {
                        bufferedReader2 = new BufferedReader(inputStreamReader2, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                break;
            case -891989580:
                if (courseName.equals(Constants.COURSE_STRESS)) {
                    InputStream openRawResource3 = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_stress);
                    kotlin.jvm.internal.i.f(openRawResource3, "MyApplication.instance.r…(R.raw.assessment_stress)");
                    InputStreamReader inputStreamReader3 = new InputStreamReader(openRawResource3, gv.a.f16927b);
                    if (inputStreamReader3 instanceof BufferedReader) {
                        bufferedReader3 = (BufferedReader) inputStreamReader3;
                    } else {
                        bufferedReader3 = new BufferedReader(inputStreamReader3, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                break;
            case 92960775:
                if (courseName.equals(Constants.COURSE_ANGER)) {
                    InputStream openRawResource4 = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_anger);
                    kotlin.jvm.internal.i.f(openRawResource4, "MyApplication.instance.r…e(R.raw.assessment_anger)");
                    InputStreamReader inputStreamReader4 = new InputStreamReader(openRawResource4, gv.a.f16927b);
                    if (inputStreamReader4 instanceof BufferedReader) {
                        bufferedReader4 = (BufferedReader) inputStreamReader4;
                    } else {
                        bufferedReader4 = new BufferedReader(inputStreamReader4, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                break;
            case 109522647:
                if (courseName.equals(Constants.COURSE_SLEEP)) {
                    InputStream openRawResource5 = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_sleep);
                    kotlin.jvm.internal.i.f(openRawResource5, "MyApplication.instance.r…e(R.raw.assessment_sleep)");
                    InputStreamReader inputStreamReader5 = new InputStreamReader(openRawResource5, gv.a.f16927b);
                    if (inputStreamReader5 instanceof BufferedReader) {
                        bufferedReader5 = (BufferedReader) inputStreamReader5;
                    } else {
                        bufferedReader5 = new BufferedReader(inputStreamReader5, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                break;
            case 113319009:
                if (courseName.equals(Constants.COURSE_WORRY)) {
                    InputStream openRawResource6 = MyApplication.V.a().getResources().openRawResource(R.raw.assessment_worry);
                    kotlin.jvm.internal.i.f(openRawResource6, "MyApplication.instance.r…e(R.raw.assessment_worry)");
                    InputStreamReader inputStreamReader6 = new InputStreamReader(openRawResource6, gv.a.f16927b);
                    if (inputStreamReader6 instanceof BufferedReader) {
                        bufferedReader6 = (BufferedReader) inputStreamReader6;
                    } else {
                        bufferedReader6 = new BufferedReader(inputStreamReader6, 8192);
                    }
                    try {
                        c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        str = c12;
                        break;
                    } finally {
                    }
                }
                break;
        }
        kotlin.jvm.internal.i.d(str);
        JSONArray jSONArray = new JSONObject(str).getJSONArray("plan");
        JSONObject jSONObject = new JSONObject();
        int length = jSONArray.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.optInt(Constants.DAYMODEL_POSITION) == i6) {
                    jSONObject = jSONObject2;
                } else {
                    i10++;
                }
            }
        }
        Type type = new TypeToken<CourseDayModelV1>() { // from class: com.theinnerhour.b2b.utils.UtilsKt$readAssessmentFromRaw$type$1
        }.getType();
        sf.i iVar = new sf.i();
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.i.d(type);
        Object c10 = iVar.c(jSONObject3, type);
        kotlin.jvm.internal.i.f(c10, "Gson().fromJson(assessme…bject.toString(), type!!)");
        return (CourseDayModelV1) c10;
    }

    public static final void scaleView(View v10, float f, float f2, float f10, float f11) {
        kotlin.jvm.internal.i.g(v10, "v");
        ScaleAnimation scaleAnimation = new ScaleAnimation(f10, f11, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(500L);
        v10.startAnimation(scaleAnimation);
    }

    public static final rr.b withArgs(rr.b bVar, Bundle bundle) {
        kotlin.jvm.internal.i.g(bVar, "<this>");
        bVar.setArguments(bundle);
        return bVar;
    }
}
