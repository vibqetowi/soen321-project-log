package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;
    ListenableFuture<Void> mReleaseFuture;
    SessionConfig mSessionConfig;
    State mState;
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    SynchronizedCaptureSessionOpener mSynchronizedCaptureSessionOpener;
    final Object mSessionLock = new Object();
    private final List<CaptureConfig> mCaptureConfigs = new ArrayList();
    private final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    };
    Config mCameraEventOnRepeatingOptions = OptionsBundle.emptyBundle();
    CameraEventCallbacks mCameraEventCallbacks = CameraEventCallbacks.createEmptyCallback();
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap = new HashMap();
    List<DeferrableSurface> mConfiguredDeferrableSurfaces = Collections.emptyList();
    final StillCaptureFlow mStillCaptureFlow = new StillCaptureFlow();
    private final StateCallback mCaptureSessionStateCallback = new StateCallback();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureSession() {
        this.mState = State.UNINITIALIZED;
        this.mState = State.INITIALIZED;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.CaptureSession$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State = iArr;
            try {
                iArr[State.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[State.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                case 4:
                    this.mSessionConfig = sessionConfig;
                    break;
                case 5:
                    this.mSessionConfig = sessionConfig;
                    if (sessionConfig != null) {
                        if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                            Logger.e(TAG, "Does not have the proper configured lists");
                            return;
                        }
                        Logger.d(TAG, "Attempting to submit CaptureRequest after setting");
                        issueRepeatingCaptureRequests(this.mSessionConfig);
                        break;
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> open(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        synchronized (this.mSessionLock) {
            if (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()] == 2) {
                this.mState = State.GET_SURFACE;
                ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                this.mConfiguredDeferrableSurfaces = arrayList;
                this.mSynchronizedCaptureSessionOpener = synchronizedCaptureSessionOpener;
                FutureChain transformAsync = FutureChain.from(synchronizedCaptureSessionOpener.startWithDeferrableSurface(arrayList, 5000L)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda1
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return CaptureSession.this.m70lambda$open$0$androidxcameracamera2internalCaptureSession(sessionConfig, cameraDevice, (List) obj);
                    }
                }, this.mSynchronizedCaptureSessionOpener.getExecutor());
                Futures.addCallback(transformAsync, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        synchronized (CaptureSession.this.mSessionLock) {
                            CaptureSession.this.mSynchronizedCaptureSessionOpener.stop();
                            int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()];
                            if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                                Logger.w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th);
                                CaptureSession.this.finishClose();
                            }
                        }
                    }
                }, this.mSynchronizedCaptureSessionOpener.getExecutor());
                return Futures.nonCancellationPropagating(transformAsync);
            }
            Logger.e(TAG, "Open not allowed in state: " + this.mState);
            return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openCaptureSession */
    public ListenableFuture<Void> m70lambda$open$0$androidxcameracamera2internalCaptureSession(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new LinkedHashSet(list));
                    this.mState = State.OPENING;
                    Logger.d(TAG, "Opening capture session.");
                    SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                    CameraEventCallbacks cameraEventCallback = camera2ImplConfig.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback());
                    this.mCameraEventCallbacks = cameraEventCallback;
                    List<CaptureConfig> onPresetSession = cameraEventCallback.createComboCallback().onPresetSession();
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    for (CaptureConfig captureConfig : onPresetSession) {
                        from.addImplementationOptions(captureConfig.getImplementationOptions());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(surface);
                        outputConfigurationCompat.setPhysicalCameraId(camera2ImplConfig.getPhysicalCameraId(null));
                        arrayList2.add(outputConfigurationCompat);
                    }
                    SessionConfigurationCompat createSessionConfigurationCompat = this.mSynchronizedCaptureSessionOpener.createSessionConfigurationCompat(0, arrayList2, createComboCallback);
                    try {
                        CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        return this.mSynchronizedCaptureSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                    } catch (CameraAccessException e) {
                        return Futures.immediateFailedFuture(e);
                    }
                } else if (i != 5) {
                    return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                }
            }
            return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            int i = AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            }
            if (i != 2) {
                if (i == 3) {
                    SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener = this.mSynchronizedCaptureSessionOpener;
                    Preconditions.checkNotNull(synchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSynchronizedCaptureSessionOpener.stop();
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            if (this.mSessionConfig != null) {
                                List<CaptureConfig> onDisableSession = this.mCameraEventCallbacks.createComboCallback().onDisableSession();
                                if (!onDisableSession.isEmpty()) {
                                    try {
                                        issueCaptureRequests(setupConfiguredSurface(onDisableSession));
                                    } catch (IllegalStateException e) {
                                        Logger.e(TAG, "Unable to issue the request before close the capture session", e);
                                    }
                                }
                            }
                        }
                    }
                    SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener2 = this.mSynchronizedCaptureSessionOpener;
                    Preconditions.checkNotNull(synchronizedCaptureSessionOpener2, "The Opener shouldn't null in state:" + this.mState);
                    this.mSynchronizedCaptureSessionOpener.stop();
                    this.mState = State.CLOSED;
                    this.mSessionConfig = null;
                }
            }
            this.mState = State.RELEASED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[Catch: all -> 0x009e, TryCatch #1 {, blocks: (B:4:0x000a, B:5:0x0014, B:28:0x0097, B:7:0x0019, B:10:0x001f, B:14:0x002b, B:13:0x0024, B:15:0x0030, B:17:0x004f, B:18:0x0053, B:20:0x0057, B:21:0x0062, B:22:0x0064, B:24:0x0066, B:25:0x007e, B:26:0x0083, B:27:0x0096), top: B:36:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x009e, TryCatch #1 {, blocks: (B:4:0x000a, B:5:0x0014, B:28:0x0097, B:7:0x0019, B:10:0x001f, B:14:0x002b, B:13:0x0024, B:15:0x0030, B:17:0x004f, B:18:0x0053, B:20:0x0057, B:21:0x0062, B:22:0x0064, B:24:0x0066, B:25:0x007e, B:26:0x0083, B:27:0x0096), top: B:36:0x000a, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListenableFuture<Void> release(boolean z) {
        synchronized (this.mSessionLock) {
            switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("release() should not be possible in state: " + this.mState);
                case 2:
                    this.mState = State.RELEASED;
                    return Futures.immediateFuture(null);
                case 3:
                    SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener = this.mSynchronizedCaptureSessionOpener;
                    Preconditions.checkNotNull(synchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSynchronizedCaptureSessionOpener.stop();
                    this.mState = State.RELEASED;
                    return Futures.immediateFuture(null);
                case 4:
                    this.mState = State.RELEASING;
                    SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener2 = this.mSynchronizedCaptureSessionOpener;
                    Preconditions.checkNotNull(synchronizedCaptureSessionOpener2, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSynchronizedCaptureSessionOpener.stop()) {
                        finishClose();
                        return Futures.immediateFuture(null);
                    }
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda2
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return CaptureSession.this.m71lambda$release$1$androidxcameracamera2internalCaptureSession(completer);
                            }
                        });
                    }
                    return this.mReleaseFuture;
                case 5:
                case 6:
                    SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
                    if (synchronizedCaptureSession != null) {
                        if (z) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (CameraAccessException e) {
                                Logger.e(TAG, "Unable to abort captures.", e);
                            }
                        }
                        this.mSynchronizedCaptureSession.close();
                    }
                    this.mState = State.RELEASING;
                    SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener22 = this.mSynchronizedCaptureSessionOpener;
                    Preconditions.checkNotNull(synchronizedCaptureSessionOpener22, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSynchronizedCaptureSessionOpener.stop()) {
                    }
                    if (this.mReleaseFuture == null) {
                    }
                    return this.mReleaseFuture;
                case 7:
                    if (this.mReleaseFuture == null) {
                    }
                    return this.mReleaseFuture;
                default:
                    return Futures.immediateFuture(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$release$1$androidx-camera-camera2-internal-CaptureSession  reason: not valid java name */
    public /* synthetic */ Object m71lambda$release$1$androidxcameracamera2internalCaptureSession(CallbackToFutureAdapter.Completer completer) throws Exception {
        String str;
        synchronized (this.mSessionLock) {
            Preconditions.checkState(this.mReleaseCompleter == null, "Release completer expected to be null");
            this.mReleaseCompleter = completer;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                case 4:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case 5:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    void finishClose() {
        if (this.mState == State.RELEASED) {
            Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = State.RELEASED;
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.Completer<Void> completer = this.mReleaseCompleter;
        if (completer != null) {
            completer.set(null);
            this.mReleaseCompleter = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            if (sessionConfig == null) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e) {
                    Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                Logger.d(TAG, "Issuing request for session.");
                CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                Config mergeOptions = mergeOptions(this.mCameraEventCallbacks.createComboCallback().onRepeating());
                this.mCameraEventOnRepeatingOptions = mergeOptions;
                from.addImplementationOptions(mergeOptions);
                CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                if (build == null) {
                    Logger.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.mCaptureCallback));
            } catch (CameraAccessException e2) {
                Logger.e(TAG, "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    void issuePendingCaptureRequest() {
        if (this.mCaptureConfigs.isEmpty()) {
            return;
        }
        try {
            issueBurstCaptureRequest(this.mCaptureConfigs);
        } finally {
            this.mCaptureConfigs.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        synchronized (this.mSessionLock) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                arrayList = new ArrayList();
                Logger.d(TAG, "Issuing capture request.");
                z = false;
                for (CaptureConfig captureConfig : list) {
                    if (captureConfig.getSurfaces().isEmpty()) {
                        Logger.d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = true;
                                break;
                            }
                            DeferrableSurface next = it.next();
                            if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                Logger.d(TAG, "Skipping capture request with invalid surface: " + next);
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            if (captureConfig.getTemplateType() == 2) {
                                z = true;
                            }
                            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                            }
                            SessionConfig sessionConfig = this.mSessionConfig;
                            if (sessionConfig != null) {
                                from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                            }
                            from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                            from.addImplementationOptions(captureConfig.getImplementationOptions());
                            CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                            if (build == null) {
                                Logger.d(TAG, "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                                CaptureCallbackConverter.toCaptureCallback(cameraCaptureCallback, arrayList2);
                            }
                            cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                            arrayList.add(build);
                        }
                    }
                }
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z)) {
                    this.mSynchronizedCaptureSession.stopRepeating();
                    cameraBurstCaptureCallback.setCaptureSequenceCallback(new CameraBurstCaptureCallback.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.CaptureSession$$ExternalSyntheticLambda0
                        @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
                        public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z3) {
                            CaptureSession.this.m69xaccd0633(cameraCaptureSession, i, z3);
                        }
                    });
                }
                return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
            }
            Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$issueBurstCaptureRequest$2$androidx-camera-camera2-internal-CaptureSession  reason: not valid java name */
    public /* synthetic */ void m69xaccd0633(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                issueRepeatingCaptureRequests(this.mSessionConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.abortCaptures();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to abort captures.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                Logger.e(TAG, "Unable to stop repeating.", e);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.mCaptureConfigs);
                this.mCaptureConfigs.clear();
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                    cameraCaptureCallback.onCaptureCancelled();
                }
            }
        }
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback cameraCaptureCallback : list) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(cameraCaptureCallback));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    private static Config mergeOptions(List<CaptureConfig> list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (CaptureConfig captureConfig : list) {
            Config implementationOptions = captureConfig.getImplementationOptions();
            for (Config.Option<?> option : implementationOptions.listOptions()) {
                Object retrieveOption = implementationOptions.retrieveOption(option, null);
                if (create.containsOption(option)) {
                    Object retrieveOption2 = create.retrieveOption(option, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        Logger.d(TAG, "Detect conflicting option " + option.getId() + " : " + retrieveOption + " != " + retrieveOption2);
                    }
                } else {
                    create.insertOption(option, retrieveOption);
                }
            }
        }
        return create;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                        CaptureSession.this.mState = State.OPENED;
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        if (CaptureSession.this.mSessionConfig != null) {
                            List<CaptureConfig> onEnableSession = CaptureSession.this.mCameraEventCallbacks.createComboCallback().onEnableSession();
                            if (!onEnableSession.isEmpty()) {
                                CaptureSession captureSession = CaptureSession.this;
                                captureSession.issueBurstCaptureRequest(captureSession.setupConfiguredSurface(onEnableSession));
                            }
                        }
                        Logger.d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                        CaptureSession captureSession2 = CaptureSession.this;
                        captureSession2.issueRepeatingCaptureRequests(captureSession2.mSessionConfig);
                        CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case 6:
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case 7:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger.d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()] == 1) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
                Logger.d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (CaptureSession.this.mState == State.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                }
                Logger.d(CaptureSession.TAG, "onSessionFinished()");
                CaptureSession.this.finishClose();
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (AnonymousClass3.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.finishClose();
                        break;
                    case 8:
                        Logger.d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                Logger.e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
            }
        }
    }

    List<CaptureConfig> setupConfiguredSurface(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
            from.setTemplateType(1);
            for (DeferrableSurface deferrableSurface : this.mSessionConfig.getRepeatingCaptureConfig().getSurfaces()) {
                from.addSurface(deferrableSurface);
            }
            arrayList.add(from.build());
        }
        return arrayList;
    }
}
