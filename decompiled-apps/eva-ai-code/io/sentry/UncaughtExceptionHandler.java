package io.sentry;

import java.lang.Thread;
/* loaded from: classes4.dex */
interface UncaughtExceptionHandler {
    Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();

    void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    /* loaded from: classes4.dex */
    public static final class Adapter implements UncaughtExceptionHandler {
        private static final Adapter INSTANCE = new Adapter();

        /* JADX INFO: Access modifiers changed from: package-private */
        public static UncaughtExceptionHandler getInstance() {
            return INSTANCE;
        }

        private Adapter() {
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }

        @Override // io.sentry.UncaughtExceptionHandler
        public void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }
}
