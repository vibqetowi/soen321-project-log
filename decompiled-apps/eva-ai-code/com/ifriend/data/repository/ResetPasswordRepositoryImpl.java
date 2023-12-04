package com.ifriend.data.repository;

import com.ifriend.data.networking.api.ResetPasswordApi;
import com.ifriend.data.networking.requests.ResetPasswordRequest;
import com.ifriend.domain.data.ResetPasswordRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
/* compiled from: ResetPasswordRepositoryImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/repository/ResetPasswordRepositoryImpl;", "Lcom/ifriend/domain/data/ResetPasswordRepository;", "resetPasswordApi", "Lcom/ifriend/data/networking/api/ResetPasswordApi;", "(Lcom/ifriend/data/networking/api/ResetPasswordApi;)V", "resetPassword", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetPasswordRepositoryImpl implements ResetPasswordRepository {
    private final ResetPasswordApi resetPasswordApi;

    public ResetPasswordRepositoryImpl(ResetPasswordApi resetPasswordApi) {
        Intrinsics.checkNotNullParameter(resetPasswordApi, "resetPasswordApi");
        this.resetPasswordApi = resetPasswordApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ifriend.domain.data.ResetPasswordRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetPassword(String str, Continuation<? super Boolean> continuation) {
        ResetPasswordRepositoryImpl$resetPassword$1 resetPasswordRepositoryImpl$resetPassword$1;
        int i;
        if (continuation instanceof ResetPasswordRepositoryImpl$resetPassword$1) {
            resetPasswordRepositoryImpl$resetPassword$1 = (ResetPasswordRepositoryImpl$resetPassword$1) continuation;
            if ((resetPasswordRepositoryImpl$resetPassword$1.label & Integer.MIN_VALUE) != 0) {
                resetPasswordRepositoryImpl$resetPassword$1.label -= Integer.MIN_VALUE;
                Object obj = resetPasswordRepositoryImpl$resetPassword$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetPasswordRepositoryImpl$resetPassword$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ResetPasswordApi resetPasswordApi = this.resetPasswordApi;
                    ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest("password", str);
                    resetPasswordRepositoryImpl$resetPassword$1.label = 1;
                    obj = resetPasswordApi.resetPassword(resetPasswordRequest, resetPasswordRepositoryImpl$resetPassword$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        resetPasswordRepositoryImpl$resetPassword$1 = new ResetPasswordRepositoryImpl$resetPassword$1(this, continuation);
        Object obj2 = resetPasswordRepositoryImpl$resetPassword$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetPasswordRepositoryImpl$resetPassword$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Response) obj2).isSuccessful());
    }
}
