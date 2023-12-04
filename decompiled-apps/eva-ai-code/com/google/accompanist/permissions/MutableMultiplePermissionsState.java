package com.google.accompanist.permissions;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0016J!\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\"H\u0000¢\u0006\u0002\b#R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0019\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001c\u0010\t¨\u0006$"}, d2 = {"Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "mutablePermissions", "", "Lcom/google/accompanist/permissions/MutablePermissionState;", "(Ljava/util/List;)V", "allPermissionsGranted", "", "getAllPermissionsGranted", "()Z", "allPermissionsGranted$delegate", "Landroidx/compose/runtime/State;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "getLauncher$permissions_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher$permissions_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "permissions", "Lcom/google/accompanist/permissions/PermissionState;", "getPermissions", "()Ljava/util/List;", "revokedPermissions", "getRevokedPermissions", "revokedPermissions$delegate", "shouldShowRationale", "getShouldShowRationale", "shouldShowRationale$delegate", "launchMultiplePermissionRequest", "", "updatePermissionsStatus", "permissionsStatus", "", "updatePermissionsStatus$permissions_release", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MutableMultiplePermissionsState implements MultiplePermissionsState {
    private final State allPermissionsGranted$delegate;
    private ActivityResultLauncher<String[]> launcher;
    private final List<MutablePermissionState> mutablePermissions;

    /* renamed from: permissions  reason: collision with root package name */
    private final List<PermissionState> f144permissions;
    private final State revokedPermissions$delegate;
    private final State shouldShowRationale$delegate;

    public MutableMultiplePermissionsState(List<MutablePermissionState> mutablePermissions) {
        Intrinsics.checkNotNullParameter(mutablePermissions, "mutablePermissions");
        this.mutablePermissions = mutablePermissions;
        this.f144permissions = mutablePermissions;
        this.revokedPermissions$delegate = SnapshotStateKt.derivedStateOf(new MutableMultiplePermissionsState$revokedPermissions$2(this));
        this.allPermissionsGranted$delegate = SnapshotStateKt.derivedStateOf(new MutableMultiplePermissionsState$allPermissionsGranted$2(this));
        this.shouldShowRationale$delegate = SnapshotStateKt.derivedStateOf(new MutableMultiplePermissionsState$shouldShowRationale$2(this));
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getPermissions() {
        return this.f144permissions;
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getRevokedPermissions() {
        return (List) this.revokedPermissions$delegate.getValue();
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getAllPermissionsGranted() {
        return ((Boolean) this.allPermissionsGranted$delegate.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public boolean getShouldShowRationale() {
        return ((Boolean) this.shouldShowRationale$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public void launchMultiplePermissionRequest() {
        Unit unit;
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher != 0) {
            List<PermissionState> permissions2 = getPermissions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(permissions2, 10));
            for (PermissionState permissionState : permissions2) {
                arrayList.add(permissionState.getPermission());
            }
            activityResultLauncher.launch(arrayList.toArray(new String[0]));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final ActivityResultLauncher<String[]> getLauncher$permissions_release() {
        return this.launcher;
    }

    public final void setLauncher$permissions_release(ActivityResultLauncher<String[]> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void updatePermissionsStatus$permissions_release(Map<String, Boolean> permissionsStatus) {
        Object obj;
        Boolean bool;
        Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.mutablePermissions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((MutablePermissionState) obj).getPermission(), str)) {
                    break;
                }
            }
            MutablePermissionState mutablePermissionState = (MutablePermissionState) obj;
            if (mutablePermissionState != null && (bool = permissionsStatus.get(str)) != null) {
                bool.booleanValue();
                mutablePermissionState.refreshPermissionStatus$permissions_release();
            }
        }
    }
}
