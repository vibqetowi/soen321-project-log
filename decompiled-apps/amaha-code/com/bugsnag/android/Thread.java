package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.Thread;
import java.util.List;
/* loaded from: classes.dex */
public class Thread implements JsonStream.Streamable {
    private final ThreadInternal impl;
    private final Logger logger;

    /* renamed from: com.bugsnag.android.Thread$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$lang$Thread$State;

        static {
            int[] iArr = new int[Thread.State.values().length];
            $SwitchMap$java$lang$Thread$State = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");
        
        private final String descriptor;

        State(String str) {
            this.descriptor = str;
        }

        public static State byDescriptor(String str) {
            State[] values;
            if (str == null) {
                return UNKNOWN;
            }
            for (State state : values()) {
                if (state.getDescriptor().equals(str)) {
                    return state;
                }
            }
            return UNKNOWN;
        }

        public static State forThread(java.lang.Thread thread) {
            return getState(thread.getState());
        }

        private static State getState(Thread.State state) {
            switch (AnonymousClass1.$SwitchMap$java$lang$Thread$State[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }

        public String getDescriptor() {
            return this.descriptor;
        }
    }

    public Thread(long j10, String str, ThreadType threadType, boolean z10, State state, Stacktrace stacktrace, Logger logger) {
        this.impl = new ThreadInternal(j10, str, threadType, z10, state.getDescriptor(), stacktrace);
        this.logger = logger;
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to thread." + str + ", ignoring");
    }

    public boolean getErrorReportingThread() {
        return this.impl.isErrorReportingThread();
    }

    public long getId() {
        return this.impl.getId();
    }

    public String getName() {
        return this.impl.getName();
    }

    public List<Stackframe> getStacktrace() {
        return this.impl.getStacktrace();
    }

    public State getState() {
        return State.byDescriptor(this.impl.getState());
    }

    public ThreadType getType() {
        return this.impl.getType();
    }

    public void setId(long j10) {
        this.impl.setId(j10);
    }

    public void setName(String str) {
        if (str != null) {
            this.impl.setName(str);
        } else {
            logNull(SessionManager.KEY_NAME);
        }
    }

    public void setStacktrace(List<Stackframe> list) {
        if (!CollectionUtils.containsNullElements(list)) {
            this.impl.setStacktrace(list);
        } else {
            logNull("stacktrace");
        }
    }

    public void setState(State state) {
        if (state != null) {
            this.impl.setState(state.getDescriptor());
        } else {
            logNull("state");
        }
    }

    public void setType(ThreadType threadType) {
        if (threadType != null) {
            this.impl.setType(threadType);
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }

    public Thread(ThreadInternal threadInternal, Logger logger) {
        this.impl = threadInternal;
        this.logger = logger;
    }
}
