package com.ifriend.presentation.features.update.model;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StartUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "", "OpenAppInMarket", "StartUpdateEvent", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent$OpenAppInMarket;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent$StartUpdateEvent;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InAppUpdateEvent {

    /* compiled from: StartUpdateEvent.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent$StartUpdateEvent;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "info", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "appUpdateOptions", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "manager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;Lcom/google/android/play/core/appupdate/AppUpdateOptions;Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "getAppUpdateOptions", "()Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "getInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getManager", "()Lcom/google/android/play/core/appupdate/AppUpdateManager;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StartUpdateEvent implements InAppUpdateEvent {
        public static final int $stable = 8;
        private final AppUpdateOptions appUpdateOptions;
        private final AppUpdateInfo info;
        private final AppUpdateManager manager;

        public static /* synthetic */ StartUpdateEvent copy$default(StartUpdateEvent startUpdateEvent, AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions, AppUpdateManager appUpdateManager, int i, Object obj) {
            if ((i & 1) != 0) {
                appUpdateInfo = startUpdateEvent.info;
            }
            if ((i & 2) != 0) {
                appUpdateOptions = startUpdateEvent.appUpdateOptions;
            }
            if ((i & 4) != 0) {
                appUpdateManager = startUpdateEvent.manager;
            }
            return startUpdateEvent.copy(appUpdateInfo, appUpdateOptions, appUpdateManager);
        }

        public final AppUpdateInfo component1() {
            return this.info;
        }

        public final AppUpdateOptions component2() {
            return this.appUpdateOptions;
        }

        public final AppUpdateManager component3() {
            return this.manager;
        }

        public final StartUpdateEvent copy(AppUpdateInfo info, AppUpdateOptions appUpdateOptions, AppUpdateManager manager) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
            Intrinsics.checkNotNullParameter(manager, "manager");
            return new StartUpdateEvent(info, appUpdateOptions, manager);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StartUpdateEvent) {
                StartUpdateEvent startUpdateEvent = (StartUpdateEvent) obj;
                return Intrinsics.areEqual(this.info, startUpdateEvent.info) && Intrinsics.areEqual(this.appUpdateOptions, startUpdateEvent.appUpdateOptions) && Intrinsics.areEqual(this.manager, startUpdateEvent.manager);
            }
            return false;
        }

        public int hashCode() {
            return (((this.info.hashCode() * 31) + this.appUpdateOptions.hashCode()) * 31) + this.manager.hashCode();
        }

        public String toString() {
            AppUpdateInfo appUpdateInfo = this.info;
            AppUpdateOptions appUpdateOptions = this.appUpdateOptions;
            AppUpdateManager appUpdateManager = this.manager;
            return "StartUpdateEvent(info=" + appUpdateInfo + ", appUpdateOptions=" + appUpdateOptions + ", manager=" + appUpdateManager + ")";
        }

        public StartUpdateEvent(AppUpdateInfo info, AppUpdateOptions appUpdateOptions, AppUpdateManager manager) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
            Intrinsics.checkNotNullParameter(manager, "manager");
            this.info = info;
            this.appUpdateOptions = appUpdateOptions;
            this.manager = manager;
        }

        public final AppUpdateInfo getInfo() {
            return this.info;
        }

        public final AppUpdateOptions getAppUpdateOptions() {
            return this.appUpdateOptions;
        }

        public final AppUpdateManager getManager() {
            return this.manager;
        }
    }

    /* compiled from: StartUpdateEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent$OpenAppInMarket;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenAppInMarket implements InAppUpdateEvent {
        public static final int $stable = 0;
        public static final OpenAppInMarket INSTANCE = new OpenAppInMarket();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenAppInMarket) {
                OpenAppInMarket openAppInMarket = (OpenAppInMarket) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1976377704;
        }

        public String toString() {
            return "OpenAppInMarket";
        }

        private OpenAppInMarket() {
        }
    }
}
