package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class UseCaseAttachState {
    private static final String TAG = "UseCaseAttachState";
    private final Map<String, UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new LinkedHashMap();
    private final String mCameraId;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface AttachStateFilter {
        boolean filter(UseCaseAttachInfo useCaseAttachInfo);
    }

    public UseCaseAttachState(String str) {
        this.mCameraId = str;
    }

    public void setUseCaseActive(String str, SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig).setActive(true);
    }

    public void setUseCaseInactive(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setActive(false);
            if (useCaseAttachInfo.getAttached()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public void setUseCaseAttached(String str, SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig).setAttached(true);
    }

    public void setUseCaseDetached(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(false);
            if (useCaseAttachInfo.getActive()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public boolean isUseCaseAttached(String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            return this.mAttachedUseCasesToInfoMap.get(str).getAttached();
        }
        return false;
    }

    public Collection<SessionConfig> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                boolean attached;
                attached = useCaseAttachInfo.getAttached();
                return attached;
            }
        }));
    }

    public Collection<SessionConfig> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(getSessionConfigs(new AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                return UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$1(useCaseAttachInfo);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$getActiveAndAttachedSessionConfigs$1(UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached();
    }

    public void updateUseCase(String str, SessionConfig sessionConfig) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig);
            UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(useCaseAttachInfo2.getAttached());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo);
        }
    }

    public void removeUseCase(String str) {
        this.mAttachedUseCasesToInfoMap.remove(str);
    }

    public SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo value = entry.getValue();
            if (value.getActive() && value.getAttached()) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        Logger.d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public SessionConfig.ValidatingBuilder getAttachedBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo value = entry.getValue();
            if (value.getAttached()) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        Logger.d(TAG, "All use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    private UseCaseAttachInfo getOrCreateUseCaseAttachInfo(String str, SessionConfig sessionConfig) {
        UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
        if (useCaseAttachInfo == null) {
            UseCaseAttachInfo useCaseAttachInfo2 = new UseCaseAttachInfo(sessionConfig);
            this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo2);
            return useCaseAttachInfo2;
        }
        return useCaseAttachInfo;
    }

    private Collection<SessionConfig> getSessionConfigs(AttachStateFilter attachStateFilter) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getSessionConfig());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class UseCaseAttachInfo {
        private final SessionConfig mSessionConfig;
        private boolean mAttached = false;
        private boolean mActive = false;

        UseCaseAttachInfo(SessionConfig sessionConfig) {
            this.mSessionConfig = sessionConfig;
        }

        SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean getAttached() {
            return this.mAttached;
        }

        void setAttached(boolean z) {
            this.mAttached = z;
        }

        boolean getActive() {
            return this.mActive;
        }

        void setActive(boolean z) {
            this.mActive = z;
        }
    }
}
