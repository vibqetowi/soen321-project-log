package com.ifriend.presentation.common.uistate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.ifriend.presentation.common.uistate.UiStateWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
/* compiled from: UiStateExt.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n\u001aW\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n\u001aB\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\u001aB\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0015*\u00020\u00162\u001d\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\b\u0019H\u0086\bø\u0001\u0000\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0015*\u00020\u001a2\u001d\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\b\u0019H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"collectEvent", "Lkotlinx/coroutines/Job;", "State", "Event", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "lifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", NotificationCompat.CATEGORY_EVENT, "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "render", "watcher", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher;", "uiStateWatcher", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/appcompat/app/AppCompatActivity;", "init", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher$Builder;", "Lkotlin/ExtensionFunctionType;", "Landroidx/fragment/app/Fragment;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateExtKt {
    public static /* synthetic */ Job collectEvent$default(UiStateDelegate uiStateDelegate, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return collectEvent(uiStateDelegate, lifecycleOwner, state, function1);
    }

    public static final <State, Event> Job collectEvent(UiStateDelegate<State, Event> uiStateDelegate, LifecycleOwner lifecycleOwner, Lifecycle.State lifecycleState, Function1<? super Event, Unit> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new UiStateExtKt$collectEvent$1(uiStateDelegate, lifecycleOwner, lifecycleState, block, null), 3, null);
        return launch$default;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.ifriend.presentation.common.uistate.UiStateWatcher, T, com.ifriend.presentation.common.uistate.UiStateWatcher<T>] */
    public static final <T> UiStateWatcher<T> uiStateWatcher(Fragment fragment, Function1<? super UiStateWatcher.Builder<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver(objectRef, fragment) { // from class: com.ifriend.presentation.common.uistate.UiStateExtKt$uiStateWatcher$1
            final /* synthetic */ Fragment $this_uiStateWatcher;
            final /* synthetic */ Ref.ObjectRef<UiStateWatcher<T>> $watcher;
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
                this.$watcher = objectRef;
                this.$this_uiStateWatcher = fragment;
                this.viewLifecycleOwnerLiveDataObserver = new Observer<LifecycleOwner>() { // from class: com.ifriend.presentation.common.uistate.UiStateExtKt$uiStateWatcher$1$viewLifecycleOwnerLiveDataObserver$1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(LifecycleOwner lifecycleOwner) {
                        if (lifecycleOwner == null) {
                            return;
                        }
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        final Ref.ObjectRef<UiStateWatcher<T>> objectRef2 = objectRef;
                        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.ifriend.presentation.common.uistate.UiStateExtKt$uiStateWatcher$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1
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

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onDestroy(LifecycleOwner owner) {
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                UiStateWatcher uiStateWatcher = (UiStateWatcher) objectRef2.element;
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
                this.$watcher.element = null;
            }
        });
        UiStateWatcher.Builder builder = new UiStateWatcher.Builder();
        init.invoke(builder);
        ?? r3 = (T) builder.build();
        objectRef.element = r3;
        return r3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ifriend.presentation.common.uistate.UiStateWatcher, T, com.ifriend.presentation.common.uistate.UiStateWatcher<T>] */
    public static final <T> UiStateWatcher<T> uiStateWatcher(AppCompatActivity appCompatActivity, Function1<? super UiStateWatcher.Builder<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        appCompatActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.ifriend.presentation.common.uistate.UiStateExtKt$uiStateWatcher$3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

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

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                UiStateWatcher uiStateWatcher = (UiStateWatcher) objectRef.element;
                if (uiStateWatcher != null) {
                    uiStateWatcher.clear();
                }
                objectRef.element = null;
            }
        });
        UiStateWatcher.Builder builder = new UiStateWatcher.Builder();
        init.invoke(builder);
        ?? r2 = (T) builder.build();
        objectRef.element = r2;
        return r2;
    }

    public static /* synthetic */ Job render$default(UiStateDelegate uiStateDelegate, LifecycleOwner lifecycleOwner, Lifecycle.State state, UiStateWatcher uiStateWatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return render(uiStateDelegate, lifecycleOwner, state, uiStateWatcher);
    }

    public static final <State, Event> Job render(UiStateDelegate<State, Event> uiStateDelegate, LifecycleOwner lifecycleOwner, Lifecycle.State lifecycleState, UiStateWatcher<State> watcher) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new UiStateExtKt$render$1(uiStateDelegate, lifecycleOwner, lifecycleState, watcher, null), 3, null);
        return launch$default;
    }

    public static /* synthetic */ Job render$default(UiStateDelegate uiStateDelegate, Lifecycle lifecycle, Lifecycle.State state, UiStateWatcher uiStateWatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return render(uiStateDelegate, lifecycle, state, uiStateWatcher);
    }

    public static final <State, Event> Job render(UiStateDelegate<State, Event> uiStateDelegate, Lifecycle lifecycle, Lifecycle.State lifecycleState, UiStateWatcher<State> watcher) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new UiStateExtKt$render$2(uiStateDelegate, lifecycle, lifecycleState, watcher, null), 3, null);
        return launch$default;
    }

    public static /* synthetic */ Job collectEvent$default(UiStateDelegate uiStateDelegate, Lifecycle lifecycle, Lifecycle.State state, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return collectEvent(uiStateDelegate, lifecycle, state, function1);
    }

    public static final <State, Event> Job collectEvent(UiStateDelegate<State, Event> uiStateDelegate, Lifecycle lifecycle, Lifecycle.State lifecycleState, Function1<? super Event, Unit> block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleState, "lifecycleState");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new UiStateExtKt$collectEvent$2(uiStateDelegate, lifecycle, lifecycleState, block, null), 3, null);
        return launch$default;
    }
}
