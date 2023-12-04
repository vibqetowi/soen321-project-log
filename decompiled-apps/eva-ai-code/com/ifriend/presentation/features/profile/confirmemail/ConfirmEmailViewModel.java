package com.ifriend.presentation.features.profile.confirmemail;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.storage.DelayedEventType;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonType;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.util.List;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ConfirmEmailViewModel.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001NB/\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\u0011H\u0002J\u0013\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020%H\u0096\u0001J\u0013\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020%H\u0096\u0001J\u0013\u0010)\u001a\u00020%2\b\b\u0001\u0010*\u001a\u00020%H\u0097\u0001J\u0006\u0010+\u001a\u00020,J\u0015\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0001\u0010$\u001a\u00020%H\u0096\u0001J\u0013\u0010/\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020%H\u0096\u0001J\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020%012\b\b\u0001\u0010$\u001a\u00020%H\u0096\u0001J\u001b\u00102\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%H\u0096\u0001J4\u00102\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020%2\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000506\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020%H\u0096\u0001J,\u00108\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020%2\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000506\"\u00020\u0005H\u0096\u0001¢\u0006\u0002\u00109J\u0019\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013012\b\b\u0001\u00103\u001a\u00020%H\u0096\u0001J\u0006\u0010;\u001a\u00020<J0\u0010=\u001a\u00020<*\u00020>2!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0097\u0001JD\u0010D\u001a\u00020E*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010F\u001a\u00020>2!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0096\u0001JD\u0010H\u001a\u00020<*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00040@H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010IJ)\u0010J\u001a\u00020<*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010K\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010LJD\u0010M\u001a\u00020<*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040@H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010IR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;", "", "sendConfirmationEmailUseCase", "Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "eventDelayStorage", "Lcom/ifriend/domain/storage/EventDelayStorage;", "resourceProvider", "(Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;Lcom/ifriend/domain/data/AuthDataProvider;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/domain/storage/EventDelayStorage;Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "emailConfirmationDelay", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;", "calculateDelayUntil", "getBoolean", "", "resId", "", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getEmailConfirmationTimer", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType$Timer;", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "resendEmail", "", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailViewModel extends ViewModel implements ResourceProvider, UiStateDelegate<UiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Object> $$delegate_1;
    private final AppConfigUseCase appConfigUseCase;
    private final AuthDataProvider authDataProvider;
    private long emailConfirmationDelay;
    private final EventDelayStorage eventDelayStorage;
    private final ResourceProvider resourceProvider;
    private final SendConfirmationEmailUseCase sendConfirmationEmailUseCase;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_1.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_1.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Object> getSingleEvents() {
        return this.$$delegate_1.getSingleEvents();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_1.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_1.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ConfirmEmailViewModel(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, AuthDataProvider authDataProvider, AppConfigUseCase appConfigUseCase, EventDelayStorage eventDelayStorage, ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(sendConfirmationEmailUseCase, "sendConfirmationEmailUseCase");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(eventDelayStorage, "eventDelayStorage");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.sendConfirmationEmailUseCase = sendConfirmationEmailUseCase;
        this.authDataProvider = authDataProvider;
        this.appConfigUseCase = appConfigUseCase;
        this.eventDelayStorage = eventDelayStorage;
        this.resourceProvider = resourceProvider;
        this.$$delegate_1 = new UiStateDelegateImpl<>(new UiState(null, 0L, 3, null), 0, null, 6, null);
        this.emailConfirmationDelay = 60000L;
        ConfirmEmailViewModel confirmEmailViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(confirmEmailViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(confirmEmailViewModel), null, null, new AnonymousClass2(null), 3, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(confirmEmailViewModel), null, null, new AnonymousClass3(null), 3, null);
    }

    /* compiled from: ConfirmEmailViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;", "", "description", "", "neurons", "", "(Ljava/lang/String;J)V", "getDescription", "()Ljava/lang/String;", "getNeurons", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final String description;
        private final long neurons;

        public UiState() {
            this(null, 0L, 3, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.description;
            }
            if ((i & 2) != 0) {
                j = uiState.neurons;
            }
            return uiState.copy(str, j);
        }

        public final String component1() {
            return this.description;
        }

        public final long component2() {
            return this.neurons;
        }

        public final UiState copy(String description, long j) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new UiState(description, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.description, uiState.description) && this.neurons == uiState.neurons;
            }
            return false;
        }

        public int hashCode() {
            return (this.description.hashCode() * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.neurons);
        }

        public String toString() {
            String str = this.description;
            long j = this.neurons;
            return "UiState(description=" + str + ", neurons=" + j + ")";
        }

        public UiState(String description, long j) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
            this.neurons = j;
        }

        public /* synthetic */ UiState(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
        }

        public final String getDescription() {
            return this.description;
        }

        public final long getNeurons() {
            return this.neurons;
        }
    }

    /* compiled from: ConfirmEmailViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1", f = "ConfirmEmailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1  reason: invalid class name */
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<AuthData> sessionAuthData = ConfirmEmailViewModel.this.authDataProvider.sessionAuthData();
                FlowKt.launchIn(FlowKt.onEach(new Flow<String>() { // from class: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ConfirmEmailViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                        AuthData authData = (AuthData) obj;
                                        String email = authData != null ? authData.getEmail() : null;
                                        if (email == null) {
                                            email = "";
                                        }
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(email, anonymousClass1) == coroutine_suspended) {
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
                }, new AnonymousClass2(ConfirmEmailViewModel.this, null)), ViewModelKt.getViewModelScope(ConfirmEmailViewModel.this));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ConfirmEmailViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "email", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$2", f = "ConfirmEmailViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConfirmEmailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ConfirmEmailViewModel confirmEmailViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = confirmEmailViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String string = this.this$0.getString(R.string.confirm_email__let_us_know_email, (String) this.L$0);
                    UiStateDelegate<UiState, Object> uiStateDelegate = this.this$0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01671(string), this) == coroutine_suspended) {
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
            /* compiled from: ConfirmEmailViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01671 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ String $description;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01671(String str) {
                    super(1);
                    this.$description = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return UiState.copy$default(state, this.$description, 0L, 2, null);
                }
            }
        }
    }

    /* compiled from: ConfirmEmailViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$2", f = "ConfirmEmailViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$2  reason: invalid class name */
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
                obj = ConfirmEmailViewModel.this.appConfigUseCase.getLongValue(ConfigKeys.EMAIL_CONFIRMATION_DELAY, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Long l = (Long) obj;
            if (l != null) {
                ConfirmEmailViewModel.this.emailConfirmationDelay = l.longValue();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConfirmEmailViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$3", f = "ConfirmEmailViewModel.kt", i = {}, l = {SSL.SSL_PROTOCOL_TLS, 64}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ConfirmEmailViewModel.this.appConfigUseCase.getLongValue(FeatureToggleKey.CONFIRM_EMAIL_BONUS_NEURONS.getKey(), this);
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
            Long l = (Long) obj;
            if (l != null) {
                UiStateDelegate<UiState, Object> uiStateDelegate = ConfirmEmailViewModel.this;
                long longValue = l.longValue();
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, new ConfirmEmailViewModel$3$1$1(longValue), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void resendEmail() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConfirmEmailViewModel$resendEmail$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateDelayUntil() {
        return System.currentTimeMillis() + this.emailConfirmationDelay;
    }

    public final BottomDialogButtonType.Timer getEmailConfirmationTimer() {
        long eventDelayUntil = this.eventDelayStorage.getEventDelayUntil(DelayedEventType.RE_SEND_EMAIL_CONFIRMATION);
        if (eventDelayUntil <= System.currentTimeMillis()) {
            this.eventDelayStorage.clearEventDelay(DelayedEventType.RE_SEND_EMAIL_CONFIRMATION);
            eventDelayUntil = 0;
        }
        if (eventDelayUntil == 0) {
            return new BottomDialogButtonType.Timer(this.emailConfirmationDelay, false);
        }
        return new BottomDialogButtonType.Timer(eventDelayUntil - System.currentTimeMillis(), true);
    }
}
