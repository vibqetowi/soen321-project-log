package com.ifriend.infrastructure.audio.recording;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"calculateDB", "", "Lcom/ifriend/infrastructure/audio/recording/AmplitudesHistory;", "infrastructure_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAudioRecorderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateDB(AmplitudesHistory amplitudesHistory) {
        float log10 = ((int) (20 * Math.log10(Math.abs((CollectionsKt.sumOfInt(CollectionsKt.takeLast(amplitudesHistory.getAmplitudes(), amplitudesHistory.getCapacity())) / amplitudesHistory.getCapacity()) / 600.0f)))) / 20.0f;
        if (log10 < 0.0f) {
            return 0.0f;
        }
        return log10;
    }
}
