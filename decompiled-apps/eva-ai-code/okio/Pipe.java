package okio;

import com.ifriend.keychain.KeychainModule;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Pipe.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", KeychainModule.AuthPromptOptions.CANCEL, "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        this.condition = newCondition;
        if (!(j >= 1)) {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
        }
        this.sink = new Sink() { // from class: okio.Pipe$sink$1
            private final Timeout timeout = new Timeout();

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
                if (r2 == null) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
                r0 = r11.this$0;
                r1 = r2.timeout();
                r0 = r0.sink().timeout();
                r3 = r1.timeoutNanos();
                r1.timeout(okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
                if (r1.hasDeadline() == false) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
                if (r0.hasDeadline() == false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
                if (r0.hasDeadline() != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
                if (r0.hasDeadline() == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
                r2.write(r12, r13);
                r12 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
                r12 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
                if (r0.hasDeadline() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0115, code lost:
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
                throw r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void write(Buffer source, long j2) {
                Sink sink;
                Intrinsics.checkNotNullParameter(source, "source");
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (!pipe.getCanceled$okio()) {
                        while (true) {
                            if (j2 <= 0) {
                                sink = null;
                                break;
                            }
                            sink = pipe.getFoldedSink$okio();
                            if (sink != null) {
                                break;
                            } else if (pipe.getSourceClosed$okio()) {
                                throw new IOException("source is closed");
                            } else {
                                long maxBufferSize$okio = pipe.getMaxBufferSize$okio() - pipe.getBuffer$okio().size();
                                if (maxBufferSize$okio == 0) {
                                    this.timeout.awaitSignal(pipe.getCondition());
                                    if (pipe.getCanceled$okio()) {
                                        throw new IOException("canceled");
                                    }
                                } else {
                                    long min = Math.min(maxBufferSize$okio, j2);
                                    pipe.getBuffer$okio().write(source, min);
                                    j2 -= min;
                                    pipe.getCondition().signalAll();
                                }
                            }
                        }
                    } else {
                        throw new IOException("canceled");
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean hasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long timeoutNanos = timeout.timeoutNanos();
                        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                        if (timeout.hasDeadline()) {
                            long deadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.flush();
                                Unit unit2 = Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                }
                                return;
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.flush();
                            Unit unit3 = Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean hasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        return;
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink$okio = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long timeoutNanos = timeout.timeoutNanos();
                        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                        if (timeout.hasDeadline()) {
                            long deadlineNanoTime = timeout.deadlineNanoTime();
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                            }
                            try {
                                foldedSink$okio.close();
                                Unit unit2 = Unit.INSTANCE;
                                if (hasDeadline) {
                                    return;
                                }
                                return;
                            } finally {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(deadlineNanoTime);
                                }
                            }
                        }
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.close();
                            Unit unit3 = Unit.INSTANCE;
                        } finally {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink
            public Timeout timeout() {
                return this.timeout;
            }
        };
        this.source = new Source() { // from class: okio.Pipe$source$1
            private final Timeout timeout = new Timeout();

            @Override // okio.Source
            public long read(Buffer sink, long j2) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSourceClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer$okio().size() == 0) {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long read = pipe.getBuffer$okio().read(sink, j2);
                    pipe.getCondition().signalAll();
                    return read;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return this.timeout;
            }
        };
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }

    public final void fold(Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (!(this.foldedSink == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                } else if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                } else {
                    boolean z = this.sinkClosed;
                    Buffer buffer = new Buffer();
                    Buffer buffer2 = this.buffer;
                    buffer.write(buffer2, buffer2.size());
                    this.condition.signalAll();
                    Unit unit = Unit.INSTANCE;
                    try {
                        sink.write(buffer, buffer.size());
                        if (z) {
                            sink.close();
                        } else {
                            sink.flush();
                        }
                    } catch (Throwable th) {
                        this.lock.lock();
                        try {
                            this.sourceClosed = true;
                            this.condition.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            throw th;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                function1.invoke(sink);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
            }
        }
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            function1.invoke(sink);
            Unit unit2 = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    /* renamed from: -deprecated_sink  reason: not valid java name */
    public final Sink m9052deprecated_sink() {
        return this.sink;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    /* renamed from: -deprecated_source  reason: not valid java name */
    public final Source m9053deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
