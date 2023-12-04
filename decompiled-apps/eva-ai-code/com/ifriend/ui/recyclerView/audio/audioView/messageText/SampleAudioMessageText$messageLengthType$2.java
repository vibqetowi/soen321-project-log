package com.ifriend.ui.recyclerView.audio.audioView.messageText;

import com.ifriend.ui.recyclerView.audio.audioView.messageText.SampleAudioMessageText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SampleAudioMessageText.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SampleAudioMessageText$messageLengthType$2 extends Lambda implements Function0<SampleAudioMessageText.MessageLengthType> {
    final /* synthetic */ SampleAudioMessageText this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleAudioMessageText$messageLengthType$2(SampleAudioMessageText sampleAudioMessageText) {
        super(0);
        this.this$0 = sampleAudioMessageText;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SampleAudioMessageText.MessageLengthType invoke() {
        boolean z;
        SampleAudioMessageText.MessageLengthType messageLengthType = SampleAudioMessageText.MessageLengthType.Companion.get(this.this$0.getText().length());
        z = this.this$0.generateFromTextPredicate;
        if (!z) {
            messageLengthType = null;
        }
        return messageLengthType == null ? SampleAudioMessageText.MessageLengthType.MEDIUM : messageLengthType;
    }
}
