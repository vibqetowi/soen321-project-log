package com.google.api.core;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes7.dex */
public interface ApiService {

    @BetaApi
    /* loaded from: classes7.dex */
    public static abstract class Listener {
        public void failed(State state, Throwable th) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(State state) {
        }

        public void terminated(State state) {
        }
    }

    @BetaApi
    /* loaded from: classes7.dex */
    public enum State {
        FAILED,
        NEW,
        RUNNING,
        STARTING,
        STOPPING,
        TERMINATED
    }

    void addListener(Listener listener, Executor executor);

    void awaitRunning();

    void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    ApiService startAsync();

    State state();

    ApiService stopAsync();
}
