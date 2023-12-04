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
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotGenderViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u000e\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0012\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u000e\u00103\u001a\u00020*2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010 R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001f\u0010#\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00064"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotGenderUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;", "analyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/data/BotRepository;)V", "currentGender", "Landroidx/databinding/ObservableField;", "Lcom/ifriend/domain/models/profile/Gender;", "getCurrentGender", "()Landroidx/databinding/ObservableField;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotGenderFragment;)V", "isEdited", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isFemale", "isMale", "isNonBinary", "savedGender", "getSavedGender", "()Lcom/ifriend/domain/models/profile/Gender;", "setSavedGender", "(Lcom/ifriend/domain/models/profile/Gender;)V", "femaleClick", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "init", "maleClick", "nonBinaryClick", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotGenderViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AnalyticsEditBotUseCase analyticsEditBotUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final BotRepository botRepository;
    private final ChangeBotGenderUseCase changeBotGenderUseCase;
    private final ObservableField<Gender> currentGender;
    private BotGenderFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final InternalNotificationHandler internalNotificationHandler;
    private final MutableLiveData<Boolean> isEdited;
    private final MutableLiveData<Boolean> isFemale;
    private final MutableLiveData<Boolean> isMale;
    private final MutableLiveData<Boolean> isNonBinary;
    private final RouterProvider router;
    private Gender savedGender;

    @Inject
    public BotGenderViewModel(GetBotUseCase getBotUseCase, ChangeBotGenderUseCase changeBotGenderUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, InternalNotificationHandler internalNotificationHandler, RouterProvider router, AppEventsEmitter appEventsEmitter, BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotGenderUseCase, "changeBotGenderUseCase");
        Intrinsics.checkNotNullParameter(analyticsEditBotUseCase, "analyticsEditBotUseCase");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.getBotUseCase = getBotUseCase;
        this.changeBotGenderUseCase = changeBotGenderUseCase;
        this.analyticsEditBotUseCase = analyticsEditBotUseCase;
        this.internalNotificationHandler = internalNotificationHandler;
        this.router = router;
        this.appEventsEmitter = appEventsEmitter;
        this.botRepository = botRepository;
        ObservableField<Gender> observableField = new ObservableField<>();
        this.currentGender = observableField;
        this.isMale = new MutableLiveData<>(false);
        this.isFemale = new MutableLiveData<>(false);
        this.isNonBinary = new MutableLiveData<>(false);
        this.isEdited = new MutableLiveData<>(false);
        observableField.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel.1

            /* compiled from: BotGenderViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel$1$WhenMappings */
            /* loaded from: classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Gender.values().length];
                    try {
                        iArr[Gender.MALE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Gender.FEMALE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Gender.NON_BINARY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(Observable observable, int i) {
                Gender gender = BotGenderViewModel.this.getCurrentGender().get();
                int i2 = gender == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
                boolean z = true;
                if (i2 == 1) {
                    BotGenderViewModel.this.isMale().setValue(true);
                    BotGenderViewModel.this.isFemale().setValue(false);
                    BotGenderViewModel.this.isNonBinary().setValue(false);
                } else if (i2 == 2) {
                    BotGenderViewModel.this.isMale().setValue(false);
                    BotGenderViewModel.this.isFemale().setValue(true);
                    BotGenderViewModel.this.isNonBinary().setValue(false);
                } else if (i2 == 3) {
                    BotGenderViewModel.this.isMale().setValue(false);
                    BotGenderViewModel.this.isFemale().setValue(false);
                    BotGenderViewModel.this.isNonBinary().setValue(true);
                }
                MutableLiveData<Boolean> isEdited = BotGenderViewModel.this.isEdited();
                if (BotGenderViewModel.this.getCurrentGender().get() == BotGenderViewModel.this.getSavedGender() || BotGenderViewModel.this.getSavedGender() == null) {
                    z = false;
                }
                isEdited.setValue(Boolean.valueOf(z));
            }
        });
    }

    public final BotGenderFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotGenderFragment botGenderFragment) {
        this.fragment = botGenderFragment;
    }

    public final ObservableField<Gender> getCurrentGender() {
        return this.currentGender;
    }

    public final Gender getSavedGender() {
        return this.savedGender;
    }

    public final void setSavedGender(Gender gender) {
        this.savedGender = gender;
    }

    public final MutableLiveData<Boolean> isMale() {
        return this.isMale;
    }

    public final MutableLiveData<Boolean> isFemale() {
        return this.isFemale;
    }

    public final MutableLiveData<Boolean> isNonBinary() {
        return this.isNonBinary;
    }

    public final MutableLiveData<Boolean> isEdited() {
        return this.isEdited;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotGenderViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        if (bot == null) {
            return;
        }
        Gender gender = bot.getGender();
        if (gender == null) {
            gender = Gender.FEMALE;
        }
        this.currentGender.set(gender);
        this.savedGender = gender;
    }

    public final void maleClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentGender.set(Gender.MALE);
    }

    public final void nonBinaryClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentGender.set(Gender.NON_BINARY);
    }

    public final void femaleClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentGender.set(Gender.FEMALE);
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isEdited.setValue(false);
        CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(this), new BotGenderViewModel$save$1(this), new BotGenderViewModel$save$2(this, null));
    }
}
