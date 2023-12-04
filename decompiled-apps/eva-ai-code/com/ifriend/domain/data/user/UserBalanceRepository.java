package com.ifriend.domain.data.user;

import com.ifriend.domain.logic.balance.UserBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserBalanceRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u0011\u0010\t\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/data/user/UserBalanceRepository;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBalance", "Lcom/ifriend/domain/logic/balance/UserBalance;", "getBalanceFlow", "Lkotlinx/coroutines/flow/Flow;", "updateBalance", "updateNeurones", "neurons", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserBalanceRepository {
    Object clear(Continuation<? super Unit> continuation);

    Object getBalance(Continuation<? super UserBalance> continuation);

    Flow<UserBalance> getBalanceFlow();

    Object updateBalance(Continuation<? super Unit> continuation);

    Object updateNeurones(int i, Continuation<? super Unit> continuation);
}
