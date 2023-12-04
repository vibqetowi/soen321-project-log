package com.ifriend.ui.components.popup;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppModalPopup.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u001d\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J*\u0010$\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\r¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\r2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0017@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ifriend/ui/components/popup/ModalPopupWindow;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "composeView", "Landroid/view/View;", "saveId", "Ljava/util/UUID;", "(Lkotlin/jvm/functions/Function0;Landroid/view/View;Ljava/util/UUID;)V", "<set-?>", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", NativeProtocol.WEB_DIALOG_PARAMS, "Landroid/view/WindowManager$LayoutParams;", "", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "dismiss", "dispatchKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onGlobalLayout", "setCustomContent", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "show", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModalPopupWindow extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ViewRootForInspector {
    public static final int $stable = 8;
    private final View composeView;
    private final MutableState content$delegate;
    private Function0<Unit> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final WindowManager windowManager;

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return ViewRootForInspector.CC.$default$getSubCompositionView(this);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return ViewRootForInspector.CC.$default$getViewRoot(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModalPopupWindow(Function0<Unit> onDismissRequest, View composeView, UUID saveId) {
        super(r2, null, 0, 6, null);
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(saveId, "saveId");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.onDismissRequest = onDismissRequest;
        this.composeView = composeView;
        setId(16908290);
        ModalPopupWindow modalPopupWindow = this;
        ViewTreeLifecycleOwner.set(modalPopupWindow, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(modalPopupWindow, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(modalPopupWindow, ViewTreeSavedStateRegistryOwner.get(composeView));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + saveId);
        setClipChildren(false);
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.flags &= -163841;
        layoutParams.flags |= 512;
        this.params = layoutParams;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AppModalPopupKt.INSTANCE.m7052getLambda1$common_ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content$delegate.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content$delegate.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-10491066);
        ComposerKt.sourceInformation(startRestartGroup, "C(Content)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-10491066, i, -1, "com.ifriend.ui.components.popup.ModalPopupWindow.Content (AppModalPopup.kt:145)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ModalPopupWindow$Content$4(this, i));
    }

    public static /* synthetic */ void setCustomContent$default(ModalPopupWindow modalPopupWindow, CompositionContext compositionContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        modalPopupWindow.setCustomContent(compositionContext, function2);
    }

    public final void setCustomContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (compositionContext != null) {
            setParentCompositionContext(compositionContext);
        }
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void dismiss() {
        ModalPopupWindow modalPopupWindow = this;
        ViewTreeLifecycleOwner.set(modalPopupWindow, null);
        ViewTreeSavedStateRegistryOwner.set(modalPopupWindow, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(modalPopupWindow);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            } else if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                this.onDismissRequest.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }
}
