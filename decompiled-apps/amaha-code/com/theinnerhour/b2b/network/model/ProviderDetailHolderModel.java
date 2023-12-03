package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
/* compiled from: ProviderDetailHolderModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016¢\u0006\u0002\u0010\u0017J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0019\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J³\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u0016HÆ\u0001J\u0013\u0010A\u001a\u00020\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010C\u001a\u00020\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010$R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001f¨\u0006G"}, d2 = {"Lcom/theinnerhour/b2b/network/model/ProviderDetailHolderModel;", "", SessionManager.KEY_UUID, "", "image", SessionManager.KEY_FIRSTNAME, SessionManager.KEY_LASTNAME, "earliestAvailableDateTime", "experience", "Lcom/theinnerhour/b2b/network/model/ProviderDetailExperience;", "stripDetails", "Lcom/theinnerhour/b2b/network/model/ProviderDetailStripDetails;", "coupleStripDetails", "isAvailable", "", "videoLink", "videoThumbnail", "isInHouse", "addonProfileDetails", "Lcom/theinnerhour/b2b/network/model/AddonProfileDetails;", "userPhrases", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/ProviderDetailExperience;Lcom/theinnerhour/b2b/network/model/ProviderDetailStripDetails;Lcom/theinnerhour/b2b/network/model/ProviderDetailStripDetails;ZLjava/lang/String;Ljava/lang/String;ZLcom/theinnerhour/b2b/network/model/AddonProfileDetails;Ljava/util/ArrayList;)V", "getAddonProfileDetails", "()Lcom/theinnerhour/b2b/network/model/AddonProfileDetails;", "setAddonProfileDetails", "(Lcom/theinnerhour/b2b/network/model/AddonProfileDetails;)V", "getCoupleStripDetails", "()Lcom/theinnerhour/b2b/network/model/ProviderDetailStripDetails;", "getEarliestAvailableDateTime", "()Ljava/lang/String;", "getExperience", "()Lcom/theinnerhour/b2b/network/model/ProviderDetailExperience;", "getFirstName", "getImage", "()Z", "getLastName", "providerType", "getProviderType", "setProviderType", "(Ljava/lang/String;)V", "getStripDetails", "getUserPhrases", "()Ljava/util/ArrayList;", "setUserPhrases", "(Ljava/util/ArrayList;)V", "getUuid", "getVideoLink", "getVideoThumbnail", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getName", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderDetailHolderModel {
    @b("addon_profile_details")
    private AddonProfileDetails addonProfileDetails;
    @b("couple_strip_details")
    private final ProviderDetailStripDetails coupleStripDetails;
    @b("earliest_available_datetime")
    private final String earliestAvailableDateTime;
    @b("experience")
    private final ProviderDetailExperience experience;
    @b("firstname")
    private final String firstName;
    @b("image")
    private final String image;
    @b("show_book_cta")
    private final boolean isAvailable;
    @b("is_inhouse")
    private final boolean isInHouse;
    @b("lastname")
    private final String lastName;
    private String providerType;
    @b("strip_details")
    private final ProviderDetailStripDetails stripDetails;
    @b("user_phrases")
    private ArrayList<String> userPhrases;
    @b(SessionManager.KEY_UUID)
    private final String uuid;
    @b("video")
    private final String videoLink;
    @b("video_thumb")
    private final String videoThumbnail;

    public ProviderDetailHolderModel(String uuid, String image, String str, String str2, String earliestAvailableDateTime, ProviderDetailExperience experience, ProviderDetailStripDetails providerDetailStripDetails, ProviderDetailStripDetails providerDetailStripDetails2, boolean z10, String str3, String str4, boolean z11, AddonProfileDetails addonProfileDetails, ArrayList<String> userPhrases) {
        i.g(uuid, "uuid");
        i.g(image, "image");
        i.g(earliestAvailableDateTime, "earliestAvailableDateTime");
        i.g(experience, "experience");
        i.g(userPhrases, "userPhrases");
        this.uuid = uuid;
        this.image = image;
        this.firstName = str;
        this.lastName = str2;
        this.earliestAvailableDateTime = earliestAvailableDateTime;
        this.experience = experience;
        this.stripDetails = providerDetailStripDetails;
        this.coupleStripDetails = providerDetailStripDetails2;
        this.isAvailable = z10;
        this.videoLink = str3;
        this.videoThumbnail = str4;
        this.isInHouse = z11;
        this.addonProfileDetails = addonProfileDetails;
        this.userPhrases = userPhrases;
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component10() {
        return this.videoLink;
    }

    public final String component11() {
        return this.videoThumbnail;
    }

    public final boolean component12() {
        return this.isInHouse;
    }

    public final AddonProfileDetails component13() {
        return this.addonProfileDetails;
    }

    public final ArrayList<String> component14() {
        return this.userPhrases;
    }

    public final String component2() {
        return this.image;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.earliestAvailableDateTime;
    }

    public final ProviderDetailExperience component6() {
        return this.experience;
    }

    public final ProviderDetailStripDetails component7() {
        return this.stripDetails;
    }

    public final ProviderDetailStripDetails component8() {
        return this.coupleStripDetails;
    }

    public final boolean component9() {
        return this.isAvailable;
    }

    public final ProviderDetailHolderModel copy(String uuid, String image, String str, String str2, String earliestAvailableDateTime, ProviderDetailExperience experience, ProviderDetailStripDetails providerDetailStripDetails, ProviderDetailStripDetails providerDetailStripDetails2, boolean z10, String str3, String str4, boolean z11, AddonProfileDetails addonProfileDetails, ArrayList<String> userPhrases) {
        i.g(uuid, "uuid");
        i.g(image, "image");
        i.g(earliestAvailableDateTime, "earliestAvailableDateTime");
        i.g(experience, "experience");
        i.g(userPhrases, "userPhrases");
        return new ProviderDetailHolderModel(uuid, image, str, str2, earliestAvailableDateTime, experience, providerDetailStripDetails, providerDetailStripDetails2, z10, str3, str4, z11, addonProfileDetails, userPhrases);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderDetailHolderModel)) {
            return false;
        }
        ProviderDetailHolderModel providerDetailHolderModel = (ProviderDetailHolderModel) obj;
        if (i.b(this.uuid, providerDetailHolderModel.uuid) && i.b(this.image, providerDetailHolderModel.image) && i.b(this.firstName, providerDetailHolderModel.firstName) && i.b(this.lastName, providerDetailHolderModel.lastName) && i.b(this.earliestAvailableDateTime, providerDetailHolderModel.earliestAvailableDateTime) && i.b(this.experience, providerDetailHolderModel.experience) && i.b(this.stripDetails, providerDetailHolderModel.stripDetails) && i.b(this.coupleStripDetails, providerDetailHolderModel.coupleStripDetails) && this.isAvailable == providerDetailHolderModel.isAvailable && i.b(this.videoLink, providerDetailHolderModel.videoLink) && i.b(this.videoThumbnail, providerDetailHolderModel.videoThumbnail) && this.isInHouse == providerDetailHolderModel.isInHouse && i.b(this.addonProfileDetails, providerDetailHolderModel.addonProfileDetails) && i.b(this.userPhrases, providerDetailHolderModel.userPhrases)) {
            return true;
        }
        return false;
    }

    public final AddonProfileDetails getAddonProfileDetails() {
        return this.addonProfileDetails;
    }

    public final ProviderDetailStripDetails getCoupleStripDetails() {
        return this.coupleStripDetails;
    }

    public final String getEarliestAvailableDateTime() {
        return this.earliestAvailableDateTime;
    }

    public final ProviderDetailExperience getExperience() {
        return this.experience;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        String str = this.firstName;
        boolean z11 = false;
        if (str != null && !n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        String str3 = this.lastName;
        if (!((str3 == null || n.B0(str3)) ? true : true)) {
            str2 = " " + this.lastName;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final String getProviderType() {
        return this.providerType;
    }

    public final ProviderDetailStripDetails getStripDetails() {
        return this.stripDetails;
    }

    public final ArrayList<String> getUserPhrases() {
        return this.userPhrases;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVideoLink() {
        return this.videoLink;
    }

    public final String getVideoThumbnail() {
        return this.videoThumbnail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int c10 = a.c(this.image, this.uuid.hashCode() * 31, 31);
        String str = this.firstName;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (c10 + hashCode) * 31;
        String str2 = this.lastName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode7 = (this.experience.hashCode() + a.c(this.earliestAvailableDateTime, (i10 + hashCode2) * 31, 31)) * 31;
        ProviderDetailStripDetails providerDetailStripDetails = this.stripDetails;
        if (providerDetailStripDetails == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = providerDetailStripDetails.hashCode();
        }
        int i11 = (hashCode7 + hashCode3) * 31;
        ProviderDetailStripDetails providerDetailStripDetails2 = this.coupleStripDetails;
        if (providerDetailStripDetails2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = providerDetailStripDetails2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        boolean z10 = this.isAvailable;
        int i13 = 1;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        String str3 = this.videoLink;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str4 = this.videoThumbnail;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        boolean z11 = this.isInHouse;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        int i18 = (i17 + i13) * 31;
        AddonProfileDetails addonProfileDetails = this.addonProfileDetails;
        if (addonProfileDetails != null) {
            i6 = addonProfileDetails.hashCode();
        }
        return this.userPhrases.hashCode() + ((i18 + i6) * 31);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isInHouse() {
        return this.isInHouse;
    }

    public final void setAddonProfileDetails(AddonProfileDetails addonProfileDetails) {
        this.addonProfileDetails = addonProfileDetails;
    }

    public final void setProviderType(String str) {
        this.providerType = str;
    }

    public final void setUserPhrases(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.userPhrases = arrayList;
    }

    public String toString() {
        return "ProviderDetailHolderModel(uuid=" + this.uuid + ", image=" + this.image + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", earliestAvailableDateTime=" + this.earliestAvailableDateTime + ", experience=" + this.experience + ", stripDetails=" + this.stripDetails + ", coupleStripDetails=" + this.coupleStripDetails + ", isAvailable=" + this.isAvailable + ", videoLink=" + this.videoLink + ", videoThumbnail=" + this.videoThumbnail + ", isInHouse=" + this.isInHouse + ", addonProfileDetails=" + this.addonProfileDetails + ", userPhrases=" + this.userPhrases + ')';
    }

    public /* synthetic */ ProviderDetailHolderModel(String str, String str2, String str3, String str4, String str5, ProviderDetailExperience providerDetailExperience, ProviderDetailStripDetails providerDetailStripDetails, ProviderDetailStripDetails providerDetailStripDetails2, boolean z10, String str6, String str7, boolean z11, AddonProfileDetails addonProfileDetails, ArrayList arrayList, int i6, d dVar) {
        this(str, str2, str3, str4, str5, providerDetailExperience, providerDetailStripDetails, providerDetailStripDetails2, (i6 & 256) != 0 ? false : z10, str6, str7, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? false : z11, (i6 & 4096) != 0 ? new AddonProfileDetails(null, 1, null) : addonProfileDetails, (i6 & 8192) != 0 ? new ArrayList() : arrayList);
    }
}
