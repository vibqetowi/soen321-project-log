package com.ifriend.domain.data.authorization.confirmEmail;

import com.ifriend.domain.models.ConfirmEmailData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConfirmEmailRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "", "confirm", "", "confirmEmailData", "Lcom/ifriend/domain/models/ConfirmEmailData;", "(Lcom/ifriend/domain/models/ConfirmEmailData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ConfirmEmailRepository {
    Object confirm(ConfirmEmailData confirmEmailData, Continuation<? super Unit> continuation);

    Object sendEmail(String str, Continuation<? super Unit> continuation);
}
