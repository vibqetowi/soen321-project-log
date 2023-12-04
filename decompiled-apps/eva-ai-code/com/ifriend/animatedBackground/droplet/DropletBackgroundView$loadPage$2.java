package com.ifriend.animatedBackground.droplet;

import android.webkit.WebView;
import com.google.firebase.perf.util.Constants;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.data.config.AppConfigRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", Constants.ENABLE_DISABLE, "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DropletBackgroundView$loadPage$2<T> implements FlowCollector {
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DropletBackgroundView$loadPage$2(DropletBackgroundView dropletBackgroundView) {
        this.this$0 = dropletBackgroundView;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit(((Boolean) obj).booleanValue(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
        DropletBackgroundView$loadPage$2$emit$1 dropletBackgroundView$loadPage$2$emit$1;
        int i;
        AppConfigRepository appConfigRepository;
        DropletBackgroundView$loadPage$2<T> dropletBackgroundView$loadPage$2;
        String str;
        WebView webView;
        if (continuation instanceof DropletBackgroundView$loadPage$2$emit$1) {
            dropletBackgroundView$loadPage$2$emit$1 = (DropletBackgroundView$loadPage$2$emit$1) continuation;
            if ((dropletBackgroundView$loadPage$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                dropletBackgroundView$loadPage$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = dropletBackgroundView$loadPage$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dropletBackgroundView$loadPage$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appConfigRepository = this.this$0.getAppConfigRepository();
                    dropletBackgroundView$loadPage$2$emit$1.L$0 = this;
                    dropletBackgroundView$loadPage$2$emit$1.Z$0 = z;
                    dropletBackgroundView$loadPage$2$emit$1.label = 1;
                    obj = appConfigRepository.getFeatureStringValue(ConfigKeys.ANIMATE_BACKGROUND_URL, dropletBackgroundView$loadPage$2$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dropletBackgroundView$loadPage$2 = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    z = dropletBackgroundView$loadPage$2$emit$1.Z$0;
                    dropletBackgroundView$loadPage$2 = (DropletBackgroundView$loadPage$2) dropletBackgroundView$loadPage$2$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (!z) {
                    dropletBackgroundView$loadPage$2.this$0.webViewVisible(false);
                }
                if (z && str != null && webView != null) {
                    webView.loadUrl(str);
                }
                return Unit.INSTANCE;
            }
        }
        dropletBackgroundView$loadPage$2$emit$1 = new DropletBackgroundView$loadPage$2$emit$1(this, continuation);
        Object obj2 = dropletBackgroundView$loadPage$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dropletBackgroundView$loadPage$2$emit$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (!z) {
        }
        if (z) {
            webView = dropletBackgroundView$loadPage$2.this$0.webView;
            webView.loadUrl(str);
        }
        return Unit.INSTANCE;
    }
}
