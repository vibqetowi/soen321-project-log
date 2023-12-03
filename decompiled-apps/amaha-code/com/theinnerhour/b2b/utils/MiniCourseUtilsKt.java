package com.theinnerhour.b2b.utils;

import android.content.Context;
import com.appsflyer.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: MiniCourseUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000f\u001a\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"getDayModel", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "meta", "Lcom/theinnerhour/b2b/model/MiniCourseMeta;", "getLatestMcAttempt", "", "slug", "", "getMcColor", "getMcDayProgress", "", "getMcDrawable", "getMiniCourseImage", "", "domain", "(Ljava/lang/String;)[Ljava/lang/Integer;", "getMiniCourseProgress", "miniCourse", "Lcom/theinnerhour/b2b/model/MiniCourse;", "getMiniCourseTitle", "miniCourseDomain", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MiniCourseUtilsKt {
    public static final CourseDayModelV1 getDayModel(MiniCourseMeta meta) {
        kotlin.jvm.internal.i.g(meta, "meta");
        CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
        courseDayModelV1.setContent_id(meta.getId());
        courseDayModelV1.setContent_label(meta.getLabel());
        courseDayModelV1.setSymptom(meta.getSymptom());
        courseDayModelV1.setTags(meta.getTags());
        courseDayModelV1.setPosition(meta.getPosition());
        return courseDayModelV1;
    }

    public static final long getLatestMcAttempt(String slug) {
        kotlin.jvm.internal.i.g(slug, "slug");
        ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
        kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
        ArrayList arrayList = new ArrayList();
        for (Object obj : miniCourses) {
            if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), slug)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Iterator<CourseDayModelV1> it = ((MiniCourse) arrayList.get(0)).getPlan().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            CourseDayModelV1 next = it.next();
            if (j10 == 0 || (next.getStart_date() != 0 && next.getStart_date() < j10)) {
                j10 = next.getStart_date();
            }
            if (next.getStart_date() == 0) {
                break;
            }
        }
        return j10;
    }

    public static final String getMcColor(String slug) {
        kotlin.jvm.internal.i.g(slug, "slug");
        try {
            if (ApplicationPersistence.getInstance().assetMap.containsKey(slug)) {
                ApplicationPersistence.AssetPair assetPair = ApplicationPersistence.getInstance().assetMap.get(slug);
                kotlin.jvm.internal.i.d(assetPair);
                String color = assetPair.getColor();
                kotlin.jvm.internal.i.f(color, "ApplicationPersistence.g…().assetMap[slug]!!.color");
                return color;
            }
            Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCourseAssets().iterator();
            while (it.hasNext()) {
                OfflineAsset next = it.next();
                if (next.getMetaInfo().size() >= 3 && kotlin.jvm.internal.i.b(next.getMetaInfo().get(0), slug)) {
                    String str = next.getMetaInfo().get(2);
                    kotlin.jvm.internal.i.f(str, "asset.metaInfo[2]");
                    return str;
                }
            }
            return "#465A62";
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("MiniCourseUtils", e10);
            return "#465A62";
        }
    }

    public static final int getMcDayProgress(String slug) {
        kotlin.jvm.internal.i.g(slug, "slug");
        ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
        kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
        ArrayList arrayList = new ArrayList();
        for (Object obj : miniCourses) {
            if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), slug)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        int i6 = 0;
        Iterator<CourseDayModelV1> it = ((MiniCourse) arrayList.get(0)).getPlan().iterator();
        while (it.hasNext() && it.next().getStart_date() != 0) {
            i6++;
        }
        return i6;
    }

    public static final String getMcDrawable(String slug) {
        kotlin.jvm.internal.i.g(slug, "slug");
        try {
            if (!ApplicationPersistence.getInstance().assetMap.containsKey(slug)) {
                return "";
            }
            ApplicationPersistence.AssetPair assetPair = ApplicationPersistence.getInstance().assetMap.get(slug);
            kotlin.jvm.internal.i.d(assetPair);
            String filename = assetPair.getFilename();
            kotlin.jvm.internal.i.f(filename, "ApplicationPersistence.g…assetMap[slug]!!.filename");
            return filename;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("MiniCourseUtils", e10);
            return "";
        }
    }

    public static final Integer[] getMiniCourseImage(String domain) {
        kotlin.jvm.internal.i.g(domain, "domain");
        switch (domain.hashCode()) {
            case -2017414229:
                if (domain.equals("self-confidence")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_depression_selfconfidence), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcSelfConfidence)};
                }
                break;
            case -1736108978:
                if (domain.equals("loneliness")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_depression_loneliness), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcLoneliness)};
                }
                break;
            case -1624392372:
                if (domain.equals("empathy")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_anger_empathy), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcEmpathy)};
                }
                break;
            case -1552422584:
                if (domain.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_time_management), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseTimeManagement)};
                }
                break;
            case -1478377852:
                if (domain.equals("overthinking")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_worry_overthinking), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcOverthinking)};
                }
                break;
            case -1190562844:
                if (domain.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_health_anxiety), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseHealthAnxiety)};
                }
                break;
            case -1105889342:
                if (domain.equals("worry-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_worry_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcWorryBasic)};
                }
                break;
            case -475702856:
                if (domain.equals("sleep-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_sleep_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcSleepBasic)};
                }
                break;
            case -428278040:
                if (domain.equals("anger-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_anger_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcAngerBasic)};
                }
                break;
            case -200072491:
                if (domain.equals("stress-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_stress_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcStressBasic)};
                }
                break;
            case -79080948:
                if (domain.equals("optimism")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_happiness_optimism), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcOptimism)};
                }
                break;
            case 58855846:
                if (domain.equals(Constants.TOPICAL_2022_COVID)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_covid), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseCovid)};
                }
                break;
            case 106433143:
                if (domain.equals("panic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_worry_panic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcPanic)};
                }
                break;
            case 239327007:
                if (domain.equals("burnout")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_stress_burnout), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcBurnout)};
                }
                break;
            case 302345418:
                if (domain.equals("growth-mindset")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_happiness_growth), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcGrowthMindset)};
                }
                break;
            case 360982536:
                if (domain.equals("happiness-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_happiness_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcHappinessBasic)};
                }
                break;
            case 378061269:
                if (domain.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2023_topical_motivation), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseMotivation)};
                }
                break;
            case 416780353:
                if (domain.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_nurturing_relationship), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseNurturingRelationship)};
                }
                break;
            case 435621548:
                if (domain.equals("social-anxiety")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_worry_socialanxiety), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcSocialAnxiety)};
                }
                break;
            case 683370503:
                if (domain.equals("depression-basic")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_depression_basic), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcDepressionBasic)};
                }
                break;
            case 1196421508:
                if (domain.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_banner_2022_topical_conflict_empathy), Integer.valueOf((int) com.theinnerhour.b2b.R.color.topicalCourseConflictResolution)};
                }
                break;
            case 1197953290:
                if (domain.equals("procrastination")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_stress_procrastination), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcProcrastination)};
                }
                break;
            case 1606975879:
                if (domain.equals("conflict-resolution")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_anger_conflict), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcConflict)};
                }
                break;
            case 1887829372:
                if (domain.equals("shift-work")) {
                    return new Integer[]{Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ir_temp_mc_sleep_shiftwork), Integer.valueOf((int) com.theinnerhour.b2b.R.color.tempMcShiftWork)};
                }
                break;
        }
        return null;
    }

    public static final int getMiniCourseProgress(MiniCourse miniCourse) {
        kotlin.jvm.internal.i.g(miniCourse, "miniCourse");
        Iterator<CourseDayModelV1> it = miniCourse.getPlan().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (it.next().getStart_date() != 0) {
                i6++;
            }
        }
        return i6;
    }

    public static final String getMiniCourseTitle(String str, Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1552422584:
                if (!str.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                    return "";
                }
                String string = context.getString(com.theinnerhour.b2b.R.string.topical2022TimeManagementTitle);
                kotlin.jvm.internal.i.f(string, "context.getString(R.stri…l2022TimeManagementTitle)");
                return string;
            case -1190562844:
                if (!str.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                    return "";
                }
                String string2 = context.getString(com.theinnerhour.b2b.R.string.topicalHealthAnxietyTitle);
                kotlin.jvm.internal.i.f(string2, "context.getString(R.stri…opicalHealthAnxietyTitle)");
                return string2;
            case 58855846:
                if (!str.equals(Constants.TOPICAL_2022_COVID)) {
                    return "";
                }
                String string3 = context.getString(com.theinnerhour.b2b.R.string.topical2022CovidTitle);
                kotlin.jvm.internal.i.f(string3, "context.getString(R.string.topical2022CovidTitle)");
                return string3;
            case 378061269:
                if (!str.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                    return "";
                }
                String string4 = context.getString(com.theinnerhour.b2b.R.string.topical2022MotivationTitle);
                kotlin.jvm.internal.i.f(string4, "context.getString(R.stri…pical2022MotivationTitle)");
                return string4;
            case 416780353:
                if (!str.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                    return "";
                }
                String string5 = context.getString(com.theinnerhour.b2b.R.string.topical2022NurturingRelationshipsTitle);
                kotlin.jvm.internal.i.f(string5, "context.getString(R.stri…turingRelationshipsTitle)");
                return string5;
            case 1196421508:
                if (!str.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                    return "";
                }
                String string6 = context.getString(com.theinnerhour.b2b.R.string.topical2022ConflictEmpathyTitle);
                kotlin.jvm.internal.i.f(string6, "context.getString(R.stri…2022ConflictEmpathyTitle)");
                return string6;
            default:
                return "";
        }
    }
}
