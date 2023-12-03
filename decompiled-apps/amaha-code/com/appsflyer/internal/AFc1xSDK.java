package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class AFc1xSDK implements AFc1zSDK {
    private ExecutorService AFInAppEventType;
    private ScheduledExecutorService AFKeystoreWrapper;
    private PurchaseHandler AFLogger;
    private AFa1pSDK AFLogger$LogLevel;
    private AFc1mSDK AFVersionDeclaration;
    private AFb1zSDK afDebugLog;
    private AFb1aSDK afErrorLog;
    private AFd1bSDK afInfoLog;
    private CreateOneLinkHttpTask afRDLog;
    private AFd1gSDK afWarnLog;
    private AFe1iSDK getLevel;
    private ExecutorService valueOf;
    private final int AFInAppEventParameterName = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFb1bSDK values = new AFb1bSDK();

    /* loaded from: classes.dex */
    public static class AFa1vSDK implements ThreadFactory {
        private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
        private final AtomicInteger values = new AtomicInteger();

        public AFa1vSDK() {
            AFInAppEventParameterName.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i6 = AFInAppEventParameterName.get();
            int incrementAndGet = this.values.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i6);
            sb2.append("-");
            sb2.append(incrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    private synchronized AFb1zSDK onAppOpenAttributionNative() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFb1zSDK(new AFc1tSDK(this.AFInAppEventParameterName), values());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1aSDK AFInAppEventParameterName() {
        if (this.afErrorLog == null) {
            AFb1bSDK AFLogger$LogLevel = AFLogger$LogLevel();
            Context context = this.values.values;
            if (context != null) {
                this.afErrorLog = new AFb1aSDK(AFLogger$LogLevel, new AFc1ySDK(AFb1xSDK.valueOf(context)));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFc1uSDK AFInAppEventType() {
        return new AFc1uSDK(onAppOpenAttributionNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance());
    }

    public final synchronized ExecutorService AFKeystoreWrapper() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = Executors.newSingleThreadExecutor();
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized PurchaseHandler AFLogger() {
        if (this.AFLogger == null) {
            this.AFLogger = new PurchaseHandler(this);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1bSDK AFLogger$LogLevel() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFd1gSDK AFVersionDeclaration() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFd1gSDK(AFLogger$LogLevel(), new AFd1jSDK());
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized CreateOneLinkHttpTask afDebugLog() {
        if (this.afRDLog == null) {
            AFd1lSDK aFd1lSDK = new AFd1lSDK(afRDLog());
            this.afRDLog = new CreateOneLinkHttpTask(new AFd1nSDK(), AFInAppEventParameterName(), AFVersionDeclaration(), aFd1lSDK, new AFc1uSDK(onAppOpenAttributionNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance()), new AFd1kSDK(AFInAppEventParameterName(), aFd1lSDK), afErrorLog());
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFc1mSDK afErrorLog() {
        if (this.AFVersionDeclaration == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1xSDK.4
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* renamed from: AFInAppEventType */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1vSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.c
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFc1xSDK.AFInAppEventType(runnable, threadPoolExecutor2);
                }
            });
            this.AFVersionDeclaration = new AFc1mSDK(threadPoolExecutor);
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFd1bSDK afInfoLog() {
        if (this.afInfoLog == null) {
            this.afInfoLog = new AFd1bSDK(afRDLog());
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFd1qSDK afRDLog() {
        Context context = this.values.values;
        if (context != null) {
            return new AFc1ySDK(AFb1xSDK.valueOf(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1qSDK afWarnLog() {
        return AFb1qSDK.AFInAppEventParameterName();
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFa1pSDK getLevel() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new AFa1pSDK(AFLogger$LogLevel());
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFe1iSDK init() {
        if (this.getLevel == null) {
            this.getLevel = new AFe1iSDK();
        }
        return this.getLevel;
    }

    public final synchronized ScheduledExecutorService valueOf() {
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = Executors.newScheduledThreadPool(2);
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized ExecutorService values() {
        if (this.valueOf == null) {
            this.valueOf = Executors.newCachedThreadPool();
        }
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
