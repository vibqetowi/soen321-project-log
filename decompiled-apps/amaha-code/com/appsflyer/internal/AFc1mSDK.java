package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class AFc1mSDK implements Runnable {
    final ExecutorService valueOf;
    public Executor AFInAppEventParameterName = Executors.newSingleThreadExecutor();
    private Timer afInfoLog = new Timer(true);
    public final List<AFc1iSDK> AFInAppEventType = new CopyOnWriteArrayList();
    final Set<AFc1kSDK> AFKeystoreWrapper = new CopyOnWriteArraySet();
    final Set<AFc1kSDK> values = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFc1lSDK<?>> afRDLog = new ConcurrentSkipListSet();
    final NavigableSet<AFc1lSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final List<AFc1lSDK<?>> afDebugLog = new ArrayList();
    final Set<AFc1lSDK<?>> afErrorLog = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.appsflyer.internal.AFc1mSDK$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFc1lSDK AFKeystoreWrapper;

        public AnonymousClass3(AFc1lSDK aFc1lSDK) {
            this.AFKeystoreWrapper = aFc1lSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFc1mSDK.this.afRDLog) {
                if (AFc1mSDK.this.afErrorLog.contains(this.AFKeystoreWrapper)) {
                    StringBuilder sb2 = new StringBuilder("QUEUE: tried to add already running task: ");
                    sb2.append(this.AFKeystoreWrapper);
                    AFLogger.afDebugLog(sb2.toString());
                    return;
                }
                if (!AFc1mSDK.this.afRDLog.contains(this.AFKeystoreWrapper) && !AFc1mSDK.this.AFLogger.contains(this.AFKeystoreWrapper)) {
                    AFc1mSDK.valueOf(AFc1mSDK.this, this.AFKeystoreWrapper);
                    if (AFc1mSDK.this.valueOf(this.AFKeystoreWrapper)) {
                        add = AFc1mSDK.this.afRDLog.add(this.AFKeystoreWrapper);
                    } else {
                        add = AFc1mSDK.this.AFLogger.add(this.AFKeystoreWrapper);
                        if (add) {
                            StringBuilder sb3 = new StringBuilder("QUEUE: new task was blocked: ");
                            sb3.append(this.AFKeystoreWrapper);
                            AFLogger.afDebugLog(sb3.toString());
                            this.AFKeystoreWrapper.valueOf();
                        }
                    }
                    if (add) {
                        AFc1mSDK aFc1mSDK = AFc1mSDK.this;
                        aFc1mSDK.afRDLog.addAll(aFc1mSDK.afDebugLog);
                        AFc1mSDK.this.afDebugLog.clear();
                    } else {
                        StringBuilder sb4 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                        sb4.append(this.AFKeystoreWrapper);
                        AFLogger.afDebugLog(sb4.toString());
                    }
                    if (add) {
                        AFc1mSDK.this.values.add(this.AFKeystoreWrapper.AFInAppEventParameterName);
                        StringBuilder sb5 = new StringBuilder("QUEUE: new task added: ");
                        sb5.append(this.AFKeystoreWrapper);
                        AFLogger.afDebugLog(sb5.toString());
                        Iterator<AFc1iSDK> it = AFc1mSDK.this.AFInAppEventType.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        AFc1mSDK aFc1mSDK2 = AFc1mSDK.this;
                        aFc1mSDK2.valueOf.submit(aFc1mSDK2);
                        AFc1mSDK.AFKeystoreWrapper(AFc1mSDK.this);
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already pending task: ");
                    sb6.append(this.AFKeystoreWrapper);
                    AFLogger.afWarnLog(sb6.toString());
                    return;
                }
                StringBuilder sb7 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                sb7.append(this.AFKeystoreWrapper);
                AFLogger.afDebugLog(sb7.toString());
            }
        }
    }

    public AFc1mSDK(ExecutorService executorService) {
        this.valueOf = executorService;
    }

    private void AFInAppEventType(NavigableSet<AFc1lSDK<?>> navigableSet) {
        AFc1lSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
        for (AFc1iSDK aFc1iSDK : this.AFInAppEventType) {
            aFc1iSDK.valueOf(pollFirst);
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFc1mSDK aFc1mSDK) {
        boolean z10;
        synchronized (aFc1mSDK.afRDLog) {
            for (int size = (aFc1mSDK.afRDLog.size() + aFc1mSDK.AFLogger.size()) - 40; size > 0; size--) {
                if (!aFc1mSDK.AFLogger.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isEmpty = true ^ aFc1mSDK.afRDLog.isEmpty();
                if (isEmpty && z10) {
                    if (aFc1mSDK.afRDLog.first().compareTo(aFc1mSDK.AFLogger.first()) > 0) {
                        aFc1mSDK.AFInAppEventType(aFc1mSDK.afRDLog);
                    } else {
                        aFc1mSDK.AFInAppEventType(aFc1mSDK.AFLogger);
                    }
                } else if (isEmpty) {
                    aFc1mSDK.AFInAppEventType(aFc1mSDK.afRDLog);
                } else if (z10) {
                    aFc1mSDK.AFInAppEventType(aFc1mSDK.AFLogger);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(AFc1lSDK<?> aFc1lSDK) {
        return this.AFKeystoreWrapper.containsAll(aFc1lSDK.AFInAppEventType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afRDLog) {
            final AFc1lSDK<?> pollFirst = this.afRDLog.pollFirst();
            if (pollFirst == null) {
                return;
            }
            this.afErrorLog.add(pollFirst);
            long values = pollFirst.values();
            AFc1hSDK aFc1hSDK = new AFc1hSDK(Thread.currentThread());
            if (values > 0) {
                this.afInfoLog.schedule(aFc1hSDK, values);
            }
            this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1mSDK.5
                @Override // java.lang.Runnable
                public final void run() {
                    for (AFc1iSDK aFc1iSDK : AFc1mSDK.this.AFInAppEventType) {
                        aFc1iSDK.AFInAppEventType(pollFirst);
                    }
                }
            });
            if (!this.afRDLog.isEmpty()) {
                this.valueOf.submit(this);
            }
            try {
                AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(pollFirst)));
                final AFc1jSDK call = pollFirst.call();
                aFc1hSDK.cancel();
                this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1mSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                        sb2.append(pollFirst);
                        sb2.append(", result: ");
                        sb2.append(call);
                        AFLogger.afDebugLog(sb2.toString());
                        AFc1mSDK.this.afErrorLog.remove(pollFirst);
                        for (AFc1iSDK aFc1iSDK : AFc1mSDK.this.AFInAppEventType) {
                            aFc1iSDK.valueOf(pollFirst, call);
                        }
                        if (call == AFc1jSDK.SUCCESS) {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        } else if (pollFirst.AFKeystoreWrapper()) {
                            synchronized (AFc1mSDK.this.afRDLog) {
                                AFc1mSDK.this.afDebugLog.add(pollFirst);
                                Iterator<AFc1iSDK> it = AFc1mSDK.this.AFInAppEventType.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        } else {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        }
                    }
                });
            } catch (InterruptedIOException | InterruptedException unused) {
                AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(pollFirst)));
                final AFc1jSDK aFc1jSDK = AFc1jSDK.TIMEOUT;
                pollFirst.valueOf = aFc1jSDK;
                this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1mSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                        sb2.append(pollFirst);
                        sb2.append(", result: ");
                        sb2.append(aFc1jSDK);
                        AFLogger.afDebugLog(sb2.toString());
                        AFc1mSDK.this.afErrorLog.remove(pollFirst);
                        for (AFc1iSDK aFc1iSDK : AFc1mSDK.this.AFInAppEventType) {
                            aFc1iSDK.valueOf(pollFirst, aFc1jSDK);
                        }
                        if (aFc1jSDK == AFc1jSDK.SUCCESS) {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        } else if (pollFirst.AFKeystoreWrapper()) {
                            synchronized (AFc1mSDK.this.afRDLog) {
                                AFc1mSDK.this.afDebugLog.add(pollFirst);
                                Iterator<AFc1iSDK> it = AFc1mSDK.this.AFInAppEventType.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        } else {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        }
                    }
                });
            } catch (Throwable unused2) {
                aFc1hSDK.cancel();
                final AFc1jSDK aFc1jSDK2 = AFc1jSDK.FAILURE;
                this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1mSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("QUEUE: execution finished for ");
                        sb2.append(pollFirst);
                        sb2.append(", result: ");
                        sb2.append(aFc1jSDK2);
                        AFLogger.afDebugLog(sb2.toString());
                        AFc1mSDK.this.afErrorLog.remove(pollFirst);
                        for (AFc1iSDK aFc1iSDK : AFc1mSDK.this.AFInAppEventType) {
                            aFc1iSDK.valueOf(pollFirst, aFc1jSDK2);
                        }
                        if (aFc1jSDK2 == AFc1jSDK.SUCCESS) {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        } else if (pollFirst.AFKeystoreWrapper()) {
                            synchronized (AFc1mSDK.this.afRDLog) {
                                AFc1mSDK.this.afDebugLog.add(pollFirst);
                                Iterator<AFc1iSDK> it = AFc1mSDK.this.AFInAppEventType.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        } else {
                            AFc1mSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventParameterName);
                            AFc1mSDK.values(AFc1mSDK.this);
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ void values(AFc1mSDK aFc1mSDK) {
        synchronized (aFc1mSDK.afRDLog) {
            Iterator<AFc1lSDK<?>> it = aFc1mSDK.AFLogger.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                AFc1lSDK<?> next = it.next();
                if (aFc1mSDK.valueOf(next)) {
                    it.remove();
                    aFc1mSDK.afRDLog.add(next);
                    z10 = true;
                }
            }
            if (z10) {
                aFc1mSDK.valueOf.submit(aFc1mSDK);
            }
        }
    }

    public static /* synthetic */ void valueOf(AFc1mSDK aFc1mSDK, AFc1lSDK aFc1lSDK) {
        for (AFc1kSDK aFc1kSDK : aFc1lSDK.AFKeystoreWrapper) {
            if (aFc1mSDK.values.contains(aFc1kSDK)) {
                aFc1lSDK.AFInAppEventType.add(aFc1kSDK);
            }
        }
    }
}
