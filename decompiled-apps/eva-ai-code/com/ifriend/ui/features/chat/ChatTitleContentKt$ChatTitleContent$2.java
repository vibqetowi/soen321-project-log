package com.ifriend.ui.features.chat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatTitleContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatTitleContentKt$ChatTitleContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isLvlVisible;
    final /* synthetic */ boolean $isUpdateVisible;
    final /* synthetic */ boolean $isVerifiedVisible;
    final /* synthetic */ String $lvlLabel;
    final /* synthetic */ float $lvlProgress;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTitleContentKt$ChatTitleContent$2(String str, String str2, float f, boolean z, boolean z2, boolean z3, Modifier modifier, int i, int i2) {
        super(2);
        this.$title = str;
        this.$lvlLabel = str2;
        this.$lvlProgress = f;
        this.$isLvlVisible = z;
        this.$isUpdateVisible = z2;
        this.$isVerifiedVisible = z3;
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
        ChatTitleContentKt.ChatTitleContent(this.$title, this.$lvlLabel, this.$lvlProgress, this.$isLvlVisible, this.$isUpdateVisible, this.$isVerifiedVisible, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
