package com.ifriend.chat.presentation.ui.diary.fragments;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.usecase.chat.DiaryAnalytics;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState;
import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick;
import com.ifriend.chat.presentation.ui.diary.models.DiaryTheme;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.models.ShortDiaryPlaceholderUiModel;
import com.ifriend.chat.presentation.ui.diary.models.ThemedDiaryCardItem;
import com.ifriend.chat.presentation.ui.diary.models.ThemedShortDiaryPlaceholderCardItem;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import com.ifriend.common_utils.Logger;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.diary.DiaryNoteModel;
import com.ifriend.domain.models.diary.DiaryNotePlaceholder;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: BaseDiaryViewModel.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001HB]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0002J$\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001e2\u0014\u0010.\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dH\u0002J\u0019\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020)J\u0006\u00103\u001a\u00020)J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020#H\u0002J\u0010\u00106\u001a\u00020)2\u0006\u00107\u001a\u000208H\u0016J\u001e\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020-0\u001eH\u0002J\b\u0010=\u001a\u00020)H\u0002J\b\u0010>\u001a\u00020)H\u0002J\u0010\u0010?\u001a\u00020)2\b\u0010@\u001a\u0004\u0018\u00010!J\u0010\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0002J\u0016\u0010D\u001a\u00020)2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020-0\u001eH\u0002J\f\u0010E\u001a\u00020C*\u000208H\u0002J\f\u0010F\u001a\u000208*\u00020GH\u0002R\"\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryShortCardClick;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "getDiaryNotesListUseCase", "Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;", "replyDiaryNoteUseCase", "Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;", "refreshDiaryUseCase", "Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;", "onDiaryShownUseCase", "Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;", "theme", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryTheme;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;Lcom/ifriend/chat/presentation/ui/diary/models/DiaryTheme;Lcom/ifriend/common_utils/Logger;)V", "allNotesResourceFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/common_utils/data/Resource;", "", "Lcom/ifriend/domain/models/diary/DiaryNoteModel;", "diaryNoteIdToShowAfterStart", "", "isDiaryNoteShownAfterStart", "", "noteTimeFormat", "Ljava/text/SimpleDateFormat;", "scheduledPaywallJob", "Lkotlinx/coroutines/Job;", "cancelScheduledPaywall", "", "changeFullScreenLoadingState", "isLoading", "getNotes", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "resource", "handlePurchaseResult", "success", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClickBack", "onClickDiaryButton", "onPurchaseResult", "isSucceed", "onShortDiaryCardClick", "diaryModel", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "openDiaryNote", "diaryNoteToOpenAfterStart", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedDiaryCardItem;", "allNotes", "schedulePaywall", "showPaywall", TtmlNode.START, "diaryNoteId", "updateButtonState", "buttonState", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "updateState", "calculateButtonState", "toUiModel", "Lcom/ifriend/domain/models/diary/DiaryNote;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseDiaryViewModel extends BaseViewModel<DiaryScreenState> implements DiaryShortCardClick {
    private static boolean IS_PAYWALL_WAS_AUTO_OPENED_IN_THIS_SESSION;
    private final StateFlow<Resource<? extends List<DiaryNoteModel>>> allNotesResourceFlow;
    private final AppEventsEmitter appEventsEmitter;
    private final BotRepository botRepository;
    private String diaryNoteIdToShowAfterStart;
    private final GetDiaryNotesListUseCase getDiaryNotesListUseCase;
    private boolean isDiaryNoteShownAfterStart;
    private final Logger logger;
    private final SimpleDateFormat noteTimeFormat;
    private final OnDiaryShownUseCase onDiaryShownUseCase;
    private final PaymentResultFlow paymentResultFlow;
    private final RefreshDiaryUseCase refreshDiaryUseCase;
    private final ReplyDiaryNoteUseCase replyDiaryNoteUseCase;
    private final RouterProvider routerProvider;
    private Job scheduledPaywallJob;
    private final DiaryTheme theme;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiaryViewModel(CoroutineDispatchers dispatchers, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, RouterProvider routerProvider, BotRepository botRepository, GetDiaryNotesListUseCase getDiaryNotesListUseCase, ReplyDiaryNoteUseCase replyDiaryNoteUseCase, RefreshDiaryUseCase refreshDiaryUseCase, OnDiaryShownUseCase onDiaryShownUseCase, DiaryTheme theme, Logger logger) {
        super(dispatchers, DiaryScreenState.Companion.getINITIAL());
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(routerProvider, "routerProvider");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(getDiaryNotesListUseCase, "getDiaryNotesListUseCase");
        Intrinsics.checkNotNullParameter(replyDiaryNoteUseCase, "replyDiaryNoteUseCase");
        Intrinsics.checkNotNullParameter(refreshDiaryUseCase, "refreshDiaryUseCase");
        Intrinsics.checkNotNullParameter(onDiaryShownUseCase, "onDiaryShownUseCase");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.routerProvider = routerProvider;
        this.botRepository = botRepository;
        this.getDiaryNotesListUseCase = getDiaryNotesListUseCase;
        this.replyDiaryNoteUseCase = replyDiaryNoteUseCase;
        this.refreshDiaryUseCase = refreshDiaryUseCase;
        this.onDiaryShownUseCase = onDiaryShownUseCase;
        this.theme = theme;
        this.logger = logger;
        this.noteTimeFormat = new SimpleDateFormat("hh:mm a", Locale.US);
        BaseDiaryViewModel baseDiaryViewModel = this;
        this.allNotesResourceFlow = FlowKt.stateIn(getDiaryNotesListUseCase.getAllNotes(false), ViewModelKt.getViewModelScope(baseDiaryViewModel), SharingStarted.Companion.getLazily(), new Resource.Loading(null));
        FlowKt.launchIn(FlowKt.onEach(botRepository.getBot(), new AnonymousClass1(null)), ViewModelKt.getViewModelScope(baseDiaryViewModel));
    }

    /* compiled from: BaseDiaryViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryViewModel$Companion;", "", "()V", "IS_PAYWALL_WAS_AUTO_OPENED_IN_THIS_SESSION", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: BaseDiaryViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$1", f = "BaseDiaryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Bot, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Bot bot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(bot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bot bot = (Bot) this.L$0;
            String name = bot != null ? bot.getName() : null;
            if (name == null) {
                name = "";
            }
            BaseDiaryViewModel.this.changeState(new C01201(name));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BaseDiaryViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01201 extends Lambda implements Function1<DiaryScreenState, DiaryScreenState> {
            final /* synthetic */ String $botName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01201(String str) {
                super(1);
                this.$botName = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DiaryScreenState invoke(DiaryScreenState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof DiaryScreenState.DiariesList) {
                    return DiaryScreenState.DiariesList.copy$default((DiaryScreenState.DiariesList) state, null, false, this.$botName, 3, null);
                }
                if (state instanceof DiaryScreenState.DiaryDetail) {
                    return DiaryScreenState.DiaryDetail.copy$default((DiaryScreenState.DiaryDetail) state, null, null, false, false, this.$botName, null, 47, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void start(String str) {
        this.diaryNoteIdToShowAfterStart = str;
        final StateFlow<Resource<? extends List<DiaryNoteModel>>> stateFlow = this.allNotesResourceFlow;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<List<? extends DiaryListItem>>() { // from class: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$start$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends DiaryListItem>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$start$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ BaseDiaryViewModel this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$start$$inlined$map$1$2", f = "BaseDiaryViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel$start$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BaseDiaryViewModel baseDiaryViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = baseDiaryViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    List notes;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                notes = this.this$0.getNotes((Resource) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(notes, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new BaseDiaryViewModel$start$2(this, null)), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDiaryNote(ThemedDiaryCardItem themedDiaryCardItem, List<? extends DiaryListItem> list) {
        changeState(new BaseDiaryViewModel$openDiaryNote$1(themedDiaryCardItem, this, list));
        this.isDiaryNoteShownAfterStart = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(List<? extends DiaryListItem> list) {
        changeState(new BaseDiaryViewModel$updateState$1(list, this));
    }

    @Override // com.ifriend.chat.presentation.ui.diary.models.DiaryShortCardClick
    public void onShortDiaryCardClick(DiaryUiModel diaryModel) {
        Intrinsics.checkNotNullParameter(diaryModel, "diaryModel");
        DiaryAnalytics.INSTANCE.trackClickDiaryNoteButtonAnalytics(diaryModel.getDomainModel());
        changeState(new BaseDiaryViewModel$onShortDiaryCardClick$1(this, diaryModel));
        if (diaryModel.isAvailable() || IS_PAYWALL_WAS_AUTO_OPENED_IN_THIS_SESSION) {
            return;
        }
        schedulePaywall();
    }

    private final void schedulePaywall() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseDiaryViewModel$schedulePaywall$1(this, null), 3, null);
        this.scheduledPaywallJob = launch$default;
    }

    private final void cancelScheduledPaywall() {
        Job job = this.scheduledPaywallJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.scheduledPaywallJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DiaryButtonState calculateButtonState(DiaryUiModel diaryUiModel) {
        if (diaryUiModel.isAvailable() && diaryUiModel.isAnswered()) {
            return new DiaryButtonState.BackToChat("Back to chat");
        }
        if (!diaryUiModel.isAvailable() || diaryUiModel.isAnswered()) {
            return new DiaryButtonState.OpenSecretNote("Open secret note");
        }
        Bot currentBot = this.botRepository.getCurrentBot();
        String name = currentBot != null ? currentBot.getName() : null;
        if (name == null) {
            name = "";
        }
        return new DiaryButtonState.TextBot("Text " + name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DiaryListItem> getNotes(Resource<? extends List<? extends DiaryNoteModel>> resource) {
        DiaryListItem fromTheme;
        List<? extends DiaryNoteModel> data = resource.getData();
        if (data == null) {
            return CollectionsKt.emptyList();
        }
        List<? extends DiaryNoteModel> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DiaryNoteModel diaryNoteModel = (DiaryNoteModel) obj;
            if (diaryNoteModel instanceof DiaryNote) {
                fromTheme = ThemedDiaryCardItem.Companion.fromTheme(this.theme, toUiModel((DiaryNote) diaryNoteModel));
            } else if (diaryNoteModel instanceof DiaryNotePlaceholder) {
                fromTheme = ThemedShortDiaryPlaceholderCardItem.Companion.fromTheme(this.theme, new ShortDiaryPlaceholderUiModel(i));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(fromTheme);
            i = i2;
        }
        return arrayList;
    }

    public final void onClickBack() {
        cancelScheduledPaywall();
        if (getState().getValue() instanceof DiaryScreenState.DiaryDetail) {
            cancelScheduledPaywall();
            changeState(BaseDiaryViewModel$onClickBack$1.INSTANCE);
            return;
        }
        this.routerProvider.getRoute().exit();
    }

    public final void onClickDiaryButton() {
        DiaryScreenState value = getState().getValue();
        if (value instanceof DiaryScreenState.DiaryDetail) {
            cancelScheduledPaywall();
            DiaryScreenState.DiaryDetail diaryDetail = (DiaryScreenState.DiaryDetail) value;
            DiaryButtonState buttonState = diaryDetail.getButtonState();
            if (buttonState instanceof DiaryButtonState.TextBot) {
                DiaryAnalytics.INSTANCE.trackClickDiaryNoteButtonAnalytics(diaryDetail.getDiary().getDomainModel());
                CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new BaseDiaryViewModel$onClickDiaryButton$1(this), new BaseDiaryViewModel$onClickDiaryButton$2(this, value, null));
            } else if (buttonState instanceof DiaryButtonState.OpenSecretNote) {
                showPaywall();
            } else if (buttonState instanceof DiaryButtonState.BackToChat) {
                DiaryAnalytics.INSTANCE.trackClickDiaryNoteButtonAnalytics(diaryDetail.getDiary().getDomainModel());
                CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new BaseDiaryViewModel$onClickDiaryButton$3(this), new BaseDiaryViewModel$onClickDiaryButton$4(this, value, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPaywall() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseDiaryViewModel$showPaywall$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseResult(boolean z) {
        CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new BaseDiaryViewModel$onPurchaseResult$1(this), new BaseDiaryViewModel$onPurchaseResult$2(this, z, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlePurchaseResult(boolean z, Continuation<? super Unit> continuation) {
        BaseDiaryViewModel$handlePurchaseResult$1 baseDiaryViewModel$handlePurchaseResult$1;
        Object coroutine_suspended;
        int i;
        BaseDiaryViewModel baseDiaryViewModel;
        RefreshDiaryUseCase refreshDiaryUseCase;
        if (continuation instanceof BaseDiaryViewModel$handlePurchaseResult$1) {
            baseDiaryViewModel$handlePurchaseResult$1 = (BaseDiaryViewModel$handlePurchaseResult$1) continuation;
            if ((baseDiaryViewModel$handlePurchaseResult$1.label & Integer.MIN_VALUE) != 0) {
                baseDiaryViewModel$handlePurchaseResult$1.label -= Integer.MIN_VALUE;
                Object obj = baseDiaryViewModel$handlePurchaseResult$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseDiaryViewModel$handlePurchaseResult$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    changeFullScreenLoadingState(true);
                    baseDiaryViewModel$handlePurchaseResult$1.L$0 = this;
                    baseDiaryViewModel$handlePurchaseResult$1.label = 1;
                    if (DelayKt.delay(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseDiaryViewModel = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            baseDiaryViewModel = (BaseDiaryViewModel) baseDiaryViewModel$handlePurchaseResult$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            baseDiaryViewModel.changeFullScreenLoadingState(false);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    baseDiaryViewModel = (BaseDiaryViewModel) baseDiaryViewModel$handlePurchaseResult$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    baseDiaryViewModel$handlePurchaseResult$1.L$0 = baseDiaryViewModel;
                    baseDiaryViewModel$handlePurchaseResult$1.label = 3;
                    if (DelayKt.delay(1000L, baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseDiaryViewModel.changeFullScreenLoadingState(false);
                    return Unit.INSTANCE;
                } else {
                    baseDiaryViewModel = (BaseDiaryViewModel) baseDiaryViewModel$handlePurchaseResult$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                refreshDiaryUseCase = baseDiaryViewModel.refreshDiaryUseCase;
                baseDiaryViewModel$handlePurchaseResult$1.L$0 = baseDiaryViewModel;
                baseDiaryViewModel$handlePurchaseResult$1.label = 2;
                if (refreshDiaryUseCase.refresh(baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseDiaryViewModel$handlePurchaseResult$1.L$0 = baseDiaryViewModel;
                baseDiaryViewModel$handlePurchaseResult$1.label = 3;
                if (DelayKt.delay(1000L, baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
                }
                baseDiaryViewModel.changeFullScreenLoadingState(false);
                return Unit.INSTANCE;
            }
        }
        baseDiaryViewModel$handlePurchaseResult$1 = new BaseDiaryViewModel$handlePurchaseResult$1(this, continuation);
        Object obj2 = baseDiaryViewModel$handlePurchaseResult$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseDiaryViewModel$handlePurchaseResult$1.label;
        if (i != 0) {
        }
        refreshDiaryUseCase = baseDiaryViewModel.refreshDiaryUseCase;
        baseDiaryViewModel$handlePurchaseResult$1.L$0 = baseDiaryViewModel;
        baseDiaryViewModel$handlePurchaseResult$1.label = 2;
        if (refreshDiaryUseCase.refresh(baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
        }
        baseDiaryViewModel$handlePurchaseResult$1.L$0 = baseDiaryViewModel;
        baseDiaryViewModel$handlePurchaseResult$1.label = 3;
        if (DelayKt.delay(1000L, baseDiaryViewModel$handlePurchaseResult$1) == coroutine_suspended) {
        }
        baseDiaryViewModel.changeFullScreenLoadingState(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonState(DiaryButtonState diaryButtonState) {
        changeState(new BaseDiaryViewModel$updateButtonState$1(diaryButtonState));
    }

    private final void changeFullScreenLoadingState(boolean z) {
        changeState(new BaseDiaryViewModel$changeFullScreenLoadingState$1(z));
    }

    private final DiaryUiModel toUiModel(DiaryNote diaryNote) {
        boolean isAvailable = diaryNote.isAvailable();
        boolean isAnswered = diaryNote.isAnswered();
        String format = this.noteTimeFormat.format(Long.valueOf(diaryNote.getTimestamp()));
        String str = format == null ? "" : format;
        String title = diaryNote.getTitle();
        String descriptionShort = diaryNote.getDescriptionShort();
        String str2 = descriptionShort == null ? "" : descriptionShort;
        String description = diaryNote.getDescription();
        return new DiaryUiModel(isAvailable, str, title, str2, description == null ? "" : description, diaryNote, isAnswered);
    }
}
