package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes7.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private final ExecutorService backgroundExecutor;
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    private Set<FidListener> fidListeners;
    private final FirebaseApp firebaseApp;
    private final Lazy<IidStore> iidStore;
    private final List<StateListener> listeners;
    private final Object lock;
    private final Executor networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;
    private static final Object lockGenerateFid = new Object();
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.mCount.getAndIncrement())));
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstallations(final FirebaseApp firebaseApp, Provider<HeartBeatController> provider, ExecutorService executorService, Executor executor) {
        this(executorService, executor, firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider), new PersistedInstallation(firebaseApp), Utils.getInstance(), new Lazy(new Provider() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda4
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseInstallations.lambda$new$0(FirebaseApp.this);
            }
        }), new RandomFidGenerator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ IidStore lambda$new$0(FirebaseApp firebaseApp) {
        return new IidStore(firebaseApp);
    }

    FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy<IidStore> lazy, RandomFidGenerator randomFidGenerator) {
        this.lock = new Object();
        this.fidListeners = new HashSet();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = executor;
    }

    private void preConditionChecks() {
        Preconditions.checkNotEmpty(getApplicationId(), APP_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
        Preconditions.checkNotEmpty(getApiKey(), API_KEY_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidAppIdFormat(getApplicationId()), APP_ID_VALIDATION_MSG);
        Preconditions.checkArgument(Utils.isValidApiKeyFormat(getApiKey()), API_KEY_VALIDATION_MSG);
    }

    String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    String getName() {
        return this.firebaseApp.getName();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<String> getId() {
        preConditionChecks();
        String cacheFid = getCacheFid();
        if (cacheFid != null) {
            return Tasks.forResult(cacheFid);
        }
        Task<String> addGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m6718xc18eb11d();
            }
        });
        return addGetIdListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getId$1$com-google-firebase-installations-FirebaseInstallations  reason: not valid java name */
    public /* synthetic */ void m6718xc18eb11d() {
        m6719x7147f7aa(false);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<InstallationTokenResult> getToken(final boolean z) {
        preConditionChecks();
        Task<InstallationTokenResult> addGetAuthTokenListener = addGetAuthTokenListener();
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m6719x7147f7aa(z);
            }
        });
        return addGetAuthTokenListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<Void> delete() {
        return Tasks.call(this.backgroundExecutor, new Callable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void deleteFirebaseInstallationId;
                deleteFirebaseInstallationId = FirebaseInstallations.this.deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
            }
        });
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public synchronized FidListenerHandle registerFidListener(final FidListener fidListener) {
        this.fidListeners.add(fidListener);
        return new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.2
            @Override // com.google.firebase.installations.internal.FidListenerHandle
            public void unregister() {
                synchronized (FirebaseInstallations.this) {
                    FirebaseInstallations.this.fidListeners.remove(fidListener);
                }
            }
        };
    }

    private Task<String> addGetIdListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetIdListener(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<InstallationTokenResult> addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new GetAuthTokenListener(this.utils, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void addStateListeners(StateListener stateListener) {
        synchronized (this.lock) {
            this.listeners.add(stateListener);
        }
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            Iterator<StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onStateReached(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    private void triggerOnException(Exception exc) {
        synchronized (this.lock) {
            Iterator<StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onException(exc)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void updateCacheFid(String str) {
        this.cachedFid = str;
    }

    private synchronized String getCacheFid() {
        return this.cachedFid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRegistrationOrRefresh */
    public final void m6719x7147f7aa(final boolean z) {
        PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        if (z) {
            prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
        this.networkExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m6717x5a306a82(z);
            }
        });
    }

    private IidStore getIidStore() {
        return this.iidStore.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: doNetworkCallIfNecessary */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6717x5a306a82(boolean z) {
        PersistedInstallationEntry registerFidWithServer;
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        try {
            if (!multiProcessSafePrefs.isErrored() && !multiProcessSafePrefs.isUnregistered()) {
                if (!z && !this.utils.isAuthTokenExpired(multiProcessSafePrefs)) {
                    return;
                }
                registerFidWithServer = fetchAuthTokenFromServer(multiProcessSafePrefs);
                insertOrUpdatePrefs(registerFidWithServer);
                updateFidListener(multiProcessSafePrefs, registerFidWithServer);
                if (registerFidWithServer.isRegistered()) {
                    updateCacheFid(registerFidWithServer.getFirebaseInstallationId());
                }
                if (!registerFidWithServer.isErrored()) {
                    triggerOnException(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                    return;
                } else if (registerFidWithServer.isNotGenerated()) {
                    triggerOnException(new IOException(AUTH_ERROR_MSG));
                    return;
                } else {
                    triggerOnStateReached(registerFidWithServer);
                    return;
                }
            }
            registerFidWithServer = registerFidWithServer(multiProcessSafePrefs);
            insertOrUpdatePrefs(registerFidWithServer);
            updateFidListener(multiProcessSafePrefs, registerFidWithServer);
            if (registerFidWithServer.isRegistered()) {
            }
            if (!registerFidWithServer.isErrored()) {
            }
        } catch (FirebaseInstallationsException e) {
            triggerOnException(e);
        }
    }

    private synchronized void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.fidListeners.size() != 0 && !TextUtils.equals(persistedInstallationEntry.getFirebaseInstallationId(), persistedInstallationEntry2.getFirebaseInstallationId())) {
            for (FidListener fidListener : this.fidListeners) {
                fidListener.onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
    }

    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            if (readPersistedInstallationEntryValue.isNotGenerated()) {
                readPersistedInstallationEntryValue = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(readPersistedInstallationEntryValue)));
            }
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
        return readPersistedInstallationEntryValue;
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) && !this.firebaseApp.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.fidGenerator.createRandomFid();
        }
        String readIid = getIidStore().readIid();
        return TextUtils.isEmpty(readIid) ? this.fidGenerator.createRandomFid() : readIid;
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse createFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
        int i = AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[createFirebaseInstallation.getResponseCode().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return persistedInstallationEntry.withFisError("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        return persistedInstallationEntry.withRegisteredFid(createFirebaseInstallation.getFid(), createFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), createFirebaseInstallation.getAuthToken().getToken(), createFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult generateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i = AnonymousClass3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[generateAuthToken.getResponseCode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    updateCacheFid(null);
                    return persistedInstallationEntry.withNoGeneratedFid();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
            }
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        return persistedInstallationEntry.withAuthToken(generateAuthToken.getToken(), generateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
        updateCacheFid(null);
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            CrossProcessLock acquire = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            if (acquire != null) {
                acquire.releaseAndClose();
            }
        }
        return readPersistedInstallationEntryValue;
    }
}
