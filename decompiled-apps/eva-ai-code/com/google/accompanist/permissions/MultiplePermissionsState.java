package com.google.accompanist.permissions;

import java.util.List;
import kotlin.Metadata;
/* compiled from: MultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/permissions/MultiplePermissionsState;", "", "allPermissionsGranted", "", "getAllPermissionsGranted", "()Z", "permissions", "", "Lcom/google/accompanist/permissions/PermissionState;", "getPermissions", "()Ljava/util/List;", "revokedPermissions", "getRevokedPermissions", "shouldShowRationale", "getShouldShowRationale", "launchMultiplePermissionRequest", "", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MultiplePermissionsState {
    boolean getAllPermissionsGranted();

    List<PermissionState> getPermissions();

    List<PermissionState> getRevokedPermissions();

    boolean getShouldShowRationale();

    void launchMultiplePermissionRequest();
}
