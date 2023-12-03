package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.android.AndroidPlatform;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.ConnectionTokenProvider;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import sc.e;
import v9.o;
/* loaded from: classes.dex */
public class Context {
    private static final long DEFAULT_CACHE_SIZE = 10485760;
    protected TokenProvider appCheckTokenProvider;
    protected TokenProvider authTokenProvider;
    protected EventTarget eventTarget;
    protected e firebaseApp;
    private PersistenceManager forcedPersistenceManager;
    protected List<String> loggedComponents;
    protected Logger logger;
    protected boolean persistenceEnabled;
    protected String persistenceKey;
    private Platform platform;
    protected RunLoop runLoop;
    protected String userAgent;
    protected Logger.Level logLevel = Logger.Level.INFO;
    protected long cacheSize = DEFAULT_CACHE_SIZE;
    private boolean frozen = false;
    private boolean stopped = false;

    /* renamed from: com.google.firebase.database.core.Context$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements TokenProvider.GetTokenCompletionListener {
        final /* synthetic */ ConnectionTokenProvider.GetTokenCallback val$callback;
        final /* synthetic */ ScheduledExecutorService val$executorService;

        public AnonymousClass1(ScheduledExecutorService scheduledExecutorService, ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
            this.val$executorService = scheduledExecutorService;
            this.val$callback = getTokenCallback;
        }

        @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
        public void onError(String str) {
            this.val$executorService.execute(new b(this.val$callback, 0, str));
        }

