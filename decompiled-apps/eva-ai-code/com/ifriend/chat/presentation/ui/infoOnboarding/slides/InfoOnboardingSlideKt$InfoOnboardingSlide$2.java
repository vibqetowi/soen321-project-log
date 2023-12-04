package com.ifriend.chat.presentation.ui.infoOnboarding.slides;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfoOnboardingSlide.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideKt$InfoOnboardingSlide$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $cardTopExternalPadding;
    final /* synthetic */ float $cartTopInternalPadding;
    final /* synthetic */ String $description;
    final /* synthetic */ Function2<Composer, Integer, Unit> $header;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onNegativeButtonClick;
    final /* synthetic */ Function0<Unit> $onPositiveButtonClick;
    final /* synthetic */ String $positiveButtonText;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfoOnboardingSlideKt$InfoOnboardingSlide$2(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, String str, String str2, String str3, Function2<? super Composer, ? super Integer, Unit> function2, float f, float f2, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$onPositiveButtonClick = function0;
        this.$onNegativeButtonClick = function02;
        this.$title = str;
        this.$description = str2;
        this.$positiveButtonText = str3;
        this.$header = function2;
        this.$cartTopInternalPadding = f;
        this.$cardTopExternalPadding = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        InfoOnboardingSlideKt.m6833InfoOnboardingSlideHXNGIdc(this.$modifier, this.$onPositiveButtonClick, this.$onNegativeButtonClick, this.$title, this.$description, this.$positiveButtonText, this.$header, this.$cartTopInternalPadding, this.$cardTopExternalPadding, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
