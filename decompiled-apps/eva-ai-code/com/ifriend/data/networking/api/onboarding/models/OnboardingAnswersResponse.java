package com.ifriend.data.networking.api.onboarding.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingAnswersResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jh\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006&"}, d2 = {"Lcom/ifriend/data/networking/api/onboarding/models/OnboardingAnswersResponse;", "", "retention", "", "jokes", "aiVoice", "", "favoriteTopic", "aiCharacter", "interests", "", "selectedBot", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAiCharacter", "()Ljava/lang/String;", "getAiVoice", "getFavoriteTopic", "getInterests", "()Ljava/util/List;", "getJokes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRetention", "getSelectedBot", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/ifriend/data/networking/api/onboarding/models/OnboardingAnswersResponse;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingAnswersResponse {
    private final String aiCharacter;
    private final String aiVoice;
    private final String favoriteTopic;
    private final List<String> interests;
    private final Boolean jokes;
    private final Boolean retention;
    @SerializedName("selectedBot")
    private final String selectedBot;

    public static /* synthetic */ OnboardingAnswersResponse copy$default(OnboardingAnswersResponse onboardingAnswersResponse, Boolean bool, Boolean bool2, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onboardingAnswersResponse.retention;
        }
        if ((i & 2) != 0) {
            bool2 = onboardingAnswersResponse.jokes;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            str = onboardingAnswersResponse.aiVoice;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = onboardingAnswersResponse.favoriteTopic;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = onboardingAnswersResponse.aiCharacter;
        }
        String str7 = str3;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onboardingAnswersResponse.interests;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str4 = onboardingAnswersResponse.selectedBot;
        }
        return onboardingAnswersResponse.copy(bool, bool3, str5, str6, str7, list3, str4);
    }

    public final Boolean component1() {
        return this.retention;
    }

    public final Boolean component2() {
        return this.jokes;
    }

    public final String component3() {
        return this.aiVoice;
    }

    public final String component4() {
        return this.favoriteTopic;
    }

    public final String component5() {
        return this.aiCharacter;
    }

    public final List<String> component6() {
        return this.interests;
    }

    public final String component7() {
        return this.selectedBot;
    }

    public final OnboardingAnswersResponse copy(Boolean bool, Boolean bool2, String str, String str2, String str3, List<String> list, String str4) {
        return new OnboardingAnswersResponse(bool, bool2, str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingAnswersResponse) {
            OnboardingAnswersResponse onboardingAnswersResponse = (OnboardingAnswersResponse) obj;
            return Intrinsics.areEqual(this.retention, onboardingAnswersResponse.retention) && Intrinsics.areEqual(this.jokes, onboardingAnswersResponse.jokes) && Intrinsics.areEqual(this.aiVoice, onboardingAnswersResponse.aiVoice) && Intrinsics.areEqual(this.favoriteTopic, onboardingAnswersResponse.favoriteTopic) && Intrinsics.areEqual(this.aiCharacter, onboardingAnswersResponse.aiCharacter) && Intrinsics.areEqual(this.interests, onboardingAnswersResponse.interests) && Intrinsics.areEqual(this.selectedBot, onboardingAnswersResponse.selectedBot);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.retention;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.jokes;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.aiVoice;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.favoriteTopic;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.aiCharacter;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.interests;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.selectedBot;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.retention;
        Boolean bool2 = this.jokes;
        String str = this.aiVoice;
        String str2 = this.favoriteTopic;
        String str3 = this.aiCharacter;
        List<String> list = this.interests;
        String str4 = this.selectedBot;
        return "OnboardingAnswersResponse(retention=" + bool + ", jokes=" + bool2 + ", aiVoice=" + str + ", favoriteTopic=" + str2 + ", aiCharacter=" + str3 + ", interests=" + list + ", selectedBot=" + str4 + ")";
    }

    public OnboardingAnswersResponse(Boolean bool, Boolean bool2, String str, String str2, String str3, List<String> list, String str4) {
        this.retention = bool;
        this.jokes = bool2;
        this.aiVoice = str;
        this.favoriteTopic = str2;
        this.aiCharacter = str3;
        this.interests = list;
        this.selectedBot = str4;
    }

    public final Boolean getRetention() {
        return this.retention;
    }

    public final Boolean getJokes() {
        return this.jokes;
    }

    public final String getAiVoice() {
        return this.aiVoice;
    }

    public final String getFavoriteTopic() {
        return this.favoriteTopic;
    }

    public final String getAiCharacter() {
        return this.aiCharacter;
    }

    public final List<String> getInterests() {
        return this.interests;
    }

    public final String getSelectedBot() {
        return this.selectedBot;
    }
}
