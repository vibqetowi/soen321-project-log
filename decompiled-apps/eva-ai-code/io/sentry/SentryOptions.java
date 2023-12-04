package io.sentry;

import io.sentry.cache.IEnvelopeCache;
import io.sentry.config.PropertiesProvider;
import io.sentry.protocol.SdkVersion;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.Platform;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes4.dex */
public class SentryOptions {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String PROXY_PORT_DEFAULT = "80";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private BeforeBreadcrumbCallback beforeBreadcrumb;
    private BeforeSendCallback beforeSend;
    private String cacheDirPath;
    private int connectionTimeoutMillis;
    private Boolean debug;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private boolean enableAutoSessionTracking;
    private Boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private Boolean enableUncaughtExceptionHandler;
    private IEnvelopeCache envelopeDiskCache;
    private IEnvelopeReader envelopeReader;
    private String environment;
    private final List<EventProcessor> eventProcessors;
    private ISentryExecutorService executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final List<Integration> integrations;
    private ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxQueueSize;
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private final List<IScopeObserver> observers;
    private Boolean printUncaughtStackTrace;
    private String proguardUuid;
    private Proxy proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private SdkVersion sdkVersion;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private ISerializer serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeout;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private TracesSamplerCallback tracesSampler;
    private final List<String> tracingOrigins;
    private ITransportFactory transportFactory;
    private ITransportGate transportGate;

    /* loaded from: classes4.dex */
    public interface BeforeBreadcrumbCallback {
        Breadcrumb execute(Breadcrumb breadcrumb, Object obj);
    }

    /* loaded from: classes4.dex */
    public interface BeforeSendCallback {
        SentryEvent execute(SentryEvent sentryEvent, Object obj);
    }

    /* loaded from: classes4.dex */
    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* loaded from: classes4.dex */
    public interface TracesSamplerCallback {
        Double sample(SamplingContext samplingContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SentryOptions from(PropertiesProvider propertiesProvider, ILogger iLogger) {
        SentryOptions sentryOptions = new SentryOptions();
        sentryOptions.setDsn(propertiesProvider.getProperty("dsn"));
        sentryOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        sentryOptions.setRelease(propertiesProvider.getProperty("release"));
        sentryOptions.setDist(propertiesProvider.getProperty("dist"));
        sentryOptions.setServerName(propertiesProvider.getProperty("servername"));
        sentryOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        sentryOptions.setPrintUncaughtStackTrace(propertiesProvider.getBooleanProperty("uncaught.handler.print-stacktrace"));
        sentryOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        sentryOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        sentryOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        String property = propertiesProvider.getProperty("max-request-body-size");
        if (property != null) {
            sentryOptions.setMaxRequestBodySize(RequestSize.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : propertiesProvider.getMap("tags").entrySet()) {
            sentryOptions.setTag(entry.getKey(), entry.getValue());
        }
        String property2 = propertiesProvider.getProperty("proxy.host");
        String property3 = propertiesProvider.getProperty("proxy.user");
        String property4 = propertiesProvider.getProperty("proxy.pass");
        String property5 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property2 != null) {
            sentryOptions.setProxy(new Proxy(property2, property5, property3, property4));
        }
        for (String str : propertiesProvider.getList("in-app-includes")) {
            sentryOptions.addInAppInclude(str);
        }
        for (String str2 : propertiesProvider.getList("in-app-excludes")) {
            sentryOptions.addInAppExclude(str2);
        }
        for (String str3 : propertiesProvider.getList("tracing-origins")) {
            sentryOptions.addTracingOrigin(str3);
        }
        sentryOptions.setProguardUuid(propertiesProvider.getProperty("proguard-uuid"));
        for (String str4 : propertiesProvider.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str4);
                if (Throwable.class.isAssignableFrom(cls)) {
                    sentryOptions.addIgnoredExceptionForType(cls);
                } else {
                    iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str4, str4);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str4, str4);
            }
        }
        return sentryOptions;
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public String getDsn() {
        return this.dsn;
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public boolean isDebug() {
        return Boolean.TRUE.equals(this.debug);
    }

    public void setDebug(Boolean bool) {
        this.debug = bool;
    }

    private Boolean getDebug() {
        return this.debug;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, iLogger);
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public ISerializer getSerializer() {
        return this.serializer;
    }

    public void setSerializer(ISerializer iSerializer) {
        if (iSerializer == null) {
            iSerializer = NoOpSerializer.getInstance();
        }
        this.serializer = iSerializer;
    }

    public IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader;
    }

