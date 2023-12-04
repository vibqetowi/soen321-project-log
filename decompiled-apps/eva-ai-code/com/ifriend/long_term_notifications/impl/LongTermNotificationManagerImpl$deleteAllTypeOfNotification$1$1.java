package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.LongTermNotification;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LongTermNotificationManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/domain/notifications/LongTermNotification;", "invoke", "(Lcom/ifriend/domain/notifications/LongTermNotification;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LongTermNotificationManagerImpl$deleteAllTypeOfNotification$1$1 extends Lambda implements Function1<LongTermNotification, Boolean> {
    final /* synthetic */ Class<? extends LongTermNotification> $classType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTermNotificationManagerImpl$deleteAllTypeOfNotification$1$1(Class<? extends LongTermNotification> cls) {
        super(1);
        this.$classType = cls;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LongTermNotification it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.getClass().getSimpleName(), this.$classType.getSimpleName()));
    }
}
