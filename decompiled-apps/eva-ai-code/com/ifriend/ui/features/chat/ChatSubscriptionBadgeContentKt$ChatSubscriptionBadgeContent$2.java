package com.ifriend.ui.features.chat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionBadgeContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatSubscriptionBadgeContentKt$ChatSubscriptionBadgeContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ String $chatName;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isVerified;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ String $subscriptionStatusLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionBadgeContentKt$ChatSubscriptionBadgeContent$2(Modifier modifier, String str, String str2, boolean z, boolean z2, long j, Function0<Unit> function0, Shape shape, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$chatName = str;
        this.$subscriptionStatusLabel = str2;
        this.$isVerified = z;
        this.$enabled = z2;
        this.$backgroundColor = j;
        this.$onClick = function0;
        this.$shape = shape;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatSubscriptionBadgeContentKt.m7075ChatSubscriptionBadgeContent1YH7lEI(this.$modifier, this.$chatName, this.$subscriptionStatusLabel, this.$isVerified, this.$enabled, this.$backgroundColor, this.$onClick, this.$shape, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
