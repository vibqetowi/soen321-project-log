package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserOnboardingModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001cHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006 "}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/UserOnboardingModel;", "", "adhdCourse", "Lcom/theinnerhour/b2b/model/Course;", "ocdCourse", "expertCareCourse", "Lcom/theinnerhour/b2b/components/onboarding/model/ExpertCareMatchingCourseModel;", "(Lcom/theinnerhour/b2b/model/Course;Lcom/theinnerhour/b2b/model/Course;Lcom/theinnerhour/b2b/components/onboarding/model/ExpertCareMatchingCourseModel;)V", "getAdhdCourse", "()Lcom/theinnerhour/b2b/model/Course;", "setAdhdCourse", "(Lcom/theinnerhour/b2b/model/Course;)V", "getExpertCareCourse", "()Lcom/theinnerhour/b2b/components/onboarding/model/ExpertCareMatchingCourseModel;", "setExpertCareCourse", "(Lcom/theinnerhour/b2b/components/onboarding/model/ExpertCareMatchingCourseModel;)V", "getOcdCourse", "setOcdCourse", "component1", "component2", "component3", "copy", "equals", "", "other", "getCourseStartDate", "", "courseName", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserOnboardingModel {
    private Course adhdCourse;
    private ExpertCareMatchingCourseModel expertCareCourse;
    private Course ocdCourse;

    public UserOnboardingModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserOnboardingModel copy$default(UserOnboardingModel userOnboardingModel, Course course, Course course2, ExpertCareMatchingCourseModel expertCareMatchingCourseModel, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            course = userOnboardingModel.adhdCourse;
        }
        if ((i6 & 2) != 0) {
            course2 = userOnboardingModel.ocdCourse;
        }
        if ((i6 & 4) != 0) {
            expertCareMatchingCourseModel = userOnboardingModel.expertCareCourse;
        }
        return userOnboardingModel.copy(course, course2, expertCareMatchingCourseModel);
    }

    public final Course component1() {
        return this.adhdCourse;
    }

    public final Course component2() {
        return this.ocdCourse;
    }

    public final ExpertCareMatchingCourseModel component3() {
        return this.expertCareCourse;
    }

    public final UserOnboardingModel copy(Course course, Course course2, ExpertCareMatchingCourseModel expertCareMatchingCourseModel) {
        return new UserOnboardingModel(course, course2, expertCareMatchingCourseModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOnboardingModel)) {
            return false;
        }
        UserOnboardingModel userOnboardingModel = (UserOnboardingModel) obj;
        if (i.b(this.adhdCourse, userOnboardingModel.adhdCourse) && i.b(this.ocdCourse, userOnboardingModel.ocdCourse) && i.b(this.expertCareCourse, userOnboardingModel.expertCareCourse)) {
            return true;
        }
        return false;
    }

    public final Course getAdhdCourse() {
        return this.adhdCourse;
    }

    public final long getCourseStartDate(String str) {
        ExpertCareMatchingCourseModel expertCareMatchingCourseModel;
        CustomDate startDate;
        Course course;
        CustomDate startDate2;
        Course course2;
        CustomDate startDate3;
        if (str == null) {
            return 0L;
        }
        int hashCode = str.hashCode();
        if (hashCode != -80148009) {
            if (hashCode != 109840) {
                if (hashCode != 2989151 || !str.equals(Constants.COURSE_ADHD) || (course2 = this.adhdCourse) == null || (startDate3 = course2.getStartDate()) == null) {
                    return 0L;
                }
                return startDate3.getTime();
            } else if (!str.equals(Constants.COURSE_OCD) || (course = this.ocdCourse) == null || (startDate2 = course.getStartDate()) == null) {
                return 0L;
            } else {
                return startDate2.getTime();
            }
        } else if (!str.equals(Constants.COURSE_GENERIC) || (expertCareMatchingCourseModel = this.expertCareCourse) == null || (startDate = expertCareMatchingCourseModel.getStartDate()) == null) {
            return 0L;
        } else {
            return startDate.getTime();
        }
    }

    public final ExpertCareMatchingCourseModel getExpertCareCourse() {
        return this.expertCareCourse;
    }

    public final Course getOcdCourse() {
        return this.ocdCourse;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Course course = this.adhdCourse;
        int i6 = 0;
        if (course == null) {
            hashCode = 0;
        } else {
            hashCode = course.hashCode();
        }
        int i10 = hashCode * 31;
        Course course2 = this.ocdCourse;
        if (course2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = course2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        ExpertCareMatchingCourseModel expertCareMatchingCourseModel = this.expertCareCourse;
        if (expertCareMatchingCourseModel != null) {
            i6 = expertCareMatchingCourseModel.hashCode();
        }
        return i11 + i6;
    }

    public final void setAdhdCourse(Course course) {
        this.adhdCourse = course;
    }

    public final void setExpertCareCourse(ExpertCareMatchingCourseModel expertCareMatchingCourseModel) {
        this.expertCareCourse = expertCareMatchingCourseModel;
    }

    public final void setOcdCourse(Course course) {
        this.ocdCourse = course;
    }

    public String toString() {
        return "UserOnboardingModel(adhdCourse=" + this.adhdCourse + ", ocdCourse=" + this.ocdCourse + ", expertCareCourse=" + this.expertCareCourse + ')';
    }

    public UserOnboardingModel(Course course, Course course2, ExpertCareMatchingCourseModel expertCareMatchingCourseModel) {
        this.adhdCourse = course;
        this.ocdCourse = course2;
        this.expertCareCourse = expertCareMatchingCourseModel;
    }

    public /* synthetic */ UserOnboardingModel(Course course, Course course2, ExpertCareMatchingCourseModel expertCareMatchingCourseModel, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : course, (i6 & 2) != 0 ? null : course2, (i6 & 4) != 0 ? null : expertCareMatchingCourseModel);
    }
}
