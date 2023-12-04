package com.ifriend.presentation.features.purchases.benefits.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ActivePremiumBenefitsViewModel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002*+B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0017\u001a\u00020\u0018J0\u0010\u0019\u001a\u00020\u0018*\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u001cH\u0097\u0001JD\u0010 \u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020\u001a2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u001cH\u0096\u0001JD\u0010$\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u001cH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010%J)\u0010&\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010'\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010(JD\u0010)\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u001cH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event;", "getBenefitsUseCase", "Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;", "mapper", "Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;", "onManageSubscriptionClick", "", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivePremiumBenefitsViewModel extends ViewModel implements UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_0;
    private final GetAllPremiumBenefitsUseCase getBenefitsUseCase;
    private final SubscriptionBenefitsUiMapper mapper;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public ActivePremiumBenefitsViewModel(GetAllPremiumBenefitsUseCase getBenefitsUseCase, SubscriptionBenefitsUiMapper mapper, DispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(getBenefitsUseCase, "getBenefitsUseCase");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.getBenefitsUseCase = getBenefitsUseCase;
        this.mapper = mapper;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new UiState(null, false, 3, null), 0, null, 6, null);
        CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new AnonymousClass1(null), dispatchers.background(), new AnonymousClass2(null)).invokeOnCompletion(new AnonymousClass3());
    }

    /* compiled from: ActivePremiumBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event;", "", "CloseFeature", "OpenManageSubscription", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event$OpenManageSubscription;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ActivePremiumBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event$OpenManageSubscription;", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class OpenManageSubscription implements Event {
            public static final int $stable = 0;
            public static final OpenManageSubscription INSTANCE = new OpenManageSubscription();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof OpenManageSubscription) {
                    OpenManageSubscription openManageSubscription = (OpenManageSubscription) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 894402312;
            }

            public String toString() {
                return "OpenManageSubscription";
            }

            private OpenManageSubscription() {
            }
        }

        /* compiled from: ActivePremiumBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class CloseFeature implements Event {
            public static final int $stable = 0;
            public static final CloseFeature INSTANCE = new CloseFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof CloseFeature) {
                    CloseFeature closeFeature = (CloseFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1532303578;
            }

            public String toString() {
                return "CloseFeature";
            }

            private CloseFeature() {
            }
        }
    }

    /* compiled from: ActivePremiumBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;", "", "benefits", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/purchases/common/model/SubscriptionBenefitsGroupUiParams;", "isLoading", "", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getBenefits", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final ImmutableList<SubscriptionBenefitsGroupUiParams> benefits;
        private final boolean isLoading;

        public UiState() {
            this(null, false, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, ImmutableList immutableList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = uiState.benefits;
            }
            if ((i & 2) != 0) {
                z = uiState.isLoading;
            }
            return uiState.copy(immutableList, z);
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> component1() {
            return this.benefits;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final UiState copy(ImmutableList<SubscriptionBenefitsGroupUiParams> benefits, boolean z) {
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new UiState(benefits, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.benefits, uiState.benefits) && this.isLoading == uiState.isLoading;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.benefits.hashCode() * 31;
            boolean z = this.isLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList = this.benefits;
            boolean z = this.isLoading;
            return "UiState(benefits=" + immutableList + ", isLoading=" + z + ")";
        }

        public UiState(ImmutableList<SubscriptionBenefitsGroupUiParams> benefits, boolean z) {
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.benefits = benefits;
            this.isLoading = z;
        }

        public /* synthetic */ UiState(PersistentList persistentList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 2) != 0 ? true : z);
        }

        public final ImmutableList<SubscriptionBenefitsGroupUiParams> getBenefits() {
            return this.benefits;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    /* compiled from: ActivePremiumBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$1", f = "ActivePremiumBenefitsViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiStateDelegate<UiState, Event> uiStateDelegate = ActivePremiumBenefitsViewModel.this;
                this.label = 1;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* compiled from: ActivePremiumBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$2", f = "ActivePremiumBenefitsViewModel.kt", i = {}, l = {46, 50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ActivePremiumBenefitsViewModel.this.getBenefitsUseCase.getAll(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Iterable<Pair<String, ? extends List<String>>> iterable = (Iterable) obj;
            SubscriptionBenefitsUiMapper subscriptionBenefitsUiMapper = ActivePremiumBenefitsViewModel.this.mapper;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Pair<String, ? extends List<String>> pair : iterable) {
                arrayList.add(subscriptionBenefitsUiMapper.map(pair));
            }
            ImmutableList immutableList = ExtensionsKt.toImmutableList(arrayList);
            UiStateDelegate<UiState, Event> uiStateDelegate = ActivePremiumBenefitsViewModel.this;
            this.label = 2;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(immutableList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ActivePremiumBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
            final /* synthetic */ ImmutableList<SubscriptionBenefitsGroupUiParams> $benefits;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ImmutableList<SubscriptionBenefitsGroupUiParams> immutableList) {
                super(1);
                this.$benefits = immutableList;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, this.$benefits, false, 2, null);
            }
        }
    }

    /* compiled from: ActivePremiumBenefitsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends Lambda implements Function1<Throwable, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ActivePremiumBenefitsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.benefits.viewmodel.ActivePremiumBenefitsViewModel$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, null, false, 1, null);
            }
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            UiStateDelegate<UiState, Event> uiStateDelegate = ActivePremiumBenefitsViewModel.this;
            uiStateDelegate.asyncUpdateUiState(uiStateDelegate, ViewModelKt.getViewModelScope((ViewModel) uiStateDelegate), AnonymousClass1.INSTANCE);
        }
    }

    public final void onManageSubscriptionClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ActivePremiumBenefitsViewModel$onManageSubscriptionClick$1(this, null), 3, null);
    }
}
