package com.ifriend.domain.services.audio.recording;

import com.facebook.share.internal.ShareInternalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AudioRecorderState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "", "Error", "Idle", "MaximumLength", "Recording", "WithFile", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$Error;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$Idle;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$WithFile;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioRecorderState {

    /* compiled from: AudioRecorderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$Idle;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Idle implements AudioRecorderState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }
    }

    /* compiled from: AudioRecorderState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$WithFile;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", ShareInternalUtility.STAGING_PARAM, "Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "(Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;)V", "getFile", "()Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class WithFile implements AudioRecorderState {
        private final RecordingAudioFile file;

        public WithFile(RecordingAudioFile file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        public final RecordingAudioFile getFile() {
            return this.file;
        }
    }

    /* compiled from: AudioRecorderState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$MaximumLength;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$WithFile;", ShareInternalUtility.STAGING_PARAM, "Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "(Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class MaximumLength extends WithFile {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaximumLength(RecordingAudioFile file) {
            super(file);
            Intrinsics.checkNotNullParameter(file, "file");
        }
    }

    /* compiled from: AudioRecorderState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$Recording;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$WithFile;", ShareInternalUtility.STAGING_PARAM, "Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "(Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Recording extends WithFile {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recording(RecordingAudioFile file) {
            super(file);
            Intrinsics.checkNotNullParameter(file, "file");
        }
    }

    /* compiled from: AudioRecorderState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/AudioRecorderState$Error;", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Error implements AudioRecorderState {
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            Throwable th = this.error;
            return "Error(error=" + th + ")";
        }

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
