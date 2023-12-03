package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import tf.b;
/* compiled from: ProviderDetailModel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0006QRSTUVB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR:\u0010\t\u001a\u001e\u0012\b\u0012\u00060\u000bR\u00020\u0000\u0018\u00010\nj\u000e\u0012\b\u0012\u00060\u000bR\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R:\u0010\u0017\u001a\u001e\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0018\u00010\nj\u000e\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R:\u0010\u001b\u001a\u001e\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0018\u00010\nj\u000e\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R$\u0010\u001f\u001a\b\u0018\u00010 R\u00020\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR \u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR \u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\"\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR:\u00108\u001a\u001e\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0018\u00010\nj\u000e\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R \u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR:\u0010>\u001a\u001e\u0012\b\u0012\u00060?R\u00020\u0000\u0018\u00010\nj\u000e\u0012\b\u0012\u00060?R\u00020\u0000\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R \u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR \u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR \u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR \u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR \u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\b¨\u0006W"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;", "Ljava/io/Serializable;", "()V", "about", "", "getAbout", "()Ljava/lang/String;", "setAbout", "(Ljava/lang/String;)V", "affiliations", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$AffiliationInfo;", "Lkotlin/collections/ArrayList;", "getAffiliations", "()Ljava/util/ArrayList;", "setAffiliations", "(Ljava/util/ArrayList;)V", "commercials", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;", "getCommercials", "()Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;", "setCommercials", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;)V", "domainAreas", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Area;", "getDomainAreas", "setDomainAreas", "educations", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$EducationInfo;", "getEducations", "setEducations", "experience", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;", "getExperience", "()Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;", "setExperience", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;)V", "firebaseId", "getFirebaseId", "setFirebaseId", SessionManager.KEY_FIRSTNAME, "getFirstName", "setFirstName", "gender", "getGender", "setGender", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "image", "getImage", "setImage", "languages", "getLanguages", "setLanguages", SessionManager.KEY_LASTNAME, "getLastName", "setLastName", "questionResponseList", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$QuestionResponseModel;", "getQuestionResponseList", "setQuestionResponseList", "registrationNumber", "getRegistrationNumber", "setRegistrationNumber", "timezone", "getTimezone", "setTimezone", SessionManager.KEY_UUID, "getUuid", "setUuid", "videoThumbnailUrl", "getVideoThumbnailUrl", "setVideoThumbnailUrl", "videoUrl", "getVideoUrl", "setVideoUrl", "AffiliationInfo", "Area", "CommercialInfo", "EducationInfo", "Experience", "QuestionResponseModel", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderDetailModel implements Serializable {
    @b("about")
    private String about;
    @b("affiliations")
    private ArrayList<AffiliationInfo> affiliations;
    @b("commercials")
    private CommercialInfo commercials;
    @b("domainareas")
    private ArrayList<Area> domainAreas;
    @b("educations")
    private ArrayList<EducationInfo> educations;
    @b("experience")
    private Experience experience;
    @b("firebaseid")
    private String firebaseId;
    @b("firstname")
    private String firstName;
    @b("gender")
    private String gender;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11659id;
    @b("image")
    private String image;
    @b("languages")
    private ArrayList<Area> languages;
    @b("lastname")
    private String lastName;
    @b("questions")
    private ArrayList<QuestionResponseModel> questionResponseList;
    @b("registration_number")
    private String registrationNumber;
    @b("timezone")
    private String timezone;
    @b(SessionManager.KEY_UUID)
    private String uuid;
    @b("video_thumb")
    private String videoThumbnailUrl;
    @b("video")
    private String videoUrl;

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$AffiliationInfo;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "designation", "", "getDesignation", "()Ljava/lang/String;", "setDesignation", "(Ljava/lang/String;)V", "isCurrent", "", "()Ljava/lang/Boolean;", "setCurrent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "organisation", "getOrganisation", "setOrganisation", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class AffiliationInfo {
        @b("designation")
        private String designation;
        @b("iscurrent")
        private Boolean isCurrent;
        @b("organisation")
        private String organisation;

        public AffiliationInfo() {
        }

        public final String getDesignation() {
            return this.designation;
        }

        public final String getOrganisation() {
            return this.organisation;
        }

        public final Boolean isCurrent() {
            return this.isCurrent;
        }

        public final void setCurrent(Boolean bool) {
            this.isCurrent = bool;
        }

        public final void setDesignation(String str) {
            this.designation = str;
        }

        public final void setOrganisation(String str) {
            this.organisation = str;
        }
    }

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Area;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", SessionManager.KEY_NAME, "getName", "setName", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class Area {
        @b("id")

        /* renamed from: id  reason: collision with root package name */
        private String f11660id;
        @b(SessionManager.KEY_NAME)
        private String name;

        public Area() {
        }

        public final String getId() {
            return this.f11660id;
        }

        public final String getName() {
            return this.name;
        }

        public final void setId(String str) {
            this.f11660id = str;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR2\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$CommercialInfo;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "couplesHourlyFee", "", "getCouplesHourlyFee", "()Ljava/lang/Integer;", "setCouplesHourlyFee", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "hourlyFee", "getHourlyFee", "setHourlyFee", "offeredMediumList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getOfferedMediumList", "()Ljava/util/ArrayList;", "setOfferedMediumList", "(Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class CommercialInfo {
        @b("couple_hourly_fee")
        private Integer couplesHourlyFee;
        @b("hourly_fee")
        private Integer hourlyFee;
        @b("medium")
        private ArrayList<String> offeredMediumList;

        public CommercialInfo() {
        }

        public final Integer getCouplesHourlyFee() {
            return this.couplesHourlyFee;
        }

        public final Integer getHourlyFee() {
            return this.hourlyFee;
        }

        public final ArrayList<String> getOfferedMediumList() {
            return this.offeredMediumList;
        }

        public final void setCouplesHourlyFee(Integer num) {
            this.couplesHourlyFee = num;
        }

        public final void setHourlyFee(Integer num) {
            this.hourlyFee = num;
        }

        public final void setOfferedMediumList(ArrayList<String> arrayList) {
            this.offeredMediumList = arrayList;
        }
    }

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$EducationInfo;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "degree", "", "getDegree", "()Ljava/lang/String;", "setDegree", "(Ljava/lang/String;)V", "major", "getMajor", "setMajor", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class EducationInfo {
        @b("degree")
        private String degree;
        @b("major")
        private String major;

        public EducationInfo() {
        }

        public final String getDegree() {
            return this.degree;
        }

        public final String getMajor() {
            return this.major;
        }

        public final void setDegree(String str) {
            this.degree = str;
        }

        public final void setMajor(String str) {
            this.major = str;
        }
    }

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$Experience;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "year", "", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class Experience {
        @b("year")
        private Integer year;

        public Experience() {
        }

        public final Integer getYear() {
            return this.year;
        }

        public final void setYear(Integer num) {
            this.year = num;
        }
    }

    /* compiled from: ProviderDetailModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel$QuestionResponseModel;", "", "(Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderDetailModel;)V", "answer", "", "getAnswer", "()Ljava/lang/String;", "setAnswer", "(Ljava/lang/String;)V", "question", "getQuestion", "setQuestion", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class QuestionResponseModel {
        @b("answer")
        private String answer;
        @b("question")
        private String question;

        public QuestionResponseModel() {
        }

        public final String getAnswer() {
            return this.answer;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final void setAnswer(String str) {
            this.answer = str;
        }

        public final void setQuestion(String str) {
            this.question = str;
        }
    }

    public final String getAbout() {
        return this.about;
    }

    public final ArrayList<AffiliationInfo> getAffiliations() {
        return this.affiliations;
    }

    public final CommercialInfo getCommercials() {
        return this.commercials;
    }

    public final ArrayList<Area> getDomainAreas() {
        return this.domainAreas;
    }

    public final ArrayList<EducationInfo> getEducations() {
        return this.educations;
    }

    public final Experience getExperience() {
        return this.experience;
    }

    public final String getFirebaseId() {
        return this.firebaseId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Integer getId() {
        return this.f11659id;
    }

    public final String getImage() {
        return this.image;
    }

    public final ArrayList<Area> getLanguages() {
        return this.languages;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final ArrayList<QuestionResponseModel> getQuestionResponseList() {
        return this.questionResponseList;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final void setAbout(String str) {
        this.about = str;
    }

    public final void setAffiliations(ArrayList<AffiliationInfo> arrayList) {
        this.affiliations = arrayList;
    }

    public final void setCommercials(CommercialInfo commercialInfo) {
        this.commercials = commercialInfo;
    }

    public final void setDomainAreas(ArrayList<Area> arrayList) {
        this.domainAreas = arrayList;
    }

    public final void setEducations(ArrayList<EducationInfo> arrayList) {
        this.educations = arrayList;
    }

    public final void setExperience(Experience experience) {
        this.experience = experience;
    }

    public final void setFirebaseId(String str) {
        this.firebaseId = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setGender(String str) {
        this.gender = str;
    }

    public final void setId(Integer num) {
        this.f11659id = num;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setLanguages(ArrayList<Area> arrayList) {
        this.languages = arrayList;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setQuestionResponseList(ArrayList<QuestionResponseModel> arrayList) {
        this.questionResponseList = arrayList;
    }

    public final void setRegistrationNumber(String str) {
        this.registrationNumber = str;
    }

    public final void setTimezone(String str) {
        this.timezone = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVideoThumbnailUrl(String str) {
        this.videoThumbnailUrl = str;
    }

    public final void setVideoUrl(String str) {
        this.videoUrl = str;
    }
}
