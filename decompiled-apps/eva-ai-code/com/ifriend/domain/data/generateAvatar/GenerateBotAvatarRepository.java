package com.ifriend.domain.data.generateAvatar;

import com.ifriend.domain.models.avatar.GeneratedAvatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GenerateBotAvatarRepository.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H&J\u001b\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u001b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "", "applyAvatar", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "createAvatar", "description", "getCurrentAvatar", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "shouldLoad", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratedAvatars", "Lkotlinx/coroutines/flow/Flow;", "", "imageSize", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenerationStatus", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastGenerationDescription", "onErrorWatched", "reloadAvatars", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GenerateBotAvatarRepository {
    Object applyAvatar(String str, Continuation<? super Unit> continuation);

    void clear();

    Object createAvatar(String str, Continuation<? super Unit> continuation);

    Object getCurrentAvatar(boolean z, Continuation<? super StateFlow<GeneratedAvatar>> continuation);

    Object getGeneratedAvatars(int i, Continuation<? super Flow<? extends List<GeneratedAvatar>>> continuation);

    Object getGenerationStatus(Continuation<? super AvatarGenerationStatus> continuation);

    Object getLastGenerationDescription(Continuation<? super String> continuation);

    Object onErrorWatched(Continuation<? super Unit> continuation);

    Object reloadAvatars(Continuation<? super Unit> continuation);

    /* compiled from: GenerateBotAvatarRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object createAvatar$default(GenerateBotAvatarRepository generateBotAvatarRepository, String str, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return generateBotAvatarRepository.createAvatar(str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAvatar");
        }

        public static /* synthetic */ Object getCurrentAvatar$default(GenerateBotAvatarRepository generateBotAvatarRepository, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return generateBotAvatarRepository.getCurrentAvatar(z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentAvatar");
        }
    }
}
