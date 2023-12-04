package com.ifriend.data.authorization.validation;

import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.data.networking.responses.EmailValidationResponse;
import com.ifriend.domain.validation.EmailValidator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.codec.binary.Base64;
import retrofit2.Response;
/* compiled from: RemoteEmailValidator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/authorization/validation/RemoteEmailValidator;", "Lcom/ifriend/domain/validation/EmailValidator;", "validationApi", "Lcom/ifriend/data/networking/api/ValidationApi;", "(Lcom/ifriend/data/networking/api/ValidationApi;)V", "isValid", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoteEmailValidator implements EmailValidator {
    private final ValidationApi validationApi;

    public RemoteEmailValidator(ValidationApi validationApi) {
        Intrinsics.checkNotNullParameter(validationApi, "validationApi");
        this.validationApi = validationApi;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(3:13|(1:15)|18)|19|20))|29|6|7|(0)(0)|11|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r5.getValid() == true) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: SocketTimeoutException | Exception -> 0x0081, TryCatch #0 {SocketTimeoutException | Exception -> 0x0081, blocks: (B:11:0x0026, B:19:0x0066, B:21:0x0070, B:23:0x0079, B:16:0x005b), top: B:30:0x0022 }] */
    @Override // com.ifriend.domain.validation.EmailValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isValid(String str, Continuation<? super Boolean> continuation) {
        RemoteEmailValidator$isValid$1 remoteEmailValidator$isValid$1;
        int i;
        Response response;
        if (continuation instanceof RemoteEmailValidator$isValid$1) {
            remoteEmailValidator$isValid$1 = (RemoteEmailValidator$isValid$1) continuation;
            if ((remoteEmailValidator$isValid$1.label & Integer.MIN_VALUE) != 0) {
                remoteEmailValidator$isValid$1.label -= Integer.MIN_VALUE;
                Object obj = remoteEmailValidator$isValid$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = remoteEmailValidator$isValid$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    byte[] bytes = lowerCase.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] encodeBase64 = Base64.encodeBase64(bytes);
                    Intrinsics.checkNotNullExpressionValue(encodeBase64, "encodeBase64(...)");
                    String str2 = new String(encodeBase64, Charsets.UTF_8);
                    ValidationApi validationApi = this.validationApi;
                    remoteEmailValidator$isValid$1.label = 1;
                    obj = validationApi.validateEmail(str2, remoteEmailValidator$isValid$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.code() == 200) {
                    EmailValidationResponse emailValidationResponse = (EmailValidationResponse) response.body();
                    if (emailValidationResponse != null) {
                    }
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        }
        remoteEmailValidator$isValid$1 = new RemoteEmailValidator$isValid$1(this, continuation);
        Object obj2 = remoteEmailValidator$isValid$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = remoteEmailValidator$isValid$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.code() == 200) {
        }
        return Boxing.boxBoolean(z2);
    }
}
