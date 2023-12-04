package com.ifriend.domain.storage;

import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarAnimationEnabledStorage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/storage/AvatarAnimationEnabledStorage;", "", "isEnabledFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "setEnabled", "", Constants.ENABLE_DISABLE, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AvatarAnimationEnabledStorage {
    StateFlow<Boolean> isEnabledFlow();

    void setEnabled(boolean z);
}
