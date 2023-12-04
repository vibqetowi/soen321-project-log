package com.ifriend.ui.recyclerView.audio.audioView.rewindView;

import kotlin.Metadata;
import kotlin.random.Random;
/* compiled from: HistogramAudioRewindView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"randomIfNotInLimit", "", "limitExcluded", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HistogramAudioRewindViewKt {
    public static final int randomIfNotInLimit(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        int intValue = valueOf.intValue();
        boolean z = false;
        if (intValue >= 0 && intValue < i2) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : Random.Default.nextInt(i2);
    }
}
