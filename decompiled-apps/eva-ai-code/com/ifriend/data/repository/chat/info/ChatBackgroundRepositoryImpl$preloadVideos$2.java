package com.ifriend.data.repository.chat.info;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
/* compiled from: ChatBackgroundRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$preloadVideos$2", f = "ChatBackgroundRepositoryImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundRepositoryImpl$preloadVideos$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatBackgroundRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundRepositoryImpl$preloadVideos$2(ChatBackgroundRepositoryImpl chatBackgroundRepositoryImpl, String str, Continuation<? super ChatBackgroundRepositoryImpl$preloadVideos$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepositoryImpl$preloadVideos$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBackgroundRepositoryImpl$preloadVideos$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBackgroundRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$preloadVideos$2$1", f = "ChatBackgroundRepositoryImpl.kt", i = {1, 2}, l = {39, 45, 48, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {"animations", "animations"}, s = {"L$0", "L$0"})
    /* renamed from: com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$preloadVideos$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        Object L$0;
        int label;
        final /* synthetic */ ChatBackgroundRepositoryImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatBackgroundRepositoryImpl chatBackgroundRepositoryImpl, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatBackgroundRepositoryImpl;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
            Object obj2;
            ChatConfig.Animations animations;
            FileProvider fileProvider;
            FileProvider fileProvider2;
            FileProvider fileProvider3;
            InMemoryCachedSource preloadVideosCachedSource;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                chatConfigsMemoryCachedSource = this.this$0.configurationBotsSource;
                this.label = 1;
                obj = chatConfigsMemoryCachedSource.getChatConfigs(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    animations = (ChatConfig.Animations) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!StringsKt.isBlank(animations.getIdleSextingUrl())) {
                        fileProvider2 = this.this$0.fileProvider;
                        this.L$0 = animations;
                        this.label = 3;
                        if (fileProvider2.getFile(animations.getIdleSextingUrl(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (!StringsKt.isBlank(animations.getIdleStartUrl())) {
                    }
                    preloadVideosCachedSource = this.this$0.getPreloadVideosCachedSource();
                    this.L$0 = null;
                    this.label = 5;
                    if (preloadVideosCachedSource.replace(this.$chatId, Boxing.boxBoolean(true), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                } else if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    preloadVideosCachedSource = this.this$0.getPreloadVideosCachedSource();
                    this.L$0 = null;
                    this.label = 5;
                    if (preloadVideosCachedSource.replace(this.$chatId, Boxing.boxBoolean(true), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    animations = (ChatConfig.Animations) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!StringsKt.isBlank(animations.getIdleStartUrl())) {
                        fileProvider3 = this.this$0.fileProvider;
                        this.L$0 = null;
                        this.label = 4;
                        if (fileProvider3.getFile(animations.getIdleStartUrl(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    preloadVideosCachedSource = this.this$0.getPreloadVideosCachedSource();
                    this.L$0 = null;
                    this.label = 5;
                    if (preloadVideosCachedSource.replace(this.$chatId, Boxing.boxBoolean(true), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str = this.$chatId;
            Iterator it = ((Iterable) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual(((ChatConfig) obj2).getChatId(), str)) {
                    break;
                }
            }
            ChatConfig chatConfig = (ChatConfig) obj2;
            if (chatConfig != null) {
                animations = chatConfig.getAnimations();
                if (!StringsKt.isBlank(animations.getIdleUrl())) {
                    fileProvider = this.this$0.fileProvider;
                    this.L$0 = animations;
                    this.label = 2;
                    if (fileProvider.getFile(animations.getIdleUrl(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!StringsKt.isBlank(animations.getIdleSextingUrl())) {
                }
                if (!StringsKt.isBlank(animations.getIdleStartUrl())) {
                }
            }
            preloadVideosCachedSource = this.this$0.getPreloadVideosCachedSource();
            this.L$0 = null;
            this.label = 5;
            if (preloadVideosCachedSource.replace(this.$chatId, Boxing.boxBoolean(true), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(NonCancellable.INSTANCE, new AnonymousClass1(this.this$0, this.$chatId, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
