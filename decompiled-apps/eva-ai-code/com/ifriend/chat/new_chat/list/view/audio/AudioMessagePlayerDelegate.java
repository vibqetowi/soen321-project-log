package com.ifriend.chat.new_chat.list.view.audio;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
import com.ifriend.ui.utils.ViewCoroutineScopeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: AudioMessagePlayerDelegate.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessagePlayerDelegate;", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView;", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "(Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView;Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;)V", "bind", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", "viewState", "state", "Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessageView$State;", "histogram", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessagePlayerDelegate {
    public static final int $stable = 8;
    private final AudioPlayer audioPlayer;
    private final AudioMessageView view;

    public AudioMessagePlayerDelegate(AudioMessageView view, AudioPlayer audioPlayer) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        this.view = view;
        this.audioPlayer = audioPlayer;
    }

    public final void bind(final AudioMessageUiModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AudioStatusComponent.PlaybackStatus playbackStatus = model.getPlaybackStatus();
        if (Intrinsics.areEqual(playbackStatus, AudioStatusComponent.PlaybackStatus.Idle.INSTANCE)) {
            viewState(AudioMessageView.Bind.INSTANCE, model.getHistogram());
        } else if (Intrinsics.areEqual(playbackStatus, AudioStatusComponent.PlaybackStatus.Loading.INSTANCE)) {
            viewState(AudioMessageView.Loading.INSTANCE, model.getHistogram());
        } else if (!(playbackStatus instanceof AudioStatusComponent.PlaybackStatus.Paused)) {
            if (playbackStatus instanceof AudioStatusComponent.PlaybackStatus.Playing) {
                final AudioMessageView audioMessageView = this.view;
                if (ViewCompat.isAttachedToWindow(audioMessageView)) {
                    BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(audioMessageView), null, null, new AudioMessagePlayerDelegate$bind$2$1(this, model, null), 3, null);
                } else {
                    audioMessageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ifriend.chat.new_chat.list.view.audio.AudioMessagePlayerDelegate$bind$$inlined$doOnAttach$2
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            Intrinsics.checkNotNullParameter(view, "view");
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            audioMessageView.removeOnAttachStateChangeListener(this);
                            BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(view), null, null, new AudioMessagePlayerDelegate$bind$2$1(this, model, null), 3, null);
                        }
                    });
                }
            }
        } else {
            final AudioMessageView audioMessageView2 = this.view;
            if (ViewCompat.isAttachedToWindow(audioMessageView2)) {
                BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(audioMessageView2), null, null, new AudioMessagePlayerDelegate$bind$1$1(this, model, null), 3, null);
            } else {
                audioMessageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ifriend.chat.new_chat.list.view.audio.AudioMessagePlayerDelegate$bind$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        audioMessageView2.removeOnAttachStateChangeListener(this);
                        BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(view), null, null, new AudioMessagePlayerDelegate$bind$1$1(this, model, null), 3, null);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void viewState(AudioMessageView.State state, int i) {
        this.view.bindState(state, i);
    }
}
