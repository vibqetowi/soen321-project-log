package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\rj\b\u0012\u0004\u0012\u00020!`\u000f¢\u0006\u0002\u0010\"J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0019\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000fHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0019\u0010a\u001a\u0012\u0012\u0004\u0012\u00020!0\rj\b\u0012\u0004\u0012\u00020!`\u000fHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\t\u0010g\u001a\u00020\nHÆ\u0003J\u0019\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003J\u0019\u0010i\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fHÆ\u0003J\u009d\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\rj\b\u0012\u0004\u0012\u00020!`\u000fHÆ\u0001J\u0013\u0010k\u001a\u00020\n2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\u0003HÖ\u0001J\t\u0010n\u001a\u00020\u0005HÖ\u0001R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\rj\b\u0012\u0004\u0012\u00020!`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R.\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010?\"\u0004\b@\u0010AR\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010?\"\u0004\bB\u0010AR.\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R.\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010,\"\u0004\bT\u0010.R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010,\"\u0004\bV\u0010.¨\u0006o"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/MatchingProviderList;", "", "id", "", "firstname", "", "lastname", "image", SessionManager.KEY_UUID, "isInhouse", "", "isRecommended", "languages", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/onboarding/model/Languages;", "Lkotlin/collections/ArrayList;", "educations", "Lcom/theinnerhour/b2b/components/onboarding/model/Educations;", "video", "videoThumb", "commercials", "Lcom/theinnerhour/b2b/components/onboarding/model/Commercials;", "offlineOffering", "Lcom/theinnerhour/b2b/components/onboarding/model/OfflineOffering;", "onlineOffering", "Lcom/theinnerhour/b2b/components/onboarding/model/OnlineOffering;", "earliestAvailableDate", "earliestAvailableDatetime", "experience", "Lcom/theinnerhour/b2b/components/onboarding/model/Experience;", "stripDetails", "Lcom/theinnerhour/b2b/components/onboarding/model/StripDetails;", "domainareas", "Lcom/theinnerhour/b2b/components/onboarding/model/Domainareas;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/components/onboarding/model/Commercials;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/components/onboarding/model/OnlineOffering;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/components/onboarding/model/Experience;Lcom/theinnerhour/b2b/components/onboarding/model/StripDetails;Ljava/util/ArrayList;)V", "getCommercials", "()Lcom/theinnerhour/b2b/components/onboarding/model/Commercials;", "setCommercials", "(Lcom/theinnerhour/b2b/components/onboarding/model/Commercials;)V", "getDomainareas", "()Ljava/util/ArrayList;", "setDomainareas", "(Ljava/util/ArrayList;)V", "getEarliestAvailableDate", "()Ljava/lang/String;", "setEarliestAvailableDate", "(Ljava/lang/String;)V", "getEarliestAvailableDatetime", "setEarliestAvailableDatetime", "getEducations", "setEducations", "getExperience", "()Lcom/theinnerhour/b2b/components/onboarding/model/Experience;", "setExperience", "(Lcom/theinnerhour/b2b/components/onboarding/model/Experience;)V", "getFirstname", "setFirstname", "getId", "()I", "setId", "(I)V", "getImage", "setImage", "()Z", "setInhouse", "(Z)V", "setRecommended", "getLanguages", "setLanguages", "getLastname", "setLastname", "getOfflineOffering", "setOfflineOffering", "getOnlineOffering", "()Lcom/theinnerhour/b2b/components/onboarding/model/OnlineOffering;", "setOnlineOffering", "(Lcom/theinnerhour/b2b/components/onboarding/model/OnlineOffering;)V", "getStripDetails", "()Lcom/theinnerhour/b2b/components/onboarding/model/StripDetails;", "setStripDetails", "(Lcom/theinnerhour/b2b/components/onboarding/model/StripDetails;)V", "getUuid", "setUuid", "getVideo", "setVideo", "getVideoThumb", "setVideoThumb", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MatchingProviderList {
    @b("commercials")
    private Commercials commercials;
    @b("domainareas")
    private ArrayList<Domainareas> domainareas;
    @b("earliest_available_date")
    private String earliestAvailableDate;
    @b("earliest_available_datetime")
    private String earliestAvailableDatetime;
    @b("educations")
    private ArrayList<Educations> educations;
    @b("experience")
    private Experience experience;
    @b("firstname")
    private String firstname;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11506id;
    @b("image")
    private String image;
    @b("is_inhouse")
    private boolean isInhouse;
    @b("is_recommended")
    private boolean isRecommended;
    @b("languages")
    private ArrayList<Languages> languages;
    @b("lastname")
    private String lastname;
    @b("offline_offering")
    private ArrayList<OfflineOffering> offlineOffering;
    @b("online_offering")
    private OnlineOffering onlineOffering;
    @b("strip_details")
    private StripDetails stripDetails;
    @b(SessionManager.KEY_UUID)
    private String uuid;
    @b("video")
    private String video;
    @b("video_thumb")
    private String videoThumb;

    public MatchingProviderList(int i6, String str, String str2, String str3, String uuid, boolean z10, boolean z11, ArrayList<Languages> languages, ArrayList<Educations> educations, String str4, String str5, Commercials commercials, ArrayList<OfflineOffering> offlineOffering, OnlineOffering onlineOffering, String str6, String str7, Experience experience, StripDetails stripDetails, ArrayList<Domainareas> domainareas) {
        i.g(uuid, "uuid");
        i.g(languages, "languages");
        i.g(educations, "educations");
        i.g(offlineOffering, "offlineOffering");
        i.g(domainareas, "domainareas");
        this.f11506id = i6;
        this.firstname = str;
        this.lastname = str2;
        this.image = str3;
        this.uuid = uuid;
        this.isInhouse = z10;
        this.isRecommended = z11;
        this.languages = languages;
        this.educations = educations;
        this.video = str4;
        this.videoThumb = str5;
        this.commercials = commercials;
        this.offlineOffering = offlineOffering;
        this.onlineOffering = onlineOffering;
        this.earliestAvailableDate = str6;
        this.earliestAvailableDatetime = str7;
        this.experience = experience;
        this.stripDetails = stripDetails;
        this.domainareas = domainareas;
    }

    public final int component1() {
        return this.f11506id;
    }

    public final String component10() {
        return this.video;
    }

    public final String component11() {
        return this.videoThumb;
    }

    public final Commercials component12() {
        return this.commercials;
    }

    public final ArrayList<OfflineOffering> component13() {
        return this.offlineOffering;
    }

    public final OnlineOffering component14() {
        return this.onlineOffering;
    }

    public final String component15() {
        return this.earliestAvailableDate;
    }

    public final String component16() {
        return this.earliestAvailableDatetime;
    }

    public final Experience component17() {
        return this.experience;
    }

    public final StripDetails component18() {
        return this.stripDetails;
    }

    public final ArrayList<Domainareas> component19() {
        return this.domainareas;
    }

    public final String component2() {
        return this.firstname;
    }

    public final String component3() {
        return this.lastname;
    }

    public final String component4() {
        return this.image;
    }

    public final String component5() {
        return this.uuid;
    }

    public final boolean component6() {
        return this.isInhouse;
    }

    public final boolean component7() {
        return this.isRecommended;
    }

    public final ArrayList<Languages> component8() {
        return this.languages;
    }

    public final ArrayList<Educations> component9() {
        return this.educations;
    }

    public final MatchingProviderList copy(int i6, String str, String str2, String str3, String uuid, boolean z10, boolean z11, ArrayList<Languages> languages, ArrayList<Educations> educations, String str4, String str5, Commercials commercials, ArrayList<OfflineOffering> offlineOffering, OnlineOffering onlineOffering, String str6, String str7, Experience experience, StripDetails stripDetails, ArrayList<Domainareas> domainareas) {
        i.g(uuid, "uuid");
        i.g(languages, "languages");
        i.g(educations, "educations");
        i.g(offlineOffering, "offlineOffering");
        i.g(domainareas, "domainareas");
        return new MatchingProviderList(i6, str, str2, str3, uuid, z10, z11, languages, educations, str4, str5, commercials, offlineOffering, onlineOffering, str6, str7, experience, stripDetails, domainareas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchingProviderList)) {
            return false;
        }
        MatchingProviderList matchingProviderList = (MatchingProviderList) obj;
        if (this.f11506id == matchingProviderList.f11506id && i.b(this.firstname, matchingProviderList.firstname) && i.b(this.lastname, matchingProviderList.lastname) && i.b(this.image, matchingProviderList.image) && i.b(this.uuid, matchingProviderList.uuid) && this.isInhouse == matchingProviderList.isInhouse && this.isRecommended == matchingProviderList.isRecommended && i.b(this.languages, matchingProviderList.languages) && i.b(this.educations, matchingProviderList.educations) && i.b(this.video, matchingProviderList.video) && i.b(this.videoThumb, matchingProviderList.videoThumb) && i.b(this.commercials, matchingProviderList.commercials) && i.b(this.offlineOffering, matchingProviderList.offlineOffering) && i.b(this.onlineOffering, matchingProviderList.onlineOffering) && i.b(this.earliestAvailableDate, matchingProviderList.earliestAvailableDate) && i.b(this.earliestAvailableDatetime, matchingProviderList.earliestAvailableDatetime) && i.b(this.experience, matchingProviderList.experience) && i.b(this.stripDetails, matchingProviderList.stripDetails) && i.b(this.domainareas, matchingProviderList.domainareas)) {
            return true;
        }
        return false;
    }

    public final Commercials getCommercials() {
        return this.commercials;
    }

    public final ArrayList<Domainareas> getDomainareas() {
        return this.domainareas;
    }

    public final String getEarliestAvailableDate() {
        return this.earliestAvailableDate;
    }

    public final String getEarliestAvailableDatetime() {
        return this.earliestAvailableDatetime;
    }

    public final ArrayList<Educations> getEducations() {
        return this.educations;
    }

    public final Experience getExperience() {
        return this.experience;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final int getId() {
        return this.f11506id;
    }

    public final String getImage() {
        return this.image;
    }

    public final ArrayList<Languages> getLanguages() {
        return this.languages;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final ArrayList<OfflineOffering> getOfflineOffering() {
        return this.offlineOffering;
    }

    public final OnlineOffering getOnlineOffering() {
        return this.onlineOffering;
    }

    public final StripDetails getStripDetails() {
        return this.stripDetails;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVideo() {
        return this.video;
    }

    public final String getVideoThumb() {
        return this.videoThumb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int i6 = this.f11506id * 31;
        String str = this.firstname;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        String str2 = this.lastname;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.image;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int c10 = a.c(this.uuid, (i12 + hashCode3) * 31, 31);
        boolean z10 = this.isInhouse;
        int i13 = 1;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (c10 + i14) * 31;
        boolean z11 = this.isRecommended;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        int j10 = c.j(this.educations, c.j(this.languages, (i15 + i13) * 31, 31), 31);
        String str4 = this.video;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i16 = (j10 + hashCode4) * 31;
        String str5 = this.videoThumb;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i17 = (i16 + hashCode5) * 31;
        Commercials commercials = this.commercials;
        if (commercials == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = commercials.hashCode();
        }
        int j11 = c.j(this.offlineOffering, (i17 + hashCode6) * 31, 31);
        OnlineOffering onlineOffering = this.onlineOffering;
        if (onlineOffering == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = onlineOffering.hashCode();
        }
        int i18 = (j11 + hashCode7) * 31;
        String str6 = this.earliestAvailableDate;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        String str7 = this.earliestAvailableDatetime;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i20 = (i19 + hashCode9) * 31;
        Experience experience = this.experience;
        if (experience == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = experience.hashCode();
        }
        int i21 = (i20 + hashCode10) * 31;
        StripDetails stripDetails = this.stripDetails;
        if (stripDetails != null) {
            i10 = stripDetails.hashCode();
        }
        return this.domainareas.hashCode() + ((i21 + i10) * 31);
    }

    public final boolean isInhouse() {
        return this.isInhouse;
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public final void setCommercials(Commercials commercials) {
        this.commercials = commercials;
    }

    public final void setDomainareas(ArrayList<Domainareas> arrayList) {
        i.g(arrayList, "<set-?>");
        this.domainareas = arrayList;
    }

    public final void setEarliestAvailableDate(String str) {
        this.earliestAvailableDate = str;
    }

    public final void setEarliestAvailableDatetime(String str) {
        this.earliestAvailableDatetime = str;
    }

    public final void setEducations(ArrayList<Educations> arrayList) {
        i.g(arrayList, "<set-?>");
        this.educations = arrayList;
    }

    public final void setExperience(Experience experience) {
        this.experience = experience;
    }

    public final void setFirstname(String str) {
        this.firstname = str;
    }

    public final void setId(int i6) {
        this.f11506id = i6;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setInhouse(boolean z10) {
        this.isInhouse = z10;
    }

    public final void setLanguages(ArrayList<Languages> arrayList) {
        i.g(arrayList, "<set-?>");
        this.languages = arrayList;
    }

    public final void setLastname(String str) {
        this.lastname = str;
    }

    public final void setOfflineOffering(ArrayList<OfflineOffering> arrayList) {
        i.g(arrayList, "<set-?>");
        this.offlineOffering = arrayList;
    }

    public final void setOnlineOffering(OnlineOffering onlineOffering) {
        this.onlineOffering = onlineOffering;
    }

    public final void setRecommended(boolean z10) {
        this.isRecommended = z10;
    }

    public final void setStripDetails(StripDetails stripDetails) {
        this.stripDetails = stripDetails;
    }

    public final void setUuid(String str) {
        i.g(str, "<set-?>");
        this.uuid = str;
    }

    public final void setVideo(String str) {
        this.video = str;
    }

    public final void setVideoThumb(String str) {
        this.videoThumb = str;
    }

    public String toString() {
        return "MatchingProviderList(id=" + this.f11506id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + ", image=" + this.image + ", uuid=" + this.uuid + ", isInhouse=" + this.isInhouse + ", isRecommended=" + this.isRecommended + ", languages=" + this.languages + ", educations=" + this.educations + ", video=" + this.video + ", videoThumb=" + this.videoThumb + ", commercials=" + this.commercials + ", offlineOffering=" + this.offlineOffering + ", onlineOffering=" + this.onlineOffering + ", earliestAvailableDate=" + this.earliestAvailableDate + ", earliestAvailableDatetime=" + this.earliestAvailableDatetime + ", experience=" + this.experience + ", stripDetails=" + this.stripDetails + ", domainareas=" + this.domainareas + ')';
    }

    public /* synthetic */ MatchingProviderList(int i6, String str, String str2, String str3, String str4, boolean z10, boolean z11, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, Commercials commercials, ArrayList arrayList3, OnlineOffering onlineOffering, String str7, String str8, Experience experience, StripDetails stripDetails, ArrayList arrayList4, int i10, d dVar) {
        this(i6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? "" : str4, z10, z11, (i10 & 128) != 0 ? new ArrayList() : arrayList, (i10 & 256) != 0 ? new ArrayList() : arrayList2, (i10 & 512) != 0 ? null : str5, (i10 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? null : str6, (i10 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? new Commercials(null, null, null, null, null, null, 63, null) : commercials, (i10 & 4096) != 0 ? new ArrayList() : arrayList3, (i10 & 8192) != 0 ? new OnlineOffering(null, null, null, null, null, 31, null) : onlineOffering, (i10 & 16384) != 0 ? null : str7, (32768 & i10) != 0 ? null : str8, (65536 & i10) != 0 ? new Experience(null, 1, null) : experience, (131072 & i10) != 0 ? new StripDetails(null, null, 3, null) : stripDetails, (i10 & 262144) != 0 ? new ArrayList() : arrayList4);
    }
}
