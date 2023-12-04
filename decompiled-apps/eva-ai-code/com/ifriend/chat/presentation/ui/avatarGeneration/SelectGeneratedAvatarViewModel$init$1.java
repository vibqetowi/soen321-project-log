package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.storage.NeuronsCosts;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$init$1", f = "SelectGeneratedAvatarViewModel.kt", i = {}, l = {59, 64, 64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $imageSize;
    int label;
    final /* synthetic */ SelectGeneratedAvatarViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarViewModel$init$1(SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel, int i, Continuation<? super SelectGeneratedAvatarViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = selectGeneratedAvatarViewModel;
        this.$imageSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectGeneratedAvatarViewModel$init$1(this.this$0, this.$imageSize, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectGeneratedAvatarViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GenerateBotAvatarRepository generateBotAvatarRepository;
        NeuronsCostsStorage neuronsCostsStorage;
        GenerateBotAvatarRepository generateBotAvatarRepository2;
        final SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 1;
            obj = generateBotAvatarRepository.getLastGenerationDescription(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            selectGeneratedAvatarViewModel = this.this$0;
            this.label = 3;
            if (((Flow) obj).collect(new FlowCollector<List<? extends GeneratedAvatar>>() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$init$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(List<? extends GeneratedAvatar> list, Continuation continuation) {
                    return emit2((List<GeneratedAvatar>) list, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(List<GeneratedAvatar> list, Continuation<? super Unit> continuation) {
                    SelectGeneratedAvatarViewModel.this.changeState(new SelectGeneratedAvatarViewModel$init$1$2$emit$2(list));
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        neuronsCostsStorage = this.this$0.neuronsCostsStorage;
        NeuronsCosts value = neuronsCostsStorage.getNeuronsCosts().getValue();
        this.this$0.changeState(new AnonymousClass1(str, value != null ? Boxing.boxInt(value.getAvatarCost()) : null));
        generateBotAvatarRepository2 = this.this$0.generateBotAvatarRepository;
        this.label = 2;
        obj = generateBotAvatarRepository2.getGeneratedAvatars(this.$imageSize, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        selectGeneratedAvatarViewModel = this.this$0;
        this.label = 3;
        if (((Flow) obj).collect(new FlowCollector<List<? extends GeneratedAvatar>>() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$init$1.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(List<? extends GeneratedAvatar> list, Continuation continuation) {
                return emit2((List<GeneratedAvatar>) list, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(List<GeneratedAvatar> list, Continuation<? super Unit> continuation) {
                SelectGeneratedAvatarViewModel.this.changeState(new SelectGeneratedAvatarViewModel$init$1$2$emit$2(list));
                return Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectGeneratedAvatarViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
        final /* synthetic */ String $description;
        final /* synthetic */ Integer $tryAgainPrice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Integer num) {
            super(1);
            this.$description = str;
            this.$tryAgainPrice = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SelectGeneratedAvatarState.copy$default(it, null, this.$description, this.$tryAgainPrice, false, 9, null);
        }
    }
}
