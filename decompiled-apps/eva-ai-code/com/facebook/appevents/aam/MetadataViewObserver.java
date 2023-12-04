package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* compiled from: MetadataViewObserver.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processedText", "", "", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalFocusChanged", "", "oldView", "Landroid/view/View;", "newView", "process", ViewHierarchyConstants.VIEW_KEY, "processEditText", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "startTracking", "stopTracking", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Set<String> processedText;
    private final Handler uiThreadHandler;
    public static final Companion Companion = new Companion(null);
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();

    public /* synthetic */ MetadataViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    @JvmStatic
    public static final void startTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.startTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    @JvmStatic
    public static final void stopTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Companion.stopTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
            if (rootView == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void stopTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false)) {
                AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                View rootView = AppEventUtility.getRootView(this.activityWeakReference.get());
                if (rootView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (view != null) {
            try {
                process(view);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        if (view2 != null) {
            process(view2);
        }
    }

    private final void process(final View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            runOnUIThread(new Runnable() { // from class: com.facebook.appevents.aam.MetadataViewObserver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MetadataViewObserver.m6315process$lambda0(view, this);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: process$lambda-0  reason: not valid java name */
    public static final void m6315process$lambda0(View view, MetadataViewObserver this$0) {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.processEditText(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
        }
    }

    private final void processEditText(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = StringsKt.trim((CharSequence) obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap hashMap = new HashMap();
                MetadataMatcher metadataMatcher = MetadataMatcher.INSTANCE;
                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                List<String> list = null;
                for (MetadataRule metadataRule : MetadataRule.Companion.getRules()) {
                    Companion companion = Companion;
                    String preNormalize = companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (metadataRule.getValRule().length() > 0) {
                        MetadataMatcher metadataMatcher2 = MetadataMatcher.INSTANCE;
                        if (!MetadataMatcher.matchValue(preNormalize, metadataRule.getValRule())) {
                        }
                    }
                    MetadataMatcher metadataMatcher3 = MetadataMatcher.INSTANCE;
                    if (!MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                        if (list == null) {
                            MetadataMatcher metadataMatcher4 = MetadataMatcher.INSTANCE;
                            list = MetadataMatcher.getAroundViewIndicators(view);
                        }
                        MetadataMatcher metadataMatcher5 = MetadataMatcher.INSTANCE;
                        if (MetadataMatcher.matchIndicator(list, metadataRule.getKeyRules())) {
                            companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                        }
                    } else {
                        companion.putUserData(hashMap, metadataRule.getName(), preNormalize);
                    }
                }
                InternalAppEventsLogger.Companion.setInternalUserData(hashMap);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: MetadataViewObserver.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J,\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "preNormalize", "", "key", "value", "putUserData", "", "userData", "startTrackingActivity", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void startTrackingActivity(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new MetadataViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) obj);
        }

        @JvmStatic
        public final void stopTrackingActivity(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver == null) {
                return;
            }
            MetadataViewObserver.access$stopTracking(metadataViewObserver);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String preNormalize(String str, String str2) {
            if (Intrinsics.areEqual("r2", str)) {
                return new Regex("[^\\d.]").replace(str2, "");
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r8.equals("r5") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
            if (r8.equals("r4") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            r9 = new kotlin.text.Regex("[^a-z]+").replace(r9, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void putUserData(Map<String, String> map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (!StringsKt.startsWith$default(str2, "m", false, 2, (Object) null) && !StringsKt.startsWith$default(str2, "b", false, 2, (Object) null) && !StringsKt.startsWith$default(str2, UserDataStore.GENDER, false, 2, (Object) null)) {
                            str2 = "f";
                            break;
                        } else {
                            str2 = "m";
                            break;
                        }
                    }
                    break;
                case 3588:
                    if (str.equals("r6")) {
                        String str3 = str2;
                        if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "-", false, 2, (Object) null)) {
                            Object[] array = new Regex("-").split(str3, 0).toArray(new String[0]);
                            if (array != null) {
                                str2 = ((String[]) array)[0];
                                break;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    break;
            }
            map.put(str, str2);
        }
    }
}
