package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.chat.presentation.ui.chat.presentation.LevelUiModelKt;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$3", f = "BotProfileViewModel.kt", i = {}, l = {81, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotProfileViewModel$init$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$init$3(BotProfileViewModel botProfileViewModel, Continuation<? super BotProfileViewModel$init$3> continuation) {
        super(2, continuation);
        this.this$0 = botProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotProfileViewModel$init$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotProfileViewModel$init$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetLevelInfoUseCase getLevelInfoUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getLevelInfoUseCase = this.this$0.getLevelInfoUseCase;
            this.label = 1;
            obj = getLevelInfoUseCase.flow(this);
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
        if (FlowKt.collect(FlowKt.onEach((Flow) obj, new AnonymousClass1(this.this$0, null)), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BotProfileViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/common_utils/data/Resource;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "levelInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$3$1", f = "BotProfileViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Resource<LevelInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BotProfileViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BotProfileViewModel botProfileViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = botProfileViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Resource<LevelInfo> resource, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.changeState(new C01221((Resource) this.L$0));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BotProfileViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01221 extends Lambda implements Function1<BotProfileState, BotProfileState> {
            final /* synthetic */ Resource<LevelInfo> $levelInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01221(Resource<LevelInfo> resource) {
                super(1);
                this.$levelInfo = resource;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BotProfileState invoke(BotProfileState it) {
                BotProfileState copy;
                Intrinsics.checkNotNullParameter(it, "it");
                copy = it.copy((r18 & 1) != 0 ? it.name : null, (r18 & 2) != 0 ? it.age : null, (r18 & 4) != 0 ? it.gender : null, (r18 & 8) != 0 ? it.ethnicity : null, (r18 & 16) != 0 ? it.personality : null, (r18 & 32) != 0 ? it.avatarState : null, (r18 & 64) != 0 ? it.voice : null, (r18 & 128) != 0 ? it.levelInfo : LevelUiModelKt.toUiModel(this.$levelInfo));
                return copy;
            }
        }
    }
}
