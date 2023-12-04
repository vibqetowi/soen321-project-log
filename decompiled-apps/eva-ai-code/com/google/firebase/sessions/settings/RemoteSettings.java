package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.tasks.TasksKt;
/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0011\u0010%\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/DataStore;)V", "fetchInProgress", "Lkotlinx/coroutines/sync/Mutex;", "samplingRate", "", "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "clearCachedSettings", "", "clearCachedSettings$com_google_firebase_firebase_sessions", "isSettingsStale", "removeForwardSlashesIn", "", "s", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FORWARD_SLASH_STRING = "/";
    @Deprecated
    public static final String TAG = "SessionConfigFetcher";
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final Mutex fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;

    public RemoteSettings(CoroutineContext backgroundDispatcher, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = new SettingsCache(dataStore);
        this.fetchInProgress = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public Duration mo6773getSessionRestartTimeoutFghU774() {
        Integer sessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (sessionRestartTimeout != null) {
            Duration.Companion companion = Duration.Companion;
            return Duration.m8638boximpl(DurationKt.toDuration(sessionRestartTimeout.intValue(), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:36:0x0084, B:38:0x008c, B:41:0x0092), top: B:62:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:36:0x0084, B:38:0x008c, B:41:0x0092), top: B:62:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0049, B:45:0x00ad, B:47:0x00b1, B:51:0x00bf), top: B:65:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSettings(Continuation<? super Unit> continuation) {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        int i;
        Mutex mutex;
        RemoteSettings remoteSettings;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        String str;
        try {
            if (continuation instanceof RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
                if ((remoteSettings$updateSettings$1.label & Integer.MIN_VALUE) != 0) {
                    remoteSettings$updateSettings$1.label -= Integer.MIN_VALUE;
                    Object obj = remoteSettings$updateSettings$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = remoteSettings$updateSettings$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.fetchInProgress.isLocked() && !this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.fetchInProgress;
                        remoteSettings$updateSettings$1.L$0 = this;
                        remoteSettings$updateSettings$1.L$1 = mutex;
                        remoteSettings$updateSettings$1.label = 1;
                        if (mutex.lock(null, remoteSettings$updateSettings$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        remoteSettings = this;
                    } else if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                mutex2 = (Mutex) remoteSettings$updateSettings$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Unit unit = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex3 = (Mutex) remoteSettings$updateSettings$1.L$1;
                        remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str = (String) obj;
                            if (str != null) {
                                Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                                Unit unit2 = Unit.INSTANCE;
                                mutex3.unlock(null);
                                return unit2;
                            }
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                            String INCREMENTAL = Build.VERSION.INCREMENTAL;
                            Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                            String RELEASE = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                            Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to("X-Crashlytics-Installation-ID", str), TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(format)), TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL)), TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                            remoteSettings$updateSettings$1.L$0 = mutex3;
                            remoteSettings$updateSettings$1.L$1 = null;
                            remoteSettings$updateSettings$1.label = 3;
                            if (remoteSettings.configsFetcher.doConfigFetch(mapOf, new RemoteSettings$updateSettings$2$1(remoteSettings, null), new RemoteSettings$updateSettings$2$2(null), remoteSettings$updateSettings$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex2 = mutex3;
                            Unit unit3 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex2 = mutex3;
                            mutex2.unlock(null);
                            throw th;
                        }
                    } else {
                        remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) remoteSettings$updateSettings$1.L$1;
                    }
                    if (remoteSettings.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                        Unit unit4 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit4;
                    }
                    Task<String> id = remoteSettings.firebaseInstallationsApi.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallationsApi.id");
                    remoteSettings$updateSettings$1.L$0 = remoteSettings;
                    remoteSettings$updateSettings$1.L$1 = mutex;
                    remoteSettings$updateSettings$1.label = 2;
                    Object await = TasksKt.await(id, remoteSettings$updateSettings$1);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex;
                    obj = await;
                    str = (String) obj;
                    if (str != null) {
                    }
                }
            }
            if (remoteSettings.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions()) {
            }
        } catch (Throwable th4) {
            mutex2 = mutex;
            th = th4;
            mutex2.unlock(null);
            throw th;
        }
        remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, continuation);
        Object obj2 = remoteSettings$updateSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remoteSettings$updateSettings$1.label;
        if (i != 0) {
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    private final String removeForwardSlashesIn(String str) {
        return new Regex(FORWARD_SLASH_STRING).replace(str, "");
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes7.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
