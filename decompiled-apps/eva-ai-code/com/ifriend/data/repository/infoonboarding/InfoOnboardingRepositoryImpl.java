package com.ifriend.data.repository.infoonboarding;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
/* compiled from: InfoOnboardingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0014H\u0002J!\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u001a\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0002J\u0014\u0010\u001b\u001a\u00020\r*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/data/repository/infoonboarding/InfoOnboardingRepositoryImpl;", "Lcom/ifriend/domain/data/infoonboarding/InfoOnboardingRepository;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "context", "Landroid/content/Context;", "logger", "Lcom/ifriend/common_utils/Logger;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/domain/data/Preferences;Landroid/content/Context;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "getGrantedPermissions", "", "", "getInfoOnboarding", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlide;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isScreenShown", "", "screen", "Lkotlin/reflect/KClass;", "saveScreenAsShown", "", "(Lkotlin/reflect/KClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addIfNotShown", "", "addNotificationPermissionSlide", "toScreenName", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingRepositoryImpl implements InfoOnboardingRepository {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_SHOWN_SCREENS_AFTER_REQUEST = "shown_screens_after_request";
    private final Context context;
    private final DispatcherProvider dispatcherProvider;
    private final Logger logger;
    private final Preferences preferences;

    public InfoOnboardingRepositoryImpl(Preferences preferences, Context context, Logger logger, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.preferences = preferences;
        this.context = context;
        this.logger = logger;
        this.dispatcherProvider = dispatcherProvider;
    }

    /* compiled from: InfoOnboardingRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/repository/infoonboarding/InfoOnboardingRepositoryImpl$Companion;", "", "()V", "KEY_SHOWN_SCREENS_AFTER_REQUEST", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository
    public Object getInfoOnboarding(Continuation<? super List<? extends InfoOnboardingSlide>> continuation) {
        return BuildersKt.withContext(this.dispatcherProvider.background(), new InfoOnboardingRepositoryImpl$getInfoOnboarding$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addNotificationPermissionSlide(List<InfoOnboardingSlide> list) {
        if (getGrantedPermissions().contains("android.permission.POST_NOTIFICATIONS") || Build.VERSION.SDK_INT < 33) {
            return;
        }
        list.add(new InfoOnboardingSlide.PermissionRequest("android.permission.POST_NOTIFICATIONS"));
    }

    @Override // com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository
    public Object saveScreenAsShown(KClass<? extends InfoOnboardingSlide> kClass, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcherProvider.background(), new InfoOnboardingRepositoryImpl$saveScreenAsShown$2(this, kClass, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    private final boolean isScreenShown(KClass<? extends InfoOnboardingSlide> kClass) {
        return this.preferences.getStringSetWithKey(KEY_SHOWN_SCREENS_AFTER_REQUEST).contains(toScreenName(kClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addIfNotShown(List<InfoOnboardingSlide> list, InfoOnboardingSlide infoOnboardingSlide) {
        boolean isScreenShown = isScreenShown(Reflection.getOrCreateKotlinClass(infoOnboardingSlide.getClass()));
        if (!isScreenShown) {
            list.add(infoOnboardingSlide);
        }
        return !isScreenShown;
    }

    private final List<String> getGrantedPermissions() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.context.getPackageManager();
                String packageName = this.context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                packageInfo = packageManager.getPackageInfo(packageName, of);
                Intrinsics.checkNotNull(packageInfo);
            } else {
                packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 4096);
                Intrinsics.checkNotNull(packageInfo);
            }
            int length = packageInfo.requestedPermissions.length;
            for (int i = 0; i < length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    String str = packageInfo.requestedPermissions[i];
                    Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            this.logger.logException(e);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toScreenName(KClass<? extends InfoOnboardingSlide> kClass) {
        return Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.TrackActivity.class)) ? "TrackActivityScreen" : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.Intimate.class)) ? "Intimate" : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.UserWillSendPhotos.class)) ? "UserWillSendPhotos" : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.PermissionRequest.class)) ? "PermissionRequest" : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.AllowNotifications.class)) ? "UserWillReceivePhotos" : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InfoOnboardingSlide.Empty.class)) ? "EmptyScreen" : "UnknownScreen";
    }
}
