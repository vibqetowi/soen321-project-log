package com.ifriend.ui.components.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypewriterText.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypewriterTextKt$TypewriterText$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $durationMillis;
    final /* synthetic */ boolean $isRepeat;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $repeatDurationMillis;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypewriterTextKt$TypewriterText$2(Modifier modifier, String str, TextStyle textStyle, long j, long j2, boolean z, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$text = str;
        this.$style = textStyle;
        this.$durationMillis = j;
        this.$repeatDurationMillis = j2;
        this.$isRepeat = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TypewriterTextKt.TypewriterText(this.$modifier, this.$text, this.$style, this.$durationMillis, this.$repeatDurationMillis, this.$isRepeat, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
