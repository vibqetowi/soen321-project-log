package com.ifriend.chat.domain.avatarGeneration;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OpenGenerateBotAvatarUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/domain/avatarGeneration/OpenGenerateBotAvatarUseCase;", "", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;Lcom/ifriend/common_utils/Logger;)V", "invoke", "", "onBeforeNavigation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToChooseAvatar", "navigateToGenerateBotAvatar", "navigateToGeneratingBotAvatarPlaceholder", "navigateToGenerationError", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OpenGenerateBotAvatarUseCase {
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final Logger logger;
    private final RouterProvider router;

    /* compiled from: OpenGenerateBotAvatarUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarGenerationStatus.values().length];
            try {
                iArr[AvatarGenerationStatus.NO_GENERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarGenerationStatus.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarGenerationStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarGenerationStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OpenGenerateBotAvatarUseCase(GenerateBotAvatarRepository generateBotAvatarRepository, RouterProvider router, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, Logger logger) {
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.router = router;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(OpenGenerateBotAvatarUseCase openGenerateBotAvatarUseCase, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return openGenerateBotAvatarUseCase.invoke(function0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Function0<Unit> function0, Continuation<? super Unit> continuation) {
        OpenGenerateBotAvatarUseCase$invoke$1 openGenerateBotAvatarUseCase$invoke$1;
        int i;
        OpenGenerateBotAvatarUseCase openGenerateBotAvatarUseCase;
        int i2;
        if (continuation instanceof OpenGenerateBotAvatarUseCase$invoke$1) {
            openGenerateBotAvatarUseCase$invoke$1 = (OpenGenerateBotAvatarUseCase$invoke$1) continuation;
            if ((openGenerateBotAvatarUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                openGenerateBotAvatarUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = openGenerateBotAvatarUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = openGenerateBotAvatarUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GenerateBotAvatarRepository generateBotAvatarRepository = this.generateBotAvatarRepository;
                    openGenerateBotAvatarUseCase$invoke$1.L$0 = this;
                    openGenerateBotAvatarUseCase$invoke$1.L$1 = function0;
                    openGenerateBotAvatarUseCase$invoke$1.label = 1;
                    obj = generateBotAvatarRepository.getGenerationStatus(openGenerateBotAvatarUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    openGenerateBotAvatarUseCase = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    function0 = (Function0) openGenerateBotAvatarUseCase$invoke$1.L$1;
                    openGenerateBotAvatarUseCase = (OpenGenerateBotAvatarUseCase) openGenerateBotAvatarUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AvatarGenerationStatus avatarGenerationStatus = (AvatarGenerationStatus) obj;
                openGenerateBotAvatarUseCase.logger.log(avatarGenerationStatus.name());
                if (function0 != null) {
                    function0.invoke();
                }
                i2 = WhenMappings.$EnumSwitchMapping$0[avatarGenerationStatus.ordinal()];
                if (i2 != 1) {
                    openGenerateBotAvatarUseCase.navigateToGenerateBotAvatar();
                } else if (i2 == 2) {
                    openGenerateBotAvatarUseCase.navigateToGeneratingBotAvatarPlaceholder();
                } else if (i2 == 3) {
                    openGenerateBotAvatarUseCase.navigateToChooseAvatar();
                } else if (i2 == 4) {
                    openGenerateBotAvatarUseCase.navigateToGenerationError();
                }
                return Unit.INSTANCE;
            }
        }
        openGenerateBotAvatarUseCase$invoke$1 = new OpenGenerateBotAvatarUseCase$invoke$1(this, continuation);
        Object obj2 = openGenerateBotAvatarUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openGenerateBotAvatarUseCase$invoke$1.label;
        if (i != 0) {
        }
        AvatarGenerationStatus avatarGenerationStatus2 = (AvatarGenerationStatus) obj2;
        openGenerateBotAvatarUseCase.logger.log(avatarGenerationStatus2.name());
        if (function0 != null) {
        }
        i2 = WhenMappings.$EnumSwitchMapping$0[avatarGenerationStatus2.ordinal()];
        if (i2 != 1) {
        }
        return Unit.INSTANCE;
    }

    private final void navigateToGenerateBotAvatar() {
        this.router.getRoute().navigateTo(GenerateBotAvatarScreenFactory.DefaultImpls.getGenerateBotAvatarScreen$default(this.generateBotAvatarScreenFactory, null, 1, null));
    }

    private final void navigateToGeneratingBotAvatarPlaceholder() {
        this.router.getRoute().navigateTo(this.generateBotAvatarScreenFactory.getGeneratingBotAvatarPlaceholderScreen());
    }

    private final void navigateToChooseAvatar() {
        this.router.getRoute().navigateTo(this.generateBotAvatarScreenFactory.getSelectGeneratedAvatarScreen());
    }

    private final void navigateToGenerationError() {
        this.router.getRoute().navigateTo(this.generateBotAvatarScreenFactory.getGenerateBotAvatarErrorScreen());
    }
}
