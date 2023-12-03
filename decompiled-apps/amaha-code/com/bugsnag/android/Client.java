package com.bugsnag.android;

import android.app.Application;
import android.content.Context;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import com.bugsnag.android.internal.InternalMetricsImpl;
import com.bugsnag.android.internal.InternalMetricsNoop;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.ConfigModule;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.SystemServiceModule;
import hs.k;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import ss.p;
/* loaded from: classes.dex */
public class Client implements MetadataAware, CallbackAware, UserAware, FeatureFlagAware {
    final Context appContext;
    final AppDataCollector appDataCollector;
    final BackgroundTaskService bgTaskService;
    final BreadcrumbState breadcrumbState;
    private final CallbackState callbackState;
    final ClientObservable clientObservable;
    private final Map<String, Object> configDifferences;
    final Connectivity connectivity;
    private final ContextState contextState;
    final DeliveryDelegate deliveryDelegate;
    final DeviceDataCollector deviceDataCollector;
    protected final EventStore eventStore;
    private final ExceptionHandler exceptionHandler;
    final FeatureFlagState featureFlagState;
    final ImmutableConfig immutableConfig;
    private final InternalMetrics internalMetrics;
    final LastRunInfo lastRunInfo;
    final LastRunInfoStore lastRunInfoStore;
    final LaunchCrashTracker launchCrashTracker;
    final Logger logger;
    final MemoryTrimState memoryTrimState;
    final MetadataState metadataState;
    final Notifier notifier;
    PluginClient pluginClient;
    final SessionTracker sessionTracker;
    final SystemBroadcastReceiver systemBroadcastReceiver;
    private final UserState userState;

    public Client(Context context) {
        this(context, Configuration.load(context));
    }

    private void leaveErrorBreadcrumb(Event event) {
        List<Error> errors = event.getErrors();
        if (errors.size() > 0) {
            String errorClass = errors.get(0).getErrorClass();
            String errorMessage = errors.get(0).getErrorMessage();
            HashMap hashMap = new HashMap();
            hashMap.put("errorClass", errorClass);
            hashMap.put("message", errorMessage);
            hashMap.put("unhandled", String.valueOf(event.isUnhandled()));
            hashMap.put("severity", event.getSeverity().toString());
            this.breadcrumbState.add(new Breadcrumb(errorClass, BreadcrumbType.ERROR, hashMap, new Date(), this.logger));
        }
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to client." + str + ", ignoring");
    }

