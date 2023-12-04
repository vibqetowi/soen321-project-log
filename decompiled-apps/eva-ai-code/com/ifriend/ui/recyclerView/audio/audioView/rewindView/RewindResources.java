package com.ifriend.ui.recyclerView.audio.audioView.rewindView;

import com.ifriend.ui.recyclerView.audio.audioView.messageText.SampleAudioMessageText;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RewindResources.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/rewindView/RewindResources;", "", "()V", "histogramBackgrounds", "", "", "getHistogramBackgrounds", "()Ljava/util/List;", "histogramBackgrounds$delegate", "Lkotlin/Lazy;", "getResourcesSize", "messageLengthType", "Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewindResources {
    public static final RewindResources INSTANCE = new RewindResources();
    private static final Lazy histogramBackgrounds$delegate = LazyKt.lazy(RewindResources$histogramBackgrounds$2.INSTANCE);

    /* compiled from: RewindResources.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
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
            try {
                iArr[SampleAudioMessageText.MessageLengthType.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RewindResources() {
    }

    public final int getResourcesSize(SampleAudioMessageText.MessageLengthType messageLengthType) {
        Intrinsics.checkNotNullParameter(messageLengthType, "messageLengthType");
        int i = WhenMappings.$EnumSwitchMapping$0[messageLengthType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<Integer> getHistogramBackgrounds() {
        return (List) histogramBackgrounds$delegate.getValue();
    }
}
