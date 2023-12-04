package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$AudioRecordingIndicators$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $cancelled;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ RowScope $this_AudioRecordingIndicators;
    final /* synthetic */ String $timerLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$AudioRecordingIndicators$3(RowScope rowScope, boolean z, String str, boolean z2, int i) {
        super(2);
        this.$this_AudioRecordingIndicators = rowScope;
        this.$isRecording = z;
        this.$timerLabel = str;
        this.$cancelled = z2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.AudioRecordingIndicators(this.$this_AudioRecordingIndicators, this.$isRecording, this.$timerLabel, this.$cancelled, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
