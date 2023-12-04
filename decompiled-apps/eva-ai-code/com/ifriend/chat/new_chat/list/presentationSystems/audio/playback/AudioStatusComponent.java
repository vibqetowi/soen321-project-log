package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioStatusComponent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent;", "Lcom/ifriend/common_entities_engine/Component;", "playbackStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "(Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;)V", "getPlaybackStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PlaybackStatus", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioStatusComponent implements Component {
    public static final int $stable = 8;
    private final PlaybackStatus playbackStatus;

    public static /* synthetic */ AudioStatusComponent copy$default(AudioStatusComponent audioStatusComponent, PlaybackStatus playbackStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            playbackStatus = audioStatusComponent.playbackStatus;
        }
        return audioStatusComponent.copy(playbackStatus);
    }

    public final PlaybackStatus component1() {
        return this.playbackStatus;
    }

    public final AudioStatusComponent copy(PlaybackStatus playbackStatus) {
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        return new AudioStatusComponent(playbackStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioStatusComponent) && Intrinsics.areEqual(this.playbackStatus, ((AudioStatusComponent) obj).playbackStatus);
    }

    public int hashCode() {
        return this.playbackStatus.hashCode();
    }

    public String toString() {
        PlaybackStatus playbackStatus = this.playbackStatus;
        return "AudioStatusComponent(playbackStatus=" + playbackStatus + ")";
    }

    public AudioStatusComponent(PlaybackStatus playbackStatus) {
        Intrinsics.checkNotNullParameter(playbackStatus, "playbackStatus");
        this.playbackStatus = playbackStatus;
    }

    public final PlaybackStatus getPlaybackStatus() {
        return this.playbackStatus;
    }

    /* compiled from: AudioStatusComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "", "Idle", "Loading", "Paused", "Playing", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Idle;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Loading;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Paused;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Playing;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface PlaybackStatus {

        /* compiled from: AudioStatusComponent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Idle;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Idle implements PlaybackStatus {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* compiled from: AudioStatusComponent.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Playing;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Playing implements PlaybackStatus {
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

        /* compiled from: AudioStatusComponent.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Paused;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "position", "", "duration", "(JJ)V", "getDuration", "()J", "getPosition", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Paused implements PlaybackStatus {
            public static final int $stable = 0;
            private final long duration;
            private final long position;

            public Paused() {
                this(0L, 0L, 3, null);
            }

            public static /* synthetic */ Paused copy$default(Paused paused, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = paused.position;
                }
                if ((i & 2) != 0) {
                    j2 = paused.duration;
                }
                return paused.copy(j, j2);
            }

            public final long component1() {
                return this.position;
            }

            public final long component2() {
                return this.duration;
            }

            public final Paused copy(long j, long j2) {
                return new Paused(j, j2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Paused) {
                    Paused paused = (Paused) obj;
                    return this.position == paused.position && this.duration == paused.duration;
                }
                return false;
            }

            public int hashCode() {
                return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.position) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.duration);
            }

            public String toString() {
                long j = this.position;
                long j2 = this.duration;
                return "Paused(position=" + j + ", duration=" + j2 + ")";
            }

            public Paused(long j, long j2) {
                this.position = j;
                this.duration = j2;
            }

            public /* synthetic */ Paused(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
            }

            public final long getDuration() {
                return this.duration;
            }

            public final long getPosition() {
                return this.position;
            }
        }

        /* compiled from: AudioStatusComponent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus$Loading;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Loading implements PlaybackStatus {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }
        }
    }
}
