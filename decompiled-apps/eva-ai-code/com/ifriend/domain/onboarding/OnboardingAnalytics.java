package com.ifriend.domain.onboarding;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.onboarding.AiCharacter;
import com.ifriend.domain.models.onboarding.AiVoice;
import com.ifriend.domain.models.onboarding.FavoriteTopic;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import java.util.List;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingAnalytics.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0012\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010,\u001a\u00020\u0003H&¨\u0006-"}, d2 = {"Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "", "favoriteTopic", "", "topic", "Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "trackAiAge", "age", "", "trackAiCharacter", "aiCharacter", "Lcom/ifriend/domain/models/onboarding/AiCharacter;", "trackAiEthnicity", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "trackAiGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "trackAiName", "name", "", "trackAiPersonality", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "trackAiVoice", "aiVoice", "Lcom/ifriend/domain/models/onboarding/AiVoice;", "trackInfoStep", "trackInterests", "interests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "trackJokes", "retention", "", "trackKnowMore", "trackLastStep", "trackRetention", "trackSelectBot", "botName", "userId", "trackUserAge", "trackUserGender", "trackUserName", "trackWelcomeStep", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingAnalytics {
    void favoriteTopic(FavoriteTopic favoriteTopic);

    void trackAiAge(int i);

    void trackAiCharacter(AiCharacter aiCharacter);

    void trackAiEthnicity(Ethnicity ethnicity);

    void trackAiGender(Gender gender);

    void trackAiName(String str);

    void trackAiPersonality(Personality personality);

    void trackAiVoice(AiVoice aiVoice);

    void trackInfoStep();

    void trackInterests(List<? extends ChatInterestsType> list);

    void trackJokes(boolean z);

    void trackKnowMore();

    void trackLastStep();

    void trackRetention(boolean z);

    void trackSelectBot(String str, String str2);

    void trackUserAge(int i);

    void trackUserGender(Gender gender);

    void trackUserName(String str);

    void trackWelcomeStep();

    /* compiled from: OnboardingAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void trackAiPersonality$default(OnboardingAnalytics onboardingAnalytics, Personality personality, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAiPersonality");
            }
            if ((i & 1) != 0) {
                personality = Personality.FLIRTY;
            }
            onboardingAnalytics.trackAiPersonality(personality);
        }
    }
}
