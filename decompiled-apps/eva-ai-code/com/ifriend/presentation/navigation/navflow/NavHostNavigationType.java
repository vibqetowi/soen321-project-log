package com.ifriend.presentation.navigation.navflow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavHostNavigationType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;", "", "(Ljava/lang/String;I)V", "ONBOARDING", "CHAT_CALL", "BENEFITS", "CHAT_SUBSCRIPTION", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavHostNavigationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavHostNavigationType[] $VALUES;
    public static final NavHostNavigationType ONBOARDING = new NavHostNavigationType("ONBOARDING", 0);
    public static final NavHostNavigationType CHAT_CALL = new NavHostNavigationType("CHAT_CALL", 1);
    public static final NavHostNavigationType BENEFITS = new NavHostNavigationType("BENEFITS", 2);
    public static final NavHostNavigationType CHAT_SUBSCRIPTION = new NavHostNavigationType("CHAT_SUBSCRIPTION", 3);

    private static final /* synthetic */ NavHostNavigationType[] $values() {
        return new NavHostNavigationType[]{ONBOARDING, CHAT_CALL, BENEFITS, CHAT_SUBSCRIPTION};
    }

    public static EnumEntries<NavHostNavigationType> getEntries() {
        return $ENTRIES;
    }

    public static NavHostNavigationType valueOf(String str) {
        return (NavHostNavigationType) Enum.valueOf(NavHostNavigationType.class, str);
    }

    public static NavHostNavigationType[] values() {
        return (NavHostNavigationType[]) $VALUES.clone();
    }

    private NavHostNavigationType(String str, int i) {
    }

    static {
        NavHostNavigationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
