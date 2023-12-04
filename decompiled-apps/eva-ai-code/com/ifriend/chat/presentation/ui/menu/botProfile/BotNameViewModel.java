package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.R;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotNameViewModel.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J&\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotNameUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;", "validateNameUseCase", "Lcom/ifriend/domain/validation/ValidateNameUseCase;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;Lcom/ifriend/domain/validation/ValidateNameUseCase;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;)V", "isValid", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "name", "", "getName", "savedName", "getSavedName", "()Ljava/lang/String;", "setSavedName", "(Ljava/lang/String;)V", "title", "getTitle", "init", "", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "save", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "setName", "s", "", TtmlNode.START, "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotNameViewModel extends ViewModel {
    public static final int $stable = 8;
    private final ChangeBotNameUseCase changeBotNameUseCase;
    private BotNameFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final MutableLiveData<Boolean> isValid;
    private final MutableLiveData<String> name;
    private final RouterProvider router;
    private String savedName;
    private final MutableLiveData<String> title;
    private final ValidateNameUseCase validateNameUseCase;

    /* compiled from: BotNameViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public BotNameViewModel(GetBotUseCase getBotUseCase, ChangeBotNameUseCase changeBotNameUseCase, ValidateNameUseCase validateNameUseCase, RouterProvider router) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotNameUseCase, "changeBotNameUseCase");
        Intrinsics.checkNotNullParameter(validateNameUseCase, "validateNameUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        this.getBotUseCase = getBotUseCase;
        this.changeBotNameUseCase = changeBotNameUseCase;
        this.validateNameUseCase = validateNameUseCase;
        this.router = router;
        this.title = new MutableLiveData<>();
        this.name = new MutableLiveData<>();
        this.isValid = new MutableLiveData<>(false);
    }

    public final BotNameFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotNameFragment botNameFragment) {
        this.fragment = botNameFragment;
    }

    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final MutableLiveData<String> getName() {
        return this.name;
    }

    public final String getSavedName() {
        return this.savedName;
    }

    public final void setSavedName(String str) {
        this.savedName = str;
    }

    public final MutableLiveData<Boolean> isValid() {
        return this.isValid;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotNameViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        if (bot == null) {
            return;
        }
        String name = bot.getName();
        this.name.setValue(name == null ? "" : name);
        this.savedName = name;
        MutableLiveData<String> mutableLiveData = this.title;
        Gender gender = bot.getGender();
        int i = gender == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        String str = null;
        if (i != -1) {
            if (i == 1) {
                BotNameFragment botNameFragment = this.fragment;
                if (botNameFragment != null) {
                    str = botNameFragment.getString(R.string.his_name);
                }
            } else if (i == 2) {
                BotNameFragment botNameFragment2 = this.fragment;
                if (botNameFragment2 != null) {
                    str = botNameFragment2.getString(R.string.her_name);
                }
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mutableLiveData.setValue(str);
        }
        BotNameFragment botNameFragment3 = this.fragment;
        if (botNameFragment3 != null) {
            str = botNameFragment3.getString(R.string.their_name);
        }
        mutableLiveData.setValue(str);
    }

    public final void setName(CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
        this.name.setValue(s.toString());
        this.isValid.setValue(Boolean.valueOf(!Intrinsics.areEqual(this.name.getValue(), this.savedName) && this.validateNameUseCase.invoke(String.valueOf(this.name.getValue()))));
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isValid.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotNameViewModel$save$1(this, null), 3, null);
    }
}
