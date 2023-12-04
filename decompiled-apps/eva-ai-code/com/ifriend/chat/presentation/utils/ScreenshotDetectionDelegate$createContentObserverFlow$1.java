package com.ifriend.chat.presentation.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenshotDetectionDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/net/Uri;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$createContentObserverFlow$1", f = "ScreenshotDetectionDelegate.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ScreenshotDetectionDelegate$createContentObserverFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Uri>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenshotDetectionDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotDetectionDelegate$createContentObserverFlow$1(ScreenshotDetectionDelegate screenshotDetectionDelegate, Continuation<? super ScreenshotDetectionDelegate$createContentObserverFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = screenshotDetectionDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenshotDetectionDelegate$createContentObserverFlow$1 screenshotDetectionDelegate$createContentObserverFlow$1 = new ScreenshotDetectionDelegate$createContentObserverFlow$1(this.this$0, continuation);
        screenshotDetectionDelegate$createContentObserverFlow$1.L$0 = obj;
        return screenshotDetectionDelegate$createContentObserverFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Uri> producerScope, Continuation<? super Unit> continuation) {
        return ((ScreenshotDetectionDelegate$createContentObserverFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        ContentResolver contentResolver;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final Handler handler = new Handler(Looper.getMainLooper());
            ?? r3 = new ContentObserver(handler) { // from class: com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1
                @Override // android.database.ContentObserver
                public void onChange(boolean z, Uri uri) {
                    if (uri != null) {
                        ChannelResult.m8827boximpl(producerScope.mo8817trySendJP2dKIU(uri));
                    }
                }
            };
            weakReference = this.this$0.activityReference;
            Activity activity = (Activity) weakReference.get();
            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (ContentObserver) r3);
            }
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new AnonymousClass1(this.this$0, r3), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenshotDetectionDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.utils.ScreenshotDetectionDelegate$createContentObserverFlow$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ScreenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1 $contentObserver;
        final /* synthetic */ ScreenshotDetectionDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScreenshotDetectionDelegate screenshotDetectionDelegate, ScreenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1 screenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1) {
            super(0);
            this.this$0 = screenshotDetectionDelegate;
            this.$contentObserver = screenshotDetectionDelegate$createContentObserverFlow$1$contentObserver$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WeakReference weakReference;
            ContentResolver contentResolver;
            weakReference = this.this$0.activityReference;
            Activity activity = (Activity) weakReference.get();
            if (activity == null || (contentResolver = activity.getContentResolver()) == null) {
                return;
            }
            contentResolver.unregisterContentObserver(this.$contentObserver);
        }
    }
}
