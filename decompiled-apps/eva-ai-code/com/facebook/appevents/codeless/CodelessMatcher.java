package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.RCTCodelessLoggingEventListener;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
import org.apache.http.cookie.ClientCookie;
/* compiled from: CodelessMatcher.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\f`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher;", "", "()V", "activitiesSet", "", "Landroid/app/Activity;", "activityToListenerMap", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "listenerSet", "uiThreadHandler", "Landroid/os/Handler;", "viewMatchers", "Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "add", "", "activity", "destroy", "matchViews", "remove", "startTracking", "Companion", "MatchedView", "ViewMatcher", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CodelessMatcher {
    private static final String CURRENT_CLASS_NAME = ".";
    private static final String PARENT_CLASS_NAME = "..";
    private static CodelessMatcher codelessMatcher;
    private final Set<Activity> activitiesSet;
    private final HashMap<Integer, HashSet<String>> activityToListenerMap;
    private HashSet<String> listenerSet;
    private final Handler uiThreadHandler;
    private final Set<ViewMatcher> viewMatchers;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CodelessMatcher.class.getCanonicalName();

    public /* synthetic */ CodelessMatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final synchronized CodelessMatcher getInstance() {
        synchronized (CodelessMatcher.class) {
            if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
                return null;
            }
            return Companion.getInstance();
        }
    }

    @JvmStatic
    public static final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return Companion.getParameters(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    private CodelessMatcher() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = newSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    public static final /* synthetic */ CodelessMatcher access$getCodelessMatcher$cp() {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return codelessMatcher;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCodelessMatcher$cp(CodelessMatcher codelessMatcher2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return;
        }
        try {
            codelessMatcher = codelessMatcher2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
        }
    }

    public final void add(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            InternalSettings internalSettings = InternalSettings.INSTANCE;
            if (InternalSettings.isUnityApp()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void remove(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            InternalSettings internalSettings = InternalSettings.INSTANCE;
            if (InternalSettings.isUnityApp()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            this.activityToListenerMap.put(Integer.valueOf(activity.hashCode()), (HashSet) this.listenerSet.clone());
            this.listenerSet.clear();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void destroy(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                matchViews();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: com.facebook.appevents.codeless.CodelessMatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CodelessMatcher.m6325startTracking$lambda1(CodelessMatcher.this);
                    }
                });
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startTracking$lambda-1  reason: not valid java name */
    public static final void m6325startTracking$lambda1(CodelessMatcher this$0) {
        if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.matchViews();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessMatcher.class);
        }
    }

    private final void matchViews() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    View rootView = AppEventUtility.getRootView(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "activity.javaClass.simpleName");
                    this.viewMatchers.add(new ViewMatcher(rootView, this.uiThreadHandler, this.listenerSet, simpleName));
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "viewMapKey", "", "(Landroid/view/View;Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "getViewMapKey", "()Ljava/lang/String;", "getView", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class MatchedView {
        private final WeakReference<View> view;
        private final String viewMapKey;

        public MatchedView(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.view = new WeakReference<>(view);
            this.viewMapKey = viewMapKey;
        }

        public final String getViewMapKey() {
            return this.viewMapKey;
        }

        public final View getView() {
            WeakReference<View> weakReference = this.view;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u001c\u0010\u001a\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "rootView", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "listenerSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "activityName", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "eventBindings", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "attachListener", "", "matchedView", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "attachOnClickListener", "attachOnItemClickListener", "attachRCTListener", "findView", "onGlobalLayout", "onScrollChanged", "run", "startMatch", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final Companion Companion = new Companion(null);
        private final String activityName;
        private List<EventBinding> eventBindings;
        private final Handler handler;
        private final HashSet<String> listenerSet;
        private final WeakReference<View> rootView;

        @JvmStatic
        public static final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            return Companion.findViewByPath(eventBinding, view, list, i, i2, str);
        }

        public ViewMatcher(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = listenerSet;
            this.activityName = activityName;
            handler.postDelayed(this, 200L);
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                String applicationId = FacebookSdk.getApplicationId();
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                    List<EventBinding> parseArray = EventBinding.Companion.parseArray(appSettingsWithoutQuery.getEventBindings());
                    this.eventBindings = parseArray;
                    if (parseArray == null || (view = this.rootView.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    startMatch();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            startMatch();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            startMatch();
        }

        private final void startMatch() {
            int size;
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                findView(list.get(i), this.rootView.get());
                if (i2 > size) {
                    return;
                }
                i = i2;
            }
        }

        private final void findView(EventBinding eventBinding, View view) {
            if (eventBinding == null || view == null) {
                return;
            }
            String activityName = eventBinding.getActivityName();
            if ((activityName == null || activityName.length() == 0) || Intrinsics.areEqual(eventBinding.getActivityName(), this.activityName)) {
                List<PathComponent> viewPath = eventBinding.getViewPath();
                if (viewPath.size() > 25) {
                    return;
                }
                for (MatchedView matchedView : Companion.findViewByPath(eventBinding, view, viewPath, 0, -1, this.activityName)) {
                    attachListener(matchedView, view, eventBinding);
                }
            }
        }

        private final void attachListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            if (eventBinding == null) {
                return;
            }
            try {
                View view2 = matchedView.getView();
                if (view2 == null) {
                    return;
                }
                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                View findRCTRootView = ViewHierarchy.findRCTRootView(view2);
                if (findRCTRootView != null && ViewHierarchy.INSTANCE.isRCTButton(view2, findRCTRootView)) {
                    attachRCTListener(matchedView, view, eventBinding);
                    return;
                }
                String name = view2.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.startsWith$default(name, "com.facebook.react", false, 2, (Object) null)) {
                    return;
                }
                if (!(view2 instanceof AdapterView)) {
                    attachOnClickListener(matchedView, view, eventBinding);
                } else if (view2 instanceof ListView) {
                    attachOnItemClickListener(matchedView, view, eventBinding);
                }
            } catch (Exception e) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(CodelessMatcher.access$getTAG$cp(), e);
            }
        }

        private final void attachOnClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z;
            View view2 = matchedView.getView();
            if (view2 == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            View.OnClickListener existingOnClickListener = ViewHierarchy.getExistingOnClickListener(view2);
            if (existingOnClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener) {
                if (existingOnClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((CodelessLoggingEventListener.AutoLoggingOnClickListener) existingOnClickListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                    view2.setOnClickListener(CodelessLoggingEventListener.getOnClickListener(eventBinding, view, view2));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        private final void attachOnItemClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z;
            AdapterView adapterView = (AdapterView) matchedView.getView();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                    adapterView.setOnItemClickListener(CodelessLoggingEventListener.getOnItemClickListener(eventBinding, view, adapterView));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        private final void attachRCTListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z;
            View view2 = matchedView.getView();
            if (view2 == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            View.OnTouchListener existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
            if (existingOnTouchListener instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) {
                if (existingOnTouchListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) existingOnTouchListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = RCTCodelessLoggingEventListener.INSTANCE;
                    view2.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(eventBinding, view, view2));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        /* compiled from: CodelessMatcher.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher$Companion;", "", "()V", "findViewByPath", "", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", ClientCookie.PATH_ATTR, "Lcom/facebook/appevents/codeless/internal/PathComponent;", FirebaseAnalytics.Param.LEVEL, "", FirebaseAnalytics.Param.INDEX, "mapKey", "", "findVisibleChildren", "viewGroup", "Landroid/view/ViewGroup;", "isTheSameView", "", "targetView", "pathElement", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> path, int i, int i2, String mapKey) {
                List<View> findVisibleChildren;
                int size;
                List<View> findVisibleChildren2;
                int size2;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + ClassUtils.PACKAGE_SEPARATOR_CHAR + i2;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i >= path.size()) {
                    arrayList.add(new MatchedView(view, str));
                } else {
                    PathComponent pathComponent = path.get(i);
                    if (Intrinsics.areEqual(pathComponent.getClassName(), CodelessMatcher.PARENT_CLASS_NAME)) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (findVisibleChildren = findVisibleChildren((ViewGroup) parent)).size()) > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                arrayList.addAll(findViewByPath(eventBinding, findVisibleChildren.get(i3), path, i + 1, i3, str));
                                if (i4 >= size) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                        return arrayList;
                    } else if (Intrinsics.areEqual(pathComponent.getClassName(), CodelessMatcher.CURRENT_CLASS_NAME)) {
                        arrayList.add(new MatchedView(view, str));
                        return arrayList;
                    } else if (!isTheSameView(view, pathComponent, i2)) {
                        return arrayList;
                    } else {
                        if (i == path.size() - 1) {
                            arrayList.add(new MatchedView(view, str));
                        }
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (findVisibleChildren2 = findVisibleChildren((ViewGroup) view)).size()) > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        arrayList.addAll(findViewByPath(eventBinding, findVisibleChildren2.get(i5), path, i + 1, i5, str));
                        if (i6 >= size2) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final boolean isTheSameView(View view, PathComponent pathComponent, int i) {
                if (pathComponent.getIndex() == -1 || i == pathComponent.getIndex()) {
                    if (!Intrinsics.areEqual(view.getClass().getCanonicalName(), pathComponent.getClassName())) {
                        if (new Regex(".*android\\..*").matches(pathComponent.getClassName())) {
                            List split$default = StringsKt.split$default((CharSequence) pathComponent.getClassName(), new String[]{CodelessMatcher.CURRENT_CLASS_NAME}, false, 0, 6, (Object) null);
                            if (!split$default.isEmpty()) {
                            }
                        }
                        return false;
                    }
                    if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) <= 0 || pathComponent.getId() == view.getId()) {
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) {
                            String text = pathComponent.getText();
                            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                            String textOfView = ViewHierarchy.getTextOfView(view);
                            Utility utility = Utility.INSTANCE;
                            Utility utility2 = Utility.INSTANCE;
                            String coerceValueIfNullOrEmpty = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(textOfView), "");
                            if (!Intrinsics.areEqual(text, textOfView) && !Intrinsics.areEqual(text, coerceValueIfNullOrEmpty)) {
                                return false;
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                            String description = pathComponent.getDescription();
                            String obj = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                            Utility utility3 = Utility.INSTANCE;
                            Utility utility4 = Utility.INSTANCE;
                            String coerceValueIfNullOrEmpty2 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(obj), "");
                            if (!Intrinsics.areEqual(description, obj) && !Intrinsics.areEqual(description, coerceValueIfNullOrEmpty2)) {
                                return false;
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) > 0) {
                            String hint = pathComponent.getHint();
                            ViewHierarchy viewHierarchy2 = ViewHierarchy.INSTANCE;
                            String hintOfView = ViewHierarchy.getHintOfView(view);
                            Utility utility5 = Utility.INSTANCE;
                            Utility utility6 = Utility.INSTANCE;
                            String coerceValueIfNullOrEmpty3 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(hintOfView), "");
                            if (!Intrinsics.areEqual(hint, hintOfView) && !Intrinsics.areEqual(hint, coerceValueIfNullOrEmpty3)) {
                                return false;
                            }
                        }
                        if ((pathComponent.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                            String tag = pathComponent.getTag();
                            String obj2 = view.getTag() == null ? "" : view.getTag().toString();
                            Utility utility7 = Utility.INSTANCE;
                            Utility utility8 = Utility.INSTANCE;
                            String coerceValueIfNullOrEmpty4 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(obj2), "");
                            if (!Intrinsics.areEqual(tag, obj2) && !Intrinsics.areEqual(tag, coerceValueIfNullOrEmpty4)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }

            private final List<View> findVisibleChildren(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        View child = viewGroup.getChildAt(i);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            arrayList.add(child);
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                return arrayList;
            }
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007J\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$Companion;", "", "()V", "CURRENT_CLASS_NAME", "", "PARENT_CLASS_NAME", "TAG", "codelessMatcher", "Lcom/facebook/appevents/codeless/CodelessMatcher;", "getInstance", "getParameters", "Landroid/os/Bundle;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final synchronized CodelessMatcher getInstance() {
            CodelessMatcher access$getCodelessMatcher$cp;
            if (CodelessMatcher.access$getCodelessMatcher$cp() == null) {
                CodelessMatcher.access$setCodelessMatcher$cp(new CodelessMatcher(null));
            }
            access$getCodelessMatcher$cp = CodelessMatcher.access$getCodelessMatcher$cp();
            if (access$getCodelessMatcher$cp == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return access$getCodelessMatcher$cp;
        }

        @JvmStatic
        public final Bundle getParameters(EventBinding eventBinding, View rootView, View hostView) {
            List<ParameterComponent> viewParameters;
            List<MatchedView> findViewByPath;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (eventBinding != null && (viewParameters = eventBinding.getViewParameters()) != null) {
                for (ParameterComponent parameterComponent : viewParameters) {
                    if (parameterComponent.getValue() != null) {
                        if (parameterComponent.getValue().length() > 0) {
                            bundle.putString(parameterComponent.getName(), parameterComponent.getValue());
                        }
                    }
                    if (parameterComponent.getPath().size() > 0) {
                        if (Intrinsics.areEqual(parameterComponent.getPathType(), Constants.PATH_TYPE_RELATIVE)) {
                            ViewMatcher.Companion companion = ViewMatcher.Companion;
                            List<PathComponent> path = parameterComponent.getPath();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            findViewByPath = companion.findViewByPath(eventBinding, hostView, path, 0, -1, simpleName);
                        } else {
                            ViewMatcher.Companion companion2 = ViewMatcher.Companion;
                            List<PathComponent> path2 = parameterComponent.getPath();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            findViewByPath = companion2.findViewByPath(eventBinding, rootView, path2, 0, -1, simpleName2);
                        }
                        Iterator<MatchedView> it = findViewByPath.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                MatchedView next = it.next();
                                if (next.getView() != null) {
                                    ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                                    String textOfView = ViewHierarchy.getTextOfView(next.getView());
                                    if (textOfView.length() > 0) {
                                        bundle.putString(parameterComponent.getName(), textOfView);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }
}
