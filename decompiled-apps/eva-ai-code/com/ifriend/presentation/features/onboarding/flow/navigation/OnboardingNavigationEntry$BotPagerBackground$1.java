package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$BotPagerBackground$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $avatar;
    final /* synthetic */ float $avatarOffset;
    final /* synthetic */ boolean $isVisibleBackground;
    final /* synthetic */ OnboardingNavigationEntry $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNavigationEntry$BotPagerBackground$1(OnboardingNavigationEntry onboardingNavigationEntry, boolean z, float f, String str, int i) {
        super(2);
        this.$tmp0_rcvr = onboardingNavigationEntry;
        this.$isVisibleBackground = z;
        this.$avatarOffset = f;
        this.$avatar = str;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.BotPagerBackground(this.$isVisibleBackground, this.$avatarOffset, this.$avatar, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
