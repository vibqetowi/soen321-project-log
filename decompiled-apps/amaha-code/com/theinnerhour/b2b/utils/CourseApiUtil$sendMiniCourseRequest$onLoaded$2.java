package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ss.q;
/* compiled from: CourseApiUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "success", "", "<anonymous parameter 1>", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/MiniCourseMeta;", "Lkotlin/collections/ArrayList;", "metaList", "Lhs/k;", "invoke", "(ZLjava/lang/String;Ljava/util/ArrayList;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseApiUtil$sendMiniCourseRequest$onLoaded$2 extends kotlin.jvm.internal.k implements q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> {
    final /* synthetic */ List<MiniCourse> $existing;
    final /* synthetic */ ArrayList<MiniCourseInfoMeta> $mcMetaList;
    final /* synthetic */ String $slug;
    final /* synthetic */ CourseApiUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseApiUtil$sendMiniCourseRequest$onLoaded$2(String str, ArrayList<MiniCourseInfoMeta> arrayList, List<MiniCourse> list, CourseApiUtil courseApiUtil) {
        super(3);
        this.$slug = str;
        this.$mcMetaList = arrayList;
        this.$existing = list;
        this.this$0 = courseApiUtil;
    }

    @Override // ss.q
    public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, String str, ArrayList<MiniCourseMeta> arrayList) {
        invoke(bool.booleanValue(), str, arrayList);
        return hs.k.f19476a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
        r5 = r4.this$0.miniUtilInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
        r5 = r4.this$0.miniUtilInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
        r7 = r4.this$0.miniUtilInterface;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z10, String str, ArrayList<MiniCourseMeta> metaList) {
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface;
        String str2;
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface2;
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface3;
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface4;
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface5;
        CourseApiUtil.MiniCourseApiUtilInterface miniCourseApiUtilInterface6;
        kotlin.jvm.internal.i.g(str, "<anonymous parameter 1>");
        kotlin.jvm.internal.i.g(metaList, "metaList");
        try {
            if (!z10) {
                miniCourseApiUtilInterface3 = this.this$0.miniUtilInterface;
                if (miniCourseApiUtilInterface3 == null || miniCourseApiUtilInterface4 == null) {
                    return;
                }
                miniCourseApiUtilInterface4.miniCourseApiComplete(false, this.$slug);
                return;
            }
            ArrayList<CourseDayModelV1> arrayList = new ArrayList<>();
            Iterator<MiniCourseMeta> it = metaList.iterator();
            while (it.hasNext()) {
                MiniCourseMeta next = it.next();
                CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
                courseDayModelV1.setContent_id(next.getId());
                courseDayModelV1.setContent_label(next.getLabel());
                courseDayModelV1.setSymptom(next.getSymptom());
                courseDayModelV1.setTags(next.getTags());
                courseDayModelV1.setPosition(next.getPosition());
                arrayList.add(courseDayModelV1);
            }
            MiniCourse miniCourse = new MiniCourse();
            miniCourse.setDomain(this.$slug);
            Iterator<MiniCourseInfoMeta> it2 = this.$mcMetaList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                MiniCourseInfoMeta next2 = it2.next();
                if (kotlin.jvm.internal.i.b(next2.getSlug(), this.$slug)) {
                    miniCourse.setCourse(next2.getDomains().get(0));
                    miniCourse.setPosition(next2.getPosition());
                    break;
                }
            }
            miniCourse.setPlan(arrayList);
            if (this.$existing.isEmpty()) {
                FirebasePersistence.getInstance().getUser().getMiniCourses().add(miniCourse);
            } else {
                ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
                String str3 = this.$slug;
                for (MiniCourse miniCourse2 : miniCourses) {
                    if (kotlin.jvm.internal.i.b(miniCourse2.getDomain(), str3)) {
                        miniCourse2.setPlan(arrayList);
                    }
                }
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            miniCourseApiUtilInterface5 = this.this$0.miniUtilInterface;
            if (miniCourseApiUtilInterface5 == null || miniCourseApiUtilInterface6 == null) {
                return;
            }
            miniCourseApiUtilInterface6.miniCourseApiComplete(true, this.$slug);
        } catch (Exception e10) {
            miniCourseApiUtilInterface = this.this$0.miniUtilInterface;
            if (miniCourseApiUtilInterface != null && miniCourseApiUtilInterface2 != null) {
                miniCourseApiUtilInterface2.miniCourseApiComplete(false, this.$slug);
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            str2 = this.this$0.TAG;
            logHelper.e(str2, "exception", e10);
        }
    }
}
