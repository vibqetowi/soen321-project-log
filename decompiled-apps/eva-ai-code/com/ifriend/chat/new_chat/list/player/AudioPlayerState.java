package com.ifriend.chat.new_chat.list.player;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AudioPlayerState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "", "()V", "Buffering", "Empty", "Ended", "Idle", "Pause", "Playing", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Buffering;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Empty;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Ended;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Idle;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Pause;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Playing;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AudioPlayerState {
    public static final int $stable = 0;

    public /* synthetic */ AudioPlayerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Empty;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Empty extends AudioPlayerState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    private AudioPlayerState() {
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Idle;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Idle extends AudioPlayerState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Buffering;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Buffering extends AudioPlayerState {
        public static final int $stable = 0;
        public static final Buffering INSTANCE = new Buffering();

        private Buffering() {
            super(null);
        }
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Playing;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Playing extends AudioPlayerState {
        public static final int $stable = 0;
        private final long duration;
        private final long position;

        public Playing() {
            this(0L, 0L, 3, null);
        }

        public static /* synthetic */ Playing copy$default(Playing playing, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = playing.position;
            }
            if ((i & 2) != 0) {
                j2 = playing.duration;
            }
            return playing.copy(j, j2);
        }

        public final long component1() {
            return this.position;
        }

        public final long component2() {
            return this.duration;
        }

        public final Playing copy(long j, long j2) {
            return new Playing(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Playing) {
                Playing playing = (Playing) obj;
                return this.position == playing.position && this.duration == playing.duration;
            }
            return false;
        }

        public int hashCode() {
            return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.position) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.duration);
        }

        public String toString() {
            long j = this.position;
            long j2 = this.duration;
            return "Playing(position=" + j + ", duration=" + j2 + ")";
        }

        public Playing(long j, long j2) {
            super(null);
            this.position = j;
            this.duration = j2;
        }

        public /* synthetic */ Playing(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getPosition() {
            return this.position;
        }
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Pause;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Pause extends AudioPlayerState {
        public static final int $stable = 0;
        private final long duration;
        private final long position;

        public Pause() {
            this(0L, 0L, 3, null);
        }

        public static /* synthetic */ Pause copy$default(Pause pause, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pause.position;
            }
            if ((i & 2) != 0) {
                j2 = pause.duration;
            }
            return pause.copy(j, j2);
        }

        public final long component1() {
            return this.position;
        }

        public final long component2() {
            return this.duration;
        }

        public final Pause copy(long j, long j2) {
            return new Pause(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Pause) {
                Pause pause = (Pause) obj;
                return this.position == pause.position && this.duration == pause.duration;
            }
            return false;
        }

        public int hashCode() {
            return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.position) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.duration);
        }

        public String toString() {
            long j = this.position;
            long j2 = this.duration;
            return "Pause(position=" + j + ", duration=" + j2 + ")";
        }

        public Pause(long j, long j2) {
            super(null);
            this.position = j;
            this.duration = j2;
        }

        public /* synthetic */ Pause(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getPosition() {
            return this.position;
        }
    }

    /* compiled from: AudioPlayerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState$Ended;", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerState;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Ended extends AudioPlayerState {
        public static final int $stable = 0;
        public static final Ended INSTANCE = new Ended();

        private Ended() {
            super(null);
        }
    }
}
