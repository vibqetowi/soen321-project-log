package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import bf.v;
import com.google.firebase.messaging.n;
import df.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nf.b;
import nf.c;
import nf.d;
import nf.f;
import sc.e;
import sc.g;
@Keep
/* loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, d> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final v cache;
    private final Executor executor;
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private re.b<f> firebaseRemoteConfigProvider;
    private static final a logger = a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RemoteConfigManager() {
        this(r3, new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS), getInitialStartupMillis());
        v vVar;
        a aVar = v.f4276c;
        synchronized (v.class) {
            if (v.f4277d == null) {
                v.f4277d = new v(Executors.newSingleThreadExecutor());
            }
            vVar = v.f4277d;
        }
    }

    public static long getInitialStartupMillis() {
        g gVar = (g) e.e().c(g.class);
        if (gVar != null) {
            return gVar.b();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private d getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            d dVar = this.allRcConfigMap.get(str);
            if (dVar.g() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", dVar.c(), str);
                return dVar;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        if (j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        if (j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.c());
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.b().addOnSuccessListener(this.executor, new n(1, this)).addOnFailureListener(this.executor, new ad.f(1, this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.c());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public kf.e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new kf.e<>();
        }
        d remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kf.e<>(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new kf.e<>();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public kf.e<Float> getFloat(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config float value is null.");
            return new kf.e<>();
        }
        d remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kf.e<>(Float.valueOf(Double.valueOf(remoteConfigValue.b()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new kf.e<>();
    }

    public kf.e<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new kf.e<>();
        }
        d remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kf.e<>(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new kf.e<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t3) {
        Object obj;
        d remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t3 instanceof Boolean) {
                    obj = Boolean.valueOf(remoteConfigValue.d());
                } else if (t3 instanceof Float) {
                    obj = Float.valueOf(Double.valueOf(remoteConfigValue.b()).floatValue());
                } else {
                    if (!(t3 instanceof Long) && !(t3 instanceof Integer)) {
                        if (t3 instanceof String) {
                            obj = remoteConfigValue.c();
                        } else {
                            T t10 = (T) remoteConfigValue.c();
                            try {
                                logger.b("No matching type found for the defaultValue: '%s', using String.", t3);
                                return t10;
                            } catch (IllegalArgumentException unused) {
                                t3 = t10;
                                if (!remoteConfigValue.c().isEmpty()) {
                                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                                    return t3;
                                }
                                return t3;
                            }
                        }
                    }
                    obj = Long.valueOf(remoteConfigValue.a());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t3;
        }
    }

    public kf.e<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new kf.e<>();
        }
        d remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new kf.e<>(remoteConfigValue.c());
        }
        return new kf.e<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        re.b<f> bVar;
        f fVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (fVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = fVar.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        int i6;
        b bVar = this.firebaseRemoteConfig;
        if (bVar == null) {
            return true;
        }
        com.google.firebase.remoteconfig.internal.b bVar2 = bVar.f26295h;
        synchronized (bVar2.f9829b) {
            bVar2.f9828a.getLong("last_fetch_time_in_millis", -1L);
            i6 = bVar2.f9828a.getInt("last_fetch_status", 0);
            c.a aVar = new c.a();
            long j10 = bVar2.f9828a.getLong("fetch_timeout_in_seconds", 60L);
            if (j10 >= FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                aVar.f26299a = j10;
                long j11 = bVar2.f9828a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.a.f9814i);
                if (j11 >= FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                    aVar.f26300b = j11;
                    aVar.a();
                } else {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
                }
            } else {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
        }
        if (i6 == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(re.b<f> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, d> map) {
        bf.d dVar;
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        synchronized (bf.d.class) {
            if (bf.d.f4257v == null) {
                bf.d.f4257v = new bf.d();
            }
            dVar = bf.d.f4257v;
        }
        ConcurrentHashMap<String, d> concurrentHashMap = this.allRcConfigMap;
        dVar.getClass();
        d dVar2 = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (dVar2 != null) {
            try {
                this.cache.f("com.google.firebase.perf.ExperimentTTID", dVar2.d());
                return;
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.a("ExperimentTTID remote config flag does not exist.");
    }

    public RemoteConfigManager(v vVar, Executor executor, b bVar, long j10, long j11) {
        ConcurrentHashMap<String, d> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = vVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.c());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
