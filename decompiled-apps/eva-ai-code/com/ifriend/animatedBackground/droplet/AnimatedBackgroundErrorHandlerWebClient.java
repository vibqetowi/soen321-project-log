package com.ifriend.animatedBackground.droplet;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.common_utils.Logger;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedBackgroundErrorHandlerWebClient.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003'()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u001a\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010 H\u0016J\u001c\u0010!\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010%\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\"\u0010&\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundErrorHandlerWebClient;", "Landroid/webkit/WebViewClient;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/common_utils/Logger;)V", "loadingAttempts", "", "onLoadError", "Lkotlin/Function0;", "", "onPageFinished", "webViewSuccess", "", "logLoadingException", "error", "Landroid/webkit/WebResourceError;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "onWebViewError", "reloadIfPossible", "setup", "Companion", "ErrorInWebView", "ErrorWhileLoadingAnimatedBackground", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedBackgroundErrorHandlerWebClient extends WebViewClient {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_LOADING_ATTEMPTS = 1;
    private int loadingAttempts;
    private final Logger logger;
    private Function0<Unit> onLoadError;
    private Function0<Unit> onPageFinished;
    private boolean webViewSuccess;

    public AnimatedBackgroundErrorHandlerWebClient(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.webViewSuccess = true;
    }

    /* compiled from: AnimatedBackgroundErrorHandlerWebClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundErrorHandlerWebClient$Companion;", "", "()V", "MAX_LOADING_ATTEMPTS", "", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void setup(Function0<Unit> onLoadError, Function0<Unit> onPageFinished) {
        Intrinsics.checkNotNullParameter(onLoadError, "onLoadError");
        Intrinsics.checkNotNullParameter(onPageFinished, "onPageFinished");
        this.onPageFinished = onPageFinished;
        this.onLoadError = onLoadError;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.webViewSuccess = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Function0<Unit> function0;
        super.onPageFinished(webView, str);
        if (!this.webViewSuccess || (function0 = this.onPageFinished) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        onWebViewError(webView);
        Logger logger = this.logger;
        String simpleName = getClass().getSimpleName();
        Logger.DefaultImpls.error$default(logger, simpleName + " onReceivedHttpError", null, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        onWebViewError(webView);
        Logger logger = this.logger;
        String simpleName = getClass().getSimpleName();
        String sslError2 = sslError != null ? sslError.toString() : null;
        Logger.DefaultImpls.error$default(logger, simpleName + " onReceivedSslError " + sslError2, null, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onWebViewError(webView);
        logLoadingException(webResourceError);
    }

    private final void onWebViewError(WebView webView) {
        this.webViewSuccess = false;
        Function0<Unit> function0 = this.onLoadError;
        if (function0 != null) {
            function0.invoke();
        }
        reloadIfPossible(webView);
    }

    private final void logLoadingException(WebResourceError webResourceError) {
        this.logger.logException(new ErrorWhileLoadingAnimatedBackground(webResourceError));
    }

    private final boolean reloadIfPossible(WebView webView) {
        int i = this.loadingAttempts + 1;
        this.loadingAttempts = i;
        if (i <= 1) {
            if (webView != null) {
                webView.reload();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.logger.logException(ErrorInWebView.INSTANCE);
        return true;
    }

    /* compiled from: AnimatedBackgroundErrorHandlerWebClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundErrorHandlerWebClient$ErrorInWebView;", "Ljava/io/IOException;", "()V", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ErrorInWebView extends IOException {
        public static final ErrorInWebView INSTANCE = new ErrorInWebView();

        private ErrorInWebView() {
            super("Internal error in WebView.");
        }
    }

    /* compiled from: AnimatedBackgroundErrorHandlerWebClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundErrorHandlerWebClient$ErrorWhileLoadingAnimatedBackground;", "Ljava/io/IOException;", "error", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebResourceError;)V", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ErrorWhileLoadingAnimatedBackground extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ErrorWhileLoadingAnimatedBackground(WebResourceError webResourceError) {
            super("Error while loading animated background.\nCode: " + r1 + ", Description: " + ((Object) r0));
            Integer valueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
        }
    }
}
