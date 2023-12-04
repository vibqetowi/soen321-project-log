package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$2", f = "BotProfileViewModel.kt", i = {}, l = {TsExtractor.TS_SYNC_BYTE, 72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotProfileViewModel$init$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$init$2(BotProfileViewModel botProfileViewModel, Continuation<? super BotProfileViewModel$init$2> continuation) {
        super(2, continuation);
        this.this$0 = botProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotProfileViewModel$init$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotProfileViewModel$init$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeatureToggleRepository featureToggleRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            featureToggleRepository = this.this$0.featureToggleRepository;
            this.label = 1;
            obj = featureToggleRepository.isFeatureEnabledFlow(FeatureToggleKey.GENERATE_AI_PHOTOS, this);
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
        final BotProfileViewModel botProfileViewModel = this.this$0;
        this.label = 2;
        if (((Flow) obj).collect(new FlowCollector<Boolean>() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$init$2.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return emit(bool.booleanValue(), continuation);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                if (z) {
                    BotProfileViewModel.this.loadAndPostAvatar();
                } else {
                    BotProfileViewModel.this.disableAvatarFeature();
                }
                return Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
