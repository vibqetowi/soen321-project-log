package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.SentryOptions;
/* loaded from: classes4.dex */
public final class SentryWindowCallback extends WindowCallbackAdapter {
    private final Window.Callback delegate;
    private final GestureDetectorCompat gestureDetector;
    private final SentryGestureListener gestureListener;
    private final MotionEventObtainer motionEventObtainer;
    private final SentryOptions options;

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i, Menu menu) {
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i) {
        return super.onCreatePanelView(i);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i, View view, Menu menu) {
        return super.onPreparePanel(i, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return super.onWindowStartingActionMode(callback, i);
    }

    public SentryWindowCallback(Window.Callback callback, Context context, SentryGestureListener sentryGestureListener, SentryOptions sentryOptions) {
        this(callback, new GestureDetectorCompat(context, sentryGestureListener), sentryGestureListener, sentryOptions, new MotionEventObtainer() { // from class: io.sentry.android.core.internal.gestures.SentryWindowCallback.1
            @Override // io.sentry.android.core.internal.gestures.SentryWindowCallback.MotionEventObtainer
            public /* synthetic */ MotionEvent obtain(MotionEvent motionEvent) {
                return MotionEvent.obtain(motionEvent);
            }
        });
    }

    SentryWindowCallback(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, SentryGestureListener sentryGestureListener, SentryOptions sentryOptions, MotionEventObtainer motionEventObtainer) {
        super(callback);
        this.delegate = callback;
        this.gestureListener = sentryGestureListener;
        this.options = sentryOptions;
        this.gestureDetector = gestureDetectorCompat;
        this.motionEventObtainer = motionEventObtainer;
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                handleTouchEvent(this.motionEventObtainer.obtain(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void handleTouchEvent(MotionEvent motionEvent) {
        this.gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.gestureListener.onUp(motionEvent);
        }
    }

    public Window.Callback getDelegate() {
        return this.delegate;
    }

    /* loaded from: classes4.dex */
    interface MotionEventObtainer {
        MotionEvent obtain(MotionEvent motionEvent);

        /* renamed from: io.sentry.android.core.internal.gestures.SentryWindowCallback$MotionEventObtainer$-CC  reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
        }
    }
}
