package com.ifriend.domain.data;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/data/UserRepository;", "", "clear", "", "getCurrentUser", "Lcom/ifriend/domain/models/profile/user/User;", "getUser", "Lkotlinx/coroutines/flow/Flow;", "isAuthorized", "", "setBirthday", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "(Lcom/ifriend/domain/models/profile/Birthday;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "(Lcom/ifriend/domain/models/profile/Gender;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserRepository {
    void clear();

    User getCurrentUser();

    Flow<User> getUser();

    boolean isAuthorized();

    Object setBirthday(Birthday birthday, Continuation<? super Unit> continuation);

    Object setGender(Gender gender, Continuation<? super Unit> continuation);

    Object setName(String str, Continuation<? super Unit> continuation);
}
