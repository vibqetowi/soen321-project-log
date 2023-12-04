package com.ifriend.presentation.features.app.delegates;

import android.content.Intent;
import com.ifriend.common_utils.Constants;
import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegateImpl$handleDeepLinks$1", f = "AppDeepLinksDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppDeepLinksDelegateImpl$handleDeepLinks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ AppDeepLinksDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDeepLinksDelegateImpl$handleDeepLinks$1(Intent intent, AppDeepLinksDelegateImpl appDeepLinksDelegateImpl, Continuation<? super AppDeepLinksDelegateImpl$handleDeepLinks$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = appDeepLinksDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppDeepLinksDelegateImpl$handleDeepLinks$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppDeepLinksDelegateImpl$handleDeepLinks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeepLinksRepository deepLinksRepository;
        DeepLinksRepository deepLinksRepository2;
        DeepLinksRepository deepLinksRepository3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String stringExtra = this.$intent.getStringExtra(Constants.DEEP_LINK_URI);
        if (stringExtra == null) {
            return Unit.INSTANCE;
        }
        this.$intent.putExtra(Constants.DEEP_LINK_URI, "");
        deepLinksRepository = this.this$0.deepLinksRepository;
        DeepLink parseByUri = deepLinksRepository.parseByUri(stringExtra);
        if (parseByUri != null) {
            deepLinksRepository2 = this.this$0.deepLinksRepository;
            deepLinksRepository2.clear();
            if (!Intrinsics.areEqual(parseByUri, DeepLink.OpenChat.INSTANCE)) {
                deepLinksRepository3 = this.this$0.deepLinksRepository;
                deepLinksRepository3.updateDeepLink(parseByUri);
            }
        }
        return Unit.INSTANCE;
    }
}
