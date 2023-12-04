package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$AttachmentsButtons$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function1<Integer, Unit> $onDragVoice;
    final /* synthetic */ Function0<Unit> $onImageClick;
    final /* synthetic */ Function0<Unit> $onRecordAudioEnd;
    final /* synthetic */ Function0<Unit> $onRecordAudioStart;
    final /* synthetic */ RowScope $this_AttachmentsButtons;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputContentKt$AttachmentsButtons$3(RowScope rowScope, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Integer, Unit> function1, int i) {
        super(2);
        this.$this_AttachmentsButtons = rowScope;
        this.$isVisible = z;
        this.$isRecording = z2;
        this.$onImageClick = function0;
        this.$onRecordAudioStart = function02;
        this.$onRecordAudioEnd = function03;
        this.$onDragVoice = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatInputContentKt.AttachmentsButtons(this.$this_AttachmentsButtons, this.$isVisible, this.$isRecording, this.$onImageClick, this.$onRecordAudioStart, this.$onRecordAudioEnd, this.$onDragVoice, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
