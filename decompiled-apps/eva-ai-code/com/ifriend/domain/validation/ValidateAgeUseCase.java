package com.ifriend.domain.validation;

import com.ifriend.domain.useCases.AppConfigUseCase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ValidateAgeUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/validation/ValidateAgeUseCase;", "", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "(Lcom/ifriend/domain/useCases/AppConfigUseCase;)V", "invoke", "", "age", "", "isBot", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidateAgeUseCase {
    private final AppConfigUseCase appConfigUseCase;

    public ValidateAgeUseCase(AppConfigUseCase appConfigUseCase) {
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        this.appConfigUseCase = appConfigUseCase;
    }

    public final Object invoke(String str, boolean z, Continuation<? super Boolean> continuation) {
        return ValidationKt.isValidAge(str, this.appConfigUseCase, z, continuation);
    }
}
