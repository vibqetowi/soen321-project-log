package com.ifriend.ui.features.purchases;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Purchase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseKt$PurchaseScreenFooter$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onPrivacyClick;
    final /* synthetic */ Function0<Unit> $onRestorePurchaseClick;
    final /* synthetic */ Function0<Unit> $onTermsClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseKt$PurchaseScreenFooter$2(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$onTermsClick = function0;
        this.$onPrivacyClick = function02;
        this.$onRestorePurchaseClick = function03;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        PurchaseKt.PurchaseScreenFooter(this.$modifier, this.$onTermsClick, this.$onPrivacyClick, this.$onRestorePurchaseClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
