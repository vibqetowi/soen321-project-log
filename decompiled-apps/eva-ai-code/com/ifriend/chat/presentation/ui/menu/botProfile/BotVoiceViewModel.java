package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.BotVoice;
import com.ifriend.domain.models.profile.bot.BotVoiceConfig;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BotVoiceViewModel.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0012\u00101\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u00020/H\u0014J\b\u00105\u001a\u00020/H\u0002J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208J\u0019\u00109\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceViewModel;", "Landroidx/lifecycle/ViewModel;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotVoiceUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotVoiceUseCase;", "analyticsEditBotUseCase", "Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "userTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotVoiceUseCase;Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/storage/token/UserTokenProvider;Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "availableVoices", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ifriend/domain/models/profile/bot/BotVoice;", "getAvailableVoices", "()Landroidx/lifecycle/MutableLiveData;", "currentVoiceId", "", "getCurrentVoiceId", "fadeOutTimer", "Landroid/os/CountDownTimer;", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;)V", "isEdited", "", "kotlin.jvm.PlatformType", "previewMediaPlayer", "Landroid/media/MediaPlayer;", "savedVoiceId", "getSavedVoiceId", "()Ljava/lang/String;", "setSavedVoiceId", "(Ljava/lang/String;)V", "cancelSounds", "", "init", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "onCleared", "onClose", "onVoiceClick", "id", "", "previewSound", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotVoiceViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AnalyticsEditBotUseCase analyticsEditBotUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final AudioPlayer audioPlayer;
    private final MutableLiveData<List<BotVoice>> availableVoices;
    private final ChangeBotVoiceUseCase changeBotVoiceUseCase;
    private final MutableLiveData<String> currentVoiceId;
    private CountDownTimer fadeOutTimer;
    private BotVoiceFragment fragment;
    private final GetBotUseCase getBotUseCase;
    private final MutableLiveData<Boolean> isEdited;
    private MediaPlayer previewMediaPlayer;
    private final RouterProvider router;
    private String savedVoiceId;
    private final UserRepository userRepository;
    private final UserTokenProvider userTokenProvider;

    @Inject
    public BotVoiceViewModel(GetBotUseCase getBotUseCase, ChangeBotVoiceUseCase changeBotVoiceUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, UserRepository userRepository, UserTokenProvider userTokenProvider, AudioPlayer audioPlayer, RouterProvider router, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotVoiceUseCase, "changeBotVoiceUseCase");
        Intrinsics.checkNotNullParameter(analyticsEditBotUseCase, "analyticsEditBotUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userTokenProvider, "userTokenProvider");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.getBotUseCase = getBotUseCase;
        this.changeBotVoiceUseCase = changeBotVoiceUseCase;
        this.analyticsEditBotUseCase = analyticsEditBotUseCase;
        this.userRepository = userRepository;
        this.userTokenProvider = userTokenProvider;
        this.audioPlayer = audioPlayer;
        this.router = router;
        this.appEventsEmitter = appEventsEmitter;
        this.currentVoiceId = new MutableLiveData<>();
        this.availableVoices = new MutableLiveData<>();
        this.isEdited = new MutableLiveData<>(false);
        this.previewMediaPlayer = new MediaPlayer();
    }

    public final BotVoiceFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(BotVoiceFragment botVoiceFragment) {
        this.fragment = botVoiceFragment;
    }

    public final MutableLiveData<String> getCurrentVoiceId() {
        return this.currentVoiceId;
    }

    public final String getSavedVoiceId() {
        return this.savedVoiceId;
    }

    public final void setSavedVoiceId(String str) {
        this.savedVoiceId = str;
    }

    public final MutableLiveData<List<BotVoice>> getAvailableVoices() {
        return this.availableVoices;
    }

    public final MutableLiveData<Boolean> isEdited() {
        return this.isEdited;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotVoiceViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        Unit unit;
        if (bot == null) {
            return;
        }
        BotVoiceConfig voiceConfig = bot.getVoiceConfig();
        if (voiceConfig != null) {
            this.availableVoices.setValue(bot.getAvailableVoices());
            this.savedVoiceId = voiceConfig.getCurrentSpeakerId();
            this.currentVoiceId.setValue(voiceConfig.getCurrentSpeakerId());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.router.getRoute().exit();
        }
    }

    public final void onVoiceClick(int i) {
        BotVoice botVoice;
        String str = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotVoiceViewModel$onVoiceClick$1(this, i, null), 3, null);
        MutableLiveData<String> mutableLiveData = this.currentVoiceId;
        List<BotVoice> value = this.availableVoices.getValue();
        if (value != null && (botVoice = value.get(i)) != null) {
            str = botVoice.getId();
        }
        mutableLiveData.setValue(str);
        this.isEdited.setValue(Boolean.valueOf(!Intrinsics.areEqual(this.currentVoiceId.getValue(), this.savedVoiceId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object previewSound(int i, Continuation<? super Unit> continuation) {
        BotVoiceViewModel$previewSound$1 botVoiceViewModel$previewSound$1;
        int i2;
        Context context;
        String voicePreviewUrl;
        Pair[] pairArr;
        final BotVoiceViewModel botVoiceViewModel;
        String str;
        Pair[] pairArr2;
        int i3;
        BotVoice botVoice;
        if (continuation instanceof BotVoiceViewModel$previewSound$1) {
            botVoiceViewModel$previewSound$1 = (BotVoiceViewModel$previewSound$1) continuation;
            if ((botVoiceViewModel$previewSound$1.label & Integer.MIN_VALUE) != 0) {
                botVoiceViewModel$previewSound$1.label -= Integer.MIN_VALUE;
                Object obj = botVoiceViewModel$previewSound$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = botVoiceViewModel$previewSound$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    BotVoiceFragment botVoiceFragment = this.fragment;
                    if (botVoiceFragment == null || (context = botVoiceFragment.getContext()) == null) {
                        return Unit.INSTANCE;
                    }
                    List<BotVoice> value = this.availableVoices.getValue();
                    String id = (value == null || (botVoice = value.get(i)) == null) ? null : botVoice.getId();
                    BotVoiceFragment botVoiceFragment2 = this.fragment;
                    voicePreviewUrl = BotVoiceViewModelKt.toVoicePreviewUrl(id, botVoiceFragment2 != null ? botVoiceFragment2.getContext() : null);
                    if (voicePreviewUrl == null) {
                        return Unit.INSTANCE;
                    }
                    pairArr = new Pair[1];
                    UserTokenProvider userTokenProvider = this.userTokenProvider;
                    botVoiceViewModel$previewSound$1.L$0 = this;
                    botVoiceViewModel$previewSound$1.L$1 = context;
                    botVoiceViewModel$previewSound$1.L$2 = voicePreviewUrl;
                    botVoiceViewModel$previewSound$1.L$3 = pairArr;
                    botVoiceViewModel$previewSound$1.L$4 = pairArr;
                    botVoiceViewModel$previewSound$1.L$5 = "Authorization";
                    botVoiceViewModel$previewSound$1.I$0 = 0;
                    botVoiceViewModel$previewSound$1.label = 1;
                    Object current = UserTokenStorageKt.current(userTokenProvider, botVoiceViewModel$previewSound$1);
                    if (current == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    botVoiceViewModel = this;
                    str = "Authorization";
                    pairArr2 = pairArr;
                    obj = current;
                    i3 = 0;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i3 = botVoiceViewModel$previewSound$1.I$0;
                    str = (String) botVoiceViewModel$previewSound$1.L$5;
                    pairArr = (Pair[]) botVoiceViewModel$previewSound$1.L$4;
                    pairArr2 = (Pair[]) botVoiceViewModel$previewSound$1.L$3;
                    voicePreviewUrl = (String) botVoiceViewModel$previewSound$1.L$2;
                    context = (Context) botVoiceViewModel$previewSound$1.L$1;
                    botVoiceViewModel = (BotVoiceViewModel) botVoiceViewModel$previewSound$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr[i3] = TuplesKt.to(str, ((UserToken) obj).formatted());
                HashMap hashMapOf = MapsKt.hashMapOf(pairArr2);
                botVoiceViewModel.previewMediaPlayer.reset();
                botVoiceViewModel.previewMediaPlayer.setDataSource(context, Uri.parse(voicePreviewUrl), hashMapOf);
                botVoiceViewModel.previewMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel$$ExternalSyntheticLambda0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        BotVoiceViewModel.previewSound$lambda$1(BotVoiceViewModel.this, mediaPlayer);
                    }
                });
                botVoiceViewModel.previewMediaPlayer.prepareAsync();
                return Unit.INSTANCE;
            }
        }
        botVoiceViewModel$previewSound$1 = new BotVoiceViewModel$previewSound$1(this, continuation);
        Object obj2 = botVoiceViewModel$previewSound$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = botVoiceViewModel$previewSound$1.label;
        if (i2 != 0) {
        }
        pairArr[i3] = TuplesKt.to(str, ((UserToken) obj2).formatted());
        HashMap hashMapOf2 = MapsKt.hashMapOf(pairArr2);
        botVoiceViewModel.previewMediaPlayer.reset();
        botVoiceViewModel.previewMediaPlayer.setDataSource(context, Uri.parse(voicePreviewUrl), hashMapOf2);
        botVoiceViewModel.previewMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                BotVoiceViewModel.previewSound$lambda$1(BotVoiceViewModel.this, mediaPlayer);
            }
        });
        botVoiceViewModel.previewMediaPlayer.prepareAsync();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewSound$lambda$1(BotVoiceViewModel this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.previewMediaPlayer.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        onClose();
    }

    private final void onClose() {
        MediaPlayer mediaPlayer = this.previewMediaPlayer;
        try {
            mediaPlayer.stop();
            mediaPlayer.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (com.ifriend.domain.models.profile.user.UserKt.isPremium(r8) == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void save(View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        User currentUser = this.userRepository.getCurrentUser();
        if (currentUser != null) {
            z = true;
        }
        z = false;
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotVoiceViewModel$save$2(this, null), 3, null);
            return;
        }
        this.isEdited.setValue(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotVoiceViewModel$save$1(this, null), 3, null);
    }

    public final void cancelSounds() {
        try {
            this.previewMediaPlayer.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
