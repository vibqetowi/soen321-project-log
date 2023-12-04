package org.apache.commons.lang3.time;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private final String message;
    private State runningState;
    private SplitState splitState;
    private long startTime;
    private long startTimeMillis;
    private long stopTime;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum SplitState {
        SPLIT,
        UNSPLIT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum State {
        RUNNING { // from class: org.apache.commons.lang3.time.StopWatch.State.1
            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isSuspended() {
                return false;
            }
        },
        STOPPED { // from class: org.apache.commons.lang3.time.StopWatch.State.2
            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isSuspended() {
                return false;
            }
        },
        SUSPENDED { // from class: org.apache.commons.lang3.time.StopWatch.State.3
            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isSuspended() {
                return true;
            }
        },
        UNSTARTED { // from class: org.apache.commons.lang3.time.StopWatch.State.4
            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.StopWatch.State
            boolean isSuspended() {
                return false;
            }
        };

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    public static StopWatch create() {
        return new StopWatch();
    }

    public static StopWatch createStarted() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        return stopWatch;
    }

    public StopWatch() {
        this(null);
    }

    public StopWatch(String str) {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
        this.message = str;
    }

    public String formatSplitTime() {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String formatTime() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public String getMessage() {
        return this.message;
    }

    public long getNanoTime() {
        long j;
        long j2;
        if (this.runningState == State.STOPPED || this.runningState == State.SUSPENDED) {
            j = this.stopTime;
            j2 = this.startTime;
        } else if (this.runningState == State.UNSTARTED) {
            return 0L;
        } else {
            if (this.runningState == State.RUNNING) {
                j = System.nanoTime();
                j2 = this.startTime;
            } else {
                throw new RuntimeException("Illegal running state has occurred.");
            }
        }
        return j - j2;
    }

    public long getSplitNanoTime() {
        if (this.splitState != SplitState.SPLIT) {
            throw new IllegalStateException("Stopwatch must be split to get the split time. ");
        }
        return this.stopTime - this.startTime;
    }

    public long getSplitTime() {
        return getSplitNanoTime() / 1000000;
    }

    public long getStartTime() {
        if (this.runningState == State.UNSTARTED) {
            throw new IllegalStateException("Stopwatch has not been started");
        }
        return this.startTimeMillis;
    }

    public long getTime() {
        return getNanoTime() / 1000000;
    }

    public long getTime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanoTime(), TimeUnit.NANOSECONDS);
    }

    public boolean isStarted() {
        return this.runningState.isStarted();
    }

    public boolean isStopped() {
        return this.runningState.isStopped();
    }

    public boolean isSuspended() {
        return this.runningState.isSuspended();
    }

    public void reset() {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
    }

    public void resume() {
        if (this.runningState != State.SUSPENDED) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.startTime += System.nanoTime() - this.stopTime;
        this.runningState = State.RUNNING;
    }

    public void split() {
        if (this.runningState != State.RUNNING) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.stopTime = System.nanoTime();
        this.splitState = SplitState.SPLIT;
    }

    public void start() {
        if (this.runningState == State.STOPPED) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (this.runningState != State.UNSTARTED) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.startTime = System.nanoTime();
        this.startTimeMillis = System.currentTimeMillis();
        this.runningState = State.RUNNING;
    }

    public void stop() {
        if (this.runningState != State.RUNNING && this.runningState != State.SUSPENDED) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (this.runningState == State.RUNNING) {
            this.stopTime = System.nanoTime();
        }
        this.runningState = State.STOPPED;
    }

    public void suspend() {
        if (this.runningState != State.RUNNING) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.stopTime = System.nanoTime();
        this.runningState = State.SUSPENDED;
    }

    public String toSplitString() {
        String objects = Objects.toString(this.message, "");
        String formatSplitTime = formatSplitTime();
        if (objects.isEmpty()) {
            return formatSplitTime;
        }
        return objects + " " + formatSplitTime;
    }

    public String toString() {
        String objects = Objects.toString(this.message, "");
        String formatTime = formatTime();
        if (objects.isEmpty()) {
            return formatTime;
        }
        return objects + " " + formatTime;
    }

    public void unsplit() {
        if (this.splitState != SplitState.SPLIT) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.splitState = SplitState.UNSPLIT;
    }
}
