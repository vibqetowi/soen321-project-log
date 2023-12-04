package com.ifriend.chat.presentation.ui.infoOnboarding.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoOnboardingAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingAction;", "", "(Ljava/lang/String;I)V", "Yes", "No", "Allow", "Deny", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InfoOnboardingAction[] $VALUES;
    public static final InfoOnboardingAction Yes = new InfoOnboardingAction("Yes", 0);
    public static final InfoOnboardingAction No = new InfoOnboardingAction("No", 1);
    public static final InfoOnboardingAction Allow = new InfoOnboardingAction("Allow", 2);
    public static final InfoOnboardingAction Deny = new InfoOnboardingAction("Deny", 3);

    private static final /* synthetic */ InfoOnboardingAction[] $values() {
        return new InfoOnboardingAction[]{Yes, No, Allow, Deny};
    }

    public static EnumEntries<InfoOnboardingAction> getEntries() {
        return $ENTRIES;
    }

    public static InfoOnboardingAction valueOf(String str) {
        return (InfoOnboardingAction) Enum.valueOf(InfoOnboardingAction.class, str);
    }

    public static InfoOnboardingAction[] values() {
        return (InfoOnboardingAction[]) $VALUES.clone();
    }

    private InfoOnboardingAction(String str, int i) {
    }

    static {
        InfoOnboardingAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
