package com.theinnerhour.b2b.utils;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import gv.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.o0;
import ss.p;
import ss.q;
import ya.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052(\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0004\u0012\u00020\u000b0\u0007\u001aH\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052(\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0004\u0012\u00020\u000b0\u0007\u001a0\u0010\u0011\u001a\u00020\u000b2(\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\bj\b\u0012\u0004\u0012\u00020\u000f`\n\u0012\u0004\u0012\u00020\u00100\u0007\u001a>\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002.\u0010\f\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\n\u0012\u0004\u0012\u00020\u00100\u0013\u001a@\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000020\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013\u001a:\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00002*\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\bj\b\u0012\u0004\u0012\u00020\u0000`\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u001a2\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0007\u001a0\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u0007\u001a2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000b0\u0007\u001aN\u0010#\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001f28\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0005\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010!j\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u0001`\"\u0012\u0004\u0012\u00020\u000b0\u0007\u001a(\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00002\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0007\u001a<\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00052,\u0010\f\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020'\u0018\u00010\bj\n\u0012\u0004\u0012\u00020'\u0018\u0001`\n\u0012\u0004\u0012\u00020\u00100\u0007\u001a<\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00002,\u0010\f\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020'\u0018\u00010\bj\n\u0012\u0004\u0012\u00020'\u0018\u0001`\n\u0012\u0004\u0012\u00020\u00100\u0007\u001a,\u0010#\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u00002\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b0\u0007\u001a8\u0010.\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00002&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010-\u0012\u0004\u0012\u00020\u000b0\u0007\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"", "language", "programme", "", "day", "", "isExperiment", "Lkotlin/Function2;", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/LearningHubModel;", "Lkotlin/collections/ArrayList;", "Lhs/k;", "onLoad", "fetchCourseSpecificLearningHub", "fetchGenericLearningHub", "Lcom/theinnerhour/b2b/model/MiniCourseInfoMeta;", "", "fetchMiniCourseSlugList", "slug", "Lkotlin/Function3;", "Lcom/theinnerhour/b2b/model/MiniCourseMeta;", "fetchMiniCourseMeta", "fetchTopicalCourse", "keyword", "fetchTopicalCourseSlugs", "label", "Lcom/theinnerhour/b2b/model/TemplateModel;", "fetchCourseContent", "postID", "fetchArticle", "fetchCourseContentV3", "", "labelList", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchCourseContentDurationV3", "id", "checkIfActivityPublished", "isNotV4DashboardUser", "Lcom/theinnerhour/b2b/components/monetization/models/CampaignModel;", "fetchActiveCampaigns", "campaignID", "fetchSingleCampaign", "contentId", "goalId", "Lhs/f;", "fetchSingleRecommendedActivity", "TAG", "Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt {
    private static final String TAG = LogHelper.INSTANCE.makeLogTag("firestoreutils");

    public static final void checkIfActivityPublished(String id2, p<? super Boolean, ? super Boolean, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("content_bank").m(id2, "id").a();
        a10.addOnCompleteListener(new f(onLoad, 0));
        a10.addOnFailureListener(new e(onLoad, 1));
    }

    public static final void checkIfActivityPublished$lambda$22(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$checkIfActivityPublished$1$1(it, onLoad, null), 3);
        } catch (Exception e10) {
            Boolean bool = Boolean.FALSE;
            onLoad.invoke(bool, bool);
            LogHelper.INSTANCE.e(TAG, "exception", e10);
        }
    }

    public static final void checkIfActivityPublished$lambda$23(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "on failure listener fetch user content " + it);
        Boolean bool = Boolean.FALSE;
        onLoad.invoke(bool, bool);
    }

    public static final void fetchActiveCampaigns(boolean z10, p<? super Boolean, ? super ArrayList<CampaignModel>, ? extends Object> onLoad) {
        String version;
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        try {
            fe.c b10 = FirebaseFirestore.d().b("dc_content_bank");
            Boolean bool = Boolean.TRUE;
            com.google.firebase.firestore.d m10 = b10.m(bool, "published").m("en", "language").m(bool, "android_campaign");
            if (z10) {
                version = "v3.1";
            } else {
                version = FirebasePersistence.getInstance().getUser().getVersion();
            }
            v a10 = m10.l(version, "user_version").a();
            a10.addOnCompleteListener(new f(onLoad, 3));
            a10.addOnFailureListener(new e(onLoad, 5));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, e10);
        }
    }

    public static final void fetchActiveCampaigns$lambda$24(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchActiveCampaigns$1$1(it, onLoad, null), 3);
        } catch (Exception e10) {
            onLoad.invoke(Boolean.FALSE, null);
            LogHelper.INSTANCE.e(TAG, e10);
        }
    }

    public static final void fetchActiveCampaigns$lambda$25(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        onLoad.invoke(Boolean.FALSE, null);
        LogHelper.INSTANCE.e(TAG, it);
    }

    public static final void fetchArticle(String postID, boolean z10, p<? super Boolean, ? super LearningHubModel, ? extends Object> onLoad) {
        String str;
        kotlin.jvm.internal.i.g(postID, "postID");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        FirebaseFirestore d10 = FirebaseFirestore.d();
        if (z10) {
            str = "content_posts_new";
        } else {
            str = "content_posts";
        }
        v d11 = d10.b(str).q(postID).d();
        rk.b bVar = new rk.b(15, new FireStoreUtilsKt$fetchArticle$1(onLoad));
        d11.getClass();
        d11.addOnSuccessListener(ya.j.f38393a, bVar);
        d11.addOnFailureListener(new e(onLoad, 2));
    }

    public static final void fetchArticle$lambda$16(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchArticle$lambda$17(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "Article Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, new LearningHubModel());
    }

    public static final void fetchCourseContent(String language, String label, p<? super Boolean, ? super TemplateModel, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(language, "language");
        kotlin.jvm.internal.i.g(label, "label");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("mini_activities").m(label, "label").m(language, "language").a();
        a10.addOnCompleteListener(new f(onLoad, 6));
        a10.addOnFailureListener(new e(onLoad, 9));
    }

    public static final void fetchCourseContent$lambda$14(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchCourseContent$1$1(it, onLoad, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, "exception in load miniCourse data", e10);
        }
    }

    public static final void fetchCourseContent$lambda$15(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "on failure listener fetch user content " + it);
        onLoad.invoke(Boolean.FALSE, null);
    }

    public static final void fetchCourseContentDurationV3(List<String> labelList, p<? super Boolean, ? super HashMap<String, String>, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(labelList, "labelList");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("template_bank").o("label", labelList).m("en", "language").a();
        a10.addOnCompleteListener(new f(onLoad, 2));
        a10.addOnFailureListener(new e(onLoad, 4));
    }

    public static final void fetchCourseContentDurationV3$lambda$20(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchCourseContentDurationV3$1$1(it, onLoad, null), 3);
    }

    public static final void fetchCourseContentDurationV3$lambda$21(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        onLoad.invoke(Boolean.FALSE, null);
    }

    public static final void fetchCourseContentDurationV3$lambda$28(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchCourseContentDurationV3$3$1(it, onLoad, null), 3);
    }

    public static final void fetchCourseContentDurationV3$lambda$29(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        onLoad.invoke(Boolean.FALSE, null);
    }

    public static final void fetchCourseContentV3(String language, String label, p<? super Boolean, ? super TemplateModel, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(language, "language");
        kotlin.jvm.internal.i.g(label, "label");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("template_bank").m(label, "label").m(language, "language").a();
        a10.addOnCompleteListener(new f(onLoad, 4));
        a10.addOnFailureListener(new e(onLoad, 6));
    }

    public static final void fetchCourseContentV3$lambda$18(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchCourseContentV3$1$1(it, onLoad, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, "exception in load course data", e10);
        }
    }

    public static final void fetchCourseContentV3$lambda$19(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "on failure listener fetch user content " + it);
        onLoad.invoke(Boolean.FALSE, null);
    }

    public static final void fetchCourseSpecificLearningHub(String language, String programme, int i6, boolean z10, p<? super Boolean, ? super ArrayList<LearningHubModel>, hs.k> onLoad) {
        String str;
        kotlin.jvm.internal.i.g(language, "language");
        kotlin.jvm.internal.i.g(programme, "programme");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        FirebaseFirestore d10 = FirebaseFirestore.d();
        if (z10) {
            str = "content_posts_new";
        } else {
            str = "content_posts";
        }
        com.google.firebase.firestore.d m10 = d10.b(str).m(programme, "programme");
        Boolean bool = Boolean.TRUE;
        v a10 = m10.m(bool, "published").m(bool, "status").m(language, "language").p(Integer.valueOf(i6), "day").a();
        a10.addOnCompleteListener(new f(onLoad, 5));
        a10.addOnFailureListener(new e(onLoad, 7));
    }

    public static final void fetchCourseSpecificLearningHub$lambda$0(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchCourseSpecificLearningHub$1$1(it, onLoad, null), 3);
        } catch (Throwable th2) {
            LogHelper.INSTANCE.e(TAG, "exception in fetch learning hub content", th2);
            onLoad.invoke(Boolean.FALSE, new ArrayList());
        }
    }

    public static final void fetchCourseSpecificLearningHub$lambda$1(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "on failure listener fetch learning hub content " + it);
        onLoad.invoke(Boolean.FALSE, new ArrayList());
    }

    public static final void fetchGenericLearningHub(String language, int i6, boolean z10, p<? super Boolean, ? super ArrayList<LearningHubModel>, hs.k> onLoad) {
        String str;
        kotlin.jvm.internal.i.g(language, "language");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        FirebaseFirestore d10 = FirebaseFirestore.d();
        if (z10) {
            str = "content_posts_new";
        } else {
            str = "content_posts";
        }
        com.google.firebase.firestore.d m10 = d10.b(str).m(Constants.COURSE_GENERIC, "programme");
        Boolean bool = Boolean.TRUE;
        v a10 = m10.m(bool, "published").m(bool, "status").m(language, "language").p(Integer.valueOf(i6), "day").a();
        a10.addOnCompleteListener(new f(onLoad, 7));
        a10.addOnFailureListener(new e(onLoad, 11));
    }

    public static final void fetchGenericLearningHub$lambda$2(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            if (it.isSuccessful()) {
                ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchGenericLearningHub$1$1(it, onLoad, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, "exception", e10);
        }
    }

    public static final void fetchGenericLearningHub$lambda$3(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "on failure listener fetch learning hub generic content " + it);
        onLoad.invoke(Boolean.FALSE, new ArrayList());
    }

    public static final void fetchMiniCourseMeta(String slug, q<? super Boolean, ? super String, ? super ArrayList<MiniCourseMeta>, ? extends Object> onLoad) {
        kotlin.jvm.internal.i.g(slug, "slug");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        if (r.J0(slug, "basic") && defpackage.d.q(Constants.USER_VERSION)) {
            v a10 = FirebaseFirestore.d().b("mini_content_bank").m(slug, "domain").m(Boolean.TRUE, Constants.USER_VERSION).c(Constants.DAYMODEL_POSITION).a();
            rk.b bVar = new rk.b(16, new FireStoreUtilsKt$fetchMiniCourseMeta$1(onLoad, slug));
            a10.getClass();
            a10.addOnSuccessListener(ya.j.f38393a, bVar);
            a10.addOnFailureListener(new d(onLoad, slug, 1));
            return;
        }
        v a11 = FirebaseFirestore.d().b("mini_content_bank").m(slug, "domain").c(Constants.DAYMODEL_POSITION).a();
        rk.b bVar2 = new rk.b(17, new FireStoreUtilsKt$fetchMiniCourseMeta$3(onLoad, slug));
        a11.getClass();
        a11.addOnSuccessListener(ya.j.f38393a, bVar2);
        a11.addOnFailureListener(new d(onLoad, slug, 2));
    }

    public static final void fetchMiniCourseMeta$lambda$6(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchMiniCourseMeta$lambda$7(q onLoad, String slug, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(slug, "$slug");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "Meta Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, slug, new ArrayList());
    }

    public static final void fetchMiniCourseMeta$lambda$8(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchMiniCourseMeta$lambda$9(q onLoad, String slug, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(slug, "$slug");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "Meta Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, slug, new ArrayList());
    }

    public static final void fetchMiniCourseSlugList(p<? super Boolean, ? super ArrayList<MiniCourseInfoMeta>, ? extends Object> onLoad) {
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("mini_courses").l(FirebasePersistence.getInstance().getUser().getVersion(), "userVersions").a();
        rk.b bVar = new rk.b(18, new FireStoreUtilsKt$fetchMiniCourseSlugList$1(onLoad));
        a10.getClass();
        a10.addOnSuccessListener(ya.j.f38393a, bVar);
        a10.addOnFailureListener(new e(onLoad, 8));
    }

    public static final void fetchMiniCourseSlugList$lambda$4(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchMiniCourseSlugList$lambda$5(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "MiniCourse Slug Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, new ArrayList());
    }

    public static final void fetchSingleCampaign(String campaignID, p<? super Boolean, ? super ArrayList<CampaignModel>, ? extends Object> onLoad) {
        kotlin.jvm.internal.i.g(campaignID, "campaignID");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v d10 = FirebaseFirestore.d().b("dc_content_bank").q(campaignID).d();
        rk.b bVar = new rk.b(19, new FireStoreUtilsKt$fetchSingleCampaign$1(onLoad));
        d10.getClass();
        d10.addOnSuccessListener(ya.j.f38393a, bVar);
        d10.addOnFailureListener(new e(onLoad, 10));
    }

    public static final void fetchSingleCampaign$lambda$26(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchSingleCampaign$lambda$27(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        onLoad.invoke(Boolean.FALSE, null);
        LogHelper.INSTANCE.e(TAG, it);
    }

    public static final void fetchSingleRecommendedActivity(String str, p<? super Boolean, ? super hs.f<String, String>, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        if (str == null) {
            onLoad.invoke(Boolean.FALSE, null);
            return;
        }
        v a10 = FirebaseFirestore.d().b("recommended_activity_data").m(str, Constants.GOAL_ID).a();
        a10.addOnCompleteListener(new f(onLoad, 8));
        a10.addOnFailureListener(new e(onLoad, 12));
    }

    public static final void fetchSingleRecommendedActivity$lambda$30(p onLoad, ya.h it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1(it, onLoad, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(TAG, e10);
            onLoad.invoke(Boolean.FALSE, null);
        }
    }

    public static final void fetchSingleRecommendedActivity$lambda$31(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper.INSTANCE.e(TAG, it);
        onLoad.invoke(Boolean.FALSE, null);
    }

    public static final void fetchTopicalCourse(String slug, q<? super Boolean, ? super String, ? super ArrayList<MiniCourseMeta>, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(slug, "slug");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("mini_content_bank").m(slug, "domain").c(Constants.DAYMODEL_POSITION).a();
        rk.b bVar = new rk.b(13, new FireStoreUtilsKt$fetchTopicalCourse$1(onLoad, slug));
        a10.getClass();
        a10.addOnSuccessListener(ya.j.f38393a, bVar);
        a10.addOnFailureListener(new d(onLoad, slug, 0));
    }

    public static final void fetchTopicalCourse$lambda$10(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchTopicalCourse$lambda$11(q onLoad, String slug, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(slug, "$slug");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "Meta Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, slug, new ArrayList());
    }

    public static final void fetchTopicalCourseSlugs(String keyword, p<? super Boolean, ? super ArrayList<String>, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(keyword, "keyword");
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("mini_content_bank").a();
        rk.b bVar = new rk.b(14, new FireStoreUtilsKt$fetchTopicalCourseSlugs$1(onLoad, keyword));
        a10.getClass();
        a10.addOnSuccessListener(ya.j.f38393a, bVar);
        a10.addOnFailureListener(new e(onLoad, 0));
    }

    public static final void fetchTopicalCourseSlugs$lambda$12(ss.l tmp0, Object obj) {
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void fetchTopicalCourseSlugs$lambda$13(p onLoad, Exception it) {
        kotlin.jvm.internal.i.g(onLoad, "$onLoad");
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = TAG;
        logHelper.e(str, "Meta Fetch Failed " + it);
        onLoad.invoke(Boolean.FALSE, new ArrayList());
    }

    public static final void fetchCourseContentDurationV3(String str, p<? super Boolean, ? super String, hs.k> onLoad) {
        kotlin.jvm.internal.i.g(onLoad, "onLoad");
        v a10 = FirebaseFirestore.d().b("template_bank").m(str, "label").m("en", "language").a();
        a10.addOnCompleteListener(new f(onLoad, 1));
        a10.addOnFailureListener(new e(onLoad, 3));
    }
}
