package com.ifriend.domain.data;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AudioMessageRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/AudioMessageRepository;", "", "isAudioMessageTextShowed", "Lkotlinx/coroutines/flow/StateFlow;", "", "id", "", "isAudioPopUpShowed", "setAudioMessageTextShowed", "", "setAudioPopUpShowed", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioMessageRepository {
    StateFlow<Boolean> isAudioMessageTextShowed(String str);

    boolean isAudioPopUpShowed();

    void setAudioMessageTextShowed(String str);

    void setAudioPopUpShowed();
}
