package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.view.View;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.R;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotPersonalityViewModel.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0006\u0010,\u001a\u00020(J\u0012\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u000e\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001cR\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u00061"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotPersonalityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotPersonalityUseCase;", "analyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotPersonalityUseCase;Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "currentPersonality", "Landroidx/databinding/ObservableField;", "Lcom/ifriend/domain/models/profile/bot/Personality;", "getCurrentPersonality", "()Landroidx/databinding/ObservableField;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;)V", "isEdited", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isFlirty", "isFriendly", "savedPersonality", "getSavedPersonality", "()Lcom/ifriend/domain/models/profile/bot/Personality;", "setSavedPersonality", "(Lcom/ifriend/domain/models/profile/bot/Personality;)V", "title", "", "getTitle", "flirtyClick", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "friendlyClick", "init", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotPersonalityViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AnalyticsEditBotUseCase analyticsEditBotUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final ChangeBotPersonalityUseCase changeBotPersonalityUseCase;
    private final ObservableField<Personality> currentPersonality;
    private BotPersonalityFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final MutableLiveData<Boolean> isEdited;
    private final MutableLiveData<Boolean> isFlirty;
    private final MutableLiveData<Boolean> isFriendly;
    private final RouterProvider router;
    private Personality savedPersonality;
    private final MutableLiveData<String> title;

    @Inject
    public BotPersonalityViewModel(GetBotUseCase getBotUseCase, ChangeBotPersonalityUseCase changeBotPersonalityUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, RouterProvider router, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotPersonalityUseCase, "changeBotPersonalityUseCase");
        Intrinsics.checkNotNullParameter(analyticsEditBotUseCase, "analyticsEditBotUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.getBotUseCase = getBotUseCase;
        this.changeBotPersonalityUseCase = changeBotPersonalityUseCase;
        this.analyticsEditBotUseCase = analyticsEditBotUseCase;
        this.router = router;
        this.appEventsEmitter = appEventsEmitter;
        ObservableField<Personality> observableField = new ObservableField<>();
        this.currentPersonality = observableField;
        this.title = new MutableLiveData<>();
        this.isFlirty = new MutableLiveData<>(false);
        this.isFriendly = new MutableLiveData<>(false);
        this.isEdited = new MutableLiveData<>(false);
        observableField.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel.1

            /* compiled from: BotPersonalityViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel$1$WhenMappings */
            /* loaded from: classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Personality.values().length];
                    try {
                        iArr[Personality.FLIRTY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Personality.FRIENDLY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(Observable observable, int i) {
                Personality personality = BotPersonalityViewModel.this.getCurrentPersonality().get();
                int i2 = personality == null ? -1 : WhenMappings.$EnumSwitchMapping$0[personality.ordinal()];
                boolean z = false;
                if (i2 == 1) {
                    BotPersonalityViewModel.this.isFlirty().setValue(true);
                    BotPersonalityViewModel.this.isFriendly().setValue(false);
                } else if (i2 == 2) {
                    BotPersonalityViewModel.this.isFlirty().setValue(false);
                    BotPersonalityViewModel.this.isFriendly().setValue(true);
                }
                MutableLiveData<Boolean> isEdited = BotPersonalityViewModel.this.isEdited();
                if (BotPersonalityViewModel.this.getCurrentPersonality().get() != BotPersonalityViewModel.this.getSavedPersonality() && BotPersonalityViewModel.this.getSavedPersonality() != null) {
                    z = true;
                }
                isEdited.setValue(Boolean.valueOf(z));
            }
        });
    }

    public final BotPersonalityFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotPersonalityFragment botPersonalityFragment) {
        this.fragment = botPersonalityFragment;
    }

    public final ObservableField<Personality> getCurrentPersonality() {
        return this.currentPersonality;
    }

    public final Personality getSavedPersonality() {
        return this.savedPersonality;
    }

    public final void setSavedPersonality(Personality personality) {
        this.savedPersonality = personality;
    }

    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final MutableLiveData<Boolean> isFlirty() {
        return this.isFlirty;
    }

    public final MutableLiveData<Boolean> isFriendly() {
        return this.isFriendly;
    }

    public final MutableLiveData<Boolean> isEdited() {
        return this.isEdited;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotPersonalityViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        if (bot == null) {
            return;
        }
        MutableLiveData<String> mutableLiveData = this.title;
        BotPersonalityFragment botPersonalityFragment = this.fragment;
        mutableLiveData.setValue(botPersonalityFragment != null ? botPersonalityFragment.getString(R.string.bot_personality, bot.getName()) : null);
        Personality personality = bot.getPersonality();
        if (personality == null) {
            personality = Personality.FRIENDLY;
        }
        this.savedPersonality = personality;
        this.currentPersonality.set(personality);
    }

    public final void flirtyClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentPersonality.set(Personality.FLIRTY);
    }

    public final void friendlyClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentPersonality.set(Personality.FRIENDLY);
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isEdited.setValue(false);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new BotPersonalityViewModel$save$1(this, null), 3, null);
    }
}
