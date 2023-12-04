package com.ifriend.data.repository.topics;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.data.topics.ChatPremiumTopicsRepository;
import com.ifriend.domain.logic.topics.models.ChatPremiumTopic;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ChatPremiumTopicsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0013J@\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0002\b\u0018H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0019J'\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001b2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/ifriend/data/repository/topics/ChatPremiumTopicsRepositoryImpl;", "Lcom/ifriend/domain/data/topics/ChatPremiumTopicsRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "remoteDataSource", "Lcom/ifriend/data/networking/datasources/topics/ChatTopicsRemoteDataSource;", "authDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/networking/datasources/topics/ChatTopicsRemoteDataSource;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "activateTopic", "Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "topicId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/topics/models/ChatPremiumTopic;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicsRepositoryImpl implements ChatPremiumTopicsRepository, CoreExecuteCatching {
    private final AuthLocalDataSource authDataSource;
    private final CoreExecuteCatching coreExecuteCatching;
    private final ChatTopicsRemoteDataSource remoteDataSource;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public ChatPremiumTopicsRepositoryImpl(CoreExecuteCatching coreExecuteCatching, ChatTopicsRemoteDataSource remoteDataSource, AuthLocalDataSource authDataSource) {
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(authDataSource, "authDataSource");
        this.coreExecuteCatching = coreExecuteCatching;
        this.remoteDataSource = remoteDataSource;
        this.authDataSource = authDataSource;
    }

    @Override // com.ifriend.domain.data.topics.ChatPremiumTopicsRepository
    public Object getTopicFlow(String str, Continuation<? super Flow<? extends List<ChatPremiumTopic>>> continuation) {
        return executeInBackground(new ChatPremiumTopicsRepositoryImpl$getTopicFlow$2(this, str, null), continuation);
    }

    @Override // com.ifriend.domain.data.topics.ChatPremiumTopicsRepository
    public Object activateTopic(String str, String str2, Continuation<? super PremiumTopicPopup> continuation) {
        return executeInBackground(new ChatPremiumTopicsRepositoryImpl$activateTopic$2(this, str, str2, null), continuation);
    }
}
