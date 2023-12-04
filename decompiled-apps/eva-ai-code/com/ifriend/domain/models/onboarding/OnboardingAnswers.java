package com.ifriend.domain.models.onboarding;

import com.ifriend.domain.models.common.ChatInterestsType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingAnswers.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jh\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "", "retention", "", "jokes", "aiVoice", "Lcom/ifriend/domain/models/onboarding/AiVoice;", "favoriteTopic", "Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "aiCharacter", "Lcom/ifriend/domain/models/onboarding/AiCharacter;", "interests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "selectedBot", "", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ifriend/domain/models/onboarding/AiVoice;Lcom/ifriend/domain/models/onboarding/FavoriteTopic;Lcom/ifriend/domain/models/onboarding/AiCharacter;Ljava/util/List;Ljava/lang/String;)V", "getAiCharacter", "()Lcom/ifriend/domain/models/onboarding/AiCharacter;", "getAiVoice", "()Lcom/ifriend/domain/models/onboarding/AiVoice;", "getFavoriteTopic", "()Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "getInterests", "()Ljava/util/List;", "getJokes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRetention", "getSelectedBot", "()Ljava/lang/String;", "setSelectedBot", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ifriend/domain/models/onboarding/AiVoice;Lcom/ifriend/domain/models/onboarding/FavoriteTopic;Lcom/ifriend/domain/models/onboarding/AiCharacter;Ljava/util/List;Ljava/lang/String;)Lcom/ifriend/domain/models/onboarding/OnboardingAnswers;", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingAnswers {
    private final AiCharacter aiCharacter;
    private final AiVoice aiVoice;
    private final FavoriteTopic favoriteTopic;
    private final List<ChatInterestsType> interests;
    private final Boolean jokes;
    private final Boolean retention;
    private String selectedBot;

    public static /* synthetic */ OnboardingAnswers copy$default(OnboardingAnswers onboardingAnswers, Boolean bool, Boolean bool2, AiVoice aiVoice, FavoriteTopic favoriteTopic, AiCharacter aiCharacter, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onboardingAnswers.retention;
        }
        if ((i & 2) != 0) {
            bool2 = onboardingAnswers.jokes;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            aiVoice = onboardingAnswers.aiVoice;
        }
        AiVoice aiVoice2 = aiVoice;
        if ((i & 8) != 0) {
            favoriteTopic = onboardingAnswers.favoriteTopic;
        }
        FavoriteTopic favoriteTopic2 = favoriteTopic;
        if ((i & 16) != 0) {
            aiCharacter = onboardingAnswers.aiCharacter;
        }
        AiCharacter aiCharacter2 = aiCharacter;
        List<ChatInterestsType> list2 = list;
        if ((i & 32) != 0) {
            list2 = onboardingAnswers.interests;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str = onboardingAnswers.selectedBot;
        }
        return onboardingAnswers.copy(bool, bool3, aiVoice2, favoriteTopic2, aiCharacter2, list3, str);
    }

    public final Boolean component1() {
        return this.retention;
    }

    public final Boolean component2() {
        return this.jokes;
    }

    public final AiVoice component3() {
        return this.aiVoice;
    }

    public final FavoriteTopic component4() {
        return this.favoriteTopic;
    }

    public final AiCharacter component5() {
        return this.aiCharacter;
    }

    public final List<ChatInterestsType> component6() {
        return this.interests;
    }

    public final String component7() {
        return this.selectedBot;
    }

    public final OnboardingAnswers copy(Boolean bool, Boolean bool2, AiVoice aiVoice, FavoriteTopic favoriteTopic, AiCharacter aiCharacter, List<? extends ChatInterestsType> list, String str) {
        return new OnboardingAnswers(bool, bool2, aiVoice, favoriteTopic, aiCharacter, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingAnswers) {
            OnboardingAnswers onboardingAnswers = (OnboardingAnswers) obj;
            return Intrinsics.areEqual(this.retention, onboardingAnswers.retention) && Intrinsics.areEqual(this.jokes, onboardingAnswers.jokes) && this.aiVoice == onboardingAnswers.aiVoice && this.favoriteTopic == onboardingAnswers.favoriteTopic && this.aiCharacter == onboardingAnswers.aiCharacter && Intrinsics.areEqual(this.interests, onboardingAnswers.interests) && Intrinsics.areEqual(this.selectedBot, onboardingAnswers.selectedBot);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.retention;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.jokes;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AiVoice aiVoice = this.aiVoice;
        int hashCode3 = (hashCode2 + (aiVoice == null ? 0 : aiVoice.hashCode())) * 31;
        FavoriteTopic favoriteTopic = this.favoriteTopic;
        int hashCode4 = (hashCode3 + (favoriteTopic == null ? 0 : favoriteTopic.hashCode())) * 31;
        AiCharacter aiCharacter = this.aiCharacter;
        int hashCode5 = (hashCode4 + (aiCharacter == null ? 0 : aiCharacter.hashCode())) * 31;
        List<ChatInterestsType> list = this.interests;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.selectedBot;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.retention;
        Boolean bool2 = this.jokes;
        AiVoice aiVoice = this.aiVoice;
        FavoriteTopic favoriteTopic = this.favoriteTopic;
        AiCharacter aiCharacter = this.aiCharacter;
        List<ChatInterestsType> list = this.interests;
        String str = this.selectedBot;
        return "OnboardingAnswers(retention=" + bool + ", jokes=" + bool2 + ", aiVoice=" + aiVoice + ", favoriteTopic=" + favoriteTopic + ", aiCharacter=" + aiCharacter + ", interests=" + list + ", selectedBot=" + str + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingAnswers(Boolean bool, Boolean bool2, AiVoice aiVoice, FavoriteTopic favoriteTopic, AiCharacter aiCharacter, List<? extends ChatInterestsType> list, String str) {
        this.retention = bool;
        this.jokes = bool2;
        this.aiVoice = aiVoice;
        this.favoriteTopic = favoriteTopic;
        this.aiCharacter = aiCharacter;
        this.interests = list;
        this.selectedBot = str;
    }

    public /* synthetic */ OnboardingAnswers(Boolean bool, Boolean bool2, AiVoice aiVoice, FavoriteTopic favoriteTopic, AiCharacter aiCharacter, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, aiVoice, favoriteTopic, aiCharacter, list, (i & 64) != 0 ? null : str);
    }

    public final Boolean getRetention() {
        return this.retention;
    }

    public final Boolean getJokes() {
        return this.jokes;
    }

    public final AiVoice getAiVoice() {
        return this.aiVoice;
    }

    public final FavoriteTopic getFavoriteTopic() {
        return this.favoriteTopic;
    }

    public final AiCharacter getAiCharacter() {
        return this.aiCharacter;
    }

    public final List<ChatInterestsType> getInterests() {
        return this.interests;
    }

    public final String getSelectedBot() {
        return this.selectedBot;
    }

    public final void setSelectedBot(String str) {
        this.selectedBot = str;
    }
}
