package androidx.camera.video;

import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public abstract class VideoRecordEvent {
    private final OutputOptions mOutputOptions;
    private final RecordingStats mRecordingStats;

    VideoRecordEvent(OutputOptions outputOptions, RecordingStats recordingStats) {
        this.mOutputOptions = (OutputOptions) Preconditions.checkNotNull(outputOptions);
        this.mRecordingStats = (RecordingStats) Preconditions.checkNotNull(recordingStats);
    }

    public RecordingStats getRecordingStats() {
        return this.mRecordingStats;
    }

    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Start start(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Start(outputOptions, recordingStats);
    }

    /* loaded from: classes.dex */
    public static final class Start extends VideoRecordEvent {
        Start(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Finalize finalize(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults) {
        return new Finalize(outputOptions, recordingStats, outputResults, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Finalize finalizeWithError(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults, int i, Throwable th) {
        Preconditions.checkArgument(i != 0, "An error type is required.");
        return new Finalize(outputOptions, recordingStats, outputResults, i, th);
    }

    /* loaded from: classes.dex */
    public static final class Finalize extends VideoRecordEvent {
        public static final int ERROR_ENCODING_FAILED = 6;
        public static final int ERROR_FILE_SIZE_LIMIT_REACHED = 2;
        public static final int ERROR_INSUFFICIENT_STORAGE = 3;
        public static final int ERROR_INVALID_OUTPUT_OPTIONS = 5;
        public static final int ERROR_NONE = 0;
        public static final int ERROR_NO_VALID_DATA = 8;
        public static final int ERROR_RECORDER_ERROR = 7;
        public static final int ERROR_SOURCE_INACTIVE = 4;
        public static final int ERROR_UNKNOWN = 1;
        private final Throwable mCause;
        private final int mError;
        private final OutputResults mOutputResults;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface VideoRecordError {
        }

        Finalize(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults, int i, Throwable th) {
            super(outputOptions, recordingStats);
            this.mOutputResults = outputResults;
            this.mError = i;
            this.mCause = th;
        }

        public OutputResults getOutputResults() {
            return this.mOutputResults;
        }

        public boolean hasError() {
            return this.mError != 0;
        }

        public int getError() {
            return this.mError;
        }

        public Throwable getCause() {
            return this.mCause;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String errorToString(int i) {
            switch (i) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                default:
                    return "Unknown(" + i + ")";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Status status(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Status(outputOptions, recordingStats);
    }

    /* loaded from: classes.dex */
    public static final class Status extends VideoRecordEvent {
        Status(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pause pause(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Pause(outputOptions, recordingStats);
    }

    /* loaded from: classes.dex */
    public static final class Pause extends VideoRecordEvent {
        Pause(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resume resume(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Resume(outputOptions, recordingStats);
    }

    /* loaded from: classes.dex */
    public static final class Resume extends VideoRecordEvent {
        Resume(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }
}
