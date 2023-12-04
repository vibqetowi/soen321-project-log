package com.ifriend.domain.useCases.socket;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ListenTagsUseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/useCases/socket/ListenTagsUseCase;", "", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "tagsStorage", "Lcom/ifriend/domain/data/TagsStorage;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/domain/data/TagsStorage;Lcom/ifriend/domain/data/AuthDataProvider;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTagAdded", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/socket/MessagesSourceMessage$TagAdded;", "onTagRemoved", "Lcom/ifriend/domain/socket/MessagesSourceMessage$TagRemoved;", "getTagIfUserValid", "Lcom/ifriend/domain/models/Tag;", "Lcom/ifriend/domain/models/TagOfUser;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListenTagsUseCase {
    private final AuthDataProvider authDataProvider;
    private final MessagesSource messagesSource;
    private final TagsStorage tagsStorage;

    public ListenTagsUseCase(MessagesSource messagesSource, TagsStorage tagsStorage, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(tagsStorage, "tagsStorage");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.messagesSource = messagesSource;
        this.tagsStorage = tagsStorage;
        this.authDataProvider = authDataProvider;
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        Object collect = FlowKt.collect(FlowKt.onEach(this.messagesSource.getAllMessages(false), new ListenTagsUseCase$invoke$2(this, null)), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTagAdded(MessagesSourceMessage.TagAdded tagAdded) {
        Tag tagIfUserValid;
        TagOfUser tagOfUser = tagAdded.getTagOfUser();
        if (tagOfUser == null || (tagIfUserValid = getTagIfUserValid(tagOfUser)) == null) {
            return;
        }
        this.tagsStorage.addTag(tagIfUserValid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTagRemoved(MessagesSourceMessage.TagRemoved tagRemoved) {
        Tag tagIfUserValid;
        TagOfUser tagOfUser = tagRemoved.getTagOfUser();
        if (tagOfUser == null || (tagIfUserValid = getTagIfUserValid(tagOfUser)) == null) {
            return;
        }
        this.tagsStorage.removeTag(tagIfUserValid);
    }

    private final Tag getTagIfUserValid(TagOfUser tagOfUser) {
        AuthData value = this.authDataProvider.sessionAuthData().getValue();
        if (!Intrinsics.areEqual(value != null ? value.getUserId() : null, tagOfUser.getUserId())) {
            tagOfUser = null;
        }
        if (tagOfUser != null) {
            return tagOfUser.getTag();
        }
        return null;
    }
}
