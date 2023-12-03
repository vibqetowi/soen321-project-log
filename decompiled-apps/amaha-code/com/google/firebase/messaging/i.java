package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.l0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: EnhancedIntentService.java */
/* loaded from: classes.dex */
public abstract class i extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    /* compiled from: EnhancedIntentService.java */
    /* loaded from: classes.dex */
    public class a implements l0.a {
        public a() {
            i.this = r1;
        }
    }

    public i() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ba.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static /* synthetic */ void b(i iVar, Intent intent, ya.i iVar2) {
        iVar.lambda$processIntent$0(intent, iVar2);
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            k0.b(intent);
        }
        synchronized (this.lock) {
            int i6 = this.runningTasks - 1;
            this.runningTasks = i6;
            if (i6 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, ya.h hVar) {
        finishTask(intent);
    }

    public /* synthetic */ void lambda$processIntent$0(Intent intent, ya.i iVar) {
        try {
            handleIntent(intent);
        } finally {
            iVar.b(null);
        }
    }

    public ya.h<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return ya.k.e(null);
        }
        ya.i iVar = new ya.i();
        this.executor.execute(new androidx.emoji2.text.g(14, this, intent, iVar));
        return iVar.f38392a;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new l0(new a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        synchronized (this.lock) {
            this.lastStartId = i10;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        ya.h<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(new oe.f(1), new h(this, 0, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i6) {
        return stopSelfResult(i6);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
