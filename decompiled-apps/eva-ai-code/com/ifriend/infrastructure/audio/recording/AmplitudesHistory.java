package com.ifriend.infrastructure.audio.recording;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAudioRecorder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ifriend/infrastructure/audio/recording/AmplitudesHistory;", "", "capacity", "", "(I)V", "amplitudes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAmplitudes", "()Ljava/util/ArrayList;", "getCapacity", "()I", "add", "", "amplitude", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AmplitudesHistory {
    private final ArrayList<Integer> amplitudes;
    private final int capacity;

    public AmplitudesHistory() {
        this(0, 1, null);
    }

    public AmplitudesHistory(int i) {
        this.capacity = i;
        this.amplitudes = new ArrayList<>();
    }

    public /* synthetic */ AmplitudesHistory(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final ArrayList<Integer> getAmplitudes() {
        return this.amplitudes;
    }

    public final void add(int i) {
        if (this.amplitudes.size() >= 5) {
            this.amplitudes.remove(0);
        }
        this.amplitudes.add(Integer.valueOf(i));
    }
}
