package com.ifriend.ui.features.chat;

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
/* compiled from: ChatHeaderContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatHeaderContentKt$ChatHeaderTitleContent$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ AnimatedAvatarViewState $animatedAvatarState;
    final /* synthetic */ boolean $isVisibleLvlProgress;
    final /* synthetic */ boolean $isVisibleUpdateIndicator;
    final /* synthetic */ boolean $isVisibleVerified;
    final /* synthetic */ String $lvlLabel;
    final /* synthetic */ float $lvlProgress;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onAvatarClick;
    final /* synthetic */ Function0<Unit> $onGenerationClick;
    final /* synthetic */ Function0<Unit> $onPauseClick;
    final /* synthetic */ Function0<Unit> $onPlayClick;
    final /* synthetic */ Function0<Unit> $onTitleClick;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderContentKt$ChatHeaderTitleContent$7(Modifier modifier, AnimatedAvatarViewState animatedAvatarViewState, String str, String str2, float f, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$animatedAvatarState = animatedAvatarViewState;
        this.$title = str;
        this.$lvlLabel = str2;
        this.$lvlProgress = f;
        this.$isVisibleLvlProgress = z;
        this.$isVisibleUpdateIndicator = z2;
        this.$isVisibleVerified = z3;
        this.$onTitleClick = function0;
        this.$onAvatarClick = function02;
        this.$onGenerationClick = function03;
        this.$onPlayClick = function04;
        this.$onPauseClick = function05;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatHeaderContentKt.ChatHeaderTitleContent(this.$modifier, this.$animatedAvatarState, this.$title, this.$lvlLabel, this.$lvlProgress, this.$isVisibleLvlProgress, this.$isVisibleUpdateIndicator, this.$isVisibleVerified, this.$onTitleClick, this.$onAvatarClick, this.$onGenerationClick, this.$onPlayClick, this.$onPauseClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
