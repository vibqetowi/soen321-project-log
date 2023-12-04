package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.AvatarGenerated;
import com.ifriend.domain.notifications.LongTermNotification;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/TypeEnum;", "", "(Ljava/lang/String;I)V", "getNotificationClass", "Ljava/lang/Class;", "Lcom/ifriend/domain/notifications/LongTermNotification;", "AVATAR_GENERATED_TYPE", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypeEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeEnum[] $VALUES;
    public static final TypeEnum AVATAR_GENERATED_TYPE = new TypeEnum("AVATAR_GENERATED_TYPE", 0);
    public static final Companion Companion;

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeEnum.values().length];
            try {
                iArr[TypeEnum.AVATAR_GENERATED_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TypeEnum[] $values() {
        return new TypeEnum[]{AVATAR_GENERATED_TYPE};
    }

    public static EnumEntries<TypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static TypeEnum valueOf(String str) {
        return (TypeEnum) Enum.valueOf(TypeEnum.class, str);
    }

    public static TypeEnum[] values() {
        return (TypeEnum[]) $VALUES.clone();
    }

    private TypeEnum(String str, int i) {
    }

    static {
        TypeEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    public final Class<? extends LongTermNotification> getNotificationClass() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            return AvatarGenerated.class;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/TypeEnum$Companion;", "", "()V", "getTypeEnum", "Lcom/ifriend/long_term_notifications/impl/TypeEnum;", "Lcom/ifriend/domain/notifications/LongTermNotification;", "getTypeEnum$impl_release", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TypeEnum getTypeEnum$impl_release(LongTermNotification longTermNotification) {
            Intrinsics.checkNotNullParameter(longTermNotification, "<this>");
            if (longTermNotification instanceof AvatarGenerated) {
                return TypeEnum.AVATAR_GENERATED_TYPE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
