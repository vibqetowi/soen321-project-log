package androidx.camera.video;
/* loaded from: classes.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    private final AudioStats audioStats;
    private final long numBytesRecorded;
    private final long recordedDurationNanos;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_RecordingStats(long j, long j2, AudioStats audioStats) {
        this.recordedDurationNanos = j;
        this.numBytesRecorded = j2;
        if (audioStats == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.audioStats = audioStats;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
        return this.recordedDurationNanos;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
        return this.numBytesRecorded;
    }

    @Override // androidx.camera.video.RecordingStats
    public AudioStats getAudioStats() {
        return this.audioStats;
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.recordedDurationNanos + ", numBytesRecorded=" + this.numBytesRecorded + ", audioStats=" + this.audioStats + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecordingStats) {
            RecordingStats recordingStats = (RecordingStats) obj;
            return this.recordedDurationNanos == recordingStats.getRecordedDurationNanos() && this.numBytesRecorded == recordingStats.getNumBytesRecorded() && this.audioStats.equals(recordingStats.getAudioStats());
        }
        return false;
    }

    public int hashCode() {
        long j = this.recordedDurationNanos;
        long j2 = this.numBytesRecorded;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.audioStats.hashCode();
    }
}
