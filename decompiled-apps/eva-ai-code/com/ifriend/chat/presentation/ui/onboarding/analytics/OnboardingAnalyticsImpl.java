package com.ifriend.chat.presentation.ui.onboarding.analytics;

import androidx.autofill.HintConstants;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.domain.models.common.ChatInterestsType;
import com.ifriend.domain.models.onboarding.AiCharacter;
import com.ifriend.domain.models.onboarding.AiVoice;
import com.ifriend.domain.models.onboarding.FavoriteTopic;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016J\u001c\u0010$\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010&\u001a\u00020\fH\u0016J\u0016\u0010'\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020-H\u0016J\u0018\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u001dH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u00106\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u00107\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u00108\u001a\u00020\fH\u0016J\f\u00109\u001a\u00020\u001d*\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006;"}, d2 = {"Lcom/ifriend/chat/presentation/ui/onboarding/analytics/OnboardingAnalyticsImpl;", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "favoriteTopic", "", "topic", "Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "trackAiAge", "age", "", "trackAiCharacter", "aiCharacter", "Lcom/ifriend/domain/models/onboarding/AiCharacter;", "trackAiEthnicity", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "trackAiGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "trackAiName", "name", "", "trackAiPersonality", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "trackAiVoice", "aiVoice", "Lcom/ifriend/domain/models/onboarding/AiVoice;", "trackEvent", "value", "trackInfoStep", "trackInterests", "interests", "", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "trackJokes", "jokes", "", "trackKnowMore", "trackLastStep", "trackRetention", "retention", "trackSelectBot", "botName", "userId", "trackUserAge", "trackUserGender", "trackUserName", "trackWelcomeStep", "enumToText", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingAnalyticsImpl implements OnboardingAnalytics {
    @Deprecated
    public static final String GENDER_FEMALE = "fem";
    @Deprecated
    public static final String GENDER_MALE = "mal";
    private final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();
    private final Lazy tracker$delegate = LazyKt.lazy(new OnboardingAnalyticsImpl$tracker$2(this));
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OnboardingAnalyticsImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OnboardingAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/presentation/ui/onboarding/analytics/OnboardingAnalyticsImpl$Companion;", "", "()V", "GENDER_FEMALE", "", "GENDER_MALE", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) this.tracker$delegate.getValue();
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiGender(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        trackEvent("ai-gender", gender == Gender.MALE ? GENDER_MALE : GENDER_FEMALE);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        trackEvent("ai-name", name);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiAge(int i) {
        trackEvent("ai-age", String.valueOf(i));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiEthnicity(Ethnicity ethnicity) {
        Intrinsics.checkNotNullParameter(ethnicity, "ethnicity");
        trackEvent("ai-ethnicity", enumToText(ethnicity.name()));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiPersonality(Personality personality) {
        Intrinsics.checkNotNullParameter(personality, "personality");
        String lowerCase = enumToText(personality.name()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        trackEvent("ai-personality", lowerCase);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackUserName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        trackEvent("user-name", name);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackUserAge(int i) {
        trackEvent("user-age", String.valueOf(i));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackUserGender(Gender gender) {
        String str;
        Intrinsics.checkNotNullParameter(gender, "gender");
        int i = WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        if (i == 1) {
            str = GENDER_MALE;
        } else if (i == 2) {
            str = GENDER_FEMALE;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "other";
        }
        trackEvent("user-gender", str);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackSelectBot(String botName, String userId) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        trackEvent("ai-avatar", botName);
        trackEvent("ai-avatar-userid", userId);
    }

    private final String enumToText(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(lowerCase.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb.append((Object) upperCase);
            String substring = lowerCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return lowerCase;
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackInfoStep() {
        getTracker().sendEvent("onboarding-info-part-screen-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiCharacter(AiCharacter aiCharacter) {
        Intrinsics.checkNotNullParameter(aiCharacter, "aiCharacter");
        trackEvent("perfect-partner", aiCharacter.name());
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackAiVoice(AiVoice aiVoice) {
        Intrinsics.checkNotNullParameter(aiVoice, "aiVoice");
        trackEvent("voice", aiVoice.name());
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackWelcomeStep() {
        trackEvent$default(this, "social-proof", null, 2, null);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackKnowMore() {
        trackEvent$default(this, "know-more", null, 2, null);
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackRetention(boolean z) {
        trackEvent("q-frequency", String.valueOf(z));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackJokes(boolean z) {
        trackEvent("spicy-jokes", String.valueOf(z));
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void favoriteTopic(FavoriteTopic topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        trackEvent("talk-about", topic.name());
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackInterests(List<? extends ChatInterestsType> interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        String joinToString$default = CollectionsKt.joinToString$default(interests, null, null, null, 0, null, OnboardingAnalyticsImpl$trackInterests$interestsValue$1.INSTANCE, 31, null);
        trackEvent("interests", "[" + joinToString$default + "]");
    }

    @Override // com.ifriend.domain.onboarding.OnboardingAnalytics
    public void trackLastStep() {
        trackEvent$default(this, "tell-more", null, 2, null);
    }

    static /* synthetic */ void trackEvent$default(OnboardingAnalyticsImpl onboardingAnalyticsImpl, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        onboardingAnalyticsImpl.trackEvent(str, str2);
    }

    private final void trackEvent(String str, String str2) {
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to("step-name", str));
        if (str2 != null) {
            mutableMapOf.put("value", str2);
        }
        getTracker().sendEvent("onboarding-steps-ai", mutableMapOf);
    }
}
