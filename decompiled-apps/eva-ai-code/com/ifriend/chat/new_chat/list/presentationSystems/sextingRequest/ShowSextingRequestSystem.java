package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.base.di.Feature;
import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.chat.new_chat.ChatCoroutineScopeQualifier;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.State;
import com.ifriend.common_utils.Constants;
import com.ifriend.data.toggle.SextingRequestToggle;
import com.ifriend.data.toggle.SextingRequestToggleKt;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.ui.base.modalMessage.RequestSextingPopupDelegate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ShowSextingRequestSystem.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+BS\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0016J\u0019\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u001cH\u0002J\u0011\u0010'\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0018H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0002H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ShowSextingRequestSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "sextingRequestSextingPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/RequestSextingPopupDelegate;", "userPreferences", "Lcom/ifriend/domain/data/Preferences;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "toggle", "Lcom/ifriend/data/toggle/SextingRequestToggle;", "sextingRequestor", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestor;", "chatHistory", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ChatHistory;", "globalSendingMessageResultPublisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "(Lcom/ifriend/ui/base/modalMessage/RequestSextingPopupDelegate;Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/domain/CoroutineDispatchers;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/data/toggle/SextingRequestToggle;Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestor;Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ChatHistory;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;)V", "atListOneMessageWasSentInThisSession", "", "isBotWasInitiallySetToFlirty", "isSextingRequestWasShown", "onCancel", "", "onClickSure", "onStart", "onStop", "onSuccess", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleDialogShowing", "showDialogIfNeed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "thereAreAnySextingMessagesInChatHistory", "updateSextingHistoryStatus", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Feature
/* loaded from: classes6.dex */
public final class ShowSextingRequestSystem extends CoroutineScopeSystem<EntitiesState> implements SendingMessageResultObserver {
    @Deprecated
    public static final String IS_SEXTING_REQUEST_WAS_SHOWN = "IS_SEXTING_REQUEST_WAS_SHOWN";
    private final AppConfigUseCase appConfigUseCase;
    private boolean atListOneMessageWasSentInThisSession;
    private final ChatHistory chatHistory;
    private final CoroutineDispatchers dispatchers;
    private final GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher;
    private final RequestSextingPopupDelegate sextingRequestSextingPopupDelegate;
    private final SextingRequestor sextingRequestor;
    private final SextingRequestToggle toggle;
    private final Preferences userPreferences;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onError(MessageToSend.SendingResult.Error error) {
        SendingMessageResultObserver.DefaultImpls.onError(this, error);
    }

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ShowSextingRequestSystem(RequestSextingPopupDelegate sextingRequestSextingPopupDelegate, @UserSharedPreferences Preferences userPreferences, CoroutineDispatchers dispatchers, @ChatCoroutineScopeQualifier CoroutineScope coroutineScope, AppConfigUseCase appConfigUseCase, SextingRequestToggle toggle, SextingRequestor sextingRequestor, ChatHistory chatHistory, GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(sextingRequestSextingPopupDelegate, "sextingRequestSextingPopupDelegate");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        Intrinsics.checkNotNullParameter(sextingRequestor, "sextingRequestor");
        Intrinsics.checkNotNullParameter(chatHistory, "chatHistory");
        Intrinsics.checkNotNullParameter(globalSendingMessageResultPublisher, "globalSendingMessageResultPublisher");
        this.sextingRequestSextingPopupDelegate = sextingRequestSextingPopupDelegate;
        this.userPreferences = userPreferences;
        this.dispatchers = dispatchers;
        this.appConfigUseCase = appConfigUseCase;
        this.toggle = toggle;
        this.sextingRequestor = sextingRequestor;
        this.chatHistory = chatHistory;
        this.globalSendingMessageResultPublisher = globalSendingMessageResultPublisher;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        this.sextingRequestSextingPopupDelegate.setOnResultListeners(new ShowSextingRequestSystem$onStart$1(this), new ShowSextingRequestSystem$onStart$2(this));
        this.globalSendingMessageResultPublisher.addObserver(this);
    }

