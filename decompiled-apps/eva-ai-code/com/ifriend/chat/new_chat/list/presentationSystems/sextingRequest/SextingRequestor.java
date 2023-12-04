package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SextingRequestor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestor;", "", "api", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestApi;", "authProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestApi;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/common_utils/Logger;)V", "requestSexting", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingRequestor {
    public static final int $stable = 8;
    private final SextingRequestApi api;
    private final AuthDataProvider authProvider;
    private final Logger logger;

    @Inject
    public SextingRequestor(SextingRequestApi api, AuthDataProvider authProvider, Logger logger) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.api = api;
        this.authProvider = authProvider;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:20:0x003f, B:29:0x0057, B:31:0x005b, B:33:0x005e), top: B:43:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #1 {Exception -> 0x0043, blocks: (B:20:0x003f, B:29:0x0057, B:31:0x005b, B:33:0x005e), top: B:43:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestSexting(Continuation<? super Unit> continuation) {
        SextingRequestor$requestSexting$1 sextingRequestor$requestSexting$1;
        int i;
        SextingRequestor sextingRequestor;
        SextingRequestor sextingRequestor2;
        AuthData authData;
        if (continuation instanceof SextingRequestor$requestSexting$1) {
            sextingRequestor$requestSexting$1 = (SextingRequestor$requestSexting$1) continuation;
            if ((sextingRequestor$requestSexting$1.label & Integer.MIN_VALUE) != 0) {
                sextingRequestor$requestSexting$1.label -= Integer.MIN_VALUE;
                Object obj = sextingRequestor$requestSexting$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sextingRequestor$requestSexting$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        AuthDataProvider authDataProvider = this.authProvider;
                        sextingRequestor$requestSexting$1.L$0 = this;
                        sextingRequestor$requestSexting$1.label = 1;
                        obj = authDataProvider.lastAuthData(sextingRequestor$requestSexting$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sextingRequestor2 = this;
                    } catch (Exception e) {
                        e = e;
                        sextingRequestor = this;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            sextingRequestor = (SextingRequestor) sextingRequestor$requestSexting$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Exception e2) {
                                e = e2;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sextingRequestor2 = (SextingRequestor) sextingRequestor$requestSexting$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        sextingRequestor = sextingRequestor2;
                    }
                    sextingRequestor.logger.logException(e);
                    return Unit.INSTANCE;
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return Unit.INSTANCE;
                }
                String value = authData.getUserId().getValue();
                String formatted = authData.getToken().formatted();
                SextingRequestApi sextingRequestApi = sextingRequestor2.api;
                sextingRequestor$requestSexting$1.L$0 = sextingRequestor2;
                sextingRequestor$requestSexting$1.label = 2;
                if (sextingRequestApi.sendRequest(formatted, value, sextingRequestor$requestSexting$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        sextingRequestor$requestSexting$1 = new SextingRequestor$requestSexting$1(this, continuation);
        Object obj2 = sextingRequestor$requestSexting$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sextingRequestor$requestSexting$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }
}
