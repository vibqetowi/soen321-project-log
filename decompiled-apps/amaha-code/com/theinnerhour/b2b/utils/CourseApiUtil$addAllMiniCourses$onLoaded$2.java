package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import ss.q;
/* compiled from: CourseApiUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "success", "", "slug", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/MiniCourseMeta;", "Lkotlin/collections/ArrayList;", "metaList", "Lhs/k;", "invoke", "(ZLjava/lang/String;Ljava/util/ArrayList;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseApiUtil$addAllMiniCourses$onLoaded$2 extends kotlin.jvm.internal.k implements q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> {
    final /* synthetic */ ArrayList<MiniCourse> $finalMcList;
    final /* synthetic */ ArrayList<MiniCourseInfoMeta> $mcMetaList;
    final /* synthetic */ CourseApiUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseApiUtil$addAllMiniCourses$onLoaded$2(ArrayList<MiniCourseInfoMeta> arrayList, ArrayList<MiniCourse> arrayList2, CourseApiUtil courseApiUtil) {
        super(3);
        this.$mcMetaList = arrayList;
        this.$finalMcList = arrayList2;
        this.this$0 = courseApiUtil;
    }

    @Override // ss.q
    public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool, String str, ArrayList<MiniCourseMeta> arrayList) {
        invoke(bool.booleanValue(), str, arrayList);
        return hs.k.f19476a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
        r4 = r3.this$0.miniInitUtilInterface;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z10, String slug, ArrayList<MiniCourseMeta> metaList) {
        CourseApiUtil.MiniCourseApiInitUtilInterface miniCourseApiInitUtilInterface;
        CourseApiUtil.MiniCourseApiInitUtilInterface miniCourseApiInitUtilInterface2;
        kotlin.jvm.internal.i.g(slug, "slug");
        kotlin.jvm.internal.i.g(metaList, "metaList");
        if (z10) {
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
            miniCourse.setDomain(slug);
            Iterator<MiniCourseInfoMeta> it2 = this.$mcMetaList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                MiniCourseInfoMeta next2 = it2.next();
                if (kotlin.jvm.internal.i.b(next2.getSlug(), slug)) {
                    miniCourse.setCourse(next2.getDomains().get(0));
                    miniCourse.setPosition(next2.getPosition());
                    break;
                }
            }
            miniCourse.setPlan(arrayList);
            this.$finalMcList.add(miniCourse);
            if (this.$finalMcList.size() == 18) {
                FirebasePersistence.getInstance().getUser().setMiniCourses(this.$finalMcList);
                FirebasePersistence.getInstance().updateUserOnFirebase();
                miniCourseApiInitUtilInterface = this.this$0.miniInitUtilInterface;
                if (miniCourseApiInitUtilInterface == null || miniCourseApiInitUtilInterface2 == null) {
                    return;
                }
                miniCourseApiInitUtilInterface2.miniCourseApiInitComplete(true);
            }
        }
    }
}
