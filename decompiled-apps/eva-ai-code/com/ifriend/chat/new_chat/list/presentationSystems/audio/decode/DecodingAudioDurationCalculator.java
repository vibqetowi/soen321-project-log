package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.ui.recyclerView.audio.audioView.messageText.SampleAudioMessageText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodingAudioEventsHandlingSystem.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioDurationCalculator;", "", "()V", "calculateDecodingTimeInMillis", "", "text", "", "getMessageLengthType", "Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodingAudioDurationCalculator {

    /* compiled from: DecodingAudioEventsHandlingSystem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SampleAudioMessageText.MessageLengthType.values().length];
            try {
                iArr[SampleAudioMessageText.MessageLengthType.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SampleAudioMessageText.MessageLengthType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final long calculateDecodingTimeInMillis(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int i = WhenMappings.$EnumSwitchMapping$0[getMessageLengthType(text).ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
            }
        }
        return i2 * 500;
    }

    private final SampleAudioMessageText.MessageLengthType getMessageLengthType(String str) {
        SampleAudioMessageText.MessageLengthType messageLengthType = SampleAudioMessageText.MessageLengthType.Companion.get(str.length());
        if (!(str.length() > 0)) {
            messageLengthType = null;
        }
        return messageLengthType == null ? SampleAudioMessageText.MessageLengthType.MEDIUM : messageLengthType;
    }
}
