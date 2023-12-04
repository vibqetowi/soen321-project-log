package com.ifriend.data.storages.tags;

import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.socket.notifications.EmailConfirmedNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import retrofit2.Response;
/* compiled from: TagsStorageImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00180\u001cH\u0002J\u001b\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u001e\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ'\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0016\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00180)H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/ifriend/data/storages/tags/TagsStorageImpl;", "Lcom/ifriend/domain/data/TagsStorage;", "api", "Lcom/ifriend/data/networking/api/TagsApi;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "logger", "Lcom/ifriend/common_utils/Logger;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "tagsLocalDataSource", "Lcom/ifriend/data/storages/tags/TagsLocalDataSource;", "(Lcom/ifriend/data/networking/api/TagsApi;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/CoroutineDispatchers;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/data/storages/tags/TagsLocalDataSource;)V", "lastAuthData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "addTag", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/models/Tag;", "current", "", "handleSuccessRequest", "", "response", "Lretrofit2/Response;", "loadAndEmit", "auth", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTag", "requestAllTags", "requestExperimentalTags", "userId", "token", "Lcom/ifriend/domain/models/profile/user/UserToken;", "(Ljava/lang/String;Lcom/ifriend/domain/models/profile/user/UserToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestUserTags", "tagsFlow", "Lkotlinx/coroutines/flow/Flow;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsStorageImpl implements TagsStorage {
    private final TagsApi api;
    private final AuthDataProvider authDataProvider;
    private final InternalNotificationHandler internalNotificationHandler;
    private AuthData lastAuthData;
    private final Logger logger;
    private final TagsLocalDataSource tagsLocalDataSource;

    public TagsStorageImpl(TagsApi api, AuthDataProvider authDataProvider, InternalNotificationHandler internalNotificationHandler, Logger logger, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, TagsLocalDataSource tagsLocalDataSource) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(tagsLocalDataSource, "tagsLocalDataSource");
        this.api = api;
        this.authDataProvider = authDataProvider;
        this.internalNotificationHandler = internalNotificationHandler;
        this.logger = logger;
        this.tagsLocalDataSource = tagsLocalDataSource;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* compiled from: TagsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.storages.tags.TagsStorageImpl$1", f = "TagsStorageImpl.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.storages.tags.TagsStorageImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (TagsStorageImpl.this.authDataProvider.sessionAuthData().collect(new C01421(TagsStorageImpl.this), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TagsStorageImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.storages.tags.TagsStorageImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C01421 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ TagsStorageImpl $tmp0;

            C01421(TagsStorageImpl tagsStorageImpl) {
                this.$tmp0 = tagsStorageImpl;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, TagsStorageImpl.class, "loadAndEmit", "loadAndEmit(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AuthData authData, Continuation<? super Unit> continuation) {
                Object loadAndEmit = this.$tmp0.loadAndEmit(authData, continuation);
                return loadAndEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAndEmit : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AuthData) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[LOOP:0: B:32:0x0086->B:34:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAndEmit(AuthData authData, Continuation<? super Unit> continuation) {
        TagsStorageImpl$loadAndEmit$1 tagsStorageImpl$loadAndEmit$1;
        int i;
        TagsStorageImpl tagsStorageImpl;
        List<Tag> list;
        TagsLocalDataSource tagsLocalDataSource;
        if (continuation instanceof TagsStorageImpl$loadAndEmit$1) {
            tagsStorageImpl$loadAndEmit$1 = (TagsStorageImpl$loadAndEmit$1) continuation;
            if ((tagsStorageImpl$loadAndEmit$1.label & Integer.MIN_VALUE) != 0) {
                tagsStorageImpl$loadAndEmit$1.label -= Integer.MIN_VALUE;
                Object obj = tagsStorageImpl$loadAndEmit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tagsStorageImpl$loadAndEmit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (authData == null || authData.getToken().isNotValid()) {
                        TagsLocalDataSource tagsLocalDataSource2 = this.tagsLocalDataSource;
                        tagsStorageImpl$loadAndEmit$1.label = 1;
                        if (tagsLocalDataSource2.update(null, tagsStorageImpl$loadAndEmit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } else if (authData.isEqualWithoutEmail(this.lastAuthData)) {
                        return Unit.INSTANCE;
                    } else {
                        tagsStorageImpl$loadAndEmit$1.L$0 = this;
                        tagsStorageImpl$loadAndEmit$1.label = 2;
                        obj = requestAllTags(authData, tagsStorageImpl$loadAndEmit$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tagsStorageImpl = this;
                        list = (List) obj;
                        Logger logger = tagsStorageImpl.logger;
                        List<Tag> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        while (r5.hasNext()) {
                        }
                        logger.log("User tags: " + arrayList);
                        tagsLocalDataSource = tagsStorageImpl.tagsLocalDataSource;
                        tagsStorageImpl$loadAndEmit$1.L$0 = null;
                        tagsStorageImpl$loadAndEmit$1.label = 3;
                        if (tagsLocalDataSource.update(list, tagsStorageImpl$loadAndEmit$1) == coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } else if (i == 2) {
                    tagsStorageImpl = (TagsStorageImpl) tagsStorageImpl$loadAndEmit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = (List) obj;
                    Logger logger2 = tagsStorageImpl.logger;
                    List<Tag> list22 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                    for (Tag tag : list22) {
                        arrayList2.add(tag.getValue());
                    }
                    logger2.log("User tags: " + arrayList2);
                    tagsLocalDataSource = tagsStorageImpl.tagsLocalDataSource;
                    tagsStorageImpl$loadAndEmit$1.L$0 = null;
                    tagsStorageImpl$loadAndEmit$1.label = 3;
                    if (tagsLocalDataSource.update(list, tagsStorageImpl$loadAndEmit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        tagsStorageImpl$loadAndEmit$1 = new TagsStorageImpl$loadAndEmit$1(this, continuation);
        Object obj2 = tagsStorageImpl$loadAndEmit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tagsStorageImpl$loadAndEmit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.TagsStorage
    public void addTag(Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(tag, new Tag("email.confirmed"))) {
            this.internalNotificationHandler.handle(EmailConfirmedNotification.INSTANCE);
        }
        List<Tag> current = current();
        if (current != null) {
            if (!(!current.contains(tag))) {
                current = null;
            }
            if (current != null) {
                this.tagsLocalDataSource.tryUpdate(CollectionsKt.plus((Collection<? extends Tag>) current, tag));
            }
        }
    }

    @Override // com.ifriend.domain.data.TagsStorage
    public void removeTag(Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Tag> current = current();
        if (current != null) {
            if (!current.contains(tag)) {
                current = null;
            }
            if (current != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : current) {
                    if (!Intrinsics.areEqual(((Tag) obj).getValue(), tag.getValue())) {
                        arrayList.add(obj);
                    }
                }
                this.tagsLocalDataSource.tryUpdate(arrayList);
            }
        }
    }

    @Override // com.ifriend.domain.data.TagsProvider
    public Flow<List<Tag>> tagsFlow() {
        return this.tagsLocalDataSource.getTagsFlow();
    }

    @Override // com.ifriend.domain.data.TagsProvider
    public List<Tag> current() {
        return this.tagsLocalDataSource.getTags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[LOOP:0: B:25:0x009a->B:27:0x00a0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestAllTags(AuthData authData, Continuation<? super List<Tag>> continuation) {
        TagsStorageImpl$requestAllTags$1 tagsStorageImpl$requestAllTags$1;
        Object coroutine_suspended;
        int i;
        TagsStorageImpl tagsStorageImpl;
        Object requestUserTags;
        Collection collection;
        if (continuation instanceof TagsStorageImpl$requestAllTags$1) {
            tagsStorageImpl$requestAllTags$1 = (TagsStorageImpl$requestAllTags$1) continuation;
            if ((tagsStorageImpl$requestAllTags$1.label & Integer.MIN_VALUE) != 0) {
                tagsStorageImpl$requestAllTags$1.label -= Integer.MIN_VALUE;
                Object obj = tagsStorageImpl$requestAllTags$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tagsStorageImpl$requestAllTags$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String value = authData.getUserId().getValue();
                    UserToken token = authData.getToken();
                    tagsStorageImpl$requestAllTags$1.L$0 = this;
                    tagsStorageImpl$requestAllTags$1.L$1 = authData;
                    tagsStorageImpl$requestAllTags$1.label = 1;
                    obj = requestExperimentalTags(value, token, tagsStorageImpl$requestAllTags$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tagsStorageImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        collection = (Collection) tagsStorageImpl$requestAllTags$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        List<String> plus = CollectionsKt.plus(collection, (Iterable) obj);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
                        for (String str : plus) {
                            arrayList.add(new Tag(str));
                        }
                        return arrayList;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    authData = (AuthData) tagsStorageImpl$requestAllTags$1.L$1;
                    tagsStorageImpl = (TagsStorageImpl) tagsStorageImpl$requestAllTags$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Collection collection2 = (Collection) obj;
                String value2 = authData.getUserId().getValue();
                UserToken token2 = authData.getToken();
                tagsStorageImpl$requestAllTags$1.L$0 = collection2;
                tagsStorageImpl$requestAllTags$1.L$1 = null;
                tagsStorageImpl$requestAllTags$1.label = 2;
                requestUserTags = tagsStorageImpl.requestUserTags(value2, token2, tagsStorageImpl$requestAllTags$1);
                if (requestUserTags != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = requestUserTags;
                collection = collection2;
                List<String> plus2 = CollectionsKt.plus(collection, (Iterable) obj);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus2, 10));
                while (r8.hasNext()) {
                }
                return arrayList2;
            }
        }
        tagsStorageImpl$requestAllTags$1 = new TagsStorageImpl$requestAllTags$1(this, continuation);
        Object obj2 = tagsStorageImpl$requestAllTags$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tagsStorageImpl$requestAllTags$1.label;
        if (i != 0) {
        }
        Collection collection22 = (Collection) obj2;
        String value22 = authData.getUserId().getValue();
        UserToken token22 = authData.getToken();
        tagsStorageImpl$requestAllTags$1.L$0 = collection22;
        tagsStorageImpl$requestAllTags$1.L$1 = null;
        tagsStorageImpl$requestAllTags$1.label = 2;
        requestUserTags = tagsStorageImpl.requestUserTags(value22, token22, tagsStorageImpl$requestAllTags$1);
        if (requestUserTags != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: Exception -> 0x005a, SocketTimeoutException -> 0x0060, TRY_LEAVE, TryCatch #2 {SocketTimeoutException -> 0x0060, Exception -> 0x005a, blocks: (B:12:0x002c, B:21:0x004d, B:23:0x0055, B:17:0x003b), top: B:29:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestExperimentalTags(String str, UserToken userToken, Continuation<? super List<String>> continuation) {
        TagsStorageImpl$requestExperimentalTags$1 tagsStorageImpl$requestExperimentalTags$1;
        int i;
        TagsStorageImpl tagsStorageImpl;
        try {
            if (continuation instanceof TagsStorageImpl$requestExperimentalTags$1) {
                tagsStorageImpl$requestExperimentalTags$1 = (TagsStorageImpl$requestExperimentalTags$1) continuation;
                if ((tagsStorageImpl$requestExperimentalTags$1.label & Integer.MIN_VALUE) != 0) {
                    tagsStorageImpl$requestExperimentalTags$1.label -= Integer.MIN_VALUE;
                    Object obj = tagsStorageImpl$requestExperimentalTags$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tagsStorageImpl$requestExperimentalTags$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        TagsApi tagsApi = this.api;
                        String formatted = userToken.formatted();
                        tagsStorageImpl$requestExperimentalTags$1.L$0 = this;
                        tagsStorageImpl$requestExperimentalTags$1.label = 1;
                        obj = tagsApi.getExperimentalTags(formatted, str, tagsStorageImpl$requestExperimentalTags$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tagsStorageImpl = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        tagsStorageImpl = (TagsStorageImpl) tagsStorageImpl$requestExperimentalTags$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    List<String> handleSuccessRequest = tagsStorageImpl.handleSuccessRequest((Response) obj);
                    return handleSuccessRequest != null ? CollectionsKt.emptyList() : handleSuccessRequest;
                }
            }
            if (i != 0) {
            }
            List<String> handleSuccessRequest2 = tagsStorageImpl.handleSuccessRequest((Response) obj);
            if (handleSuccessRequest2 != null) {
            }
        } catch (SocketTimeoutException unused) {
            Log.e("Error", "Timeout Exception");
            return CollectionsKt.emptyList();
        } catch (Exception unused2) {
            Log.e("Error", "Exception");
            return CollectionsKt.emptyList();
        }
        tagsStorageImpl$requestExperimentalTags$1 = new TagsStorageImpl$requestExperimentalTags$1(this, continuation);
        Object obj2 = tagsStorageImpl$requestExperimentalTags$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tagsStorageImpl$requestExperimentalTags$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: Exception -> 0x005a, SocketTimeoutException -> 0x0060, TRY_LEAVE, TryCatch #2 {SocketTimeoutException -> 0x0060, Exception -> 0x005a, blocks: (B:12:0x002c, B:21:0x004d, B:23:0x0055, B:17:0x003b), top: B:29:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestUserTags(String str, UserToken userToken, Continuation<? super List<String>> continuation) {
        TagsStorageImpl$requestUserTags$1 tagsStorageImpl$requestUserTags$1;
        int i;
        TagsStorageImpl tagsStorageImpl;
        try {
            if (continuation instanceof TagsStorageImpl$requestUserTags$1) {
                tagsStorageImpl$requestUserTags$1 = (TagsStorageImpl$requestUserTags$1) continuation;
                if ((tagsStorageImpl$requestUserTags$1.label & Integer.MIN_VALUE) != 0) {
                    tagsStorageImpl$requestUserTags$1.label -= Integer.MIN_VALUE;
                    Object obj = tagsStorageImpl$requestUserTags$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tagsStorageImpl$requestUserTags$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        TagsApi tagsApi = this.api;
                        String formatted = userToken.formatted();
                        tagsStorageImpl$requestUserTags$1.L$0 = this;
                        tagsStorageImpl$requestUserTags$1.label = 1;
                        obj = tagsApi.getTags(formatted, str, tagsStorageImpl$requestUserTags$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tagsStorageImpl = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        tagsStorageImpl = (TagsStorageImpl) tagsStorageImpl$requestUserTags$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    List<String> handleSuccessRequest = tagsStorageImpl.handleSuccessRequest((Response) obj);
                    return handleSuccessRequest != null ? CollectionsKt.emptyList() : handleSuccessRequest;
                }
            }
            if (i != 0) {
            }
            List<String> handleSuccessRequest2 = tagsStorageImpl.handleSuccessRequest((Response) obj);
            if (handleSuccessRequest2 != null) {
            }
        } catch (SocketTimeoutException unused) {
            Log.e("Error", "Timeout Exception");
            return CollectionsKt.emptyList();
        } catch (Exception unused2) {
            Log.e("Error", "Exception");
            return CollectionsKt.emptyList();
        }
        tagsStorageImpl$requestUserTags$1 = new TagsStorageImpl$requestUserTags$1(this, continuation);
        Object obj2 = tagsStorageImpl$requestUserTags$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tagsStorageImpl$requestUserTags$1.label;
    }

    private final List<String> handleSuccessRequest(Response<List<String>> response) {
        if (response.code() == 200) {
            return response.body();
        }
        Log.e("Error", "Can not get experimental tags");
        return null;
    }
}
