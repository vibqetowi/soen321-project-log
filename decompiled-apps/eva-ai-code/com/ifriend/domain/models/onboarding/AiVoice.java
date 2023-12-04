package com.ifriend.domain.models.onboarding;

import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotVoiceViewModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AiVoice.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/onboarding/AiVoice;", "", "(Ljava/lang/String;I)V", "spicy", OnboardingBotVoiceViewModel.SPICY_BUTTON_ID, OnboardingBotVoiceViewModel.FORMAL_BUTTON_ID, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AiVoice {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AiVoice[] $VALUES;
    public static final AiVoice spicy = new AiVoice("spicy", 0);
    public static final AiVoice sexual = new AiVoice(OnboardingBotVoiceViewModel.SPICY_BUTTON_ID, 1);
    public static final AiVoice formal = new AiVoice(OnboardingBotVoiceViewModel.FORMAL_BUTTON_ID, 2);

    private static final /* synthetic */ AiVoice[] $values() {
        return new AiVoice[]{spicy, sexual, formal};
    }

    public static EnumEntries<AiVoice> getEntries() {
        return $ENTRIES;
    }

    public static AiVoice valueOf(String str) {
        return (AiVoice) Enum.valueOf(AiVoice.class, str);
    }

    public static AiVoice[] values() {
        return (AiVoice[]) $VALUES.clone();
    }

    private AiVoice(String str, int i) {
    }

    static {
        AiVoice[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