        @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
        public void onSuccess(String str) {
            this.val$executorService.execute(new b(this.val$callback, 1, str));
        }
    }

    private String buildUserAgent(String str) {
        return "Firebase/5/" + FirebaseDatabase.getSdkVersion() + "/" + str;
    }

    private void ensureAppTokenProvider() {
        o.i(this.appCheckTokenProvider, "You must register an appCheckTokenProvider before initializing Context.");
    }

    private void ensureAuthTokenProvider() {
        o.i(this.authTokenProvider, "You must register an authTokenProvider before initializing Context.");
    }

    private void ensureEventTarget() {
        if (this.eventTarget == null) {
            this.eventTarget = getPlatform().newEventTarget(this);
        }
    }

    private void ensureLogger() {
        if (this.logger == null) {
            this.logger = getPlatform().newLogger(this, this.logLevel, this.loggedComponents);
        }
    }

    private void ensureRunLoop() {
        if (this.runLoop == null) {
            this.runLoop = this.platform.newRunLoop(this);
        }
    }

    private void ensureSessionIdentifier() {
        if (this.persistenceKey == null) {
            this.persistenceKey = "default";
        }
    }

    private void ensureUserAgent() {
        if (this.userAgent == null) {
            this.userAgent = buildUserAgent(getPlatform().getUserAgent(this));
        }
    }

    private ScheduledExecutorService getExecutorService() {
        RunLoop runLoop = getRunLoop();
        if (runLoop instanceof DefaultRunLoop) {
            return ((DefaultRunLoop) runLoop).getExecutorService();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private Platform getPlatform() {
        if (this.platform == null) {
            initializeAndroidPlatform();
        }
        return this.platform;
    }

    private void initServices() {
        ensureLogger();
        getPlatform();
        ensureUserAgent();
        ensureEventTarget();
        ensureRunLoop();
        ensureSessionIdentifier();
        ensureAuthTokenProvider();
        ensureAppTokenProvider();
    }

    private synchronized void initializeAndroidPlatform() {
        this.platform = new AndroidPlatform(this.firebaseApp);
    }

    public static /* synthetic */ void lambda$wrapTokenProvider$0(TokenProvider tokenProvider, ScheduledExecutorService scheduledExecutorService, boolean z10, ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
        tokenProvider.getToken(z10, new AnonymousClass1(scheduledExecutorService, getTokenCallback));
    }

    private void restartServices() {
        this.eventTarget.restart();
        this.runLoop.restart();
    }

    private static ConnectionTokenProvider wrapTokenProvider(final TokenProvider tokenProvider, final ScheduledExecutorService scheduledExecutorService) {
        return new ConnectionTokenProvider() { // from class: com.google.firebase.database.core.a
            @Override // com.google.firebase.database.connection.ConnectionTokenProvider
            public final void getToken(boolean z10, ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
                Context.lambda$wrapTokenProvider$0(TokenProvider.this, scheduledExecutorService, z10, getTokenCallback);
            }
        };
    }

    public void assertUnfrozen() {
        if (!isFrozen()) {
            return;
        }
        throw new DatabaseException("Modifications to DatabaseConfig objects must occur before they are in use");
    }

    public void forcePersistenceManager(PersistenceManager persistenceManager) {
        this.forcedPersistenceManager = persistenceManager;
    }

    public synchronized void freeze() {
        if (!this.frozen) {
            this.frozen = true;
            initServices();
        }
    }

    public TokenProvider getAppCheckTokenProvider() {
        return this.appCheckTokenProvider;
    }

    public TokenProvider getAuthTokenProvider() {
        return this.authTokenProvider;
    }

    public ConnectionContext getConnectionContext() {
        Logger logger = getLogger();
        ConnectionTokenProvider wrapTokenProvider = wrapTokenProvider(getAuthTokenProvider(), getExecutorService());
        ConnectionTokenProvider wrapTokenProvider2 = wrapTokenProvider(getAppCheckTokenProvider(), getExecutorService());
        ScheduledExecutorService executorService = getExecutorService();
        boolean isPersistenceEnabled = isPersistenceEnabled();
        String sdkVersion = FirebaseDatabase.getSdkVersion();
        String userAgent = getUserAgent();
        e eVar = this.firebaseApp;
        eVar.b();
        return new ConnectionContext(logger, wrapTokenProvider, wrapTokenProvider2, executorService, isPersistenceEnabled, sdkVersion, userAgent, eVar.f31434c.f31445b, getSSLCacheDirectory().getAbsolutePath());
    }

    public EventTarget getEventTarget() {
        return this.eventTarget;
    }

    public Logger.Level getLogLevel() {
        return this.logLevel;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public List<String> getOptDebugLogComponents() {
        return this.loggedComponents;
    }

    public long getPersistenceCacheSizeBytes() {
        return this.cacheSize;
    }

    public PersistenceManager getPersistenceManager(String str) {
        PersistenceManager persistenceManager = this.forcedPersistenceManager;
        if (persistenceManager != null) {
            return persistenceManager;
        }
        if (this.persistenceEnabled) {
            PersistenceManager createPersistenceManager = this.platform.createPersistenceManager(this, str);
            if (createPersistenceManager != null) {
                return createPersistenceManager;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new NoopPersistenceManager();
    }

    public String getPlatformVersion() {
        return getPlatform().getPlatformVersion();
    }

    public RunLoop getRunLoop() {
        return this.runLoop;
    }

    public File getSSLCacheDirectory() {
        return getPlatform().getSSLCacheDirectory();
    }

    public String getSessionPersistenceKey() {
        return this.persistenceKey;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isFrozen() {
        return this.frozen;
    }

    public boolean isPersistenceEnabled() {
        return this.persistenceEnabled;
    }

    public boolean isStopped() {
        return this.stopped;
    }

    public PersistentConnection newPersistentConnection(HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        return getPlatform().newPersistentConnection(this, getConnectionContext(), hostInfo, delegate);
    }

    public void requireStarted() {
        if (this.stopped) {
            restartServices();
            this.stopped = false;
        }
    }

    public void stop() {
        this.stopped = true;
        this.eventTarget.shutdown();
        this.runLoop.shutdown();
    }

    public LogWrapper getLogger(String str) {
        return new LogWrapper(this.logger, str);
    }

    public LogWrapper getLogger(String str, String str2) {
        return new LogWrapper(this.logger, str, str2);
    }
}
