package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
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
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.useCases.bot.ChangeBotEthnicityUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotEthnicityViewModel.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0006\u0010-\u001a\u00020)J\u000e\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0012\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u000e\u00102\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\rH\u0002J\u000e\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001aR\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u00067"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotEthnicityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotEthnicityUseCase;", "analyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotEthnicityUseCase;Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "currentEthnicity", "Landroidx/databinding/ObservableField;", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "getCurrentEthnicity", "()Landroidx/databinding/ObservableField;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;)V", "isAsian", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isBlack", "isEdited", "isLatino", "isOther", "isWhite", "savedEthnicity", "getSavedEthnicity", "()Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "setSavedEthnicity", "(Lcom/ifriend/domain/models/profile/bot/Ethnicity;)V", "title", "", "getTitle", "asianClick", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "blackClick", "init", "latinoClick", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "otherClick", "save", "setEthnicity", "ethnicity", "whiteClick", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotEthnicityViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AnalyticsEditBotUseCase analyticsEditBotUseCase;
    private final ChangeBotEthnicityUseCase changeBotEthnicityUseCase;
    private final ObservableField<Ethnicity> currentEthnicity;
    private BotEthnicityFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final MutableLiveData<Boolean> isAsian;
    private final MutableLiveData<Boolean> isBlack;
    private final MutableLiveData<Boolean> isEdited;
    private final MutableLiveData<Boolean> isLatino;
    private final MutableLiveData<Boolean> isOther;
    private final MutableLiveData<Boolean> isWhite;
    private final RouterProvider router;
    private Ethnicity savedEthnicity;
    private final MutableLiveData<String> title;

    @Inject
    public BotEthnicityViewModel(GetBotUseCase getBotUseCase, ChangeBotEthnicityUseCase changeBotEthnicityUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, RouterProvider router) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotEthnicityUseCase, "changeBotEthnicityUseCase");
        Intrinsics.checkNotNullParameter(analyticsEditBotUseCase, "analyticsEditBotUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        this.getBotUseCase = getBotUseCase;
        this.changeBotEthnicityUseCase = changeBotEthnicityUseCase;
        this.analyticsEditBotUseCase = analyticsEditBotUseCase;
        this.router = router;
        this.title = new MutableLiveData<>();
        this.isEdited = new MutableLiveData<>(false);
        ObservableField<Ethnicity> observableField = new ObservableField<>();
        this.currentEthnicity = observableField;
        this.isAsian = new MutableLiveData<>(false);
        this.isWhite = new MutableLiveData<>(false);
        this.isLatino = new MutableLiveData<>(false);
        this.isBlack = new MutableLiveData<>(false);
        this.isOther = new MutableLiveData<>(false);
        observableField.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(Observable observable, int i) {
                Ethnicity ethnicity = BotEthnicityViewModel.this.getCurrentEthnicity().get();
                if (ethnicity != null) {
                    BotEthnicityViewModel.this.setEthnicity(ethnicity);
                }
                BotEthnicityViewModel.this.isEdited().setValue(Boolean.valueOf((BotEthnicityViewModel.this.getCurrentEthnicity().get() == BotEthnicityViewModel.this.getSavedEthnicity() || BotEthnicityViewModel.this.getSavedEthnicity() == null) ? false : true));
            }
        });
    }

    public final BotEthnicityFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotEthnicityFragment botEthnicityFragment) {
        this.fragment = botEthnicityFragment;
    }

    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final MutableLiveData<Boolean> isEdited() {
        return this.isEdited;
    }

    public final ObservableField<Ethnicity> getCurrentEthnicity() {
        return this.currentEthnicity;
    }

    public final Ethnicity getSavedEthnicity() {
        return this.savedEthnicity;
    }

    public final void setSavedEthnicity(Ethnicity ethnicity) {
        this.savedEthnicity = ethnicity;
    }

    public final MutableLiveData<Boolean> isAsian() {
        return this.isAsian;
    }

    public final MutableLiveData<Boolean> isWhite() {
        return this.isWhite;
    }

    public final MutableLiveData<Boolean> isLatino() {
        return this.isLatino;
    }

    public final MutableLiveData<Boolean> isBlack() {
        return this.isBlack;
    }

    public final MutableLiveData<Boolean> isOther() {
        return this.isOther;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotEthnicityViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        Context context;
        if (bot == null) {
            return;
        }
        Ethnicity ethnicity = bot.getEthnicity();
        this.currentEthnicity.set(ethnicity);
        this.savedEthnicity = ethnicity;
        String name = bot.getName();
        MutableLiveData<String> mutableLiveData = this.title;
        BotEthnicityFragment botEthnicityFragment = this.fragment;
        mutableLiveData.setValue((botEthnicityFragment == null || (context = botEthnicityFragment.getContext()) == null) ? null : context.getString(R.string.bot_ethnicity, name));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEthnicity(Ethnicity ethnicity) {
        this.isAsian.setValue(Boolean.valueOf(ethnicity == Ethnicity.ASIAN));
        this.isWhite.setValue(Boolean.valueOf(ethnicity == Ethnicity.WHITE));
        this.isLatino.setValue(Boolean.valueOf(ethnicity == Ethnicity.LATINO));
        this.isBlack.setValue(Boolean.valueOf(ethnicity == Ethnicity.BLACK));
        this.isOther.setValue(Boolean.valueOf(ethnicity == Ethnicity.OTHER));
    }

    public final void asianClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentEthnicity.set(Ethnicity.ASIAN);
    }

    public final void whiteClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentEthnicity.set(Ethnicity.WHITE);
    }

    public final void latinoClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentEthnicity.set(Ethnicity.LATINO);
    }

    public final void blackClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentEthnicity.set(Ethnicity.BLACK);
    }

    public final void otherClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentEthnicity.set(Ethnicity.OTHER);
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isEdited.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotEthnicityViewModel$save$1(this, null), 3, null);
    }
}
