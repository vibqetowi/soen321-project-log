package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.R;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotAgeViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\"\u001a\u00020#J\u0012\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)J&\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotAgeUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;", "analyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "validateAgeUseCase", "Lcom/ifriend/domain/validation/ValidateAgeUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;Lcom/ifriend/domain/validation/ValidateAgeUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "age", "Landroidx/lifecycle/MutableLiveData;", "", "getAge", "()Landroidx/lifecycle/MutableLiveData;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotAgeFragment;)V", "isValid", "", "kotlin.jvm.PlatformType", "savedAge", "getSavedAge", "()Ljava/lang/String;", "setSavedAge", "(Ljava/lang/String;)V", "title", "getTitle", "init", "", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "save", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "setAge", "s", "", TtmlNode.START, "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotAgeViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableLiveData<String> age;
    private final AnalyticsEditBotUseCase analyticsEditBotUseCase;
    private final ChangeBotAgeUseCase changeBotAgeUseCase;
    private BotAgeFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final MutableLiveData<Boolean> isValid;
    private final RouterProvider router;
    private String savedAge;
    private final MutableLiveData<String> title;
    private final ValidateAgeUseCase validateAgeUseCase;

    @Inject
    public BotAgeViewModel(GetBotUseCase getBotUseCase, ChangeBotAgeUseCase changeBotAgeUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, ValidateAgeUseCase validateAgeUseCase, RouterProvider router) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotAgeUseCase, "changeBotAgeUseCase");
        Intrinsics.checkNotNullParameter(analyticsEditBotUseCase, "analyticsEditBotUseCase");
        Intrinsics.checkNotNullParameter(validateAgeUseCase, "validateAgeUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        this.getBotUseCase = getBotUseCase;
        this.changeBotAgeUseCase = changeBotAgeUseCase;
        this.analyticsEditBotUseCase = analyticsEditBotUseCase;
        this.validateAgeUseCase = validateAgeUseCase;
        this.router = router;
        this.title = new MutableLiveData<>();
        this.age = new MutableLiveData<>();
        this.isValid = new MutableLiveData<>(false);
    }

    public final BotAgeFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotAgeFragment botAgeFragment) {
        this.fragment = botAgeFragment;
    }

    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final MutableLiveData<String> getAge() {
        return this.age;
    }

    public final String getSavedAge() {
        return this.savedAge;
    }

    public final void setSavedAge(String str) {
        this.savedAge = str;
    }

    public final MutableLiveData<Boolean> isValid() {
        return this.isValid;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotAgeViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        if (bot == null) {
            return;
        }
        Birthday birthday = bot.getBirthday();
        String valueOf = String.valueOf(birthday != null ? Integer.valueOf(birthday.getAge()) : null);
        this.age.setValue(valueOf);
        this.savedAge = valueOf;
        MutableLiveData<String> mutableLiveData = this.title;
        BotAgeFragment botAgeFragment = this.fragment;
        mutableLiveData.setValue(botAgeFragment != null ? botAgeFragment.getString(R.string.what_age_is, bot.getName()) : null);
    }

    public final void setAge(CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotAgeViewModel$setAge$1(this, s, null), 3, null);
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isValid.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotAgeViewModel$save$1(this, null), 3, null);
    }
}
