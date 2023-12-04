package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Recorder_RecordingRecord extends Recorder.RecordingRecord {
    private final Executor getCallbackExecutor;
    private final Consumer<VideoRecordEvent> getEventListener;
    private final OutputOptions getOutputOptions;
    private final long getRecordingId;
    private final boolean hasAudioEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Recorder_RecordingRecord(OutputOptions outputOptions, Executor executor, Consumer<VideoRecordEvent> consumer, boolean z, long j) {
        if (outputOptions == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.getOutputOptions = outputOptions;
        this.getCallbackExecutor = executor;
        this.getEventListener = consumer;
        this.hasAudioEnabled = z;
        this.getRecordingId = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.video.Recorder.RecordingRecord
    public OutputOptions getOutputOptions() {
        return this.getOutputOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.video.Recorder.RecordingRecord
    public Executor getCallbackExecutor() {
        return this.getCallbackExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.video.Recorder.RecordingRecord
    public Consumer<VideoRecordEvent> getEventListener() {
        return this.getEventListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.video.Recorder.RecordingRecord
    public boolean hasAudioEnabled() {
        return this.hasAudioEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.video.Recorder.RecordingRecord
    public long getRecordingId() {
        return this.getRecordingId;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.getOutputOptions + ", getCallbackExecutor=" + this.getCallbackExecutor + ", getEventListener=" + this.getEventListener + ", hasAudioEnabled=" + this.hasAudioEnabled + ", getRecordingId=" + this.getRecordingId + "}";
    }

    public boolean equals(Object obj) {
        Executor executor;
        Consumer<VideoRecordEvent> consumer;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Recorder.RecordingRecord) {
            Recorder.RecordingRecord recordingRecord = (Recorder.RecordingRecord) obj;
            return this.getOutputOptions.equals(recordingRecord.getOutputOptions()) && ((executor = this.getCallbackExecutor) != null ? executor.equals(recordingRecord.getCallbackExecutor()) : recordingRecord.getCallbackExecutor() == null) && ((consumer = this.getEventListener) != null ? consumer.equals(recordingRecord.getEventListener()) : recordingRecord.getEventListener() == null) && this.hasAudioEnabled == recordingRecord.hasAudioEnabled() && this.getRecordingId == recordingRecord.getRecordingId();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.getOutputOptions.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.getCallbackExecutor;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        Consumer<VideoRecordEvent> consumer = this.getEventListener;
        int hashCode3 = (hashCode2 ^ (consumer != null ? consumer.hashCode() : 0)) * 1000003;
        int i = this.hasAudioEnabled ? 1231 : 1237;
        long j = this.getRecordingId;
        return ((hashCode3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