    public void setEnvelopeReader(IEnvelopeReader iEnvelopeReader) {
        if (iEnvelopeReader == null) {
            iEnvelopeReader = NoOpEnvelopeReader.getInstance();
        }
        this.envelopeReader = iEnvelopeReader;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public long getShutdownTimeout() {
        return this.shutdownTimeout;
    }

    public void setShutdownTimeout(long j) {
        this.shutdownTimeout = j;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    public void setBeforeSend(BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public void setBeforeBreadcrumb(BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public String getCacheDirPath() {
        return this.cacheDirPath;
    }

    public String getOutboxPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath + File.separator + "outbox";
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    @Deprecated
    public int getCacheDirSize() {
        return this.maxCacheItems;
    }

    @Deprecated
    public void setCacheDirSize(int i) {
        this.maxCacheItems = i;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public String getRelease() {
        return this.release;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(Double d) {
        if (d != null && (d.doubleValue() > 1.0d || d.doubleValue() <= 0.0d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
        }
        this.sampleRate = d;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public void setTracesSampleRate(Double d) {
        if (d != null && (d.doubleValue() > 1.0d || d.doubleValue() < 0.0d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
        this.tracesSampleRate = d;
    }

    public TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    public void setTracesSampler(TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    public void setTransportFactory(ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public String getDist() {
        return this.dist;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public ITransportGate getTransportGate() {
        return this.transportGate;
    }

    public void setTransportGate(ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    @Deprecated
    public boolean isEnableSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    @Deprecated
    public void setEnableSessionTracking(boolean z) {
        setEnableAutoSessionTracking(z);
    }

    public String getServerName() {
        return this.serverName;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return Boolean.TRUE.equals(this.enableUncaughtExceptionHandler);
    }

    public Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public void setEnableUncaughtExceptionHandler(Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public boolean isPrintUncaughtStackTrace() {
        return Boolean.TRUE.equals(this.printUncaughtStackTrace);
    }

    public Boolean getPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public void setPrintUncaughtStackTrace(Boolean bool) {
        this.printUncaughtStackTrace = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    void setExecutorService(ISentryExecutorService iSentryExecutorService) {
        if (iSentryExecutorService != null) {
            this.executorService = iSentryExecutorService;
        }
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public void setEnvelopeDiskCache(IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setSdkVersion(SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void addScopeObserver(IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public boolean isEnableDeduplication() {
        return Boolean.TRUE.equals(this.enableDeduplication);
    }

    private Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    public void setEnableDeduplication(Boolean bool) {
        this.enableDeduplication = bool;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public void setMaxRequestBodySize(RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public List<String> getTracingOrigins() {
        return this.tracingOrigins;
    }

    public void addTracingOrigin(String str) {
        this.tracingOrigins.add(str);
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public SentryOptions() {
        this(false);
    }

    private SentryOptions(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeout = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new EnvelopeReader();
        this.serializer = new GsonSerializer(this);
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = NoOpTransportFactory.getInstance();
        this.transportGate = NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = NoOpSentryExecutorService.getInstance();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.tracingOrigins = new CopyOnWriteArrayList();
        if (z) {
            return;
        }
        this.executorService = new SentryExecutorService();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new MainEventProcessor(this));
        copyOnWriteArrayList.add(new DuplicateEventDetectionEventProcessor(this));
        if (Platform.isJvm()) {
            copyOnWriteArrayList.add(new SentryRuntimeEventProcessor());
        }
        setSentryClientName("sentry.java/5.7.3");
        setSdkVersion(createSdkVersion());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void merge(SentryOptions sentryOptions) {
        if (sentryOptions.getDsn() != null) {
            setDsn(sentryOptions.getDsn());
        }
        if (sentryOptions.getEnvironment() != null) {
            setEnvironment(sentryOptions.getEnvironment());
        }
        if (sentryOptions.getRelease() != null) {
            setRelease(sentryOptions.getRelease());
        }
        if (sentryOptions.getDist() != null) {
            setDist(sentryOptions.getDist());
        }
        if (sentryOptions.getServerName() != null) {
            setServerName(sentryOptions.getServerName());
        }
        if (sentryOptions.getProxy() != null) {
            setProxy(sentryOptions.getProxy());
        }
        if (sentryOptions.getEnableUncaughtExceptionHandler() != null) {
            setEnableUncaughtExceptionHandler(sentryOptions.getEnableUncaughtExceptionHandler());
        }
        if (sentryOptions.getPrintUncaughtStackTrace() != null) {
            setPrintUncaughtStackTrace(sentryOptions.getPrintUncaughtStackTrace());
        }
        if (sentryOptions.getTracesSampleRate() != null) {
            setTracesSampleRate(sentryOptions.getTracesSampleRate());
        }
        if (sentryOptions.getDebug() != null) {
            setDebug(sentryOptions.getDebug());
        }
        if (sentryOptions.getEnableDeduplication() != null) {
            setEnableDeduplication(sentryOptions.getEnableDeduplication());
        }
        for (Map.Entry entry : new HashMap(sentryOptions.getTags()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (String str : new ArrayList(sentryOptions.getInAppIncludes())) {
            addInAppInclude(str);
        }
        for (String str2 : new ArrayList(sentryOptions.getInAppExcludes())) {
            addInAppExclude(str2);
        }
        Iterator it = new HashSet(sentryOptions.getIgnoredExceptionsForType()).iterator();
        while (it.hasNext()) {
            addIgnoredExceptionForType((Class) it.next());
        }
        for (String str3 : new ArrayList(sentryOptions.getTracingOrigins())) {
            addTracingOrigin(str3);
        }
        if (sentryOptions.getProguardUuid() != null) {
            setProguardUuid(sentryOptions.getProguardUuid());
        }
    }

    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersion = new SdkVersion(BuildConfig.SENTRY_JAVA_SDK_NAME, "5.7.3");
        sdkVersion.setVersion("5.7.3");
        sdkVersion.addPackage("maven:io.sentry:sentry", "5.7.3");
        return sdkVersion;
    }

    /* loaded from: classes4.dex */
    public static final class Proxy {
        private String host;
        private String pass;
        private String port;
        private String user;

        public Proxy(String str, String str2, String str3, String str4) {
            this.host = str;
            this.port = str2;
            this.user = str3;
            this.pass = str4;
        }

        public Proxy() {
            this(null, null, null, null);
        }

        public Proxy(String str, String str2) {
            this(str, str2, null, null);
        }

        public String getHost() {
            return this.host;
        }

        public void setHost(String str) {
            this.host = str;
        }

        public String getPort() {
            return this.port;
        }

        public void setPort(String str) {
            this.port = str;
        }

        public String getUser() {
            return this.user;
        }

        public void setUser(String str) {
            this.user = str;
        }

        public String getPass() {
            return this.pass;
        }

        public void setPass(String str) {
            this.pass = str;
        }
    }
}
