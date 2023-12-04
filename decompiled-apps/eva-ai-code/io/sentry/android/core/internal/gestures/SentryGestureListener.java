package io.sentry.android.core.internal.gestures;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.ViewTargetSelector;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryGestureListener implements GestureDetector.OnGestureListener {
    private final IHub hub;
    private final boolean isAndroidXAvailable;
    private final SentryAndroidOptions options;
    private final ScrollState scrollState = new ScrollState();
    private final WeakReference<Window> windowRef;

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    public SentryGestureListener(WeakReference<Window> weakReference, IHub iHub, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        this.windowRef = weakReference;
        this.hub = iHub;
        this.options = sentryAndroidOptions;
        this.isAndroidXAvailable = z;
    }

    public void onUp(MotionEvent motionEvent) {
        View ensureWindowDecorView = ensureWindowDecorView("onUp");
        View view = (View) this.scrollState.targetRef.get();
        if (ensureWindowDecorView == null || view == null) {
            return;
        }
        if (this.scrollState.type == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        addBreadcrumb(view, this.scrollState.type, Collections.singletonMap("direction", this.scrollState.calculateDirection(motionEvent)));
        this.scrollState.reset();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.scrollState.reset();
        this.scrollState.startX = motionEvent.getX();
        this.scrollState.startY = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View ensureWindowDecorView = ensureWindowDecorView("onSingleTapUp");
        if (ensureWindowDecorView != null && motionEvent != null) {
            View findTarget = ViewUtils.findTarget(ensureWindowDecorView, motionEvent.getX(), motionEvent.getY(), new ViewTargetSelector() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener$$ExternalSyntheticLambda0
                @Override // io.sentry.android.core.internal.gestures.ViewTargetSelector
                public final boolean select(View view) {
                    boolean isViewTappable;
                    isViewTappable = ViewUtils.isViewTappable(view);
                    return isViewTappable;
                }

                @Override // io.sentry.android.core.internal.gestures.ViewTargetSelector
                public /* synthetic */ boolean skipChildren() {
                    return ViewTargetSelector.CC.$default$skipChildren(this);
                }
            });
            if (findTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            addBreadcrumb(findTarget, "click", Collections.emptyMap());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View ensureWindowDecorView = ensureWindowDecorView("onScroll");
        if (ensureWindowDecorView != null && motionEvent != null && this.scrollState.type == null) {
            View findTarget = ViewUtils.findTarget(ensureWindowDecorView, motionEvent.getX(), motionEvent.getY(), new ViewTargetSelector() { // from class: io.sentry.android.core.internal.gestures.SentryGestureListener.1
                @Override // io.sentry.android.core.internal.gestures.ViewTargetSelector
                public boolean skipChildren() {
                    return true;
                }

                @Override // io.sentry.android.core.internal.gestures.ViewTargetSelector
                public boolean select(View view) {
                    return ViewUtils.isViewScrollable(view, SentryGestureListener.this.isAndroidXAvailable);
                }
            });
            if (findTarget == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.scrollState.setTarget(findTarget);
            this.scrollState.type = "scroll";
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scrollState.type = "swipe";
        return false;
    }

    private void addBreadcrumb(View view, String str, Map<String, Object> map) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        this.hub.addBreadcrumb(Breadcrumb.userInteraction(str, ViewUtils.getResourceId(view), canonicalName, map));
    }

    private View ensureWindowDecorView(String str) {
        Window window = this.windowRef.get();
        if (window == null) {
            ILogger logger = this.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            logger.log(sentryLevel, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            ILogger logger2 = this.options.getLogger();
            SentryLevel sentryLevel2 = SentryLevel.DEBUG;
            logger2.log(sentryLevel2, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        return decorView;
    }

    /* loaded from: classes4.dex */
    private static final class ScrollState {
        private float startX;
        private float startY;
        private WeakReference<View> targetRef;
        private String type;

        private ScrollState() {
            this.type = null;
            this.targetRef = new WeakReference<>(null);
            this.startX = 0.0f;
            this.startY = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTarget(View view) {
            this.targetRef = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String calculateDirection(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.startX;
            float y = motionEvent.getY() - this.startY;
            return Math.abs(x) > Math.abs(y) ? x > 0.0f ? TtmlNode.RIGHT : "left" : y > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.targetRef.clear();
            this.type = null;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }
    }
}
