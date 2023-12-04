package com.ifriend.domain.services.audio.recording;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RecordingAudioFile.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "", ClientCookie.PATH_ATTR, "", "duration", "Lkotlin/time/Duration;", "volumeDb", "", "(Ljava/lang/String;JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getPath", "()Ljava/lang/String;", "getVolumeDb", "()F", "component1", "component2", "component2-UwyO8pc", "component3", "copy", "copy-8Mi8wO0", "(Ljava/lang/String;JF)Lcom/ifriend/domain/services/audio/recording/RecordingAudioFile;", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecordingAudioFile {
    private final long duration;
    private final String path;
    private final float volumeDb;

    public /* synthetic */ RecordingAudioFile(String str, long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, f);
    }

    /* renamed from: copy-8Mi8wO0$default  reason: not valid java name */
    public static /* synthetic */ RecordingAudioFile m6883copy8Mi8wO0$default(RecordingAudioFile recordingAudioFile, String str, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordingAudioFile.path;
        }
        if ((i & 2) != 0) {
            j = recordingAudioFile.duration;
        }
        if ((i & 4) != 0) {
            f = recordingAudioFile.volumeDb;
        }
        return recordingAudioFile.m6885copy8Mi8wO0(str, j, f);
    }

    public final String component1() {
        return this.path;
    }

    /* renamed from: component2-UwyO8pc  reason: not valid java name */
    public final long m6884component2UwyO8pc() {
        return this.duration;
    }

    public final float component3() {
        return this.volumeDb;
    }

    /* renamed from: copy-8Mi8wO0  reason: not valid java name */
    public final RecordingAudioFile m6885copy8Mi8wO0(String path, long j, float f) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new RecordingAudioFile(path, j, f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecordingAudioFile) {
            RecordingAudioFile recordingAudioFile = (RecordingAudioFile) obj;
            return Intrinsics.areEqual(this.path, recordingAudioFile.path) && Duration.m8645equalsimpl0(this.duration, recordingAudioFile.duration) && Float.compare(this.volumeDb, recordingAudioFile.volumeDb) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Duration.m8668hashCodeimpl(this.duration)) * 31) + Float.floatToIntBits(this.volumeDb);
    }

    public String toString() {
        String str = this.path;
        String m8689toStringimpl = Duration.m8689toStringimpl(this.duration);
        float f = this.volumeDb;
        return "RecordingAudioFile(path=" + str + ", duration=" + m8689toStringimpl + ", volumeDb=" + f + ")";
    }

    private RecordingAudioFile(String path, long j, float f) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.duration = j;
        this.volumeDb = f;
    }

    public final String getPath() {
        return this.path;
    }

    /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
    public final long m6886getDurationUwyO8pc() {
        return this.duration;
    }

    public final float getVolumeDb() {
        return this.volumeDb;
    }
}
