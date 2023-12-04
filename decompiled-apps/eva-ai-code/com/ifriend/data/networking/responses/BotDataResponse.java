package com.ifriend.data.networking.responses;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BotDataResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ifriend/data/networking/responses/BotDataResponse;", "", "name", "", HintConstants.AUTOFILL_HINT_GENDER, "birthday", "ethnicity", "personality", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "getEthnicity", "getGender", "getName", "getPersonality", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotDataResponse {
    private final String birthday;
    private final String ethnicity;
    private final String gender;
    private final String name;
    private final String personality;

    public static /* synthetic */ BotDataResponse copy$default(BotDataResponse botDataResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botDataResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = botDataResponse.gender;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = botDataResponse.birthday;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = botDataResponse.ethnicity;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = botDataResponse.personality;
        }
        return botDataResponse.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.birthday;
    }

    public final String component4() {
        return this.ethnicity;
    }

    public final String component5() {
        return this.personality;
    }

    public final BotDataResponse copy(String str, String str2, String str3, String str4, String str5) {
        return new BotDataResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BotDataResponse) {
            BotDataResponse botDataResponse = (BotDataResponse) obj;
            return Intrinsics.areEqual(this.name, botDataResponse.name) && Intrinsics.areEqual(this.gender, botDataResponse.gender) && Intrinsics.areEqual(this.birthday, botDataResponse.birthday) && Intrinsics.areEqual(this.ethnicity, botDataResponse.ethnicity) && Intrinsics.areEqual(this.personality, botDataResponse.personality);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthday;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ethnicity;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.personality;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.gender;
        String str3 = this.birthday;
        String str4 = this.ethnicity;
        String str5 = this.personality;
        return "BotDataResponse(name=" + str + ", gender=" + str2 + ", birthday=" + str3 + ", ethnicity=" + str4 + ", personality=" + str5 + ")";
    }

    public BotDataResponse(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.gender = str2;
        this.birthday = str3;
        this.ethnicity = str4;
        this.personality = str5;
    }

    public final String getName() {
        return this.name;
    }

    public final String getGender() {
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
}
