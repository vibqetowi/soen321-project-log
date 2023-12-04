package com.ifriend.icon_switcher;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppComponentPostponedSwitcher.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/icon_switcher/AppComponentPostponedSwitcher;", "Lcom/ifriend/icon_switcher/AppComponentSwitcher;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "TAG", "", "postponedSwitchRunner", "Lkotlin/Function0;", "", KeychainModule.AuthPromptOptions.CANCEL, "onStop", "owner", "Landroidx/lifecycle/LifecycleOwner;", "postponeSwitch", "componentNameToDisable", "componentNameToEnable", "context", "Landroid/content/Context;", "registerActivityLifecycleCallbacks", "switchComponents", "unregisterActivityLifecycleCallbacks", "icon_switcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppComponentPostponedSwitcher implements AppComponentSwitcher, DefaultLifecycleObserver {
    public static final AppComponentPostponedSwitcher INSTANCE = new AppComponentPostponedSwitcher();
    private static final String TAG = "ComponentSwitcher";
    private static Function0<Unit> postponedSwitchRunner;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    private AppComponentPostponedSwitcher() {
    }

    private final void postponeSwitch(String str, String str2, Context context) {
        if (!(str2.length() == 0)) {
            if (!(str.length() == 0)) {
                postponedSwitchRunner = new AppComponentPostponedSwitcher$postponeSwitch$1(str, str2, context);
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.ifriend.icon_switcher.AppComponentPostponedSwitcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppComponentPostponedSwitcher.postponeSwitch$lambda$0();
                    }
                });
                return;
            }
        }
        Log.e(TAG, "Component name must not be empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postponeSwitch$lambda$0() {
        AppComponentPostponedSwitcher appComponentPostponedSwitcher = INSTANCE;
        appComponentPostponedSwitcher.unregisterActivityLifecycleCallbacks();
        appComponentPostponedSwitcher.registerActivityLifecycleCallbacks();
    }

    public final void cancel() {
        unregisterActivityLifecycleCallbacks();
    }

    @Override // com.ifriend.icon_switcher.AppComponentSwitcher
    public void switchComponents(String componentNameToDisable, String componentNameToEnable, Context context) {
        Intrinsics.checkNotNullParameter(componentNameToDisable, "componentNameToDisable");
        Intrinsics.checkNotNullParameter(componentNameToEnable, "componentNameToEnable");
        Intrinsics.checkNotNullParameter(context, "context");
        postponeSwitch(componentNameToDisable, componentNameToEnable, context);
    }

    private final void registerActivityLifecycleCallbacks() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
    }

    private final void unregisterActivityLifecycleCallbacks() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0<Unit> function0 = postponedSwitchRunner;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
