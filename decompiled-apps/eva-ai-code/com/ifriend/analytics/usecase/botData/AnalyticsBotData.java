package com.ifriend.analytics.usecase.botData;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsBotData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ifriend/analytics/usecase/botData/AnalyticsBotData;", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "", "ethnicity", "personality", "voice", "(Lcom/ifriend/domain/models/profile/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "getEthnicity", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getPersonality", "getVoice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsBotData {
    private final String birthday;
    private final String ethnicity;
    private final Gender gender;
    private final String personality;
    private final String voice;

    public AnalyticsBotData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AnalyticsBotData copy$default(AnalyticsBotData analyticsBotData, Gender gender, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            gender = analyticsBotData.gender;
        }
        if ((i & 2) != 0) {
            str = analyticsBotData.birthday;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = analyticsBotData.ethnicity;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = analyticsBotData.personality;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = analyticsBotData.voice;
        }
        return analyticsBotData.copy(gender, str5, str6, str7, str4);
    }

    public final Gender component1() {
        return this.gender;
    }

    public final String component2() {
        return this.birthday;
    }

    public final String component3() {
        return this.ethnicity;
    }

    public final String component4() {
        return this.personality;
    }

    public final String component5() {
        return this.voice;
    }

    public final AnalyticsBotData copy(Gender gender, String str, String str2, String str3, String str4) {
        return new AnalyticsBotData(gender, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsBotData) {
            AnalyticsBotData analyticsBotData = (AnalyticsBotData) obj;
            return this.gender == analyticsBotData.gender && Intrinsics.areEqual(this.birthday, analyticsBotData.birthday) && Intrinsics.areEqual(this.ethnicity, analyticsBotData.ethnicity) && Intrinsics.areEqual(this.personality, analyticsBotData.personality) && Intrinsics.areEqual(this.voice, analyticsBotData.voice);
        }
        return false;
    }

    public int hashCode() {
        Gender gender = this.gender;
        int hashCode = (gender == null ? 0 : gender.hashCode()) * 31;
        String str = this.birthday;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ethnicity;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.personality;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voice;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Gender gender = this.gender;
        String str = this.birthday;
        String str2 = this.ethnicity;
        String str3 = this.personality;
        String str4 = this.voice;
        return "AnalyticsBotData(gender=" + gender + ", birthday=" + str + ", ethnicity=" + str2 + ", personality=" + str3 + ", voice=" + str4 + ")";
    }

    public AnalyticsBotData(Gender gender, String str, String str2, String str3, String str4) {
        this.gender = gender;
        this.birthday = str;
        this.ethnicity = str2;
        this.personality = str3;
        this.voice = str4;
    }

    public /* synthetic */ AnalyticsBotData(Gender gender, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gender, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getEthnicity() {
        return this.ethnicity;
    }

    public final String getPersonality() {
        return this.personality;
    }

    public final String getVoice() {
        return this.voice;
    }
}
