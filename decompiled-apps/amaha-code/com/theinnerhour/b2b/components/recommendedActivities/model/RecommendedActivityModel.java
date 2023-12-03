package com.theinnerhour.b2b.components.recommendedActivities.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import fe.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: RecommendedActivityModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016¢\u0006\u0004\b^\u0010_J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016HÆ\u0003JÊ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020\nHÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u00100\u001a\u00020\nHÖ\u0001J\u0019\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\nHÖ\u0001R\"\u0010\u0018\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00106\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010\u001c\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\"\u0010\u001d\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00106\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010G\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010JR\"\u0010 \u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\"\u0010!\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00106\u001a\u0004\bO\u00108\"\u0004\bP\u0010:R\"\u0010#\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\"\u0010$\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\bS\u00108\"\u0004\bT\u0010:R\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00106\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\"\u0010&\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\bW\u00108\"\u0004\bX\u0010:R2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityContentModel;", "Lkotlin/collections/ArrayList;", "component16", "title", "audioUrl", "lottieUrl", "backgroundUrl", "thumbUrl", "domain", "duration", "courseRank", "goalId", "goalType", "notificationTitle", "reminderTitle", "reminderDescription", "templateType", "templateTypeText", "activityContent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityModel;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhs/k;", "writeToParcel", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getAudioUrl", "setAudioUrl", "getLottieUrl", "setLottieUrl", "getBackgroundUrl", "setBackgroundUrl", "getThumbUrl", "setThumbUrl", "getDomain", "setDomain", "getDuration", "setDuration", "Ljava/lang/Integer;", "getCourseRank", "setCourseRank", "(Ljava/lang/Integer;)V", "getGoalId", "setGoalId", "getGoalType", "setGoalType", "getNotificationTitle", "setNotificationTitle", "getReminderTitle", "setReminderTitle", "getReminderDescription", "setReminderDescription", "getTemplateType", "setTemplateType", "getTemplateTypeText", "setTemplateTypeText", "Ljava/util/ArrayList;", "getActivityContent", "()Ljava/util/ArrayList;", "setActivityContent", "(Ljava/util/ArrayList;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivityModel implements Parcelable {
    public static final Parcelable.Creator<RecommendedActivityModel> CREATOR = new Creator();
    private ArrayList<RecommendedActivityContentModel> activityContent;
    private String audioUrl;
    private String backgroundUrl;
    private Integer courseRank;
    private String domain;
    private String duration;
    private String goalId;
    private String goalType;
    private String lottieUrl;
    private String notificationTitle;
    private String reminderDescription;
    private String reminderTitle;
    private String templateType;
    private String templateTypeText;
    private String thumbUrl;
    private String title;

    /* compiled from: RecommendedActivityModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<RecommendedActivityModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityModel createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i6 = 0;
            while (i6 != readInt) {
                arrayList.add(RecommendedActivityContentModel.CREATOR.createFromParcel(parcel));
                i6++;
                readInt = readInt;
            }
            return new RecommendedActivityModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, valueOf, readString8, readString9, readString10, readString11, readString12, readString13, readString14, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityModel[] newArray(int i6) {
            return new RecommendedActivityModel[i6];
        }
    }

    public RecommendedActivityModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.goalType;
    }

    public final String component11() {
        return this.notificationTitle;
    }

    public final String component12() {
        return this.reminderTitle;
    }

    public final String component13() {
        return this.reminderDescription;
    }

    public final String component14() {
        return this.templateType;
    }

    public final String component15() {
        return this.templateTypeText;
    }

    public final ArrayList<RecommendedActivityContentModel> component16() {
        return this.activityContent;
    }

    public final String component2() {
        return this.audioUrl;
    }

    public final String component3() {
        return this.lottieUrl;
    }

    public final String component4() {
        return this.backgroundUrl;
    }

    public final String component5() {
        return this.thumbUrl;
    }

    public final String component6() {
        return this.domain;
    }

    public final String component7() {
        return this.duration;
    }

    public final Integer component8() {
        return this.courseRank;
    }

    public final String component9() {
        return this.goalId;
    }

    public final RecommendedActivityModel copy(String title, String str, String str2, String str3, String thumbUrl, String domain, String str4, Integer num, String goalId, String goalType, String notificationTitle, String reminderTitle, String reminderDescription, String templateType, String templateTypeText, ArrayList<RecommendedActivityContentModel> activityContent) {
        i.g(title, "title");
        i.g(thumbUrl, "thumbUrl");
        i.g(domain, "domain");
        i.g(goalId, "goalId");
        i.g(goalType, "goalType");
        i.g(notificationTitle, "notificationTitle");
        i.g(reminderTitle, "reminderTitle");
        i.g(reminderDescription, "reminderDescription");
        i.g(templateType, "templateType");
        i.g(templateTypeText, "templateTypeText");
        i.g(activityContent, "activityContent");
        return new RecommendedActivityModel(title, str, str2, str3, thumbUrl, domain, str4, num, goalId, goalType, notificationTitle, reminderTitle, reminderDescription, templateType, templateTypeText, activityContent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedActivityModel)) {
            return false;
        }
        RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
        if (i.b(this.title, recommendedActivityModel.title) && i.b(this.audioUrl, recommendedActivityModel.audioUrl) && i.b(this.lottieUrl, recommendedActivityModel.lottieUrl) && i.b(this.backgroundUrl, recommendedActivityModel.backgroundUrl) && i.b(this.thumbUrl, recommendedActivityModel.thumbUrl) && i.b(this.domain, recommendedActivityModel.domain) && i.b(this.duration, recommendedActivityModel.duration) && i.b(this.courseRank, recommendedActivityModel.courseRank) && i.b(this.goalId, recommendedActivityModel.goalId) && i.b(this.goalType, recommendedActivityModel.goalType) && i.b(this.notificationTitle, recommendedActivityModel.notificationTitle) && i.b(this.reminderTitle, recommendedActivityModel.reminderTitle) && i.b(this.reminderDescription, recommendedActivityModel.reminderDescription) && i.b(this.templateType, recommendedActivityModel.templateType) && i.b(this.templateTypeText, recommendedActivityModel.templateTypeText) && i.b(this.activityContent, recommendedActivityModel.activityContent)) {
            return true;
        }
        return false;
    }

    @p("template")
    public final ArrayList<RecommendedActivityContentModel> getActivityContent() {
        return this.activityContent;
    }

    @p("audio_url")
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @p("background_url")
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @p("course_rank")
    public final Integer getCourseRank() {
        return this.courseRank;
    }

    @p("domain_tag")
    public final String getDomain() {
        return this.domain;
    }

    @p("duration")
    public final String getDuration() {
        return this.duration;
    }

    @p(Constants.GOAL_ID)
    public final String getGoalId() {
        return this.goalId;
    }

    @p(Constants.GOAL_TYPE)
    public final String getGoalType() {
        return this.goalType;
    }

    @p("lottie_url")
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    @p(Constants.NOTIFICATION_TITLE)
    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    @p("reminder_description")
    public final String getReminderDescription() {
        return this.reminderDescription;
    }

    @p("reminder_title")
    public final String getReminderTitle() {
        return this.reminderTitle;
    }

    @p("template_type")
    public final String getTemplateType() {
        return this.templateType;
    }

    @p("template_type_text")
    public final String getTemplateTypeText() {
        return this.templateTypeText;
    }

    @p("thumb_url")
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    @p("title")
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.title.hashCode() * 31;
        String str = this.audioUrl;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode5 + hashCode) * 31;
        String str2 = this.lottieUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.backgroundUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int c10 = a.c(this.domain, a.c(this.thumbUrl, (i11 + hashCode3) * 31, 31), 31);
        String str4 = this.duration;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (c10 + hashCode4) * 31;
        Integer num = this.courseRank;
        if (num != null) {
            i6 = num.hashCode();
        }
        return this.activityContent.hashCode() + a.c(this.templateTypeText, a.c(this.templateType, a.c(this.reminderDescription, a.c(this.reminderTitle, a.c(this.notificationTitle, a.c(this.goalType, a.c(this.goalId, (i12 + i6) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @p("template")
    public final void setActivityContent(ArrayList<RecommendedActivityContentModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.activityContent = arrayList;
    }

    @p("audio_url")
    public final void setAudioUrl(String str) {
        this.audioUrl = str;
    }

    @p("background_url")
    public final void setBackgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    @p("course_rank")
    public final void setCourseRank(Integer num) {
        this.courseRank = num;
    }

    @p("domain_tag")
    public final void setDomain(String str) {
        i.g(str, "<set-?>");
        this.domain = str;
    }

    @p("duration")
    public final void setDuration(String str) {
        this.duration = str;
    }

    @p(Constants.GOAL_ID)
    public final void setGoalId(String str) {
        i.g(str, "<set-?>");
        this.goalId = str;
    }

    @p(Constants.GOAL_TYPE)
    public final void setGoalType(String str) {
        i.g(str, "<set-?>");
        this.goalType = str;
    }

    @p("lottie_url")
    public final void setLottieUrl(String str) {
        this.lottieUrl = str;
    }

    @p(Constants.NOTIFICATION_TITLE)
    public final void setNotificationTitle(String str) {
        i.g(str, "<set-?>");
        this.notificationTitle = str;
    }

    @p("reminder_description")
    public final void setReminderDescription(String str) {
        i.g(str, "<set-?>");
        this.reminderDescription = str;
    }

    @p("reminder_title")
    public final void setReminderTitle(String str) {
        i.g(str, "<set-?>");
        this.reminderTitle = str;
    }

    @p("template_type")
    public final void setTemplateType(String str) {
        i.g(str, "<set-?>");
        this.templateType = str;
    }

    @p("template_type_text")
    public final void setTemplateTypeText(String str) {
        i.g(str, "<set-?>");
        this.templateTypeText = str;
    }

    @p("thumb_url")
    public final void setThumbUrl(String str) {
        i.g(str, "<set-?>");
        this.thumbUrl = str;
    }

    @p("title")
    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "RecommendedActivityModel(title=" + this.title + ", audioUrl=" + this.audioUrl + ", lottieUrl=" + this.lottieUrl + ", backgroundUrl=" + this.backgroundUrl + ", thumbUrl=" + this.thumbUrl + ", domain=" + this.domain + ", duration=" + this.duration + ", courseRank=" + this.courseRank + ", goalId=" + this.goalId + ", goalType=" + this.goalType + ", notificationTitle=" + this.notificationTitle + ", reminderTitle=" + this.reminderTitle + ", reminderDescription=" + this.reminderDescription + ", templateType=" + this.templateType + ", templateTypeText=" + this.templateTypeText + ", activityContent=" + this.activityContent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i6) {
        int intValue;
        i.g(out, "out");
        out.writeString(this.title);
        out.writeString(this.audioUrl);
        out.writeString(this.lottieUrl);
        out.writeString(this.backgroundUrl);
        out.writeString(this.thumbUrl);
        out.writeString(this.domain);
        out.writeString(this.duration);
        Integer num = this.courseRank;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.goalId);
        out.writeString(this.goalType);
        out.writeString(this.notificationTitle);
        out.writeString(this.reminderTitle);
        out.writeString(this.reminderDescription);
        out.writeString(this.templateType);
        out.writeString(this.templateTypeText);
        ArrayList<RecommendedActivityContentModel> arrayList = this.activityContent;
        out.writeInt(arrayList.size());
        Iterator<RecommendedActivityContentModel> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i6);
        }
    }

    public RecommendedActivityModel(String title, String str, String str2, String str3, String thumbUrl, String domain, String str4, Integer num, String goalId, String goalType, String notificationTitle, String reminderTitle, String reminderDescription, String templateType, String templateTypeText, ArrayList<RecommendedActivityContentModel> activityContent) {
        i.g(title, "title");
        i.g(thumbUrl, "thumbUrl");
        i.g(domain, "domain");
        i.g(goalId, "goalId");
        i.g(goalType, "goalType");
        i.g(notificationTitle, "notificationTitle");
        i.g(reminderTitle, "reminderTitle");
        i.g(reminderDescription, "reminderDescription");
        i.g(templateType, "templateType");
        i.g(templateTypeText, "templateTypeText");
        i.g(activityContent, "activityContent");
        this.title = title;
        this.audioUrl = str;
        this.lottieUrl = str2;
        this.backgroundUrl = str3;
        this.thumbUrl = thumbUrl;
        this.domain = domain;
        this.duration = str4;
        this.courseRank = num;
        this.goalId = goalId;
        this.goalType = goalType;
        this.notificationTitle = notificationTitle;
        this.reminderTitle = reminderTitle;
        this.reminderDescription = reminderDescription;
        this.templateType = templateType;
        this.templateTypeText = templateTypeText;
        this.activityContent = activityContent;
    }

    public /* synthetic */ RecommendedActivityModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? "" : str6, (i6 & 64) != 0 ? null : str7, (i6 & 128) == 0 ? num : null, (i6 & 256) != 0 ? "" : str8, (i6 & 512) != 0 ? "" : str9, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? "" : str10, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? "" : str11, (i6 & 4096) != 0 ? "" : str12, (i6 & 8192) != 0 ? "" : str13, (i6 & 16384) != 0 ? "" : str14, (i6 & 32768) != 0 ? new ArrayList() : arrayList);
    }
}
