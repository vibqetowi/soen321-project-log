package com.ifriend.animatedBackground.droplet;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import by.kirich1409.viewbindingdelegate.EagerViewBindingProperty;
import by.kirich1409.viewbindingdelegate.LazyViewBindingProperty;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.ifriend.animatedBackground.BaseAnimatedBackgroundView;
import com.ifriend.animatedBackground.R;
import com.ifriend.animatedBackground.databinding.ViewDropletBackgroundBinding;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.toggle.AnimatedBackgroundFeatureToggle;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.ui.utils.ViewCoroutineScopeKt;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u00105\u001a\u00020*H\u0002J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\nH\u0016J\u0011\u00108\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0002J\u0018\u0010>\u001a\u00020*2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0002J\b\u0010?\u001a\u00020*H\u0014J\b\u0010@\u001a\u00020*H\u0002J\b\u0010A\u001a\u00020*H\u0002J\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020<H\u0002J\b\u0010E\u001a\u00020*H\u0003J\b\u0010F\u001a\u00020*H\u0002J\u000e\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020IJ\u0010\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020,H\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/DropletBackgroundView;", "Landroid/widget/FrameLayout;", "Lcom/ifriend/animatedBackground/droplet/JsExecutor;", "Lcom/ifriend/animatedBackground/BaseAnimatedBackgroundView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "kotlin.jvm.PlatformType", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "getAppConfigRepository", "()Lcom/ifriend/domain/data/config/AppConfigRepository;", "appConfigRepository$delegate", "Lkotlin/Lazy;", "backgroundDelegate", "Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate;", "getBackgroundDelegate", "()Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate;", "backgroundDelegate$delegate", "delayStopDroplet", "Lkotlinx/coroutines/Job;", "dropletState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/animatedBackground/droplet/DropletState;", "getDropletState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "featureToggle", "Lcom/ifriend/data/toggle/AnimatedBackgroundFeatureToggle;", "getFeatureToggle", "()Lcom/ifriend/data/toggle/AnimatedBackgroundFeatureToggle;", "featureToggle$delegate", "logger", "Lcom/ifriend/common_utils/Logger;", "getLogger", "()Lcom/ifriend/common_utils/Logger;", "logger$delegate", "moveActionToRetry", "Lkotlin/Function0;", "", "pageLoaded", "", "viewBinding", "Lcom/ifriend/animatedBackground/databinding/ViewDropletBackgroundBinding;", "getViewBinding", "()Lcom/ifriend/animatedBackground/databinding/ViewDropletBackgroundBinding;", "viewBinding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "webView", "Landroid/webkit/WebView;", "bindWebViewState", "executeJsCommand", "jsCommand", "loadPage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "toX", "", "toY", "moveSystem", "onAttachedToWindow", "onLoadError", "onPageLoaded", "onTouchDown", "x", "y", "setupWebView", "stopMove", "touchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "webViewVisible", "isVisible", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DropletBackgroundView extends FrameLayout implements JsExecutor, BaseAnimatedBackgroundView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DropletBackgroundView.class, "viewBinding", "getViewBinding()Lcom/ifriend/animatedBackground/databinding/ViewDropletBackgroundBinding;", 0))};
    private final String TAG;
    private final Lazy appConfigRepository$delegate;
    private final Lazy backgroundDelegate$delegate;
    private Job delayStopDroplet;
    private final MutableStateFlow<DropletState> dropletState;
    private final Lazy featureToggle$delegate;
    private final Lazy logger$delegate;
    private Function0<Unit> moveActionToRetry;
    private boolean pageLoaded;
    private final ViewBindingProperty viewBinding$delegate;
    private WebView webView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeJsCommand$lambda$0(String str) {
    }

    public /* synthetic */ DropletBackgroundView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LazyViewBindingProperty lazyViewBindingProperty;
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundDelegate$delegate = LazyKt.lazy(new DropletBackgroundView$backgroundDelegate$2(context, this));
        this.appConfigRepository$delegate = LazyKt.lazy(DropletBackgroundView$appConfigRepository$2.INSTANCE);
        this.featureToggle$delegate = LazyKt.lazy(DropletBackgroundView$featureToggle$2.INSTANCE);
        this.logger$delegate = LazyKt.lazy(DropletBackgroundView$logger$2.INSTANCE);
        this.dropletState = StateFlowKt.MutableStateFlow(InitState.INSTANCE);
        DropletBackgroundView dropletBackgroundView = this;
        Function1 emptyVbCallback = UtilsKt.emptyVbCallback();
        if (dropletBackgroundView.isInEditMode()) {
            lazyViewBindingProperty = new EagerViewBindingProperty(ViewDropletBackgroundBinding.bind(dropletBackgroundView));
        } else {
            lazyViewBindingProperty = new LazyViewBindingProperty(emptyVbCallback, new DropletBackgroundView$special$$inlined$viewBinding$1());
        }
        this.viewBinding$delegate = lazyViewBindingProperty;
        this.TAG = getClass().getSimpleName();
        FrameLayout.inflate(context, R.layout.view_droplet_background, dropletBackgroundView);
        setBackground(ContextCompat.getDrawable(context, com.ifriend.ui.R.drawable.background_app_gradient));
        setupWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimatedBackgroundDelegate getBackgroundDelegate() {
        return (AnimatedBackgroundDelegate) this.backgroundDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConfigRepository getAppConfigRepository() {
        return (AppConfigRepository) this.appConfigRepository$delegate.getValue();
    }

    private final AnimatedBackgroundFeatureToggle getFeatureToggle() {
        return (AnimatedBackgroundFeatureToggle) this.featureToggle$delegate.getValue();
    }

    private final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    public final MutableStateFlow<DropletState> getDropletState() {
        return this.dropletState;
    }

    private final ViewDropletBackgroundBinding getViewBinding() {
        return (ViewDropletBackgroundBinding) this.viewBinding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DropletBackgroundView dropletBackgroundView = this;
        InsetsExtensionsKt.setKeyboardListener(dropletBackgroundView, new DropletBackgroundView$onAttachedToWindow$1(this));
        BuildersKt.launch$default(ViewCoroutineScopeKt.getViewScope(dropletBackgroundView), null, null, new DropletBackgroundView$onAttachedToWindow$2(this, null), 3, null);
    }

    @Override // com.ifriend.animatedBackground.droplet.JsExecutor
    public void executeJsCommand(String jsCommand) {
        Intrinsics.checkNotNullParameter(jsCommand, "jsCommand");
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript(jsCommand, new ValueCallback() { // from class: com.ifriend.animatedBackground.droplet.DropletBackgroundView$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DropletBackgroundView.executeJsCommand$lambda$0((String) obj);
                }
            });
        }
    }

    public final void touchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        Log.d(this.TAG, event.toString());
        move(rawX, rawY);
        Job job = this.delayStopDroplet;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.delayStopDroplet = BuildersKt.launch$default(ViewCoroutineScopeKt.getViewScope(this), null, null, new DropletBackgroundView$touchEvent$1(this, null), 3, null);
        if (event.getAction() == 0) {
            onTouchDown(rawX, rawY);
        }
    }

    private final void setupWebView() {
        try {
            WebView webView = new WebView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            webView.setBackgroundColor(0);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            AnimatedBackgroundErrorHandlerWebClient animatedBackgroundErrorHandlerWebClient = new AnimatedBackgroundErrorHandlerWebClient(getLogger());
            animatedBackgroundErrorHandlerWebClient.setup(new DropletBackgroundView$setupWebView$1$1$1(this), new DropletBackgroundView$setupWebView$1$1$2(this));
            webView.setWebViewClient(animatedBackgroundErrorHandlerWebClient);
            addView(webView, 0, layoutParams);
            final WebView webView2 = webView;
            if (ViewCompat.isAttachedToWindow(webView2)) {
                webViewVisible(false);
            } else {
                webView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ifriend.animatedBackground.droplet.DropletBackgroundView$setupWebView$lambda$3$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        webView2.removeOnAttachStateChangeListener(this);
                        this.webViewVisible(false);
                    }
                });
            }
            this.webView = webView;
        } catch (Throwable th) {
            getLogger().logException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPage(Continuation<? super Unit> continuation) {
        DropletBackgroundView$loadPage$1 dropletBackgroundView$loadPage$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        DropletBackgroundView dropletBackgroundView;
        if (continuation instanceof DropletBackgroundView$loadPage$1) {
            dropletBackgroundView$loadPage$1 = (DropletBackgroundView$loadPage$1) continuation;
            if ((dropletBackgroundView$loadPage$1.label & Integer.MIN_VALUE) != 0) {
                dropletBackgroundView$loadPage$1.label -= Integer.MIN_VALUE;
                obj = dropletBackgroundView$loadPage$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dropletBackgroundView$loadPage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AnimatedBackgroundFeatureToggle featureToggle = getFeatureToggle();
                    dropletBackgroundView$loadPage$1.L$0 = this;
                    dropletBackgroundView$loadPage$1.label = 1;
                    obj = featureToggle.isEnabled(dropletBackgroundView$loadPage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dropletBackgroundView = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                } else {
                    dropletBackgroundView = (DropletBackgroundView) dropletBackgroundView$loadPage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dropletBackgroundView$loadPage$1.L$0 = null;
                dropletBackgroundView$loadPage$1.label = 2;
                if (((StateFlow) obj).collect(new DropletBackgroundView$loadPage$2(dropletBackgroundView), dropletBackgroundView$loadPage$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
        }
        dropletBackgroundView$loadPage$1 = new DropletBackgroundView$loadPage$1(this, continuation);
        obj = dropletBackgroundView$loadPage$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dropletBackgroundView$loadPage$1.label;
        if (i != 0) {
        }
        dropletBackgroundView$loadPage$1.L$0 = null;
        dropletBackgroundView$loadPage$1.label = 2;
        if (((StateFlow) obj).collect(new DropletBackgroundView$loadPage$2(dropletBackgroundView), dropletBackgroundView$loadPage$1) == coroutine_suspended) {
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadError() {
        this.pageLoaded = false;
        webViewVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageLoaded() {
        this.pageLoaded = true;
        webViewVisible(true);
        Function0<Unit> function0 = this.moveActionToRetry;
        if (function0 != null) {
            if (function0 != null) {
                function0.invoke();
            }
            this.moveActionToRetry = null;
        }
        bindWebViewState();
    }

    private final void bindWebViewState() {
        FlowKt.launchIn(FlowKt.onEach(this.dropletState, new DropletBackgroundView$bindWebViewState$1(this, null)), ViewCoroutineScopeKt.getViewScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void webViewVisible(boolean z) {
        if (!z) {
            WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            webView.setVisibility(4);
            return;
        }
        WebView webView2 = this.webView;
        boolean z2 = false;
        if (webView2 != null) {
            if (!(webView2.getVisibility() == 0)) {
                z2 = true;
            }
        }
        if (z2) {
            BuildersKt.launch$default(ViewCoroutineScopeKt.getViewScope(this), null, null, new DropletBackgroundView$webViewVisible$1(this, null), 3, null);
        }
    }

    private final void onTouchDown(float f, float f2) {
        getBackgroundDelegate().onTouchDown(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSystem(float f, float f2) {
        if (this.pageLoaded) {
            getBackgroundDelegate().move(f, f2);
        } else {
            this.moveActionToRetry = new DropletBackgroundView$moveSystem$1(this, f, f2);
        }
    }

    private final void move(float f, float f2) {
        getBackgroundDelegate().move(f, f2);
        getBackgroundDelegate().touchAtCoordinates(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopMove() {
        getBackgroundDelegate().stopMove();
    }
}
