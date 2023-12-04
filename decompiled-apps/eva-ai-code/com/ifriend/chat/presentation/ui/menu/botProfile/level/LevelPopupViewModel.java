package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: LevelPopupViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "avatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelPopupViewModel extends BaseViewModel<LevelPopupState> {
    public static final int $stable = 8;
    private final AvatarsStorage avatarsStorage;
    private final GetBotUseCase getBotUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public LevelPopupViewModel(CoroutineDispatchers dispatchers, AvatarsStorage avatarsStorage, GetBotUseCase getBotUseCase) {
        super(dispatchers, new LevelPopupState("", null, 2, null));
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(avatarsStorage, "avatarsStorage");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        this.avatarsStorage = avatarsStorage;
        this.getBotUseCase = getBotUseCase;
        LevelPopupViewModel levelPopupViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(levelPopupViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(levelPopupViewModel), null, null, new AnonymousClass2(dispatchers, this, null), 3, null);
    }

    /* compiled from: LevelPopupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$1", f = "LevelPopupViewModel.kt", i = {}, l = {26, 32}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = LevelPopupViewModel.this.getBotUseCase.flow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (FlowKt.collect(FlowKt.onEach((Flow) obj, new C01241(LevelPopupViewModel.this, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LevelPopupViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$1$1", f = "LevelPopupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01241 extends SuspendLambda implements Function2<Bot, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LevelPopupViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01241(LevelPopupViewModel levelPopupViewModel, Continuation<? super C01241> continuation) {
                super(2, continuation);
                this.this$0 = levelPopupViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01241 c01241 = new C01241(this.this$0, continuation);
                c01241.L$0 = obj;
                return c01241;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Bot bot, Continuation<? super Unit> continuation) {
                return ((C01241) create(bot, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.changeState(new C01251((Bot) this.L$0));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LevelPopupViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01251 extends Lambda implements Function1<LevelPopupState, LevelPopupState> {
                final /* synthetic */ Bot $bot;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01251(Bot bot) {
                    super(1);
                    this.$bot = bot;
                }

                @Override // kotlin.jvm.functions.Function1
                public final LevelPopupState invoke(LevelPopupState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Bot bot = this.$bot;
                    String name = bot != null ? bot.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    return LevelPopupState.copy$default(it, name, null, 2, null);
                }
            }
        }
    }

    /* compiled from: LevelPopupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$2", f = "LevelPopupViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineDispatchers $dispatchers;
        int label;
        final /* synthetic */ LevelPopupViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CoroutineDispatchers coroutineDispatchers, LevelPopupViewModel levelPopupViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dispatchers = coroutineDispatchers;
            this.this$0 = levelPopupViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$dispatchers, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BuildersKt.withContext(this.$dispatchers.getIO(), new LevelPopupViewModel$2$avatar$1(this.this$0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.changeState(new AnonymousClass1((byte[]) obj));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LevelPopupViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<LevelPopupState, LevelPopupState> {
            final /* synthetic */ byte[] $avatar;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(byte[] bArr) {
                super(1);
                this.$avatar = bArr;
            }

            @Override // kotlin.jvm.functions.Function1
            public final LevelPopupState invoke(LevelPopupState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                byte[] bArr = this.$avatar;
                if (bArr != null) {
                    return LevelPopupState.copy$default(it, null, bArr, 1, null);
                }
                return LevelPopupState.copy$default(it, null, null, 1, null);
            }
        }
    }
}
