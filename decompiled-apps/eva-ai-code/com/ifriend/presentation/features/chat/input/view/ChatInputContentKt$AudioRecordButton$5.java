package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.BoxScope;
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
public final class ChatInputContentKt$AudioRecordButton$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $cancelProgress;
    final /* synthetic */ int $dragOffset;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ BoxScope $this_AudioRecordButton;
    final /* synthetic */ float $volumeDb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$AudioRecordButton$5(BoxScope boxScope, boolean z, int i, float f, float f2, int i2) {
        super(2);
        this.$this_AudioRecordButton = boxScope;
        this.$isRecording = z;
        this.$dragOffset = i;
        this.$volumeDb = f;
        this.$cancelProgress = f2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.AudioRecordButton(this.$this_AudioRecordButton, this.$isRecording, this.$dragOffset, this.$volumeDb, this.$cancelProgress, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
