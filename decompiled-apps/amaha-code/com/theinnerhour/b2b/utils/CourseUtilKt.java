package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.SurveyActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DbDynamicCardsModel;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: CourseUtil.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\u0086\b\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0000j\b\u0012\u0004\u0012\u00020\u0005`\u0002H\u0086\b\u001a+\u0010\t\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\b\u001a(\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0000j\b\u0012\u0004\u0012\u00020\u0005`\u00022\u0006\u0010\b\u001a\u00020\u0007\u001a/\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0000j\b\u0012\u0004\u0012\u00020\u0005`\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0000j\b\u0012\u0004\u0012\u00020\u0005`\u00022\u0006\u0010\b\u001a\u00020\u0007\u001a \u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a\u001a\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a\u001a*\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001fj\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a` 2\u0006\u0010\u001b\u001a\u00020\u001a\u001a\u0018\u0010%\u001a\u0004\u0018\u00010#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"\u001a\u000e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001a\"\u0017\u0010)\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/CourseDayModel;", "Lkotlin/collections/ArrayList;", "plan", "getLastDayPlan", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "getLastDayPlanV3", "", "time", "getDayPlanForDate", "getDayPlanForDateV3", "", "getDayPlanPositionForDateV3", "(Ljava/util/ArrayList;J)Ljava/lang/Integer;", "", "isAllOtherTodayItemCompleted", "Lhs/f;", "getDayPlanPositionForDateV3SneakPeek", "Lcom/theinnerhour/b2b/model/DbDynamicCardsModel;", "dynamicCardsModel", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "Landroid/view/View;", "card", "Landroid/content/Intent;", "setDynamicCard", "", "priority", "checkOfflineAssets", "Lhs/k;", "initAudioDownloadsOffline", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getAudioUrls", "Lkotlin/Function0;", "", "func", "permitDiskReads", "courseName", "Lcom/theinnerhour/b2b/model/Course;", "getCourse", "TAG_COURSEUTIL", "Ljava/lang/String;", "getTAG_COURSEUTIL", "()Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseUtilKt {
    private static final String TAG_COURSEUTIL = LogHelper.INSTANCE.makeLogTag("CourseUtil");

    public static final boolean checkOfflineAssets(String priority) {
        boolean z10;
        kotlin.jvm.internal.i.g(priority, "priority");
        try {
            ArrayList<OfflineAsset> offlineAssets = ApplicationPersistence.getInstance().getOfflineAssets(Constants.COURSE_ALL_ID);
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = TAG_COURSEUTIL;
            kotlin.jvm.internal.i.f(offlineAssets, "offlineAssets");
            logHelper.i(str, offlineAssets);
            Iterator<OfflineAsset> it = offlineAssets.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().isDownloaded()) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            ArrayList<OfflineAsset> listAllCourse = ApplicationPersistence.getInstance().getOfflineAssets(Constants.COURSE_ALL_ID);
            LogHelper logHelper2 = LogHelper.INSTANCE;
            String str2 = TAG_COURSEUTIL;
            kotlin.jvm.internal.i.f(listAllCourse, "listAllCourse");
            logHelper2.i(str2, listAllCourse);
            Iterator<OfflineAsset> it2 = listAllCourse.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!it2.next().isDownloaded()) {
                    z10 = true;
                    break;
                }
            }
            Iterator<OfflineAsset> it3 = ApplicationPersistence.getInstance().getCourseAssets().iterator();
            while (it3.hasNext()) {
                if (!it3.next().isDownloaded()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_COURSEUTIL, "exception", e10);
            return false;
        }
    }

    public static final LinkedHashMap<String, String> getAudioUrls(String priority) {
        kotlin.jvm.internal.i.g(priority, "priority");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (kotlin.jvm.internal.i.b(priority, Constants.PRIORITY_DEEP_BREATHING_GIF)) {
            linkedHashMap.put("deep_breathing", "https://assets.theinnerhour.com/audio/deep-breathing.ogg");
            linkedHashMap.put(Constants.PRIORITY_GUIDED_IMAGERY, "https://assets.theinnerhour.com/audio/guided-imagery.ogg");
            linkedHashMap.put("timeout_timer", "https://assets.theinnerhour.com/audio/timeout.mp3");
        } else if (kotlin.jvm.internal.i.b(priority, Constants.PRIORITY_GUIDED_IMAGERY)) {
            linkedHashMap.put(Constants.PRIORITY_GUIDED_IMAGERY, "https://assets.theinnerhour.com/audio/guided-imagery.ogg");
            linkedHashMap.put("deep_breathing", "https://assets.theinnerhour.com/audio/deep-breathing.ogg");
            linkedHashMap.put("timeout_timer", "https://assets.theinnerhour.com/audio/timeout.mp3");
        } else {
            linkedHashMap.put("deep_breathing", "https://assets.theinnerhour.com/audio/deep-breathing.ogg");
            linkedHashMap.put(Constants.PRIORITY_GUIDED_IMAGERY, "https://assets.theinnerhour.com/audio/guided-imagery.ogg");
            linkedHashMap.put("timeout_timer", "https://assets.theinnerhour.com/audio/timeout.mp3");
        }
        if (FirebasePersistence.getInstance().getUser() == null) {
            linkedHashMap.putAll(e0.t0(new hs.f("pmr", "https://assets.theinnerhour.com/audio/pmr.ogg"), new hs.f("self_message", "https://assets.theinnerhour.com/audio/self-massage.ogg"), new hs.f("mindful_walking", "https://assets.theinnerhour.com/audio/mindful-walking.ogg"), new hs.f("thought_diffusion", "https://assets.theinnerhour.com/audio/thought-diffusion.ogg"), new hs.f("self_compassion", "https://assets.theinnerhour.com/audio/self-compassion.ogg"), new hs.f("beach_walking", "https://assets.theinnerhour.com/audio/beach_walking.ogg"), new hs.f(Constants.FOCUSSED_ATTENTION_MEDITATION, "https://assets.theinnerhour.com/meta_audios/focussed_attention_meditation.ogg"), new hs.f("alternate_nostril_breathing", "https://assets.theinnerhour.com/meta_audios/alterate_nostril_breathing.ogg")));
        } else if (!ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
            linkedHashMap.putAll(e0.t0(new hs.f("pmr", "https://assets.theinnerhour.com/audio/pmr.ogg"), new hs.f("self_message", "https://assets.theinnerhour.com/audio/self-massage.ogg"), new hs.f("mindful_walking", "https://assets.theinnerhour.com/audio/mindful-walking.ogg"), new hs.f("thought_diffusion", "https://assets.theinnerhour.com/audio/thought-diffusion.ogg"), new hs.f("self_compassion", "https://assets.theinnerhour.com/audio/self-compassion.ogg"), new hs.f("beach_walking", "https://assets.theinnerhour.com/audio/beach_walking.ogg"), new hs.f(Constants.FOCUSSED_ATTENTION_MEDITATION, "https://assets.theinnerhour.com/audio/focused_meditation.mp3"), new hs.f("alternate_nostril_breathing", "https://assets.theinnerhour.com/audio/alternate_breathing.mp3"), new hs.f("awareness_of_breath", "https://assets.theinnerhour.com/meta_audios/awareness_of_breath.ogg"), new hs.f("body_scan", "https://assets.theinnerhour.com/audiov2/body_scan.mp3"), new hs.f("diaphragmatic_breathing", "https://assets.theinnerhour.com/meta_audios/diaphragmatic_breathing.ogg"), new hs.f("sorting_into_boxes", "https://assets.theinnerhour.com/meta_audios/sorting_into_boxes.ogg"), new hs.f("quick_muscle_relaxation", "https://assets.theinnerhour.com/meta_audios/quick_muscle_relaxation.ogg"), new hs.f("hot_air_baloon", "https://assets.theinnerhour.com/meta_audios/hot_air_baloon.ogg"), new hs.f("grounding_meditation", "https://assets.theinnerhour.com/audiov2/grounding_meditation.mp3")));
        } else if (defpackage.d.q("v2.3")) {
            linkedHashMap.putAll(e0.t0(new hs.f("pmr", "https://assets.theinnerhour.com/audio/pmr.ogg"), new hs.f("self_message", "https://assets.theinnerhour.com/audio/self-massage.ogg"), new hs.f("mindful_walking", "https://assets.theinnerhour.com/audio/mindful-walking.ogg"), new hs.f("thought_diffusion", "https://assets.theinnerhour.com/audio/thought-diffusion.ogg"), new hs.f("self_compassion", "https://assets.theinnerhour.com/audio/self-compassion.ogg"), new hs.f("beach_walking", "https://assets.theinnerhour.com/audio/beach_walking.ogg"), new hs.f(Constants.FOCUSSED_ATTENTION_MEDITATION, "https://assets.theinnerhour.com/meta_audios/focussed_attention_meditation.ogg"), new hs.f("alternate_nostril_breathing", "https://assets.theinnerhour.com/meta_audios/alterate_nostril_breathing.ogg"), new hs.f("grounding_meditation", "https://assets.theinnerhour.com/audiov2/grounding_meditation.mp3"), new hs.f("lower_body_grounding", "https://assets.theinnerhour.com/meta_audios/lower_body_grounding.ogg"), new hs.f(Constants.TOE_TENSING, "https://assets.theinnerhour.com/meta_audios/toe_tensing.ogg"), new hs.f(Constants.HUMMING, "https://assets.theinnerhour.com/meta_audios/humming.ogg"), new hs.f("breathing_space", "https://assets.theinnerhour.com/meta_audios/breathing_space.ogg"), new hs.f("sorting_into_boxes", "https://assets.theinnerhour.com/meta_audios/sorting_into_boxes.ogg"), new hs.f("diaphragmatic_breathing", "https://assets.theinnerhour.com/meta_audios/diaphragmatic_breathing.ogg"), new hs.f("hot_air_baloon", "https://assets.theinnerhour.com/meta_audios/hot_air_baloon.ogg"), new hs.f("awareness_of_breath", "https://assets.theinnerhour.com/meta_audios/awareness_of_breath.ogg"), new hs.f("body_scan", "https://assets.theinnerhour.com/audiov2/body_scan.mp3"), new hs.f("quick_muscle_relaxation", "https://assets.theinnerhour.com/meta_audios/quick_muscle_relaxation.ogg")));
        } else {
            linkedHashMap.putAll(e0.t0(new hs.f("pmr", "https://assets.theinnerhour.com/audio/pmr.ogg"), new hs.f("self_message", "https://assets.theinnerhour.com/audio/self-massage.ogg"), new hs.f("mindful_walking", "https://assets.theinnerhour.com/audio/mindful-walking.ogg"), new hs.f("thought_diffusion", "https://assets.theinnerhour.com/audio/thought-diffusion.ogg"), new hs.f("self_compassion", "https://assets.theinnerhour.com/audio/self-compassion.ogg"), new hs.f("beach_walking", "https://assets.theinnerhour.com/audio/beach_walking.ogg"), new hs.f(Constants.FOCUSSED_ATTENTION_MEDITATION, "https://assets.theinnerhour.com/meta_audios/focussed_attention_meditation.ogg"), new hs.f("alternate_nostril_breathing", "https://assets.theinnerhour.com/meta_audios/alterate_nostril_breathing.ogg"), new hs.f("grounding_meditation", "https://assets.theinnerhour.com/audiov2/grounding_meditation.mp3"), new hs.f("lower_body_grounding", "https://assets.theinnerhour.com/meta_audios/lower_body_grounding.ogg"), new hs.f(Constants.TOE_TENSING, "https://assets.theinnerhour.com/meta_audios/toe_tensing.ogg"), new hs.f(Constants.HUMMING, "https://assets.theinnerhour.com/meta_audios/humming.ogg"), new hs.f("breathing_space", "https://assets.theinnerhour.com/meta_audios/breathing_space.ogg"), new hs.f("sorting_into_boxes", "https://assets.theinnerhour.com/meta_audios/sorting_into_boxes.ogg"), new hs.f("diaphragmatic_breathing", "https://assets.theinnerhour.com/meta_audios/diaphragmatic_breathing.ogg"), new hs.f("hot_air_baloon", "https://assets.theinnerhour.com/meta_audios/hot_air_baloon.ogg"), new hs.f("awareness_of_breath", "https://assets.theinnerhour.com/meta_audios/awareness_of_breath.ogg"), new hs.f("body_scan", "https://assets.theinnerhour.com/audiov2/body_scan.mp3"), new hs.f("quick_muscle_relaxation", "https://assets.theinnerhour.com/meta_audios/quick_muscle_relaxation.ogg"), new hs.f("gratitude_meditation", "https://assets.theinnerhour.com/appv2audio/gratitude.mp3"), new hs.f("observing_leaves", "https://assets.theinnerhour.com/meta_audios/observing_leaves.ogg")));
        }
        linkedHashMap.putAll(e0.t0(new hs.f("4444_happiness", "https://assets.theinnerhour.com/meta_audios/happiness_4444.mp3"), new hs.f("5555_happiness", "https://assets.theinnerhour.com/meta_audios/happiness_5555.mp3"), new hs.f("cue_controlled_relaxation", "https://assets.theinnerhour.com/meta_audios/4-2-6.mp3"), new hs.f("breathing_478", "https://assets.theinnerhour.com/meta_audios/4-7-8.mp3"), new hs.f("breathing_426", "https://assets.theinnerhour.com/audio/4-2-6.mp3"), new hs.f("flower_breathing", "https://assets.theinnerhour.com/appv2audio/flower_breathing.mp3")));
        return linkedHashMap;
    }

    public static final Course getCourse(String courseName) {
        kotlin.jvm.internal.i.g(courseName, "courseName");
        switch (courseName.hashCode()) {
            case -2114782937:
                if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                    HappinessCourse happiness = FirebasePersistence.getInstance().getUser().getHappiness();
                    kotlin.jvm.internal.i.f(happiness, "getInstance().user.happiness");
                    return happiness;
                }
                break;
            case -1617042330:
                if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                    DepressionCourse depression = FirebasePersistence.getInstance().getUser().getDepression();
                    kotlin.jvm.internal.i.f(depression, "getInstance().user.depression");
                    return depression;
                }
                break;
            case -891989580:
                if (courseName.equals(Constants.COURSE_STRESS)) {
                    StressCourse stress = FirebasePersistence.getInstance().getUser().getStress();
                    kotlin.jvm.internal.i.f(stress, "getInstance().user.stress");
                    return stress;
                }
                break;
            case 92960775:
                if (courseName.equals(Constants.COURSE_ANGER)) {
                    AngerCourse anger = FirebasePersistence.getInstance().getUser().getAnger();
                    kotlin.jvm.internal.i.f(anger, "getInstance().user.anger");
                    return anger;
                }
                break;
            case 109522647:
                if (courseName.equals(Constants.COURSE_SLEEP)) {
                    SleepCourse sleep = FirebasePersistence.getInstance().getUser().getSleep();
                    kotlin.jvm.internal.i.f(sleep, "getInstance().user.sleep");
                    return sleep;
                }
                break;
            case 113319009:
                if (courseName.equals(Constants.COURSE_WORRY)) {
                    WorryCourse worry = FirebasePersistence.getInstance().getUser().getWorry();
                    kotlin.jvm.internal.i.f(worry, "getInstance().user.worry");
                    return worry;
                }
                break;
        }
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
        return courseById;
    }

    public static final CourseDayModel getDayPlanForDate(ArrayList<CourseDayModel> plan, long j10) {
        kotlin.jvm.internal.i.g(plan, "plan");
        CourseDayModel courseDayModel = null;
        try {
            int size = plan.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > j10)) {
                    if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                        int i10 = i6 - 1;
                        if (plan.get(i10).getStart_date() != 0) {
                            if (plan.get(i10).getStart_date() >= j10) {
                            }
                        }
                    }
                }
                courseDayModel = plan.get(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(getTAG_COURSEUTIL(), "exception", e10);
        }
        return courseDayModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r16.get(r6).getStart_date() <= r17) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CourseDayModelV1 getDayPlanForDateV3(ArrayList<CourseDayModelV1> plan, long j10) {
        kotlin.jvm.internal.i.g(plan, "plan");
        CourseDayModelV1 courseDayModelV1 = null;
        try {
            int size = plan.size();
            for (int i6 = 0; i6 < size; i6++) {
                if ((!ca.a.k(0, 15, 30).contains(Integer.valueOf(i6)) || plan.get(i6).isCompleted() || plan.size() - 1 != i6) && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > j10)) {
                    if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                        int i10 = i6 - 1;
                        if (plan.get(i10).getStart_date() != 0) {
                            if (ca.a.k(0, 15, 30).contains(Integer.valueOf(i10))) {
                            }
                            if (!ca.a.k(0, 15, 30).contains(Integer.valueOf(i10))) {
                                if (plan.get(i10).getStart_date() >= j10) {
                                }
                            }
                        }
                    }
                }
                courseDayModelV1 = plan.get(i6);
            }
            if (courseDayModelV1 == null) {
                return plan.get(0);
            }
            return courseDayModelV1;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_COURSEUTIL, "exception", e10);
            return courseDayModelV1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
        if (r17.get(r8).getStart_date() <= r18) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer getDayPlanPositionForDateV3(ArrayList<CourseDayModelV1> plan, long j10) {
        kotlin.jvm.internal.i.g(plan, "plan");
        Integer num = 0;
        try {
            int size = plan.size();
            Integer num2 = num;
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    if ((!ca.a.k(num, 15, 30).contains(Integer.valueOf(i6)) || plan.get(i6).isCompleted() || plan.size() - 1 != i6) && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > j10)) {
                        if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                            int i10 = i6 - 1;
                            if (plan.get(i10).getStart_date() != 0) {
                                if (ca.a.k(num, 15, 30).contains(Integer.valueOf(i10))) {
                                }
                                if (!ca.a.k(num, 15, 30).contains(Integer.valueOf(i10))) {
                                    if (plan.get(i10).getStart_date() >= j10) {
                                    }
                                }
                            }
                        }
                    }
                    num2 = Integer.valueOf(i6);
                } catch (Exception e10) {
                    e = e10;
                    num = num2;
                    LogHelper.INSTANCE.e(TAG_COURSEUTIL, "exception", e);
                    return num;
                }
            }
            if (num2.intValue() == 15 && plan.get(14).getStart_date() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                return Integer.valueOf(num2.intValue() - 1);
            }
            return num2;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static final hs.f<Integer, Boolean> getDayPlanPositionForDateV3SneakPeek(boolean z10, ArrayList<CourseDayModelV1> plan, long j10) {
        boolean z11;
        int i6;
        kotlin.jvm.internal.i.g(plan, "plan");
        int i10 = 0;
        try {
            int size = plan.size();
            i6 = 0;
            z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    if ((!ca.a.k(0, 15, 30).contains(Integer.valueOf(i11)) || plan.get(i11).isCompleted() || plan.size() - 1 != i11) && (plan.get(i11).getStart_date() == 0 || plan.get(i11).getStart_date() > j10)) {
                        if (i11 > 0 && plan.get(i11).getStart_date() == 0) {
                            int i12 = i11 - 1;
                            if (plan.get(i12).getStart_date() != 0 && ((ca.a.k(0, 15, 30).contains(Integer.valueOf(i12)) && plan.get(i12).getStart_date() <= j10) || ((!ca.a.k(0, 15, 30).contains(Integer.valueOf(i12)) && plan.get(i12).getStart_date() < j10) || (!ca.a.k(0, 15, 30, 7, 14, 22).contains(Integer.valueOf(i12)) && plan.get(i12).getStart_date() == j10 && plan.get(i12).isCompleted() && z10)))) {
                                try {
                                    if (!ca.a.k(0, 15, 30).contains(Integer.valueOf(i12)) && plan.get(i12).getStart_date() == j10 && plan.get(i12).isCompleted() && z10) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = i11;
                                    LogHelper.INSTANCE.e(TAG_COURSEUTIL, "exception", e);
                                    i6 = i10;
                                    return new hs.f<>(Integer.valueOf(i6), Boolean.valueOf(z11));
                                }
                            }
                        }
                    }
                    i6 = i11;
                } catch (Exception e11) {
                    e = e11;
                    i10 = i6;
                }
            }
            if (i6 == 15) {
                if (plan.get(14).getStart_date() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                    i6--;
                }
            }
        } catch (Exception e12) {
            e = e12;
            z11 = false;
        }
        return new hs.f<>(Integer.valueOf(i6), Boolean.valueOf(z11));
    }

    public static final CourseDayModel getLastDayPlan(ArrayList<CourseDayModel> plan) {
        kotlin.jvm.internal.i.g(plan, "plan");
        CourseDayModel courseDayModel = null;
        try {
            int size = plan.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 != 0) {
                    if (plan.get(i6).getStart_date() == 0 && (i6 != 1 || plan.get(i6).getStart_date() != 0 || !plan.get(i6 - 1).isCompleted())) {
                        if (i6 > 1 && plan.get(i6).getStart_date() == 0) {
                            int i10 = i6 - 1;
                            if (plan.get(i10).getStart_date() != 0) {
                                if (plan.get(i10).getStart_date() >= Utils.INSTANCE.getTimeInSeconds()) {
                                }
                            }
                        }
                    }
                }
                courseDayModel = plan.get(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(getTAG_COURSEUTIL(), "exception", e10);
        }
        return courseDayModel;
    }

    public static final CourseDayModelV1 getLastDayPlanV3(ArrayList<CourseDayModelV1> plan) {
        kotlin.jvm.internal.i.g(plan, "plan");
        CourseDayModelV1 courseDayModelV1 = null;
        try {
            int size = plan.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 != 0) {
                    if (plan.get(i6).getStart_date() == 0) {
                        if (plan.get(i6).getStart_date() == 0) {
                            int i10 = i6 - 1;
                            if (plan.get(i10).getStart_date() != 0) {
                                if (plan.get(i10).getStart_date() >= Utils.INSTANCE.getTimeInSeconds()) {
                                }
                            }
                        }
                    }
                }
                courseDayModelV1 = plan.get(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(getTAG_COURSEUTIL(), "exception", e10);
        }
        return courseDayModelV1;
    }

    public static final String getTAG_COURSEUTIL() {
        return TAG_COURSEUTIL;
    }

    public static final void initAudioDownloadsOffline(String priority) {
        kotlin.jvm.internal.i.g(priority, "priority");
        try {
            ArrayList<OfflineAsset> offlineAssets = ApplicationPersistence.getInstance().getOfflineAssets();
            HashMap<String, OfflineAsset> offlineAssetsMap = ApplicationPersistence.getInstance().getOfflineAssetsMap();
            for (Map.Entry<String, String> entry : getAudioUrls(priority).entrySet()) {
                entry.getKey();
                String F0 = gv.n.F0(entry.getValue(), " ", "%20");
                if (!offlineAssetsMap.containsKey(F0)) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.i("conditionSelection", "offline asset " + F0);
                    offlineAssets.add(new OfflineAsset(Constants.COURSE_ALL_ID, "audio", F0));
                }
            }
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.i("conditionSelection", "offline assets count " + offlineAssets.size());
            ApplicationPersistence.getInstance().setOfflineAssets(offlineAssets);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG_COURSEUTIL, "exception", e10);
        }
    }

    public static final Object permitDiskReads(ss.a<? extends Object> func) {
        kotlin.jvm.internal.i.g(func, "func");
        return func.invoke();
    }

    public static final Intent setDynamicCard(DbDynamicCardsModel dynamicCardsModel, Activity activity, View card) {
        kotlin.jvm.internal.i.g(dynamicCardsModel, "dynamicCardsModel");
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(card, "card");
        String type = dynamicCardsModel.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case 1452522295:
                    if (type.equals("db_day2")) {
                        Intent intent = new Intent(activity, V2GoalsActivity.class);
                        intent.putExtra("add_goal", true);
                        intent.putExtra("source", Constants.SCREEN_DASHBOARD);
                        ((RobertoTextView) card.findViewById(R.id.tvDcTitle)).setText("Create positive changes!");
                        ((RobertoTextView) card.findViewById(R.id.tvDcDesc)).setText("Start today by setting goals for happiness.");
                        return intent;
                    }
                    break;
                case 1452522296:
                    if (type.equals("db_day3")) {
                        Intent intent2 = new Intent(activity, BotPwaActivity.class);
                        ((RobertoTextView) card.findViewById(R.id.tvDcTitle)).setText("Feeling okay?");
                        ((RobertoTextView) card.findViewById(R.id.tvDcDesc)).setText("Our intelligent chatbot Allie is here to offer support.");
                        return intent2;
                    }
                    break;
                case 2078518202:
                    if (type.equals("db_day10")) {
                        Intent intent3 = new Intent(activity, SurveyActivity.class);
                        ((RobertoTextView) card.findViewById(R.id.tvDcTitle)).setText(activity.getString(R.string.surveyDynamicCardTitle));
                        ((RobertoTextView) card.findViewById(R.id.tvDcDesc)).setText(activity.getString(R.string.surveyDynamicCardBody));
                        return intent3;
                    }
                    break;
            }
        }
        return null;
    }
}
