package com.ifriend.domain.storage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: NeuronsCostsStorage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/storage/NeuronsCostsStorage;", "", "getNeuronsCosts", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/domain/storage/NeuronsCosts;", "updateCosts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NeuronsCostsStorage {
    StateFlow<NeuronsCosts> getNeuronsCosts();

    Object updateCosts(Continuation<? super Unit> continuation);
}
