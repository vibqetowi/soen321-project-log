package com.ifriend.ui.recyclerView.audio.audioView.playback;

import com.ifriend.ui.recyclerView.audio.audioView.playback.VoiceSampleAudioPlaybackFacade;
import com.ifriend.ui.recyclerView.audio.audioView.rewindView.HistogramAudioRewindView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceSampleAudioPlaybackFacade.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ VoiceSampleAudioPlaybackFacade this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSampleAudioPlaybackFacade$setPlaybackControllerListeners$1$2(VoiceSampleAudioPlaybackFacade voiceSampleAudioPlaybackFacade) {
        super(0);
        this.this$0 = voiceSampleAudioPlaybackFacade;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HistogramAudioRewindView histogramAudioRewindView;
        histogramAudioRewindView = this.this$0.rewindView;
        histogramAudioRewindView.seekToStart();
        this.this$0.setPlaybackState(VoiceSampleAudioPlaybackFacade.PlaybackState.INIT);
    }
}