    @Override // com.ifriend.common_entities_engine.CoroutineScopeSystem, com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        this.globalSendingMessageResultPublisher.removeObserver(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onSuccess(MessageToSend.SendingResult.Success result) {
        Intrinsics.checkNotNullParameter(result, "result");
        SendingMessageResultObserver.DefaultImpls.onSuccess(this, result);
        this.chatHistory.incrementCountOfUserMessages();
        this.atListOneMessageWasSentInThisSession = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel() {
        SextingRequestAnalytics.INSTANCE.clickNotReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickSure() {
        BuildersKt__Builders_commonKt.launch$default(this, this.dispatchers.getIO(), null, new ShowSextingRequestSystem$onClickSure$1(this, null), 2, null);
        SextingRequestAnalytics.INSTANCE.clickSure();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[PHI: r7 
      PHI: (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0062, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        ShowSextingRequestSystem$onUpdateState$1 showSextingRequestSystem$onUpdateState$1;
        int i;
        ShowSextingRequestSystem showSextingRequestSystem;
        if (continuation instanceof ShowSextingRequestSystem$onUpdateState$1) {
            showSextingRequestSystem$onUpdateState$1 = (ShowSextingRequestSystem$onUpdateState$1) continuation;
            if ((showSextingRequestSystem$onUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                showSextingRequestSystem$onUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj = showSextingRequestSystem$onUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showSextingRequestSystem$onUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    updateSextingHistoryStatus(entitiesState);
                    showSextingRequestSystem$onUpdateState$1.L$0 = this;
                    showSextingRequestSystem$onUpdateState$1.L$1 = entitiesState;
                    showSextingRequestSystem$onUpdateState$1.label = 1;
                    if (showDialogIfNeed(showSextingRequestSystem$onUpdateState$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showSextingRequestSystem = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    entitiesState = (EntitiesState) showSextingRequestSystem$onUpdateState$1.L$1;
                    showSextingRequestSystem = (ShowSextingRequestSystem) showSextingRequestSystem$onUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                showSextingRequestSystem$onUpdateState$1.L$0 = null;
                showSextingRequestSystem$onUpdateState$1.L$1 = null;
                showSextingRequestSystem$onUpdateState$1.label = 2;
                obj = super.onUpdateState((ShowSextingRequestSystem) entitiesState, (Continuation<? super ShowSextingRequestSystem>) showSextingRequestSystem$onUpdateState$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        showSextingRequestSystem$onUpdateState$1 = new ShowSextingRequestSystem$onUpdateState$1(this, continuation);
        Object obj2 = showSextingRequestSystem$onUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showSextingRequestSystem$onUpdateState$1.label;
        if (i != 0) {
        }
        showSextingRequestSystem$onUpdateState$1.L$0 = null;
        showSextingRequestSystem$onUpdateState$1.L$1 = null;
        showSextingRequestSystem$onUpdateState$1.label = 2;
        obj2 = super.onUpdateState((ShowSextingRequestSystem) entitiesState, (Continuation<? super ShowSextingRequestSystem>) showSextingRequestSystem$onUpdateState$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    private final void updateSextingHistoryStatus(EntitiesState entitiesState) {
        List<ChatMessage> messages = ChatClientKt.getMessages(entitiesState);
        boolean z = false;
        if (!(messages instanceof Collection) || !messages.isEmpty()) {
            Iterator<T> it = messages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ChatMessage) it.next()).getInfo().isSexting()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.chatHistory.saveSextingMessagePresent(true);
        }
    }

    private final boolean thereAreAnySextingMessagesInChatHistory() {
        return this.chatHistory.isSextingMessagePresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showDialogIfNeed(Continuation<? super Unit> continuation) {
        ShowSextingRequestSystem$showDialogIfNeed$1 showSextingRequestSystem$showDialogIfNeed$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        ShowSextingRequestSystem showSextingRequestSystem;
        int countOfUserMessages;
        Object longValue;
        boolean z;
        Long l;
        int i2;
        ShowSextingRequestSystem showSextingRequestSystem2;
        boolean z2;
        int i3;
        Long l2;
        if (continuation instanceof ShowSextingRequestSystem$showDialogIfNeed$1) {
            showSextingRequestSystem$showDialogIfNeed$1 = (ShowSextingRequestSystem$showDialogIfNeed$1) continuation;
            if ((showSextingRequestSystem$showDialogIfNeed$1.label & Integer.MIN_VALUE) != 0) {
                showSextingRequestSystem$showDialogIfNeed$1.label -= Integer.MIN_VALUE;
                obj = showSextingRequestSystem$showDialogIfNeed$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showSextingRequestSystem$showDialogIfNeed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SextingRequestToggle sextingRequestToggle = this.toggle;
                    showSextingRequestSystem$showDialogIfNeed$1.L$0 = this;
                    showSextingRequestSystem$showDialogIfNeed$1.label = 1;
                    obj = sextingRequestToggle.isEnabled(showSextingRequestSystem$showDialogIfNeed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showSextingRequestSystem = this;
                } else if (i == 1) {
                    showSextingRequestSystem = (ShowSextingRequestSystem) showSextingRequestSystem$showDialogIfNeed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i != 2) {
                    if (i == 3) {
                        i2 = showSextingRequestSystem$showDialogIfNeed$1.I$1;
                        i3 = showSextingRequestSystem$showDialogIfNeed$1.I$0;
                        z2 = showSextingRequestSystem$showDialogIfNeed$1.Z$0;
                        showSextingRequestSystem2 = (ShowSextingRequestSystem) showSextingRequestSystem$showDialogIfNeed$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        l2 = (Long) obj;
                        if (l2 != null) {
                            return Unit.INSTANCE;
                        }
                        int longValue2 = (int) l2.longValue();
                        if (z2 && i3 >= i2) {
                            showSextingRequestSystem2.scheduleDialogShowing();
                        } else if (!z2 && i3 >= longValue2) {
                            showSextingRequestSystem2.scheduleDialogShowing();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i4 = showSextingRequestSystem$showDialogIfNeed$1.I$0;
                    z = showSextingRequestSystem$showDialogIfNeed$1.Z$0;
                    ShowSextingRequestSystem showSextingRequestSystem3 = (ShowSextingRequestSystem) showSextingRequestSystem$showDialogIfNeed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    countOfUserMessages = i4;
                    showSextingRequestSystem = showSextingRequestSystem3;
                    l = (Long) obj;
                    if (l != null) {
                        return Unit.INSTANCE;
                    }
                    int longValue3 = (int) l.longValue();
                    AppConfigUseCase appConfigUseCase = showSextingRequestSystem.appConfigUseCase;
                    showSextingRequestSystem$showDialogIfNeed$1.L$0 = showSextingRequestSystem;
                    showSextingRequestSystem$showDialogIfNeed$1.Z$0 = z;
                    showSextingRequestSystem$showDialogIfNeed$1.I$0 = countOfUserMessages;
                    showSextingRequestSystem$showDialogIfNeed$1.I$1 = longValue3;
                    showSextingRequestSystem$showDialogIfNeed$1.label = 3;
                    Object longValue4 = appConfigUseCase.getLongValue(SextingRequestToggleKt.MESSAGES_FROM_USER_TO_SHOW_SEXTING_REQUEST_FRIENDLY, showSextingRequestSystem$showDialogIfNeed$1);
                    if (longValue4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = longValue3;
                    obj = longValue4;
                    showSextingRequestSystem2 = showSextingRequestSystem;
                    z2 = z;
                    i3 = countOfUserMessages;
                    l2 = (Long) obj;
                    if (l2 != null) {
                    }
                }
                if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue() && !showSextingRequestSystem.isSextingRequestWasShown()) {
                    if (!showSextingRequestSystem.thereAreAnySextingMessagesInChatHistory() && showSextingRequestSystem.atListOneMessageWasSentInThisSession) {
                        return Unit.INSTANCE;
                    }
                    boolean isBotWasInitiallySetToFlirty = showSextingRequestSystem.isBotWasInitiallySetToFlirty();
                    countOfUserMessages = showSextingRequestSystem.chatHistory.getCountOfUserMessages();
                    AppConfigUseCase appConfigUseCase2 = showSextingRequestSystem.appConfigUseCase;
                    showSextingRequestSystem$showDialogIfNeed$1.L$0 = showSextingRequestSystem;
                    showSextingRequestSystem$showDialogIfNeed$1.Z$0 = isBotWasInitiallySetToFlirty;
                    showSextingRequestSystem$showDialogIfNeed$1.I$0 = countOfUserMessages;
                    showSextingRequestSystem$showDialogIfNeed$1.label = 2;
                    longValue = appConfigUseCase2.getLongValue(SextingRequestToggleKt.MESSAGES_FROM_USER_TO_SHOW_SEXTING_REQUEST_FLIRTY, showSextingRequestSystem$showDialogIfNeed$1);
                    if (longValue != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = isBotWasInitiallySetToFlirty;
                    obj = longValue;
                    l = (Long) obj;
                    if (l != null) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        showSextingRequestSystem$showDialogIfNeed$1 = new ShowSextingRequestSystem$showDialogIfNeed$1(this, continuation);
        obj = showSextingRequestSystem$showDialogIfNeed$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showSextingRequestSystem$showDialogIfNeed$1.label;
        if (i != 0) {
        }
        if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
            return Unit.INSTANCE;
        }
        if (!showSextingRequestSystem.thereAreAnySextingMessagesInChatHistory()) {
        }
        boolean isBotWasInitiallySetToFlirty2 = showSextingRequestSystem.isBotWasInitiallySetToFlirty();
        countOfUserMessages = showSextingRequestSystem.chatHistory.getCountOfUserMessages();
        AppConfigUseCase appConfigUseCase22 = showSextingRequestSystem.appConfigUseCase;
        showSextingRequestSystem$showDialogIfNeed$1.L$0 = showSextingRequestSystem;
        showSextingRequestSystem$showDialogIfNeed$1.Z$0 = isBotWasInitiallySetToFlirty2;
        showSextingRequestSystem$showDialogIfNeed$1.I$0 = countOfUserMessages;
        showSextingRequestSystem$showDialogIfNeed$1.label = 2;
        longValue = appConfigUseCase22.getLongValue(SextingRequestToggleKt.MESSAGES_FROM_USER_TO_SHOW_SEXTING_REQUEST_FLIRTY, showSextingRequestSystem$showDialogIfNeed$1);
        if (longValue != coroutine_suspended) {
        }
    }

    private final void scheduleDialogShowing() {
        BuildersKt__Builders_commonKt.launch$default(this, this.dispatchers.getIO(), null, new ShowSextingRequestSystem$scheduleDialogShowing$1(this, null), 2, null);
    }

    private final boolean isSextingRequestWasShown() {
        return this.userPreferences.getBooleanWithKey(IS_SEXTING_REQUEST_WAS_SHOWN, false);
    }

    private final boolean isBotWasInitiallySetToFlirty() {
        String stringWithKey = this.userPreferences.getStringWithKey(Constants.BOT_INITIAL_PERSONALITY);
        if (stringWithKey == null) {
            stringWithKey = Personality.FLIRTY.name();
        }
        return Intrinsics.areEqual(stringWithKey, Personality.FLIRTY.name());
    }

    /* compiled from: ShowSextingRequestSystem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ShowSextingRequestSystem$Companion;", "", "()V", ShowSextingRequestSystem.IS_SEXTING_REQUEST_WAS_SHOWN, "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
