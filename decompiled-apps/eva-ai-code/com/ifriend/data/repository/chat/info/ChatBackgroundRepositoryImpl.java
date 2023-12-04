package com.ifriend.data.repository.chat.info;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ChatBackgroundRepositoryImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0015J@\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001aH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/ifriend/data/repository/chat/info/ChatBackgroundRepositoryImpl;", "Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "fileProvider", "Lcom/ifriend/domain/data/files/FileProvider;", "configurationBotsSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/domain/data/files/FileProvider;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;)V", "preloadVideosCachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "", "getPreloadVideosCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "preloadVideosCachedSource$delegate", "Lkotlin/Lazy;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTriggerVideoUri", "chatId", "backgroundTrigger", "Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPreloadVideos", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPreloadVideosFlow", "Lkotlinx/coroutines/flow/Flow;", "preloadVideos", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackgroundRepositoryImpl implements ChatBackgroundRepository, CoreExecuteCatching {
    private final ChatConfigsMemoryCachedSource configurationBotsSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final FileProvider fileProvider;
    private final Lazy preloadVideosCachedSource$delegate;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatBackgroundRepositoryImpl(CoreExecuteCatching coreExecuteCatching, FileProvider fileProvider, ChatConfigsMemoryCachedSource configurationBotsSource) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(fileProvider, "fileProvider");
        Intrinsics.checkNotNullParameter(configurationBotsSource, "configurationBotsSource");
        this.coreExecuteCatching = coreExecuteCatching;
        this.fileProvider = fileProvider;
        this.configurationBotsSource = configurationBotsSource;
        this.preloadVideosCachedSource$delegate = LazyKt.lazy(ChatBackgroundRepositoryImpl$preloadVideosCachedSource$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, Boolean> getPreloadVideosCachedSource() {
        return (InMemoryCachedSource) this.preloadVideosCachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.chat.ChatBackgroundRepository
    public Object isPreloadVideosFlow(String str, Continuation<? super Flow<Boolean>> continuation) {
        final Flow<Boolean> subscribeByKey = getPreloadVideosCachedSource().subscribeByKey(str);
        return new Flow<Boolean>() { // from class: com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$isPreloadVideosFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$isPreloadVideosFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$isPreloadVideosFlow$$inlined$map$1$2", f = "ChatBackgroundRepositoryImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$isPreloadVideosFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean bool = (Boolean) obj;
                                Boolean boxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    @Override // com.ifriend.domain.data.chat.ChatBackgroundRepository
    public Object isPreloadVideos(String str, Continuation<? super Boolean> continuation) {
        return executeInBackground(new ChatBackgroundRepositoryImpl$isPreloadVideos$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.chat.ChatBackgroundRepository
    public Object preloadVideos(String str, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new ChatBackgroundRepositoryImpl$preloadVideos$2(this, str, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.chat.ChatBackgroundRepository
    public Object getTriggerVideoUri(String str, ChatBackgroundTrigger chatBackgroundTrigger, Continuation<? super String> continuation) {
        return executeInBackground(new ChatBackgroundRepositoryImpl$getTriggerVideoUri$2(this, chatBackgroundTrigger, str, null), continuation);
    }
}
