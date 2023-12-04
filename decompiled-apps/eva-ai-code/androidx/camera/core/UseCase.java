package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.utils.UseCaseConfigUtil;
import androidx.core.util.Preconditions;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class UseCase {
    private Size mAttachedResolution;
    private CameraInternal mCamera;
    private UseCaseConfig<?> mCameraConfig;
    private UseCaseConfig<?> mCurrentConfig;
    private UseCaseConfig<?> mExtendedConfig;
    private UseCaseConfig<?> mUseCaseConfig;
    private Rect mViewPortCropRect;
    private final Set<StateChangeCallback> mStateChangeCallbacks = new HashSet();
    private final Object mCameraLock = new Object();
    private State mState = State.INACTIVE;
    private SessionConfig mAttachedSessionConfig = SessionConfig.defaultEmptySessionConfig();

    /* loaded from: classes.dex */
    public interface EventCallback {
        void onAttach(CameraInfo cameraInfo);

        void onDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes.dex */
    public interface StateChangeCallback {
        void onUseCaseActive(UseCase useCase);

        void onUseCaseInactive(UseCase useCase);

        void onUseCaseReset(UseCase useCase);

        void onUseCaseUpdated(UseCase useCase);
    }

    public abstract UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    public abstract UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config);

    public void onAttached() {
    }

    protected void onCameraControlReady() {
    }

    public void onDetached() {
    }

    public void onStateDetached() {
    }

    protected abstract Size onSuggestedResolutionUpdated(Size size);

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public UseCase(UseCaseConfig<?> useCaseConfig) {
        this.mUseCaseConfig = useCaseConfig;
        this.mCurrentConfig = useCaseConfig;
    }

    public UseCaseConfig<?> mergeConfigs(CameraInfoInternal cameraInfoInternal, UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
        MutableOptionsBundle create;
        if (useCaseConfig2 != null) {
            create = MutableOptionsBundle.from((Config) useCaseConfig2);
            create.removeOption(TargetConfig.OPTION_TARGET_NAME);
        } else {
            create = MutableOptionsBundle.create();
        }
        for (Config.Option<?> option : this.mUseCaseConfig.listOptions()) {
            create.insertOption(option, this.mUseCaseConfig.getOptionPriority(option), this.mUseCaseConfig.retrieveOption(option));
        }
        if (useCaseConfig != null) {
            for (Config.Option<?> option2 : useCaseConfig.listOptions()) {
                if (!option2.getId().equals(TargetConfig.OPTION_TARGET_NAME.getId())) {
                    create.insertOption(option2, useCaseConfig.getOptionPriority(option2), useCaseConfig.retrieveOption(option2));
                }
            }
        }
        if (create.containsOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION) && create.containsOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)) {
            create.removeOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
        }
        return onMergeConfig(cameraInfoInternal, getUseCaseConfigBuilder(create));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        return builder.getUseCaseConfig();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    public boolean setTargetRotationInternal(int i) {
        int targetRotation = ((ImageOutputConfig) getCurrentConfig()).getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            UseCaseConfig.Builder<?, ?, ?> useCaseConfigBuilder = getUseCaseConfigBuilder(this.mUseCaseConfig);
            UseCaseConfigUtil.updateTargetRotationAndRelatedConfigs(useCaseConfigBuilder, i);
            this.mUseCaseConfig = useCaseConfigBuilder.getUseCaseConfig();
            CameraInternal camera = getCamera();
            if (camera == null) {
                this.mCurrentConfig = this.mUseCaseConfig;
                return true;
            }
            this.mCurrentConfig = mergeConfigs(camera.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getTargetRotationInternal() {
        return ((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getAppTargetRotation() {
        return ((ImageOutputConfig) this.mCurrentConfig).getAppTargetRotation(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRelativeRotation(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(getTargetRotationInternal());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateSessionConfig(SessionConfig sessionConfig) {
        this.mAttachedSessionConfig = sessionConfig;
        for (DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
            if (deferrableSurface.getContainerClass() == null) {
                deferrableSurface.setContainerClass(getClass());
            }
        }
    }

    private void addStateChangeCallback(StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.add(stateChangeCallback);
    }

    private void removeStateChangeCallback(StateChangeCallback stateChangeCallback) {
        this.mStateChangeCallbacks.remove(stateChangeCallback);
    }

    public SessionConfig getSessionConfig() {
        return this.mAttachedSessionConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyActive() {
        this.mState = State.ACTIVE;
        notifyState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyInactive() {
        this.mState = State.INACTIVE;
        notifyState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyUpdated() {
        for (StateChangeCallback stateChangeCallback : this.mStateChangeCallbacks) {
            stateChangeCallback.onUseCaseUpdated(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void notifyReset() {
        for (StateChangeCallback stateChangeCallback : this.mStateChangeCallbacks) {
            stateChangeCallback.onUseCaseReset(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.UseCase$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$UseCase$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$androidx$camera$core$UseCase$State = iArr;
            try {
                iArr[State.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$UseCase$State[State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void notifyState() {
        int i = AnonymousClass1.$SwitchMap$androidx$camera$core$UseCase$State[this.mState.ordinal()];
        if (i == 1) {
            for (StateChangeCallback stateChangeCallback : this.mStateChangeCallbacks) {
                stateChangeCallback.onUseCaseInactive(this);
            }
        } else if (i == 2) {
            for (StateChangeCallback stateChangeCallback2 : this.mStateChangeCallbacks) {
                stateChangeCallback2.onUseCaseActive(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getCameraId() {
        CameraInternal camera = getCamera();
        return ((CameraInternal) Preconditions.checkNotNull(camera, "No camera attached to use case: " + this)).getCameraInfoInternal().getCameraId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isCurrentCamera(String str) {
        if (getCamera() == null) {
            return false;
        }
        return Objects.equals(str, getCameraId());
    }

    public String getName() {
        UseCaseConfig<?> useCaseConfig = this.mCurrentConfig;
        return useCaseConfig.getTargetName("<UnknownUseCase-" + hashCode() + ">");
    }

    public UseCaseConfig<?> getCurrentConfig() {
        return this.mCurrentConfig;
    }

    public CameraInternal getCamera() {
        CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mCamera;
        }
        return cameraInternal;
    }

    public Size getAttachedSurfaceResolution() {
        return this.mAttachedResolution;
    }

    public void updateSuggestedResolution(Size size) {
        this.mAttachedResolution = onSuggestedResolutionUpdated(size);
    }

    public void onAttach(CameraInternal cameraInternal, UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
        synchronized (this.mCameraLock) {
            this.mCamera = cameraInternal;
            addStateChangeCallback(cameraInternal);
        }
        this.mExtendedConfig = useCaseConfig;
        this.mCameraConfig = useCaseConfig2;
        UseCaseConfig<?> mergeConfigs = mergeConfigs(cameraInternal.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        this.mCurrentConfig = mergeConfigs;
        EventCallback useCaseEventCallback = mergeConfigs.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onAttach(cameraInternal.getCameraInfoInternal());
        }
        onAttached();
    }

    public void onDetach(CameraInternal cameraInternal) {
        onDetached();
        EventCallback useCaseEventCallback = this.mCurrentConfig.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onDetach();
        }
        synchronized (this.mCameraLock) {
            Preconditions.checkArgument(cameraInternal == this.mCamera);
            removeStateChangeCallback(this.mCamera);
            this.mCamera = null;
        }
        this.mAttachedResolution = null;
        this.mViewPortCropRect = null;
        this.mCurrentConfig = this.mUseCaseConfig;
        this.mExtendedConfig = null;
        this.mCameraConfig = null;
    }

    public void onStateAttached() {
        onCameraControlReady();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CameraControlInternal getCameraControl() {
        synchronized (this.mCameraLock) {
            CameraInternal cameraInternal = this.mCamera;
            if (cameraInternal == null) {
                return CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
            }
            return cameraInternal.getCameraControlInternal();
        }
    }

    public void setViewPortCropRect(Rect rect) {
        this.mViewPortCropRect = rect;
    }

    public Rect getViewPortCropRect() {
        return this.mViewPortCropRect;
    }

    public int getImageFormat() {
        return this.mCurrentConfig.getInputFormat();
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    protected ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        if (viewPortCropRect == null) {
            viewPortCropRect = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return ResolutionInfo.create(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }
}
