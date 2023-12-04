package com.ifriend.data.repository;

import androidx.autofill.HintConstants;
import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.data.mappers.ToUserMapper;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import retrofit2.Response;
/* compiled from: UserRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010JO\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001e2(\u0010\u001f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\"0!\u0012\u0006\u0012\u0004\u0018\u00010#0 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001cH\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0(H\u0016J+\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020.H\u0016J+\u0010/\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\b\u00100\u001a\u00020\u001cH\u0002J\u0019\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u000207H\u0096@ø\u0001\u0000¢\u0006\u0002\u00108J\u0019\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010<R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/ifriend/data/repository/UserRepositoryImpl;", "Lcom/ifriend/domain/data/UserRepository;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "api", "Lcom/ifriend/data/networking/api/UserApi;", "fromGenderMapper", "Lcom/ifriend/data/mappers/GenderToBackendString;", "toUserMapper", "Lcom/ifriend/data/mappers/ToUserMapper;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/domain/data/TagsProvider;Lcom/ifriend/data/networking/api/UserApi;Lcom/ifriend/data/mappers/GenderToBackendString;Lcom/ifriend/data/mappers/ToUserMapper;Lcom/ifriend/domain/CoroutineDispatchers;Lkotlinx/coroutines/CoroutineScope;)V", "lastAuthData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "lastTags", "", "Lcom/ifriend/domain/models/Tag;", "loadingJob", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/user/User;", "changeUser", "", "change", "Lkotlin/Function1;", "makeRequest", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "getCurrentUser", "getUser", "Lkotlinx/coroutines/flow/StateFlow;", "internalLoad", "auth", "tags", "(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAuthorized", "", "loadAndEmit", "loadIfNeed", "setBirthday", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "(Lcom/ifriend/domain/models/profile/Birthday;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGender", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "(Lcom/ifriend/domain/models/profile/Gender;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserRepositoryImpl implements UserRepository {
    private final UserApi api;
    private final AuthDataProvider authDataProvider;
    private final CoroutineDispatchers coroutineDispatchers;
    private final CoroutineScope coroutineScope;
    private final GenderToBackendString fromGenderMapper;
    private AuthData lastAuthData;
    private List<Tag> lastTags;
    private Job loadingJob;
    private final MutableStateFlow<User> state;
    private final TagsProvider tagsProvider;
    private final ToUserMapper toUserMapper;

    public UserRepositoryImpl(AuthDataProvider authDataProvider, TagsProvider tagsProvider, UserApi api, GenderToBackendString fromGenderMapper, ToUserMapper toUserMapper, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(fromGenderMapper, "fromGenderMapper");
        Intrinsics.checkNotNullParameter(toUserMapper, "toUserMapper");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.authDataProvider = authDataProvider;
        this.tagsProvider = tagsProvider;
        this.api = api;
        this.fromGenderMapper = fromGenderMapper;
        this.toUserMapper = toUserMapper;
        this.coroutineDispatchers = coroutineDispatchers;
        this.coroutineScope = coroutineScope;
        this.state = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* compiled from: UserRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.data.repository.UserRepositoryImpl$1", f = "UserRepositoryImpl.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.data.repository.UserRepositoryImpl$1  reason: invalid class name */
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
                if (FlowKt.collect(FlowKt.flowCombine(UserRepositoryImpl.this.authDataProvider.sessionAuthData(), UserRepositoryImpl.this.tagsProvider.tagsFlow(), new C01401(UserRepositoryImpl.this)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: UserRepositoryImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.data.repository.UserRepositoryImpl$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C01401 extends FunctionReferenceImpl implements Function3<AuthData, List<? extends Tag>, Continuation<? super Unit>, Object>, SuspendFunction {
            C01401(Object obj) {
                super(3, obj, UserRepositoryImpl.class, "loadAndEmit", "loadAndEmit(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(AuthData authData, List<Tag> list, Continuation<? super Unit> continuation) {
                return ((UserRepositoryImpl) this.receiver).loadAndEmit(authData, list, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(AuthData authData, List<? extends Tag> list, Continuation<? super Unit> continuation) {
                return invoke2(authData, (List<Tag>) list, continuation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r5.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAndEmit(AuthData authData, List<Tag> list, Continuation<? super Unit> continuation) {
        UserRepositoryImpl$loadAndEmit$1 userRepositoryImpl$loadAndEmit$1;
        int i;
        if (continuation instanceof UserRepositoryImpl$loadAndEmit$1) {
            userRepositoryImpl$loadAndEmit$1 = (UserRepositoryImpl$loadAndEmit$1) continuation;
            if ((userRepositoryImpl$loadAndEmit$1.label & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$loadAndEmit$1.label -= Integer.MIN_VALUE;
                Object obj = userRepositoryImpl$loadAndEmit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userRepositoryImpl$loadAndEmit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    userRepositoryImpl$loadAndEmit$1.label = 1;
                    if (internalLoad(authData, list, userRepositoryImpl$loadAndEmit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        userRepositoryImpl$loadAndEmit$1 = new UserRepositoryImpl$loadAndEmit$1(this, continuation);
        Object obj2 = userRepositoryImpl$loadAndEmit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userRepositoryImpl$loadAndEmit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object internalLoad(AuthData authData, List<Tag> list, Continuation<? super Unit> continuation) {
        Job launch$default;
        if (list == null) {
            return Unit.INSTANCE;
        }
        if (authData == null) {
            Object emit = this.state.emit(null, continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        } else if (authData.isEqualWithoutEmail(this.lastAuthData) && Intrinsics.areEqual(this.lastTags, list)) {
            return Unit.INSTANCE;
        } else {
            this.lastAuthData = authData;
            this.lastTags = list;
            Job job = this.loadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.loadingJob = null;
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.coroutineDispatchers.getIO(), null, new UserRepositoryImpl$internalLoad$2(this, authData, list, null), 2, null);
            this.loadingJob = launch$default;
            return Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.domain.data.UserRepository
    public StateFlow<User> getUser() {
        loadIfNeed();
        return this.state;
    }

    @Override // com.ifriend.domain.data.UserRepository
    public User getCurrentUser() {
        loadIfNeed();
        return this.state.getValue();
    }

    @Override // com.ifriend.domain.data.UserRepository
    public boolean isAuthorized() {
        return this.state.getValue() != null;
    }

    private final void loadIfNeed() {
        if (this.state.getValue() != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new UserRepositoryImpl$loadIfNeed$1(this, null), 3, null);
    }

    @Override // com.ifriend.domain.data.UserRepository
    public Object setName(String str, Continuation<? super Unit> continuation) {
        Object changeUser = changeUser(new UserRepositoryImpl$setName$2(str), new UserRepositoryImpl$setName$3(this, str, null), continuation);
        return changeUser == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeUser : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.UserRepository
    public Object setGender(Gender gender, Continuation<? super Unit> continuation) {
        Object changeUser = changeUser(new UserRepositoryImpl$setGender$2(gender), new UserRepositoryImpl$setGender$3(this, gender, null), continuation);
        return changeUser == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeUser : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.UserRepository
    public Object setBirthday(Birthday birthday, Continuation<? super Unit> continuation) {
        Object changeUser = changeUser(new UserRepositoryImpl$setBirthday$2(birthday), new UserRepositoryImpl$setBirthday$3(this, birthday, null), continuation);
        return changeUser == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? changeUser : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.UserRepository
    public void clear() {
        this.state.tryEmit(null);
        this.lastTags = null;
        this.lastAuthData = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(3:(1:(1:13)(2:17|18))(2:19|20)|14|15)(6:21|22|23|(2:25|(1:27))|14|15))(1:28))(3:40|(2:48|(1:50)(1:51))|47)|29|30|(1:32)(5:33|23|(0)|14|15)))|53|6|7|(0)(0)|29|30|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r12.printStackTrace();
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
        if (changeUser$emitOldUser(r11, r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:18:0x0045, B:21:0x0052, B:42:0x00bd, B:44:0x00c5), top: B:54:0x0026 }] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeUser(Function1<? super User, User> function1, Function2<? super AuthData, ? super Continuation<? super Response<Unit>>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        UserRepositoryImpl$changeUser$1 userRepositoryImpl$changeUser$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AuthData value;
        User value2;
        UserRepositoryImpl userRepositoryImpl;
        Function2 function22;
        UserRepositoryImpl userRepositoryImpl2;
        User user;
        if (continuation instanceof UserRepositoryImpl$changeUser$1) {
            userRepositoryImpl$changeUser$1 = (UserRepositoryImpl$changeUser$1) continuation;
            if ((userRepositoryImpl$changeUser$1.label & Integer.MIN_VALUE) != 0) {
                userRepositoryImpl$changeUser$1.label -= Integer.MIN_VALUE;
                obj = userRepositoryImpl$changeUser$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userRepositoryImpl$changeUser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    value = this.authDataProvider.sessionAuthData().getValue();
                    if (value != null && (value2 = this.state.getValue()) != null) {
                        MutableStateFlow<User> mutableStateFlow = this.state;
                        userRepositoryImpl$changeUser$1.L$0 = this;
                        userRepositoryImpl$changeUser$1.L$1 = function2;
                        userRepositoryImpl$changeUser$1.L$2 = value;
                        userRepositoryImpl$changeUser$1.L$3 = value2;
                        userRepositoryImpl$changeUser$1.label = 1;
                        if (mutableStateFlow.emit((User) function1.invoke(value2), userRepositoryImpl$changeUser$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        userRepositoryImpl = this;
                        function1 = value2;
                        function22 = function2;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    if (i == 2) {
                        User user2 = (User) userRepositoryImpl$changeUser$1.L$1;
                        userRepositoryImpl2 = (UserRepositoryImpl) userRepositoryImpl$changeUser$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        user = user2;
                        if (!((Response) obj).isSuccessful()) {
                            userRepositoryImpl$changeUser$1.L$0 = userRepositoryImpl2;
                            userRepositoryImpl$changeUser$1.L$1 = user;
                            userRepositoryImpl$changeUser$1.label = 3;
                            if (changeUser$emitOldUser(userRepositoryImpl2, user, userRepositoryImpl$changeUser$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        User user3 = (User) userRepositoryImpl$changeUser$1.L$1;
                        UserRepositoryImpl userRepositoryImpl3 = (UserRepositoryImpl) userRepositoryImpl$changeUser$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                } else {
                    userRepositoryImpl = (UserRepositoryImpl) userRepositoryImpl$changeUser$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    value = (AuthData) userRepositoryImpl$changeUser$1.L$2;
                    function22 = (Function2) userRepositoryImpl$changeUser$1.L$1;
                    function1 = (User) userRepositoryImpl$changeUser$1.L$3;
                }
                userRepositoryImpl$changeUser$1.L$0 = userRepositoryImpl;
                userRepositoryImpl$changeUser$1.L$1 = function1;
                userRepositoryImpl$changeUser$1.L$2 = null;
                userRepositoryImpl$changeUser$1.L$3 = null;
                userRepositoryImpl$changeUser$1.label = 2;
                obj = function22.invoke(value, userRepositoryImpl$changeUser$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                userRepositoryImpl2 = userRepositoryImpl;
                user = function1;
                if (!((Response) obj).isSuccessful()) {
                }
                return Unit.INSTANCE;
            }
        }
        userRepositoryImpl$changeUser$1 = new UserRepositoryImpl$changeUser$1(this, continuation);
        obj = userRepositoryImpl$changeUser$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userRepositoryImpl$changeUser$1.label;
        if (i != 0) {
        }
        userRepositoryImpl$changeUser$1.L$0 = userRepositoryImpl;
        userRepositoryImpl$changeUser$1.L$1 = function1;
        userRepositoryImpl$changeUser$1.L$2 = null;
        userRepositoryImpl$changeUser$1.L$3 = null;
        userRepositoryImpl$changeUser$1.label = 2;
        obj = function22.invoke(value, userRepositoryImpl$changeUser$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object changeUser$emitOldUser(UserRepositoryImpl userRepositoryImpl, User user, Continuation<? super Unit> continuation) {
        Object emit = userRepositoryImpl.state.emit(user, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
