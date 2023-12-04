package com.ifriend.ui.features.avatar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AvatarContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvatarContentKt$AnimatedAvatar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onGenerationClick;
    final /* synthetic */ Function0<Unit> $onPauseClick;
    final /* synthetic */ Function0<Unit> $onPlayClick;
    final /* synthetic */ AnimatedAvatarViewState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarContentKt$AnimatedAvatar$3(AnimatedAvatarViewState animatedAvatarViewState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Modifier modifier, int i, int i2) {
        super(2);
        this.$state = animatedAvatarViewState;
        this.$onGenerationClick = function0;
        this.$onPlayClick = function02;
        this.$onPauseClick = function03;
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
        AvatarContentKt.AnimatedAvatar(this.$state, this.$onGenerationClick, this.$onPlayClick, this.$onPauseClick, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
