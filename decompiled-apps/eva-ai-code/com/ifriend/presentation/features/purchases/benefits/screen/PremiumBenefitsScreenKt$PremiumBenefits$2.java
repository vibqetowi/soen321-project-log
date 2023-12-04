package com.ifriend.presentation.features.purchases.benefits.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PremiumBenefitsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumBenefitsScreenKt$PremiumBenefits$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ImmutableList<SubscriptionBenefitsGroupUiParams> $benefits;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ String $screenTitle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBenefitsScreenKt$PremiumBenefits$2(String str, ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList, Function0<Unit> function0, Modifier modifier, int i, int i2) {
        super(2);
        this.$screenTitle = str;
        this.$benefits = immutableList;
        this.$onBackClick = function0;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PremiumBenefitsScreenKt.PremiumBenefits(this.$screenTitle, this.$benefits, this.$onBackClick, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
