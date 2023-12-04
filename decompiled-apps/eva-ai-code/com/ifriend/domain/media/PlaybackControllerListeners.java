package com.ifriend.domain.media;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PlaybackController.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JI\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ifriend/domain/media/PlaybackControllerListeners;", "", "onPlayerPrepared", "Lkotlin/Function0;", "", "onPlayerPrepareException", "onPlayerComplete", "onPlayerInterrupt", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnPlayerComplete", "()Lkotlin/jvm/functions/Function0;", "getOnPlayerInterrupt", "getOnPlayerPrepareException", "getOnPlayerPrepared", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaybackControllerListeners {
    private final Function0<Unit> onPlayerComplete;
    private final Function0<Unit> onPlayerInterrupt;
    private final Function0<Unit> onPlayerPrepareException;
    private final Function0<Unit> onPlayerPrepared;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaybackControllerListeners copy$default(PlaybackControllerListeners playbackControllerListeners, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = playbackControllerListeners.onPlayerPrepared;
        }
        if ((i & 2) != 0) {
            function02 = playbackControllerListeners.onPlayerPrepareException;
        }
        if ((i & 4) != 0) {
            function03 = playbackControllerListeners.onPlayerComplete;
        }
        if ((i & 8) != 0) {
            function04 = playbackControllerListeners.onPlayerInterrupt;
        }
        return playbackControllerListeners.copy(function0, function02, function03, function04);
    }

    public final Function0<Unit> component1() {
        return this.onPlayerPrepared;
    }

    public final Function0<Unit> component2() {
        return this.onPlayerPrepareException;
    }

    public final Function0<Unit> component3() {
        return this.onPlayerComplete;
    }

    public final Function0<Unit> component4() {
        return this.onPlayerInterrupt;
    }

    public final PlaybackControllerListeners copy(Function0<Unit> onPlayerPrepared, Function0<Unit> onPlayerPrepareException, Function0<Unit> onPlayerComplete, Function0<Unit> onPlayerInterrupt) {
        Intrinsics.checkNotNullParameter(onPlayerPrepared, "onPlayerPrepared");
        Intrinsics.checkNotNullParameter(onPlayerPrepareException, "onPlayerPrepareException");
        Intrinsics.checkNotNullParameter(onPlayerComplete, "onPlayerComplete");
        Intrinsics.checkNotNullParameter(onPlayerInterrupt, "onPlayerInterrupt");
        return new PlaybackControllerListeners(onPlayerPrepared, onPlayerPrepareException, onPlayerComplete, onPlayerInterrupt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaybackControllerListeners) {
            PlaybackControllerListeners playbackControllerListeners = (PlaybackControllerListeners) obj;
            return Intrinsics.areEqual(this.onPlayerPrepared, playbackControllerListeners.onPlayerPrepared) && Intrinsics.areEqual(this.onPlayerPrepareException, playbackControllerListeners.onPlayerPrepareException) && Intrinsics.areEqual(this.onPlayerComplete, playbackControllerListeners.onPlayerComplete) && Intrinsics.areEqual(this.onPlayerInterrupt, playbackControllerListeners.onPlayerInterrupt);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.onPlayerPrepared.hashCode() * 31) + this.onPlayerPrepareException.hashCode()) * 31) + this.onPlayerComplete.hashCode()) * 31) + this.onPlayerInterrupt.hashCode();
    }

    public String toString() {
        Function0<Unit> function0 = this.onPlayerPrepared;
        Function0<Unit> function02 = this.onPlayerPrepareException;
        Function0<Unit> function03 = this.onPlayerComplete;
        Function0<Unit> function04 = this.onPlayerInterrupt;
        return "PlaybackControllerListeners(onPlayerPrepared=" + function0 + ", onPlayerPrepareException=" + function02 + ", onPlayerComplete=" + function03 + ", onPlayerInterrupt=" + function04 + ")";
    }

    public PlaybackControllerListeners(Function0<Unit> onPlayerPrepared, Function0<Unit> onPlayerPrepareException, Function0<Unit> onPlayerComplete, Function0<Unit> onPlayerInterrupt) {
        Intrinsics.checkNotNullParameter(onPlayerPrepared, "onPlayerPrepared");
        Intrinsics.checkNotNullParameter(onPlayerPrepareException, "onPlayerPrepareException");
        Intrinsics.checkNotNullParameter(onPlayerComplete, "onPlayerComplete");
        Intrinsics.checkNotNullParameter(onPlayerInterrupt, "onPlayerInterrupt");
        this.onPlayerPrepared = onPlayerPrepared;
        this.onPlayerPrepareException = onPlayerPrepareException;
        this.onPlayerComplete = onPlayerComplete;
        this.onPlayerInterrupt = onPlayerInterrupt;
    }

    public final Function0<Unit> getOnPlayerPrepared() {
        return this.onPlayerPrepared;
    }

    public final Function0<Unit> getOnPlayerPrepareException() {
        return this.onPlayerPrepareException;
    }

    public final Function0<Unit> getOnPlayerComplete() {
        return this.onPlayerComplete;
    }

    public final Function0<Unit> getOnPlayerInterrupt() {
        return this.onPlayerInterrupt;
    }
}