    private void persistRunInfo(final LastRunInfo lastRunInfo) {
        try {
            this.bgTaskService.submitTask(TaskType.IO, new Runnable() { // from class: com.bugsnag.android.Client.4
                @Override // java.lang.Runnable
                public void run() {
                    Client.this.lastRunInfoStore.persist(lastRunInfo);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.w("Failed to persist last run info", e10);
        }
    }

    private void registerComponentCallbacks() {
        this.appContext.registerComponentCallbacks(new ClientComponentCallbacks(this.deviceDataCollector, new p<String, String, k>() { // from class: com.bugsnag.android.Client.5
            @Override // ss.p
            public k invoke(String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("from", str);
                hashMap.put("to", str2);
                Client.this.leaveAutoBreadcrumb("Orientation changed", BreadcrumbType.STATE, hashMap);
                Client.this.clientObservable.postOrientationChange(str2);
                return null;
            }
        }, new p<Boolean, Integer, k>() { // from class: com.bugsnag.android.Client.6
            @Override // ss.p
            public k invoke(Boolean bool, Integer num) {
                Client.this.memoryTrimState.setLowMemory(Boolean.TRUE.equals(bool));
                if (Client.this.memoryTrimState.updateMemoryTrimLevel(num)) {
                    Client client = Client.this;
                    client.leaveAutoBreadcrumb("Trim Memory", BreadcrumbType.STATE, Collections.singletonMap("trimLevel", client.memoryTrimState.getTrimLevelDescription()));
                }
                Client.this.memoryTrimState.emitObservableEvent();
                return null;
            }
        }));
    }

    private boolean setupNdkDirectory() {
        try {
            return ((Boolean) this.bgTaskService.submitTask(TaskType.IO, new Callable<Boolean>() { // from class: com.bugsnag.android.Client.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    File nativeReportPath = NativeInterface.getNativeReportPath();
                    return Boolean.valueOf(nativeReportPath.exists() || nativeReportPath.mkdirs());
                }
            }).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void start() {
        if (this.immutableConfig.getEnabledErrorTypes().getUnhandledExceptions()) {
            this.exceptionHandler.install();
        }
        NativeInterface.setClient(this);
        this.pluginClient.loadPlugins(this);
        NdkPluginCaller ndkPluginCaller = NdkPluginCaller.INSTANCE;
        ndkPluginCaller.setNdkPlugin(this.pluginClient.getNdkPlugin());
        if (this.immutableConfig.getTelemetry().contains(Telemetry.USAGE)) {
            ndkPluginCaller.setInternalMetricsEnabled(true);
        }
        this.eventStore.flushOnLaunch();
        this.eventStore.flushAsync();
        this.sessionTracker.flushAsync();
        this.internalMetrics.setConfigDifferences(this.configDifferences);
        this.callbackState.setInternalMetrics(this.internalMetrics);
        registerLifecycleCallbacks();
        registerComponentCallbacks();
        registerListenersInBackground();
        leaveAutoBreadcrumb("Bugsnag loaded", BreadcrumbType.STATE, Collections.emptyMap());
        this.logger.d("Bugsnag loaded");
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String str) {
        if (str != null) {
            this.featureFlagState.addFeatureFlag(str);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(Iterable<FeatureFlag> iterable) {
        if (iterable != null) {
            this.featureFlagState.addFeatureFlags(iterable);
        } else {
            logNull("addFeatureFlags");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String str, Map<String, ?> map) {
        if (str != null && map != null) {
            this.metadataState.addMetadata(str, map);
        } else {
            logNull("addMetadata");
        }
    }

    public void addObserver(StateObserver stateObserver) {
        this.metadataState.addObserver(stateObserver);
        this.breadcrumbState.addObserver(stateObserver);
        this.sessionTracker.addObserver(stateObserver);
        this.clientObservable.addObserver(stateObserver);
        this.userState.addObserver(stateObserver);
        this.contextState.addObserver(stateObserver);
        this.deliveryDelegate.addObserver(stateObserver);
        this.launchCrashTracker.addObserver(stateObserver);
        this.memoryTrimState.addObserver(stateObserver);
        this.featureFlagState.addObserver(stateObserver);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback) {
        if (onBreadcrumbCallback != null) {
            this.callbackState.addOnBreadcrumb(onBreadcrumbCallback);
        } else {
            logNull("addOnBreadcrumb");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnError(OnErrorCallback onErrorCallback) {
        if (onErrorCallback != null) {
            this.callbackState.addOnError(onErrorCallback);
        } else {
            logNull("addOnError");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void addOnSession(OnSessionCallback onSessionCallback) {
        if (onSessionCallback != null) {
            this.callbackState.addOnSession(onSessionCallback);
        } else {
            logNull("addOnSession");
        }
    }

    public void addRuntimeVersionInfo(String str, String str2) {
        this.deviceDataCollector.addRuntimeVersionInfo(str, str2);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(String str) {
        if (str != null) {
            this.featureFlagState.clearFeatureFlag(str);
        } else {
            logNull("clearFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.featureFlagState.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String str) {
        if (str != null) {
            this.metadataState.clearMetadata(str);
        } else {
            logNull("clearMetadata");
        }
    }

    public void close() {
        this.connectivity.unregisterForNetworkChanges();
        this.bgTaskService.shutdown();
    }

    public void finalize() {
        SystemBroadcastReceiver systemBroadcastReceiver = this.systemBroadcastReceiver;
        if (systemBroadcastReceiver != null) {
            try {
                ContextExtensionsKt.unregisterReceiverSafe(this.appContext, systemBroadcastReceiver, this.logger);
            } catch (IllegalArgumentException unused) {
                this.logger.w("Receiver not registered");
            }
        }
        super.finalize();
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public AppDataCollector getAppDataCollector() {
        return this.appDataCollector;
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbState.copy();
    }

    public String getCodeBundleId() {
        return this.appDataCollector.getCodeBundleId();
    }

    public ImmutableConfig getConfig() {
        return this.immutableConfig;
    }

    public String getContext() {
        return this.contextState.getContext();
    }

    public ContextState getContextState() {
        return this.contextState;
    }

    public DeviceDataCollector getDeviceDataCollector() {
        return this.deviceDataCollector;
    }

    public EventStore getEventStore() {
        return this.eventStore;
    }

    public FeatureFlagState getFeatureFlagState() {
        return this.featureFlagState;
    }

    public LastRunInfo getLastRunInfo() {
        return this.lastRunInfo;
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override // com.bugsnag.android.MetadataAware
    public Map<String, Object> getMetadata(String str) {
        if (str != null) {
            return this.metadataState.getMetadata(str);
        }
        logNull("getMetadata");
        return null;
    }

    public MetadataState getMetadataState() {
        return this.metadataState;
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public Plugin getPlugin(Class cls) {
        return this.pluginClient.findPlugin(cls);
    }

    public SessionTracker getSessionTracker() {
        return this.sessionTracker;
    }

    @Override // com.bugsnag.android.UserAware
    public User getUser() {
        return this.userState.getUser();
    }

    public void leaveAutoBreadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map) {
        if (!this.immutableConfig.shouldDiscardBreadcrumb(breadcrumbType)) {
            this.breadcrumbState.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.logger));
        }
    }

    public void leaveBreadcrumb(String str) {
        if (str != null) {
            this.breadcrumbState.add(new Breadcrumb(str, this.logger));
        } else {
            logNull("leaveBreadcrumb");
        }
    }

    public void markLaunchCompleted() {
        this.launchCrashTracker.markLaunchCompleted();
    }

    public void notify(Throwable th2) {
        notify(th2, null);
    }

    public void notifyInternal(Event event, OnErrorCallback onErrorCallback) {
        event.setRedactedKeys(this.metadataState.getMetadata().getRedactedKeys());
        Session currentSession = this.sessionTracker.getCurrentSession();
        if (currentSession != null && (this.immutableConfig.getAutoTrackSessions() || !currentSession.isAutoCaptured())) {
            event.setSession(currentSession);
        }
        if (this.callbackState.runOnErrorTasks(event, this.logger) && (onErrorCallback == null || onErrorCallback.onError(event))) {
            leaveErrorBreadcrumb(event);
            this.deliveryDelegate.deliver(event);
            return;
        }
        this.logger.d("Skipping notification - onError task returned false");
    }

    public void notifyUnhandledException(Throwable th2, Metadata metadata, String str, String str2) {
        int i6 = 0;
        populateAndNotifyAndroidEvent(new Event(th2, this.immutableConfig, SeverityReason.newInstance(str, Severity.ERROR, str2), Metadata.Companion.merge(this.metadataState.getMetadata(), metadata), this.featureFlagState.getFeatureFlags(), this.logger), null);
        LastRunInfo lastRunInfo = this.lastRunInfo;
        if (lastRunInfo != null) {
            i6 = lastRunInfo.getConsecutiveLaunchCrashes();
        }
        boolean isLaunching = this.launchCrashTracker.isLaunching();
        if (isLaunching) {
            i6++;
        }
        persistRunInfo(new LastRunInfo(i6, true, isLaunching));
        this.bgTaskService.shutdown();
    }

    public void pauseSession() {
        this.sessionTracker.pauseSession();
    }

    public void populateAndNotifyAndroidEvent(Event event, OnErrorCallback onErrorCallback) {
        event.setDevice(this.deviceDataCollector.generateDeviceWithState(new Date().getTime()));
        event.addMetadata("device", this.deviceDataCollector.getDeviceMetadata());
        event.setApp(this.appDataCollector.generateAppWithState());
        event.addMetadata("app", this.appDataCollector.getAppDataMetadata());
        event.setBreadcrumbs(this.breadcrumbState.copy());
        User user = this.userState.getUser();
        event.setUser(user.getId(), user.getEmail(), user.getName());
        event.setContext(this.contextState.getContext());
        event.setInternalMetrics(this.internalMetrics);
        notifyInternal(event, onErrorCallback);
    }

    public void registerLifecycleCallbacks() {
        Context context = this.appContext;
        if (context instanceof Application) {
            Application application = (Application) context;
            application.registerActivityLifecycleCallbacks(new SessionLifecycleCallback(this.sessionTracker));
            if (!this.immutableConfig.shouldDiscardBreadcrumb(BreadcrumbType.STATE)) {
                application.registerActivityLifecycleCallbacks(new ActivityBreadcrumbCollector(new p<String, Map<String, ? extends Object>, k>() { // from class: com.bugsnag.android.Client.2
                    @Override // ss.p
                    public /* bridge */ /* synthetic */ k invoke(String str, Map<String, ? extends Object> map) {
                        return invoke2(str, (Map<String, ?>) map);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public k invoke2(String str, Map<String, ?> map) {
                        Client.this.leaveBreadcrumb(str, map, BreadcrumbType.STATE);
                        return null;
                    }
                }));
            }
        }
    }

    public void registerListenersInBackground() {
        try {
            this.bgTaskService.submitTask(TaskType.DEFAULT, new Runnable() { // from class: com.bugsnag.android.Client.3
                @Override // java.lang.Runnable
                public void run() {
                    Client.this.connectivity.registerForNetworkChanges();
                    Client client = Client.this;
                    SystemBroadcastReceiver.register(client.appContext, client.systemBroadcastReceiver, client.logger);
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.w("Failed to register for system events", e10);
        }
    }

    public void removeObserver(StateObserver stateObserver) {
        this.metadataState.removeObserver(stateObserver);
        this.breadcrumbState.removeObserver(stateObserver);
        this.sessionTracker.removeObserver(stateObserver);
        this.clientObservable.removeObserver(stateObserver);
        this.userState.removeObserver(stateObserver);
        this.contextState.removeObserver(stateObserver);
        this.deliveryDelegate.removeObserver(stateObserver);
        this.launchCrashTracker.removeObserver(stateObserver);
        this.memoryTrimState.removeObserver(stateObserver);
        this.featureFlagState.removeObserver(stateObserver);
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnBreadcrumb(OnBreadcrumbCallback onBreadcrumbCallback) {
        if (onBreadcrumbCallback != null) {
            this.callbackState.removeOnBreadcrumb(onBreadcrumbCallback);
        } else {
            logNull("removeOnBreadcrumb");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnError(OnErrorCallback onErrorCallback) {
        if (onErrorCallback != null) {
            this.callbackState.removeOnError(onErrorCallback);
        } else {
            logNull("removeOnError");
        }
    }

    @Override // com.bugsnag.android.CallbackAware
    public void removeOnSession(OnSessionCallback onSessionCallback) {
        if (onSessionCallback != null) {
            this.callbackState.removeOnSession(onSessionCallback);
        } else {
            logNull("removeOnSession");
        }
    }

    public boolean resumeSession() {
        return this.sessionTracker.resumeSession();
    }

    public void setAutoDetectAnrs(boolean z10) {
        this.pluginClient.setAutoDetectAnrs(this, z10);
    }

    public void setAutoNotify(boolean z10) {
        this.pluginClient.setAutoNotify(this, z10);
        if (z10) {
            this.exceptionHandler.install();
        } else {
            this.exceptionHandler.uninstall();
        }
    }

    public void setBinaryArch(String str) {
        getAppDataCollector().setBinaryArch(str);
    }

    public void setCodeBundleId(String str) {
        this.appDataCollector.setCodeBundleId(str);
    }

    public void setContext(String str) {
        this.contextState.setManualContext(str);
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(String str, String str2, String str3) {
        this.userState.setUser(new User(str, str2, str3));
    }

    public void setupNdkPlugin() {
        int i6;
        if (!setupNdkDirectory()) {
            this.logger.w("Failed to setup NDK directory.");
            return;
        }
        String absolutePath = this.lastRunInfoStore.getFile().getAbsolutePath();
        LastRunInfo lastRunInfo = this.lastRunInfo;
        if (lastRunInfo != null) {
            i6 = lastRunInfo.getConsecutiveLaunchCrashes();
        } else {
            i6 = 0;
        }
        this.clientObservable.postNdkInstall(this.immutableConfig, absolutePath, i6);
        syncInitialState();
        this.clientObservable.postNdkDeliverPending();
    }

    public void startSession() {
        this.sessionTracker.startSession(false);
    }

    public void syncInitialState() {
        this.metadataState.emitObservableEvent();
        this.contextState.emitObservableEvent();
        this.userState.emitObservableEvent();
        this.memoryTrimState.emitObservableEvent();
        this.featureFlagState.emitObservableEvent();
    }

    public Client(Context context, String str) {
        this(context, Configuration.load(context, str));
    }

    public void notify(Throwable th2, OnErrorCallback onErrorCallback) {
        if (th2 != null) {
            if (this.immutableConfig.shouldDiscardError(th2)) {
                return;
            }
            populateAndNotifyAndroidEvent(new Event(th2, this.immutableConfig, SeverityReason.newInstance("handledException"), this.metadataState.getMetadata(), this.featureFlagState.getFeatureFlags(), this.logger), onErrorCallback);
            return;
        }
        logNull("notify");
    }

    public Client(Context context, Configuration configuration) {
        MemoryTrimState memoryTrimState = new MemoryTrimState();
        this.memoryTrimState = memoryTrimState;
        BackgroundTaskService backgroundTaskService = new BackgroundTaskService();
        this.bgTaskService = backgroundTaskService;
        ContextModule contextModule = new ContextModule(context);
        Context ctx = contextModule.getCtx();
        this.appContext = ctx;
        Notifier notifier = configuration.getNotifier();
        this.notifier = notifier;
        ConnectivityCompat connectivityCompat = new ConnectivityCompat(ctx, new p<Boolean, String, k>() { // from class: com.bugsnag.android.Client.1
            @Override // ss.p
            public k invoke(Boolean bool, String str) {
                HashMap hashMap = new HashMap();
                hashMap.put("hasConnection", bool);
                hashMap.put("networkState", str);
                Client.this.leaveAutoBreadcrumb("Connectivity changed", BreadcrumbType.STATE, hashMap);
                if (bool.booleanValue()) {
                    Client.this.eventStore.flushAsync();
                    Client.this.sessionTracker.flushAsync();
                    return null;
                }
                return null;
            }
        });
        this.connectivity = connectivityCompat;
        ConfigModule configModule = new ConfigModule(contextModule, configuration, connectivityCompat);
        ImmutableConfig config = configModule.getConfig();
        this.immutableConfig = config;
        Logger logger = config.getLogger();
        this.logger = logger;
        if (!(context instanceof Application)) {
            logger.w("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        StorageModule storageModule = new StorageModule(ctx, config, logger);
        BugsnagStateModule bugsnagStateModule = new BugsnagStateModule(config, configuration);
        this.clientObservable = bugsnagStateModule.getClientObservable();
        CallbackState callbackState = bugsnagStateModule.getCallbackState();
        this.callbackState = callbackState;
        this.breadcrumbState = bugsnagStateModule.getBreadcrumbState();
        this.contextState = bugsnagStateModule.getContextState();
        this.metadataState = bugsnagStateModule.getMetadataState();
        this.featureFlagState = bugsnagStateModule.getFeatureFlagState();
        SystemServiceModule systemServiceModule = new SystemServiceModule(contextModule);
        TaskType taskType = TaskType.IO;
        storageModule.resolveDependencies(backgroundTaskService, taskType);
        TrackerModule trackerModule = new TrackerModule(configModule, storageModule, this, backgroundTaskService, callbackState);
        this.launchCrashTracker = trackerModule.getLaunchCrashTracker();
        this.sessionTracker = trackerModule.getSessionTracker();
        DataCollectionModule dataCollectionModule = new DataCollectionModule(contextModule, configModule, systemServiceModule, trackerModule, backgroundTaskService, connectivityCompat, storageModule.getDeviceId(), storageModule.getInternalDeviceId(), memoryTrimState);
        dataCollectionModule.resolveDependencies(backgroundTaskService, taskType);
        this.appDataCollector = dataCollectionModule.getAppDataCollector();
        this.deviceDataCollector = dataCollectionModule.getDeviceDataCollector();
        this.userState = storageModule.getUserStore().load(configuration.getUser());
        storageModule.getSharedPrefMigrator().deleteLegacyPrefs();
        EventStorageModule eventStorageModule = new EventStorageModule(contextModule, configModule, dataCollectionModule, backgroundTaskService, trackerModule, systemServiceModule, notifier, callbackState);
        eventStorageModule.resolveDependencies(backgroundTaskService, taskType);
        EventStore eventStore = eventStorageModule.getEventStore();
        this.eventStore = eventStore;
        this.deliveryDelegate = new DeliveryDelegate(logger, eventStore, config, callbackState, notifier, backgroundTaskService);
        this.exceptionHandler = new ExceptionHandler(this, logger);
        this.lastRunInfoStore = storageModule.getLastRunInfoStore();
        this.lastRunInfo = storageModule.getLastRunInfo();
        this.pluginClient = new PluginClient(configuration.getPlugins(), config, logger);
        if (configuration.getTelemetry().contains(Telemetry.USAGE)) {
            this.internalMetrics = new InternalMetricsImpl();
        } else {
            this.internalMetrics = new InternalMetricsNoop();
        }
        this.configDifferences = configuration.impl.getConfigDifferences();
        this.systemBroadcastReceiver = new SystemBroadcastReceiver(this, logger);
        start();
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(String str, String str2) {
        if (str != null) {
            this.featureFlagState.addFeatureFlag(str, str2);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(String str, String str2, Object obj) {
        if (str != null && str2 != null) {
            this.metadataState.addMetadata(str, str2, obj);
        } else {
            logNull("addMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(String str, String str2) {
        if (str != null && str2 != null) {
            this.metadataState.clearMetadata(str, str2);
        } else {
            logNull("clearMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public Object getMetadata(String str, String str2) {
        if (str != null && str2 != null) {
            return this.metadataState.getMetadata(str, str2);
        }
        logNull("getMetadata");
        return null;
    }

    public void leaveBreadcrumb(String str, Map<String, Object> map, BreadcrumbType breadcrumbType) {
        if (str != null && breadcrumbType != null && map != null) {
            this.breadcrumbState.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.logger));
        } else {
            logNull("leaveBreadcrumb");
        }
    }

    public Map<String, Object> getMetadata() {
        return this.metadataState.getMetadata().toMap();
    }

    public Client(ImmutableConfig immutableConfig, MetadataState metadataState, ContextState contextState, CallbackState callbackState, UserState userState, FeatureFlagState featureFlagState, ClientObservable clientObservable, Context context, DeviceDataCollector deviceDataCollector, AppDataCollector appDataCollector, BreadcrumbState breadcrumbState, EventStore eventStore, SystemBroadcastReceiver systemBroadcastReceiver, SessionTracker sessionTracker, Connectivity connectivity, Logger logger, DeliveryDelegate deliveryDelegate, LastRunInfoStore lastRunInfoStore, LaunchCrashTracker launchCrashTracker, ExceptionHandler exceptionHandler, Notifier notifier) {
        this.memoryTrimState = new MemoryTrimState();
        this.bgTaskService = new BackgroundTaskService();
        this.immutableConfig = immutableConfig;
        this.metadataState = metadataState;
        this.contextState = contextState;
        this.callbackState = callbackState;
        this.userState = userState;
        this.featureFlagState = featureFlagState;
        this.clientObservable = clientObservable;
        this.appContext = context;
        this.deviceDataCollector = deviceDataCollector;
        this.appDataCollector = appDataCollector;
        this.breadcrumbState = breadcrumbState;
        this.eventStore = eventStore;
        this.systemBroadcastReceiver = systemBroadcastReceiver;
        this.sessionTracker = sessionTracker;
        this.connectivity = connectivity;
        this.logger = logger;
        this.deliveryDelegate = deliveryDelegate;
        this.lastRunInfoStore = lastRunInfoStore;
        this.launchCrashTracker = launchCrashTracker;
        this.lastRunInfo = null;
        this.exceptionHandler = exceptionHandler;
        this.notifier = notifier;
        this.internalMetrics = new InternalMetricsNoop();
        this.configDifferences = new HashMap();
    }
}
