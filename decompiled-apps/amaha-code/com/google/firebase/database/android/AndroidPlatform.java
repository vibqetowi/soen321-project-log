package com.google.firebase.database.android;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.connection.PersistentConnectionImpl;
import com.google.firebase.database.core.EventTarget;
import com.google.firebase.database.core.Platform;
import com.google.firebase.database.core.RunLoop;
import com.google.firebase.database.core.persistence.DefaultPersistenceManager;
import com.google.firebase.database.core.persistence.LRUCachePolicy;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.AndroidLogger;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sc.e;
/* loaded from: classes.dex */
public class AndroidPlatform implements Platform {
    private static final String APP_IN_BACKGROUND_INTERRUPT_REASON = "app_in_background";
    private final Context applicationContext;
    private final Set<String> createdPersistenceCaches = new HashSet();
    private final sc.e firebaseApp;

    public AndroidPlatform(sc.e eVar) {
        this.firebaseApp = eVar;
        if (eVar != null) {
            eVar.b();
            this.applicationContext = eVar.f31432a;
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    @Override // com.google.firebase.database.core.Platform
    public PersistenceManager createPersistenceManager(com.google.firebase.database.core.Context context, String str) {
        String sessionPersistenceKey = context.getSessionPersistenceKey();
        String f = defpackage.d.f(str, "_", sessionPersistenceKey);
        if (!this.createdPersistenceCaches.contains(f)) {
            this.createdPersistenceCaches.add(f);
            return new DefaultPersistenceManager(context, new SqlPersistenceStorageEngine(this.applicationContext, context, f), new LRUCachePolicy(context.getPersistenceCacheSizeBytes()));
        }
        throw new DatabaseException(defpackage.b.m("SessionPersistenceKey '", sessionPersistenceKey, "' has already been used."));
    }

    @Override // com.google.firebase.database.core.Platform
    public String getPlatformVersion() {
        return "android-" + FirebaseDatabase.getSdkVersion();
    }

    @Override // com.google.firebase.database.core.Platform
    public File getSSLCacheDirectory() {
        return this.applicationContext.getApplicationContext().getDir("sslcache", 0);
    }

    @Override // com.google.firebase.database.core.Platform
    public String getUserAgent(com.google.firebase.database.core.Context context) {
        return pl.a.g(new StringBuilder(), Build.VERSION.SDK_INT, "/Android");
    }

    @Override // com.google.firebase.database.core.Platform
    public EventTarget newEventTarget(com.google.firebase.database.core.Context context) {
        return new AndroidEventTarget();
    }

    @Override // com.google.firebase.database.core.Platform
    public Logger newLogger(com.google.firebase.database.core.Context context, Logger.Level level, List<String> list) {
        return new AndroidLogger(level, list);
    }

    @Override // com.google.firebase.database.core.Platform
    public PersistentConnection newPersistentConnection(com.google.firebase.database.core.Context context, ConnectionContext connectionContext, HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        final PersistentConnectionImpl persistentConnectionImpl = new PersistentConnectionImpl(connectionContext, hostInfo, delegate);
        this.firebaseApp.a(new e.a() { // from class: com.google.firebase.database.android.AndroidPlatform.2
            @Override // sc.e.a
            public void onBackgroundStateChanged(boolean z10) {
                if (z10) {
                    persistentConnectionImpl.interrupt(AndroidPlatform.APP_IN_BACKGROUND_INTERRUPT_REASON);
                } else {
                    persistentConnectionImpl.resume(AndroidPlatform.APP_IN_BACKGROUND_INTERRUPT_REASON);
                }
            }
        });
        return persistentConnectionImpl;
    }

    @Override // com.google.firebase.database.core.Platform
    public RunLoop newRunLoop(com.google.firebase.database.core.Context context) {
        final LogWrapper logger = context.getLogger("RunLoop");
        return new DefaultRunLoop() { // from class: com.google.firebase.database.android.AndroidPlatform.1
            @Override // com.google.firebase.database.core.utilities.DefaultRunLoop
            public void handleException(final Throwable th2) {
                final String messageForException = DefaultRunLoop.messageForException(th2);
                logger.error(messageForException, th2);
                new Handler(AndroidPlatform.this.applicationContext.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.database.android.AndroidPlatform.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException(messageForException, th2);
                    }
                });
                getExecutorService().shutdownNow();
            }
        };
    }
}
