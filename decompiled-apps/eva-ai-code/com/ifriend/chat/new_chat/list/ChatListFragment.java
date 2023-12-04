package com.ifriend.chat.new_chat.list;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.new_chat.R;
import com.ifriend.chat.new_chat.databinding.FragmentChatListBinding;
import com.ifriend.chat.new_chat.list.adapter.ChatAdapterDataObserver;
import com.ifriend.chat.new_chat.list.adapter.ChatLayoutManager;
import com.ifriend.chat.new_chat.list.adapter.ChatListAdapter;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.player.AudioMessageChatAnalytics;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.ui.recycler.animator.ChatItemAnimator;
import com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatDecoration;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import com.ifriend.chat.new_chat.list.viewModel.factory.ChatViewModelFactory;
import com.ifriend.presentation.common.uistate.UiStateExtKt;
import com.ifriend.presentation.common.uistate.UiStateWatcher;
import com.ifriend.ui.base.BaseFragment;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: ChatListFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u000207H\u0014J\u0012\u0010;\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u000207H\u0016J\b\u0010?\u001a\u000207H\u0016J\u001a\u0010@\u001a\u0002072\u0006\u0010A\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010=H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b&\u0010$R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b*\u0010+R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ChatListFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "adapter", "Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "getAdapter", "()Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "audioAnalytics", "Lcom/ifriend/chat/new_chat/list/player/AudioMessageChatAnalytics;", "getAudioAnalytics", "()Lcom/ifriend/chat/new_chat/list/player/AudioMessageChatAnalytics;", "setAudioAnalytics", "(Lcom/ifriend/chat/new_chat/list/player/AudioMessageChatAnalytics;)V", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "getAudioPlayer", "()Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "setAudioPlayer", "(Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;)V", "binding", "Lcom/ifriend/chat/new_chat/databinding/FragmentChatListBinding;", "getBinding", "()Lcom/ifriend/chat/new_chat/databinding/FragmentChatListBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "imageLoader", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "getImageLoader", "()Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "setImageLoader", "(Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;)V", "shouldReloadOnReconnect", "", "getShouldReloadOnReconnect", "()Z", "shouldShowKeyboardOnStart", "getShouldShowKeyboardOnStart", "shouldShowKeyboardOnStart$delegate", "viewModel", "Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel;", "getViewModel", "()Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/chat/new_chat/list/viewModel/factory/ChatViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/chat/new_chat/list/viewModel/factory/ChatViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/chat/new_chat/list/viewModel/factory/ChatViewModelFactory;)V", "watcher", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher;", "Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel$UiState;", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onInternetAccessAvailable", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListFragment extends BaseFragment {
    public static final String ARG_CHAT_ID = "chat_id";
    private static final String ARG_SHOW_KEYBOARD_ON_START = "show_keyboard";
    private final Lazy adapter$delegate;
    @Inject
    public AudioMessageChatAnalytics audioAnalytics;
    @Inject
    public AudioPlayer audioPlayer;
    private final ViewBindingProperty binding$delegate;
    @Inject
    public ImageLoader imageLoader;
    private final Lazy shouldShowKeyboardOnStart$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ChatViewModelFactory viewModelFactory;
    private final UiStateWatcher<ChatListViewModel.UiState> watcher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChatListFragment.class, "binding", "getBinding()Lcom/ifriend/chat/new_chat/databinding/FragmentChatListBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.BaseFragment
    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public boolean getShouldReloadOnReconnect() {
        return true;
    }

    public final AudioPlayer getAudioPlayer() {
        AudioPlayer audioPlayer = this.audioPlayer;
        if (audioPlayer != null) {
            return audioPlayer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioPlayer");
        return null;
    }

    public final void setAudioPlayer(AudioPlayer audioPlayer) {
        Intrinsics.checkNotNullParameter(audioPlayer, "<set-?>");
        this.audioPlayer = audioPlayer;
    }

    public final AudioMessageChatAnalytics getAudioAnalytics() {
        AudioMessageChatAnalytics audioMessageChatAnalytics = this.audioAnalytics;
        if (audioMessageChatAnalytics != null) {
            return audioMessageChatAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioAnalytics");
        return null;
    }

    public final void setAudioAnalytics(AudioMessageChatAnalytics audioMessageChatAnalytics) {
        Intrinsics.checkNotNullParameter(audioMessageChatAnalytics, "<set-?>");
        this.audioAnalytics = audioMessageChatAnalytics;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldShowKeyboardOnStart() {
        return ((Boolean) this.shouldShowKeyboardOnStart$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatListAdapter getAdapter() {
        return (ChatListAdapter) this.adapter$delegate.getValue();
    }

    public final ChatViewModelFactory getViewModelFactory() {
        ChatViewModelFactory chatViewModelFactory = this.viewModelFactory;
        if (chatViewModelFactory != null) {
            return chatViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ChatViewModelFactory chatViewModelFactory) {
        Intrinsics.checkNotNullParameter(chatViewModelFactory, "<set-?>");
        this.viewModelFactory = chatViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatListViewModel getViewModel() {
        return (ChatListViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentChatListBinding getBinding() {
        return (FragmentChatListBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getAudioPlayer().addAnalyticsListener(getAudioAnalytics());
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentChatListBinding binding = getBinding();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ChatLayoutManager chatLayoutManager = new ChatLayoutManager(context);
        binding.chatList.setLayoutManager(chatLayoutManager);
        binding.chatList.setAdapter(getAdapter());
        binding.chatList.setItemAnimator(new ChatItemAnimator());
        binding.chatList.addItemDecoration(new ChatDecoration());
        getAdapter().registerAdapterDataObserver(new ChatAdapterDataObserver(getAdapter(), chatLayoutManager, getViewModel()));
        ChatListViewModel viewModel = getViewModel();
        getLifecycle().addObserver(getViewModel());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        UiStateExtKt.render$default(viewModel, viewLifecycleOwner, (Lifecycle.State) null, this.watcher, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.chatList) : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        super.onDestroyView();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void onInternetAccessAvailable() {
        super.onInternetAccessAvailable();
        getViewModel().refresh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
        getViewModel().onBackPressed();
    }

    /* compiled from: ChatListFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ChatListFragment$Companion;", "", "()V", "ARG_CHAT_ID", "", "ARG_SHOW_KEYBOARD_ON_START", "newInstance", "Lcom/ifriend/chat/new_chat/list/ChatListFragment;", "chatId", "shouldShowKeyboardOnStart", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatListFragment newInstance(String chatId, boolean z) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            ChatListFragment chatListFragment = new ChatListFragment();
            chatListFragment.setArguments(BundleKt.bundleOf(TuplesKt.to("chat_id", chatId), TuplesKt.to(ChatListFragment.ARG_SHOW_KEYBOARD_ON_START, Boolean.valueOf(z))));
            return chatListFragment;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ifriend.presentation.common.uistate.UiStateWatcher, T, com.ifriend.presentation.common.uistate.UiStateWatcher<com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$UiState>] */
    public ChatListFragment() {
        super(R.layout.fragment_chat_list);
        this.shouldShowKeyboardOnStart$delegate = LazyKt.lazy(new ChatListFragment$shouldShowKeyboardOnStart$2(this));
        this.adapter$delegate = LazyKt.lazy(new ChatListFragment$adapter$2(this));
        final ChatListFragment chatListFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ChatListFragment$special$$inlined$viewModels$default$2(new ChatListFragment$special$$inlined$viewModels$default$1(chatListFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(chatListFragment, Reflection.getOrCreateKotlinClass(ChatListViewModel.class), new ChatListFragment$special$$inlined$viewModels$default$3(lazy), new ChatListFragment$special$$inlined$viewModels$default$4(null, lazy), new ChatListFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(chatListFragment, new ChatListFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        chatListFragment.getLifecycle().addObserver(new DefaultLifecycleObserver(chatListFragment) { // from class: com.ifriend.chat.new_chat.list.ChatListFragment$special$$inlined$uiStateWatcher$1
            final /* synthetic */ Fragment $this_uiStateWatcher;
            private final Observer<LifecycleOwner> viewLifecycleOwnerLiveDataObserver;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            {
                this.$this_uiStateWatcher = chatListFragment;
                this.viewLifecycleOwnerLiveDataObserver = new Observer<LifecycleOwner>() { // from class: com.ifriend.chat.new_chat.list.ChatListFragment$special$$inlined$uiStateWatcher$1.1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(LifecycleOwner lifecycleOwner) {
                        if (lifecycleOwner == null) {
                            return;
                        }
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        final Ref.ObjectRef objectRef2 = Ref.ObjectRef.this;
                        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.ifriend.chat.new_chat.list.ChatListFragment$special$.inlined.uiStateWatcher.1.1.1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner2, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onDestroy(LifecycleOwner owner) {
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                UiStateWatcher uiStateWatcher = (UiStateWatcher) Ref.ObjectRef.this.element;
                                if (uiStateWatcher != null) {
                                    uiStateWatcher.clear();
                                }
                            }
                        });
                    }
                };
            }

            public final Observer<LifecycleOwner> getViewLifecycleOwnerLiveDataObserver() {
                return this.viewLifecycleOwnerLiveDataObserver;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.$this_uiStateWatcher.getViewLifecycleOwnerLiveData().observeForever(this.viewLifecycleOwnerLiveDataObserver);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.$this_uiStateWatcher.getViewLifecycleOwnerLiveData().removeObserver(this.viewLifecycleOwnerLiveDataObserver);
                Ref.ObjectRef.this.element = null;
            }
        });
        UiStateWatcher.Builder builder = new UiStateWatcher.Builder();
        builder.invoke(ChatListFragment$watcher$1$1.INSTANCE, new ChatListFragment$watcher$1$2(this));
        ?? build = builder.build();
        objectRef.element = build;
        this.watcher = build;
    }
}
