package io.sentry;

import io.sentry.hints.Cached;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class MainEventProcessor implements EventProcessor, Closeable {
    private static final String DEFAULT_ENVIRONMENT = "production";
    private final HostnameCache hostnameCache;
    private final SentryOptions options;
    private final SentryExceptionFactory sentryExceptionFactory;
    private final SentryThreadFactory sentryThreadFactory;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MainEventProcessor(SentryOptions sentryOptions) {
        this(sentryOptions, sentryOptions.isAttachServerName() ? HostnameCache.getInstance() : null);
    }

    MainEventProcessor(SentryOptions sentryOptions, HostnameCache hostnameCache) {
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.options = sentryOptions2;
        this.hostnameCache = hostnameCache;
        SentryStackTraceFactory sentryStackTraceFactory = new SentryStackTraceFactory(sentryOptions2.getInAppExcludes(), sentryOptions2.getInAppIncludes());
        this.sentryExceptionFactory = new SentryExceptionFactory(sentryStackTraceFactory);
        this.sentryThreadFactory = new SentryThreadFactory(sentryStackTraceFactory, sentryOptions2);
    }

    MainEventProcessor(SentryOptions sentryOptions, SentryThreadFactory sentryThreadFactory, SentryExceptionFactory sentryExceptionFactory, HostnameCache hostnameCache) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.sentryThreadFactory = (SentryThreadFactory) Objects.requireNonNull(sentryThreadFactory, "The SentryThreadFactory is required.");
        this.sentryExceptionFactory = (SentryExceptionFactory) Objects.requireNonNull(sentryExceptionFactory, "The SentryExceptionFactory is required.");
        this.hostnameCache = (HostnameCache) Objects.requireNonNull(hostnameCache, "The HostnameCache is required");
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        setCommons(sentryEvent);
        setExceptions(sentryEvent);
        setDebugMeta(sentryEvent);
        if (shouldApplyScopeData(sentryEvent, obj)) {
            processNonCachedEvent(sentryEvent);
            setThreads(sentryEvent, obj);
        }
        return sentryEvent;
    }

    private void setDebugMeta(SentryEvent sentryEvent) {
        if (this.options.getProguardUuid() != null) {
            DebugMeta debugMeta = sentryEvent.getDebugMeta();
            if (debugMeta == null) {
                debugMeta = new DebugMeta();
            }
            if (debugMeta.getImages() == null) {
                debugMeta.setImages(new ArrayList());
            }
            List<DebugImage> images = debugMeta.getImages();
            if (images != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(this.options.getProguardUuid());
                images.add(debugImage);
                sentryEvent.setDebugMeta(debugMeta);
            }
        }
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Object obj) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent) {
        setRelease(sentryBaseEvent);
        setEnvironment(sentryBaseEvent);
        setServerName(sentryBaseEvent);
        setDist(sentryBaseEvent);
        setSdk(sentryBaseEvent);
        setTags(sentryBaseEvent);
        mergeUser(sentryBaseEvent);
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        setCommons(sentryTransaction);
        if (shouldApplyScopeData(sentryTransaction, obj)) {
            processNonCachedEvent(sentryTransaction);
        }
        return sentryTransaction;
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent) {
        setPlatform(sentryBaseEvent);
    }

    private void setPlatform(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform(SentryBaseEvent.DEFAULT_PLATFORM);
        }
    }

    private void setRelease(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease(this.options.getRelease());
        }
    }

    private void setEnvironment(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            sentryBaseEvent.setEnvironment(this.options.getEnvironment() != null ? this.options.getEnvironment() : DEFAULT_ENVIRONMENT);
        }
    }

    private void setServerName(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.options.getServerName());
        }
        if (this.options.isAttachServerName() && this.hostnameCache != null && sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.hostnameCache.getHostname());
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(this.options.getDist());
        }
    }

    private void setSdk(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk(this.options.getSdkVersion());
        }
    }

    private void setTags(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(this.options.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.options.getTags().entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
            }
        }
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        if (this.options.isSendDefaultPii()) {
            if (sentryBaseEvent.getUser() == null) {
                User user = new User();
                user.setIpAddress("{{auto}}");
                sentryBaseEvent.setUser(user);
            } else if (sentryBaseEvent.getUser().getIpAddress() == null) {
                sentryBaseEvent.getUser().setIpAddress("{{auto}}");
            }
        }
    }

    private void setExceptions(SentryEvent sentryEvent) {
        Throwable throwableMechanism = sentryEvent.getThrowableMechanism();
        if (throwableMechanism != null) {
            sentryEvent.setExceptions(this.sentryExceptionFactory.getSentryExceptions(throwableMechanism));
        }
    }

    private void setThreads(SentryEvent sentryEvent, Object obj) {
        if (sentryEvent.getThreads() == null) {
            List<SentryException> exceptions = sentryEvent.getExceptions();
            ArrayList arrayList = null;
            if (exceptions != null && !exceptions.isEmpty()) {
                for (SentryException sentryException : exceptions) {
                    if (sentryException.getMechanism() != null && sentryException.getThreadId() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sentryException.getThreadId());
                    }
                }
            }
            if (this.options.isAttachThreads()) {
                sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThreads(arrayList));
            } else if (this.options.isAttachStacktrace()) {
                if ((exceptions == null || exceptions.isEmpty()) && !isCachedHint(obj)) {
                    sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThread());
                }
            }
        }
    }

    private boolean isCachedHint(Object obj) {
        return obj instanceof Cached;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        HostnameCache hostnameCache = this.hostnameCache;
        if (hostnameCache != null) {
            hostnameCache.close();
        }
    }

    boolean isClosed() {
        HostnameCache hostnameCache = this.hostnameCache;
        if (hostnameCache != null) {
            return hostnameCache.isClosed();
        }
        return true;
    }

    HostnameCache getHostnameCache() {
        return this.hostnameCache;
    }
}
